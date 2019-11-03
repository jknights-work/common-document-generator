/*
 *   File      : AbstractDocumentGeneratorService.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.service.impl;


import com.willow.common.document.generator.service.DocumentGenerationHandler;
import com.willow.common.document.generator.service.DocumentGeneratorService;
import com.willow.common.eis.model.AbstractModelService;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 *
 * The <tt>AbstractDocumentGeneratorService</tt> provides a default implementation of a document generator service.
 */
public abstract class AbstractDocumentGeneratorService extends AbstractModelService
        implements DocumentGeneratorService {

  /** The class logger. */
  private static final Logger LOG = Logger.getLogger(AbstractDocumentGeneratorService.class);

  /** The document generation handlers for. */
  private Map<String, DocumentGenerationHandler> handlers;

  /**
   * The parameterised constructor as dictated by AbstractModelService.
   *
   * @param name the name of the service instance
   */
  public AbstractDocumentGeneratorService(final String name) {
    super(name);
    handlers = new HashMap<>();
  }

  /**
   * The default constructor as dictated by AbstractModelService.
   */
  public AbstractDocumentGeneratorService() {
    super("DocumentGeneratorServiceImpl");
    handlers = new HashMap<>();
  }

  /**
   * Return the document generation handlers.
   *
   * @return a Map of String to DocumentGenerationHandler
   */
  public final Map<String, DocumentGenerationHandler> getHandlers() {
    return handlers;
  }

  /**
   * Set the document generation handlers.
   *
   * @param newHandlers a Map of String to DocumentGenerationHandler
   */
  public final void setHandlers(final Map<String, DocumentGenerationHandler> newHandlers) {
    this.handlers = newHandlers;
  }

  /** {@inheritDoc} */
  @Override
  public final byte[] generate(Map<String, String> generateAttributes, final Map<String, Object> data,
                               final String sessionId) {
    byte[] result = null;
    String businessUnitId = generateAttributes.get("businessUnitId");
    String documentId = generateAttributes.get("documentId");
    String key = businessUnitId + "#" + documentId;
    generateAttributes.put("templateKey", key);
    if (LOG.isInfoEnabled()) {
      LOG.info("Generating DocumentDefinition " + documentId + " for business " + businessUnitId);
    }
    if (isRunning()) {
      DocumentGenerationHandler handler = handlers.get(key);
      if (handler == null) {
        throw new IllegalStateException("No handler defined for " + key);
      }
      result = handler.generate(generateAttributes, data, sessionId);
    } else {
      throwServiceNotRunningException();
    }
    return result;
  }

  /**
   * Throw an exception when a document could not be found for a provided business unit.
   *
   * @param businessUnit the business unit in question
   * @param documentId the ID of the document in question
   */
  private void throwDocumentNotFoundException(final String businessUnit, final String documentId) {
    String message = String.format("Document ID %s for business unit %s was not found.", documentId, businessUnit);
    throw new IllegalArgumentException(message);
  }

  /**
   * Throw an exception when there is no handler defined for a document generator ID.
   *
   * @param documentGeneratorId the ID of the document generator in question
   */
  private void throwNoHandlerDefinedException(final String documentGeneratorId) {
    String message = String.format("No handler defined for document generator ID %s.", documentGeneratorId);
    throw new IllegalStateException(message);
  }

  /**
   * Throw an exception when the service is not running.
   */
  private void throwServiceNotRunningException() {
    throw new IllegalStateException("The service is not running");
  }
}

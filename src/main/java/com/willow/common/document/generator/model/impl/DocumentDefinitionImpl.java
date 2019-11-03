/*
 *   File      : DocumentDefinitionImpl.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.model.impl;


import com.willow.common.document.generator.model.DocumentDefinition;
import com.willow.common.eis.model.AbstractStorableModelObject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * The <tt>DocumentDefinitionImpl</tt> class provides a concrete implementation of DocumentDefinition.
 */
public final class DocumentDefinitionImpl
        extends AbstractStorableModelObject implements DocumentDefinition, Serializable {

  /**
   * The name of the document type.
   */
  private String name;
  /**
   * The ID of the generator that renders it.
   */
  private String documentGeneratorId;
  /**
   * Configuration to be passed to the generator.
   */
  private Map<String, String> attributes;
  /**
   * The document owner's business unit ID.
   */
  private String businessUnitId;
  /**
   * The document identifier.
   */
  private String documentId;

  /**
   * Default constructor.
   */
  public DocumentDefinitionImpl() {
    attributes = new HashMap<String, String>();
  }

  /**
   * Default constructor.
   *
   * @param newBusinessUnitId the business unit ID for the new instance
   * @param newDocumentId the document ID for the new instance
   */
  public DocumentDefinitionImpl(final String newBusinessUnitId, final String newDocumentId) {
    attributes = new HashMap<String, String>();
    businessUnitId = newBusinessUnitId;
    documentId = newDocumentId;
  }

  /**
   * Factory method as per DIIG design.
   *
   * @return a new instance of DocumentDefinitionImpl
   */
  public static DocumentDefinitionImpl newInstance() {
    return new DocumentDefinitionImpl();
  }

  /**
   * Factory method as per DIIG design.
   *
   * @param newBusinessUnitId the business unit ID for the new instance
   * @param newDocumentId the document ID for the new instance
   * @return a new instance of DocumentDefinitionImpl
   */
  public static DocumentDefinitionImpl newInstance(final String newBusinessUnitId, final String newDocumentId) {
    return new DocumentDefinitionImpl(newBusinessUnitId, newDocumentId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getCopy() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String resolveIndexFor(final String string) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setName(final String newName) {
    name = newName;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getDocumentGeneratorId() {
    return documentGeneratorId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setDocumentGeneratorId(final String newGeneratorId) {
    documentGeneratorId = newGeneratorId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Map<String, String> getAttributes() {
    return attributes;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setAttributes(final Map<String, String> newAttribs) {
    attributes = newAttribs;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getBusinessUnitId() {
    return businessUnitId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setBusinessUnitId(final String id) {
    businessUnitId = id;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getDocumentId() {
    return documentId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setDocumentId(final String id) {
    documentId = id;
  }
}

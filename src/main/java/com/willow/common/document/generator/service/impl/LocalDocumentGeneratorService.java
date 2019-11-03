/*
 *   File      : LocalDocumentGeneratorService.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.service.impl;

/**
 *
 * The <tt>LocalDocumentGeneratorService</tt> class provides a local concrete implementation of the default document
 * generator service.
 */
public final class LocalDocumentGeneratorService extends AbstractDocumentGeneratorService {

  /**
   * The parameterised constructor as dictated by AbstractModelService.
   *
   * @param name the name of the service instance
   */
  public LocalDocumentGeneratorService(final String name) {
    super(name);
  }

  /**
   * The default constructor as dictated by AbstractModelService.
   */
  public LocalDocumentGeneratorService() {
    super("LocalDocumentGeneratorServiceImpl");
  }
}

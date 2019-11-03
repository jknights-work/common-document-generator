/*
 *   File      : DocumentGenerationHandler.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.service;

import java.util.Map;

/**
 * The <tt>DocumentGenerationHandler</tt> interface describes a handler for executing the generation of a document.
 */
public interface DocumentGenerationHandler {

  /**
   * Generate the document.
   *
   * @param generateAttributes a list of configuration attributes to pass to the handler
   * @param data the data to use for the document content
   * @param sessionId a <tt>String</tt> containing the session id of the client making this call.
   * 
   * @return the generated document
   */
  byte[] generate(Map<String, String> generateAttributes, Map<String, Object> data, String sessionId);
}

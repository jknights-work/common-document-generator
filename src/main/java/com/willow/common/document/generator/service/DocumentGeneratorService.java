/*
 *   File      : DocumentGeneratorService.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.service;


import com.willow.common.service.Service;
import java.util.Map;

/**
 * Define the behaviour of a document generator that provides CRUD operations for document definitions and a method for
 * generating the output document.
 */
public interface DocumentGeneratorService extends Service {

  /**
   * Render a document using the provided data and a document definition identified by business unit and documentId.
   *
   * @param generateAttributes a Map containing the generator's configuration. It must contain at least the properties
   *                           'businessUnitId' and 'documentId'
   * @param data               a Map of String vs Object containing the data.
   * @param sessionId a <tt>String</tt> containing the session id of the client making this call.
   *
   * @return the processed document
   */
  byte[] generate(Map<String, String> generateAttributes, Map<String, Object> data, String sessionId);
}

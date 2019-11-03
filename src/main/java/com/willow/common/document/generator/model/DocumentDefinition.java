/*
 *   File      : DocumentDefinition.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.model;

import com.willow.common.eis.model.Storable;
import com.willow.common.model.ModelObject;
import java.util.Map;

/**
 * The <tt>DocumentDefinition</tt> interface describes the behaviour of a model for storing document definitions.
 */
public interface DocumentDefinition extends ModelObject, Storable {

  /**
   * Get the document definition name.
   *
   * @return a String representation of the document name, or null if not set
   */
  String getName();

  /**
   * Set the document definition name.
   *
   * @param newName a String representation of the document name
   */
  void setName(String newName);

  /**
   * Get the ID of the generator to use when generating this document.
   *
   * @return a String containing the document generator ID, or null if not set
   */
  String getDocumentGeneratorId();

  /**
   * Set the ID of the generator to use when generating this document.
   *
   * @param newGeneratorId a String containing the document generator ID
   */
  void setDocumentGeneratorId(String newGeneratorId);

  /**
   * Get the attributes for this document type. These can include, for example, template locations, resource URLS, etc.
   *
   * @return a Map of String to Object, or empty map if not set
   */
  Map<String, String> getAttributes();

  /**
   * Set the attributes for this document type. These can include, for example, template locations, resource URLS, etc.
   *
   * @param newAttribs a Map of String to Object
   */
  void setAttributes(Map<String, String> newAttribs);

  /**
   * Get the business unit ID.
   *
   * @return a String containing document ID, or null if not set
   */
  String getBusinessUnitId();

  /**
   * Set the business unit ID.
   *
   * @param id a String containing business unit ID
   */
  void setBusinessUnitId(String id);

  /**
   * Get the document ID.
   *
   * @return a String containing document ID, or null if not set
   */
  String getDocumentId();

  /**
   * Set the document ID.
   *
   * @param id a String containing business unit ID
   */
  void setDocumentId(String id);
}

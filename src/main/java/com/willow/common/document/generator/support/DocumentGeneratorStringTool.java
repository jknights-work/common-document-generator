/*
 *   File      : DocumentGeneratorStringTool.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.support;

import java.nio.charset.Charset;

/**
 *
 * The <tt>DocumentGeneratorStringUtil</tt> class is a utility class that provides String operations that are used at
 * various points within the Document Generator and adaptors.
 * 
 * TODO: Old DC Code... FIX!!!!!!!!
 */
public final class DocumentGeneratorStringTool {

  /**
   * The default encoding.
   */
  private static final String DEFAULT_ENCODING = "UTF-8";
  /**
   * The character set name used for string encoding.
   */
  private String stringCharsetName = DEFAULT_ENCODING;
  
  public DocumentGeneratorStringTool() {
    
  }

  /**
   * Get the character set name used for string encoding.
   *
   * @return a String character set name or null if not set
   */
  public String getStringCharsetName() {
    return stringCharsetName;
  }

  /**
   * Set the character set name used for string encoding.
   *
   * @param name the character set name
   */
  public void setStringCharsetName(final String name) {
    stringCharsetName = name;
  }

  /**
   * Calculate and return the Charset object.
   *
   * @return an instance of Charset.
   */
  private Charset getCharset() {
    return Charset.forName(getStringCharsetName());
  }

  /**
   * Return a byte array from a string, encoding if required.
   *
   * @param string the string to convert
   * @return a byte array containing the data
   */
  public byte[] convertStringToBytes(final String string) {
    byte[] result = null;
    result = string.getBytes(getCharset());
    return result;
  }

  /**
   * Return a String representation of a byte array.
   *
   * @param bytes the byte array to convert
   * @return a String instance
   */
  public String convertBytesToString(final byte[] bytes) {
    return new String(bytes, getCharset());
  }
}

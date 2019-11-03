/*
 *   File      : DocumentGenerationException.java
 *   Author    : cmartin
 *   Copyright : Martin Technical Consulting Limited Ltd (2018)
 *   Created   : 21-Jan-2018
 *
 *   History
 *     21-Jan-2018 cmartin The initial version.
 */
package com.willow.common.document.generator.service;

/**
 *
 * The <tt>DocumentGenerationException</tt> class describes a runtime exception that may be thrown during the document
 * generation process.
 */
public class DocumentGenerationException extends RuntimeException {

  /**
   * Create an instance with a message.
   *
   * @param message the message describing the cause of the exception
   */
  public DocumentGenerationException(final String message) {
    super(message);
  }

  /**
   * Create an instance with a message and a Throwable cause.
   *
   * @param message the message describing the cause of the exception
   * @param cause the throwable causing this exception to be thrown
   */
  public DocumentGenerationException(final String message, final Throwable cause) {
    super(message, cause);
  }
}

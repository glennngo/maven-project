package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
/**
 *  @param someone the naoe of a person
 *  @return greeting the string
 */

 final public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

package whatisnewin.java.util;

import java.util.OptionalDouble;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link OptionalDouble}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link OptionalDouble} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see OptionalDouble
 */
public final class WhatIsNewInOptionalDouble
{
  /**
   * Example call to new method {@link OptionalDouble#orElseThrow()}.
   * @since 10
   * @see OptionalDouble#orElseThrow()
   */
  public double orElseThrow()
  {
    OptionalDouble testee = $$$();

    double result = testee.orElseThrow();
    return result;
  }

  private OptionalDouble $$$()
  {
    return null;
  }
}

package whatisnewin.java.time.format;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DateTimeFormatter}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link DateTimeFormatter} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see DateTimeFormatter
 */
public final class WhatIsNewInDateTimeFormatter
{
  /**
   * Example call to new method {@link DateTimeFormatter#localizedBy(Locale)}.
   * @since 10
   * @see DateTimeFormatter#localizedBy(Locale)
   */
  public DateTimeFormatter localizedBy(Locale locale)
  {
    DateTimeFormatter testee = $$$();

    DateTimeFormatter result = testee.localizedBy(locale);
    return result;
  }

  private DateTimeFormatter $$$()
  {
    return null;
  }
}

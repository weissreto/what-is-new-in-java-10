package whatisnewin.java.util.spi;

import java.util.spi.LocaleNameProvider;
import java.util.Locale;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link LocaleNameProvider}
 * that were newly introduced in Java versions 10.<br>
 *
 * {@link LocaleNameProvider} is an old class but has new fields, constructors or methods
 * @since 1.6
 * @see LocaleNameProvider
 */
public final class WhatIsNewInLocaleNameProvider
{
  /**
   * Example call to new method {@link LocaleNameProvider#getDisplayUnicodeExtensionKey}
   * @since 10
   * @see LocaleNameProvider#getDisplayUnicodeExtensionKey
   */
  public String getDisplayUnicodeExtensionKey(String key, Locale locale)
  {
    LocaleNameProvider testee = $$$();

    String result = testee.getDisplayUnicodeExtensionKey(key, locale);
    return result;
  }

  private LocaleNameProvider $$$()
  {
    return null;
  }
}

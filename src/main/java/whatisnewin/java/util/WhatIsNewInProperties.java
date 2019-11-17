package whatisnewin.java.util;

import java.util.Properties;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Properties}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link Properties} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Properties
 */
public final class WhatIsNewInProperties
{
  /**
   * Example call to new method {@link Properties#storeToXML(OutputStream, String, Charset)}.
   * @since 10
   * @see Properties#storeToXML(OutputStream, String, Charset)
   */
  public void storeToXML(OutputStream os, String comment, Charset charset) throws IOException
  {
    Properties testee = $$$();

    testee.storeToXML(os, comment, charset);
  }

  private Properties $$$()
  {
    return null;
  }
}

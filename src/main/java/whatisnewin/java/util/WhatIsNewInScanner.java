package whatisnewin.java.util;

import java.util.Scanner;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.channels.ReadableByteChannel;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Scanner}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link Scanner} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see Scanner
 */
public final class WhatIsNewInScanner
{
  /**
   * Example call to new constructor {@link Scanner#Scanner(InputStream, Charset)}.
   * @since 10
   * @see Scanner#Scanner(InputStream, Charset)
   */
  public WhatIsNewInScanner(InputStream source, Charset charset)
  {
    Scanner testee = new Scanner(source, charset);
  }

  /**
   * Example call to new constructor {@link Scanner#Scanner(File, Charset)}.
   * @since 10
   * @see Scanner#Scanner(File, Charset)
   */
  public WhatIsNewInScanner(File source, Charset charset) throws IOException
  {
    Scanner testee = new Scanner(source, charset);
  }

  /**
   * Example call to new constructor {@link Scanner#Scanner(Path, Charset)}.
   * @since 10
   * @see Scanner#Scanner(Path, Charset)
   */
  public WhatIsNewInScanner(Path source, Charset charset) throws IOException
  {
    Scanner testee = new Scanner(source, charset);
  }

  /**
   * Example call to new constructor {@link Scanner#Scanner(ReadableByteChannel, Charset)}.
   * @since 10
   * @see Scanner#Scanner(ReadableByteChannel, Charset)
   */
  public WhatIsNewInScanner(ReadableByteChannel source, Charset charset)
  {
    Scanner testee = new Scanner(source, charset);
  }

}

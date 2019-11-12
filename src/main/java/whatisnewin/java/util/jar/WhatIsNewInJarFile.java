package whatisnewin.java.util.jar;

import java.util.jar.JarFile;
import java.util.stream.Stream;
import java.util.jar.JarEntry;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link JarFile}
 * that were newly introduced in Java versions 10.<br>
 *
 * {@link JarFile} is an old class but has new fields, constructors or methods
 * @since 1.2
 * @see JarFile
 */
public final class WhatIsNewInJarFile
{
  /**
   * Example call to new method {@link JarFile#versionedStream}
   * @since 10
   * @see JarFile#versionedStream
   */
  public Stream<JarEntry> versionedStream()
  {
    JarFile testee = $$$();

    Stream<JarEntry> result = testee.versionedStream();
    return result;
  }

  private JarFile $$$()
  {
    return null;
  }
}

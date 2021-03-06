package whatisnewin.java.awt;

import java.awt.Toolkit;
import java.awt.HeadlessException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Toolkit}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link Toolkit} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Toolkit
 */
public final class WhatIsNewInToolkit
{
  /**
   * Example call to new method {@link Toolkit#getMenuShortcutKeyMaskEx()}.
   * @since 10
   * @see Toolkit#getMenuShortcutKeyMaskEx()
   */
  public int getMenuShortcutKeyMaskEx() throws HeadlessException
  {
    Toolkit testee = $$$();

    int result = testee.getMenuShortcutKeyMaskEx();
    return result;
  }

  private Toolkit $$$()
  {
    return null;
  }
}

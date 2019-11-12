package whatisnewin.com.sun.source.util;

import com.sun.source.util.DocTreeScanner;
import com.sun.source.doctree.SummaryTree;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DocTreeScanner}
 * that were newly introduced in Java versions 10.<br>
 *
 * {@link DocTreeScanner} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see DocTreeScanner
 */
public final class WhatIsNewInDocTreeScanner<R, P>
{
  /**
   * Example call to new method {@link DocTreeScanner#visitSummary}
   * @since 10
   * @see DocTreeScanner#visitSummary
   */
  public R visitSummary(SummaryTree node, P p)
  {
    DocTreeScanner<R, P> testee = $$$();

    R result = testee.visitSummary(node, p);
    return result;
  }

  private DocTreeScanner $$$()
  {
    return null;
  }
}

package whatisnewin.com.sun.source.util;

import com.sun.source.util.SimpleDocTreeVisitor;
import com.sun.source.doctree.DocTypeTree;
import com.sun.source.doctree.SummaryTree;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link SimpleDocTreeVisitor}
 * that were newly introduced in Java versions 10.<br>
 *
 * {@link SimpleDocTreeVisitor} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see SimpleDocTreeVisitor
 */
public final class WhatIsNewInSimpleDocTreeVisitor<R, P>
{
  /**
   * Example call to new method {@link SimpleDocTreeVisitor#visitDocType}
   * @since 10
   * @see SimpleDocTreeVisitor#visitDocType
   */
  public R visitDocType(DocTypeTree node, P p)
  {
    SimpleDocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitDocType(node, p);
    return result;
  }

  /**
   * Example call to new method {@link SimpleDocTreeVisitor#visitSummary}
   * @since 10
   * @see SimpleDocTreeVisitor#visitSummary
   */
  public R visitSummary(SummaryTree node, P p)
  {
    SimpleDocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitSummary(node, p);
    return result;
  }

  private SimpleDocTreeVisitor $$$()
  {
    return null;
  }
}

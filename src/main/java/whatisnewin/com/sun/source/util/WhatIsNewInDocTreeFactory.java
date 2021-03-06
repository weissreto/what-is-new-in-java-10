package whatisnewin.com.sun.source.util;

import com.sun.source.util.DocTreeFactory;
import com.sun.source.doctree.DocCommentTree;
import java.util.List;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.DocTypeTree;
import com.sun.source.doctree.SummaryTree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DocTreeFactory}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link DocTreeFactory} is an old class but has new fields, constructors or methods.
 * @since 9
 * @see DocTreeFactory
 */
public final class WhatIsNewInDocTreeFactory
{
  /**
   * Example call to new method {@link DocTreeFactory#newDocCommentTree(List, List, List, List)}.
   * @since 10
   * @see DocTreeFactory#newDocCommentTree(List, List, List, List)
   */
  public DocCommentTree newDocCommentTree(List<? extends DocTree> fullBody, List<? extends DocTree> tags, List<? extends DocTree> preamble, List<? extends DocTree> postamble)
  {
    DocTreeFactory testee = $$$();

    DocCommentTree result = testee.newDocCommentTree(fullBody, tags, preamble, postamble);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeFactory#newDocTypeTree(String)}.
   * @since 10
   * @see DocTreeFactory#newDocTypeTree(String)
   */
  public DocTypeTree newDocTypeTree(String text)
  {
    DocTreeFactory testee = $$$();

    DocTypeTree result = testee.newDocTypeTree(text);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeFactory#newSummaryTree(List)}.
   * @since 10
   * @see DocTreeFactory#newSummaryTree(List)
   */
  public SummaryTree newSummaryTree(List<? extends DocTree> summary)
  {
    DocTreeFactory testee = $$$();

    SummaryTree result = testee.newSummaryTree(summary);
    return result;
  }

  private DocTreeFactory $$$()
  {
    return null;
  }
}

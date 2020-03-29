package whatisnewin.java.util;

import java.util.Set;
import java.util.Collection;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Set}
 * that were newly introduced in Java version 10.<br>
 *
 * {@link Set} is an old class but has new fields, constructors or methods.
 * @since 1.2
 * @see Set
 */
public final class WhatIsNewInSet<E>
{
  /**
   * Example call to new method {@link Set#copyOf(Collection)}.
   * @since 10
   * @see Set#copyOf(Collection)
   */
  public static <E> Set<E> copyOf(Collection<? extends E> coll)
  {
    Set<E> result = Set.copyOf(coll);
    return result;
  }

}
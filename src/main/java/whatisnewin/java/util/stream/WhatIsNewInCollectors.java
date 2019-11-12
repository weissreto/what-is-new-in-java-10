package whatisnewin.java.util.stream;

import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.function.Function;
import java.util.function.BinaryOperator;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Collectors}
 * that were newly introduced in Java versions 10.<br>
 *
 * {@link Collectors} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see Collectors
 */
public final class WhatIsNewInCollectors
{
  /**
   * Example call to new method {@link Collectors#toUnmodifiableList}
   * @since 10
   * @see Collectors#toUnmodifiableList
   */
  public static <T> Collector<T, ?, List<T>> toUnmodifiableList()
  {
    Collector<T, ?, List<T>> result = Collectors.toUnmodifiableList();
    return result;
  }

  /**
   * Example call to new method {@link Collectors#toUnmodifiableSet}
   * @since 10
   * @see Collectors#toUnmodifiableSet
   */
  public static <T> Collector<T, ?, Set<T>> toUnmodifiableSet()
  {
    Collector<T, ?, Set<T>> result = Collectors.toUnmodifiableSet();
    return result;
  }

  /**
   * Example call to new method {@link Collectors#toUnmodifiableMap}
   * @since 10
   * @see Collectors#toUnmodifiableMap
   */
  public static <T, K, U> Collector<T, ?, Map<K, U>> toUnmodifiableMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper)
  {
    Collector<T, ?, Map<K, U>> result = Collectors.toUnmodifiableMap(keyMapper, valueMapper);
    return result;
  }

  /**
   * Example call to new method {@link Collectors#toUnmodifiableMap}
   * @since 10
   * @see Collectors#toUnmodifiableMap
   */
  public static <T, K, U> Collector<T, ?, Map<K, U>> toUnmodifiableMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper, BinaryOperator<U> mergeFunction)
  {
    Collector<T, ?, Map<K, U>> result = Collectors.toUnmodifiableMap(keyMapper, valueMapper, mergeFunction);
    return result;
  }

}
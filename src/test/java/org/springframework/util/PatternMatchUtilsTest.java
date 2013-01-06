package org.springframework.util;

import org.fest.assertions.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class PatternMatchUtilsTest {

  @Test
//  @Ignore
  public void simpleMatch_infiniteLoop() {

    // Given

    String pattern = "**.pdf";
    String str = "customer/externalServices";

    // When
    boolean actualMatch =
        ConcretePatternMatchUtilsTest.simpleMatch(pattern, str);

    // Then
    Assertions.assertThat(actualMatch).isFalse();
  }

  @Test
  public void simpleMatch_withNoMatch_ShouldReturn_false() {

    // Given

    String pattern = "*help*.pdf";
    String str = "customer/externalServices";

    // When
    boolean actualMatch =
        ConcretePatternMatchUtilsTest.simpleMatch(pattern, str);

    // Then
    Assertions.assertThat(actualMatch).isFalse();
  }

  @Test
  public void simpleMatch_withNoMatch2_ShouldReturn_false() {

    // Given

    String pattern = "*.pdf";
    String str = "customer/externalServices";

    // When
    boolean actualMatch =
        ConcretePatternMatchUtilsTest.simpleMatch(pattern, str);

    // Then
    Assertions.assertThat(actualMatch).isFalse();
  }

  public class ConcretePatternMatchUtilsTest extends PatternMatchUtils {

  }

}

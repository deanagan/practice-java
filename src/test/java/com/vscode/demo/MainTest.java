package com.vscode.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("main")
class MainTest {

    @Test
    @DisplayName("VS Code JUnit 5 test")
    void testMain() {

        // arrange
        final List<String> list = Arrays.asList("React", "Angular", "Vue");

        // act
        final String actual = list.stream()
            .filter(x -> Objects.equals(x, "React"))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);

        // assert
        assertEquals("React", actual, () -> "Main Succeed");
    }

    @DisplayName("Test with @MethodSource")
    @ParameterizedTest(name = "{index}: ({0} + {1}) => {2})")
    @MethodSource("localParameters")
    void test(int first, int second, int sum) {
      assertEquals(sum, first + second);
    }

    static Stream<Arguments> localParameters() {
      return Stream.of(
          Arguments.of(0, 0, 0),
          Arguments.of(1, 2, 3),
          Arguments.of(5, 3, 8)
      );
    }


}

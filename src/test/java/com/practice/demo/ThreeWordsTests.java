package com.practice.demo;

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
public class ThreeWordsTests {
    @DisplayName("Test Three Words")
    @ParameterizedTest(name = "{index}: (\"{0}\" has 3 consecutive words) => {1})")
    @MethodSource("testParameters")
    void test(String input, boolean expected) {
        var threeWords = new ThreeWords();
        assertEquals(expected, threeWords.hasThreeWordsConsecutive(input));
    }

    static Stream<Arguments> testParameters() {
        return Stream.of(
            Arguments.of("Hello World hello", true)//,
            // Arguments.of("He is 123 man", false),
            // Arguments.of("1 2 3 4", false),
            // Arguments.of("bla bla bla bla", true),
            // Arguments.of("Hi", false)
        );
    }

 }

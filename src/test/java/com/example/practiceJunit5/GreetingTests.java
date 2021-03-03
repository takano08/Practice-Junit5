package com.example.practiceJunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GreetingTests {

    @Nested
    @DisplayName("Helloを返すmethodを確認したい")
    public class Hello {

        private Greeting test = new Greeting();

        @Test
        @DisplayName("正常に動作するテストケース")
        public void case1() {
            Assertions.assertEquals("Hello", test.hello());
        }
    }

    @Nested
    @DisplayName("method : helloWorld")
    public class HelloWold {

        private Greeting test = new Greeting();

        @Test
        @DisplayName("正常に動作するテストケース")
        public void case1() {
            Assertions.assertEquals("Hello World", test.helloWorld());
        }

    }
    @Nested
    @DisplayName("足し算のテストをしたい")
    public class Add {

        private Greeting test = new Greeting();

        @Test
        @DisplayName("正常に動作するテストケース")
        public void case1() {
            Assertions.assertEquals(2, test.add(1,1));
        }
    }

    @Nested
    @DisplayName("掛け算のテストをしたい")
    public class Multiplied {

        private Greeting test = new Greeting();

        @Test
        @DisplayName("正常に動作するテストケース")
        public void case1() {
            Assertions.assertEquals(28, test.multiplied(4,7));
        }
    }
}

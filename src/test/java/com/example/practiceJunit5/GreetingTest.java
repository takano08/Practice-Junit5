package com.example.practiceJunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {


    @DisplayName("method : hello")
    public class Hello {

        private Greeting test = new Greeting();

        @Test
        @DisplayName("正常に動作するテストケース")
        public void case1() {
            Assertions.assertEquals("Hello", test.hello());
        }
    }


    @DisplayName("method : helloWorld")
    public class HelloWold {

        private Greeting test = new Greeting();

        @Test
        @DisplayName("正常に動作するテストケース")
        public void case1() {
            Assertions.assertEquals("Hello World", test.helloWorld());
        }

    }
}

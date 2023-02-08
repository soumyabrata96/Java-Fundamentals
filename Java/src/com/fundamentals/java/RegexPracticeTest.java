package com.fundamentals.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.fundamentals.java.RegexPractice.emailAddressValidator;
import static org.junit.jupiter.api.Assertions.*;

class RegexPracticeTest {

    @Test
    void testEmailAddressValidator() {
        assertFalse(emailAddressValidator("soumyabarata123@gm12.com1"));
    }
    public static Stream<String> validEmails(){
        return Stream.of("soumyabrata96@gmail.com","saurabh.modi@barclays.co.uk","kaushik@gmail.com");
    }
    public static Stream<String> inValidEmails(){
        return Stream.of("dharam#v!r@kumar.barcl12","rajiv.chatterjee12@bar123.com1","sahrukhkahn@redch123@in");
    }
    @ParameterizedTest
    /*@ValueSource(strings={"soumyabrata96@gmail.com","saurabh.modi@barclays.co.uk",
            "dharam#v!r@kumar.barcl12","rajiv.chatterjee12@bar123.com1",
            "kaushik@gmail.com","sahrukhkahn@redch123@in"})*/
    @MethodSource("validEmails")
    void parameterizedTestEmailAddressValidato1(String arg) {
        Assertions.assertTrue(emailAddressValidator(arg));
    }
    @ParameterizedTest
    @MethodSource("inValidEmails")
    void parameterizedTestEmailAddressValidator2(String arg) {
        Assertions.assertFalse(emailAddressValidator(arg));
    }
}
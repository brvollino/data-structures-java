package com.brunovollino.java.structures.string;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Bruno Vollino
 */
public class SubSequencesTest {

    @Test
    public void shouldBuildSubSequencesForStringOfLength2() {
        //given
        String s = "ab";
        String[] expected = new String[]{"a", "ab", "b"};

        //when
        String[] result = SubSequences.subSequences(s);

        //then
        assertThat(result, equalTo(expected));
    }

    @Test
    public void shouldBuildSubSequencesForStringOfLength3() {
        //given
        String s = "abc";
        String[] expected = new String[]{"a", "ab", "abc", "ac", "b", "bc", "c"};

        //when
        String[] result = SubSequences.subSequences(s);

        //then
        assertThat(result, equalTo(expected));
    }

    @Test
    public void shouldBuildSubSequencesForStringOfLength4() {
        //given
        String s = "abcd";
        String[] expected = new String[]{
                "a", "ab", "abc", "abcd", "abd", "ac", "acd", "ad",
                "b", "bc", "bcd", "bd",
                "c", "cd",
                "d"};

        //when
        String[] result = SubSequences.subSequences(s);

        //then
        assertThat(result, equalTo(expected));
    }
}
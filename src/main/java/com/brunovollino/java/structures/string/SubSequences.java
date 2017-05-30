package com.brunovollino.java.structures.string;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Bruno Vollino
 */
public class SubSequences {

    public static String[] subSequences(String s) {
        LinkedList<String> subSequences = new LinkedList<>();
        subSequences("", s, subSequences);
        Collections.sort(subSequences);
        return subSequences.toArray(new String[subSequences.size()]);
    }

    private static void subSequences(String s1, String s2, LinkedList<String> subSequences) {
        if (s2.length() > 0) {
            subSequences.add(s1 + s2.charAt(0));
            subSequences(s1 + s2.charAt(0), s2.substring(1), subSequences);
            subSequences(s1, s2.substring(1), subSequences);
        }
    }


}

package org.masha;

import java.util.*;

public class RepeatUtil {

    public static RepeatedSymbol findMostRepeatedLetter(String str) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for (Character c : chars) {
            map.putIfAbsent(c, 0);
            int k = map.get(c);
            map.put(c, k + 1);
        }

        Map.Entry<Character, Integer> maxValue = null;

        int maxIndex = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxValue == null) {
                maxValue = entry;
            }
            if (entry.getValue() > maxValue.getValue()) {
                maxValue = entry;
                maxIndex = 0;
            }
            if (entry.getValue().equals(maxValue.getValue())) {
                Character key = entry.getKey();
                int index = str.lastIndexOf(key);
                if (index >= maxIndex) {
                    maxIndex = index;
                    maxValue = entry;
                }
            }
        }
        return new RepeatedSymbol(maxValue.getKey(), maxValue.getValue());
    }
}

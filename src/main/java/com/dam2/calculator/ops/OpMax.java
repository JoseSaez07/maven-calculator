package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMax {
        public static String run(String input) {
            int[] nums = ParserUtils.parseInts(input);
            if (nums == null) return "Error: formato inválido";
            int max = nums[0]; 
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return String.valueOf(max);
        }
}

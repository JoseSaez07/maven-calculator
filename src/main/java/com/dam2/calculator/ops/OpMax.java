package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMax {
	    public static String run(String input) {
	        public static String run(String input) {
	            int[] nums = ParserUtils.parseInts(input);
	            if (nums == null) return "Error: formato inválido";
	            if (nums.length != 2) return "Error: sub necesita exactamente 2 números";

	            return String.valueOf(nums[0] - nums[1]);
	        }

	    }
        int numeros[] = new int[]{1,2,3,4,5};
        int resultado = ejercicioMax(numeros);
        System.out.println("El máximo  es: " + resultado);
    }

    public static int ejercicioMax(int[] m) {
        int max = m[0]; 
        for (int i = 1; i < m.length; i++) {
            if (m[i] < max) {
                max = m[i];
            }
        }
        return max;
    }
}

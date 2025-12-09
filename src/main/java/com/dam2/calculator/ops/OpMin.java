package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMin {
	public static String run(String input) {
		 int[] nums = ParserUtils.parseInts(input);
	        if (nums == null) return "Error: formato inválido";
	        if (nums.length != 2) return "Error: sub necesita exactamente 2 números";
	        int min= 0;
	        
	        for(int i=0; i<nums.length; i++) {
	        	min= Math.min(min, nums[i]);
	        	
	        	
	        }
	        return String.valueOf(min);
	        
	}

}

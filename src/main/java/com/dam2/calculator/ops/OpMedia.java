package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMedia {

	public static String run(String input) {
		int[] nums = ParserUtils.parseInts(input);
		if (nums == null)
			return "Error: formato inválido";
		if (nums.length < 2)
			return "Error: mete al menos 2 números";
		int suma = 0;
		float res = 0;
		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		res = suma / nums.length;
		return String.valueOf(res);
	}

}

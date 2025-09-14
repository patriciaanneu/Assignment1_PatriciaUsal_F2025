package com.pu.currency.assign1;

public class CurrencyConversion {
	
	private static final double exchangeRate = 0.72;
	
	public double currenyConversion(double cadAmount) {
		return cadAmount * exchangeRate;
	}
}

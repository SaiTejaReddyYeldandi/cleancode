package com.cleancode;

import java.lang.Math;
public class SimpleAndCompoundInterest {
		double simpleInterest(double amount,double rate,double year) {
			return (amount*rate*year)/100;
		}
		double compoundInterest(double amount,double rate,double time,int n) {
			return (amount*Math.pow((1+rate/n),n*time)-amount);
		}
}
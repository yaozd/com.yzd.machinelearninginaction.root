package com.yzd.machinelearninginaction.demo.t2;

/*
 * Sigmoid函数
 */
public class Sigmoid {
	public static double sigmoid(double x) {
		double i = 1.0;
		double y = i / (i + Math.exp(-x));
		return y;
	}

}

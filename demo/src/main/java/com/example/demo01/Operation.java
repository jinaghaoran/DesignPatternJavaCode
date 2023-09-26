package com.example.demo01;

import lombok.Data;

/**
 * 计算方法的公用父类
 * 根据父类实现计算器方法
 */
@Data
public class Operation {
	public double numberA = 0;
	public double numberB = 0;
	public static void main(String[] args) {
		Operation operation = new Operation();
		operation.setNumberA(0.022);
		System.out.println(operation.toString());
	}
	public double getResult(){
		double result =0;
		return result;
	}
}

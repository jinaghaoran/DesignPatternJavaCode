package com.example.demo01;

/**
 * 继承自公共计算方法，实现两个值的除法
 */
public class OperationDiv extends Operation {

    public static void main(String[] args) {

    }

    @Override
    public double getResult() {
        double result = 0;
        if (numberB == 0)
            throw new RuntimeException("除数不能为0");
        result = numberA / numberB;
        return result;
    }
}
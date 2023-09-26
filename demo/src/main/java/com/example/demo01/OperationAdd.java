package com.example.demo01;

/**
 * 继承自公共计算方法，实现两个值的添加
 */
public class OperationAdd extends Operation {
    
    public static void main(String[] args) {
        
    }
    @Override
    public double getResult(){
        double result = 0;
        result = numberA + numberB;
        return result;
    }
}
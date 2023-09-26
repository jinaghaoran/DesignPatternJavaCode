package com.example.demo01;

public class TestOperation {
    public static void main(String[] args){
        Operation operate = OperationFactory.createOperate("+");
        operate.numberA= 2;
        operate.numberB= 4;
        System.out.println(operate.getResult());
    }
}

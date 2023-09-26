package com.example.demo01;

public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            case "*":
                oper = new OperationMul();
                break;
        }
        return oper;
    }
}
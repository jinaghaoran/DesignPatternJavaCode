package com.example.demo01;

import java.util.ArrayList;
import java.util.List;

public class TestOperation {
    public static void main(String[] args){
        Operation operate = OperationFactory.createOperate("+");
        operate.numberA= 2;
        operate.numberB= 4;
        System.out.println(operate.getResult());
        List<String> list = new ArrayList<>();
        list.add("uuyt");
        System.out.println(list.isEmpty());
        
        list = null;
        System.out.println(list.isEmpty());
    }
}

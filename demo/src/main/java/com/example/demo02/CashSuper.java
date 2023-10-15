package com.example.demo02;

import java.math.BigDecimal;

/**
 * 简单工厂模式实现
 * 第二章：商场收银软件的实现：
 * 需求：商场工作人员，根据客户购买的商品的单价和数量，向客户收费
 * 后续可能会有新的变动，比如打折（不同时期不同的折扣），满减等活动，需要设计一个能够适应这些活动的demo
 * 
 * 现金收费的抽象类
 * 现金收取超类的抽象方法,收取现金,参数为原价,返回当前价格
 */
public interface CashSuper {
    public  BigDecimal acceptCash(BigDecimal money);
}

package com.example.demo02;

import java.math.BigDecimal;

/**
 * 正常收费的子类
 */
public class CashNormal implements CashSuper {
    
    @Override
    public BigDecimal acceptCash(BigDecimal moneyDouble){
        return moneyDouble;
    }
    
}

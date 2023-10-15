package com.example.demo02;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * 打折收费的子类
 */
public class CashRebate implements CashSuper {
    private BigDecimal moneyRebate = new BigDecimal("1");
    public void CashRebate(String moneyRebate){
        if(!StringUtils.isEmpty(moneyRebate)){
            this.moneyRebate = new BigDecimal(moneyRebate);
        }
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'acceptCash'");
        return money.multiply(moneyRebate);


    }
    
}

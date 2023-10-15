package com.example.demo02;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

/**
 * 返利收费子类
 * 输入返利的条件，和返利的值
 */
public class CashReturn implements CashSuper {
    private BigDecimal moneyCondition = new BigDecimal("0");
    private BigDecimal moneyReturn = new BigDecimal("0");

    public void CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = new BigDecimal(StringUtils.isEmpty(moneyCondition) ? "0" : moneyCondition);
        this.moneyReturn = new BigDecimal(StringUtils.isEmpty(moneyReturn) ? "0" : moneyReturn);
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'acceptCash'");
        BigDecimal result = money;
        if (money.compareTo(moneyCondition) >= 0) {
            result = money.subtract(money.divide(moneyCondition, 2, BigDecimal.ROUND_HALF_UP).multiply(moneyReturn));
        }
        return result;
    }

}

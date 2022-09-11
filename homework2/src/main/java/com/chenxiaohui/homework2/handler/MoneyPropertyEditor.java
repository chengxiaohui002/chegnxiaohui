package com.chenxiaohui.homework2.handler;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class MoneyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            Double amount = 0d;
            try {
                amount = Double.parseDouble(text);
            } catch (Exception e) {
                e.printStackTrace();
            }
            setValue(Money.of(CurrencyUnit.of("CNY"), amount));
        }
    }
}

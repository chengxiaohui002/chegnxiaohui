package com.chenxiaohui.homework2.handler;

import org.joda.money.Money;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

public class MyPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(Date.class,"createTime",new DatePropertyEditor());
        propertyEditorRegistry.registerCustomEditor(Date.class,"updateTime",new DatePropertyEditor());
        propertyEditorRegistry.registerCustomEditor(Money.class,"price",new MoneyPropertyEditor());
    }
}

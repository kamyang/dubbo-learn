package com.dubbo.demo;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user",new UserDefinitionParser());
    }
}

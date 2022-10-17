package com.pelluru.bobcat.examples;

import com.google.inject.AbstractModule;
import com.pelluru.bobcat.examples.pageobjects.TitleComponent;
import com.pelluru.bobcat.examples.pageobjects.impl.TitleComponentImpl;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ComponentModule extends AbstractModule {

    @Override
    protected void configure() {
        WebDriverManager.chromedriver().setup();

        bind(TitleComponent.class).to(TitleComponentImpl.class);
    }
}

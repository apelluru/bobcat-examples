package com.pelluru.bobcat.examples.pageobjects.impl;

import com.cognifide.qa.bb.constants.HtmlTags;
import com.cognifide.qa.bb.qualifier.CurrentScope;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.pelluru.bobcat.examples.pageobjects.TitleComponent;
import org.openqa.selenium.WebElement;

import javax.inject.Inject;

@PageObject(css = ".cmp-title__text")
public class TitleComponentImpl implements TitleComponent {

    @Inject
    @CurrentScope
    private WebElement component;

    public String getTitle() {
        return component.getAttribute(HtmlTags.Properties.INNER_HTML);
    }

    public String getCssClassNameProperty() {
        return component.getAttribute(HtmlTags.Properties.CLASS_NAME);
    }
}

package com.pelluru.bobcat.examples;

import com.cognifide.qa.bb.aem.core.api.AemActions;
import com.cognifide.qa.bb.api.actions.ActionException;
import com.cognifide.qa.bb.api.actions.ActionsController;
import com.cognifide.qa.bb.junit5.guice.Modules;
import com.cognifide.qa.bb.modules.BobcatRunModule;
import com.cognifide.qa.bb.page.BobcatPageFactory;
import com.pelluru.bobcat.examples.pageobjects.TitleComponent;
import com.pelluru.bobcat.examples.pageobjects.impl.TitleComponentImpl;
import com.pelluru.bobcat.examples.pages.WkndUSENHomePage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Modules(BobcatRunModule.class)
@Epic("AEM 6.5 - Page Tests")
@Feature("WkndUSENHomePage Tests")
@Tag("publish")
public class WkndUSENHomePageTest {

    @Inject
    private WebDriver webDriver;

    @Inject
    @Named("publish.url")
    protected String publishUrl;

    private static final String WKND_US_EN_HOMEPAGE_PATH = "/content/wknd/us/en";

    @Test
    @DisplayName("Check if html dom element exist or not")
    public void checkIfHtmlDomElementExistTest() {
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //webDriver.get(publishUrl + WKND_US_EN_HOMEPAGE_PATH + ".html");
        webDriver.get("http://localhost:4505/libs/granite/core/content/login.html");

        /*WebElement parentBody = webDriver.findElement(By.xpath("//html/body/coral-dialog"));
        System.out.println("The source is : " + parentBody);
        System.out.println("The source is : " + parentBody.getAttribute("aria-describedby"));*/

        /*WebElement svgValue = webDriver.findElement(By.xpath("svg[@class='_coral-Icon-collection']"));
        System.out.println("svg value is : " + svgValue);
        System.out.println("svg value is : " + svgValue.getAttribute("aria-hidden"));*/

        WebElement svglist = webDriver.findElement(By.xpath("//*[local-name() = 'svg']"));
        //System.out.println(svglist);
        String ariaHidden = svglist.getAttribute("aria-hidden");
        //System.out.println("svg aria-hidden value: " + ariaHidden);
        assertTrue(Boolean.parseBoolean(ariaHidden));

        /*String input = webDriver.findElement(new By.ByTagName("svg")).getCssValue("class");
        System.out.println(input);*/
    }
}

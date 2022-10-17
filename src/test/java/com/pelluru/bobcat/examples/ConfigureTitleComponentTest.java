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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

@Modules(BobcatRunModule.class)
@Epic("AEM 6.5 - Components Tests")
@Feature("TitleComponent Tests")
public class ConfigureTitleComponentTest {

    @Inject
    private ActionsController controller;

    @Inject
    private BobcatPageFactory bobcatPageFactory;

    private static final String WKND_US_EN_HOMEPAGE_PATH = "/content/wknd/us/en";

    @Test
    public void configureTitleComponentTest() throws ActionException {
        controller.execute(AemActions.LOG_IN);

        WkndUSENHomePage wkndUSENHomePage = bobcatPageFactory
                .create("/editor.html" + WKND_US_EN_HOMEPAGE_PATH + ".html", WkndUSENHomePage.class);

        assertTrue(wkndUSENHomePage.open().isDisplayed());

        TitleComponentImpl titleContent = (TitleComponentImpl) wkndUSENHomePage.getContent(TitleComponent.class, 0);
        assertThat(titleContent.getTitle().trim().matches("Recent Articles"));
    }


}

package com.pelluru.bobcat.examples.pages;

import com.cognifide.qa.bb.aem.core.pages.AemAuthorPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.cognifide.qa.bb.wait.BobcatWait;
import com.google.inject.Inject;
import org.openqa.selenium.support.ui.ExpectedConditions;

@PageObject
public class WkndUSENHomePage extends AemAuthorPage<WkndUSENHomePage> {

  @Inject
  private BobcatWait bobcatWait;

  private String title = "WKND Adventures and Travel";

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isDisplayed() {
    return bobcatWait.isConditionMet(ExpectedConditions.titleIs(getTitle()));
  }

  public boolean isNotAvailable() {
    return bobcatWait.isConditionMet(ExpectedConditions.titleContains("404 Resource"));
  }
}

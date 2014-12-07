package com.application;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Admin on 07.11.14.
 */
public class ApplicationWebApp extends  AbstractApplicationWebApp {

    private String url;

    @Autowired
    private WebDriver webDriverInstance;

   @Step
    public void loadApplication() {
        webDriverInstance.navigate().to(getUrl());
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

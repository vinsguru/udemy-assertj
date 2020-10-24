package com.vinsguru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void goTo(){
        this.driver.get("https://www.duckduckgo.com");
    }

    public void search(String keyword){
        this.searchBox.sendKeys(keyword);
    }

    public WebElement getSearchBox(){
        return this.searchBox;
    }

    @Override
    public boolean isAt() {
        return this.driver.getTitle().contains("DuckDuckGo");
    }
}

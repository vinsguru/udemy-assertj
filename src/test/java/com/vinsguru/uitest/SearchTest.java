package com.vinsguru.uitest;

import com.vinsguru.pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class SearchTest extends BaseTest{

    private SearchPage searchPage;

    @BeforeTest
    public void pageSetup(){
          this.searchPage = new SearchPage(driver);
    }

    @Test
    public void launchSite(){
       this.searchPage.goTo();
       assertThat(this.searchPage).isAt();
    }

    @Test(dependsOnMethods = "launchSite")
    public void keywordTest(){
        this.searchPage.search("vinsguru");
        assertThat(this.searchPage.getSearchBox())
                .isEnabled()
                .isDisplayed()
                .hasAttributeValue("value", "vinsguru1");
    }

}

package com.vinsguru.test;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

/*
String input = <some text>;
Validate
Length is 8
Starts with “se”
Should not contain “api”
Should not contain any white space
Only one  “i” is present
 */
public class StringTest {

    @Test(dataProvider = "getData")
    public void stringTest(String input){
        assertSoftly(softAssertions -> {
            softAssertions.assertThat(input)
                    .hasSize(8)
                    .startsWith("se")
                    .doesNotContain("api")
                    .doesNotContainAnyWhitespaces()
                    .containsOnlyOnce("i");
        });
    }

    @DataProvider
    public Object[] getData(){
        return new String[] {
                "selenium",
                "selenide",
                "restapi"
        };
    }

}

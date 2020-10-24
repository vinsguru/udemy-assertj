package com.vinsguru.test;

import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class FileTest {

    @Test
    public void fileTest(){

        Path expectedFile = Paths.get("src/test/resources/data/expected.txt");
        Path actualFile = Paths.get("src/test/resources/data/actual.txt");

        assertThat(actualFile).hasSameContentAs(expectedFile);


    }

}

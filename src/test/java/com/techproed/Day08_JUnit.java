package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_JUnit {
    // JUnit kutuphanesini pom.xml'e import ettik
    // main methodunu artik kullanmiyoruz.

    @Test
    //test anotation'dur ve test methodlari da denilebilir.
    //testler ayri ayri run(calistililabilir) edilebilir.
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://google.com");
        driver.quit();
    }

    @Test
    // @Ignore//Ignore anotation'una sahip methodu gormezden gelinir
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://amazon.com");
        driver.quit();

    }

}

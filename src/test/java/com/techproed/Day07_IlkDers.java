package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {
    public static void main(String[] args) {

      //  System.setProperty("..............."," ..........."); buna artik gerek yok.
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://amazon.com");
        WebElement searchKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchKutusu.sendKeys("samsung headphones");
        searchKutusu.submit();

        WebElement urunSayisi = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(urunSayisi.getText());

        WebElement ilkUrun = driver.findElement(By.xpath("//span[class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(ilkUrun.getText());

        //<span class="a-size-base-plus a-color-base a-text-normal" dir="auto">
        List<WebElement> listele = driver.findElements(By.xpath("//div[class='a-section aok-relative s-image-square-aspect']"));
        for(WebElement w : listele ){
            System.out.println(w.getText());
        }

        //4. elemente goturur.
        listele.get(4);

        //4. elemente goturur.ve basligini soyler.
        listele.get(4).getText();
    }
}

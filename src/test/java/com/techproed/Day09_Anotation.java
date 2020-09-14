package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Anotation {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown (){
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://google.com");
        String title = driver.getTitle();

        Assert.assertEquals("Google Arama Sayfasi",title);
        //googlenin title'i "Google Arama Sayfasi" na esit mi degil mi?
    }

    @Test
    public void test2(){
        driver.get("http://amazon.com");
        String title = driver.getTitle();

        boolean iceriyormu = title.contains("Amazon");
        Assert.assertTrue(iceriyormu);//true oldugunu dogrula
        // Assert.assertTrue(title.contains("Amazon") ? true : false); seklinde de yazilabilirdi
        // amazon.com amazon kelimesini iceriyor
       // parantezin ici TRUE ise test basaili
    }

    @Test
    public void test3(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();

        //facebook.com un title'i youtube kelimesini iceriyormu?
        boolean iceriyormu = title.contains("Youtube");
        Assert.assertFalse(iceriyormu);//false oldugunu dogrula
        // parantezin ici FALSE ise test basaili
    }
    @Test
    public void test4() {
        driver.get("http://google.com");
        String title = driver.getTitle();

        System.out.println("merhabalar...");
        Assert.assertEquals("Google Arama Sayfasi",title);

        //eger test basarisizsa testin geri kalaniyla ilgilenmez
        //sonraki tete gecer
        System.out.println("test dogrulama islami bitti...");
    }
    @Test
    public void test5() {
        driver.get("http://facebook.com");
        String title = driver.getTitle();

        boolean iceriyormu = title.contains("Google");
        Assert.assertFalse(iceriyormu);
        System.out.println("test dogrulama islami bitti...");
        //ger test basariliysa testin geri kalanini da okur.
    }
}

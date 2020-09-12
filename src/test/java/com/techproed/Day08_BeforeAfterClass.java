package com.techproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class Day08_BeforeAfterClass {
    // @BeforeClass ve @AfterClass'i istedihiniz yere yazabilirsiniz ila testlerin basina
    // ve sonuna yazilmasina gerek yok java @BeforeClassi bulur ve ise baslar
    // testler bittikten sonta @AfterClass'i bulur ve testi sonlandirir.

    @BeforeClass
    //bu anotationa sahip method her class calismadan once calisir
    //sadece 1 kere calisir
    public static void setUp(){
        System.out.println("setUp calisti");
    }
    @Test
    public void test1(){
        System.out.println("test1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("test2 calisti");
    }

    @AfterClass
    //bu anotationa sahip method her classtaki testler calistirildiktan sonra calisir
    //sadece 1 kere calisir
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }

}

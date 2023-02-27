/****************************************************************************
 * TestLcs
 ****************************************************************************
 * Testing Lcs Class function: lcs
 *_____________________________________________________
 * Masrik Dahir
 * 26 february 2023
 * CMSC 525
 * Copyright 2023, Masrik Dahir, All Right Reserved
 ****************************************************************************/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLcs {

    @Test
    public void test1(){
        String firstString = "Mai";
        String secondString = "Chai";
        assertEquals(Lcs.lcs(firstString, secondString), "ai");
    }

    @Test
    public void test2(){
        String firstString = "Tennis";
        String secondString = "Bug";
        assertEquals(Lcs.lcs(firstString, secondString), "");
    }

    @Test
    public void test3(){
        String firstString = "Cat";
        String secondString = "Cat";
        assertEquals(Lcs.lcs(firstString, secondString), "Cat");
    }
    @Test
    public void test4(){
        String firstString = "";
        String secondString = "";
        assertEquals(Lcs.lcs(firstString, secondString), "");
    }

    @Test
    public void test5(){
        String firstString = "Balls";
        String secondString = "Mall";
        assertEquals(Lcs.lcs(firstString, secondString), "all");
    }

}

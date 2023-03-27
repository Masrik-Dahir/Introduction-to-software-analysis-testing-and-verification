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
        String firstString = "baton";
        String secondString = "solon";
        assertEquals(Lcs.lcs(firstString, secondString), "on");
    }

    @Test
    public void test2(){
        String firstString = "N/A";
        String secondString = "Common";
        assertEquals(Lcs.lcs(firstString, secondString), "");
    }

    @Test
    public void test3(){
        String firstString = "Same String";
        String secondString = "Same String";
        assertEquals(Lcs.lcs(firstString, secondString), "Same String");
    }
    @Test
    public void test4(){
        String firstString = "";
        String secondString = "";
        assertEquals(Lcs.lcs(firstString, secondString), "");
    }

    @Test
    public void test5(){
        String firstString = "Middle";
        String secondString = "Paddles";
        assertEquals(Lcs.lcs(firstString, secondString), "ddle");
    }

}

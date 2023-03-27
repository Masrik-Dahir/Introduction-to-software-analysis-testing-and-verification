/****************************************************************************
 * TestMutant
 ****************************************************************************
 * Testing Mutant Class function: cal
 * Active mutators:
 *      CONDITIONALS_BOUNDARY
 *      EMPTY_RETURNS
 *      FALSE_RETURNS
 *      INCREMENTS
 *      INVERT_NEGS
 *      MATH
 *      NEGATE_CONDITIONALS
 *      NULL_RETURNS
 *      PRIMITIVE_RETURNS
 *      TRUE_RETURNS
 *      VOID_METHOD_CALLS
 *_____________________________________________________
 * Masrik Dahir
 * 22 March 2023
 * CMSC 525
 * Copyright 2023, Masrik Dahir, All Right Reserved
 ****************************************************************************/

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMutant {

    /*
     * line 13: Killing negated conditional Mutant
     * line 14: Killing Replaced integer subtraction with addition Mutant
     * line 32: Killing int return with 0 for Mutant::cal Mutant
     */
    @Test
    public void testDifferentDaySameMonth(){
        Mutant mutant = new Mutant();
        assertEquals(17, mutant.cal(5,10,5,27,2022));
    }


    /*
     * line 13: Killing negated conditional Mutant
     * line 20: Killing Replaced integer modulus with multiplication Mutant
     * line 22: Killing negated conditional Mutant
     * line 27: Killing Replaced integer subtraction with addition Mutant
     * line 27: Killing Replaced integer addition with subtraction Mutant
     * line 29: Killing changed conditional boundary Mutant
     * line 29: Killing Replaced integer addition with subtraction Mutant
     * line 29: Killing Replaced integer subtraction with addition Mutant
     * line 29: Killing negated conditional Mutant
     * line 30: Killing Replaced integer addition with subtraction Mutant
     * line 32: Killing replaced int return with 0 for Mutant::cal Mutant
     */
    @Test
    public void testNotLeapYear(){
        Mutant mutant = new Mutant();
        assertEquals(28, mutant.cal(2,1,3,1,300));
    }



    /*
     * line 13: Killing negated conditional Mutant
     * line 19: Killing Replaced integer modulus with multiplication Mutant
     * line 21: Killing Replaced integer modulus with multiplication Mutant
     * line 21: Killing negated conditional Mutant
     * line 22: Killing negated conditional Mutant
     * line 27: Killing Replaced integer subtraction with addition Mutant
     * line 27: Killing Replaced integer addition with subtraction Mutant
     * line 29: Killing Replaced integer addition with subtraction Mutant
     * line 29: Killing Replaced integer subtraction with addition Mutant
     * line 29: Killing negated conditional Mutant
     * line 32: Killing replaced int return with 0 for Mutant::cal Mutant
     */
    @Test
    public void testLeapYear(){
        Mutant mutant = new Mutant();
        assertEquals(121, mutant.cal(1,2,5,2,4000));
    }
}

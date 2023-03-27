/****************************************************************************
 * TestBitSet
 ****************************************************************************
 * Testing BitSet Class functions: constructor, set, get, flip
 *_____________________________________________________
 * Masrik Dahir
 * 12 february 2023
 * CMSC 525
 * Copyright 2023, Masrik Dahir, All Right Reserved
 ****************************************************************************/

import org.junit.jupiter.api.Test;
import java.util.BitSet;
import static org.junit.jupiter.api.Assertions.*;

public class TestBitSet {

    /*
     * Test Requirement 1: Testing Base Case
     * when BitSet has a Positive Length and BitIndex has a non-negative Length
     * Nbits >= 1 and bitIndex >= 0
     */
    @Test
    public void testPositiveLengthAndPositiveIndex(){
        BitSet bitSet = new BitSet(1);
        bitSet.set(127);
        assertTrue(bitSet.get(127));
        bitSet.flip(127);
        assertFalse(bitSet.get(127));
    }



    /*
     * Test Requirement 2: Testing get and set when BitSet has a 0 Length
     * Nbits = 0 and bitIndex >= 0
     */
    @Test
    public void testZeroLengthAndNonNegativeBitIndex(){
        BitSet bitSet = new BitSet(0);
        assertFalse(bitSet.get(0));
        assertEquals(0, bitSet.length());
    }


    /*
     * Test Requirement 3: Testing set when BitSet length is 0 and bitIndex is negative
     * Nbits = 0 and bitIndex < 0
     */
    @Test
    public void testSetZeroLengthAndNegativeBitIndex(){
        BitSet bitSet = new BitSet(0);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            bitSet.set(-1);
        });
    }

    /*
     * Test Requirement 3: Testing get when BitSet length is 0 and bitIndex is negative
     * Nbits = 0 and bitIndex < 0
     */
    @Test
    public void testGetZeroLengthAndNegativeBitIndex(){
        BitSet bitSet = new BitSet(0);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            bitSet.get(-1);
        });
    }

    /*
     * Test Requirement 4: Testing when BitSet has a Negative Length
     * Nbits < 0
     */
    @Test
    public void testNegativeLength(){
        assertThrows(NegativeArraySizeException.class, () -> {
            BitSet bitSet = new BitSet(-1);
        });
    }
}
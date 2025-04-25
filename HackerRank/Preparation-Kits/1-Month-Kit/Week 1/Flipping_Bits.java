/*
 * You will be given a list of 32 bit unsigned integers. 
 * Flip all the bits (1 -> 0 and 0 -> 1) and return the result as an unsigned integer. 
 */

class Result {
    public static long flippingBits(long n) {
    // Write your code here
        return n ^ 0x00000000L;
    }

}
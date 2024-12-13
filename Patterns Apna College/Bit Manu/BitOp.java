// package Bit Manu;

public class BitOp {
    public static void main(String[] args) {
        // byte b = 0101;

        // ------------------GET BIT-----------------

        // to get 3rd bit(pos=2)of number n. n=0101

        // steps :

        // 1.)
        // Bit mask : 1<<i (i=pos)
        // 1<<2
        // 0001<<2 =>0100=4

        // 2.) Operation : AND
        // ques no AND recent bit mask (0100)
        // 0101
        // && 0100
        // ------
        // 0100=>final number

        // if final numbe is non zero then bit was 1
        // else bit was zero=>0.

        // decimal = 5
        // binary = 0101
        int n = 5;
        int pos = 2;

        int bitMask = 1 << pos;

        if ((bitMask & n) == 0)
            System.out.println("bit at pos :" + pos + " is : 0");
        else
            System.out.println("bit at pos :" + pos + " is : 1");

        // ----------------SET BIT--------------
        // steps :
        // 1.) bitmask 1<<pos
        // 2.) operation :OR

        // --------CLEAR BIT MEANS PUT ZERO-----------
        // steps :
        // 1.) bitmask 1<<pos
        // 2.) operation : AND WITH NOT

    }
}

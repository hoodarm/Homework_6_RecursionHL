package com.company;
public class Main
{

    public static void main(String[] args)
    {
        final int N = 4;
        int[] bits = new int[N];
        bitArrayMaker(bits, 4,0);
    }

    public static void bitArrayMaker(int[] bits, int N, int K)
    {
        if (K==N)
        {
            System.out.println(java.util.Arrays.toString(bits));
            return;
        }

        for (bits[K]=0;bits[K]<=1;bits[K]++)
            bitArrayMaker(bits,N,K+1);
    }
}

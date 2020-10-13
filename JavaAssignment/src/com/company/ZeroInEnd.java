package com.company;
import java.io.*;
public class ZeroInEnd {


    private int[]a;
    private int n;

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ZeroInEnd(int[] a, int n) {
        super();
        this.a = a;
        this.n = n;
    }

    public int[] zeroInEnd(int a[],int n) {
        int cnt = 0;

        for(int j=0;j<n;j++) {
            if(a[j] != 0 ) {
                a[cnt++] =a[j];
            }
        }
        while(cnt <n) {
            a[cnt++] = 0;
        }
        return a;
    }
}
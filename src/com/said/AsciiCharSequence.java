package com.said;
import java.lang.CharSequence;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private final byte[] mass;
    public AsciiCharSequence(byte[] mass){
            this.mass = mass;
    }
        @Override
        public int length(){
            return mass.length;
        }
        @Override
        public char charAt(int i){
            char ch = (char) mass[i];
            return ch;
        }
        @Override
        public AsciiCharSequence subSequence(int start, int end){

            byte[] arr = new byte[end-start];

            for(int i=0,j=start; i< arr.length && j < end; i++, j++) {
                arr[i] = mass[j];
            }
            return new AsciiCharSequence(arr);
        }
        @Override
        public String toString(){
            return new String(mass);
        }

}

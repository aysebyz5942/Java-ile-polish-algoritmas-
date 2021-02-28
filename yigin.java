/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polish_noto;
import java.awt.*; 
import java.io.*;
import java.util.*;
public class yigin {

    public int top=0;
    public void push( int x, int a[], int top){ //yigina ekle 
        a[top] = x;
        ++top; this.top=top;
    } 
    public int pop( int a[], int top){
        --top;       //yigina cikar
        this.top=top; 
        return a[top]; 
    }

}

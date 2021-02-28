
package polish_noto;

import java.util.Stack;

public class Polish_Algoritma {
     int polish_algo(int boyut,String input){
        int x = 0 , a=0,b=0,sonuc=0;
        int stk[]=new int[120];
         yigin metot =new yigin();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)>='0' && input.charAt(i)<='9'){ //stringdeki ifade sayi ise
                x =input.charAt(i)-'0';     
                metot.push( x, stk, metot.top); //yıgına ekle
            }
            else if(input.charAt(i)==' '){ //bosluk ise gec
                i--;
            }
            else {  //herhengi bir  4,-,*,/ sembol ise bu islemi yap ve sonucu tekrar yıgına ekle
                if(input.charAt(i) == '+'){
                b = metot.pop( stk, metot.top);
                a = metot.pop( stk, metot.top);
                metot.push( a + b, stk, metot.top);
                System.out.println("\n a+b="+ (a+b));
            }
            else if(input.charAt(i) == '-'){
                b = metot.pop( stk,metot.top);
                a = metot.pop( stk, metot.top);
                metot.push( a -b, stk,metot.top);
                System.out.println("\n a-b ="+ (a-b));
            }
            else if(input.charAt(i) == '/'){
                b = metot.pop( stk, metot.top); 
                a = metot.pop( stk, metot.top);
                metot.push( a / b, stk, metot.top);
                System.out.println("\na/b= "+ a/b);
            }
            else if(input.charAt(i) == '*'){
                b = metot.pop( stk, metot.top);
                a = metot.pop( stk, metot.top);
                metot.push( a * b, stk, metot.top);
                System.out.println("\n a*b= "+ a*b);
            }
        }
            i--;
        }
        sonuc=metot.pop( stk, metot.top);   //sonuc u yıgından cıkar
        return  sonuc;
    }
   
}

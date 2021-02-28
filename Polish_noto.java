
package polish_noto;

import java.util.Scanner;
import java.util.Stack;
                            // 181213053 Ayse Beyza Unal
public class Polish_noto {

    public static void main(String[] args) {
        String input;
        Scanner scan= new Scanner(System.in);
        System.out.println("input gir:");
        input=scan.nextLine();
        int boyut=input.length();
        Polish_Algoritma pa=new Polish_Algoritma();
        System.out.println("polish notasyonun degeri:"+pa.polish_algo(boyut, input));
    }
   
}

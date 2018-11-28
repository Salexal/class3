package servlet;

import java.util.Scanner;


public class Main {

    public static Boolean gettf(String a){
        if(a.length()==1&&(a.charAt(0)=='-'||a.charAt(0)=='.'))
            return false;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)>'9'||a.charAt(i)<'0'||a.charAt(0)!='-'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        String c = input.next();
        int flag = 0;
        boolean one = gettf(a);
        boolean two = gettf(c);

        if(one){
            System.out.print(Integer.valueOf(a)+" + ");
        }else
            System.out.print(" ? + ");
        if(one){
            System.out.print(Integer.valueOf(c)+" = ");
        }else
            System.out.print(" ? =");
        if(one==false||two==false){
            System.out.println("?");
        }else
            System.out.println(Integer.valueOf(a)+Integer.valueOf(b));
    }
}

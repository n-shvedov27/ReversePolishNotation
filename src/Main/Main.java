package Main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;



public class Main {
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static int culc(String s){
        String[] a = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        for(String c: a){
            if (isNumeric(c)){
                stack.push(Integer.parseInt(c));
            }
            else{
                int first = stack.pop();
                int second = stack.pop();
                switch (c){
                    case ("+"):{
                        stack.push(first+second);
                        break;
                    }
                    case ("-"):{
                        stack.push(second-first);
                        break;
                    }
                    case ("*"):{
                        stack.push(second*first);
                        break;
                    }
                    case ("/"):{
                        stack.push((second/first));
                    }
                }
            }
        }
        return stack.pop();

    }
    public static void main(String[] args){

    }
}



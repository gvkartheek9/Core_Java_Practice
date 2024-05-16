package Assingment;

//“aaabbc” -> “a3b2c1”

import java.util.Comparator;

public class StringCount {

    public static int  Occurence(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){
        String s="aaabbbc";
        String res="";
        boolean flag;
        int count=0;
        for(int i=0;i<s.length();i++){
            flag=true;
            char character = s.charAt(i);
             count=Occurence(s,s.charAt(i));
            for(int j=0;j<res.length();j++){
                if(res.charAt(j)==character){
                    flag=false;
                }
            }
            if(flag){
                res=res + s.charAt(i)+Integer.toString(count);
            }
        }

        System.out.println(res);
    }
}

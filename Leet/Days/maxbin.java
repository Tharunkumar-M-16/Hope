package Leet.Days;

public class maxbin {
    class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(arr[i]=='1'){
                c++;
            }
        }
        String str="";
        for(int i=0;i<c-1;i++){
            str+="1";
        }
        for(int i=c-1;i<s.length()-1;i++){
            str+="0";
        }
        str+="1";
        return str;
        
    }
}
}

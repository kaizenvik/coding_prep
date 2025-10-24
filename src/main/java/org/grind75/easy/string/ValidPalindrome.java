package org.grind75.easy.string;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(j > i){
            Character ci = Character.toUpperCase(s.charAt(i));
            Character cj = Character.toUpperCase(s.charAt(j));

            if((ci < 'A' || ci > 'Z') && (ci < '0' || ci > '9')){
                i++;
                continue;
            }
            if((cj < 'A' || cj > 'Z') && (cj < '0' || cj > '9')){
                j--;
                continue;
            }
            if(ci == cj){
                i++;
                j--;
            } else {
                System.out.println(ci + " " + cj);
                return false;
            }
        }
        return true;
    }
}

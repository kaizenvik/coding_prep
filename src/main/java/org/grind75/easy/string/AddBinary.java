package org.grind75.easy.string;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public String addBinary1(String a, String b) {
        StringBuilder res = new StringBuilder();
        int al = a.length() - 1, bl = b.length() - 1, carry = 0;

        while (al >= 0 || bl >= 0 || carry == 1) {
            int tot = carry;
            if (al >= 0) {
                tot += a.charAt(al--) - '0';
            }
            if (bl >= 0) {
                tot += b.charAt(bl--) - '0';
            }
            carry = tot / 2;
            res.append(tot % 2);
        }

        return res.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int al = a.length() - 1;
        int bl = b.length() - 1;
        for(int i = 0; i <= Math.max(al,bl) + 1; i++){
            int ac = al-i >= 0 ? (int)(a.charAt(al-i) - '0') : 0;
            int bc = bl-i >= 0 ? (int)(b.charAt(bl-i) - '0') : 0;
            System.out.println(ac + " " + bc);
            if(ac + bc + carry == 3){
                res.append('1');
                carry = 1;
            } else if (ac + bc + carry == 2) {
                res.append('0');
                carry = 1;
            } else if (ac + bc + carry == 1) {
                res.append('1');
                carry = 0;
            } else {
                res.append('0');
                carry = 0;
            }
        }
        return res.reverse().toString();
    }

    public String addBinary3(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int al = a.length() - 1;
        int bl = b.length() - 1;
        while(al >= 0 || bl >= 0){
            int ac = al >= 0 ? a.charAt(al--) - '0' : 0;
            int bc = bl >= 0 ? b.charAt(bl--) - '0' : 0;
            int val = (ac + bc + carry) % 2;
            carry = (ac + bc + carry) / 2;
            res.append(val);
        }
        if(carry > 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }

}

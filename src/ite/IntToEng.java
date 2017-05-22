package ite;
import java.util.Scanner;

public class IntToEng {
	// メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == 0){
        	System.out.println("zero");        	
        }else{
        System.out.println(translateEng(input));
        }

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	StringBuffer sb = new StringBuffer();
    	if(n/100 != 0){
    	sb.append(number(n/100));
    	sb.append(number100(n/100));
    	sb.append(" ");//100の位
    	}
    	if(n/10 != 0){
    		sb.append(number10(n/10));
    		sb.append(" ");//10の位
    	}
    	
    	if(n%10 == 0) {
    		sb.deleteCharAt(sb.length()-1);
    	} else {
    		sb.append(number(n%10));//1の位
    	}
        return new String(sb);
    }
    
    static String number (int n) {
    	if(n == 1) {
    		return "one";
    	} else if(n == 2) {
    		return "two";
    	} else if(n == 3) {
    		return "three";
    	} else if(n == 4) {
    		return "four";
    	}else if(n == 5) {
    		return "five";
    	}else if(n == 6) {
    		return "six";
    	}else if(n == 7) {
    		return "seven";
    	}else if(n == 8) {
    		return "eight";
    	}else if(n == 9) {
    		return "nine";
    	}
    	return "";
    }
    
    static String number10(int n) {
    	if(n%10 == 1) {
    		return "ten";
    	}if(n%10 == 2) {
    		return "twenty";
    	}if(n%10 == 3) {
    		return "thirty";
    	}if(n%10 == 4) {
    		return "fourty";
    	}if(n%10 == 5) {
    		return "fifty";
    	}if(n%10 == 6) {
    		return "sixty";
    	}if(n%10 == 7) {
    		return "seventy";
    	}if(n%10 == 8) {
    		return "eighty";
    	}if(n%10 == 9) {
    		return "ninety";
    	}
    	return "";
    }
    static String number100(int n) {
    	if(n ==1){
    		return " hundred";
    	}else{
    		return " hundreds";
    	}
    }
}

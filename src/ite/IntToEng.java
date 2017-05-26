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

    // 3桁までの数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	StringBuffer sb = new StringBuffer();
    	//100の位を定義
    	//100の位が0でないときに　"○ hundred(s)"を表示
    	if(n/100 != 0){
    		sb.append(number(n/100));//100の位
    		sb.append(" ");//100の位とhundredの間のスペース 
    		sb.append(number100(n/100));//hundredかhundreds
    	}
    	//10の位が0でないときに 10の位を定義
    	if(n>=100){ //nが3桁のとき
    		if(n%10 <=19 && n %10 >= 11){//11から19のとき
    			sb.append(" ");
    			sb.append(number11To19(n));
    		}else if(n % 100 ==0){
    			sb.append("");
    		}else{//11から19以外のとき
    			sb.append(" ");
    			sb.append(number10(n/10));//10の位	
    			if(n%10 != 0) {
    				sb.append(" ");//10の位と1の位の間のスペース
    				sb.append(number(n%10));//1の位
    			}
    		}
    	}
    	if(n<=99 && n>=10){//nが2桁のとき
    		if(n <=20 && n  >= 10){
    			sb.append(number11To19(n));
    		}else{
    			sb.append(number10(n/10));//10の位	
    			if(n%10 != 0) {
    				sb.append(" ");//10の位と1の位の間のスペース
    				sb.append(number(n%10));//1の位
    			}
    		}
    	}
    	if(n<=9){
    		sb.append(number(n%10));
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
    
    static String number11To19(int n) {
    	if(n ==11){
    		return "eleven";
    	}if(n ==12){
    		return "twelve";
    	}if(n ==13){
    		return "thirteen";
    	}if(n ==14){
    		return "fourteen";
    	}if(n ==15){
    		return "fifteen";
    	}if(n ==16){
    		return "sixteen";
    	}if(n ==17){
    		return "seventeen";
    	}if(n ==18){
    		return "eighteen";
    	}if(n ==19){
    		return "nineteen";    		
    	}
    	return"";
    }
    static String number100(int n) {
    	if(n ==1){
    		return "hundred";
    	}else{
    		return "hundreds";
    	}
    }
}
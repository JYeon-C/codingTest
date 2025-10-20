package lecture1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String[] inputs = input1.split("");
        // 대문자와 소문자의 차이는 32
        // 대문자의 범위는 A ~ Z(65 ~ 90)
        // 소문자의 범위는 a ~ z(97 ~ 122)

        String anwser = "";
        for(int i = 0; i < inputs.length; i++) {
            int temp = inputs[i].charAt(0);

            if(temp >= 65 && temp <= 90) { // 대문자 범위 내에 있을 때는 + 32
                anwser += (char) (temp + 32);
            } else if (temp >= 97 && temp <= 122) { // 소문자 범위 내에 있을 때는 -32
                anwser += (char) (temp - 32);
            } else {
                anwser += "";
            }
        }
        System.out.println(anwser);
    }
}

/*
for(char x: str.toCharArray()) {
    if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
    else answer += Character.toLowerCase(x);
}
*/

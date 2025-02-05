package level2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

// 주사위 세개
public class Problem2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        List<Integer> diceList = Arrays.asList(dice1, dice2, dice3);
        int diceNum = 0;
        int count = 0;
        
        // 같은 주사위 숫자 확인
        for(int i = 0; i < diceList.size(); i++) {
            for(int j = i + 1; j < diceList.size(); j++) {
                if(diceList.get(i) == diceList.get(j)) {
                    count++;
                    diceNum = diceList.get(j);
                }
            }
        }

        // 출력
        if(count == 3) {
            System.out.println(10000 + diceNum * 1000);
        } else if(count == 1) {
            System.out.println(1000 + diceNum * 100);
        } else {
            System.out.println(diceList.stream().max(Integer::compareTo).get() * 100);
        }
    }
}

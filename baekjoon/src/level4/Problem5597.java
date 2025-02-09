package level4;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> studentList = new ArrayList<>();
        ArrayList<Integer> inputList = new ArrayList<>();

        // 출석부
        for(int i = 0; i < 30; i++) {
            studentList.add(i + 1);
        }

        // 입력
        for(int i = 0; i < 28; i++) {
            int num = sc.nextInt();

            inputList.add(num);
        }

        // 과제를 낸지 않은 학생 출석번호
        for(int j = 0; j < studentList.size(); j++) {
            if(!inputList.contains(studentList.get(j))) {
                System.out.println(studentList.get(j));
            }
        }
    }
}

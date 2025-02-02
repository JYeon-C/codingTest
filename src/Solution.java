package src;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int rowIndex = -1; // 행 인덱스
        int colIndex = 0; // 열 인덱스
        int totalCount = 1; // 반복을 돌면서 입력될 값

        // 반복을 실행할 조건 설정
        ArrayList<Integer> condition1 = returnIntArr(0, n); // [rowIndex, colIndex++]
        ArrayList<Integer> condition2 = returnIntArr(1, n); // [rowIndex++, colIndex]
        ArrayList<Integer> condition3 = returnIntArr(2, n); // [rowIndex--, colIndex--]

//        System.out.println("condition1 = " + condition1);
//        System.out.println("condition2 = " + condition2);
//        System.out.println("condition3 = " + condition3);

        // 임시 배열 선언
        int[][] tempList = new int[n][n];

        // 전체 배열 접근 반복문
        for (int i = n; i >= 0; i--) { // 0 < i < n
            for (int j = 0; j < i; j++) {
                if (condition1.contains(i)) { // rowIndex++, colIndex
                    if (rowIndex < (n - 1)) {
                        rowIndex++;
                    }
//                    System.out.println("rowIndex, colIndex : [" + rowIndex + ", " + colIndex + "]");
//                    System.out.println("조건 1 값 : " + totalCount);
                } else if (condition2.contains(i)) { // rowIndex, colIndex++
                    if (colIndex < (n - 1)) {
                        colIndex++;
                    }
//                    System.out.println("rowIndex, colIndex : [" + rowIndex + ", " + colIndex + "]");
//                    System.out.println("조건 2 값 : " + totalCount);
                } else if (condition3.contains(i)) { // rowIndex--, colIndex--
                    if (rowIndex >= 0 && colIndex >= 0) {
                        rowIndex--;
                        colIndex--;
                    }
//                    System.out.println("rowIndex, colIndex : [" + rowIndex + ", " + colIndex + "]");
//                    System.out.println("조건 3 값 : " + totalCount);
                }
                tempList[rowIndex][colIndex] = totalCount; // 해당 인덱스 위치에 값 저장
                totalCount++;
            }
        }

        // answer 배열에 순차적으로 값 입력
        for (int i = 0; i < tempList.length; i++) {
            for (int j = 0; j <= i; j++) {
                answer.add(tempList[i][j]);
            }
        }

        System.out.println("answer = " + answer);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    // 조건 배열 생성 메소드
    // condition1 = [rowIndex++, colIndex]
    // condition2 = [rowIndex, colIndex++]
    // condition3 = [rowIndex--, colIndex--]
    public static ArrayList<Integer> returnIntArr(int culNum, int n) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        int conNum = n - culNum;

        for (int i = 0; i < n; i++) {
            if (conNum > 0) {
                tempArr.add(conNum);
            }
            conNum = conNum - 3;
        }
        return tempArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solution(n); // 사용자 입력 값을 받아 달팽이 반복 실행
    }
}
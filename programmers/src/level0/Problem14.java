package level0;

// 배열 뒤집기
public class Problem14 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int[] answer = new int[num_list.length];

        // 배열 뒤집기
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[(num_list.length - 1) - i];
        }

        // 출력
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

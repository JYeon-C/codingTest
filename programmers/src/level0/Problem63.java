package level0;

import java.util.ArrayList;

public class Problem63 {
    public ArrayList<ArrayList<Integer>> solution(int[] num_list, int n) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        int index = 0;

        for(int i=0; i<num_list.length / n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j < n; j++) {
                temp.add(num_list[index]);
                index++;
            }
            answer.add(temp);
        }
        return answer;
    }
}

// 0 0, 0 1
// 1 0, 1 1
// 2 0, 2 1
// 3 0, 3 1
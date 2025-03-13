package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 가까운 숫자
// 정렬 & 절댓값 사용하면 더 좋음
public class Problem69 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] chkArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            chkArray[i] = Math.abs(array[i] - n);
        }

        int min = Arrays.stream(chkArray).min().getAsInt();

        List<Integer> indices = IntStream.range(0, chkArray.length)
                .filter(i -> chkArray[i] == min)
                .boxed()
                .collect(Collectors.toList());

        answer = indices.stream().mapToInt(i -> array[i]).min().getAsInt();
        return answer;
    }
}

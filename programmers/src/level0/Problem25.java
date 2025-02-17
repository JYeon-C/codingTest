package level0;

// 아이스 아메리카노
public class Problem25 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 0;
        int change = money;

        while(true) {
            if(change >= 5500) {
                change -= 5500;
                count++;
            } else {
                answer[0] = count;
                answer[1] = change;
                break;
            }
        }
        return answer;
        //  return new int[] { money / 5500, money % 5500 };
    }
}

import java.util.Arrays;

// 캐릭터의 좌표
public class Problem81 {
    public static void main(String[] args) {
        Problem81 problem81 = new Problem81();
        String[] keyinput = new String[1];
        Arrays.fill(keyinput, "right");
        int[] board = {99, 99}; // 가로 크기, 세로 크기, 홀수

        problem81.solution(keyinput, board);
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int maxX = board[0] == 1? 0 : (board[0]) / 2;
        int maxY = board[1] == 1? 0 : (board[1]) / 2;
        int x = 0;
        int y = 0;

        for (String key : keyinput) {
            if(key.equals("left")) {
                if(x > -maxX) x--;
            } else if(key.equals("right")) {
                if(x < maxX) x++;
            } else if(key.equals("up")) {
                if(y < maxY) y++;
            } else if(key.equals("down")) {
                if(y > -maxY) y--;
            }
        }
        answer = new int[]{x, y};

        return answer;
    }
}

// 절댓값 사용하면 방향에 대한 체크를 제대로 못함!
package level0;

// 로그인 성공?
public class Problem85 {
    public static void main(String[] args) {
        Problem85 problem85 = new Problem85();

        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        String result = problem85.solution(id_pw, db);
        System.out.println("result = " + result);
    }


    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail"; // 아이디 불일치

        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                answer = "wrong pw"; // 패스워드 불일치
                if(db[i][1].equals(id_pw[1])) {
                    answer = "login";
                }
            }
        }

        return answer;
    }

}

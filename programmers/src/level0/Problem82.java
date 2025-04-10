package level0;

// 외계어 사전
public class Problem82 {
    public static void main(String[] args) {
        Problem82 problem = new Problem82();

        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        problem.solution(spell, dic);
    }

    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
            boolean temp = true;
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].indexOf(spell[j]) == -1) {
                    temp = false;
                    break;
                }
            }
            if(temp) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

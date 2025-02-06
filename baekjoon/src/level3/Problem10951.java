package level3;

import java.io.*;

// 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
// End of File ? 예외 처리 또는 null, -1 반환 여부로 EOF를 확인
public class Problem10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String AB = br.readLine();

            if(AB != null) {
                int A = Integer.parseInt(AB.split(" ")[0]);
                int B = Integer.parseInt(AB.split(" ")[1]);
                int sum = A + B;

                bw.write(sum + "\n");
            } else {  // ctrl + D 종료
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}

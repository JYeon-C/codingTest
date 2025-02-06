package level3;

import java.io.*;

// 빠르게 입력받고 출력하는 문제
public class Problem15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int T = Integer.parseInt(input);

        for(int i = 0; i < T; i++) {
            String AB = br.readLine();
            int A = Integer.parseInt(AB.split(" ")[0]);
            int B = Integer.parseInt(AB.split(" ")[1]);
            int sum = A + B;

            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}

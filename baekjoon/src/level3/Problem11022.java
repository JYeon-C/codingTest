package level3;

import java.io.*;

// A+B를 바로 위 문제보다 아름답게 출력하는 문제
public class Problem11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int T = Integer.parseInt(input);

        for(int i = 1; i <= T; i++) {
            String AB = br.readLine();
            int A = Integer.parseInt(AB.split(" ")[0]);
            int B = Integer.parseInt(AB.split(" ")[1]);
            int sum = A + B;

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}

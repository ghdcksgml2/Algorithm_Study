// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 26620 KB , 시간 : 344 ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] arsg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pq.isEmpty() == false) {
                    bw.write(pq.peek() + "\n");
                    pq.poll();
                }else
                    bw.write("0\n");
            }else
                pq.add(x);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

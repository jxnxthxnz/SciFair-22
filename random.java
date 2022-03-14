import java.io.*;
import java.util.*;
public class random {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int min = 1;
        int max = 4;
        int random = 0;
        for(int ii = 0; ii < 4; ii++) { //main side, 4x4
            for(int i = 0; i < 4; i++) {
                random = (int) Math.floor(Math.random() * (max - min + 1) + min);
                out.print(random + " ");
            }
            out.println();
        }
        
        for(int ii = 0; ii < 4; ii++) {//remaining 4 sides, 4x3
            for(int i = 0; i < 4; i++) {
                for(int p = 0; p < 3; p++) {
                    random = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    out.print(random + " ");
                }
                out.println();
            }
        }
        in.close();
        out.close();
    }
}

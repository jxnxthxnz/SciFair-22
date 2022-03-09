import java.io.*;
import java.util.*;

public class combine {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new FileReader("combine1.in"));
        PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter("combine.out")));
        List<String> c1 = new ArrayList<>();
        List<Double> c2 = new ArrayList<>();
        for(int ii = 0; ii < 64; ii++) {
            c1.add(in.readLine());
        }
        in = new BufferedReader(new FileReader("combine2.in"));
        for(int ii = 0; ii < 64; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            double a = Double.parseDouble(pt.nextToken());
            double b = Double.parseDouble(pt.nextToken());
            double c = Double.parseDouble(pt.nextToken());
            a += .125;
            b += .125;
            c += .125;
            c2.add(a);
            c2.add(b);
            c2.add(c);
        }
        int trck = 0;
        for(int ii = 0; ii < 4; ii++) {
            for(int i = 0; i < 16; i++) {
                out.println(c1.get(i));
            }
            for(int p = 0; p < 16; p++) {
                for(int pp = 0; pp < 3; pp++) {
                    out.print(c2.get(trck) + " ");
                    trck += 1;
                }
                out.println();
            }
        }
        in.close();
        out.close();
    }
}

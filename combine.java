import java.io.*;
import java.util.*;
//takes input of two files (can be same or different combinations), add .125 to the second file, output 128 coordinates (first 32 are all 1, next 32 are all 2, etc), insert into POSCAR
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
        int trck1 = 0;
        int trck2 = 0;
        for(int ii = 0; ii < 4; ii++) {
            for(int i = 0; i < 16; i++) {
                out.println(c1.get(trck1));
                trck1 += 1;
            }
            for(int p = 0; p < 16; p++) {
                for(int pp = 0; pp < 3; pp++) {
                    out.print(c2.get(trck2) + " ");
                    trck2 += 1;
                }
                out.println();
            }
        }
        in.close();
        out.close();
    }
}

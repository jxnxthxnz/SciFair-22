import java.io.*;
import java.util.*;
//sort coordinates (first 16 lines is for 1, next 16 is for 2, etc)
public class xyzSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("xyzSorted.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("xyzSorted.out")));

        for(int ii = 0; ii < 64; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            int num = Integer.parseInt(pt.nextToken());
            double x = Double.parseDouble(pt.nextToken());
            double y = Double.parseDouble(pt.nextToken());
            double z = Double.parseDouble(pt.nextToken());
            if(num == 1) {
                out.println(x + " " + y + " " + z);
            }
        }
        in = new BufferedReader(new FileReader("xyzSorted.in"));
        for(int ii = 0; ii < 64; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            int num = Integer.parseInt(pt.nextToken());
            double x = Double.parseDouble(pt.nextToken());
            double y = Double.parseDouble(pt.nextToken());
            double z = Double.parseDouble(pt.nextToken());
            if(num == 2) {
                out.println(x + " " + y + " " + z);
            }
        }
        in = new BufferedReader(new FileReader("xyzSorted.in"));
        for(int ii = 0; ii < 64; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            int num = Integer.parseInt(pt.nextToken());
            double x = Double.parseDouble(pt.nextToken());
            double y = Double.parseDouble(pt.nextToken());
            double z = Double.parseDouble(pt.nextToken());
            if(num == 3) {
                out.println(x + " " + y + " " + z);
            }
        }
        in = new BufferedReader(new FileReader("xyzSorted.in"));
        for(int ii = 0; ii < 64; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            int num = Integer.parseInt(pt.nextToken());
            double x = Double.parseDouble(pt.nextToken());
            double y = Double.parseDouble(pt.nextToken());
            double z = Double.parseDouble(pt.nextToken());
            if(num == 4) {
                out.println(x + " " + y + " " + z);
            }
        }

        in.close();
        out.close();

    }
}

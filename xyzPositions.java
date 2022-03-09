import java.io.*;
import java.util.*;

public class xyzPositions {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("xyzPositions.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("xyzPositions.out")));
        int[][] s1 = new int[4][4];//base
        int[][] s2 = new int[4][3];//4x4 attached to base, s2-s5
        int[][] s3 = new int[4][3];
        int[][] s4 = new int[4][3];
        int[][] s5 = new int[4][3];

        for(int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for(int i = 0; i < 4; i++) {
                s1[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }

        for(int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for(int i = 0; i < 3; i++) {
                s2[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }

        for(int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for(int i = 0; i < 3; i++) {
                s3[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }

        for(int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for(int i = 0; i < 3; i++) {
                s4[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }

        for(int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for(int i = 0; i < 3; i++) {
                s5[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }

        double x = 0;
        double y = 0;
        double z = 0;

        for(int ii = 3; ii >= 0; ii--) { //s1
            x = 0;
            for(int i = 0; i < 4; i++) {
                //out.println(s1[ii][i] + "," + " " + "(" + x + "," + " " + y + "," + " " + z + ")");
                out.println(s1[ii][i] + " " + x + " " + y + " " + z);
                x += 0.25;
            }
            y += 0.25;
        }
        //out.println();
        x = 0;
        y = 0;
        z = .25;

        for(int ii = 3; ii >= 0; ii--) { //s2
            z = .25;
            for(int i = 0; i < 3; i++) {
                //out.println(s2[ii][i] + "," + " " + "(" + x + "," + " " + y + "," + " " + z + ")");
                out.println(s2[ii][i] + " " + x + " " + y + " " + z);
                z += .25;
            }
            y += .25;
        }
        //out.println();
        x = .25;
        y = 0;
        z = .25;

        for(int ii = 3; ii >= 0; ii--) {//s3
            z = .25;
            for(int i = 0; i < 3; i++) {
                //out.println(s3[ii][i] + "," + " " + "(" + x + "," + " " + y + "," + " " + z + ")");
                out.println(s3[ii][i] + " " + x + " " + y + " " + z);
                z += .25;
            }
            y += .25;
        }
        //out.println();
        x = .5;
        y = 0;
        z = .25;

        for(int ii = 3; ii >= 0; ii--) {//s4
            z = .25;
            for(int i = 0; i < 3; i++) {
                //out.println(s4[ii][i] + "," + " " + "(" + x + "," + " " + y + "," + " " + z + ")");
                out.println(s4[ii][i] + " " + x + " " + y + " " + z);
                z += .25;
            }
            y += .25;
        }
        //out.println();
        x = .75;
        y = 0;
        z = .25;

        for(int ii = 3; ii >= 0; ii--) {//s5
            z = .25;
            for(int i = 0; i < 3; i++) {
                //out.println(s5[ii][i] + "," + " " + "(" + x + "," + " " + y + "," + " " + z + ")");
                out.println(s5[ii][i] + " " + x + " " + y + " " + z);
                z += .25;
            }
            y += .25;
        }


        in.close();
        out.close();
    }
}

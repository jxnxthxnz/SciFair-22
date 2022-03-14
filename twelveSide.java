import java.io.*;
import java.util.*;

public class twelveSide {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("twelveSide.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("twelveSide.out")));
        int[][] s1 = new int[4][4];// base
        int[][] s2 = new int[4][3];// 4x4 attached to base, s2-s5
        int[][] s3 = new int[4][3];
        int[][] s4 = new int[4][3];
        int[][] s5 = new int[4][3];
        for (int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for (int i = 0; i < 4; i++) {
                s1[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }
        for (int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for (int i = 0; i < 3; i++) {
                s2[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }
        for (int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for (int i = 0; i < 3; i++) {
                s3[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }
        for (int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for (int i = 0; i < 3; i++) {
                s4[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }
        for (int ii = 0; ii < 4; ii++) {
            StringTokenizer pt = new StringTokenizer(in.readLine());
            for (int i = 0; i < 3; i++) {
                s5[ii][i] = Integer.parseInt(pt.nextToken());
            }
        }

        // move back z-direction, front to back
        for (int ii = 0; ii < 4; ii++) {
            for (int i = 0; i < 4; i++) {
                out.print(s1[ii][i] + " ");
            }
            out.println("");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.println(s2[ii][0] + " " + s3[ii][0] + " " + s4[ii][0] + " " + s5[ii][0]);
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.println(s2[ii][1] + " " + s3[ii][1] + " " + s4[ii][1] + " " + s5[ii][1]);
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.println(s2[ii][2] + " " + s3[ii][2] + " " + s4[ii][2] + " " + s5[ii][2]);
        }
        out.println("");
        // move in x-direction, left to right
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[ii][0] + " ");
            for (int i = 0; i < 3; i++) {
                out.print(s2[ii][i] + " ");
            }
            out.println(" ");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[ii][1] + " ");
            for (int i = 0; i < 3; i++) {
                out.print(s3[ii][i] + " ");
            }
            out.println(" ");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[ii][2] + " ");
            for (int i = 0; i < 3; i++) {
                out.print(s4[ii][i] + " ");
            }
            out.println(" ");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[ii][3] + " ");
            for (int i = 0; i < 3; i++) {
                out.print(s5[ii][i] + " ");
            }
            out.println(" ");
        }
        out.println("");
        // move in y-direction, top to bottom
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[0][ii] + " ");
            if (ii == 0) {
                out.print(s2[0][0] + " " + s2[0][1] + " " + s2[0][2] + " ");
            } else if (ii == 1) {
                out.print(s3[0][0] + " " + s3[0][1] + " " + s3[0][2] + " ");
            } else if (ii == 2) {
                out.print(s4[0][0] + " " + s4[0][1] + " " + s4[0][2] + " ");
            } else if (ii == 3) {
                out.print(s5[0][0] + " " + s5[0][1] + " " + s5[0][2] + " ");
            }
            out.println("");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[1][ii] + " ");
            if (ii == 0) {
                out.print(s2[1][0] + " " + s2[1][1] + " " + s2[1][2] + " ");
            } else if (ii == 1) {
                out.print(s3[1][0] + " " + s3[1][1] + " " + s3[1][2] + " ");
            } else if (ii == 2) {
                out.print(s4[1][0] + " " + s4[1][1] + " " + s4[1][2] + " ");
            } else if (ii == 3) {
                out.print(s5[1][0] + " " + s5[1][1] + " " + s5[1][2] + " ");
            }
            out.println("");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[2][ii] + " ");
            if (ii == 0) {
                out.print(s2[2][0] + " " + s2[2][1] + " " + s2[2][2] + " ");
            } else if (ii == 1) {
                out.print(s3[2][0] + " " + s3[2][1] + " " + s3[2][2] + " ");
            } else if (ii == 2) {
                out.print(s4[2][0] + " " + s4[2][1] + " " + s4[2][2] + " ");
            } else if (ii == 3) {
                out.print(s5[2][0] + " " + s5[2][1] + " " + s5[2][2] + " ");
            }
            out.println("");
        }
        out.println("");
        for (int ii = 0; ii < 4; ii++) {
            out.print(s1[3][ii] + " ");
            if (ii == 0) {
                out.print(s2[3][0] + " " + s2[3][1] + " " + s2[3][2] + " ");
            } else if (ii == 1) {
                out.print(s3[3][0] + " " + s3[3][1] + " " + s3[3][2] + " ");
            } else if (ii == 2) {
                out.print(s4[3][0] + " " + s4[3][1] + " " + s4[3][2] + " ");
            } else if (ii == 3) {
                out.print(s5[3][0] + " " + s5[3][1] + " " + s5[3][2] + " ");
            }
            out.println("");
        }
        out.println("");

        in.close();
        out.close();
    }
}

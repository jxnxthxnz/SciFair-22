import java.io.*;
import java.util.*;

public class sudoku3 {
    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    int[][] s1 = new int[4][4];//base
    int[][] s2 = new int[4][3];//4x4 attached to base, s2-s5
    int[][] s3 = new int[4][3];
    int[][] s4 = new int[4][3];
    int[][] s5 = new int[4][3];
    int min = 1;
    int max = 4;
    int a = 0;//a and b pair
    int b = 0;
    int c = 0;//c and d pair
    int d = 0;
    int random = (int) Math.floor(Math.random() * (max - min + 1) + min);//generate random int from 1-4
    //set a,b,c,d to different random ints
    a = random;
    random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    while(random == a) {
        random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    b = random;
    random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    while(random == a || random == b) {
        random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    c = random;
    random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    while(random == a || random == b || random == c) {
        random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    d = random;

    //input ints into base side
    s1[0][0] = a;
    s1[1][1] = a; 
    s1[0][1] = b;
    s1[1][0] = b;

    s1[2][2] = a;
    s1[3][3] = a;
    s1[2][3] = b;
    s1[3][2] = b;

    s1[0][2] = c;
    s1[1][3] = c; 
    s1[0][3] = d;
    s1[1][2] = d;
    s1[3][1] = c;
    
    s1[3][1] = c;
    s1[2][1] = d;
    s1[3][0] = d;
    s1[2][0] = c;

    //s2
    s2[0][0] = b;
    s2[1][0] = a;
    s2[2][1] = b;
    s2[3][2] = b;
    s2[2][2] = a;
    s2[3][1] = a;

    s2[0][1] = d;
    s2[1][2] = d;
    s2[0][2] = c;
    s2[1][1] = c;
    s2[2][0] = d;
    s2[3][0] = c;

    //s3
    s3[0][0] = a;
    s3[1][0] = b;
    s3[2][1] = a;
    s3[3][2] = a;
    s3[2][2] = b;
    s3[3][1] = b;

    s3[0][1] = c;
    s3[1][2] = c;
    s3[0][2] = d;
    s3[1][1] = d;
    s3[2][0] = c;
    s3[3][0] = d;

    //s4
    s4[0][0] = d;
    s4[1][0] = c;
    s4[2][1] = c;
    s4[3][2] = c;
    s4[2][2] = d;
    s4[3][1] = d;

    s4[0][1] = a;
    s4[1][2] = a;
    s4[0][2] = b;
    s4[1][1] = b;
    s4[2][0] = b;
    s4[3][0] = a;

     //s5
     s5[0][0] = c;
     s5[1][0] = d;
     s5[2][1] = d;
     s5[3][2] = d;
     s5[2][2] = c;
     s5[3][1] = c;
 
     s5[0][1] = b;
     s5[1][2] = b;
     s5[0][2] = a;
     s5[1][1] = a;
     s5[2][0] = a;
     s5[3][0] = b;

     for(int ii = 0; ii < 4; ii++) {
         for(int i = 0; i < 4; i++) {
             out.print(s1[ii][i] + " ");
         }
         out.println();
     }

     //out.println();

     for(int ii = 0; ii < 4; ii++) {
        for(int i = 0; i < 3; i++) {
            out.print(s2[ii][i] + " ");
        }
        out.println();
    }

    //out.println();

    for(int ii = 0; ii < 4; ii++) {
        for(int i = 0; i < 3; i++) {
            out.print(s3[ii][i] + " ");
        }
        out.println();
    }

    //out.println();

    for(int ii = 0; ii < 4; ii++) {
        for(int i = 0; i < 3; i++) {
            out.print(s4[ii][i] + " ");
        }
        out.println();
    }
    
    //out.println();

    for(int ii = 0; ii < 4; ii++) {
        for(int i = 0; i < 3; i++) {
            out.print(s5[ii][i] + " ");
        }
        out.println();
    }
     in.close();
     out.close();
    }

}

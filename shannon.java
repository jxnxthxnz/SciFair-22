import java.io.*;
import java.util.*;

public class shannon {
    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader("shannon.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shannon.out")));
    double ans = 0;
    for(int ii = 0; ii < 12; ii++) {
        StringTokenizer pt = new StringTokenizer(in.readLine());
        List<Double> nums = new ArrayList<>();
        double sum = 0;
        nums.add(Double.parseDouble(pt.nextToken()));
        nums.add(Double.parseDouble(pt.nextToken()));
        nums.add(Double.parseDouble(pt.nextToken()));
        nums.add(Double.parseDouble(pt.nextToken()));
        for(int p = 0; p < 4; p++) {
            sum += nums.get(p);
            //out.println(nums.get(p));
        }
        for(int i = 0; i < 4; i++) {
            double x = 0;
            if(nums.get(i) != 0) {
                x = nums.get(i) / sum;
            }
            double next = 0;
            if(x != 0) {
                next = x * (Math.log(x) / Math.log(2));
            }
            ans += next;
        }
    }
    ans /= -12.0;

    out.println(ans);
    in.close();
    out.close();
    }
}
// This is about operators
//https://www.geeksforgeeks.org/convert-double-to-integer-in-java/

/*This is Day2 of 30 days of code*/
import java.io.*;


public class Day2 {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip=(tip_percent*meal_cost/100);
        double tax=(tax_percent*meal_cost/100);
        System.out.println(Math.round(meal_cost+tip+tax));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        solve(meal_cost, tip_percent, tax_percent);
    }
}



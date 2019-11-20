import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static int[] permutationEquation(int[] p) {
        int sA[]=p.clone();
        Arrays.sort(sA);
//        for(int i:sA)
//            System.out.println(i);
        int finall[]=new int[p.length];
        int first=0;
        for(int i=0;i<sA.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(sA[i]==p[j])
                {
                    first=j+1;
                    for(int k=0;k<p.length;k++)
                    {
                        if(p[k]==first) {
                            finall[i] = k + 1;
                            break;
                        }

                    }

                }
            }

        }
        return finall;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


import java.io.*;

public class EX3_Uriage {
    public static void main(String[] args) throws IOException {
        int num, price;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("数量？ ");
        num = Integer.parseInt(br.readLine());
        System.out.print("単価？ ");
        price = Integer.parseInt(br.readLine());
        System.out.println("\n売上 = " + (num * price));
    }
}
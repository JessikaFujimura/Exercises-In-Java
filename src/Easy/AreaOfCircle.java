package Easy;

import java.util.Locale;
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        double pi = Double.parseDouble(String.format("%.5f", Math.PI));

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = (Math.pow(radius, 2) * pi);
        System.out.println("A=" + String.format("%.4f", area));
        sc.close();
    }

}

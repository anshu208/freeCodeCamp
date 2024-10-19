import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        String sk[] = str.split(" ");

        for (int i = 0; i<sk.length; i++){
            rev = sk[i] +" " + rev;

        }

        System.out.println(rev);

    }
}

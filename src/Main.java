import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner alici = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String str = alici.next();
        int i = 0;
        int j = str.length()-1;
        if (str.charAt(i)==str.charAt(j)){
            System.out.print(str + " bir palndrom kelimedir");
        }
        else {
            System.out.println(str + " Bir palndrom kelime değidlir");
        }
    }
}

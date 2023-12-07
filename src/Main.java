import java.util.Scanner;

public class Main {
    static int pattern(int N, boolean control, int flag){
        if (control){
            if (N>0){
                System.out.print(N+" ");
                flag++;
                return pattern(N-5,true,flag);
            }else {
                return pattern(N, false, flag);
            }
        }else {
            System.out.print(N+" ");
            if (flag>0) {
                flag--;
                return pattern(N + 5, false, flag);
            }else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("--> Recursive İle Desen Oluştur <--");
        System.out.println("=================================================");
        System.out.print("Lütfen Bir Değer Giriniz : ");
        int number = scan.nextInt();
        System.out.println("=================================================");
        System.out.println(pattern(number,true,0));
        System.out.println("=================================================");
    }
}
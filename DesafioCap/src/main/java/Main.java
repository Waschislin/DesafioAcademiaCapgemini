import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Escreva um numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> escada = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            escada.add(" ".repeat(n - i) + "*".repeat(i));
        }
        for(String degrau: escada){
            System.out.println(degrau);
        }
    }
}

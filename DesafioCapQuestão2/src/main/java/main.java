import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        String regexEspecial = "((?=.*[!@#$%^&*()-+])[a-zA-Z0-9!@#$%^&*()-+]+)";
        String regexNumero ="((?=.*[0-9])[a-zA-Z0-9!@#$%^&*()-+]+)";
        String regexMinusculo = "((?=.*[a-z])[a-zA-Z0-9!@#$%^&*()-+]+)";
        String regexMaiusculo = "((?=.*[A-Z])[a-zA-Z0-9!@#$%^&*()-+]+)";

        int contador = 0;
        int diferencaTamanho = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Insira a sua Senha: ");
        String senha = sc.next();

       if(!senha.matches(regexNumero)){
           contador++;
        }
        if(!senha.matches(regexMinusculo)){
            contador++;
        }
        if(!senha.matches(regexMaiusculo)){
            contador++;
        }
        if(!senha.matches(regexEspecial)){
            contador++;
        }
        if(senha.length() >= 6){
            System.out.println("Faltam essa quantidade de caracteres: " + contador);
        }else{
            diferencaTamanho = 6 - senha.length();
            if(diferencaTamanho < contador){
                System.out.println("Faltam essa quantidade de caracteres: " + contador);
            }else{
                System.out.println(diferencaTamanho);
            }
        }
    }
}

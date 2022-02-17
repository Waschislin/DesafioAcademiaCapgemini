import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a palavra a ser testada: ");
        String entrada = sc.next();
        System.out.println("Quantidades de anagramas: " + calculaSubstring(entrada));
    }

    public static boolean anagrama(String a, String b){

        char[] stringA = a.toCharArray();
        char[] stringB = b.toCharArray();

        Arrays.sort(stringA);
        Arrays.sort(stringB);
        return Arrays.equals(stringA,stringB);
    }

    public static int  calculaSubstring(String texto){
        int contador = 0;
        for (int i = 1; i < texto.length(); i++){
            for (int j = 0; j < texto.length(); j++){
                for(int k = j + 1; k < texto.length(); k++){
                    if(j + i  <= texto.length() && k + i <= texto.length()){
                        if(j == k  && i+j == i+k){

                        }else{
                            if(anagrama(texto.substring(j, i + j), texto.substring(k, i + k))){
                                contador++;
                            }
                        }
                    }
                }
            }
        }
        return contador;
    }
}









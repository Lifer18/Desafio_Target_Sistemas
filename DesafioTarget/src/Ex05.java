import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String palavra, invertida;

        char c;

        System.out.println("Insira a palavra a ser invertida:");
        palavra = sc.nextLine();


        
        char[] letras = palavra.toCharArray();
        int n = letras.length;
        System.out.println(n);

        for(int i = 0; i < n/2 ; i++){
            c = letras[i];
            letras[i] = letras[n-i-1];
            letras[n-i-1] = c;
        }

        invertida = new String(letras);

        System.out.println(invertida);


        sc.close();
    }
}

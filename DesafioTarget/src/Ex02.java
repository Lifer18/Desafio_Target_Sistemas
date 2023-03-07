import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 1, num3 = 0, valor;
        
        String palavra, invertida;

        char c;

        System.out.println("Insira o numero a ser buscado:");
        valor = sc.nextInt();

        if((valor == 0) || (valor == 1)){
            System.out.println("O numero "+valor+" pertence a sequencia de Fibonacci!");
        }
        else{
            while(num2 < valor){
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }
        
        if (valor == num2){
            System.out.println("O numero "+valor+" pertence a sequencia de Fibonacci!");
        }
        else{
            System.out.println("O numero "+valor+" nao pertence a sequencia de Fibonacci!");
        }
        

        System.out.println("Insira a palavra a ser invertida:");
        palavra = sc.nextLine();


        
        char[] letras = palavra.toCharArray();
        int n = letras.length;

        for(int i = 0; i < n ; i++){
            c = letras[i];
            letras[i] = letras[n-i-1];
            letras[n-i-1] = c;
        }

        invertida = new String(letras);

        System.out.println(invertida);


        sc.close();
    }
}

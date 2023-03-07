import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, c = 0, valor;

        System.out.println("Insira o numero a ser buscado:");
        valor = sc.nextInt();

        if((valor == 0) || (valor == 1)){
            System.out.println("O numero "+valor+" pertence a sequencia de Fibonacci!");
        }
        else{
            while(b < valor){
                c = a + b;
                a = b;
                b = c;
            }
        }
        
        if (valor == b){
            System.out.println("O numero "+valor+" pertence a sequencia de Fibonacci!");
        }
        else{
            System.out.println("O numero "+valor+" nao pertence a sequencia de Fibonacci!");
        }
        sc.close();
    }
}

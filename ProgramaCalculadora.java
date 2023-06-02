import java.util.Scanner;

public class ProgramaCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(); 
        String encerrarCalculadora = "";
        
        System.out.println("Programa Calculadora");

        while (!encerrarCalculadora.equalsIgnoreCase("Q")) { 
            System.out.println("Informe o primeiro número:");
            calculadora.setNumeroUm(sc.nextDouble()); 

            System.out.println("Informe o segundo número:");
            calculadora.setNumeroDois(sc.nextDouble()); 
        
            System.out.println("Escolha a operação que deseja realizar:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raíz Quadrada do primeiro número");
                       
            int operacao = sc.nextInt();
            sc.nextLine(); 

            calculadora.realizarOperacao(operacao);
                        
            System.out.println("Pressione 'Q' para sair ou a tecla 'ENTER' para continuar:"); 
            encerrarCalculadora = sc.nextLine();
        }    
        System.out.println("Programa Encerrado.");
        sc.close();
    }
}



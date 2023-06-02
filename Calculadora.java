public class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public double getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public void realizarOperacao(int operacao) {
        double resultado;
    
        switch (operacao) {
            case 1:
                resultado = somar();
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = subtrair();
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = multiplicar();
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (numeroDois == 0) {
                    System.out.println("Impossível realizar uma divisão por zero.");        
                } else {    
                    resultado = dividir();
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case 5:
                if (numeroDois == 0) {
                    resultado = 1;
                    System.out.println("Resultado:" + resultado);
                } else {   
                    resultado = potencia();
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case 6:
                if (numeroUm < 0) {
                    System.out.println("Não existe raiz de número negativo.");
                } else {    
                    resultado = raizNumeroUm();
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }
    
    public double dividir() {
        
        return numeroUm / numeroDois;
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }
    
    public double raizNumeroUm() {
        return Math.sqrt(numeroUm);
    }
}

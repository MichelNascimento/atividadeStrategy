package operation;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        calculadora.setA(10);
        calculadora.setB(15);

        Adicao adicao = new Adicao();

        calculadora.setOperacao(adicao);

        System.out.println("O resultado é: " + calculadora.Calculo());
        System.out.println(calculadora.Status());
    }
    
}

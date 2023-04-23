package strategy;

public class Main {
    public static void main(String[] args) {
        
    Disciplina disciplina = new Disciplina();
    Aritmetica aritmetica = new Aritmetica();
    Geometrica geometrica = new Geometrica();

    disciplina.setNome("Padroes de Desenvolvimento");
    disciplina.setP1(10); 
    disciplina.setP2(5);
    disciplina.setCalcMedia(aritmetica);
    
    System.out.println("Nome: " +  disciplina.getNome());
    System.out.println("P1: " +  disciplina.getP1());
    System.out.println("P2: " + disciplina.getP2());
    System.out.printf("Media: %.2f \n", disciplina.calculaMedia()); 
    System.out.println("Situacao: " + disciplina.getSituacao()); 
    }    
}

package strategy;

public class Main {
    public static void main(String[] args) {
        
    Disciplina d = new Disciplina();
    Aritmetica a = new Aritmetica();
    Geometrica g = new Geometrica();

    d.setNome("Padroes de Desenvolvimento");
    d.setP1(10); 
    d.setP2(5);
    d.setCalcMedia(g);
    
    /*System.out.println("Nome: " +  d.getNome());
    System.out.println("P1: " +  d.getP1());
    System.out.println("P2: " + d.getP2());
    System.out.printf("Media: %.2f \n", d.calculaMedia()); 
    System.out.println("Situacao: " + d.getSituacao()); */

System.out.println(
    String.format("P1:%.2f P2:%.2f MEDIA:%.2f Situacao: %s",
    d.getP1(), d.getP2(), d.getcalculaMedia(), d.getSituacao())
);
    }    
}

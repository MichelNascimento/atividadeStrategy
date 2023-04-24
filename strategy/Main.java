package strategy;

public class Main {
    public static void main(String[] args) {
        
        Disciplina d = new Disciplina();
        Aritmetica a = new Aritmetica();
        Geometrica g = new Geometrica();

        d.setNome("Padroes de Desenvolvimento");
        d.setP1(5); 
        d.setP2(5);
        d.setCalcMedia(a);    

        System.out.println(
            String.format("P1:%.2f P2:%.2f MEDIA:%.2f Situacao: %s",
            d.getP1(), d.getP2(), d.getcalculaMedia(), d.getSituacao())
        );
    }    
}

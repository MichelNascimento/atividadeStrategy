package strategy;

public class Geometrica implements ICalcMedia{

    private double media;

    @Override
    public double calculaMedia(double p1, double p2) {
        media =  Math.sqrt(p1 * p2)/2 ;
        return media;
    }

    @Override
    public String situacao() {
        return media >= 6 ? "Aprovado" : "Rewprovado";
    }
    
}

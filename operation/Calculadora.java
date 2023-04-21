package operation;

public class Calculadora {
    private IOperacao Operacao;

    private int a, b;

    public void setOperacao(IOperacao operacao){
        Operacao = operacao;
    }
    public IOperacao getOperacao(){
        return Operacao;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int Calculo(){
        return this.Operacao.Calcular(this.a, this.b);
    }
    public String Status(){
        return this.Operacao.Descricao();
    }




    
}

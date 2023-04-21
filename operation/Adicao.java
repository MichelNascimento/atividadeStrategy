package operation;

public class Adicao implements IOperacao {

    @Override
    public int Calcular(int a, int b) {
        return a + b;
    }

    @Override
    public String Descricao() {
        return "Operacão Adição";
    }

}

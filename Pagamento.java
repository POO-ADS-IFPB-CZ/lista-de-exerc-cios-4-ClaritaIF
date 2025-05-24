public abstract class Pagamento {
    public abstract void processar(double valor);
}

public class CartaoCredito extends Pagamento {
    private final double taxa = 0.03; // 3% de taxa

    @Override
    public void processar(double valor) {
        double valorFinal = valor + (valor * taxa);
        System.out.printf("Pagamento com Cartão de Crédito: R$ %.2f (com taxa de 3%%)%n", valorFinal);
    }
}

public class Boleto extends Pagamento {
    private final double desconto = 0.05; // 5% de desconto

    @Override
    public void processar(double valor) {
        double valorFinal = valor - (valor * desconto);
        System.out.printf("Pagamento com Boleto: R$ %.2f (com 5%% de desconto)%n", valorFinal);
    }
}
public class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento com Pix: R$ %.2f (sem taxa)%n", valor);
    }
}


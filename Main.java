public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Boleto();
        Pagamento pagamento3 = new Pix();

        double valor = 100.0;

        pagamento1.processar(valor);
        pagamento2.processar(valor);
        pagamento3.processar(valor);
    }
}
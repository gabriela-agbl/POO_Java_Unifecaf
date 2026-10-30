public class Main {
    public static void main(String[] args){
        SistemaAntigo antigo = new SistemaAntigo();

        Pagamento pagamento = new PagamentoAdapter(antigo);

        pagamento.pagar(600.00);
    }
}

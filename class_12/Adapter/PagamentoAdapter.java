public class PagamentoAdapter implements Pagamento{
    private SistemaAntigo antigo;

    public PagamentoAdapter(SistemaAntigo antigo){
        this.antigo = antigo;
    }

    @Override
    public void pagar(double valor){
        antigo.realizar_transacao(valor);
    }
}

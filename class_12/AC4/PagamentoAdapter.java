public class PagamentoAdapter implements Pagamento{
    PagamentoLegado legado;

    public PagamentoAdapter(PagamentoLegado legado){
        this.legado = legado;
    }

    @Override
    public void pagar(double valor){
        double centavos = valor * 100;
        legado.executarCobranca(centavos);
    }
}

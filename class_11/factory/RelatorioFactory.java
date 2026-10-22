public abstract class RelatorioFactory {
    public abstract Relatorio criarRelatorio();

    public void processarRelatorio(){
        Relatorio relatorio = criarRelatorio();
        relatorio.gerar();
        System.out.println("Processamento concluído");
    }
}

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {
    private List<ObservadorTemperatura> temperaturas;

    public EstacaoMeteorologica(){
        this.temperaturas = new ArrayList<>();
    }

    public void armazenar_alerta(ObservadorTemperatura novaT){
        this.temperaturas.add(novaT);
    }

    public void notificarObservador(double temperatura){
        for(ObservadorTemperatura item : temperaturas){
            item.atualizar(temperatura);
        }
    }

    public void confirmarTemperatura(double temperatura){
        this.notificarObservador(temperatura);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private Expediente expedienteAbierto;
    private List<Expediente> listaExpedientes = new ArrayList<>();
    public Expediente getExpedienteAbierto() {
        return this.expedienteAbierto;
    }
    public void setExpedienteAbierto(Expediente e) {
        this.expedienteAbierto = e;
    }

    public List<Expediente> getListaExpedientes() {
        return listaExpedientes;
    }

    public void setListaExpediente(List<Expediente> listaExpedientes) {
        this.listaExpedientes = listaExpedientes;
    }

    //get expediente particular de la lista pasando por parametro el indice
    //lo mismo con el set (??)
}

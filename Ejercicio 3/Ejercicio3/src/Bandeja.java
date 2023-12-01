import java.util.List;
import java.util.ArrayList;

public class Bandeja {
    private int capacidad;
    private EstadoBandeja estado;
    private List<Pieza> piezas;

    public Bandeja(int capacidad)
    {
        this.capacidad = capacidad;
        this.estado = new EstadoEmpty();
        this.piezas = new ArrayList<Pieza>();

    }

    public void put(Pieza pieza)
    {
        this.estado.put(this, pieza);
    }

    public Pieza get()
    {
        return this.estado.get(this);
    }

    public List<Pieza> getPiezas()
    {
        return this.piezas;
    }

    public void setEstado(EstadoBandeja estado)
    {
        this.estado = estado;
    }

    public EstadoBandeja getEstado()
    {
        return this.estado;
    }

    public void setCapacidad(int value)
    {
        this.capacidad = value;
    }

    public int getCapacidad()
    {
        return this.capacidad;
    }
}

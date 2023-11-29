import java.util.ArrayList;
import java.util.List;

public class Bandeja {
    private enum status {Empty, Full, Normal};
    private int capacidad;
    private status estado;
    private List<Pieza> piezas;

    public Bandeja(int capacidad) {
        this.capacidad = capacidad;
        estado = status.Empty;
        piezas = new ArrayList<Pieza>();
    }

    public void put (Pieza item)
    {
        if(estado == status.Normal || estado == status.Empty)
        {
            if(capacidad == 1)
            {
                piezas.add(item);
                estado = status.Full;
            }
            else
            {
                piezas.add(item);
                estado = status.Normal;
            }
            capacidad--;
        }
    }

    public Pieza get ()
    {
        Pieza pieza = null;
        if(estado != status.Empty)
        {
            if(estado == status.Normal)
            {
                pieza = piezas.get(0);
                estado = (piezas.size() > 1) ? status.Normal : status.Empty;
            }
            else
            {
                pieza = piezas.get(0);
                estado = (piezas.size() > 1) ? status.Normal : status.Empty;
            }
            piezas.remove(0);
            capacidad++;
        }
        return pieza;
    }

    public int size ()
    {
        return piezas.size();
    }
}

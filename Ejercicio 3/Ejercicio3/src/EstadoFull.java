public class EstadoFull implements EstadoBandeja
{
    @Override
    public void put(Bandeja bandeja, Pieza pieza)
    {
        //No se puede añadir mas piezas a una bandeja vacia
    }

    @Override
    public Pieza get(Bandeja bandeja)
    {
        Pieza pieza = bandeja.getPiezas().get(0);
        if(bandeja.getPiezas().size() > 1) bandeja.setEstado(new EstadoNormal());
        else bandeja.setEstado(new EstadoEmpty());
        bandeja.setCapacidad(bandeja.getCapacidad() + 1);
        bandeja.getPiezas().remove(0);
        return pieza;
    }
}


public class EstadoNormal implements EstadoBandeja
{
    @Override
    public void put(Bandeja bandeja, Pieza pieza)
    {
        if(bandeja.getCapacidad() > 1) bandeja.setEstado(new EstadoNormal());
        else bandeja.setEstado(new EstadoFull());
        bandeja.getPiezas().add(pieza);
        bandeja.setCapacidad(bandeja.getCapacidad() - 1);
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


public class EstadoEmpty implements EstadoBandeja
{
    @Override
    public void put(Bandeja bandeja, Pieza pieza)
    {
        bandeja.getPiezas().add(pieza);
        if(bandeja.getCapacidad() != 1) bandeja.setEstado(new EstadoNormal());
        else bandeja.setEstado(new EstadoFull());
        bandeja.setCapacidad(bandeja.getCapacidad() - 1);
    }

    @Override
    public Pieza get(Bandeja bandeja)
    {
        //No se puede quitar piezas a una bandeja vacia
        return null;
    }
}

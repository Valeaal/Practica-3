public interface EstadoBandeja {
    void put(Bandeja bandeja, Pieza pieza);
    Pieza get (Bandeja bandeja);
}

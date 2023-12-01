public class Main {
    public static void main(String[] args) {
        Bandeja bandeja = new Bandeja(2);

        Pieza pieza1 = new Pieza();
        Pieza pieza2 = new Pieza();

        bandeja.put(pieza1);
        bandeja.put(pieza2);

        System.out.println("Piezas en la bandeja: " + bandeja.getPiezas().size() + "\t Estado: " + bandeja.getEstado().getClass().getSimpleName());

        Pieza piezaSacada = bandeja.get();
        System.out.println("Pieza sacada: " + piezaSacada.getClass().getSimpleName());
        System.out.println("Piezas en la bandeja: " + bandeja.getPiezas().size() + "\t Estado: " + bandeja.getEstado().getClass().getSimpleName());
    }
}

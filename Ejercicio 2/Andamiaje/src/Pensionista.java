public class Pensionista extends Trabajador{
    public Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
        super(nombre, numeroSeguridadSocial, salario);
    }

    @Override
    public void incrementar(){
        this.salario*=1.04;
    }
}

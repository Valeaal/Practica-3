public class MedioPensionista extends Trabajador {
    public MedioPensionista(String nombre, String numeroSeguridadSocial, double salario) {
        super(nombre, numeroSeguridadSocial, salario);
    }

    private Pensionista pensionista = new Pensionista(super.nombre,super.numeroSeguridadSocial,super.salario);
    private Activo activo = new Activo(super.nombre,super.numeroSeguridadSocial,super.salario);

    @Override
    public void incrementar(){
        pensionista.incrementar();
        activo.incrementar();
        this.salario = pensionista.nomina()+activo.nomina();
    }
}

public abstract class Trabajador {
    public Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
        this.nombre = nombre;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public String nombre;
    public String numeroSeguridadSocial;
    protected double salario;

    public double nomina(){
        return this.salario;
    }

    public abstract void incrementar();

}

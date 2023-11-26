import java.util.*;

public class Acceso {
	
	//Atributos propios de la clase
	private Date fecha;
	private TipoAcceso tipo;
	
	//Atributos referentes a otras clases
	private Profesional profesional;
	private Expediente expediente;
	
	public Acceso(Date fecha, TipoAcceso tipo, Profesional profesional, Expediente expediente) throws AssertionError{
		
		this.fecha = fecha;
		this.tipo = tipo;
		this.profesional = profesional;
		this.expediente = expediente;
		
		//[Restricción] Los campos no pueden ser nulos y el profesional y expediente son obligatorios
		assert(fecha != null && tipo != null && profesional != null && expediente != null);
		
		//Las clases con las que tiene relacion tambien tienen que actualizarse
		expediente.addAcceso(this);
		profesional.addAcceso(this);
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha){
		this.fecha = fecha;
	}

	public TipoAcceso getTipo() {
		return tipo;
	}

	public void setTipo(TipoAcceso tipo) {
		this.tipo = tipo;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}
}

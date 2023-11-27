import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Expediente {

	// Atributos referentes a otras clases
	private List<Acceso> accesos;
	private Paciente paciente;

	public Expediente(Paciente paciente) throws AssertionError {

		accesos = new ArrayList<>();
		this.paciente = paciente;

		// [Restricción] El paciente no puede ser ser nulo
		assert (paciente != null);

		// Las clases con las que tiene relacion tambien tienen que actualizarse
		paciente.addExpediente(this);
	}

	public Enumeration<Acceso> getAccesos(){
		return java.util.Collections.enumeration(accesos);
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) throws AssertionError {
		// [Restricción] El paciente no puede ser ser nulo
		assert (paciente != null);

		this.paciente = paciente;
	}

	protected void addAcceso(Acceso a) throws AssertionError {
		// [Restricción] El acceso no puede ser ser nulo
		assert (a != null);
		
		this.accesos.add(a);
	}

	protected void rmvAcceso(Acceso a) throws AssertionError {
		// [Restricción] El acceso no puede ser ser nulo
		assert (a != null);
		
		this.accesos.remove(a);
	}
}

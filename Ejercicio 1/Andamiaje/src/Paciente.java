import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {

	// Atributos referentes a otras clases
	private Expediente expedienteAbierto;
	private List<Expediente> expedientes;

	public Paciente(Expediente expediente) throws AssertionError {

		// expedienteAbierto no se inicializa, ya que puede ser nulo

		// No solo iniciamos el Array como en las demas clases, sino que como minimo debe de contener un expediente
		expedientes = new ArrayList<>();
		assert (expediente != null);
		expedientes.add(expediente);
	}

	public Expediente getExpedienteAbierto() {
		// Puede ser nulo
		return expedienteAbierto;
	}
	
	protected void addExpediente(Expediente e) throws AssertionError {
		// [Restricción] No tiene sentido agregar un expediente nulo
		assert (e != null);

		this.expedientes.add(e);
	}

	protected void rmvExpediente(Expediente e) throws AssertionError {
		// [Restricción] No tiene sentido que el expediente sea nulo
		assert (e != null);

		this.expedientes.remove(e);
	}

	public List<Expediente> getExpedientes() {
		return expedientes;
	}
	
	// No podemos abrir un expediente que no este en la lista de expedientes, por eso no hay un setExpedienteAbierto()
	public void abrirExpediente(Expediente e) throws AssertionError {
		// [Restricción] El expediente ya debe de estar en la lista de expedientes
		assert (e != null && expedientes.contains(e));
		expedienteAbierto = e;
	}

	public void cerrarExpediente() {
		expedienteAbierto = null;
	}

}

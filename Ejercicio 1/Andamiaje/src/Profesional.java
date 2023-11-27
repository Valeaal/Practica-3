import java.util.*;

public class Profesional {

	// Atributos referentes a otras clases
	private List<Acceso> accesos;
	
	public Profesional() throws AssertionError {
		accesos = new ArrayList<>();
	}
	
	public Enumeration<Acceso> getAccesos(){
		return java.util.Collections.enumeration(accesos);
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

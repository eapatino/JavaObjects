package Entity;

public class Cliente extends Persona{
	private String nombre;
	public String apellido;
	protected String documento;
   int saldo;
	
	public String getNombre() {
		String ap = apellido;
		if(ap.isEmpty()) {
			
		}
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String ap) {
		apellido = ap;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public boolean registrar() {
		///logica para registrar una factura en bd
		return true;
	}

}

package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;
import sooper.contenedores.Contenedor;

public abstract class Producto implements IProducto {
	private String referencia;
	private int peso;
	private int volumen;
	private IContenedor contenedor;
	
	public Producto(String referencia, int peso, int volumen) {
		this.referencia = referencia;
		this.peso = peso;
		this.volumen = volumen;
	}

	@Override
	public String getReferencia() {
		return this.referencia;
	}

	@Override
	public int getPeso() {
		return this.peso;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}


	@Override
	public boolean tengoEspacio(IContenedor contenedor) {
		return contenedor.volumenDisponible() > volumen;
	}
	
	@Override
	public String toString() {
		return "Producto [ categoria = " + getCategoria() + 
				", referencia = " + referencia + ", peso = " + peso + 
				", volumen = " + volumen + ", contenedor = " + contenedor.getReferencia() + " ]";
	}
	

	@Override
	public void meter(Contenedor contenedor) {
		this.contenedor = contenedor;
		
	}

}

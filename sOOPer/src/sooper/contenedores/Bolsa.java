package sooper.contenedores;

import java.time.LocalDate;

import sooper.Caducable;
import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor implements Caducable {
	
	private int ancho;
	private LocalDate fechaCompra;
	
	public Bolsa(String referencia, int alto, int ancho, int resistencia) {
		super(referencia, alto, resistencia);
		this.ancho = ancho;
		this.fechaCompra = LocalDate.now();
	}
	

	@Override
	public int getSuperficie() {
		int radio = getDiametro()/2;
		return (int) (Math.PI * radio * radio);
	}

	private int getDiametro() {
		return (int) ((2 * this.ancho) / Math.PI);
	}


	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}


	@Override
	public boolean estaCaducado() {
		return this.fechaCompra != LocalDate.now();
	}
	
}

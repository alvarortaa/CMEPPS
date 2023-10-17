package pkg;




import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private double saldo;
	private String nNumero;
	private String nTitular;
	
	List <Movimiento> mMovimientos = new ArrayList<>();
	
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.nNumero = numero;
		this.nTitular = titular;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public String getnNumero() {
		return nNumero;
	}

	public String getnTitular() {
		return nTitular;
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
		Movimiento movimiento = new Movimiento(i, "Ingreso");
		mMovimientos.add(movimiento);
		
	}

	public void retirar(double i) {
		if(this.getSaldo() - i <= this.getSaldo() && this.getSaldo() - i >= -500) //Comprobacion
			if(this.getSaldo() - i <= this.getSaldo() && this.getSaldo() - i >= -500)
			
			{
				this.setSaldo(this.getSaldo()-i);
				Movimiento movimiento = new Movimiento(i, "Retirada");
				mMovimientos.add(movimiento);
			}
		
	}
}

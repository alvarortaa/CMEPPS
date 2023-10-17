package pkg;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta(double saldo) {
		super();
		this.saldo=saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
		
	}

	public void retirar(double i) {
		if (i<=saldo)
		this.setSaldo(this.getSaldo()-i);
		
	}



}

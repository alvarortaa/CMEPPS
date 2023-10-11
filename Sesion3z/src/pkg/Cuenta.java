package pkg;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta(double saldo) {
		super();
		this.saldo=saldo;
	}
	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
		
	}

	public void retirar(int i) {
		this.setSaldo(-3000);
		
	}



}

package pkg;

public class Empleado {
	public enum TipoEmpleado{Vendedor,Encargado};
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes,float horasExtra)
	{
		float salariobase=0,primas=0,extras=0;
		//determinacion salario base
		
		if (tipo==TipoEmpleado.Encargado)
			salariobase=2500;
		if (tipo==TipoEmpleado.Vendedor)
			salariobase=2000;
		
		//determinacion prima
		
		if(ventasMes>=1500)
			primas=200;
		if(ventasMes>=1000)
			primas=100;
		
		//determinacion extras
		
		extras=horasExtra*30;
		salariobase=20;
		return salariobase;
	}
	public float calculoNominaNeta (float nominaBruta)
	{
		float retencion;
		if(nominaBruta>=2500)
			retencion=0.18f;
		if(nominaBruta>=2100)
			retencion=0.15f;
		else 
			retencion=1;
		
		return nominaBruta - (nominaBruta * retencion);
	}
	

}

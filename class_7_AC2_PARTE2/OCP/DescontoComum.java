public class DescontoComum implements Desconto{
	@Override
	public double calcular(double valor) {
		return valor * 0.05;
	}
}

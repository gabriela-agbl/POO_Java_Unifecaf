public class Main {

	public static void main(String[] args) {
		double valorCompra = 1000.00;
		
		CalcularDesconto desconto = new CalcularDesconto();
		DescontoComum comum = new DescontoComum();
		DescontoVip vip = new DescontoVip();
		
		double c = desconto.calcular(comum, valorCompra);
		double v = desconto.calcular(vip, valorCompra);
		
		System.out.printf("Desconto para cliente comum: %.2f%nDesconto para cliente VIP: %.2f%n", c, v);
	}

}

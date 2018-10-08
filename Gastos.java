public class Gastos{
	public static void main(String[]args){
		int gastosAlimentacao = 600;
		int gastoSaude = 1000;
		int gastoTransporte = 500;
		int gastoLazer = 400;
		int gastoTotal;	
		int mediaDeGastos;
				gastoTotal = gastosAlimentacao + gastoSaude + gastoTransporte + gastoLazer;
				mediaDeGastos = gastoTotal / 4;
			System.out.println("a media de gasto e "+ mediaDeGastos);
	}

}
package strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(TipoGratificacao.DBA, 3000, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		
		
	}
}
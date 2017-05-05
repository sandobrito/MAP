package strategy;

public class GratificacaoGerente implements Gratificacao{
	@Override
    public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel() >= 2) {
              return umFuncionario.getSalarioBase() * 1.35;
          }
          return umFuncionario.getSalarioBase() * 1.25;
    }
}

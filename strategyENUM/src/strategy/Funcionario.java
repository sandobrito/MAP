package strategy;

public class Funcionario {
	protected TipoGratificacao tipo;
	protected double salarioBase;
	protected int cargo;
    protected int nivel;
	protected Gratificacao estrategiaDeGratificacao;

	public Funcionario(TipoGratificacao tipoGratificacao, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		this.tipo = tipoGratificacao;
		
		
////		switch () {
////		case DESENVOLVEDOR:
////			estrategiaDeGratificacao = new GratificacaoDesenvolvedor();
////			cargo = DESENVOLVEDOR;
////			break;
////		case DBA:
////			estrategiaDeGratificacao = new GratificacaoDesenvolvedor();
////			cargo = DBA;
////			break;
////		case LIDER:
////			estrategiaDeGratificacao = new GratificacaoLider();
////			cargo = LIDER;
////			break;
////		case GERENTE:
////			estrategiaDeGratificacao = new GratificacaoGerente();
////			cargo = GERENTE;
////			break;
//		default:
//			throw new RuntimeException("Cargo não encontrado :/");
		}
	

	public Gratificacao calcularGratificacao() {
		return tipo.obterGratificacao();
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
}
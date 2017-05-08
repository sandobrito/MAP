package strategy;

public enum TipoGratificacao {

	GERENTE{
		@Override
		public Gratificacao obterGratificacao(){

			return new GratificacaoGerente();
		}
	},
	DESENVOLVEDOR{
		public Gratificacao obterGratificacao(){

			return new GratificacaoDesenvolvedor();
		}
	},
	LIDER{
		public Gratificacao obterGratificacao(){

			return new GratificacaoLider();
		}
	},
	DBA{
		public Gratificacao obterGratificacao(){

			return new GratificacaoDBA();
		}
	},;

	public Gratificacao obterGratificacao() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}

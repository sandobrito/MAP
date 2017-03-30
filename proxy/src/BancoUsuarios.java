
public class BancoUsuarios implements Banco{
	
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	
	public BancoUsuarios() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}

	@Override
	public String getNumeroDeUsuarios() {
		return new String("Total de usu�rios: " + quantidadeDeUsuarios);
	}

	@Override
	public String getUsuariosConectados() {
		return new String("Usu�rios conectados: " + usuariosConectados);
	}
}
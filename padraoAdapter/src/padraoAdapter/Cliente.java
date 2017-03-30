package padraoAdapter;

public class Cliente {
	public static void main(String[] args) {
		ImagemTarget imagem = new ImagemBmpAdapter();
		imagem.carregarImagem("teste.bmp");
		imagem.desenharImagem(0, 0, 10, 10);

		imagem = new ImagemPngAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		imagem = new ImagemJpegAdapter();
		imagem.carregarImagem("teste.jpeg");
		imagem.desenharImagem(0, 0, 10, 10);
	
	
	}
}

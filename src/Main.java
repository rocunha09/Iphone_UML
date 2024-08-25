import Models.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone primeiro = new Iphone();
		//iphone
		primeiro.setNumero("+5521999999999");
		
		//ITelefone
		primeiro.atender();
		
		//INavegador
		primeiro.abrirNovaAba();
		
		//IReproducao
		primeiro.selecionarMusica("Cool 9 - Joe Satriani");

	}

}

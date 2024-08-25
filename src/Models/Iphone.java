package Models;

import Models.Interfaces.INavegador;
import Models.Interfaces.IReproducao;
import Models.Interfaces.ITelefone;

public class Iphone implements INavegador, ITelefone, IReproducao {
	private String numero;
	
	public Iphone() {
	}
	
	public Iphone(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selecionarMusica(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void navegarPara(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void abrirNovaAba() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub

	}

}

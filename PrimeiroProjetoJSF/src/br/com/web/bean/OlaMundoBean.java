package br.com.web.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void enviar() {
		this.nome = getNome().toUpperCase();
	}
}

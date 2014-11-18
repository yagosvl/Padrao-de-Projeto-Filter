package br.com.control;

public class Carro implements Automovel{
	
	private String nome;
    private String combustivel;
    private String tipo;

    public Carro(String nome, String combustivel, String tipo) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getTipo() {
        return tipo;
    }

}

package br.edu.univas.vo;

public class Veiculo {
	private String cor;
	private int anoFabricação;
	private int anoModelo;
	private Motor motor;
	private int velocidadeAtual = 0;
	
	public void acelerar(int valor) {
		this.velocidadeAtual += valor;
	}
	
	public void frear(int valor) {
		this.velocidadeAtual -= valor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFabricação() {
		return anoFabricação;
	}
	public void setAnoFabricação(int anoFabricação) {
		this.anoFabricação = anoFabricação;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
}

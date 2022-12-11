package objetos;

public class Sintomas {
	private String nome;
	private String diaSemana;
	private String mes;
	
	public Sintomas(String nome, String diaSemana, String mes) {
		this.nome = nome;
		this.diaSemana = diaSemana;
		this.mes = mes;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDia() {
		return diaSemana;
	}
	public void setDia(String diaSemana) {
		this.diaSemana = diaSemana;
	} 
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
	           "Dia da Semana: " + diaSemana + "\n" + 
		       "Mês: " + mes;

    }
	
}

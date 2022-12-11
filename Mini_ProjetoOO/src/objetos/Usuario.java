package objetos;

public class Usuario {
	private String nome;
	private String dataNascimento;
	private String email;
	private String sexo;
	
	public Usuario(String nome, String sexo, String datadeNascimento, String email) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = datadeNascimento;
		this.email = email;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDatadeNascimento() {
		return dataNascimento;
	}
	public void setDatadeNascimento(String datadeNascimento) {
		this.dataNascimento = datadeNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
	           "Sexo: " + sexo + "\n" + 
			   "Data de Nascimento: " + dataNascimento + "\n" + 
	           "Email: " + email + "\n";

    }
}
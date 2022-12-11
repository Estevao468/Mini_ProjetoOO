package objetos;

	public abstract class Medicamentos{
		protected String nome;
		protected String marca;
		protected String frequencia;
		
	public Medicamentos(String nome, String marca, String frequencia) {
			
			this.nome = nome;
			this.marca = marca;
			this.frequencia = frequencia;

    }
	public Medicamentos(String nome, String marca) {
		
		this.nome = nome;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
   }
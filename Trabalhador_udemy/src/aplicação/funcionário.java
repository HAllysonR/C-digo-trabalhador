package aplicação;

public class funcionário {
	private String nome;
	private int HorasTrabalhadas;
	private Double ValorPorHora;

	public funcionário() {
	}

	public funcionário(String nome, int HorasTrabalhadas, double ValorPorHora) {
		this.nome = nome;
		this.HorasTrabalhadas = HorasTrabalhadas;
		this.ValorPorHora = ValorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorPorHora() {
		return ValorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		ValorPorHora = valorPorHora;
	}

	public double pagamento() {
		return HorasTrabalhadas * ValorPorHora;
	}

	public void verFuncionario() {
		System.out.println("Nome: " + this.getNome() + "\n" + "Valor por hora: " + this.getValorPorHora() + "\n"
				+ "Horas trabalhadas: " + this.getValorPorHora());
	}

}

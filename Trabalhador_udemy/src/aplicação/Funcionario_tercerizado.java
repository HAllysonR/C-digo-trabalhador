package aplicação;

public class Funcionario_tercerizado extends funcionário {
	private double adicional;

	public Funcionario_tercerizado() {
	}

	public Funcionario_tercerizado(String nome, int HorasTrabalhadas, double ValorPorHora, double addicional) {
		super(nome, HorasTrabalhadas, ValorPorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double addicional) {
		this.adicional = addicional;
	}

	// pagamento do tercerizado
	@Override
	public double pagamento() {
		return super.pagamento() + adicional * 1.1;

	}

	public void verFuncionario() {
		System.out.println("Nome: " + this.getNome() + "\n" + "Valor por hora: r$ " + this.getValorPorHora() + "\n"
				+ "Horas trabalhadas: r$ " + this.getHorasTrabalhadas() + "\n" + "Adicional: " + this.getAdicional());
	}

}

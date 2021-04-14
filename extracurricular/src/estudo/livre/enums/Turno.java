package estudo.livre.enums;

public enum Turno {

	MANHA("manha"),
	TARDE("tarde"),
	NOITE("noite");
	
	private String descricao;
	
	Turno(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}

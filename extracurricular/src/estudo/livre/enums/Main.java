package estudo.livre.enums;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso = new Curso();
		
		curso.setNome("Farmacia");
		curso.setHoras(3600);
		curso.setTurno(Turno.NOITE);
		
		System.out.println("Nome " + curso.getNome() + "\nHoras " + curso.getHoras() + "\nTurno " + curso.getTurno());
	}

}

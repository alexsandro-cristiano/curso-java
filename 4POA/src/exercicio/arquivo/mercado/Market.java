package exercicio.arquivo.mercado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Market {

	public Market() {
	}

	public void inserirProduto(String nome, String preco) {
		try {
			FileWriter fw = new FileWriter("D:\\temp-alex\\mercado.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(nome + "," + preco);
			bw.newLine();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String buscar(String preco) {
		FileReader fr;
		try {
			fr = new FileReader("D:\\temp-alex\\mercado.txt");
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String str = br.readLine();
				String lista[] = str.split(",");
				if (lista[1].equals(preco))
					return lista[0];
			}
			br.close();
			fr.close();
			return "";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "";
	}

	public void criar() {
		File f = new File("D:\\temp-alex");
		if(!f.exists()) {
			f.mkdir();
			System.out.println("criado diretorio");
		}
		
	}
}

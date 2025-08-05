import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class Biblioteca {
	private List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
		System.out.println("Livro adicionado com sucesso!");
	}

	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro na biblioteca!");
		}

		for (int i = 0; i < livros.size(); i++) {
			System.out.println(i + " - " + livros.get(i));
		}
	}

	public void emprestarLivro(int index) {
		if (index < 0 && index >= livros.size()) {
			System.out.println("Index inválido!");
			return;
		}

		Livro livro = livros.get(index);

		if (livro.isDisponivel()) {
			livro.emprestar();
			System.out.println("Livro emprestado com sucesso!");
		}


		System.out.println("Livro já está emprestado!");
	}

	public void devolverLivro(int index) {
		if (index < 0 && index >= livros.size()) {
			System.out.println("Index inválido!");
			return;
		}

		Livro livro = livros.get(index);

		if (!livro.isDisponivel()) {
			livro.devolver();
			System.out.println("Livro devolvido com sucesso!");
		}

		System.out.println("Esse livro não está emprestado!");
	}
}
import java.util.Scanner;

import model.Livro;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		int opcao, index;

		do {
			System.out.println("\n--- Sistema de Biblioteca ---");
			System.out.println("1. Adicionar Livro");
			System.out.println("2. Listar Livros");
			System.out.println("3. Emprestar Livro");
			System.out.println("4. Devolver Livro");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch(opcao){
				    case 1:
    				    System.out.print("Titulo:");
    				    String titulo = sc.nextLine();
    				    System.out.print("Autor: ");
    				    String autor = sc.nextLine();
    				    biblioteca.adicionarLivro(new Livro(titulo, autor));
    				    break;
				    case 2:
				        biblioteca.listarLivros();
				        break;
				    case 3:
				        biblioteca.listarLivros();
				        System.out.print("Digite o indice do livro para emprestar: ");
				        index = sc.nextInt();
				        biblioteca.emprestarLivro(index);
				        break;
				    case 4:
				        biblioteca.listarLivros();
				        System.out.print("Digite o index do livro para devolver: ");
				        index = sc.nextInt();
				        biblioteca.devolverLivro(index);
				        break;
				    case 0 :
				        System.out.println("Fechando sitema.........");
				        break;
				    default:
				        System.out.println("Opção Inválida!");
			}
		} while (opcao != 0);
		
		sc.close();
	}
}
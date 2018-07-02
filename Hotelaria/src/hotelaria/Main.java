package hotelaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<Hospedagem> hospedagens = new ArrayList<>();
		List<Hospede> hospedes = new ArrayList<Hospede>();
		List<Quarto> quartos = new ArrayList<Quarto>();
		List<CategoriaQuarto> categoriasQuarto = new ArrayList<CategoriaQuarto>();
		List<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();
		
		Scanner sc = new Scanner(System.in);
		boolean mainLoop = true;
		boolean innerLoop;
		
		while (mainLoop) {
			
			innerLoop = true;
			
			System.out.println("-- Hotelaria --");
			System.out.println("Selecione uma opção:");
			System.out.println(
					"1 - Gerenciar Hospedagens\n" +
					"2 - Gerenciar Hospedes\n" +
					"3 - Gerenciar Quartos\n" +
					"4 - Gerenciar Recepcionistas\n" +
					"0 - Sair");
			
			int opt = sc.nextInt();
			
			switch(opt) {
			case 0:
				mainLoop = false;
				break;
				
			case 1:
				while(innerLoop) {
					System.out.println("-- Gerenciar Hospedagens --");
					System.out.println(
							"1 - Adicionar Hospedagem\n" +
							"2 - Editar Hospesagem\n" +
							"3 - Remover Hospedagem\n" +
							"0 - sair");
					
					opt = sc.nextInt();
					
					switch(opt) {
					case 0:
						innerLoop = false;
						break;
						
					case 1:
						break;
						
					case 2:
						break;
						
					case 3:
						break;
						
					default:
						System.out.println("Opção Inválida");
						break;
					}
					
				}
				break;
				
			case 2:
				while(innerLoop) {
					System.out.println("-- Gerenciar Hóspedes --");
					System.out.println(
							"1 - Adicionar Hóspede\n" +
							"2 - Editar Hóspede\n" +
							"3 - Remover Hóspede\n" +
							"0 - sair");
					
					opt = sc.nextInt();
					
					switch(opt) {
					case 0:
						innerLoop = false;
						break;
						
					case 1:
						
						sc.nextLine();
						
						System.out.println("Nome do Hóspede");
						
						String nome = sc.nextLine();
						
						System.out.println("Conta Bancária:");
						String conta = sc.nextLine();
						
						Hospede hospede = new Hospede(conta, nome);
						hospedes.add(hospede);
						break;
						
					case 2:
						break;
						
					case 3:
						System.out.println("Qual Hóspede você deseja remover?");
						for(int i = 0; i < hospedes.size(); i++) {
							System.out.println(i + " - " + hospedes.get(i).getNome());
						}
						
						opt = sc.nextInt();
						
						if(opt >= 0 && opt < hospedes.size()) {
							hospedes.remove(opt);
							System.out.println("Hóspede removido com sucesso!");
						}else {
							System.out.println("Opção inválida");
						}
						
						break;
						
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;
				
			case 3:
				while(innerLoop) {
					System.out.println("-- Gerenciar Quartos --");
					System.out.println(
							"1 - Adicionar Quarto\n" +
							"2 - Editar Quarto\n" +
							"3 - Remover Quarto\n" +
							"4 - Adicionar Categoria de Quarto\n" +
							"5 - Editar Categoria de Quarto\n" +
							"6 - Remover Categoria de Quarto\n" +
							"0 - sair");
					
					opt = sc.nextInt();
					
					switch(opt) {
					case 0:
						innerLoop = false;
						break;
						
					case 1:
						Quarto quarto = new Quarto();
						int cat;
						
						System.out.println("Escolha uma categoria:");
						
						for(int i = 0; i < categoriasQuarto.size(); i++) {
							System.out.println(i + " - " + categoriasQuarto.get(i).getNome());
						}
						
						cat = sc.nextInt();
						
						quarto.setCategorias(categoriasQuarto.get(cat));
						
						
						break;
						
					case 2:
						break;
						
					case 3:
						break;
						
					case 4:
						sc.nextLine();
						
						System.out.println("Nome da Categoria");
						
						String nome = sc.nextLine();
						
						CategoriaQuarto categoriaQuarto = new CategoriaQuarto(nome);
						
						categoriasQuarto.add(categoriaQuarto);
						break;
						
					case 5:
						System.out.println("Qual Quarto você deseja remover?");
						for(int i = 0; i < quartos.size(); i++) {
							System.out.println(i);
						}
						
						opt = sc.nextInt();
						
						if(opt >= 0 && opt < quartos.size()) {
							quartos.remove(opt);
							System.out.println("Quarto removido com sucesso!");
						}else {
							System.out.println("Opção inválida");
						}
						break;
						
					case 6:
						System.out.println("Qual Categoria você deseja remover?");
						for(int i = 0; i < categoriasQuarto.size(); i++) {
							System.out.println(i + " - " + categoriasQuarto.get(i).getNome());
						}
						
						opt = sc.nextInt();
						
						if(opt >= 0 && opt < categoriasQuarto.size()) {
							categoriasQuarto.remove(opt);
							System.out.println("Categoria removido com sucesso!");
						}else {
							System.out.println("Opção inválida");
						}
						break;
						
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;
				
			case 4:
				while(innerLoop) {
					System.out.println("-- Gerenciar Recepcionistas --");
					System.out.println(
							"1 - Adicionar Recepcionista\n" +
							"2 - Editar Recepcionista\n" +
							"3 - Remover Recepcionista\n" +
							"0 - sair");
					
					opt = sc.nextInt();
					
					switch(opt) {
					case 0:
						innerLoop = false;
						break;
						
					case 1:
						sc.nextLine();
						
						System.out.println("Nome do Recepcionista");
						
						String nome = sc.nextLine();
						
						Recepcionista recepcionista = new Recepcionista(nome);
						
						recepcionistas.add(recepcionista);
						break;
						
					case 2:
						break;
						
					case 3:
						System.out.println("Qual Recepcionista você deseja remover?");
						for(int i = 0; i < recepcionistas.size(); i++) {
							System.out.println(i + " - " + recepcionistas.get(i).getNome());
						}
						
						opt = sc.nextInt();
						
						if(opt >= 0 && opt < recepcionistas.size()) {
							recepcionistas.remove(opt);
							System.out.println("Recepcionista removido com sucesso!");
						}else {
							System.out.println("Opção inválida");
						}
						break;
						
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		
	}
	
}

package objetos;
import java.util.Scanner;

public class Diario {

	private static Scanner scan;
	
	public static void main(String[] args) {
		System.out.println("#----O que deseja cadastrar?----#");
		System.out.println("#    Opção 1 - Usuario          #");
		System.out.println("#    Opção 2 - Sintoma          #");
		System.out.println("#-------------------------------#");
		
		System.out.println("Digite a opção que deseja:");
		
		scan = new Scanner(System.in);
		int opcao = scan.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("#------------O que deseja cadastrar?-----------#");
			System.out.println("#     Opção 1 - Cadastrar nome:                #");
			System.out.println("#     Opção 2 - Cadastrar data de nascimento:  #");
			System.out.println("#     Opção 3 - Cadastrar email:               #");
			System.out.println("#     Opção 4 - Cadastrar sexo:                #");
			System.out.println("#----------------------------------------------#");
			
			System.out.println("Digite a opção que deseja:");
			
			int opcao_1 = scan.nextInt();
			
		switch (opcao) {
		case 1:
				System.out.println("Digite o nome:");
				String name_usuario1 = scan.next();
				System.out.println("Digite o sexo:");
				String sexo_usuario1 = scan.next();
				System.out.println("Digite o email:");
				String email_usuario1 = scan.next();
				System.out.println("Digite a data de nascimento:");
				String dataNascimento_usuario1 = scan.next();
		
				scan.nextLine();
				
				Usuario usuario1 = new Usuario(name_usuario1,
						                       sexo_usuario1,
						                       dataNascimento_usuario1, 
						                       email_usuario1);
				
				System.out.println(usuario1.toString());
				
		    break;
			}
		    break;
		case 2:
			System.out.println("#--------O que deseja cadastrar?-------#");
			System.out.println("#  Opção 1 - Cadastrar nome:           #");
			System.out.println("#  Opção 2 - Cadastrar dia da semana:  #");
			System.out.println("#  Opção 3 - Cadastrar Mês:            #");
			System.out.println("#--------------------------------------#");
			
			System.out.println("Digite a opção que deseja:");
			
		int opcao_2 = scan.nextInt();
			
		switch (opcao) {
			
		case 2:
			System.out.println("Digite os sintomas:");
			String name_symptom = scan.next();
			System.out.println("Digite dia da semana:");
			String diaSemana_symptom = scan.next();
			System.out.println("Digite o mês:");
			String mes_symptom = scan.next();
			scan.nextLine();
			
			Sintomas symtom1 = new Sintomas(name_symptom, 
					                        diaSemana_symptom, 
					                        mes_symptom );
			
			System.out.println(symtom1.toString());
		
			break;
		    }
			break;
			
		}
	}
}


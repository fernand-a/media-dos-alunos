package MediaAlunoVetores;

import java.util.Scanner;

public class MediaAlunoVetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        //declaracao de variaveis
		int q = 6; 
		int sala[] = new int[q];
		int x;
	
	    //exibir texto na tela
		System.out.println("quantidade de alunos na sala:");
	
	    //laco de repeticao
		for (x = 0; x < q; x++) {
			System.out.printf("sala %d: ", (x + 1), q);
			sala[x] = leia.nextInt();

		}

        //declaracao de variaveis
		int soma = 0;
		int maior = sala[0];
		int menor = sala[0];

        //laco de repeticao
		for (x = 0; x < q; x++) {
			soma = soma + sala[x];
			if (sala[x] < maior) 
				maior = sala[x];
			if (sala[x] > menor)
				menor = sala[x];

		}
		
		//exibir texto na tela
		System.out.println();
		System.out.printf("\nmedia de alunos = %d\n", (soma / q));
		System.out.println();
		leia.close();
		
		//laco de repeticao
		for (x = 0; x < q; x++) {
		    
		    //condicao
			if (sala[x] < (soma / q))
				System.out.printf("sala %d = %2d - sala com menor numero de alunos\n", x, sala[x]);
			else if (sala[x] > (soma / q))
				System.out.printf("Sala %d = %2d - sala com maior numero de alunos\n", x, sala[x]);

		}

	}

}

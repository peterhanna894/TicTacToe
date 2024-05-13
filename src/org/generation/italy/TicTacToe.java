package org.generation.italy;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Simulare il campo da gioco con una matrice stringa 3x3.

			Ci sono due giocatori: il giocatore 1 (simbolo "X") e il giocatore 2 
			(simbolo "0") che si alternano.
			Il programma chiede al giocatore di turno la posizione in cui mettere
			il proprio simbolo (riga,colonna) e viene visualizzata la matrice.
			
			Se la posizione è già occupata, mostrare un messaggio di errore.
			
			Il programma termina quando uno dei due giocatori vince oppure tutte le
			caselle sono occupate (pareggio)
		 */
		
		Scanner sc=new Scanner(System.in);
		String[][] array=new String[3][3];
		int r;
		int c;
		String x = "[X]";
		String o = "[O]";
		//boolean posizioneLibera=true;
		String giocatoreDiTurno=x;
	
		boolean vintoX=false;
		boolean vintoO=false;
		int pareggio=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				array[i][j]="[ ]";
				System.out.print(array[i][j]);
			}
			System.out.println();
			
		}
		do {
			System.out.println("inserisci la posizione del giocatore "+ giocatoreDiTurno);
			r=sc.nextInt();
			sc.nextLine();
			c=sc.nextInt();
			sc.nextLine();
			if (giocatoreDiTurno.equalsIgnoreCase(x) && array[r][c].equalsIgnoreCase("[ ]")) {
				array[r][c]=x;
				giocatoreDiTurno=o;
				pareggio++;
			}else if(giocatoreDiTurno.equalsIgnoreCase(o) && array[r][c].equalsIgnoreCase("[ ]")) {
				array[r][c]=o;
				giocatoreDiTurno=x;
				pareggio++;

			}else {
				System.out.println("Posizione occupata");
				//posizioneLibera=false;
			}
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(array[i][j]);
					
				}
				System.out.println();
			}
				///////////////////////////////VERIFICA ORIZONTALE//////////////////////
			
			
			//verifica orizontale riga 0 per X
			if(array[0][0].equals(x) && array[0][1].equals(x) && array[0][2].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			//verifica orizontale riga 0 per O
			else if(array[0][0].equals(o) && array[0][1].equals(o) && array[0][2].equals(o)) {
				System.out.println("Ha vinto (O)");
				vintoO=true;

			}
			//verifica orizontale riga 1 per X
			else if(array[1][0].equals(x) && array[1][1].equals(x) && array[1][2].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			//verifica orizontale riga 1 per O
			else if(array[1][0].equals(o) && array[1][1].equals(o) && array[1][2].equals(o)) {
				System.out.println("Ha vinto (O)");
				vintoO=true;

			}
			//verifica orizontale riga 2 per X
			else if(array[2][0].equals(x) && array[2][1].equals(x) && array[2][2].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			//verifica orizontale riga 2 per O
			else if(array[2][0].equals(o) && array[2][1].equals(o) && array[2][2].equals(o)) {
				System.out.println("Ha vinto (O)");	
				vintoO=true;	

			}


			///////////////////////////////VERIFICA VERTICALE//////////////////////
			
			//verifica verticale colonna 0 per X
			else if(array[0][0].equals(x) && array[1][0].equals(x) && array[2][0].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			//verifica verticale colonna 0 per O
			else if(array[0][0].equals(o) && array[1][0].equals(o) && array[2][0].equals(o)) {
				System.out.println("Ha vinto (O)");
				vintoO=true;

			}
			//verifica verticale colonna 1 per X
			else if(array[0][1].equals(x) && array[1][1].equals(x) && array[2][1].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			//verifica verticale colonna 1 per O
			else if(array[0][1].equals(o) && array[1][1].equals(o) && array[2][1].equals(o)) {
				System.out.println("Ha vinto (O)");
				vintoO=true;

			}
			//verifica verticale colonna 2 per X
			else if(array[0][2].equals(x) && array[1][2].equals(x) && array[2][2].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			//verifica verticale colonna 2 per O
			else if(array[0][2].equals(o) && array[1][2].equals(o) && array[2][2].equals(o)) {
				System.out.println("Ha vinto (O)");	
				vintoO=true;
			}
			
			/////////////////////VERIFICA DIAGONALE////////////////////////////////
			
			
			else if(array[0][0].equals(x) && array[1][1].equals(x) && array[2][2].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			else if(array[0][0].equals(o) && array[1][1].equals(o) && array[2][2].equals(o)) {
				System.out.println("Ha vinto (O)");
				vintoO=true;
			
			}
			
			
		//////
			
			else if(array[0][2].equals(x) && array[1][1].equals(x) && array[2][0].equals(x)) {
				System.out.println("Ha vinto (X)");
				vintoX=true;

			}
			else if(array[0][2].equals(o) && array[1][1].equals(o) && array[2][0].equals(o)) {
				System.out.println("Ha vinto (O)");
				vintoO=true;
			}
			
					
			if(pareggio==9 && vintoO==false && vintoX==false)
				System.out.println("La partita é finita pareggio");
		}while(pareggio<9 && vintoO==false && vintoX==false);
		sc.close();
	}

}

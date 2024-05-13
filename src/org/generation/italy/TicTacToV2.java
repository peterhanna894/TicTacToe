package org.generation.italy;

import java.util.Scanner;

public class TicTacToV2 {

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

			for(int i = 0;i<3;i++) {
				if(array[i][0].equals(x) && array[i][1].equals(x) && array[i][2].equals(x)) {
					System.out.println("Ha vinto (X)");
					vintoX=true;
				}
			}
			for(int i = 0;i<3;i++) {
				if(array[i][0].equals(o) && array[i][1].equals(o) && array[i][2].equals(o)) {
					System.out.println("Ha vinto (O)");
					vintoO=true;
				}
			}
			///////////////////////////////VERIFICA VERTICALE//////////////////////

			for(int j = 0;j<3;j++) {
				if(array[0][j].equals(x) && array[1][j].equals(x) && array[2][j].equals(x)) {
					System.out.println("Ha vinto (X)");
					vintoX=true;
				}
			}
			for(int j = 0;j<3;j++) {
				if(array[0][j].equals(o) && array[1][j].equals(o) && array[2][j].equals(o)) {
					System.out.println("Ha vinto (O)");
					vintoO=true;
				}
			}
			///////////////////// VERIFICA DIAGONALE 1 ////////////////////////////////

			for(int i = 0;i<3;i++) {
				if(array[i][i].equals(o) && array[i][i].equals(o) && array[i][i].equals(o)) {
					System.out.println("Ha vinto (X)");
					vintoO=true;
				}
			}	
			
			for(int i = 0;i<3;i++) {
				if(array[i][i].equals(o) && array[i][i].equals(o) && array[i][i].equals(o)) {
					System.out.println("Ha vinto (O)");
					vintoO=true;
				}
			}
			
			
			
			///////////////////// VERIFICA DIAGONALE 2 ////////////////////////////////

			for(int i = 0, j=2;i<3;i++,j--) {
				
				if(array[i][j].equals(o) && array[i][j].equals(o) && array[i][j].equals(o)) {
					System.out.println("Ha vinto (X)");
					vintoO=true;
				}
			}	
			
			for(int i = 0, j=2;i<3;i++,j--) {
				if(array[i][j].equals(o) && array[i][j].equals(o) && array[i][j].equals(o)) {
					System.out.println("Ha vinto (O)");
					vintoO=true;
				}
			}
			
		}while(pareggio<9 && vintoO==false && vintoX==false);
		sc.close();
	}

}

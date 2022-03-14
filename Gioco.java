package Gioco;

import java.util.Scanner;

public class Gioco {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] pedine = {"gatto", "cane", "falco", "pinguino"};
        Menu menu = new Menu();
        int nGiocatori = menu.disegnaMenu();
        String[] nomiPlayer = new String[nGiocatori];
        Giocatore[] giocatori = new Giocatore[nGiocatori];
        Campo campo = new Campo();
        campo.disegnaCampo();


        for (int i = 0; i < nGiocatori; i++) {
            System.out.println("Inserisci il tuo nome, giocatore numero " + i);
            nomiPlayer[i] = input.nextLine();

        }

        for (int i = 0; i < nGiocatori; i++) {
            giocatori[i] = new Giocatore(nomiPlayer[i], pedine[i], true);
            System.out.println("Benvenuto " + giocatori[i].getNome() + ", la tua pedina è un " + giocatori[i].getPedina());
        }


        while (campo.giocatoriVivi(giocatori)) {
            for (int i = 0; i < nGiocatori; i++) {
                campo.disegnaCampo(giocatori);
                System.out.println();
                System.out.println("È il turno del " + giocatori[i].getPedina() + " " + giocatori[i].getNome() + "\n Premi invio per tirare il tuo dado");
                input.nextLine();
                System.out.println(giocatori[i].getNome() + " tira il dado...");
                campo.eliminaPosizionePrecedente(campo.getCampo(), giocatori[i], giocatori[i].getPosizione());
                giocatori[i].setPosizione(giocatori[i].getPosizione() + giocatori[i].getDado());

                if(giocatori[i].getPosizione() >= 40){
                    giocatori[i].setStatoPlayer(false);
                    System.out.println(giocatori[i].getNome() + " il " + giocatori[i].getPedina() + " ha vinto!!!");
                    System.exit(1);
                }

                campo.aggiornaPosizione(campo.getCampo(), giocatori[i], giocatori[i].getPosizione());
                System.out.println(giocatori[i].getNome() + " si trova alla posizione " + giocatori[i].getPosizione() + '\n');
                input.nextLine();
            }
        }
    }
}


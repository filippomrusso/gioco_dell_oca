package Gioco;

import java.util.Scanner;

public class Gioco {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] pedine = {"gatto", "cane", "falco", "pinguino"};
        Menu menu = new Menu();
        int nGiocatori = menu.disegnaMenu();
        String[] nomiPlayer = new String[nGiocatori];
        Giocatore[] player = new Giocatore[nGiocatori];
        Campo campo = new Campo();
        campo.disegnaCampo();

        for (int i=0; i<nGiocatori; i++){
            System.out.println("Inserisci il tuo nome, giocatore numero "+ i);
            nomiPlayer[i]=input.nextLine();

        }

        for (int i = 0; i<nGiocatori; i++){
            player[i] = new Giocatore(nomiPlayer[i], pedine[i], true);
            System.out.println("Benvenuto "+player[i].getNome() +", la tua pedina è un "+ player[i].getPedina());
        }

        int ok = 0;
        while(ok<4){
            for (int i = 0; i < nGiocatori; i++) {
                System.out.println("È il turno del " + player[i].getPedina() + " " + player[i].getNome());
                System.out.println(player[i].getNome() + " tira il dado...");
                player[i].setPosizione(player[i].getPosizione() + player[i].getDado());
                System.out.println(player[i].getNome() + " si trova alla posizione " + player[i].getPosizione() + '\n');
                campo.aggiornaPosizione(campo.getCampo(), player[i], player[i].getPosizione());

                input.nextLine();
            }
            ok++;
        }
    }
}

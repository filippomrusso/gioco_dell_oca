package Gioco;

import java.util.Scanner;

public class Menu {


    private int nGiocatori;

    public Menu(){
        this.nGiocatori = nGiocatori;
    }

    public int disegnaMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto al gioco dell'oca                             ");
        System.out.println("Scegli il tuo numero di giocatori                       ");
        nGiocatori = input.nextInt();
        System.out.println("A quanto pare siete in "+nGiocatori+" a giocare         ");
        return nGiocatori;
    }

    public int getnGiocatori() {
        return nGiocatori;
    }

    public void setnGiocatori(int nGiocatori) {
        this.nGiocatori = nGiocatori;
    }

}

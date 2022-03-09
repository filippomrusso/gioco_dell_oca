package Gioco;

public class Campo {

    Giocatore[] campo = new Giocatore[40];


    public Campo(){
        this.campo=campo;
    }

    public Giocatore[] getCampo() {
        return campo;
    }

    public void aggiornaPosizione(Giocatore campo[], Giocatore giocatore, int posizione, int vecchiaPosizione) {
        this.campo = campo;
        vecchiaPosizione = giocatore.getPosizione();
        campo[vecchiaPosizione] = null;
        campo[posizione] = giocatore;
    }


    public void disegnaCampo(){
        for(int i=0; i< campo.length; i++){
            System.out.println (" ");
            System.out.println("|                    |  ");
            System.out.println("|     " +i+ "        |  ");
            System.out.println("  ");
        }
    }



}

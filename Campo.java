package Gioco;

public class Campo {

    Giocatore[] campo = new Giocatore[40];

    public Campo(){
        this.campo=campo;
    }

    public Giocatore[] getCampo() {
        return campo;
    }



    public void eliminaPosizionePrecedente(Giocatore campo[], Giocatore giocatore, int posizione){
        this.campo = campo;
        campo[posizione] = null;
    }


    public void aggiornaPosizione(Giocatore campo[], Giocatore giocatore, int posizione) {
        this.campo = campo;
        campo[posizione] = giocatore;
    }


    public void disegnaCampo(){
        for(int i=0; i< campo.length; i++){
            System.out.println("_________");

        }
    }

    public void disegnaCampo(Giocatore[] giocatori){
        for(int i=0; i<giocatori.length; i++){
            for (int z=0; z<campo.length; z++){
                System.out.println("_______");
                if (giocatori[i].getPosizione()==z){
                    System.out.println(giocatori[i].getPosizione() + "____" + giocatori[i].getNome());

                }

            }

        }

    }

    public boolean giocatoriVivi(Giocatore[] giocatori){

        boolean[] statoTot = new boolean[giocatori.length];
        boolean risultato = true;

        for (int i=0; i<giocatori.length; i++){
            statoTot[i] = giocatori[i].getStatoPlayer();
        }

        for (int i=0; i<statoTot.length; i++){

            if (statoTot[i]==false){
                risultato = false;
                System.out.println(giocatori[i].getNome() + " ha vinto!");
            }

        }

        return risultato;
    }





}

package Gioco;

import java.util.Random;

public class Giocatore {
    private boolean statoPlayer = true;     //Vivo se true, morto se false
    private String nome;
    private String pedina;
    private int dado;
    private int posizione = 0;              //Posizione all interno del campo
    Random gen = new Random();

    //Costruttore coi rispettivi parametri per la creazione di un player
    public Giocatore(String nome, String pedina, boolean statoPlayer) {
        this.nome = nome;
        this.pedina = pedina;
        this.dado = dado;
        this.statoPlayer = statoPlayer;
        this.posizione = posizione;

    }

    public String getPedina() {
        return pedina;
    }

    public void setPedina(String pedina) {
        this.pedina = pedina;
    }

    public boolean getStatoPlayer() {
        return statoPlayer;
    }

    public void setStatoPlayer(boolean statoPlayer) {
        this.statoPlayer = statoPlayer;
    }

    public boolean isStatoPlayer() {
        return statoPlayer;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    //Tiro del dado
    public int getDado() {
        int risultato;
        System.out.println("tira il dado...");
        risultato=gen.nextInt(6);
        if(risultato == 0){
            risultato = risultato +1;
            System.out.println(risultato);
            System.out.println("Avanza di "+ risultato +" casella");
        }
        System.out.println(risultato);
        System.out.println("Avanza di "+ risultato +" caselle");
        return risultato;
    }



    public void setDado(int dado) {
        this.dado = dado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
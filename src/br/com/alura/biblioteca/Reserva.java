package br.com.alura.biblioteca;

public class Reserva implements Runnable{
    private Livro livro;

    public Reserva(Livro livro) {
        this.livro = livro;
    }

    public synchronized void reservarLivro(){
        System.out.println("Iniciando Reserva");
        if(!livro.reservado){
            this.livro.reservado = true;
            System.out.println("Reserva efetuada com sucesso! Aproveite a leitura, " + Thread.currentThread().getName());
        }else{
            System.out.println("O livro já foi reservado," + Thread.currentThread().getName());
        }
        System.out.println("Finalizando Reserva.");

    }

    @Override
    public void run() {
        reservarLivro();
    }
}

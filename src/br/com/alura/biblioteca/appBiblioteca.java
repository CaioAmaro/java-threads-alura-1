package br.com.alura.biblioteca;

public class appBiblioteca {
    public static void main(String[] args) {

        Livro livro = new Livro();
        Reserva reserva = new Reserva(livro);

        Thread reservaJoao = new Thread(reserva, "João");
        Thread reservaMaria = new Thread(reserva, "Maria");

        reservaJoao.start();
        reservaMaria.start();

        try {
            reservaJoao.join();
            reservaMaria.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Reservas Finalizadas.");

    }
}

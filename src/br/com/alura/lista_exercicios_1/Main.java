package br.com.alura.lista_exercicios_1;

public class Main {
    public static void main(String[] args) {
        /* 1. Crie uma classe main, duas impressoras e duas threads,
          cada uma delas usando uma impressora.
          É ideal que as impressoras tenham IDs
          diferentes. Veja o que acontece com a ordem da impressão dos números.
        */

        /* 2 - Agora, suponha que temos que ter uma ordem de prioridade nas impressoras:
           queremos sempre que a thread 2 rode o mais rápido possível. Podemos usar o
           método setPriority() para configurar a prioridade, passando como parâmetro o
           valor da prioridade que queremos dar à thread, sendo 10 a maior prioridade
           e 1 a menor prioridade.
         */

        // 3 - Altere as prioridades da atividade anterior, para que agora a thread 1 seja executada o mais rápido possível.

        /*4 - Vamos conferir o estado de uma thread. Crie um Runnable cujo método run apenas imprima
          “Olá, mundo”, e crie uma thread na classe principal, usando esse runnable. Antes de utilizar o
          método start() na thread criada, vamos usar um outro método, o isAlive(). Ele mostra um boolean,
          que diz “true” se a thread está ativa, e “false” caso esteja inativa.
          Assim, antes do start, imprima o valor de isAlive(), e repita o procedimento depois de chamar o start(). Veja o que é impresso.
          */

        /*5 - Por fim, na classe anterior, depois de chamar o método start(),
          chame o join, para depois imprimir o valor de isAlive().
          Qual a diferença entre os dois? Por que você acha que isso aconteceu?*/


        Impressora impressora1 = new Impressora(1);
        Impressora impressora2 = new Impressora(2);

        Thread thread1 = new Thread(impressora1);
        Thread thread2 = new Thread(impressora2);

        thread1.setPriority(1);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("---");

        Thread thread3 = new Thread(impressora1);
        Thread thread4 = new Thread(impressora2);

        thread3.setPriority(10);
        thread4.setPriority(1);

        thread3.start();
        thread4.start();

        Runnable classeAnonima = new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá, mundo!");
            }
        };

        Thread thread = new Thread(classeAnonima);

        System.out.println("Estado: " + thread.isAlive());

        thread.start();
        System.out.println("Estado: " + thread.isAlive());

        Runnable classeAnonimaUsandoLambda = () -> System.out.println("Olá, mundo");

        Thread threadComLambda = new Thread(classeAnonimaUsandoLambda);

        System.out.println("Estado Lambda: " + thread.isAlive());

        threadComLambda.start();

        System.out.println("Estado Lambda: " + thread.isAlive());

        try {
            threadComLambda.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Estado Lambda: " + thread.isAlive());




    }
}

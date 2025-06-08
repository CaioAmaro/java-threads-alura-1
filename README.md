## 📌 Descrição das Classes Principais

- **AppBanco.java**: Classe principal que executa a aplicação.
- **Cliente.java**: Representa o cliente do banco.
- **Conta.java**: Representa a conta bancária com operações básicas.
- **OperacaoSaque.java**: Implementa uma tarefa de saque a ser executada por uma thread.
- **ExecutaTarefa.java**: Responsável por iniciar tarefas em threads separadas.
- **TesteMultiplasThreads.java**: Classe de teste para simulação de concorrência e acesso simultâneo à conta.

-  Projeto Java - Simulação de Banco e Biblioteca com Threads

Este projeto é uma simulação de dois sistemas integrados:

- Um sistema bancário com operações de saque e movimentação de contas.
- Um sistema de reservas de livros com controle de concorrência.
- Ambos os sistemas usam **threads** e **sincronização** para simular acesso simultâneo de múltiplos usuários.

## 🧠 Objetivos do Projeto

- Aplicar os conceitos de **programação concorrente** em Java.
- Entender a utilização de `Runnable`, `Thread`, `synchronized`, e **classes anônimas**.
- Simular cenários reais onde múltiplos usuários acessam recursos compartilhados, como contas bancárias e livros de uma biblioteca.


## 🧪 Objetivo

Demonstrar como múltiplas threads podem acessar e manipular dados de forma concorrente, simulando saques simultâneos em uma conta bancária.

## ✅ Pré-requisitos

- Java JDK 8 ou superior
- IDE como Eclipse ou IntelliJ (opcional)

## ▶️ Como Executar

1. Clone ou extraia o repositório.
2. Abra o projeto em sua IDE Java favorita.
3. Compile e execute a classe `AppBanco.java` ou `TesteMultiplasThreads.java` para iniciar a simulação.

## 📘 Aprendizados

- Criação e execução de threads em Java
- Concorrência e sincronização
- Simulação de operações bancárias

Projeto desenvolvido como parte do curso da [Alura](https://www.alura.com.br/).

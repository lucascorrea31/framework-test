package br.com.lucascorrea;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* Questão 1:
         * Uma criança está subindo uma escada com n degraus e pode pular 1 degrau, 2 ou 3 degraus de uma vez.
         * Implemente um metodo para contar quantas maneiras possíveis a criança pode subir as escadas.
         */
        System.out.println("\nQuestão 1:");
        Question1.answer(4);
        Question1.answer(5);
        Question1.answer(10);
        Question1.answer(15);
        Question1.answer(7);
        Question1.answer(3);
        Question1.answer(-1);

        /* Questão 2:
         * Dado um array ordenado (ordem crescente) com elementos inteiros únicos,
         * escreva um algoritmo para criar uma árvore de busca binária com altura mínima.
         */
        System.out.println("\nQuestão 2:");
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 987};
        Question2.answer(sortedArray);

        int[] sortedArray2 = {1};
        Question2.answer(sortedArray2);

        int[] sortedArray3 = {};
        Question2.answer(sortedArray3);

        Question2.answer(null);

        /* Questão 3:
         * Escreva um código para remover duplicidades de uma lista encadeada não ordenada:
         * "Considerar ordenar a lista encadeada"
         */
        System.out.println("\nQuestão 3:");
        NodeLinkedList linkedList = new NodeLinkedList(4);
        linkedList.next = new NodeLinkedList(4);
        linkedList.next.next = new NodeLinkedList(3);
        linkedList.next.next.next = new NodeLinkedList(1);
        linkedList.next.next.next.next = new NodeLinkedList(2);
        linkedList.next.next.next.next.next = new NodeLinkedList(3);
        linkedList.next.next.next.next.next.next = new NodeLinkedList(2);

        Question3.answer(linkedList);

        /* Questão 4:
         * Implemente uma função para verificar se uma lista duplamente encadeada é um palíndromo:
         * Nota: Um palíndromo é uma palavra ou frase que pode ser lida no seu sentido normal,
         * da esquerda para a direita, bem como no sentido contrário, da direita para a esquerda.
         * Ex:. Ovo, Ana etc..
         */
        System.out.println("\nQuestão 4:");
        Question4.answer("A");
        Question4.answer("");
        Question4.answer(null);
        Question4.answer("ANA");
        Question4.answer("Ovo");
        Question4.answer("ovos");
        Question4.answer("traxart");
        Question4.answer("1traxart1");
        Question4.answer("1traxart12");

        /* Questão 5:
         * Escreva um programa para ordenar uma pilha em ordem crescente (com os maiores itens no topo).
         * Você pode usar no máximo uma pilha adicional para guardar itens,
         * mas não pode copiar o elementos em qualquer outra estrutura de dados (como um array).
         * A pilha suporta as seguintes operações: push, pop, peek e isEmpty.
         */
        System.out.println("\nQuestão 5:");
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        Question5.answer(stack);

    }
}
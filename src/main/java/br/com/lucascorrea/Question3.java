package br.com.lucascorrea;

import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public static void answer(NodeLinkedList list) {
        System.out.print("Lista original: ");
        print(list);

        Set<Integer> uniqueDataList = new HashSet<>();
        NodeLinkedList current = list;
        NodeLinkedList prev = null;

        while (current != null) {
            if (uniqueDataList.contains(current.data)) {
                prev.next = current.next;
            } else {
                uniqueDataList.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        // Ordenar a lista encadeada usando os elementos únicos
        NodeLinkedList orderedList = null;
        for (int data : uniqueDataList) {
            NodeLinkedList newNode = new NodeLinkedList(data);
            if (orderedList == null || orderedList.data >= newNode.data) {
                newNode.next = orderedList;
                orderedList = newNode;
            } else {
                NodeLinkedList node = orderedList;
                while (node.next != null && node.next.data < newNode.data) {
                    node = node.next;
                }
                newNode.next = node.next;
                node.next = newNode;
            }
        }

        System.out.print("Lista sem duplicados e ordenada: ");
        print(orderedList);
    }

    private static void print(NodeLinkedList list) {
        while (list != null) {
            System.out.print(list.data + " ");
            list = list.next;
        }
        System.out.println();
    }
}

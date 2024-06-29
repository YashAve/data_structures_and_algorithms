package javacode;

import javacode.datastructures.binary_search_trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        binarySearchTrees();
    }

    public static void binarySearchTrees() {
        BinarySearchTree tree = new BinarySearchTree();
        List<Integer> integers = new ArrayList<>(List.of(
                25, 20, 15, 27, 30, 29, 26, 22, 32
        ));
        integers.forEach((value) -> tree.insert(value));
    }
}
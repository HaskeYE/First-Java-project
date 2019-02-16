


import java.util.ArrayList;
import java.util.LinkedList;


public class HashTable {
    ArrayList<LinkedList<Integer>> numerals;
    private int hashDiv; //хеш-функция деления

    public HashTable(ArrayList<Integer> list, int hashDiv) {
        numerals = new ArrayList<>(hashDiv - 1);
        this.hashDiv = hashDiv;
        for (Integer i : list) {
            numerals.get(indexForHash(hash(i))).add(i);
        }
    }

    private int hash(int numeral) {
        return numeral % hashDiv;
    }

    private int indexForHash(int hash) {
//Ддя возможно необходимых дальнейших операций
        return hash;
    }

    /*public Set[] build(HashTable args[]) {
        int function = Character.getNumericValue(hashFunction.charAt(1));
        Set[] hashtable = new Set[function];
        for (int numeral : numerals) {
            int hash = numeral % function;
            hashtable[hash].add(numeral);
        }
        return hashtable;
    }*/
}








import com.sun.istack.internal.NotNull;
import java.util.ArrayList;
import java.util.LinkedList;


public class HashTable {
    ArrayList<LinkedList<Integer>> numerals;
    private int hashDiv; //хеш-функция деления

    public HashTable(@NotNull ArrayList<Integer> list, @NotNull int hashDiv) {
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

    public void add(int num) {
        numerals.get(indexForHash(hash(num))).add(num);
    }

    public boolean delete(int num) {
        LinkedList<Integer> list = numerals.get(indexForHash(hash(num)));
        for (int numeral: list) if (numeral == num) {
            list.remove(numeral);
            return true;
        }
        return false;
    }

    public boolean contains(int num) {
        return (numerals.get(indexForHash(hash(num))).contains(num));
    }

    @Override
    public boolean equals(Object obj) {
        return ((obj instanceof HashTable) &&
                ((HashTable) obj).numerals.equals(numerals) &&
                ((HashTable) obj).hashDiv == hashDiv);
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





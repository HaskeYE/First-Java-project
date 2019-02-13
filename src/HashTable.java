


import java.util.Set;


public class HashTable {
    static Set<Integer> numerals; //цифры, которые будут записаны в хеш-таблицу(ключи)
    static String hashFunction; //хеш-функция

    public static Set[] build(HashTable args[]) {
        int function = Character.getNumericValue(hashFunction.charAt(1));
        Set[] hashtable = new Set[function];
        for (int numeral : numerals) {
            int hash = numeral % function;
                hashtable[hash].add(numeral);
            }
            return hashtable;
        }
    }





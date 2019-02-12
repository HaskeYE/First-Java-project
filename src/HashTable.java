import sun.invoke.empty.Empty;

import java.lang.reflect.Array;
import java.util.Set;

public class HashTable {
    static Set<Integer> numerals; //цифры, которые будут записаны в хеш-таблицу(ключи)
    static String hashFunction; //хеш-функция

    public static void build(Array args[]) {
        int function = Character.getNumericValue(hashFunction.charAt(1));
        Array[] hashtable = new Array[function];
        for (int numeral : numerals) {
            int hash = numeral % function;
            if (hashtable[hash] == null) {
                hashtable[hash] = new Set(numeral);
            } else {
                hashtable[hash] + new Array(numeral);
            }
        }
    }

}


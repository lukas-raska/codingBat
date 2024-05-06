package map2.firstSwap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //        System.out.println(Arrays.toString(firstSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }

    //    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and
    //    then return the given array of non-empty strings as follows: if a string matches an earlier string in the
    //    array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has
    //    caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the
    //    array. More difficult than it looks.
    //
    //    firstSwap(["ab", "ac"]) → ["ac", "ab"]
    //    firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa",
    //    "azz"]
    //    firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx",
    //    "by"]
    private static String[] firstSwap(String[] strings) {

        //vytvořím si mapu, do které budu jako keys ukládat počáteční písmena, jako values poslední index, na kterém
        //je slovo začínající tímto písmenem
        Map<Character, Integer> map = new HashMap<>();

        //projdu cyklem předané pole
        for (int index = 0; index < strings.length; index++) {

            Character key = strings[index].charAt(0);
            Integer value = index;

            //pokud prvek s daným počátečním písmenem ještě nebyl mapován, přidám jej do mapy
            if (!map.containsKey(key)){
                map.put(key, index);
            }

            //pokud už mapa obsahuje prvek s tímto počátečním písmenem, prohodím prvky s aktuálním indexem a indexem
            //uloženým v mapě
            else {
                if(map.get(key)!=-1) { //prohazují se prvky pouze pokud již nebyly v předchozích iteracích měněny
                    String temp = strings[index];
                    strings[index] = strings[map.get(key)];
                    strings[map.get(key)] = temp;
                    map.put(key, -1); //po provedení prohození nastavím index na -1
                }
            }
        }

        return strings;
    }
}

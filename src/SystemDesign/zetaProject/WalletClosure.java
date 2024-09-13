package SystemDesign.zetaProject;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * https://swimlanes.io/u/lNsdkMR8A
 *
 *
 */
public class WalletClosure {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3, 7);
        map.put(5, 7);
        map.put(8, 4);
        map.put(1, 5);
        map.put(2, 9);

        map = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (integer, integer2) -> integer,
                        LinkedHashMap::new));

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}

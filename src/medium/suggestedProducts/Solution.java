package medium.suggestedProducts;

import com.sun.source.tree.Tree;

import java.util.*;

public class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        Arrays.sort(products);
        List<String> productsList = Arrays.asList(products);

        for (int i = 0; i < products.length; i++) {
            map.put(products[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : searchWord.toCharArray()) {
            sb.append(c);
            String ceiling = map.ceilingKey(sb.toString());
            String floor = map.floorKey(sb + "~");
            if (ceiling == null || floor == null) break;
            result.add(productsList.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1)));
        }

        while (result.size() < searchWord.length()) result.add(new ArrayList<>());
        return result;
    }


}

package LeetCode.Question100SameTree;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Question100First {
    public static void main(String[] args) {
        List<Integer> pList = Arrays.asList(1,2,3);
        List<Integer> qList = Arrays.asList(1,2,3);

        System.out.println(pList == qList);

        System.out.println(biPredicate.test(pList, qList));


    }

    private static BiPredicate<List<Integer>, List<Integer>> biPredicate = (p, q) -> {
        boolean same = false;
        int l = p.size() > q.size() ? p.size() : q.size();
        for(int i = 0; i < l; i++){
            if(p.get(i) == q.get(i)) same = true;
            else same = false;
        }
        return same;
    };
}

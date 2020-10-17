package sample;

import java.util.ArrayList;

public class Calculator {
    int sum(ArrayList<Integer> arrayList){
        int answer = arrayList.stream().reduce((x, y)->x+y).get();
        System.out.println(answer);
        return answer;
    }

    long subZero (ArrayList<Integer> arrayList){
        long answer = arrayList.stream().sorted().filter((x) ->x>0).count();
        System.out.println(answer);
        return answer;

    }

    long aboveZero (ArrayList<Integer> arrayList){
        long answer = arrayList.stream().filter((x) ->x<0).count();
        System.out.println(answer);
        return answer;

    }
    long minElement (ArrayList<Integer> arrayList){
        long answer = arrayList.stream().reduce((a, b) -> Math.min(a, b)).get();
        System.out.println(answer);
        return answer;
    }
    long maxElement (ArrayList<Integer> arrayList){
        long answer = arrayList.stream().reduce((a, b) -> Math.max(a, b)).get();
        System.out.println(answer);
        return answer;
    }



}

package app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            array.add(i);
        }
        System.out.print(array);

    }
}
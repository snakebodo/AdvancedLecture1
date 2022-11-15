package org.example;

public class Outter {
    int x = 5;
    static class NestedStatic {
        //body
    }

    class Inner {
        //body
    }
    public void createPair(String key, int value){
        class Pair{
            String key;
            int value;

        }
        Pair pair =new Pair();
        pair.key = key;
        pair.value = value;
    }
}

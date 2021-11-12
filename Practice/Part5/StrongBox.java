package Practice.Part5;

import java.util.*;

import static Practice.Part5.KeyType.*;

public class StrongBox<E> {

    private E element;
    private KeyType key;
    private int cnt;

    private Map<KeyType, Integer> keymap = new HashMap<>();

    StrongBox(KeyType i) {
        this.key = i;

        keymap.put(PADLOCK, 1024);
        keymap.put(BUTTON, 10000);
        keymap.put(DIAL, 30000);
        keymap.put(FINGER, 1000000);
    }

    public void put(E obj) {
        this.element = obj;
    }

    public E get() {
        cnt++;
        if (cnt < keymap.get(key)) {
            return null;
        } else {
            return element;
        }
    }
}

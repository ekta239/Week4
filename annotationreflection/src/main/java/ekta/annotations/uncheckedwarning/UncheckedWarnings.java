package ekta.annotations.uncheckedwarning;

import java.util.ArrayList;

public class UncheckedWarnings {
    @SuppressWarnings("unchecked")
    public void addElements() {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(100);
        System.out.println("List: " + list);
    }
}


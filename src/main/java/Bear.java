import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Fish> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int foodCount() {
    return belly.size();
    }

    public void eat(Fish fish) {
        this.belly.add(fish);
    }

    public void sleep() {
        this.belly.clear();
    }
}

import java.util.ArrayList;

public class River {
    private ArrayList<Fish> fish;

    public River() {
        this.fish = new ArrayList<>();
    }

    public int fishCount() {
        return fish.size();
    }

    public void addFish(Fish newFish) {
        this.fish.add(newFish);
    }

    public Fish removeFish(Fish fishToRemove) {
        int index = fish.indexOf(fishToRemove);
        Fish fishRemoved = fish.get(index);
        fish.remove(index);
        return fishRemoved;
    }
}

public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Baloo");
        River river = new River();
        Fish salmon = new Fish();

        river.addFish(salmon);
        System.out.println(river.fishCount());
        river.removeFish(salmon);
        System.out.println(river.fishCount());
        bear.eat(salmon);
        System.out.println(bear.foodCount());
    }
}

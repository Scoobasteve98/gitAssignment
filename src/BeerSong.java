public class BeerSong {
    public static void main(String[] args) {
        for(int i = 99; i != 0; i--) {
            ninetyNineBottlesOfBeer(i);
        }
    }

    public static void ninetyNineBottlesOfBeer(int bottles) {
        System.out.println(bottles + " bottles of beer on the wall, "+ bottles +" bottles of beer,");
        System.out.println("take one down, pass it around, " +(bottles - 1)+ " bottles of beer on the wall");
    }
}

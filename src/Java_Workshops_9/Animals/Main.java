package Java_Workshops_9.Animals;

public class Main {
    public static void main(String[] args) {

        Tigers tigers = new Tigers();
        tigers.talk();
        Cats.walk();

        Lions lions = new Lions();
        lions.talk();
        Cats.walk();

        HomeCats homeCats = new HomeCats();
        homeCats.talk();
        Cats.walk();

    }
}

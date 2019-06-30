package IOC;

public class Amazon implements Cloud {

    @Override
    public void availability() {
        System.out.println("amazon are really great cloud platform");
    }

    @Override
    public void freeTier() {
        System.out.println("it has lot of free tier");
    }
}

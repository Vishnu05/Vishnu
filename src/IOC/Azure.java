package IOC;

public class Azure implements Cloud {
    @Override
    public void freeTier() {
        System.out.println("it is competing with aws but it didn't find a way out");
    }

    @Override
    public void availability() {
        System.out.println("most of the region is also covered ");
    }

    public String cost() {
        return "the cost of Azure is less than compared to amazon";
    }
}

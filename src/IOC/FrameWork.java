package IOC;

public class FrameWork implements Backend {

    // interface object ??
    private Cloud cloud;

    // no-arg constructor
    FrameWork() {
        System.out.println("Constructor ");
    }

    @Override
    public String techStack() {
        return "good tech stack help to grow the business more effectively";
    }

    // interface method calling
    public String db() {
        return cloud.cost();
    }

    public void setCloud(Cloud cloud) {
        System.out.println("this is setter method");
        this.cloud = cloud;
    }
}

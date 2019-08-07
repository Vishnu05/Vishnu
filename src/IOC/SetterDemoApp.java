package IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    static private String name;
    static private int a;
    static int b;

    public static void main(String[] args) {

        // loading the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");

        // retrieve spring bean
        FrameWork objs = context.getBean("fwr", FrameWork.class);
        System.out.println(objs.techStack());

        context.close();

        SetterDemoApp sd = new SetterDemoApp();
        System.out.println(name);
        sd.name = "3";
        System.out.println(name);
        sd.b = 5;
        System.out.println(b);
    }
}

class encapsulation extends SetterDemoApp{
    SetterDemoApp sd = new SetterDemoApp();
    encapsulation() {

    }
}

package IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext xmls = new ClassPathXmlApplicationContext("applicationConfiguration.xml");

        // with interface we are creating the bean 
        Cloud cl = xmls.getBean("obj", Cloud.class);
        cl.availability();
        cl.freeTier();

        // should the beam name should be unique
        Cloud az = xmls.getBean("objs", Cloud.class);
        az.freeTier();

    }

}

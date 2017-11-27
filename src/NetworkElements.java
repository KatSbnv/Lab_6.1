import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkElements {

    @InjectNetworkScanCount(min= 0, max = 10000)

    private int NECount;
    public void printNECount(){
        System.out.println(NECount);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Network.xml");
        context.getBean(NetworkElements.class).printNECount();

    }
}

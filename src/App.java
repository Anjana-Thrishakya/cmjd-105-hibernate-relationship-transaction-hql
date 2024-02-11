import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        SessionFactoryConfiguration.getInstance().getSession();
    }
}

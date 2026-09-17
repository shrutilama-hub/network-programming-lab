import java.net.*;

public class ReachabilityExample {
    public static void main(String[] args) {
        try {
            // Correct spelling of "google"
            InetAddress address = InetAddress.getByName("www.google.com");

            // Check if host is reachable within 5 seconds
            boolean result = address.isReachable(5000);

            System.out.println("Host: " + address.getHostName());
            System.out.println("Reachable: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

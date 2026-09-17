import java.net.*;

public class HostIP {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to find host.");
        }
    }
}

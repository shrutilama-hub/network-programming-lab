import java.net.*;

public class AddressTypeExample {
    public static void main(String[] args) {
        try {
            // Array of InetAddress objects
            InetAddress[] addresses = {
                InetAddress.getByName("0.0.0.0"),
                InetAddress.getByName("127.0.0.1"),
                InetAddress.getByName("224.0.0.1"),
                InetAddress.getByName("F02::1"),
                InetAddress.getByName("F03::1"),
                InetAddress.getByName("F04::1")
            };

            // Loop through each address
            for (InetAddress address : addresses) {
                System.out.println("\nAddress: " + address.getHostAddress());

                System.out.println("Any Local: " + address.isAnyLocalAddress());
                System.out.println("Loopback: " + address.isLoopbackAddress());
                System.out.println("Link Local: " + address.isLinkLocalAddress());
                System.out.println("Site Local: " + address.isSiteLocalAddress());
                System.out.println("Multicast: " + address.isMulticastAddress());
                System.out.println("MC Global: " + address.isMCGlobal());
                System.out.println("MC Organization: " + address.isMCOrgLocal());
                System.out.println("MC Site Local: " + address.isMCSiteLocal());
                System.out.println("MC Link Local: " + address.isMCLinkLocal());
                System.out.println("MC Node Local: " + address.isMCNodeLocal());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

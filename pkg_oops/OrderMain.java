package pkg_oops;

public class OrderMain {
	public static void main(String[] args) {
        Order physical = new PhysicalProductOrder("23");
        Order digital = new DigitalProductOrder("56");
        Order service = new ServiceOrder("87");

        physical.process_order();
        physical.print_order_summary();

        digital.process_order();
        digital.print_order_summary();

        service.process_order();
        service.print_order_summary();
	}
}

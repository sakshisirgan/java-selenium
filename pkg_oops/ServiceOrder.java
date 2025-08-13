package pkg_oops;

class ServiceOrder extends Order{

	public ServiceOrder(String order_id) {
		super(order_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process_order() {
		// TODO Auto-generated method stub
		System.out.println("Scheduling service for order : " + order_id);
	}
	
}

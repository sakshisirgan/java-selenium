package pkg_oops;

class PhysicalProductOrder extends Order{
	
	public PhysicalProductOrder(String order_id) {
        super(order_id);
     // TODO Auto-generated constructor stub
    }

	@Override
	public void process_order() {
		// TODO Auto-generated method stub
		 System.out.println("Shipping physical product for order :" + order_id);
	}
}
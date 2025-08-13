package pkg_oops;

class DigitalProductOrder extends Order{
	
	public DigitalProductOrder(String order_id) {
        super(order_id);
     // TODO Auto-generated constructor stub
    }

	@Override
	public void process_order() {
		// TODO Auto-generated method stub
		 System.out.println("Sending download link for order :" + order_id);
	}
}

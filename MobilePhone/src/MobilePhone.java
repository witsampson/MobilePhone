
public class MobilePhone {
	private String Manufacturer;
	private String Model;
	private String Price;
	private String Carrier;
	
	public MobilePhone(String manufacturer, String model, String price, String carrier) {
		Manufacturer = manufacturer;
		Model = model;
		Price = price;
		Carrier = carrier;
	}
	
	public String call(String phoneNumber) {
		return "I am calling " + phoneNumber;
	}
	
	public String text(String textMessage) {
		return textMessage;
	}

	@Override
	public String toString() {
		return "MobilePhone [Manufacturer=" + Manufacturer + ", Model=" + Model + ", Price=" + Price + ", Carrier="
				+ Carrier + "]";
	}
	
	


	

}

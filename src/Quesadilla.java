
public class Quesadilla extends Transaction{
	private String FoodName;
	private int FoodPrice;
	private String FoodType;
	private String DippingSauce;
	
	public Quesadilla(int FoodId, String FoodName, int FoodPrice, String FoodType, String DippingSauce) {
		super(FoodId);
		this.FoodName = FoodName;
		this.FoodPrice = FoodPrice;
		this.FoodType = FoodType;
		this.DippingSauce = DippingSauce;
	}

	public String getFoodName() {
		return FoodName;
	}

	public void setFoodName(String foodName) {
		FoodName = foodName;
	}

	public int getFoodPrice() {
		return FoodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		FoodPrice = foodPrice;
	}

	public String getFoodType() {
		return FoodType;
	}

	public void setFoodType(String foodType) {
		FoodType = foodType;
	}

	public String getDippingSauce() {
		return DippingSauce;
	}

	public void setDippingSauce(String dippingSauce) {
		DippingSauce = dippingSauce;
	}

	
	

//	@Override
//	public Integer totalPrice(int price) {
//		// TODO Auto-generated method stub
//		return price - getDisc();
//	}
//	
	
}

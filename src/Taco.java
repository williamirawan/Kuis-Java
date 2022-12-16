public class Taco extends Transaction{
	private String FoodName;
	private int FoodPrice;
	private String FoodType;
	private String ShellType;
	
	public Taco(int FoodId, String FoodName, int FoodPrice, String FoodType, String ShellType) {
		super(FoodId);
		this.FoodName = FoodName;
		this.FoodPrice = FoodPrice;
		this.FoodType = FoodType;
		this.ShellType = ShellType;
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

	public String getShellType() {
		return ShellType;
	}

	public void setShellType(String shellType) {
		ShellType = shellType;
	}

	
	

//	@Override
//	public Integer totalPrice(int price) {
//		// TODO Auto-generated method stub
//		return price - getDisc();
//	}
//	
	
}

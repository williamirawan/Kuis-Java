
public  abstract class Transaction {
	private char TransactionId;
	private int FoodId;
	private int Qty;
	
	
	public Transaction(int FoodId) {
		super();
		this.FoodId = FoodId;
	}
	
	
	
	public char getTransactionId() {
		return TransactionId;
	}



	public void setTransactionId(char transactionId) {
		TransactionId = transactionId;
	}



	public int getFoodId() {
		return FoodId;
	}



	public void setFoodId(int foodId) {
		FoodId = foodId;
	}



	public int getQty() {
		return Qty;
	}



	public void setQty(int qty) {
		Qty = qty;
	}



//	public abstract Integer totalPrice(int price);
	
}

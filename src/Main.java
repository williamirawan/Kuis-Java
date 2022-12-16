import java.util.Iterator;
import java.util.Vector;
import java.util.Scanner;


public class Main {
	int pil;
	Scanner scan = new Scanner(System.in);
	Vector<Transaction> s = new Vector<>();
	
	
	public void menu() {
		System.out.println("1. Buy Food");
		System.out.println("2. View All Transactions");
		System.out.println("3. Delete Transaction");
		System.out.println("4. Exit");
		System.out.print("Choose: ");
	}
	
	public void subMenu() {
	
		
		
			Quesadilla();
			
		    Taco();
			
	}
	
	public void Quesadilla() {
		String FoodName = "Steak Quesadilla"
				+ "Chicken Quesadilla"
				+ "Cheese Quesadilla"
				+ "Lamb Quesadilla"
				+ "Mixed Quesadilla";
		int FoodPrice = 4000
				+ 35000
				+ 48000
				+ 65000
				+ 70000;
		String FoodType = "Quesadilla"
				+ "Quesadilla"
				+ "Quesadilla"
				+ "Quesadilla"
				+ "Quesadilla";
		String DippingSauce = "Barbeque"
				+ "Barbeque"
				+ "Black pepper"
				+ "Black pepper";
		
		
		
		
		
		s.add( new Quesadilla(FoodPrice, FoodName, FoodPrice, DippingSauce, FoodType));
	}
	
	public void Taco() {
		String FoodName = "Steak Quesadilla"
				+ "Super Supreme"
				+ "Locos Tacos"
				+ "Beefy Potato"
				+ "Spicy potato";
		int FoodPrice = 100
				+ 2000
				+ 8000
				+ 45000
				+ 23000;
		String FoodType = "Quesadilla"
				+ "Taco"
				+ "taco"
				+ "Taco"
				+ "Taco";
		String DippingSauce = "Barbeque"
				+ "Barbeque"
				+ "Black pepper"
				+ "Black pepper";
		
		
		s.add(new Taco (FoodPrice, FoodName, FoodPrice, FoodType, DippingSauce));
	}

	public void view () {
		if(s.isEmpty()) {
			System.out.println("There is no Smartphone.");
			System.out.println();
		} else {
			for (int i = 0; i < s.size(); i++) {
				System.out.println("No. " + (i+1));
	
				if(s.get(i) instanceof Quesadilla) {
					System.out.println("ID: " + ((Quesadilla)s.get(i)).getFoodId());
				} else {
					System.out.println("ID: " + ((Taco)s.get(i)).getFoodId());
				}
				if(s.get(i) instanceof Quesadilla) {
					System.out.println("Food: " + ((Quesadilla)s.get(i)).getFoodName());
				} else {
					System.out.println("Food: " + ((Taco)s.get(i)).getFoodName());
				}
				
				System.out.println("Qty: " + s.get(i).getQty());
				
				if(s.get(i) instanceof Taco) {
					System.out.println("Price: Rp." + ((Quesadilla)s.get(i)).getFoodPrice());
				} else {
					System.out.println("Price: Rp." + ((Taco)s.get(i)).getFoodPrice());
				}
			}
			System.out.println();
		}
	}
	
	public void delete() {
		view();
		do {
			System.out.print("Input the number of index you want to deleted[1 .. " + s.size() +"]: ");
			pil = scan.nextInt(); 
			scan.nextLine();
		} while (pil < 1 || pil > s.size());
		s.remove(pil - 1);
		
	}
	public Main() {
		// TODO Auto-generated constructor stub
		do {
			menu();
			pil = scan.nextInt(); scan.nextLine();
			
			switch (pil) {
			case 1:
				subMenu();
				System.out.println("Press any key to continue..");
				scan.nextLine();
				break;
			
			case 2:
				view();
				System.out.println("Press any key to continue..");
				scan.nextLine();
				break;
				
			case 3:
				delete();
				System.out.println("Press any key to continue..");
				scan.nextLine();
				break;
			default:
				break;
			}
		} while (pil != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

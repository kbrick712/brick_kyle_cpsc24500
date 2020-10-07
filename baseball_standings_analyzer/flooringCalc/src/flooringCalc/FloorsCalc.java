package flooringCalc;
/**
 * This class contains methods that determine how much flooring is needed and how much it costs.
 * @author kyle
 *
 */
public class FloorsCalc {
	/**
	 * This method returns the total area of flooring needed to be covered.
	 * @return
	 */
	public static double areaCalc() {
		
		double tri1 = 12;
		double tri2 = 10;
		double rec1 = 25;
		double rec2 = 10;
		double rec3 = 10;
		double rec4 = 13;
		double tri_area;
		double rec1_area;
		double rec2_area;
		double total;
		
		tri_area = (tri1 * tri2) / 2;
		rec1_area = rec1 * rec2;
		rec2_area = rec3 * rec4;
		total = tri_area + rec1_area + rec2_area;
		
		return total;
	}
	/**
	 * This method returns the total price of flooring.
	 * @param total_packages
	 * @return
	 */
	public static double priceCalc(double total_packages) {
		double total;
		double price = 25;
		
		total = total_packages * price;
		
		return total;
	}
	
	/**
	 * Some rounding and conversions take place here.
	 * @param args
	 */
	public static void main(String[] args) {
		double floor_area;
		double board_area;
		double need_boards;
		double board_price;
		double total_packages;
		
		board_area = (30 * 6 * 6) / 12;
		floor_area = areaCalc();
		need_boards = floor_area / board_area;
		need_boards = need_boards / .2;
		total_packages = Math.ceil(need_boards / 6);
		board_price = priceCalc(total_packages);
		
		System.out.printf("You will need %.0f packages of flooring, which will cost you $%.0f.", total_packages, board_price);
	}
}

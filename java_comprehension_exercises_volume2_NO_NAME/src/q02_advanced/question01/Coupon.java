package q02_advanced.question01;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	public int getId() {
		return id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public String getDescription() {
		return description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDiscountRate(double descountRate) {
		this.discountRate = descountRate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Coupon() {

	}

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}
}

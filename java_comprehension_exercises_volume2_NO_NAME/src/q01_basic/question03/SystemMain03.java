package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		Member member = new Member();

		member.showMember();

		member.setName("Miura Manabu");
		member.setAge(30);
		member.setRank(2);

		member.showMember();

	}

}

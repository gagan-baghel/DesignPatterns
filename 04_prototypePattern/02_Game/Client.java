import java.util.*;
public class Client {
	public static void main(String[] args) {
		MonsterRegistry.loadData();
		Monster m = null;
		System.out.println("Air Fight or Water Fight");
		Scanner sc = new Scanner(System.in);
		String landscape = sc.nextLine();
		if (landscape.equals("Air Fight")) {
			int i = 0;
			while (i++ != 5) {
				m = MonsterRegistry.getmonster("1");
				System.out.println(" new Monster Created "+ i);
			}
			System.out.println(m.name);
			m.move();
		}
		if (landscape.equals("Water Fight")) {
			int i = 0;
			while (i++ != 5) {
				m = MonsterRegistry.getmonster("2");
				System.out.println(" new Monster Created " + i);
			}
			System.out.println(m.name);
			m.move();
		}
	}
}

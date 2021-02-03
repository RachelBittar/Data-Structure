package recursion;

public class TowerofHanoi {

	public static void tower_of_Hanoi_soln(int num_disks, char source, char auxiliary, char destination) {

		if (num_disks == 0)
			return;

		if (num_disks == 1) {
			System.out.println((source + " " + destination));
			return;
		}

		tower_of_Hanoi_soln(num_disks - 1, source, destination, auxiliary);

		System.out.println((source + " " + destination));

		tower_of_Hanoi_soln(num_disks - 1, auxiliary, source, destination);

	}

	public static void main(String[] args) {

		tower_of_Hanoi_soln(2, 'S', 'A', 'D');
	}
}

// | ->	| -> |	   
// s	a	d	

//| <-	|  	 |	   
//s		a	 d
//   ----->
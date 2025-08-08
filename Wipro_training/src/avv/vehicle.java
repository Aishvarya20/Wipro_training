package avv;

public class vehicle {
	void display() {
		System.out.println(" displaying a vehicle");
	}
	class car extends  vehicle{
		void run() {
			System.out.println(" This is car");
		}
		class Bike extends  vehicle{
			void move() {
				System.out.println(" This is bike");
			}
		}
	}
}


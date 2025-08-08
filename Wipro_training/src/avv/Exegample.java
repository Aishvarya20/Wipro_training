package avv;

public class Exegample {
	Exegample()
	{
		 System.out.println("explicit");// impilct constr eg
	}
	void work() {
		System.out.println("working");
	}
	public static void main(String[] args) {
	Exegample e = new Exegample();
	e.work();
	}

}

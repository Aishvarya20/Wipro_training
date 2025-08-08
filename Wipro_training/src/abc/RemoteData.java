package abc;

public class RemoteData {

	public static void main(String[] args) {
	
		Remote tv = new TVRemote();
		Remote fan = new FanRemote();
        tv.turnOn();
        tv.turnOff();

        tv.turnOn();
        fan.turnOff();
    }
}


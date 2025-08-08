package abc;

	public abstract class Remote {
	    abstract void turnOn();
	    abstract void turnOff();
	}

	class TVRemote extends Remote {
	    void turnOn() {
	        System.out.println("TV is ON.");
	    }

	    void turnOff() {
	        System.out.println("TV isOFF.");
	    }
	}

	class FanRemote extends Remote {
	    void turnOn() {
	        System.out.println("AC is now ON.");
	    }

	    void turnOff() {
	        System.out.println("AC is now OFF.");
	    }
	}

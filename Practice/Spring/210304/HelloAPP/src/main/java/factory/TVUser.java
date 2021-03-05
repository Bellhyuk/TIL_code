package factory;

public class TVUser {

	public static void main(String[] args) {
		TV tv = Beanfactory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
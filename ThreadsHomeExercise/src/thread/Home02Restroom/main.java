package thread.Home02Restroom;

public class main {

	public static void main(String[] args) {
		Restroom restroom = new Restroom();

		Thread guest1 = new Thread(new Pee(restroom), "Jon");
		Thread guest2 = new Thread(new Poop(restroom), "Jeff");
		//Thread guest3 = new Thread(new Poop(restroom), "Tiffany");
		//Thread guest4 = new Thread(new Pee(restroom), "Mary");
		Thread cleanner = new Thread(new cleanTask(restroom), "Restroom cleanner");
		cleanner.setDaemon(true);


		guest1.start();
		guest2.start();
		//guest3.start();
		//guest4.start();
		cleanner.start();
	}

}

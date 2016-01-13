package Class.CH10;

class ScrollTextBack implements Runnable {
	private Thread t;
	private String threadName;

	ScrollTextBack(String name) {
		threadName = name;
	}

	public void run() {
		System.err.println(ScrollTextThing.Ctrlr.Window.isVisible());
		while (ScrollTextThing.Ctrlr.Window.isVisible()) {
			ScrollTextThing.Ctrlr.mainEvent.setText("Lorem ipsum dolor sit amet, "
					+ "consectetur adipiscing elit. Mauris tristique tincidunt varius. "
					+ "Nullam sem magna, aliquam cursus dui quis, eleifend mollis sapien. "
					+ "Aenean sit amet rutrum justo. Nam mi tellus, laoreet non neque sed, maximus tempor mi. "
					+ "Proin neque arcu, fermentum sit amet tincidunt sit amet, vehicula ac nibh. "
					+ "Ut ac neque sed velit eleifend tincidunt finibus ut lorem. "
					+ "Sed mollis ipsum non arcu dictum rhoncus.");
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
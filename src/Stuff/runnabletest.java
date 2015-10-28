package Stuff;

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name){
       threadName = name;
   }
   public void run() {
	   while (true) {
	   	if (test.textField.getText() != null) {
	   		try {
	   			double l = Double.parseDouble(test.textField.getText());
	   			double a = Double.parseDouble(test.calbMain.getText());
	   			double b = Double.parseDouble(test.calbPod.getText());
	   			test.textArea.setText("Pages : " + test.RoundTo(l,4) + "\nA : " + test.RoundTo(l, 4)/2*a + "\nB : " + test.RoundTo(l, 4)/2*b);
	   		} catch (Exception e) {
	   		}
	   	}
	   }
   }
   
   public void start ()
   {
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }

}
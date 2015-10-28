package PDFinator;

class BackgroundCalculation implements Runnable {
   private Thread t;
   private String threadName;
   
   BackgroundCalculation( String name){
       threadName = name;
   }
   public void run() {
	   while (true) {
	   	if (PDFinator.textField.getText() != null) {
	   		try {
	   			double l = Double.parseDouble(PDFinator.textField.getText());
	   			double a = Double.parseDouble(PDFinator.calbMain.getText());
	   			double b = Double.parseDouble(PDFinator.calbPod.getText());
	   			PDFinator.textArea.setText("Pages : " + PDFinator.RoundTo(l,4) + "\nA : " + PDFinator.RoundTo(l, 4)/2*a + "\nB : " + PDFinator.RoundTo(l, 4)/2*b);
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
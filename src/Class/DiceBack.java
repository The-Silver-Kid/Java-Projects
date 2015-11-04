package Class;

class DiceBack implements Runnable {
   private Thread t;
   private String threadName;
   
   DiceBack( String name){
       threadName = name;
   }
   public void run() {
	   while (true) {
		  Dice.lblNewLabel.setText("" + Dice.dslide.getValue());
		  Dice.label.setText("" + Dice.rslide.getValue());
		  if (Dice.tglbtnShowExtendedInfo.isSelected()){
			  Dice.tglbtnShowExtendedInfo.setText("Showing stats");
		  } else {
			  Dice.tglbtnShowExtendedInfo.setText("Showing results");
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
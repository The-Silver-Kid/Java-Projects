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
			  if (!(Dice.stats == null))
				  Dice.out.setText(Dice.stats);
		  } else {
			  Dice.tglbtnShowExtendedInfo.setText("Showing results");
			  if (!(Dice.rolz == null))
				  Dice.out.setText(Dice.rolz);
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
C:\Program Files\Java\jdk1.7.0_25\bin>javac C:\users\9507006\Desktop\JAVA\inh\*.java
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:7: error: damage has private access in Wepon
                        int z = damage + sharp - def;
                                ^
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:7: error: possible loss of precision
                        int z = damage + sharp - def;
                                               ^
  required: int
  found:    float
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:12: error: cannot find symbol
                        z = damage + sharp;
                        ^
  symbol:   variable z
  location: class BattleAx
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:12: error: damage has private access in Wepon
                        z = damage + sharp;
                            ^
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:14: error: cannot find symbol
                cH = cH - 2 * z;
                              ^
  symbol:   variable z
  location: class BattleAx
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:15: error: cannot find symbol
                System.out.println("You dealt " + z + " damage!");
                                                  ^
  symbol:   variable z
  location: class BattleAx
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:17: error: name has private access in Wepon
                System.out.println(name + " Gains 1 XP!");
                                   ^
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:18: error: current has private access in Wepon
                current = current + 1;
                ^
C:\users\9507006\Desktop\JAVA\inh\BattleAx.java:18: error: current has private access in Wepon
                current = current + 1;
                          ^
C:\users\9507006\Desktop\JAVA\inh\CreateWepon.java:22: error: constructor Sword in class Sword cannot be applied to given types;
                        Sword s = new Sword(nS);
                                  ^
  required: no arguments
  found: String
  reason: actual and formal argument lists differ in length
C:\users\9507006\Desktop\JAVA\inh\CreateWepon.java:27: error: constructor BattleAx in class BattleAx cannot be applied to given types;
                        BattleAx a = new BattleAx(nA);
                                     ^
  required: no arguments
  found: String
  reason: actual and formal argument lists differ in length
C:\users\9507006\Desktop\JAVA\inh\Sword.java:7: error: damage has private access in Wepon
                        int z = damage + sharp - def;
                                ^
C:\users\9507006\Desktop\JAVA\inh\Sword.java:7: error: possible loss of precision
                        int z = damage + sharp - def;
                                               ^
  required: int
  found:    float
C:\users\9507006\Desktop\JAVA\inh\Sword.java:12: error: cannot find symbol
                        z = damage + sharp;
                        ^
  symbol:   variable z
  location: class Sword
C:\users\9507006\Desktop\JAVA\inh\Sword.java:12: error: damage has private access in Wepon
                        z = damage + sharp;
                            ^
C:\users\9507006\Desktop\JAVA\inh\Sword.java:14: error: cannot find symbol
                cH = cH - z;
                          ^
  symbol:   variable z
  location: class Sword
C:\users\9507006\Desktop\JAVA\inh\Sword.java:15: error: cannot find symbol
                System.out.println("You dealt " + z + " damage!");
                                                  ^
  symbol:   variable z
  location: class Sword
C:\users\9507006\Desktop\JAVA\inh\Sword.java:17: error: name has private access in Wepon
                System.out.println(name + " Gains 1 XP!");
                                   ^
C:\users\9507006\Desktop\JAVA\inh\Sword.java:18: error: current has private access in Wepon
                current = current + 1;
                ^
C:\users\9507006\Desktop\JAVA\inh\Sword.java:18: error: current has private access in Wepon
                current = current + 1;
                          ^
20 errors

C:\Program Files\Java\jdk1.7.0_25\bin>
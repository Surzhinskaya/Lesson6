package Lesson6;

public abstract class Animal {
   protected  String type;
   protected String name;
   protected int maxRun;
   protected int maxSwim;

    public static int countAnimal=0;

    static final int swim_none = -1;
    static final int swim_fail = 0;
    static final int swim_ok = 1;


   Animal (String type, String name, int maxRun, int maxSwim) {
       this.type=type;
       this.name=name;
       this.maxRun=maxRun;
       this.maxSwim=maxSwim;
       ++countAnimal;
   }
 String getType() {
       return this.type;
 }

 String getName () {
       return this.name;
 }

 int getMaxRun () {
       return this.maxRun;
 }

 int getMaxSwim () {
       return this.maxSwim;
 }

   protected boolean run(int runlenght) {
       return (runlenght <= maxRun);
   }

    protected int swim(int swimlenght) {
        return (swimlenght <= maxSwim)? swim_ok:swim_fail;
    }
}

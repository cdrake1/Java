public class Problem2 {
  public static void main(String[] args) {
    //method teacher gave us
    Animal[] list = new Animal[5];
    list[0] = new Chicken();
    list[0].setWeight(4.5);
    list[1] = new Tiger();
    list[1].setWeight(46.6);
    list[2] = new Chicken();
    list[2].setWeight(1.5);
    list[3] = (Animal)(list[0].clone());
    list[3].setWeight(7.5);
    list[4] = (Animal)(list[1].clone());
    java.util.Arrays.sort(list);
    for (int i = 0; i < list.length; i++) {
        System.out.println("weight: " + list[i].getWeight());
    }
}
    //abstract class animal
    static abstract class Animal implements Comparable<Animal>, Cloneable {
      private double weight;
      
      public double getWeight() 
      {
        //weight return
        return weight;
      }
      
      public void setWeight(double weight) 
      {
        //weight set
        this.weight = weight;
      }
      
      @Override
      public Object clone()
      { 
        //try to clone if not throw exception
        try
        {
          return super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
          return null;
        }

      }
      //compare to method
      public int compareTo(Animal y)
      {
          if(getWeight() - y.getWeight() > 0)
          {
            return 1;
          }
          else if (getWeight() - y.getWeight() < 0)
          {
            return -1;
          }
          else
          {
            return 0;
          }
      }
    }
    //chicken class
    static class Chicken extends Animal {
        
      public Chicken()
      {

      }
    }
    //tiger class
    static class Tiger extends Animal 
    {
      public Tiger()
      {

      }
    }
      
    
}

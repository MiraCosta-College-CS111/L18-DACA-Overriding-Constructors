class Main 
{
  public static void main(String[] args) 
  {
    DACArecipient person1 = new DACArecipient();
    DACArecipient person2 = new DACArecipient("Hernandez", "Alex", "25-6-567", "Mexico", 2451257, 39567322, 39567818, 'F');

    System.out.println(person1 + "\n\n" + person2);
  }
}
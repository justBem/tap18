public class Apartment implements Pay {
     private Person[] family;
     public Apartment(Person [] family){
          this.family=family;
     }

     public Person[] getFamily() {
          System.out.println("Live in an apartment:");
         return family;

     }

     public void setFamily(Person[] family) {
          this.family = family;
     }

     @Override
     public void pay() {
          System.out.println("Pay utility bills!");
     }
}

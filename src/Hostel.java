public class Hostel  implements Pay {
   private Person[] family;

    public Hostel(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        System.out.println("Live in a hostel:");

        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public void pay() {
        System.out.println("Pay rent");;
    }
}

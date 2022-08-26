public class Hotel implements Pay{
    private Person[] family;

    public Hotel(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        System.out.println("Live in a hotel:");
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public void pay() {
        System.out.println("pay rent");
    }
}

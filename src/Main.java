public class Main {
    public static void main(String[] args) {
        Person person1=new Person("Bermet");
        Person person2=new Person("Erjigit");
        Person person3=new Person("Saadat");
        Person person4=new Person("Aktan");
        Person person5=new Person("Ayana");
        Person person6=new Person("Arda");
        Person person7=new Person("Aumeerim");
        Person person8=new Person("Keremet");
        Person person9=new Person("Kasiet");
        Person person10=new Person("Adelina");
        Person person11=new Person("Bekzat");
        Person person12=new Person("Dariya");
        Person person13=new Person("Maksat");
        Person person14=new Person("Nazira");
        Person person15=new Person("alina");


        Person[] family1 = {person1, person2, person3, person4, person5};
        Person[] family2 = {person6, person7, person8, person9, person10};
        Person[] family3= {person11,person12,person13,person14,person15};

        Hostel hostel = new Hostel(family1);
        Apartment apartment = new Apartment(family2);
        Hotel hotel = new Hotel(family3);

        hostel.getFamily();
        for(Person i: family1)
        {
            System.out.println(i.getName());
        }
        hostel.pay();
        System.out.println("--------------------------------");

        apartment.getFamily();
        for(Person i: family2)
        {
            System.out.println(i.getName());
        }
        apartment.pay();
        System.out.println("--------------------------------");


        hotel.getFamily();
        for(Person i: family1)
        {
            System.out.println(i.getName());
        }
        hotel.pay();
        System.out.println("--------------------------------");


    }
}
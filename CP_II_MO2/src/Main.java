public class Main {

    public static void main(String[] args) {
	person mickey = new person("900736","mickey","Frimpong", 2003);

        System.out.println(mickey.getIDNum());
        System.out.println(mickey.getFirstName());
        System.out.println(mickey.getLastName());

        mickey.setFirstName("Mckelvin");

        System.out.println(mickey.getIDNum());
        System.out.println(mickey.getFirstName());
        System.out.println(mickey.getLastName());

        System.out.println(mickey);

        person sally = new person("123456","Sally","jones",2002);
        System.out.println(sally);


    }
}

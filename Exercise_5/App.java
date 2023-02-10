public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Syx");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

        Me.setCcNumber(139406);

        int myCcNumber = Me.getCcNumber();

        System.out.println("My Cc number is " + myCcNumber);

        //=================================================

        Son me = new Son();

        System.out.println("Our Surname is " + me.surname);

        me.showLove();
        
    }
}

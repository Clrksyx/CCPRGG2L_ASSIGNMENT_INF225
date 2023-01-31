import javax.swing.ProgressMonitorInputStream;

public class App {
    public static void main(String[] args) {

       Person friend = new Person("Axel", 19);

       Myself me = new Myself("Clark", 20);

       me.addFriend(friend);
       
       Pet dog = new Pet("Chichi", friend);

       dog.showOwnerName();

       Car Chevrolet = new Car("Chevrolet Corvette GTR", me , 169 );

       Chevrolet.showCarName();

    }   
}

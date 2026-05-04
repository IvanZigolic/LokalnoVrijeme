public class zadatak {
    public static void main(String[] args) {
        int ocjena = 6;
        if(ocjena == 1){
            System.out.println("Nedovoljan"); // Ako je uvjet iz IF istinit ovo se izvrsava
        }
        else if(ocjena == 2) {
            System.out.println("Dovoljan");
        }
        else if(ocjena == 3) {
            System.out.println("Dobar");
        }
        else if(ocjena == 4) {
            System.out.println("Vrlo dobar");
        }
        else if(ocjena == 5) {
            System.out.println("Odlican");
        }
        else{
            System.out.println("Broj nije ocjena");
        }
    }
}

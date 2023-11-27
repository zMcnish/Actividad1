public class Edades {
    public static void main(String[] args) {
        int edJuan = 30; // Modificar según la edad de Juan
        int edAlber = 2 * edJuan / 3;
        int edAna = 4 * edJuan / 3;
        int edMama = edJuan + edAlber + edAna;
        System.out.println("Las edades son: Alberto = " + edAlber + ", Juan = " + edJuan + ", Ana = " + edAna + ", Mama = " + edMama);
    }
}

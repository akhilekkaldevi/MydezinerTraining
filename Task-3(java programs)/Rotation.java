import java.util.ArrayList;
import java.util.Scanner;
public class Rotation
{
    public static void main (String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        /* Inputting elements into the arraylist */
        for(int i = 0; i < 10; i++){
            array.add(scanner.nextInt());
        }
        /* Inputting distance for no.of rotations */
        int distance = scanner.nextInt();
        /* Rotating the arraylist */
        int i,j;
        for(i = 0; i < distance; i++){
            int temp = array.get(0);
            for(j = 0; j < array.size()-1; j++){
                array.set(j,array.get(j+1));
            }
            array.set(j,temp);
        }
        /* Displaying the elements after rotation */
        for(i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
import java.util.*;

import javax.sound.midi.Soundbank;

class LL {

    

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int numberOfDigits = sc.nextInt();
        int[] nums = new int[numberOfDigits];
        int num = 0;

        for(int i=0; i<numberOfDigits; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();
            if(num > 50 || num < 1) {
                System.out.println("Please enter number between 1 to 50.");
                i--;
            }else {
                
                list.add(i,num);
            }
            
        }

        for(int i=0; i<list.size(); i++) {
            if(list.get(i) < 25) {
                list.remove(i);
            }
        }

        System.out.println(list);
         

    }
    
}

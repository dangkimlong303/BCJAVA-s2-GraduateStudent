import java.util.Scanner;

public class GraduateStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ;

        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 30){
                System.out.println("Size should not exceed 30");
            }
        }while (size > 30);

        int[] array = new int[size];

        for (int i =0; i< array.length;i++){
            System.out.print("Enter a mark for student: " + (i+1) + " :");
            array[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int i =0; i< array.length;i++){
            System.out.print(array[i] + "\t");
            if (array[i] >=5 && array[i] <=10){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}

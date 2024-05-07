import java.util.*;

public class t1
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter student marks");
        for(int i =  0;i<n;i++)
        {
            arr[i] = sc.nextDouble();
        }
        double high = arr[0];
        double low = arr[0];
        double avg = 0; 
        for(int i = 0;i<n;i++)
        {
            if(arr[i] > high)
                high = arr[i];
            if(arr[i] < low)
                low = arr[i];
            avg = avg+ arr[i];
        }
        avg = avg/n;
        System.out.println("Highest Score : "+high);
        System.out.println("Lowest Score  :  "+low);
        System.out.println("Average socre : "+avg);
        sc.close();
    }
}
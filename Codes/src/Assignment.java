import java.util.Scanner;
import java.util.Arrays;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] datas = input.split(",");
        int total = datas.length;
        String[] name= new String[total];
        int[] age= new int[total];
        String[] department= new String[total];
        int[] salary= new int[total];
        int count= 0;
        int sum=0;




        for (String info:datas) {

            String[] infos = datas[count].split(":");
            int count1=0;

            name[count]= infos[count1];
            age[count]=Integer.parseInt(infos[++count1]);
            sum=sum+age[count];
            department[count]=infos[++count1];
            salary[count]=Integer.parseInt(infos[++count1]);
            count++;

        }
         int average= sum/age.length;


         StringBuilder stringBuilder = new StringBuilder();
         int index=0;
         int max=-1;
         for (int i=0; i<total;i++){
             if(salary[i]>max){
                 max=salary[i];
                 index=i;
             }

         }



         System.out.println("Total Employees: "+total);
         System.out.println("Average Age: "+average);
         System.out.println("Employee with highest Salary : "+name[index]);
         Arrays.sort(name);
         System.out.print("Sorted Names: ");
        for (int i=0; i<total;i++){
            stringBuilder.append(name[i]).append(",");

        }
        System.out.println(stringBuilder);

    }

}

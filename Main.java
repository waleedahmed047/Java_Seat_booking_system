import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Hello! Wellcome to over bus service");
       System.out.println("These seat are avaiable:");
       String[][] seat=new String[4][4];
       for(int i=0;i<seat.length;i++){
        for(int j=0;j<seat[i].length;j++){
            seat[i][j]=" 'Avaiable' ";}
      }
        System.out.print("  "+"\t");
        for(int j=0;j<seat[0].length;j++){
            System.out.print("Column:"+(j)+" "+ "\t");}
        System.out.println();
        for(int i=0;i<seat.length;i++){
            System.out.print("Row:"+(i)+" "+ "\t");
            
           for(int j=0;j<seat[i].length;j++){
             System.out.print(seat[i][j]+ "\t"); }
        System.out.println();
    }
      System.out.println("Can you want to book the seat:(yes:1/no:0)=");
      int ans=scan.nextInt();
      while(ans!=0){
      if(ans==1){
        System.out.println("Enter the row number :");
        int row=scan.nextInt();
        System.out.println("Enter the column number :");
        int col=scan.nextInt();
        seat[row][col]=" 'Booked' ";
      }
     
  System.out.println("Can you want to  more book the seat:(yes:1/no:0)=");
       ans=scan.nextInt();
    }
    System.out.print("  "+"\t");
    for(int j=0;j<seat[0].length;j++){
        System.out.print("Column:"+(j)+" "+ "\t");
        }
    System.out.println();
    for(int i=0;i<seat.length;i++){
        System.out.print("Row:"+(i)+" "+ "\t");
        
       for(int j=0;j<seat[i].length;j++){
       
            System.out.print(seat[i][j]+ "\t");
   }
   System.out.println();
}
      
    }}
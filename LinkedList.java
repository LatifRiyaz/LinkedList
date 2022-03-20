import java.util.*;

public class LinkedList{    
    public static void main(String args[]){
        int choice,c;
        Scanner in = new Scanner(System.in);
        Basic b = new Basic();        
        while(true){
            System.out.print("1. Insert Data\n2. Insert Data at Beginnning\n3. Insert Data in between\n4. Delete Data\n5. Display\n6. Find Position\n7. Exit\nEnter your choice : ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter a value to be inserted : ");
                    int a1 = in.nextInt();
                    b.insertAtEnd(a1);
                    break;
                case 2:
                    System.out.print("Enter a value to be inserted at beginning: ");
                    int a2 = in.nextInt();
                    b.insertAtBeginning(a2);
                    break;
                case 3:
                    System.out.print("Enter a Position to be inserted(start counting from zero) : ");
                    int p = in.nextInt();
                    System.out.print("Enter a value to be inserted : ");
                    int a3 = in.nextInt();
                    b.insertAtbtwn(p,a3);
                    break;
                case 4:
                    System.out.print("Enter the position of the node to be deleted : ");
                    int d = in.nextInt();
                    b.deleteAnywhere(d);
                    break;
                case 5:
                    System.out.print("Data present in nodes : ");
                    b.show();
                    break;                
                case 6:
                    System.out.print("Enter the data to find(start counting from zero): ");
                    int s = in.nextInt();
                    b.searchnode(s);
                    break;
                case 7:
                    System.out.println("GoodBye!!!");
                    System.exit(0);                    
                default:
                    System.out.println("Invalid Chocie");                
            }                                    
        }        
    }
}
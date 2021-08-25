import java.util.Scanner;
class Node
{
    int rollNumber;
    Node next;
}
public class SinglyList {
    Node start;
    SinglyList()
    {
        start =null;
    }
    void addNode()
    {
        System.out.println("enter our rollNo.");
        Scanner sc =new Scanner(System.in);
        int rollNo =sc.nextInt();

        Node newNode=new Node();
        newNode.rollNumber =rollNo;
        newNode.next=null;

        if(start==null)
        {
            start=newNode;

        }
        else
        {
            Node currentNode=start;

            while(currentNode.next!=null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            }
        System.out.println("node inserted");
        }
    
    
    void delete()
    {
        System.out.println("delete fn is working");
    }
    void search()
    {
        if(start ==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("Enter roll no");
            Scanner sc=new Scanner(System.in);
            int sea=sc.nextInt();
            
            int count=0;
            Node currentNode;
            for(currentNode= start; currentNode!=null; currentNode=currentNode.next)
            {
                if(currentNode.rollNumber ==sea)
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not found");
            }
        }
        
    }
    void traverse()
    {
        if((start ==null))
        {
              System.out.println("list is empty");
        }
        else
        {
            System.out.println("list elements :");
            Node currentNode;
            for(currentNode= start; currentNode!=null; currentNode=currentNode.next)
            {
                System.out.println(currentNode.rollNumber);
            }
        }
    }

    
   
    public static void main(String[] args)
    {
        SinglyList obj=new SinglyList();
        while(true)
        { 
            System.out.println("enter 1 for add");
            System.out.println("enter 2 for delete");
            System.out.println("enter 3 for Search");
            System.out.println("enter 4 for traverse");
            System.out.println("enter 5 for Exit");
            System.out.println("ENTER your choice");
            Scanner choice=new Scanner(System.in);
            int ch=choice.nextInt();

            switch (ch) {
                case 1 -> obj.addNode();
                case 2 -> obj.delete();
                case 3 -> obj.search();
                case 4 -> obj.traverse();
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong Choice");
            }
        }
    }
}

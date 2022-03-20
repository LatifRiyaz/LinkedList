public class Basic{
    
    Node head;
    public void insertAtBeginning(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;        
    }
    public void insertAtbtwn(int index, int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){            
            insertAtBeginning(data);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1; i++){                
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void insertAtEnd(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }            
            n.next = node;
        }
    }
    public void deleteAnywhere(int index){        
        
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i=0;i <index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Deleted node value : " + n1.data);
        }
    }
    public void searchnode(int data){       
        
        Node search = head;
        int i=0;
        boolean flag = false;
        if(head == null){
            System.out.println("Empty list");
        }
        else{
            while(search != null){
                if(search.data == data){                    
                    flag = true;;
                    break;
                }
                i++;
                search = search.next;
            }
        }
        if(flag){
            System.out.println("Data found at position : " + i);
        }
        else{
            System.out.println("Data not found : ");
        }
    }
    public void show(){
        
        Node node = head;
        while(node.next!=null){
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print(node.data + "\n");
    }
}
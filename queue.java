import java.util.LinkedList;
import java.util.Queue;

public class queue{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //Adding element in q
        System.out.println("Adding element in Queue -->");
        q.add(10); //Exeception - no space/state is available
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);

        //Remove Element from queue
        System.out.println("Remove element from Queue --> "+q.remove());//if queue is empty throws exception

        //Poll()
        System.out.println("Remove element from Queue using poll() --> "+q.poll());//if queue is empty throws null

        //Peek()
        System.out.println("Use PeeK() -->" +q.peek());//if queue is empty throws null

        //element()
        System.out.println("Use element() -->" +q.element());//if queue is empty throws exception

        //size()
        System.out.println("Size of Queue -->" +q.size());

        //isEmpty()
        System.out.println("Queue is Empty? --> "+q.isEmpty());

        // AddAll()
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(70);
        ll.add(19);
        q.addAll(ll);
        
        System.out.println("Using addAll() --> "+q);
    }
}
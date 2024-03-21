public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        integerMyLinkedList.add(1);
        integerMyLinkedList.add(2);
        integerMyLinkedList.add(3);

        System.out.println(integerMyLinkedList.get(2));

        integerMyLinkedList.delete(0);

        MyLinkedList<Integer>.MyIterator myIter = integerMyLinkedList.iterator();

        while (myIter.hasNext()) {
            System.out.println(myIter.next());
        }

        System.out.println();
        // Stack
        MyStack<String> stringMyStack = new MyStack<>();

        stringMyStack.push("jun");
        stringMyStack.push("su");

        System.out.println(stringMyStack.pop());
        System.out.println(stringMyStack.pop());
        System.out.println(stringMyStack.isEmpty());


        System.out.println();
        // Queue
        MyQueue<String> queueMyStack = new MyQueue<>();

        queueMyStack.enqueue("jun");
        queueMyStack.enqueue("su");

        System.out.println(queueMyStack.dequeue());
        System.out.println(queueMyStack.dequeue());
        System.out.println(queueMyStack.isEmpty());

    }
}
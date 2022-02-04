import java.util.Stack;

public class QueueViaStacks {

    public static void main(String[] args) {
        MyQueue t1 = new MyQueue();

        t1.push(1);
        t1.push(2);
        t1.push(3);

        System.out.println(t1.pop());
        System.out.println(t1.pop());
        System.out.println(t1.pop());
        System.out.println(t1.pop());
    }

    private static class MyQueue{
        public Stack<Object> pushes;
        public Stack<Object> pops;
        public int popSize;
        public int pushSize;

        public MyQueue(){
            pushes = new Stack<>();
            pops = new Stack<>();
            popSize = 0;
            pushSize = 0;
        }

        public void push(Object O){
            pushes.push(O);
            pushSize++;
        }

        public Object pop(){
            if (popSize == 0)
                if (pushSize == 0)
                    return null;
                else {
                    while(pushSize > 0){
                        pops.push(pushes.pop());
                        pushSize--;
                        popSize++;
                    }
                }
            popSize--;
            return pops.pop();
        }
    }
}

import java.util.Stack;

public class StackOfPlates {

    public static void main(String[] args) {
        StackStack test1 = new StackStack(3);

        test1.push(1);
        test1.push(2);
        test1.push(3);
        System.out.println(test1.pop());
        System.out.println(test1.pop());
        System.out.println(test1.pop());
        // System.out.println(test1.pop());
    }

    private static class StackStack{
        private final Stack<Stack<Object>> st;
        private final int sizeLimit;
        private int topStackSize;

        private StackStack(int sizeLimit){
            st = new Stack<>();
            st.push(new Stack<>());
            topStackSize = 0;
            this.sizeLimit = sizeLimit;
        }

        private void push(Object O){

            if (topStackSize < sizeLimit) {
                Stack<Object> topStack = st.pop();
                topStack.push(O);
                st.push(topStack);
                topStackSize ++;
            }
            else {
                topStackSize = 0;
                Stack<Object> topStack = new Stack<>();
                topStack.push(O);
                st.push(topStack);
            }
        }

        private Object pop(){

            Stack<Object> topStack = st.pop();

            if (topStackSize == 1) {
                topStackSize = sizeLimit;
                return topStack.pop();
            }
            else {
                topStackSize--;
                Object top = topStack.pop();
                st.push(topStack);
                return top;
            }
        }

        public int getSizeLimit() {
            return sizeLimit;
        }

        public int getTopStackSize() {
            return topStackSize;
        }

        public void setTopStackSize(int topStackSize) {
            this.topStackSize = topStackSize;
        }
    }
}

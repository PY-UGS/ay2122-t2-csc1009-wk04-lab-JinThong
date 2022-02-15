public class StackofIntegers {
    public static void main(String[] args){
        StackofIntegers stack = new StackofIntegers();
        for (int i=0;i<10;i++){
            stack.push(i);
        }
       while (!stack.empty()){
         System.out.print(stack.pop()+" ");
        }
    }
    private int elements[];
            private int size;
        
            public StackofIntegers(){
                this.elements = new int[16];
                this.size = 0;
            }
        
            public StackofIntegers(int capacity){
                this.elements = new int[capacity];
                this.size = 0;
            }
        
            public boolean empty(){
                if(this.size == 0){
                    return true;
                }else {
                    return false;
                }
            }
            public int peek(){
                return this.elements[this.size-1];
            }
        
            public void push(int value){
                this.elements[this.size] = value;
                this.size ++;
        
            }
            public int pop(){
                int value = this.elements[this.size-1];
                this.size--;
                return value;
            }
        
            public int getSize(){
                return size;
            }
}
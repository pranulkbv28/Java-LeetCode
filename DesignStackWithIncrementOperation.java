class CustomStack {
    private final int maxSize;
    private final int[] stack;
    private final int[] inc;
    private int top = -1;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.inc = new int[maxSize];
    }

    public void push(int x) {
        if (top + 1 == maxSize)
            return;
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1)
            return -1;
        int res = stack[top] + inc[top];
        if (top > 0)
            inc[top - 1] += inc[top];
        inc[top] = 0;
        top--;
        return res;
    }

    public void increment(int k, int val) {
        if (top == -1)
            return;
        int idx = Math.min(k - 1, top);
        inc[idx] += val;
    }
}

public class DesignStackWithIncrementOperation {
    // ...existing code...
}

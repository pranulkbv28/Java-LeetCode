import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    private final Deque<Integer> q = new ArrayDeque<>();

    public MyStack() {
    }

    public void push(int x) {
        q.addLast(x);
    }

    public int pop() {
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.addLast(q.removeFirst());
        }
        return q.removeFirst();
    }

    public int top() {
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.addLast(q.removeFirst());
        }
        int res = q.peekFirst();
        q.addLast(q.removeFirst());
        return res;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class ImplementStackUsingQueue {
    // ...existing code...
}

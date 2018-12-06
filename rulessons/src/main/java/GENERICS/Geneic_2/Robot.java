package GENERICS.Geneic_2;

public class Robot<T extends Head> {
    private Body body;
    private T head;

    public <T1, T2> T2  foo(T2 a, T2 b) {
return b;
    }

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
}


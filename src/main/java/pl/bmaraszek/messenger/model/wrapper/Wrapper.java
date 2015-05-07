package pl.bmaraszek.messenger.model.wrapper;

public abstract class Wrapper {
    protected String value;

    public Wrapper(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{ value : " + value + " }";
    }

    public static void main(String... strings) {
        Name n = new Name("sdfas");
        System.out.println(n);
    }

}

class Name extends Wrapper {
    public Name(String value) {
        super(value);
    }
}

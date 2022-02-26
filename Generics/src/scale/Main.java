package scale;

public class Main {
    public static void main(String[] args) {
        Scale scale = new Scale<>(12, 13);

        System.out.println(scale.getHeavier());
    }
}

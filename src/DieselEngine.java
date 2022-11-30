public class DieselEngine implements Engine {
    final String source = "Diesel";
    @Override
    public void start() {
        System.out.println("Br-Br-Br");
    }

    @Override
    public String toString() {
        return "Engines.DieselEngine{" +
                "source='" + source + '\'' +
                '}';
    }
}

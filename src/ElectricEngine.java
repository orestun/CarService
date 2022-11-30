public class ElectricEngine implements Engine {
    final String source = "Electric";
    @Override
    public void start() {
        System.out.println("{without sound}");
    }

    @Override
    public String toString() {
        return "Engines.ElectricEngine{" +
                "source='" + source + '\'' +
                '}';
    }
}

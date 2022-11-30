public class PetrolEngine implements Engine {

    final String source = "Petrol";
    @Override
    public void start() {
        System.out.println("brummm-brummm");
    }

    @Override
    public String toString() {
        return "Engines.PetrolEngine{" +
                "source='" + source + '\'' +
                '}';
    }
}

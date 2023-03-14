public class App {
    public static void main(String[] args) throws Exception {
        Baloon pallone= new Baloon();
        pallone.addAir(100);
        System.out.println(pallone.getRaggio());
        System.out.println(pallone.getSuperfice());
        System.out.println(pallone.getVolume());
    }
}

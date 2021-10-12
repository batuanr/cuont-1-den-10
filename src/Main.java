public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getThread().isAlive()){
                System.out.println("thread is live");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

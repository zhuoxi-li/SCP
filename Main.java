public class Main {
    int tempUserInteraction = 0;
    int posInteraction = 0;
    public static void main(String[] args) {
        Safe scp999 = new Safe("999", "Tickle Monster");
        scp999.initial();
        scp999.addReaction();
        scp999.addReaction();
        scp999.addReaction();
        scp999.listReactions();


    }
}

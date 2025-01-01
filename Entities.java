public class Entities {
    public Safe scp999 = new Safe("999", "Tickle Monster");
    public Safe scp168 = new Safe("168", "CALCULATOR");
    public Euclid scp173 = new Euclid("173", "The Sculpture", true);
    public void initSetup() {
        // SCP 999
        scp999.addPReaction(new String[]{ // positive reactions
            "It moves towards you.",
            "Its arms are outstretched. Seems like it wants a hug.",
            "It giggles.",
            "It wraps around you. It's tickling you."
        });
        scp999.addNReaction(new String[]{ // negative reactions
            "It whimpers.",
            "You watch as it quivers. It seems apologetic.",
        });
        scp999.check(new String[]{
            "It's orange.",
            "Smells... familiar. Like your favorite food.",
            "Sticky.",
            "You feel better just looking at it."
        });

        // SCP 173
        scp173.addPReaction(new String[]{ // positive reactions
            "It's just standing there. Menacingly."
        });
        scp173.addNReaction(new String[]{ // negative reactions
            "You blink. It's suddenly closer.",
            "You blink. It's but a few feet in front of you.",
            "..You don't feel safe."
        });
        scp173.check(new String[]{
            "It's a giant statue. Looks like a peanut.",
            "The containment is filthy. \n" +
                "You ought to send D-Class soon.",
        });

        // SCP 168
        scp168.addPReaction(new String[]{ // positive reactions
            "You plug in \"5 * 5\" and then press the equal sign. \n" +
                "It spits out \"25\" after a few seconds.",
            "You plug in \"24 ÷ 3\" and then press the equal sign. \n" +
                    "It spits out \"8\" after 5 seconds.",
        });
        scp168.addNReaction(new String[]{ // negative reactions
            "You ask why it took so long to respond. \n" +
                "\"OPERATIONS ARE HARD.\" appears on the screen.",
        });
        scp168.check(new String[]{
            "It's just a calculator.",
            "The name \"Eric\" is carved onto the case.",
        });
    }

}

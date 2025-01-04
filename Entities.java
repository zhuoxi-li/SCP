public class Entities {
    public Safe scp999 = new Safe("999", "Tickle Monster");
    public Safe scp168 = new Safe("168", "CALCULATOR");
    public Euclid scp173 = new Euclid("173", "The Sculpture", true);
    public Safe scp_J = new Safe("____-J", "SCP-____-J");
    public Euclid scp096 = new Euclid("096", "SCP-____-J", true);
    public Keter scp055 = new Keter("055", " ", true);
    public Euclid scp049 = new Euclid("049", "Plague Doctor", true);

    public Entities(){
    }

    public Classified[] allSCPS = {
            scp049, scp055, scp096,
            scp168, scp173, scp999, scp_J};
    public void initSetup() {
        // SCP 999
        scp999.addReaction(new String[]{ // positive reactions
            "It moves towards you.",
            "Its arms are outstretched. Seems like it wants a hug.",
            "It giggles.",
            "It wraps around you. It's tickling you."
        });

        scp999.addPReaction(new String[]{ // positive reactions
            "It continues to tickle you.",
            "You gently tell it to stop. It does."
        });

        scp999.addNReaction(new String[]{ // negative reactions
            "You trip and fall. It whimpers as it slides off of you.",
            "You watch as it quivers.",
            "It seems apologetic."
        });
        scp999.check(new String[]{
            "It's orange.",
            "Smells... familiar. Like your favorite food.",
            "Sticky.",
            "You feel better just looking at it."
        });
        scp999.actions(new String[]{
            "1. Hold out a hand.",
            "1. Let yourself fall.",
        });


        // SCP 173
        scp173.addReaction(new String[]{ // positive reactions
            "It's just standing there. Menacingly.",
            "You watch it."
        });
        scp173.addPReaction(new String[]{ // positive reactions
            "It's still not moving.",
            "Good."
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
            "It seems to be made of clay.",
            "Huh. Green eyes."
        });
        scp173.actions(new String[]{
            "1. Wait.",
            "1. Blink."
        });

        // SCP 168
        scp168.addReaction(new String[]{ // positive reactions
            "You introduce yourself. It introduces it as \"CALCULATOR\".",
            "You plug in \"5 * 5\" and then press the equal sign. \n" +
                "It spits out \"25\" after 2 seconds.",
            "You plug in \"24 ÷ 3\" and then press the equal sign. \n" +
                    "It spits out \"8\" after 5 seconds."
        });
        scp168.addPReaction(new String[]{ // positive reactions
                "You tell it that it did well.",
                "It seems proud of itself."
        });
        scp168.addNReaction(new String[]{ // negative reactions
            "It agrees. \n" +
                "You ask why it took so long to respond. \n" +
                    "\"OPERATIONS ARE HARD.\" appears on the screen.",
            "You laugh, shaking your head, closing the door behind you as you leave.",
            "You return to the table flipped over."
        });
        scp168.check(new String[]{
            "It's just a calculator.",
            "The name \"Eric\" is carved onto the case.",
            "Just a normal calculator."
        });
        scp168.actions(new String[]{
            // Choice set 1
            "1. Ask to input a different combo.",
            "1. Ask why it took so long.",
        });

        // SCP-____J
        scp_J.addReaction(new String[]{ // positive reactions
            "It's just there.",
            "It's... just a rock."
        });
        scp_J.addPReaction(new String[]{ // positive reactions
            "Why would you be mad at a rock?",
            "It's just a rock.",
            "You leave the rock alone."
        });
        scp_J.addNReaction(new String[]{ // negative reactions
            "It's making you procrastinate. You swear it is."
        });
        scp_J.check(new String[]{
            "A pet rock in a shoebox. You don't feel like finishing your own thoughts anymo"
        });
        scp_J.actions(new String[]{
            // Choice set 1
            "1. Look at it.",
            "1. Be mad at it."
        });

        // SCP-096
        scp096.addReaction(new String[]{ // positive reactions
            "It sits in the corner with the paper bag over its head.",
            "You stare at it."
        });
        scp096.addPReaction(new String[]{ // positive reactions
            "It's shy. You should respect it's privacy.",
            "Besides, isn't this the thing that caused the 'four fxxking pixels' incident?",
            "Don't take that bag off."
        });
        scp096.addNReaction(new String[]{ // negative reactions
            "You hear soft whimpering from behind the bag.",
            "You are tempted to reach out and take off the bag. \n" +
                "You probably shouldn't do that."
        });
        scp096.check(new String[]{
            "From what you've heard, it's just a shy guy.",
            "From what you've heard, its pale.",
            "From what you've heard, it's thin. Almost emaciated."
        });
        scp096.actions(new String[]{
            "1. Stop and look.",
            "1. Reach out."
        });

        // SCP-055
        scp055.addReaction(new String[]{ // positive reactions
            "It's not there.",
            "What do you mean?"
        });
        scp055.addPReaction(new String[]{ // positive reactions
            "You forget about it.",
        });
        scp055.addNReaction(new String[]{ // negative reactions
            "It's still not there. You get annoyed.",
            "What were you annoyed about again?",
            "You shrug it off."
        });
        scp055.check(new String[]{
            "You try to look for it. \n" +
                "What are you looking at? There's nothing here.",
            "Why are you checking again?",
            "It's... not spherical. What? What's not spherical?",
            "What are you checking, silly? There's nothing to check.",
            "You stare at a corner. Not the corner it's not in. \n" +
                "Not the corner it's in, either.",
            "\"What is it?\" You ask yourself. \n" +
                "No one answers.",
            "This is your first time checking. You see nothing."

        });
        scp055.actions(new String[]{
            "1. Try to remember.",
            "Do you remember what were you doing? You: \n" +
                "1. Do."
        });

        // SCP-049
        scp049.addReaction(new String[]{ // positive reactions
            "\"Ah, salut, savant!\" It greets, smiling behind it's bird mask. \n" +
                "You ask if it can speak English. \n" +
                    "\"Oh! The King's English.\", It responds. Of course, of course I can.",
            "It's quite chatty, flipping from English to Old French when it's excited.",
            "It's excited to meet another Doctor.",
            "It shares its notes with you. You can't read a thing."
        });
        scp049.addPReaction(new String[]{ // positive reactions
            "It seems happy to talk all about it's research.",
            "You actually start to enjoy the talk, even referencing it with your own knowledge.",
        });
        scp049.addNReaction(new String[]{ // negative reactions
            "\"Of course you can't read it. What did I expect?\" It mutters.",
            "It seems to glare at you, muttering about you being infected with 'Pestilence.' \n" +
            "You might want to keep away.",
            "It suddenly approaches you. \"I ought to rid thee of your Pestilence. I ought to cure you.\" \n \n" +
            "You run."

        });
        scp049.check(new String[]{
            "A man in typical medieval plague doctor garb.",
            "It moves elegantly in it's 'Laboratory', its black robes flowing behind it like a cape.",
            "Its eyes are sunken. Creepy."
        });
        scp049.actions(new String[]{
            "1. Listen.",
            "1. You can't read it. Tell it so.",
        });
    }

}

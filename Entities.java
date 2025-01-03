import java.lang.reflect.Array;
import java.util.ArrayList;

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
        scp999.addPReaction(new String[]{ // positive reactions
            "It moves towards you.",
            "Its arms are outstretched. Seems like it wants a hug.",
            "It giggles.",
            "It wraps around you. It's tickling you."
        });
        scp999.addNReaction(new String[]{ // negative reactions
            "It whimpers.",
            "You watch as it quivers. It seems apologetic."
        });
        scp999.check(new String[]{
            "It's orange.",
            "Smells... familiar. Like your favorite food.",
            "Sticky.",
            "You feel better just looking at it."
        });
        scp999.actions(new String[]{
            "> Hold out a hand.",
            "> Ignore it."
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
                "You ought to send D-Class soon."
        });

        // SCP 168
        scp168.addPReaction(new String[]{ // positive reactions
            "You plug in \"5 * 5\" and then press the equal sign. \n" +
                "It spits out \"25\" after a few seconds.",
            "You plug in \"24 ÷ 3\" and then press the equal sign. \n" +
                    "It spits out \"8\" after 5 seconds."
        });
        scp168.addNReaction(new String[]{ // negative reactions
            "You ask why it took so long to respond. \n" +
                "\"OPERATIONS ARE HARD.\" appears on the screen."
        });
        scp168.check(new String[]{
            "It's just a calculator.",
            "The name \"Eric\" is carved onto the case."
        });

        // SCP-____J
        scp_J.addPReaction(new String[]{ // positive reactions
            "It's just there."
        });
        scp_J.addNReaction(new String[]{ // negative reactions
            "It's making you procrastinate. You swear it is."
        });
        scp_J.check(new String[]{
            "A pet rock in a shoebox. You don't feel like finishing your own thoughts anymo"
        });

        // SCP-096
        scp096.addPReaction(new String[]{ // positive reactions
            "It sits in the corner with the paper bag over its head."
        });
        scp096.addNReaction(new String[]{ // negative reactions
            "You are tempted to reach out and take off the bag. \n" +
            "You probably shouldn't do that."
        });
        scp096.check(new String[]{
            "From what you've heard, it's just a shy guy.",
            "From what you've heard, its pale.",
            "From what you've heard, it's thin. Almost emaciated."
        });

        // SCP-055
        scp055.addPReaction(new String[]{ // positive reactions
            "It's not there."
        });
        scp055.addNReaction(new String[]{ // negative reactions
            "It's still not there. You get annoyed. \n" +
            "What were you annoyed about again? \n" +
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
            "\"What is it?\"" + "You ask yourself." +
            "No one answers.",
            "This is your first time checking. You see nothing."

        });

        // SCP-049
        scp049.addPReaction(new String[]{ // positive reactions
            "\"Ah, salut, savant!\" It greets, smiling behind it's bird mask. \n" +
            "You ask if it can speak English." +
            "\"Oh! The King's English.\", It responds. Of course, of course I can.",
            "It's quite chatty, flipping from English to Old French when it's excited.",
            "It's excited to meet another Doctor.",
            "It shares its notes with you. You can't read a thing."
        });
        scp049.addNReaction(new String[]{ // negative reactions
            "It seems to glare at you, muttering about you being infected with 'Pestilence.' \n" +
            "You might want to keep away.",
            "It approaches you. \"I ought to rid thee of your Pestilence. I ought to cure you.\" \n" +
            "You run.",
            "It ignores you."

        });
        scp049.check(new String[]{
            "A man in typical medieval plague doctor garb.",
            "It moves elegantly in it's 'Laboratory', its black robes flowing behind it like a cape.",
            "Its eyes are sunken. Creepy."
        });
    }

}

package org.spunuru.patterns;

import org.spunuru.patterns.model.Game;
import org.spunuru.patterns.model.Game.GameBuilder;;

public class BuilderPattern {

    public static void main(String[] args) {

        Game game = new GameBuilder().homeTeam("Arizona")
                                     .awayTeam("Denver")
                                     .currentYardLine(35)
                                     .stadium("Downtown")
                                     .weather("Hot")
                                     .build();
        
        System.out.println(game.toString());

    }

}

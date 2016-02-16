package org.spunuru.patterns.model;

public class Game {

    //Do not expose setters to make Game immutable.
    
    private String homeTeam;
    private String awayTeam;
    private int currentYardLine;
    private String weather;
    private String stadium;
    
    
    private Game(GameBuilder builder) {
        //Only one private constructor is enforced
        //no one outside should have access to it.
        
        this.homeTeam = builder.homeTeam;
        this.awayTeam = builder.awayTeam;
        this.currentYardLine = builder.currentYardLine;
        this.weather = builder.weather;
        this.stadium = builder.stadium;
    }
    
    @Override
    public String toString() {
        return "GameBuilder [homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", currentYardLine="
                + currentYardLine + ", weather=" + weather + ", stadium=" + stadium + "]";
    }
       
    
    public static final class GameBuilder {
        private String homeTeam;
        private String awayTeam;
        private int currentYardLine;
        private String weather;
        private String stadium;
        
        public GameBuilder homeTeam(String aHomeTeam) {
            homeTeam = aHomeTeam;
            return this;
        }
        
        public GameBuilder awayTeam(String anAwayTeam) {
            awayTeam = anAwayTeam;
            return this;
        }   
        
        public GameBuilder currentYardLine(int aCurrentYardLine) {
            currentYardLine = aCurrentYardLine;
            return this;
        }
        
        public GameBuilder weather(String someWeather) {
            weather = someWeather;
            return this;
        }        
        
        public GameBuilder stadium(String aStadium) {
            stadium = aStadium;
            return this;
        }        
        
        public Game build() {
            if (homeTeam == null) {
                throw new IllegalStateException("no home team");
            }
            if (awayTeam == null) {
                throw new IllegalStateException("no away Team");
            }
            if (currentYardLine == 0) {
                throw new IllegalStateException("no currentYardLine");
            }
            if (weather == null) {
                throw new IllegalStateException("no weather");
            }
            if (stadium == null) {
                throw new IllegalStateException("no stadium");
            }
            return new Game(this);
        }

    }
    
    
}

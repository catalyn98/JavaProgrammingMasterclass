package _38.GenericsClasses;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer alex = new BaseballPlayer("Alex");
        SoccerPlayer david = new SoccerPlayer("David");

        Team<FootballPlayer> footballPlayerTeam1 = new Team<>("Football team 1");
        footballPlayerTeam1.addPlayer(joe);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Baseball team");
        baseballPlayerTeam.addPlayer(alex);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer team");
        soccerPlayerTeam.addPlayer(david);

        System.out.println("_".repeat(30));
        System.out.println(footballPlayerTeam1.numPlayers());
        System.out.println(baseballPlayerTeam.numPlayers());
        System.out.println(soccerPlayerTeam.numPlayers());

        Team<FootballPlayer> footballPlayerTeam2 = new Team<>("Football team 2");
        Team<FootballPlayer> footballPlayerTeam3 = new Team<>("Football team 3");

        footballPlayerTeam2.matchResult(footballPlayerTeam3, 1, 0);
        footballPlayerTeam2.matchResult(footballPlayerTeam1, 3, 8);

        footballPlayerTeam3.matchResult(footballPlayerTeam1, 2, 1);
        footballPlayerTeam3.matchResult(footballPlayerTeam2, 1, 1);

        System.out.println("Rankings");
        System.out.println(footballPlayerTeam1.getName() + ": " + footballPlayerTeam1.ranking());
        System.out.println(footballPlayerTeam2.getName() + ": " + footballPlayerTeam2.ranking());
        System.out.println(footballPlayerTeam3.getName() + ": " + footballPlayerTeam3.ranking());

        System.out.println(footballPlayerTeam1.compareTo(footballPlayerTeam2));
        System.out.println(footballPlayerTeam2.compareTo(footballPlayerTeam1));
        System.out.println(footballPlayerTeam3.compareTo(footballPlayerTeam1));

        League<Team<FootballPlayer>> firstLeague = new League<>("First league");
        firstLeague.addLeague(footballPlayerTeam1);
        firstLeague.addLeague(footballPlayerTeam2);

        firstLeague.showLeagueTable();
    }
}
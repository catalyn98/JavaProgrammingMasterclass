package GenericsClasses_38;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addLeague(T team) {
        if(league.contains((team))) {
            System.out.println(team.getName() + " is already added");
            return false;
        } else {
            league.add(team);
            System.out.println("[" + team.getName() + "] " + " was added");
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}


public class player {
	
	/*class Player
    playerName,  country, skills



class PlayerBO



void displayPlayerdetails(Player [])
void displayPlayerByCountry(Player [], String country)



Sample Input 1
Enter the no of Player u want to store
3
Player1
Player name
Virat
country
  India
skills
 Batasman
Player 2
Watson

<display here all the player>
Enter the Country whose player need to display
India
Virat India  Batsma
Hardik  India  Allrounder*/
	
	private String playerName;
	private String country;
	private String skills;
	public player(String playerName, String country, String skills) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.skills = skills;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "player [playerName=" + playerName + ", country=" + country + ", skills=" + skills + "]";
	}
	
	
	

}


public class CommunityChestAndChance extends Squares{
	public CommunityChestAndChance(String n, int o) {
		setName(n);
		setOwnerId(o);
		
	}
	public static void landedOnCommunityChest()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you landed on Community Chest.");
	}
	public static void landedOnChance()
	{
		System.out.println(MonoplyStartGame.players.get(MonoplyStartGame.currentPlayer).getName() + " you landed on Chance.");
	}
	

}

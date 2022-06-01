import java.util.HashMap;
public class MonsterRegistry{
	static HashMap<String ,Monster> monsterlist = new HashMap<>();
	static Monster getmonster(String id){
		Monster m = monsterlist.get(id);
		return ((Monster)m.clone());
	}
	static void loadData(){
		BirdMonster bm = new BirdMonster(" Bird Monster ");
		bm.setid("1");
		monsterlist.put(bm.getid(),bm);
		FishMonster fm = new FishMonster(" Fish Monster ");
		fm.setid("2");
		monsterlist.put(fm.getid(),fm);
	}
}
package teamoort.Redoxiation.proxy;

import teamoort.Redoxiation.Redoxiation;

public class CommonProxy {
	public void registerTileEntitySpecialRenderer(){method();}
	
	private void method(){
		if(Redoxiation.dummybool == true)
			Redoxiation.logger.info("Tileentity proxy complete. Starting Recipe & Smelting ");
		else
			Redoxiation.logger.info("Tileentity proxy complete. Starting World Generator");
	}
}
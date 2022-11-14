package robots;

import io.Case;
import io.Carte;
import io.NatureTerrain;

public class RobotAPattes extends Robot {
	
	public RobotAPattes(Case position, Carte carte) {
		super(position, 30, 2000,"PATTES", carte);
	}


	@Override
	public int getVitesse(NatureTerrain nature) {
		return (nature == NatureTerrain.ROCHE ? 10 : 30);
	}

	@Override
	public boolean peutDeplacer(NatureTerrain terrain) {
		return !(terrain == NatureTerrain.EAU);
	}

	@Override
	public String getNameRobot() {
		return "Robot a pattes";
	}
	
}

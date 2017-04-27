package PlaneIdentification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdentificationRunner {
	static int[] Einfo;
	static int[] Tinfo;
	static List<PlaneDB> planes;

	public static void main(String[] args) {
		IdentificationRunner ID = new IdentificationRunner();
		setAirplaneData();
		EngineInformation EI = new EngineInformation();
		Einfo = EI.start();
		// for(int i:Einfo){
		// System.out.println(i);
		// }
		TailInformation TI = new TailInformation();
		Tinfo = TI.start();
		matchEngine();
	}

	public static void matchEngine() {
		ArrayList<String> possibleplanes = new ArrayList<String>();
		for (PlaneDB j : planes) {

			if (j.getEjet() == Einfo[0] && j.getEnum() == Einfo[1] && j.getEstat() == Einfo[2]) {
				possibleplanes.add(j.getName());
			}
		}
		System.out.println("Possible Planes Based On Engine Info:");
		for (String i : possibleplanes) {
			System.out.println(i);
		}

	}

	public static void setAirplaneData() {

		PlaneDB F15 = new PlaneDB();
		F15.setName("F15");
		F15.setEjet(0);
		F15.setEnum(2);
		F15.setEstat(1);

		////
		PlaneDB F16 = new PlaneDB();
		F16.setName("F16");
		F16.setEjet(0);
		F16.setEnum(1);
		F16.setEstat(1);
		////
		PlaneDB F18 = new PlaneDB();
		F18.setName("F18");
		F18.setEjet(0);
		F18.setEnum(2);
		F18.setEstat(1);
		////
		PlaneDB F22 = new PlaneDB();
		F22.setName("F22");
		F22.setEjet(0);
		F22.setEnum(2);
		F22.setEstat(1);
		////
		PlaneDB F35 = new PlaneDB();
		F35.setName("F35");
		F35.setEjet(0);
		F35.setEnum(2);
		F35.setEstat(1);
		/////
		PlaneDB A10 = new PlaneDB();
		A10.setName("A10");
		A10.setEjet(0);
		A10.setEnum(2);
		A10.setEstat(2);
		/////
		planes = Arrays.asList(F15, F16, F18, F22, F35, A10);

	}
}

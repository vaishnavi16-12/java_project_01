package objectmodelingInheritance;

public class PlayableMain {
	public static void main(String[] args) {
		Playable [] instruments = {new Guiter(), new Piano(),new Guiter()};
  for (Playable instrument : instruments) {
	  instrument.play();
  }
}
}

import java.util.Random;
class Die{
	public static int rollingdie(){
		return new Random().nextInt(6)+1;
	}
}

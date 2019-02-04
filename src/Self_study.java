
public class Self_study {
	private int getal1;
	private int getal2;
	public Self_study() {
//		nothing intialised yet
	}
	public void forLoop() {
		for(int i= 1; i<11;i++) {
			System.out.println(i);
		}
	}
	public void whileloop() {
		int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
	}
	public void optellen(int gt1,int gt2) {
		int resultaat = gt1 + gt2;
		System.out.println("gt1 = " + gt1);
		System.out.println("gt1 = " + gt2);
		System.out.println("De som is: " + resultaat);
	}
}


public class Self_study_1 {
	public Self_study_1() {
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
	public int totalLoop() {
		int result = 0;
		for(int i = 0; i<=39;i++) {
			result = i + result;
		}
		return result;
	}
	public double random() {
		double getal = Math.random();
		return getal;
	}
	
	public void sawLoop() {
		for(int i = 0;i<4;i++) {
			if((i%2)==0) {
				System.out.println("s");
			}else {
				System.out.println("ss");
			}
		}
	}
	//the function below is handled in the lessons as slide
	public void optellen(int gt1,int gt2) {
		int resultaat = gt1 + gt2;
		System.out.println("gt1 = " + gt1);
		System.out.println("gt1 = " + gt2);
		System.out.println("De som is: " + resultaat);
	}
}

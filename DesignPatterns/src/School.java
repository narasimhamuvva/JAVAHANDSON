
public class School {
	int English;
	int  Math;
	public float average;
	public int getEnglish() {
		return English;
	}
	public School setEnglish(int english) {
		this.English = english;
		return this;
		
	}
	public int getMath() {
		return Math;
	}
	public School setMath(int math) {
		this.Math = math;
		return this;
	}
	public School build()
	{
		average=(Math+English)/2;
		return this;
	}


}

package diginori.study;

public enum JobCode {
	superman(1),candy(2);
	private final int value;
	JobCode(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}

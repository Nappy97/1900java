package day11.src.project;

class Human {
	char type; // 성별

	public Human() {
		this.type = 0;
	}
	
	public Human(char type) {
		this.type = type;
	}
	
	// getter
	public char getType() {
		return type;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}
}
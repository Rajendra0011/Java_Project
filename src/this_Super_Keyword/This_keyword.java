package this_Super_Keyword;

public class This_keyword {

	int x,y;

//	This_keyword(int x,int y){
//
//		this.x=x;
//		this.y=y;
//	}

	void setData(int x,int y) {
		this.x=x;
		this.y=y;
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {

//		This_keyword th= new This_keyword(10, 90);
		This_keyword th= new This_keyword();
		th.setData(20, 10);
		th.display();

	}

}

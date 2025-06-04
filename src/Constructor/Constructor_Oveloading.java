package Constructor;

public class Constructor_Oveloading {

	double width, height, depth;

	Constructor_Oveloading() {
		width = height = depth = 0;

	}

	Constructor_Oveloading(double w, double h, double d) {

		width = w;
		height = h;
		depth = d;

	}
	Constructor_Oveloading(double len){

		width = height = depth = len;

	}


	double volume() {

//		System.out.println(width* height*depth);

		return (width* height*depth);
	}

}

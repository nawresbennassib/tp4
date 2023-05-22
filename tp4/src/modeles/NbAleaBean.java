package modeles;

public class NbAleaBean {
	private  double x;

	public NbAleaBean () {
		setX(0);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	public  double calculRandom(double x){
		return Math.random()*x;
	}

}

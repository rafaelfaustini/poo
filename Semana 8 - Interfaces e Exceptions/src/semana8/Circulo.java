package semana8;

public class Circulo implements IShow,IShape {
	
    double raio;
    
    public Circulo(double raio){
    	this.raio = raio;
    }
    
	@Override
	public double getArea() {
		return 3.14*(raio*raio);
	}

	@Override
	public double getPerimetro() {
		return 2*3.14*raio;
	}

	@Override
	public void print() {
		 System.out.printf("Circulo - A área é: %.2f \n", getArea());
		 System.out.printf("Circulo - O perímetro é: %.2f \n", getPerimetro());
	}

}

package semana8;

public class Retangulo implements IShape,IShow{
	
	private double altura;
	private double largura;

    public Retangulo(double altura , double largura){
    	this.altura = altura;
    	this.largura = largura;
    }
	@Override
	public double getArea() {
		return altura*largura;
	}
	@Override
	public void print(){
    System.out.printf("Retangulo - A área é: %.2f \n", getArea());
    System.out.printf("Retangulo - O perímetro é: %.2f \n", getPerimetro());
	}
	@Override
	public double getPerimetro() {
		return 2*(altura + largura);
	}

}

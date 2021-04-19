package facade;

public class ShapeFacade {
	
	
	private Shape circle;
	private Shape square;
	private Shape rectangle;
	public ShapeFacade() {
	this.circle= new Circle();
	this.square= new Square();
	this.rectangle=new Rectangle();
	}
	
	public void drawCircle() {
		//TODO complexity for drawing a circle goes here
		//..
		//...
		//....
		this.circle.draw();
	}
	public void drawSquare() {
		//TODO complexity for drawing a square goes here
		//..
		//...
		//....
		this.square.draw();
		}
		
		public void drawRectangle() {
		//TODO complexity for drawing a rectangle goes here
		//..
		//...
		//....
		this.rectangle.draw();
	}

}

package facade;

public class FacadeMain {

	public static void main(String[] args) {
	ShapeFacade shapeFacade=new ShapeFacade();
	
	
	shapeFacade.drawCircle();
	shapeFacade.drawSquare();
	shapeFacade.drawRectangle();

	}

}

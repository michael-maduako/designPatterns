package com.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory= FactoryProducer.getFactory("SHAPE");
		//Get an object of shape Circle
		Shape shape1= shapeFactory.getShape("CIRCLE");
		//Call draw method of Shape Circle
		shape1.draw();
		//Get an object of shape Rectangle
		Shape shape2= shapeFactory.getShape("RECTANGLE");
		//Call draw method of Shape Rectangle
		shape2.draw();
		//Get an object of shape Square
		Shape shape3= shapeFactory.getShape("SQUARE");
		//Call draw method of Shape Square
		shape3.draw();
		
		
		//Get color factory
		AbstractFactory colorFactory= FactoryProducer.getFactory("COLOR");
		//Get an object of color red
		Color color1= colorFactory.getColor("RED");
		//call fill method of Red
		color1.fill();
		//Get an object of color blue
		Color color2= colorFactory.getColor("BLUE");
		//call fill method of blue
		color2.fill();
		//Get an object of color green
		Color color3= colorFactory.getColor("GREEN");
		//call fill method of green
		color3.fill();
		
	}

}

package Phoebe;

import java.awt.Point;

/**
*  
*/
public class VelocityVector {
	
	private Point direction;
	private int velocity;
	
	/**
	 *
	 * @param  
	 * @param  
	 * @param  
	 */
	public VelocityVector(int n, Point p, int v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"constructor()");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"constructor()");
		//
	}
	
	/**
	 *
	 * @param  
	 * @param  
	 */
	public void setDirection(int n, Point p){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"setDirection(Point)");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"setDirection(Point)");
		//
	}
	
	/**
	 *
	 * @param  
	 * @param  
	 */
	public void setVelocity(int n, int v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"setVelocity(int)");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"setVelocity(int)");
		//
	}
	
	/**
	 *
	 * @param  
	 */
	public Point getDirection(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getDirection() : Point");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getDirection() : Point");
		//
		return direction;
	}
	
	
	/**
	 *
	 * @param  
	 */
	public int getVelocity(int n){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"getVelocity() : int");
		//
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"getVelocity() : int");
		//
		return velocity;
	}
	
	/**
	 *
	 * @param  
	 * @param  
	 */
	public void add(int n, VelocityVector v){
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println(this.toString()+"add(VelocityVector)");
		//
		
		//To do
		
		//
		for(int i=0;i<n;++i)
			System.out.print("\t");
		System.out.println("ret "+this.toString()+"add(VelocityVector)");
		//
	}
	
	/**
	 *
	 */
	public String toString(){
		return "VelocityVector.";
	}
	
}

package Java語言程序設計基礎篇.Exercise_10.Exercise_10_13;

/**********************************************************************
*                          MyRectangle2D                              *
*---------------------------------------------------------------------*
* -x: double                                                          *
* -y: double                                                          *
* -width: double                                                      *
* -height: double                                                     *
* +MyRectangle2D()                                                    *
* +MyRectangle2D(x: double, y: double, width: double, height: double) *
* +setX(x: double )                                                   *
* +setY(y: double)                                                    *
* +getX(): double                                                     *
* +getY(): double                                                     *
* +setHeight(heigth: double)                                          *
* +setWidth(width: double)                                            *
* +getHeight(): double                                                *
* +getWidth(): double                                                 *
* +getArea(): double                                                  *
* +getPermeter(): double                                              *
* +contains(r: MyRectangle2D)                                         *
* +contains(x: double, y: double)                                     *
* +overlaps(r: MyRectangle2D)                                         *
**********************************************************************/

// Implement MyRectangle2D class
public class MyRectangle2D {
	// Data fields
	private double x;
	private double y;
	private double width;
	private double height;

	// Constructors
	/** Creates a default rectangle with (0, 0)  
	*   for (x, y) and 1 for both width and height */
	MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	/** Creates a rectangle with the specified x, y, width, and height */
	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods
	/** Set x to specified point */
	public void setX(double x) {
		this.x = x;
	}

	/** Set y to specified point */
	public void setY(double y) {
		this.x = y;
	}

	/** Return x */
	public double getX() {
		return x;
	}

	/** Return y */
	public double getY() {
		return y;
	}

	/** Set width to specified length */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Set heigth to specified length */
	public void setHeight(double height) {
		this.height = height;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Returns the area of the rectangle */
	public double getArea() {
		return width * height;
	}

	/** Returns the perimeter of the rectangle */
	public double getPerimeter() {
		return 2 * (width + height);
	}

	/** Returns true if the specified point(x, y) 
	*   is inside the rectangle */
	public boolean contains(double x, double y) {
		return getDistance(this.y, y) <= height / 2 && 
				 getDistance(this.x, x) <= width / 2; 
	}

	/** Returns true if the specified 
	*   rectangle is inside this rectangle */
	public boolean contains(MyRectangle2D r) {
		return 
			getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 && 
		 	getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
			height / 2 + r.getHeight() / 2 <= height &&
		 	width / 2 + r.getWidth() / 2 <= width;
	}

	/** Returns true if the specified rectangle 
	*   overlaps with this rectangle */
	public boolean overlaps(MyRectangle2D r) {
		return !contains(r) &&
				 ((x + width / 2 > r.getX() - r.getWidth()) ||
				 (y + height / 2 > r.getY() - r.getHeight())) &&
		  		 (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) && 
				 (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
	}

	/** Return distance */
	private double getDistance(double p1, double p2) {
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
}
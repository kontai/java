package 接口interface.Comparable接口.Mysort;

import 抽象類.Geometric.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>
{
    public ComparableRectangle(double width,double height)
    {
        super(width,height);
    }

    @Override
    public int compareTo(ComparableRectangle o)
    {
        if(getArea()>o.getArea())
            return 1;
        if(getArea()<o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" Area: "+getArea();
    }
}

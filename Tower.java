
public class Tower {
	
	public Tower()
	{
		super();
	}
	
	public Tower(int id, String name, double height, int sides, Site site)
	{
		this.id = id;
		this.name = name;
		this.height = height;
		this.sides = sides;
		this.site = site;
	}
	
	private int id;
	private String name;
	private double height;
	private int sides;
	private Site site;
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int value)
	{
		this.id = value;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String value)
	{
		this.name = value;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setHeight(double value)
	{
		this.height = value;
	}
	
	public int getSides()
	{
		return this.sides;
	}
	
	public void setSides(int value)
	{
		this.sides = value;
	}
	
	public Site getSite()
	{
		return this.site;
	}
	
	public void setSite(Site value)
	{
		this.site = value;
	}
}

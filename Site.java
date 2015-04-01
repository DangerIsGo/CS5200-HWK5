
public class Site {
	public Site()
	{
		super();
	}
	
	public Site(int id, String name, double lat, double longitude)
	{
		this.id = id;
		this.name = name;
		this.longitude = longitude;
		this.latitude = lat;
	}
	
	private int id;
	private String name;
	private double latitude;
	private double longitude;
	
	public int getID()
	{
		return this.id;
	}
	
	public void setID(int value)
	{
		this.id = value;
	}
	
	public String Name()
	{
		return this.name;
	}
	
	public void setName(String value)
	{
		this.name = value;
	}
	
	public double getLat()
	{
		return this.latitude;
	}
	
	public void setLat(double value)
	{
		this.latitude = value;
	}
	
	public double getLong()
	{
		return this.longitude;
	}
	
	public void setLong(double value)
	{
		this.longitude = value;
	}
}

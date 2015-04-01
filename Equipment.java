
public class Equipment {
	
	public Equipment()
	{
		super();
	}
	
	public Equipment(int id, String name, String brand, String desc, double price, Tower tower)
	{
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = desc;
		this.price = price;
		this.tower = tower;
	}
	
	private int id;
	private String name;
	private String brand;
	private String description;
	private double price;
	private Tower tower;
	
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
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public void setBrand(String value)
	{
		this.brand = value;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String value)
	{
		this.description = value;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double value)
	{
		this.price = value;
	}
	
	public Tower getTower()
	{
		return this.tower;
	}
	
	public void setTower(Tower value)
	{
		this.tower = value;
	}
}

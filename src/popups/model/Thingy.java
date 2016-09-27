package popups.model;

public class Thingy
{

	private int number;
	private double value;
	private String words;
	private boolean isValid;
	
	//no constructor
	//getters and setters here
	
	public int getnumber()
	{
		return number;
	}
	public double getvalue()
	{
		return value;
	}
	public String getwords()
	{
		return words;
	}
	public boolean getisValid()
	{
		return isValid;
	
	
	}

	
	public void setnumber(int number)
	{
		this.number = number;
	}
	public void setvalue(double value)
	{
		this.value = value;
	}
	public void setwords(String words)
	{
		this.words = words;
	}
	public void setisValid(boolean isValid)
	{
		this.isValid = isValid;
	}
	
}

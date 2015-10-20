
public class DbConnect {
	private static volatile DbConnect instance;
	private DbConnect()
	{}
	public static DbConnect getinstance()
	{
		if(instance==null)
		{
			//instance = new DbConnect();
			//return instance;
			return new DbConnect();
		}
		return instance;
		
	}

}

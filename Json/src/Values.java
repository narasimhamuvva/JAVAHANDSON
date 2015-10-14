import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Vector;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Values {
	
	private Vector<String> cards=new Vector<String>();  
	 void fetchmessages() throws IOException
	 {
		URL urlObj=new URL("http://api.icndb.com/jokes/random/10");
		HttpURLConnection request=(HttpURLConnection) urlObj.openConnection();
		request.connect();
		
		JsonParser jp=new JsonParser();
		JsonElement root;
		
		root=jp.parse(new InputStreamReader((InputStream ) request.getContent()));
		
		JsonObject rootobj= root.getAsJsonObject();
		JsonArray messages= rootobj.get("value").getAsJsonArray();
		
	for(JsonElement message:messages){
		JsonObject msg=message.getAsJsonObject();
		cards.add(msg.get("joke").getAsString());
	}
	 }
	 public Vector<String> getcards() {
		return cards;
	}
	  

public void dispaly(int choice)
{
	System.out.println(cards.get(choice));
		   


}
	}
	


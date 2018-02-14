package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


//create class TuneBook
public class TuneBook
{
  //create my tunes array ArrayList
  private ArrayList<Tune> tunes = new ArrayList<Tune>();
  

	 public TuneBook(String s)
	 {
	 	BufferedReader inputStream = null;

	  	try 
	  	{
	        inputStream = new BufferedReader(new FileReader("s"));
	    	
	    	Tune tune = new Tune();
	    	String l;
	    	boolean titleSet = false;
	    	boolean firstTune = false;    
	        
	        while ((l = inputStream.readLine()) != null)
	        {
	            if(l.startWith("X:"))
	            {
	            	if(!firstTune)
	            	{
	            		tunes.add(tune);
	            	}
	            	
	            	firstTune = false;
		            titleSet = true;
		            tune = new Tune();
	            }

	            if (l.startsWith("X:")) 
	            {
		            // If there is a title
		            tune.setX(Integer.parseInt(l.substring(2)));
		        } 
		        else if (l.startsWith("T:")) 
		        {
		            // If the title is set, set the altitle
		            if (!titleSet) 
		            {
		              tune.setTitle(l.substring(2));
		              titleSet = true;
		            } 
		            else 
		            {
		              tune.setAltTitle(l.substring(2));
		            }
		         
	        	}
	        	tune.addNoation(l + "\n");
	        }
	        
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    } 
	    finally 
	    {
	        if (inputStream != null) {
	            try
	            {
	                inputStream.close();
	            }
	            catch(Exception e)
	            {
	                e.printStackTrace();
	            }
	        }
	  	}
	 }

	public String toString() 
	{
    String s = "";

    for (Tune t : tunes) {
      s += t;
      s += "\n";
    }

    return s.toString();
  	}

  	public Tune findTune(String matchingTitle) 
  	{
	    for (Tune t : tunes) 
	    {
		      if (t.getTitle().toLowerCase().contains(matchingTitle.toLowerCase())) 
		      {
		        // I use toLowerCase to make it case insensitive
		        return t;
		      }
	    }

    // If there isn't any, return null
    return null;
  }


}

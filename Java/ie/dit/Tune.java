package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Tune implements Player
{
  	private int x;
  	private String title, altTitle, notation;


  	public Tune()
  	{
  		this.x = x;
  		this.title = title;
  		this.altTitle = altTitle;
  		this.notation = notation;
  	}

  	// to set this.x
	  public void setX(int x) {
	    this.x = x;
	  }

	  // to set this.title
	  public void setTitle(String title) {
	    this.title = title;
	  }

	  // to set this.altTitle
	  public void setAltTitle(String altTitle) {
	    this.altTitle = altTitle;
	  }

	  // to set this.notation
	  public void setNotation(String notation) {
	    this.notation = notation;
	  }


  	public String getX()
  	{
  		return this.x;
  	}

  	public String getTitle()
  	{
  		return this.title;
  	}

  	public String getAltTitle()
  	{
  		return this.altTitle;
  	}

  	public String getNotation()
  	{
  		return this.notation;
  	}

  	public String toString()
  	{
  		System.out.println(this.notation);
  	}

  	public void play()
  	{
  		System.out.printnl(this.notation);
  	}
}

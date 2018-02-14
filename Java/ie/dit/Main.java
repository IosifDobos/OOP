package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;




public class Main
{
  public static void main(String[] args) {
  	
  	TuneBook newtb = new TuneBook(System.getProperty("user.dir") + "file.abc");

  	newtb.findTune("A").play();
  }
}

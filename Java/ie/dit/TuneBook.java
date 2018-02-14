package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReade;


//create class TuneBook
public class TuneBook implements Tune
{
  //create my tunes array ArrayList
  ArrayList<Tune> tunes = new ArrayList<Tune>();

  public TuneBook()
  {
    loadTune();
  }


}

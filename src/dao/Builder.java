package dao;
public enum Builder { 

	FENDER,OLSON, PRS,MARTIN, ANY;

  public String toString() {
    switch(this) {
      case FENDER:   return "Fender";
      case OLSON:    return "Olson";
      case PRS :     return "PRS";
      case MARTIN:   return "Martin";
      default:       return "Unspecified";
    }
  }
}

		

	
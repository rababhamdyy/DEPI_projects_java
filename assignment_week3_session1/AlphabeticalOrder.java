public class AlphabeticalOrder {
 public static void main(String[] args) {

  //input cities
  String firstCity = System.console().readLine("Enter first city : ");
  String secondCity = System.console().readLine("Enter second city : ");
  String thirdCity = System.console().readLine("Enter third city : ");

  String [] cities = {firstCity, secondCity, thirdCity};
  
  String citiesTemp;
  
  //swapping cities
  for(int i=0; i < cities.length ; i++){
    for(int j=i+1; j < cities.length ; j++){

      if (cities[i].compareToIgnoreCase(cities[j]) > 0) {

        citiesTemp = cities[i];
        cities[i] = cities[j];
        cities[j] = citiesTemp;
      }
    }
  }
  
  //print output
  System.out.println("\nCities in alphabetical order is : ");
  for(int i=0; i < cities.length ; i++){
    System.out.println(cities[i].toLowerCase());
  }
 } 
}

// BikeFactory.java
package com.kp.factory;
import com.kp.comps.Bike;
import com.kp.comps.BikeTyres;
import com.kp.comps.Model1Bike;
import com.kp.comps.Model2Bike;
import com.kp.comps.Model3Bike;

public class BikeFactory {

   // static factory method
   public static Bike getBike(BikeType type) {

      // variables
      Bike bike = null;

      // create BikeTyres object
      BikeTyres tyres = new BikeTyres();
      if(type==BikeType.MODEL1) {
         bike = new Model1Bike(tyres);
      } else if(type==BikeType.MODEL2) {
         bike = new Model2Bike(tyres);
      } else if(type==BikeType.MODEL3) {
         bike = new Model3Bike(tyres);
      } else {
         throw new IllegalArgumentException("Invalid Bike Model");
      }

      // assemble the bike
      bike.assemble();
      // road test
      bike.roadTest();
      
      // return
      return bike;
   }
}

package com.company;

import com.company.SolarSystem;

public class Main {
    public static void main(String[] args) {
        // write your code here
        SolarSystem FactorX = new SolarSystem();
        FactorX.Sun = "1";
        FactorX.Moon = "4";
        FactorX.Planet = "2";
        FactorX.Star = "10000";

        //        adding features to our sun
        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";

        // adding the features for star in the solar system
        FeatureStars Facx = new FeatureStars();
        Facx.color = "green";
        Facx.size = "7y453y879";

        // adding features for planet 2
        Planet2 Oslo = new Planet2();
        Oslo.color = "pink";
        Oslo.size = "93465 cm";
        Oslo.name = "Oslo";

        // adding features to planet 1
        Planet1Features GulK = new Planet1Features();
        GulK.color = "blue";
        GulK.size = "23768356 km";
        GulK.name = "preacher";

    }
}

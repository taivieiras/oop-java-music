package com.company;
import java.util.ArrayList;

public class OrchestraPit {

    private ArrayList<Orchestra> instrumentalsList = new ArrayList<Orchestra>();


    public OrchestraPit() {
        Message.DebugMessage("Creating a Orchestra Pit");
    }

    public void MainOrchestra(Orchestra bandInstruments) {
        instrumentalsList.add(bandInstruments); //
    }

    public Double CalculateRevenue() {
        Double chargeEntrance = 7.00;
        Double totalRevenue = 0.0;

        for (Orchestra currentCar : instrumentalsList) {
            Message.DebugMessage(String.format("Calculating for %s : %s", Violin.brand(), Violin.getType()));
            totalRevenue += chargeEntrance;

        }

        return totalRevenue;
    }

    @Override
    public String toString() {

        return String.format("There is more %d tickets and you can get 1 for %f", instrumentalsList.size(), CalculateRevenue());
    }
}
package org.example;

public class Park {

    public class Attraction {
        private String attractionName;
        private String workTimeOfAttraction;
        private int priceOfATicket;

        public Attraction(String attractionName, String workTimeOfAttraction, int priceOfATicket) {
            this.attractionName = attractionName;
            this.workTimeOfAttraction = workTimeOfAttraction;
            this.priceOfATicket = priceOfATicket;
        }

        public void printAttractionInfo() {
            System.out.println("Название аттракциона: " + attractionName + "; " + "Время работы аттракциона: " + workTimeOfAttraction + "; " + "Стоимость билета: " + priceOfATicket + " руб.");
        }
    }
}


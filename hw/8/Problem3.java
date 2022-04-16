import java.util.*;

public class Problem3 
{
    public static void main(String[] args) 
    {

        //main class given to me by the professor
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
           new GregorianCalendar(2014, 4, 5, 5, 5, 0),
           new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235",
           new GregorianCalendar(2014, 4, 5, 6, 55, 0),
           new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237",
           new GregorianCalendar(2014, 4, 5, 9, 35, 0),
           new GregorianCalendar(2014, 4, 5, 12, 55, 0)));

        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTime());
        System.out.println(itinerary.getTotalFlightTime());
    }

    static class Flight
    {
        //private variables
        private String flightNo;
        private GregorianCalendar departureTime;
        private GregorianCalendar arrivalTime;
        //flight class constructor
        Flight(String FNo,GregorianCalendar Dtime ,GregorianCalendar Atime )
        {
            this.flightNo = FNo;
            this.departureTime = Dtime;
            this.arrivalTime = Atime;
        }

        //getters
        public String getFlightNo()
        {
            return flightNo;
        }
        public GregorianCalendar getDepartureTime()
        {
            return departureTime;
        }
        public GregorianCalendar getArrivalTime()
        {
            return arrivalTime;

        }
        public Long getFlightTime()
        {
            return (long)(arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis())/60000;

        }

        //setters
        public void setDepartureTime(GregorianCalendar DepTime)
        {
            this.departureTime = DepTime;
        }
        public void setArrivalTime(GregorianCalendar ArrTime)
        {
            this.arrivalTime = ArrTime;
        }

    }

    static class Itinerary
    {
        //variables
        private List<Flight> flights;
        //class contructor
        public Itinerary(List<Flight> flights) 
        {
            this.flights = flights;
        }
        //getters
        public long getTotalFlightTime()
        {
            long flightTime = 0;
            for(Flight i:flights)
            {
                flightTime += i.getFlightTime();
            }
            return flightTime;
        }
        public long getTotalTime()
        {
            return (flights.get(flights.size()-1).getArrivalTime().getTimeInMillis() - flights.get(0).getDepartureTime().getTimeInMillis())/60000;
        }
    }


    
}

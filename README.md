# TravelTimeCalculator

- Travel Time Calculator allows user to enter distance in miles and miles per hours, then the application will calculate time and output results in hours & minutes (whole integer) using integer arithmetic and division and modulus operators.

- This calculator uses integer arithmetic, division, and modulus (to get remaining minutes after it calculators the hours)

# SAMPLE OF CALCULATION's LOGIC

    double hours = miles / mph; --example user enters: 3.0769 = 200 / 65
    // get number of minutes as an int
    int minutes = (int) (hours * 60); -- cont's with above example: 3.0769x60 = 184.61538 mins

    // use integer arithmetic to get hours and minutes as int values
    int hoursInt = minutes / 60; -- con't: 3.0769 = 184.61538 / 60 -- int type, Java output 3
    minutes = minutes % 60; -- con't: 4.615 = 0.0769 x 60 -- because this is int type, Java output 4

public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision international1 =
                new InternationalDivision(
                        "Global Tech",
                        1957,
                        "Japan",
                        "Japanese");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Euro Sales",
                        1967,
                        "Germany",
                        "German");

        DomesticDivision domestic1 =
                new DomesticDivision(
                        "East Coast Sales",
                        1996,
                        "New York");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "West Coast Operations",
                        1962,
                        "California");

        international1.display();
        international2.display();

        domestic1.display();
        domestic2.display();
    }
}

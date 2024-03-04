public class size{
    public static void main (String [] args) {
        //Arrays used in parallel to store country name and population.
        String[] countries = {"China", "India", "United States", "Russia", "Brazil", "Japan", "Germany", "Turkey", "France", "South Africa", "United Kingdom", "Kenya"};
        int[] population = { 1409670000, 1392329000, 335893238, 146424729, 203080756, 124090000, 84607016, 85372377, 68373000, 62027503, 67026292, 51526000 };

        // Using loop to print each country's name and population.
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i] +": " + population[i]);
        }
    }
}
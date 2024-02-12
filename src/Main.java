public class Main {
    public static void main(String[] args) {
        Pasport pasport = new Pasport();
        pasport.firstName = "Gapurov";
        pasport.lastName = "Kudayberdi";
        pasport.gender = "male";
        pasport.id = 6;
        pasport.yearOfbirth = "08.29.06";
        pasport.countryOfbirth = "08.09.36";
        System.out.println(pasport.firstName + "\n" + pasport.lastName + "\n" + pasport.gender
                + "\n" + pasport.id + "\n" + pasport.yearOfbirth + "\n" + pasport.countryOfbirth);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aibek, ", "Teacher, ", "University, ", "Village, ", "plov");
        System.out.println(person);

        Programmer programmer = new Programmer("Askat, ", "IT, ", "Google, ",
                "Peaksoft, ", "Street, ", "borsh, ", "Java");
        System.out.println(programmer);

        Dancer dancer = new Dancer("Asko, ", "Dance, ", "Alga, ", "Course, ",
                "Street, ", "Pizza, ", "Kara jorgo");
        System.out.println(dancer);

        Singer singer = new Singer("Askero, ", "Music, ", "no band, alone, ", "University, ",
                "Street ", "Sushi, ", "I love you, ", "Yes");
        System.out.println(singer);
    }
}

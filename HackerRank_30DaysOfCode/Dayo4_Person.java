package HackerRank_30DaysOfCode;

public class Dayo4_Person {  // class vs instance
    public int age;

    public Dayo4_Person(int initialAge) {
        if(initialAge >= 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        age ++;
    }

    public void amIOld() {
        if(age < 13) {
            System.out.println("You are young.");
        } else if(age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");

        }
    }
}
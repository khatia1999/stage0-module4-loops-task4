package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        if (numberToGoUntil < toBreakWith) {
            System.out.println("Iterating till the end:");
            for (int i = 0; i <= numberToGoUntil; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Iterating till the break number:");
            for (int i = 0; i <= toBreakWith; i++) {
                System.out.println(i);
            }
        }

    }
}

//Write a program that will consume 2 args: the first is number to break on, the second to iterate till,
// if number to iterate till is less than to break with -> sout("iterating till the end")
// and print all the numbers till the end,
// otherwise all numbers till toBreakWith.
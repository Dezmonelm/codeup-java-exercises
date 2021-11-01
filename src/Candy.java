public class Candy {
//    two public fields 'name' and 'size'
    public String name;
    public String size;
// two constructors
// 1st 'know the name and not the size'
    public Candy(String candyName) {
        this.name = candyName;
        this.size = "Not too sure ¯\\\\_(ツ)_/¯";
    }
//    2nd 'know the name and size'
    public Candy(String candyName, String candySize) {
        this.name = candyName;
        this.size = candySize;
    }

    //    bonus: write a method saying 'AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a [name]! I see that you got the [size] of it. Sounds good! :)'
//    'void' just shows that you did something
    public void candyMethod() {
        System.out.printf("AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a %s! I see that you got the %s of it. Sounds good! :)\n", this.name, this.size);
    }

    //    A return you can actually use.
    public String useCandyMethod() {
        return String.format("AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a %s! I see that you got the %s of it. Sounds good! :)\n", this.name, this.size);
    }

public static void main(String[] args) {
        Candy snickers = new Candy("Snickers");

        System.out.printf("AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a %s! I see that you got the %s of it. Sounds good! :)\n", snickers.name, snickers.size);

        Candy twix = new Candy("Twix", "King Size");

        System.out.printf("AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a %s! I see that you got the %s of it. Sounds good! :)\n", twix.name, twix.size);

        twix.candyMethod();
    System.out.println(snickers.useCandyMethod());
}

}

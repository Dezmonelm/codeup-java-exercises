import java.util.Arrays;

public class Candy {
    //    two public fields 'name' and 'size'
    public String name;
    public String size;
    public String[] descriptors;

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

    //    3rd candy description in addition to name and size
    public Candy(String candyName, String candySize, String[] candyDescriptors) {
        this.name = candyName;
        this.size = candySize;
        this.descriptors = candyDescriptors;
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

    public String moCandyMethod() {
        return String.format("mmmmmm this %s %s is %s. I just can't get enough!", this.size, this.name, Arrays.toString(this.descriptors));
    }

    public static void main(String[] args) {
        Candy snickers = new Candy("Snickers");

        System.out.printf("AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a %s! I see that you got the %s of it. Sounds good! :)\n", snickers.name, snickers.size);

        Candy twix = new Candy("Twix", "King Size");

        System.out.printf("AAAYYYYY!!!! NOW WALK IT OUT! ...... I mean....., a %s! I see that you got the %s of it. Sounds good! :)\n", twix.name, twix.size);

        // method written with a print to command line
        twix.candyMethod();

        // method written with a print format. needs to be printed to command line but can be used in other code settings
        System.out.println(snickers.useCandyMethod());

        Candy mAndMs = new Candy("M & M's", "Share Size", new String[] {"milky", "chocolatey", "goodness", "scrumptious\n"});
        System.out.println(mAndMs.moCandyMethod());

//        Candy[] myBag = {funsizeSnickers, fullsizeKitKat};
//
//        for(Candy singleCandy : myBag){
////                String descriptors = Arrays.toString(singleCandy.descriptors);
////                descriptors = descriptors.substring(1, descriptors.length() - 1);
//            System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, Arrays.toString(singleCandy.descriptors));
//
//            Candy[] newBag = Candy.addCandy(myBag, newCandy);
//
//            for(Candy singleCandy : newBag){//Ah! Now let's see if our new candy is in this array
//                System.out.println(singleCandy.name);
//            }
    }


}

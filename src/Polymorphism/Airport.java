package Polymorphism;

public class Airport {

    public static void main(String[] args) {
        InternationalTraveller internationalTraveller =
                new InternationalTraveller("India");
        passThroughImmigrationCounter(internationalTraveller);

//        American american = new American();
        InternationalTraveller american = new American();
        passThroughImmigrationCounter(american);

        Chinese chinese = new Chinese();
        passThroughImmigrationCounter(chinese);

        Srilankan srilankan = new Srilankan();
        passThroughImmigrationCounter(srilankan);

    }

    static void passThroughImmigrationCounter(InternationalTraveller traveller) {
        traveller.printSummary();
    }


//	static void immigrationCheckForSrilankan(Srilankan srilankan) {
//		srilankan.printSummary();
//	}
//
//	static void immigrationCheckForChinese(Chinese chinese) {
//		chinese.printSummary();
//	}
//
//	static void immigrationCheckForAmericans(American american) {
//		american.printSummary();
//	}
//
//	static void immigrationCheck(InternationalTraveller traveller) {
//		traveller.printSummary();
//	}

}
package bit.javaoop;

public class Main {
    public static void main(String[] args) {

        Company MarekCO = new Company("MarekCO");
        MarekCO.hireCEO("Marek",70_000);
        MarekCO.getExecutive().hireManager("Piotrek",40_000,"FixedBudget");
        MarekCO.getExecutive().getManagerByName("Piotrek").hire("Pani Helenka",20_000);
        MarekCO.getExecutive().getManagerByName("Piotrek").hire("Mariusz",10_000);
        MarekCO.getExecutive().getManagerByName("Piotrek").hire("Zbyszek",15_000);
        MarekCO.getExecutive().getManagerByName("Piotrek").hire("Bogdan",17_000);
        MarekCO.getExecutive().hireManager("Rob",40_000,"FixedNumber");
        MarekCO.getExecutive().getManagerByName("Rob").hire("Ela",16_000);
        MarekCO.getExecutive().getManagerByName("Rob").hire("Radek",9_000);
        MarekCO.getExecutive().getManagerByName("Rob").hire("Karol",18_000);
        MarekCO.getExecutive().getManagerByName("Rob").hire("Mariola",14_000);
        if(MarekCO.getExecutive().getManagerByName("Piotrek").getEmployeeByName("Pani Helenka").isSatisfied()){
            System.out.println("Pani Helenka jest bardzo zadowolona!!");
        }
        System.out.println(MarekCO.toString());
    }

}

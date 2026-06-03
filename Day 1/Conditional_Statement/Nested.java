public class Nested {
    public static void main(String[] args) {
        int tenth = 75 ;
        int diploma = 85 ;
        int CGPA = 8 ;
        int placement = 75 ;

        if (tenth > 70) {
            if (diploma > 80) {
                if (CGPA > 7) {
                    if (placement > 70) {
                        System.out.println("Eligible for job");
                    }
                    else {
                        System.out.println("Not eligible for job");
                    }
                } else {
                    System.out.println("Not eligible for job");
                } 
            }else {
                System.out.println("Not eligible for job");
            }
        }else {
            System.out.println("Not eligible for job");
        }
    }
}

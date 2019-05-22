package Lesson5;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int days = 0; days < 366; days++){
            for(int hours = 0; hours < 25; hours++){
                for(int minutes = 0; minutes < 61; minutes++){
                    for (int seconds = 0; seconds < 61; seconds++){

                        System.out.printf("От старта прошло: %d дней, %d часа, %d минут, %d секунд", days, hours, minutes, seconds); // %d - число инт, &s - текст String
                        System.out.println();
                        try {
                            Thread.sleep(1000);

                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }


                    }
                }
            }
        }

        System.out.println("End");

    }

}

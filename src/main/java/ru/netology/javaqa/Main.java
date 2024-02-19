import ru.netology.services.RestServices;

    public class Main {
            public static void main(String[] args) {
                RestServices service = new RestServices();

                System.out.println("Количество месяцев отдыха ");
                System.out.println(service.RestServices(100000, 60000, 150000));
            }
        }
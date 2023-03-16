package osgi_servicesubscriber;

import com.mtit.service.ServicePublish;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class SubscriberServiceActivator implements BundleActivator {

    Scanner sc = new Scanner(System.in);
    ServiceReference<?> serviceReference;

    public void start(BundleContext context) throws Exception {

        System.out.println("STARTED SUBSCRIBER SERVICE!");

        serviceReference = context.getServiceReference(ServicePublish.class.getName());
        ServicePublish servicePublish = (ServicePublish) context.getService(serviceReference);
        ServicePublish basketballPublisher = (ServicePublish) context.getService(serviceReference);

        do {

            double eFGCalc, GamePerformcCalc, TrueShootingPercentageCalc, Average;
            int calculator;
            int choice;

            basketballPublisher.printBasketballTitle();

            System.out.println("Do you want to calculate The statistic for PLAYER OR TEAM ? ");
            choice = sc.nextInt();
            System.out.println(choice);

            if (choice == 2) {
                System.out.println("You selected to calculate group performance ");

                System.out.println("Enter eFGCalc of the team ");
                eFGCalc = sc.nextDouble();

                System.out.println("Enter eFGCalc of the team ");
                GamePerformcCalc = sc.nextDouble();

                System.out.println("Enter eFGCalc of the team ");
                TrueShootingPercentageCalc = sc.nextDouble();

                Average = (eFGCalc + GamePerformcCalc + TrueShootingPercentageCalc) / 3;

                System.out.println("Average performance of your team is :" + Average);

            } else if (choice == 1) {
                System.out.println("You selected to calculate one player performance");
                System.out.println("=================================================================");
                System.out.println("=================================================================");
                basketballPublisher.printBasketballDescr();
                System.out.println("=================================================================");
                System.out.println("Select calculator from above :");
                calculator = sc.nextInt();
                if (calculator == 1) {

                    System.out.println("You selected eFG Calculator ");
                    basketballPublisher.getPlayerDetails();
                    basketballPublisher.getBasketballData();
                    basketballPublisher.calculateStatistics();
                    basketballPublisher.displayResults();

                } else if (calculator == 2) {
                    System.out.println("You selected Game Score Calculator – Basketball");
                    basketballPublisher.getPlayerDetails();
                    basketballPublisher.calculateStatistics();
                    basketballPublisher.displayResults();

                } else if (calculator == 3) {
                    System.out.println("You selected TS Calculator (True Shooting Percentage)");
                    basketballPublisher.getPlayerDetails();
                    basketballPublisher.calculateStatistics();
                    basketballPublisher.displayResults();

                } else {
                    System.out.println("Wrong input!");
                }

            } else {
                System.out.println("Inavalid!!!!");
            }
        } while (isDoAgain());
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Good bye");
        context.ungetService(serviceReference);
    }

    public boolean isDoAgain() {
        char ans;
        System.out.print("Calculate Statistics of another Player/Team ? (y/n): ");
        ans = sc.next().toLowerCase().charAt(0);
        if (ans == 'y') {
            System.out.println("\n\n\n\n\n");
            return true;
        } else
            return false;
    }

}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class McDonaldsFX extends Application {
    private int totalPrice = 0;
    private Label totalLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("McDonald's Ordering System");

        Label welcomeLabel = new Label("Welcome to McDonald's! Choose your burger:");
        totalLabel = new Label("Total Price: $0");

        Button smallBurgerButton = new Button("Small Burger ($2)");
        Button mediumBurgerButton = new Button("Medium Burger ($5)");
        Button largeBurgerButton = new Button("Large Burger ($10)");
        Button finishButton = new Button("Finish Order");

        smallBurgerButton.setOnAction(e -> addToTotal(2));
        mediumBurgerButton.setOnAction(e -> addToTotal(5));
        largeBurgerButton.setOnAction(e -> addToTotal(10));
        finishButton.setOnAction(e -> System.out.println("Order completed. Total price: $" + totalPrice));

        VBox layout = new VBox(10, welcomeLabel, smallBurgerButton, mediumBurgerButton, largeBurgerButton, totalLabel, finishButton);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addToTotal(int price) {
        totalPrice += price;
        totalLabel.setText("Total Price: $" + totalPrice);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
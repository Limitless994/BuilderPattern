package application;
	
import BuilderPatternComponents.Product;
import BuilderPatternComponents.ProductBuilder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/main.fxml"));
			Scene scene = new Scene(root,1000,1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

	      ProductBuilder prodBuilder = new ProductBuilder();

	      Product iphone = prodBuilder.buildIphone();
	      System.out.println("iphone 11 pro");
	      iphone.showItems();
	      System.out.println("Total Cost: " + iphone.getCost());

	      Product miNotebook = prodBuilder.buildMiNotebook();
	      System.out.println("\n\nNotebook ");
	      miNotebook.showItems();
	      System.out.println("Total Cost: " + miNotebook.getCost());
	}
}

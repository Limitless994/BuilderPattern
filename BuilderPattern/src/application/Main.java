package application;

import BuilderPatternComponents.Brand;
import BuilderPatternComponents.Product;
import BuilderPatternComponents.ProductBuilder;
import BuilderPatternComponents.ProductType;
import BuilderPatternComponents.ProductsFactory;
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
			Scene scene = new Scene(root,1000,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
//		ProductsFactory pf = new ProductsFactory();
//		Product iphone = pf.getProduct(ProductType.smartphone,Brand.apple);
//		System.out.println("iphone 11 pro");
//		iphone.showItems();
//		System.out.println("Total Cost: " + iphone.getCost());

	}
}

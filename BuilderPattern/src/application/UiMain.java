package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BuilderPatternComponents.Creator;
import BuilderPatternComponents.ProductsFactory;
import GenericComponents.Brand;
import Type.Item;
import Type.ProductType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class UiMain implements Initializable {

	@FXML
	private Label name;
	@FXML
	private Label displayType;
	@FXML
	private Label cpuType;
	@FXML
	private Label cost;
	@FXML
	private ListView<String> shelf;
	@FXML
	private ImageView imageview;
	@FXML
	private ImageView diagram;
	
	ObservableList<String> list = FXCollections.observableArrayList();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		shelf.setItems(list);
	}
	
	public ProductsFactory pf = new ProductsFactory();
	public void showDiagram(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/diag.fxml"));
		Scene scene = new Scene(root,1000,700);
		Stage secondaryStage = new Stage();
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		secondaryStage.setScene(scene);
		secondaryStage.show();

	}
	
	public void generateIphone(ActionEvent e) {
		Creator phone = pf.getProduct(ProductType.smartphone,Brand.apple);
		for (Item item : phone.getItems()) {
			name.setText(item.name());
			displayType.setText(item.display().display());
			cpuType.setText(item.cpu().cpuName());
			cost.setText(Float.toString(phone.getCost())+"€");
			Image image = new Image("iphone.png");
			imageview.setImage(image);
		}
		list.add("Iphone 11");
	}
	public void generateXiaomiPhone(ActionEvent e) {
		Creator phone = pf.getProduct(ProductType.smartphone,Brand.xiaomi);
		for (Item item : phone.getItems()) {
			name.setText(item.name());
			displayType.setText(item.display().display());
			cpuType.setText(item.cpu().cpuName());
			cost.setText(Float.toString(phone.getCost())+"€");
			Image image = new Image("mi9t.png");
			imageview.setImage(image);
		}
		list.add("Xiaomi Mi 9t");
	}
	public void generateMacbook(ActionEvent e) {
		Creator phone = pf.getProduct(ProductType.notebook,Brand.apple);
		for (Item item : phone.getItems()) {
			name.setText(item.name());
			displayType.setText(item.display().display());
			cpuType.setText(item.cpu().cpuName());
			cost.setText(Float.toString(phone.getCost())+"€");
			Image image = new Image("macbook.png");
			imageview.setImage(image);
		}
		list.add("Macbook Pro");
	}
	public void generateMiNotebook(ActionEvent e) {
		Creator phone = pf.getProduct(ProductType.notebook,Brand.xiaomi);
		for (Item item : phone.getItems()) {
			name.setText(item.name());
			displayType.setText(item.display().display());
			cpuType.setText(item.cpu().cpuName());
			cost.setText(Float.toString(phone.getCost())+"€");
			Image image = new Image("miNotebook.png");
			imageview.setImage(image);
		}
		list.add("Xiaomi Mi notebook");
	}
}
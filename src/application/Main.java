package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			stage.setTitle("Aplicação Comercial - Controle de Estoque");

			Image img = new Image("/gui/imagens/icons8-investimento-100.png");
			stage.getIcons().add(img);
			
			stage.setMaximized(true);
			stage.setResizable(false);

			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class flags extends Application{
	@Override
	public void start(Stage main_stage) {
		GridPane holder = new GridPane();

		holder.add(new ImageView(new Image("Images/flag1.gif")), 0, 0);
		holder.add(new ImageView(new Image("Images/flag2.gif")), 1, 0);
		holder.add(new ImageView(new Image("Images/flag6.gif")), 0, 1);
		holder.add(new ImageView(new Image("Images/flag7.gif")), 1, 1);

		Scene scene = new Scene(pane);
		main_stage.setTitle("Flags");
		main_stage.setScene(scene);
		main_stage.show(); 
	}
}


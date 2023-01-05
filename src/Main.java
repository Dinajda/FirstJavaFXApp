import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Cats");

        //FileInputStream input = new FileInputStream("catjump2.jpeg");
        //Image image = new Image(input);
        //ImageView imageView = new ImageView(image);

        DatePicker datePicker = new DatePicker();

        Button button2 = new Button("Read Date");

        button2.setOnAction(action -> {
            LocalDate value = datePicker.getValue();
        });

        ProgressBar progressBar = new ProgressBar();
        //progressBar.setProgress(0.5);

        Slider slider = new Slider(0, 100, 0);
        double value = slider.getValue();
        slider.setMajorTickUnit(8.0);
        slider.setMinorTickCount(3);
        slider.setShowTickMarks(true);
        slider.setSnapToTicks(true);

        slider.setShowTickLabels(true);

        ColorPicker colorPicker = new ColorPicker();

        //Color value = colorPicker.getValue();

        MenuItem menuItem1 = new MenuItem("Cat 1");
        MenuItem menuItem2 = new MenuItem("Cat 2");
        MenuItem menuItem3 = new MenuItem("Cat 3");

        MenuButton menuButton = new MenuButton("Cat Options", null, menuItem1, menuItem2, menuItem3);

        Text text = new Text();
        text.setText("Two cats look out a window together.");

        TextField textField = new TextField();

        Button button = new Button("Boop");

        textField.setText("Type here");

        TextArea textArea = new TextArea();

        //button.setOnAction(action -> {
            //System.out.println(textField.getText());

            button.setOnAction(actionEvent -> {
                button.setText("Yay");
            });
        //});

        Label label1 = new Label("'Meow!', one of the cats says.");
        Label label2 = new Label("'Meow meow.', responds the other.");
        Label label3 = new Label("The cats stare at the birds in the trees.");
        label1.setTextFill(Paint.valueOf("black"));
        label2.setTextFill(Paint.valueOf("black"));
        label3.setTextFill(Paint.valueOf("black"));

        menuItem1.setOnAction(actionEvent -> {
            menuItem1.setText("Meow!");
        });

        menuItem2.setOnAction(actionEvent -> {
            menuItem2.setText("Hiss!");
        });

        menuItem3.setOnAction(actionEvent -> {
            menuItem3.setText("Ruff!");
            menuButton.setText("They're all nice!");
        });

        

        HBox myHbox = new HBox(10, menuButton, colorPicker);
        VBox myVbox = new VBox(5, slider,progressBar,datePicker, myHbox, text, label1,label2, label3, button, textField, textArea);
        Scene scene = new Scene(myVbox, 600, 500);

        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class PD1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Narzędzie przetwarzania plików");

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10,10,10,10));

        ///////////////////////////////////////LEFT SIDE

        GridPane leftPane = new GridPane();
        leftPane.setPadding(new Insets(3,3,3,3));
        leftPane.setHgap(5);
        leftPane.setVgap(5);

        Label label1 = new Label(" Panel plików ");
        TextFlow panel = new TextFlow(label1);
        panel.setPadding(new Insets(-12,0,0,5));
        label1.setStyle("-fx-background-color: f4f4f4;");

        Label source = new Label("Źródło");
        GridPane.setConstraints(source,0,1);

        TextField txf1 = new TextField();
        GridPane.setConstraints(txf1,1,1);

        Button leftButton1 = new Button("Przeglądaj...");
        GridPane.setConstraints(leftButton1,2,1);


        Label result = new Label("Wynik");
        GridPane.setConstraints(result,0,2);

        TextField txf2 = new TextField();
        GridPane.setConstraints(txf2,1,2);


        Button leftButton2 = new Button("Przeglądaj...");
        GridPane.setConstraints(leftButton2,2,2);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPrefWidth(140);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPrefWidth(100);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPrefWidth(100);

        leftPane.getChildren().addAll(panel,source,result,txf1,txf2,leftButton1,leftButton2);
        leftPane.getColumnConstraints().addAll(column1,column2,column3);

        ////////////BUTTONS - RIGHT SIDE

        GridPane rightPane = new GridPane();
        rightPane.setPadding(new Insets(10,10,10,10));
        rightPane.setHgap(5);
        rightPane.setVgap(0);
        rightPane.setPrefWidth(150);

        Label label2 = new Label(" Opcje uruchomienia ");
        TextFlow opcje = new TextFlow(label2);
        opcje.setPadding(new Insets(-20,0,0,5));
        label2.setStyle("-fx-background-color: f4f4f4;");

        Button but1 = new Button("Uruchom przetwarza...");
        but1.setDisable(true);
        GridPane.setConstraints(but1,0,0);
        but1.setPrefSize(130,600);

        Button but2 = new Button("Pomoc");
        GridPane.setConstraints(but2,0,1);
        but2.setPrefSize(130,600);

        Button but3 = new Button("O programie");
        GridPane.setConstraints(but3,0,2);
        but3.setPrefSize(130,600);

        Button but4 = new Button("Zapisz i zakończ");
        GridPane.setConstraints(but4,0,3);
        but4.setPrefSize(130,600);

        rightPane.getChildren().addAll(opcje,but1,but2,but3,but4);

        //////////////////////////STYLES

        leftPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        rightPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        pane.setRight(rightPane);
        pane.setLeft(leftPane);
        Scene scene = new Scene(pane,600,250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
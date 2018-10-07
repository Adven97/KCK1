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
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class PD2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Przetwarzanie plików i tekstów");

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10,10,10,10));

        ////////////////////////////////TEXT AREA  -  LEFT SIDE

        GridPane leftPane = new GridPane();
        leftPane.setPadding(new Insets(3,3,3,3));
        leftPane.setHgap(5);
        leftPane.setVgap(5);

        Label label1 = new Label(" Pole tekstowe ");
        label1.setStyle("-fx-background-color: f4f4f4;");
        TextFlow pole = new TextFlow(label1);
        pole.setPadding(new Insets(-12,0,0,5));
        GridPane.setConstraints(pole,0,0);

        TextArea txtArea = new TextArea("To jest tekst przykładowy...");
        GridPane.setConstraints(txtArea,0,1);
        txtArea.setPrefSize(350,1000);

        leftPane.getChildren().addAll(pole,txtArea);

       //////////////////////////// ////////////BUTTONS - RIGHT SIDE

        GridPane rightPane = new GridPane();
        rightPane.setPadding(new Insets(10,10,10,10));
        rightPane.setHgap(5);
        rightPane.setVgap(0);
        rightPane.setPrefWidth(150);

        Label label2 = new Label(" Narzędzia ");
        label2.setStyle("-fx-background-color: f4f4f4;");
        TextFlow narzedzia = new TextFlow(label2);
        narzedzia.setPadding(new Insets(-20,0,0,5));
        GridPane.setConstraints(narzedzia,0,0);

        Button but1 = new Button("Wstaw plik");
        GridPane.setConstraints(but1,0,1);
        but1.setPrefSize(120,30);

        Button but2 = new Button("Usuń tekst");
        GridPane.setConstraints(but2,0,2);
        but2.setPrefSize(120,30);

        Button but3 = new Button("Uruchom");
        but3.setDisable(true);
        GridPane.setConstraints(but3,0,3);
        but3.setPrefSize(120,30);

        Button but4 = new Button("Zapisz plik");
        GridPane.setConstraints(but4,0,4);
        but4.setPrefSize(120,30);

        Button but5 = new Button("Pomoc");
        GridPane.setConstraints(but5,0,5);
        but5.setPrefSize(120,30);

        Button but6 = new Button("O programie");
        GridPane.setConstraints(but6,0,6);
        but6.setPrefSize(120,30);

        Button but7 = new Button("O programie");
        GridPane.setConstraints(but7,0,7);
        but7.setPrefSize(120,30);

        rightPane.getChildren().addAll(narzedzia,but1,but2,but3,but4,but5,but6,but7);

        //////////////////////////STYLES

        leftPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        rightPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        pane.setRight(rightPane);
        pane.setLeft(leftPane);
        Scene scene = new Scene(pane,700,450);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
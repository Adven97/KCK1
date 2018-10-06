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

        Label zr1 = new Label("Źródło");
        GridPane.setConstraints(zr1,0,0);

        TextField txf1 = new TextField();
        GridPane.setConstraints(txf1,1,0);

        Button leftButton1 = new Button("Przeglądaj");
        GridPane.setConstraints(leftButton1,2,0);


        Label zr2 = new Label("Wynik");
        GridPane.setConstraints(zr2,0,1);

        TextField txf2 = new TextField();
        GridPane.setConstraints(txf2,1,1);


        Button leftButton2 = new Button("Przeglądaj");
        GridPane.setConstraints(leftButton2,2,1);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPrefWidth(140);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPrefWidth(100);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPrefWidth(100);

        leftPane.getChildren().addAll(zr1,zr2,txf1,txf2,leftButton1,leftButton2);
        leftPane.getColumnConstraints().addAll(column1,column2,column3);

        ////////////BUTTONS - RIGHT SIDE

        GridPane rightPane = new GridPane();
        rightPane.setPadding(new Insets(10,10,10,10));
        rightPane.setHgap(5);
        rightPane.setVgap(0);
        rightPane.setPrefWidth(150);

        Label opcje = new Label("Opcje uruchomienia");
        GridPane.setConstraints(opcje,0,0);

        Button but1 = new Button("Uruchom przetwarzanie");
        but1.setDisable(true);
        GridPane.setConstraints(but1,0,1);
        but1.setPrefSize(130,600);

        Button but2 = new Button("Pomoc");
        GridPane.setConstraints(but2,0,2);
        but2.setPrefSize(130,600);

        Button but3 = new Button("O programie");
        GridPane.setConstraints(but3,0,3);
        but3.setPrefSize(130,600);

        Button but4 = new Button("Zapisz i zakończ");
        GridPane.setConstraints(but4,0,4);
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
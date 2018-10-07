package sample;

import com.sun.rowset.internal.Row;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Zmiana wielkości liter");
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setHgap(5);
        pane.setVgap(5);

        //////TEXT FIELDS AND LABELS  -  LEFT SIDE
        GridPane leftPane = new GridPane();

        Label zr = new Label("Źródło");
        GridPane.setConstraints(zr,0,0);

        TextArea t = new TextArea("ola");
        GridPane.setConstraints(t,0,1);
        t.setMinWidth(350);
        t.setPrefHeight(600);

        Label wynik = new Label("Wynik");
        GridPane.setConstraints(wynik,0,2);

        TextArea p = new TextArea("OLA");
        GridPane.setConstraints(p,0,3);
        p.setMinWidth(350);
        p.setPrefHeight(600);

        leftPane.getChildren().addAll(zr,t,wynik,p);

        ////////////BUTTONS - RIGHT SIDE

        VBox rightPane = new VBox();

        Label narzedzia = new Label("Narzędzia");
        Button but1 = new Button("Przetwarzaj!");
        but1.setPrefSize(4000,600);

        Button but2 = new Button("Wyczyść źródło");
        but2.setPrefSize(4000,600);

        Button but3 = new Button("Pomoc");
        but3.setDisable(true);
        but3.setPrefSize(4000,600);

        Button but4 = new Button("O programie");
        but4.setPrefSize(4000,600);

        Button but5 = new Button("Zapisz i zakończ");
        but5.setPrefSize(4000,600);

        rightPane.getChildren().addAll(narzedzia,but1,but2,but3,but4,but5);

        //////////////STYLES

        pane.add(rightPane,1,0);
        pane.add(leftPane,0,0);

        Scene scene = new Scene(pane,700,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
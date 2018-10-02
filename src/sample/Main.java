package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Zmiana wielkości liter");

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setHgap(5);
        pane.setVgap(5);

        ColumnConstraints col = new ColumnConstraints();
        col.setPercentWidth(40);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(60);
        pane.getColumnConstraints().addAll(col,col2);

        Label zr = new Label("Źródło");
        GridPane.setConstraints(zr,0,0);

        TextArea t = new TextArea("ola");
        GridPane.setConstraints(t,0,1);


        Label wynik = new Label("Wynik");
        GridPane.setConstraints(wynik,0,2);

        TextArea p = new TextArea("OLA");
        GridPane.setConstraints(p,0,3);

        Button but1 = new Button("Przetwarzaj!");
        GridPane.setConstraints(but1,1,0);
        Button but2 = new Button("Wyczyść Źródło");
        GridPane.setConstraints(but2,1,1);
        Button but3 = new Button("Pomoc");
        GridPane.setConstraints(but3,1,2);
        Button but4 = new Button("O programie");
        GridPane.setConstraints(but4,1,3);
        Button but5 = new Button("Zapisz i zakończ");
        GridPane.setConstraints(but5,1,4);

        /*but1.setAlignment(Pos.TOP_RIGHT);
        but2.setAlignment(Pos.CENTER_RIGHT);
        but3.setAlignment(Pos.CENTER_RIGHT);
        but4.setAlignment(Pos.BASELINE_RIGHT);
        but5.setAlignment(Pos.BOTTOM_RIGHT);*/

        zr.setPrefHeight(15);
        wynik.setPrefHeight(5);

        but1.setMaxWidth(Double.MAX_VALUE);
        but2.setMaxWidth(Double.MAX_VALUE);
        but3.setMaxWidth(Double.MAX_VALUE);
        but4.setMaxWidth(Double.MAX_VALUE);
        but5.setMaxWidth(Double.MAX_VALUE);

        but1.setPrefHeight(58);
        but2.setPrefHeight(58);
        but3.setPrefHeight(58);
        but4.setPrefHeight(58);
        but5.setPrefHeight(58);


       // wynik.setPrefHeight(90);


        pane.getChildren().addAll(zr,t,wynik,p,but1,but2,but3,but4,but5);
        Scene scene = new Scene(pane,550,430);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
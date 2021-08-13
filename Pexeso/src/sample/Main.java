package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;
import java.util.List;

public class Main extends Application {

    private int pair1 = 0;
    private int pair2 = 0;
    private int pair3 = 0;
    private int pair4 = 0;
    private int pair5 = 0;
    private int pair6 = 0;
    private int pair7 = 0;
    private int pair8 = 0;
    private int pair9 = 0;
    private int pair10 = 0;
    private int pair11 = 0;
    private int pair12 = 0;
    private int pair13 = 0;
    private int pair14 = 0;
    private int pair15 = 0;

    private Integer p1i = 0;
    private String p1;

    private Integer p2i = 0;
    private String p2;

    int turn = 1;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane gp = (GridPane) root;
        GridPane winner = (GridPane) root;

//      Vytváření listu na pozdější randomizaci tlačítek.
        List<Button> randomButt = new ArrayList();


//      Vytváření tlačitek (karty) a přidáni do listu na randomizaci.
        Button b1a = new Button();
        b1a.setPrefSize(200, 150);
        b1a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b1a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/cat.png", 200, 150, false, false)));
            pair1++;
            b1a.setDisable(true);
        });
        randomButt.add(b1a);

        Button b1b = new Button();
        b1b.setPrefSize(200, 150);
        b1b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b1b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/cat.png", 200, 150, false, false)));
            pair1++;
            b1b.setDisable(true);
        });
        randomButt.add(b1b);

        Button b2a = new Button();
        b2a.setPrefSize(200, 150);
        b2a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b2a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/chicken.png", 200, 150, false, false)));
            pair2++;
            b2a.setDisable(true);
        });
        randomButt.add(b2a);

        Button b2b = new Button();
        b2b.setPrefSize(200, 150);
        b2b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b2b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/chicken.png", 200, 150, false, false)));
            pair2++;
            b2b.setDisable(true);
        });
        randomButt.add(b2b);

        Button b3a = new Button();
        b3a.setPrefSize(200, 150);
        b3a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b3a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/cow.png", 200, 150, false, false)));
            pair3++;
            b3a.setDisable(true);
        });
        randomButt.add(b3a);

        Button b3b = new Button();
        b3b.setPrefSize(200, 150);
        b3b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b3b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/cow.png", 200, 150, false, false)));
            pair3++;
            b3b.setDisable(true);
      });
        randomButt.add(b3b);

        Button b4a = new Button();
        b4a.setPrefSize(200, 150);
        b4a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b4a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/dog.png", 200, 150, false, false)));
            pair4++;
            b4a.setDisable(true);
        });
        randomButt.add(b4a);

        Button b4b = new Button();
        b4b.setPrefSize(200, 150);
        b4b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b4b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/dog.png", 200, 150, false, false)));
            pair4++;
            b4b.setDisable(true);
        });
        randomButt.add(b4b);

        Button b5a = new Button();
        b5a.setPrefSize(200, 150);
        b5a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b5a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/donkey.png", 200, 150, false, false)));
            pair5++;
            b5a.setDisable(true);
        });
        randomButt.add(b5a);

        Button b5b = new Button();
        b5b.setPrefSize(200, 150);
        b5b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b5b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/donkey.png", 200, 150, false, false)));
            pair5++;
            b5b.setDisable(true);
        });
        randomButt.add(b5b);

        Button b6a = new Button();
        b6a.setPrefSize(200, 150);
        b6a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b6a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/duck.png", 200, 150, false, false)));
            pair6++;
            b6a.setDisable(true);
        });
        randomButt.add(b6a);

        Button b6b = new Button();
        b6b.setPrefSize(200, 150);
        b6b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b6b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/duck.png", 200, 150, false, false)));
            pair6++;
            b6b.setDisable(true);
        });
        randomButt.add(b6b);

        Button b7a = new Button();
        b7a.setPrefSize(200, 150);
        b7a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b7a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/goat.png", 200, 150, false, false)));
            pair7++;
            b7a.setDisable(true);
        });
        randomButt.add(b7a);

        Button b7b = new Button();
        b7b.setPrefSize(200, 150);
        b7b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b7b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/goat.png", 200, 150, false, false)));
            pair7++;
            b7b.setDisable(true);
        });
        randomButt.add(b7b);

        Button b8a = new Button();
        b8a.setPrefSize(200, 150);
        b8a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b8a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/goose.png", 200, 150, false, false)));
            pair8++;
            b8a.setDisable(true);
        });
        randomButt.add(b8a);

        Button b8b = new Button();
        b8b.setPrefSize(200, 150);
        b8b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b8b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/goose.png", 200, 150, false, false)));
            pair8++;
            b8b.setDisable(true);
        });
        randomButt.add(b8b);

        Button b9a = new Button();
        b9a.setPrefSize(200, 150);
        b9a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b9a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/horse.png", 200, 150, false, false)));
            pair9++;
            b9a.setDisable(true);
        });
        randomButt.add(b9a);

        Button b9b = new Button();
        b9b.setPrefSize(200, 150);
        b9b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b9b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/horse.png", 200, 150, false, false)));
            pair9++;
            b9b.setDisable(true);
        });
        randomButt.add(b9b);

        Button b10a = new Button();
        b10a.setPrefSize(200, 150);
        b10a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b10a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/mouse.png", 200, 150, false, false)));
            pair10++;
            b10a.setDisable(true);
        });
        randomButt.add(b10a);

        Button b10b = new Button();
        b10b.setPrefSize(200, 150);
        b10b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b10b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/mouse.png", 200, 150, false, false)));
            pair10++;
            b10b.setDisable(true);
        });
        randomButt.add(b10b);

        Button b11a = new Button();
        b11a.setPrefSize(200, 150);
        b11a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b11a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/pig.png", 200, 150, false, false)));
            pair11++;
            b11a.setDisable(true);
        });
        randomButt.add(b11a);

        Button b11b = new Button();
        b11b.setPrefSize(200, 150);
        b11b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b11b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/pig.png", 200, 150, false, false)));
            pair11++;
            b11b.setDisable(true);
        });
        randomButt.add(b11b);

        Button b12a = new Button();
        b12a.setPrefSize(200, 150);
        b12a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b12a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/rabbit.png", 200, 150, false, false)));
            pair12++;
            b12a.setDisable(true);
        });
        randomButt.add(b12a);

        Button b12b = new Button();
        b12b.setPrefSize(200, 150);
        b12b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b12b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/rabbit.png", 200, 150, false, false)));
            pair12++;
            b12b.setDisable(true);
        });
        randomButt.add(b12b);

        Button b13a = new Button();
        b13a.setPrefSize(200, 150);
        b13a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b13a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/rooster.png", 200, 150, false, false)));
            pair13++;
            b13a.setDisable(true);
        });
        randomButt.add(b13a);

        Button b13b = new Button();
        b13b.setPrefSize(200, 150);
        b13b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b13b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/rooster.png", 200, 150, false, false)));
            pair13++;
            b13b.setDisable(true);
        });
        randomButt.add(b13b);

        Button b14a = new Button();
        b14a.setPrefSize(200, 150);
        b14a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b14a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/sheep.png", 200, 150, false, false)));
            pair14++;
            b14a.setDisable(true);
        });
        randomButt.add(b14a);

        Button b14b = new Button();
        b14b.setPrefSize(200, 150);
        b14b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b14b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/sheep.png", 200, 150, false, false)));
            pair14++;
            b14b.setDisable(true);
        });
        randomButt.add(b14b);

        Button b15a = new Button();
        b15a.setPrefSize(200, 150);
        b15a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b15a.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/turkey.png", 200, 150, false, false)));
            pair15++;
            b15a.setDisable(true);
        });
        randomButt.add(b15a);

        Button b15b = new Button();
        b15b.setPrefSize(200, 150);
        b15b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
        b15b.setOnAction(event -> {
            ((Button) event.getSource()).setGraphic(new ImageView(new Image("file:Images/turkey.png", 200, 150, false, false)));
            pair15++;
            b15b.setDisable(true);
        });
        randomButt.add(b15b);

//      Randomizace tlačítek (přidělení náhodného tlačítka na poyici).
        while (randomButt.size() > 0) {
            for (int x = 0; x < 6; x++) {
                for (int y = 0; y < 5; y++) {
                    Button butt = randomButt.get((int) (Math.random() * randomButt.size()));
                    gp.add(butt, x, y);
                    randomButt.remove(butt);
                }
            }
        }

//      Vytváření textů pro vizualizaci skóre.
        Text score = new Text("Score");
        gp.add(score, 7, 0);

        Text player1 = new Text("Player 1: 0 points");
        gp.add(player1, 7, 1);

        Text player2 = new Text("Player 2: 0 points");
        gp.add(player2, 7, 2);


//      Vztvoření tlačítka pro kontrolu zda se hodná o dvojci karet se stejnym obrazkem.
        Button evaluate = new Button("evaluate");
        gp.add(evaluate, 7, 3);
        evaluate.setOnAction(event -> {
            if (pair1 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                pair1 = 0;
                turn++;
                b1a.setDisable(true);
                b1a.setVisible(false);
                b1b.setDisable(true);
                 b1b.setVisible(false);
            } else {
                if (pair1 == 1) {
                    pair1 = 0;
                    b1a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b1a.setDisable(false);
                    b1b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b1b.setDisable(false);
                }
            }

            if (pair2 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair2 = 0;
                b2a.setDisable(true);
                b2a.setVisible(false);
                b2b.setDisable(true);
                b2b.setVisible(false);
            } else {
                if (pair2 == 1) {
                    pair2 = 0;
                    b2a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b2a.setDisable(false);
                    b2b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b2b.setDisable(false);
                }
            }

            if (pair3 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair3 = 0;
                b3a.setDisable(true);
                b3a.setVisible(false);
                b3b.setDisable(true);
                b3b.setVisible(false);
            } else {
                if (pair3 == 1) {
                    pair3 = 0;
                    b3a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b3a.setDisable(false);
                    b3b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b3b.setDisable(false);
                }
            }

            if (pair4 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair4 = 0;
                b4a.setDisable(true);
                b4a.setVisible(false);
                b4b.setDisable(true);
                b4b.setVisible(false);
            } else {
                if (pair4 == 1) {
                    pair4 = 0;
                    b4a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b4a.setDisable(false);
                    b4b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b4b.setDisable(false);
                }
            }

            if (pair5 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair5 = 0;
                b5a.setDisable(true);
                b5a.setVisible(false);
                b5b.setDisable(true);
                b5b.setVisible(false);
            } else {
                if (pair5 == 1) {
                    pair5 = 0;
                    b5a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b5a.setDisable(false);
                    b5b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b5b.setDisable(false);
                }
            }

            if (pair6 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair6 = 0;
                b6a.setDisable(true);
                b6a.setVisible(false);
                b6b.setDisable(true);
                b6b.setVisible(false);
            } else {
                if (pair6 == 1) {
                    pair6 = 0;

                    b6a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b6a.setDisable(false);
                    b6b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b6b.setDisable(false);
                }
            }

            if (pair7 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair7 = 0;
                b7a.setDisable(true);
                b7a.setVisible(false);
                b7b.setDisable(true);
                b7b.setVisible(false);
            } else {
                if (pair7 == 1) {
                    pair7 = 0;
                    b7a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b7a.setDisable(false);
                    b7b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b7b.setDisable(false);
                }
            }

            if (pair8 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair8 = 0;
                b8a.setDisable(true);
                b8a.setVisible(false);
                b8b.setDisable(true);
                b8b.setVisible(false);
            } else {
                if (pair8 == 1) {
                    pair8 = 0;
                    b8a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b8a.setDisable(false);
                    b8b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b8b.setDisable(false);
                }
            }

            if (pair9 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair9 = 0;
                b9a.setDisable(true);
                b9a.setVisible(false);
                b9b.setDisable(true);
                b9b.setVisible(false);
            } else {
                if (pair9 == 1) {
                    pair9 = 0;
                    b9a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b9a.setDisable(false);
                    b9b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b9b.setDisable(false);
                }
            }

            if (pair10 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair10 = 0;
                b10a.setDisable(true);
                b10a.setVisible(false);
                b10b.setDisable(true);
                b10b.setVisible(false);
            } else {
                if (pair10 == 1) {
                    pair10 = 0;
                    b10a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b10a.setDisable(false);
                    b10b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b10b.setDisable(false);
                }
            }

            if (pair11 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair11 = 0;
                b11a.setDisable(true);
                b11a.setVisible(false);
                b11b.setDisable(true);
                b11b.setVisible(false);
            } else {
                if (pair11 == 1) {
                    pair11 = 0;
                    b11a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b11a.setDisable(false);
                    b11b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b11b.setDisable(false);
                }
            }

            if (pair12 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair12 = 0;
                b12a.setDisable(true);
                b12a.setVisible(false);
                b12b.setDisable(true);
                b12b.setVisible(false);
            } else {
                if (pair12 == 1) {
                    pair12 = 0;
                    b12a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b12a.setDisable(false);
                    b12b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b12b.setDisable(false);
                }
            }

            if (pair13 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair13 = 0;
                b13a.setDisable(true);
                b13a.setVisible(false);
                b13b.setDisable(true);
                b13b.setVisible(false);
            } else {
                if (pair13 == 1) {
                    pair13 = 0;
                    b13a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b13a.setDisable(false);
                    b13b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b13b.setDisable(false);
                }
            }

            if (pair14 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair14 = 0;
                b14a.setDisable(true);
                b14a.setVisible(false);
                b14b.setDisable(true);
                b14b.setVisible(false);
            } else {
                if (pair14 == 1) {
                    pair14 = 0;
                    b14a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b14a.setDisable(false);
                    b14b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b14b.setDisable(false);
                }
            }

            if (pair15 == 2) {
                if (turn % 2 == 1) {
                    p1i++;
                    p1 = p1i.toString();
                    player1.setText("Player 1 : " + p1 + " points");
                } else {
                    p2i++;
                    p2 = p2i.toString();
                    player2.setText("Player 2 : " + p2 + " points");
                }
                turn++;
                pair15 = 0;
                b15a.setDisable(true);
                b15a.setVisible(false);
                b15b.setDisable(true);
                b15b.setVisible(false);
            } else {
                if (pair15 == 1) {
                    pair15 = 0;
                    b15a.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b15a.setDisable(false);
                    b15b.setGraphic(new ImageView(new Image("file:Images/avers.png", 200, 150, false, false)));
                    b15b.setDisable(false);
                }
            }

//          Podmínka na kontrolu toho, zda jsou už všechny dvojce karet odkryté, pokud jsou určí výtěze a vypíše jeho skóre.
            if ((p1i + p2i) == 15) {
                if(p1i > p2i ) {
                    Text win = new Text("The winner is Player 1");
                    Text winScore = new Text("Their winning score was : " + p1i.toString());
                    winner.add(win, 3, 0);
                    winner.add(winScore, 3, 1);
                } else {
                    Text win = new Text("The winner is Player 2");
                    Text winScore = new Text("Their winning score was " + p2i.toString());
                    winner.add(win, 3, 0);
                    winner.add(winScore, 3, 1);
                }
                score.setVisible(false);
                player1.setVisible(false);
                player2.setVisible(false);
                evaluate.setDisable(true);
                evaluate.setVisible(false);

            }
    });


        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);

    }
}

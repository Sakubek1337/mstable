package sample;

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;

public class Extra {
    public void setDiff(CheckMenuItem item, MenuButton menuButton){
        String name = item.getText();
        CheckMenuItem easy = (CheckMenuItem) (menuButton.getItems().get(0));
        CheckMenuItem medium = (CheckMenuItem) (menuButton.getItems().get(1));
        CheckMenuItem hard = (CheckMenuItem) (menuButton.getItems().get(2));
        CheckMenuItem expert = (CheckMenuItem) (menuButton.getItems().get(3));
        CheckMenuItem imp = (CheckMenuItem) (menuButton.getItems().get(4));

        switch (name) {
            case "Easy":
                menuButton.setText("Easy");
                easy.setSelected(true);
                medium.setSelected(false);
                hard.setSelected(false);
                expert.setSelected(false);
                imp.setSelected(false);

                break;
            case "Medium":
                menuButton.setText("Medium");
                easy.setSelected(false);
                medium.setSelected(true);
                hard.setSelected(false);
                expert.setSelected(false);
                imp.setSelected(false);

                break;
            case "Hard":
                menuButton.setText("Hard");
                easy.setSelected(false);
                medium.setSelected(false);
                hard.setSelected(true);
                expert.setSelected(false);
                imp.setSelected(false);

                break;
            case "Expert":
                menuButton.setText("Expert");
                easy.setSelected(false);
                medium.setSelected(false);
                hard.setSelected(false);
                expert.setSelected(true);
                imp.setSelected(false);

                break;
            case "Impossible":
                menuButton.setText("Impossible");
                easy.setSelected(false);
                medium.setSelected(false);
                hard.setSelected(false);
                expert.setSelected(false);
                imp.setSelected(true);
                break;
        }
    }

    public String setStars(MenuButton item){
        String s = "";
        String name = item.getText();
        switch (name){
            case "Easy":
                s = "⭐";
                break;
            case "Medium":
                s = "⭐⭐";
                break;
            case "Hard":
                s = "⭐⭐⭐";
                break;
            case "Expert":
                s = "⭐⭐⭐⭐";
                break;
            case "Impossible":
                s = "⭐⭐⭐⭐⭐";
                break;
        }
        return s;
    }

    public void addPoints(ProgressBar prg, String d){
        switch (d){
            case "⭐":
                prg.setProgress(prg.getProgress() + 0.05);
                break;
            case "⭐⭐":
                prg.setProgress(prg.getProgress() + 0.1);
                break;
            case "⭐⭐⭐":
                prg.setProgress(prg.getProgress() + 0.35);
                break;
            case "⭐⭐⭐⭐":
                prg.setProgress(prg.getProgress() + 0.65);
                break;
            case "⭐⭐⭐⭐⭐":
                prg.setProgress(prg.getProgress() + 1.0);
                break;
        }

        if (prg.getProgress() >= 1.0)
            prg.setStyle("-fx-accent: #0f0");
    }
}

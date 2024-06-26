package codecademyher.gui;

import codecademyher.database.CursistDB;
import codecademyher.database.CursusDB;
import codecademyher.database.InschrijvingDB;
import codecademyher.domain.Cursist;
import codecademyher.domain.Cursus;
import codecademyher.domain.Inschrijving;
import codecademyher.logic.Validation;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.time.LocalDate;

public class InschrijvingView extends View {

    // aanmaken van alle nodige databases, een tabel met alle inschrijvings
    // gegevens, en een lijst met alle inschrijving objecten
    private final InschrijvingDB idb;
    private final TableView inschrijvingTable = new TableView();
    private final ObservableList<Inschrijving> inschrijving;
    private final ObservableList<Cursus> cursus;
    private final ObservableList<Cursist> cursist;
    private final CursusDB cdb;
    private final CursistDB cursistdb;
    private final Validation val = new Validation();

    // constructor methode van InschrijvingView
    public InschrijvingView(InschrijvingDB idb, ObservableList<Inschrijving> inschrijving, CursusDB cdb,
            CursistDB cursistdb, ObservableList<Cursus> cursus, ObservableList<Cursist> cursist) {
        this.idb = idb;
        this.inschrijving = inschrijving;
        this.cdb = cdb;
        this.cursistdb = cursistdb;
        this.cursus = cursus;
        this.cursist = cursist;
        TableColumn cursusColumn = new TableColumn("CursusID");
        TableColumn cursistColumn = new TableColumn("CursistID");
        TableColumn datumColumn = new TableColumn("Datum");
        cursusColumn.setCellValueFactory(new PropertyValueFactory<Inschrijving, String>("Cursus"));
        cursistColumn.setCellValueFactory(new PropertyValueFactory<Inschrijving, String>("Cursist"));
        datumColumn.setCellValueFactory(new PropertyValueFactory<Inschrijving, String>("Datum"));

        // vullen van de TableView tabel met gegevens
        inschrijvingTable.setItems(inschrijving);
        inschrijvingTable.getColumns().addAll(cursusColumn, cursistColumn, datumColumn);
    }

    // methode die een nieuwe stage returnt naar de GUI klasse, wanneer de gebruiker
    // op de inschrijvingen knop drukt
    // de gebruiker krijgt deze stage te zien
    public Stage getScene() throws SQLException {

        Stage window = new Stage();
        setTitle(window);
        VBox layout = new VBox();
        layout.setPadding(new Insets(8, 8, 8, 8));
        layout.setSpacing(5);
        layout.setMinHeight(200);
        layout.setMinWidth(600);

        layout.getChildren().add(inschrijvingTable);
        HBox buttons = new HBox();

        // Error label
        Label errorLabel = new Label("");

        // CRUD buttons van inschrijving

        // als de gebruiker op de create button drukt wordt de createInschrijving
        // methode aangeroepen
        // deze methode geeft een stage terug en deze wordt getoond aan de gebruiker
        Button create = new Button("Create");
        create.setOnAction((e) -> {
            Stage createWindow = createInschrijving();
            createWindow.setWidth(700);
            createWindow.setHeight(200);
            createWindow.show();
        });
        buttons.getChildren().addAll(create);

        // als de gebruiker een inschrijving selecteert uit de tabel en op de delete
        // button drukt wordt de inschrijving uit de inschrijving database verwijderd
        Button delete = new Button("Delete");
        delete.setOnAction((e) -> {
            try {
                Inschrijving c = (Inschrijving) inschrijvingTable.getSelectionModel().getSelectedItem();
                boolean deleted = idb.deleteInschrijving(c);
                if (!deleted) {
                    errorLabel.setText("Deletion failed, possible FK constraint");
                } else {
                    errorLabel.setText("");
                }
                inschrijving.clear();
                inschrijving.addAll(idb.getAllInschrijvingen());
            } catch (Exception ex) {
                nothingSelected().show();
            }
        });
        buttons.getChildren().add(delete);

        // als de gebruiker een inschrijving selecteert uit de tabel en op de update
        // button drukt wordt de editInschrijving methode aangeroepen
        // deze methode geeft een stage terug en deze wordt getoond aan de gebruiker
        Button update = new Button("Update");
        update.setOnAction((e) -> {
            try {
                Stage deleteWindow = editInschrijving(
                        (Inschrijving) inschrijvingTable.getSelectionModel().getSelectedItem());
                deleteWindow.setWidth(750);
                deleteWindow.setHeight(200);
                deleteWindow.show();
            } catch (Exception ex) {
                nothingSelected().show();
            }
        });
        buttons.getChildren().add(update);

        // return sluit de stage
        Button returnButton = new Button("Return");
        returnButton.setOnAction((e) -> {
            window.hide();
        });
        buttons.getChildren().add(returnButton);

        buttons.setSpacing(5);
        layout.getChildren().add(buttons);

        Scene inschrijvingScene = new Scene(layout);
        window.setScene(inschrijvingScene);
        return window;
    }

    // methode die alle inschrijvings gegevens verwijderd en opnieuw de
    // getAllInschrijvingen methode aanroept in de inschrijvingen database
    public void refreshInschrijvingTable() {
        inschrijving.clear();
        inschrijving.addAll(idb.getAllInschrijvingen());
    }

    // methode die een stage returnt waarin de gebruiker input kan invullen en een
    // nieuwe inschrijving kan aanmaken
    public Stage createInschrijving() {
        Stage window = new Stage();
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(8, 8, 8, 8));
        layout.setHgap(10);
        layout.setVgap(5);
        setTitle(window);

        Label inschrijvingLabel = new Label("Create Inschrijving:");
        layout.add(inschrijvingLabel, 0, 0);

        Label cursusLabel = new Label("Cursus:");
        layout.add(cursusLabel, 0, 1);
        ComboBox cursusField = new ComboBox();
        cursusField.setItems(cursus);
        layout.add(cursusField, 1, 1);

        Label cursistLabel = new Label("Cursist:");
        layout.add(cursistLabel, 0, 2);
        ComboBox cursistField = new ComboBox();
        cursistField.setItems(cursist);
        layout.add(cursistField, 1, 2);

        Label datumLabel = new Label("Datum (jjjj-mm-dd)");
        layout.add(datumLabel, 0, 3);
        TextField jaarField = new TextField("Jaar");
        layout.add(jaarField, 1, 3);
        TextField maandField = new TextField("Maand");
        layout.add(maandField, 2, 3);
        TextField dagField = new TextField("Dag");
        layout.add(dagField, 3, 3);

        Button create = new Button("Create");
        layout.add(create, 0, 4);

        // create button sluit de stage af, en maakt een nieuwe inschrijving in de
        // inschrijving database aan met de gegevens uit de input velden
        create.setOnAction((e) -> {
            if (val.isValidDate(jaarField.getText(), maandField.getText(), dagField.getText())) {
                Inschrijving newC = new Inschrijving(
                        0,
                        (Cursus) cursusField.getValue(),
                        (Cursist) cursistField.getValue(),
                        LocalDate.of(Integer.parseInt(jaarField.getText()), Integer.parseInt(maandField.getText()),
                                Integer.parseInt(dagField.getText())));
                idb.addInschrijving(newC);
                inschrijving.clear();
                inschrijving.addAll(idb.getAllInschrijvingen());
                window.hide();
            } else {
                inputError().show();
            }
        });

        Scene createInschrijving = new Scene(layout);
        window.setScene(createInschrijving);
        return window;

    }

    // methode returnt een stage waarop de gebruiker gegevens van een inschrijving
    // kan wijzigen
    public Stage editInschrijving(Inschrijving i) {

        Stage window = new Stage();
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(8, 8, 8, 8));
        layout.setHgap(10);
        layout.setVgap(5);
        setTitle(window);

        Label inschrijvingLabel = new Label("Create Inschrijving:");
        layout.add(inschrijvingLabel, 0, 0);

        Label cursusLabel = new Label("Cursus (" + i.getCursus().toString() + "):");
        layout.add(cursusLabel, 0, 1);
        ComboBox cursusField = new ComboBox();
        cursusField.setItems(cursus);
        layout.add(cursusField, 1, 1);

        Label cursistLabel = new Label("Cursist (" + i.getCursist().toString() + "):");
        layout.add(cursistLabel, 0, 2);
        ComboBox cursistField = new ComboBox();
        cursistField.setItems(cursist);
        layout.add(cursistField, 1, 2);

        Label datumLabel = new Label("Datum (" + i.getDatum().getYear() + "-" + i.getDatum().getMonthValue() + "-"
                + i.getDatum().getDayOfMonth() + ")");
        layout.add(datumLabel, 0, 3);
        TextField jaarField = new TextField("Jaar");
        layout.add(jaarField, 1, 3);
        TextField maandField = new TextField("Maand");
        layout.add(maandField, 2, 3);
        TextField dagField = new TextField("Dag");
        layout.add(dagField, 3, 3);

        Button update = new Button("Update");
        layout.add(update, 0, 4);

        // update button sluit de stage af, en maakt een nieuwe inschrijving aan en deze
        // vervangt de oude inschrijving in de inschrijving database
        update.setOnAction((e) -> {
            if (val.isValidDate(jaarField.getText(), maandField.getText(), dagField.getText())) {
                Inschrijving newC = new Inschrijving(
                        0,
                        (Cursus) cursusField.getValue(),
                        (Cursist) cursistField.getValue(),
                        LocalDate.of(Integer.parseInt(jaarField.getText()), Integer.parseInt(maandField.getText()),
                                Integer.parseInt(dagField.getText())));
                idb.updateInschrijving(i, newC);
                inschrijving.clear();
                inschrijving.addAll(idb.getAllInschrijvingen());
                window.hide();
            } else {
                inputError().show();
            }
        });

        Scene editCursist = new Scene(layout);
        window.setScene(editCursist);
        return window;

    }
}

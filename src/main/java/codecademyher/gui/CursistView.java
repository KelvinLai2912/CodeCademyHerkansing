package codecademyher.gui;

import codecademyher.database.*;
import codecademyher.domain.Cursist;
import codecademyher.domain.Cursus;
import codecademyher.domain.Geslacht;
import codecademyher.domain.Webcast;
import codecademyher.logic.Validation;
import javafx.collections.FXCollections;
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
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * deze klasse wordt vanuit de GUI klasse aangeroepen, en vorm het
 * nieuwe scherm dat getoond wordt wanneer de gebruiker
 * op de Cursisten button klikt die zich op het hoofdscherm bevindt
 * 
 */
public class CursistView extends View {

    // aanmaken van alle nodige databases, een tabel met alle cursist gegevens, en
    // een lijst met alle cursist object, en een validation
    private final CursistDB cdb;
    private final CursusDB cursusdb;
    private final TableView cursistTable = new TableView();
    private final ObservableList<Cursist> cursist;
    private final ModuleDB mdb;
    private final BekijktDB bdb;
    private final WebcastDB wdb;
    private final StatistiekDB sdb;
    private final Validation val = new Validation();

    // constructor methode van de CursistView
    public CursistView(CursistDB cdb, CursusDB cursusdb, ObservableList<Cursist> cursist, ModuleDB mdb, BekijktDB bdb,
            WebcastDB wdb, StatistiekDB sdb) {
        this.cdb = cdb;
        this.cursusdb = cursusdb;
        this.cursist = cursist;
        this.mdb = mdb;
        this.bdb = bdb;
        this.wdb = wdb;
        this.sdb = sdb;

        TableColumn emailColumn = new TableColumn("EmailAdres");
        TableColumn naamColumn = new TableColumn("Naam");
        TableColumn datumColumn = new TableColumn("GeboorteDatum");
        TableColumn geslachtColumn = new TableColumn("Geslacht");
        TableColumn straatColumn = new TableColumn("Straat");
        TableColumn huisnummerColumn = new TableColumn("Huisnummer");
        TableColumn postcodeColumn = new TableColumn("Postcode");
        TableColumn woonplaatsColumn = new TableColumn("Woonplaats");
        TableColumn landColumn = new TableColumn("Land");
        emailColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("emailAdres"));
        naamColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("naam"));
        datumColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("geboortedatum"));
        geslachtColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("geslacht"));
        straatColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("straat"));
        huisnummerColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("huisnr")); // niet veranderen
                                                                                                   // aub?
        postcodeColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("postcode"));
        woonplaatsColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("woonplaats"));
        landColumn.setCellValueFactory(new PropertyValueFactory<Cursist, String>("land"));

        // vullen van de TableView tabel met gegevens
        cursistTable.setItems(cursist);
        cursistTable.getColumns().addAll(emailColumn, naamColumn, datumColumn, geslachtColumn, straatColumn,
                huisnummerColumn, postcodeColumn, woonplaatsColumn, landColumn);
    }

    // methode die een nieuwe stage returnt naar de GUI klasse, wanneer de gebruiker
    // op de cursisten knop drukt
    // de gebruiker krijgt deze stage te zien
    public Stage getScene() throws SQLException {

        // aanmaken van stage en layout
        Stage window = new Stage();
        setTitle(window);
        VBox layout = new VBox();
        layout.setPadding(new Insets(8, 8, 8, 8));
        layout.setSpacing(5);
        layout.setMinHeight(200);
        layout.setMinWidth(1000);

        // tabel met cursist gegevens wordt toegevoegd aan de layout
        layout.getChildren().add(cursistTable);

        // error label
        Label errorLabel = new Label("");

        // view voortgang in een module
        // gebruiker kan een cursist en een module kiezen in een combobox
        HBox voortgangModule = new HBox();
        Label voortgangModuleLabel = new Label("View voortgang van een cursist in een module:");
        Label cursistLabel = new Label("Selecteer cursist: ");
        ComboBox cursistField = new ComboBox();
        cursistField.setItems(cursist);
        Label cursusLabel = new Label("Selecteer module: ");
        ComboBox moduleField = new ComboBox();
        moduleField.setItems(FXCollections.observableArrayList(mdb.getAllModules()));
        Label voortgangModuleOutput = new Label();
        Button viewVoortgangModule = new Button("View Voortgang");
        // als de gebruiker op de view voortgang button drukt wordt de methode
        // getContentItemProgress aangeroepen in de bekijkt database
        // deze methode krijgt een module ID en een cursist ID mee en geeft een
        // percentage terug
        // dit percentage komt op het scherm
        viewVoortgangModule.setOnAction((e) -> {
            int moduleId = ((codecademyher.domain.Module) moduleField.getValue()).getId();
            int cursistId = ((Cursist) cursistField.getValue()).getId();
            voortgangModuleOutput.setText(bdb.getContentItemProgress(moduleId, cursistId) + "%");
        });
        voortgangModule.getChildren().addAll(cursistLabel, cursistField, cursusLabel, moduleField, viewVoortgangModule,
                voortgangModuleOutput);
        // voortgang in een module wordt toegevoegd aan de layout
        layout.getChildren().addAll(voortgangModuleLabel, voortgangModule);

        // view voortgang in een webcast
        // de gebruiker kan een cursist en een webcast kiezen in een combobox
        HBox voortgangWebcast = new HBox();
        Label voortgangWebcastLabel = new Label("View voortgang van een cursist in een webcast:");
        Label webcastCursistLabel = new Label("Selecteer cursist: ");
        ComboBox webcastCursistField = new ComboBox();
        webcastCursistField.setItems(cursist);
        Label webcastLabel = new Label("Selecteer webcast: ");
        ComboBox webcastField = new ComboBox();
        webcastField.setItems(FXCollections.observableArrayList(wdb.getAllWebcasts()));
        Label voortgangWebcastOutput = new Label();
        // als de gebruiker op de view voortgang button drukt wordt de methode
        // getContentItemProgress aangeroepen in de bekijkt database
        // deze methode krijgt een webcast ID en een cursist ID mee en geeft een
        // percentage terug
        // dit percentage komt op het scherm
        Button viewVoortgangWebcast = new Button("View Voortgang");
        viewVoortgangWebcast.setOnAction((e) -> {
            int webcastId = ((Webcast) webcastField.getValue()).getId();
            int cursistId = ((Cursist) webcastCursistField.getValue()).getId();
            voortgangWebcastOutput.setText(bdb.getContentItemProgress(webcastId, cursistId) + "%");
        });
        voortgangWebcast.getChildren().addAll(webcastCursistLabel, webcastCursistField, webcastLabel, webcastField,
                viewVoortgangWebcast, voortgangWebcastOutput);
        // voortgang in een webcast wordt toegevoegd aan de layout
        layout.getChildren().addAll(voortgangWebcastLabel, voortgangWebcast);

        // view voortgang per module van cursus en cursist
        // de gebruiker kan een cursist en een cursus kiezen in een combobox
        HBox voortgangModCur = new HBox();
        Label voortgangModCurLabel = new Label("View voortgang van een cursist in een cursus per module:");
        Label modCurCursistLabel = new Label("Selecteer cursist: ");
        ComboBox modCurCursistField = new ComboBox();
        modCurCursistField.setItems(cursist);
        Label modCurLabel = new Label("Selecteer cursus: ");
        ComboBox modCurCursusField = new ComboBox();
        modCurCursusField.setItems(FXCollections.observableArrayList(cursusdb.getAllCursussen()));
        // als de gebruiker op de view voortgang button drukt wordt de methode
        // voortgangCursusPerModule aangeroepen
        // deze methode krijgt een cursist ID en een cursus ID mee en geeft een stage
        // terug
        // deze stage wordt vervolgens getoont aan de gebruiker
        Button viewVoortgang = new Button("View Voortgang");
        viewVoortgang.setOnAction((e) -> {
            int cursistId = ((Cursist) modCurCursistField.getValue()).getId();
            int cursusId = ((Cursus) modCurCursusField.getValue()).getId();
            Stage voortgangWindow = voortgangCursusPerModule(cursistId, cursusId);
            voortgangWindow.setWidth(700);
            voortgangWindow.setHeight(400);
            voortgangWindow.show();
        });
        voortgangModCur.getChildren().addAll(modCurCursistLabel, modCurCursistField, modCurLabel, modCurCursusField,
                viewVoortgang);
        // view voortgang per module wordt toegevoegd aan de layout
        layout.getChildren().addAll(voortgangModCurLabel, voortgangModCur);

        // view certificaten behaald door cursist
        // gebruiker kan een cursist selecteren in een combobox
        Label certificatenLabel = new Label("View behaalde certificaten van een cursist:");
        HBox certificatenBehaald = new HBox();
        Label certificaatCursistLabel = new Label("Selecteer cursist: ");
        ComboBox certificaatCursistField = new ComboBox();
        certificaatCursistField.setItems(cursist);
        Label certificatenOutput = new Label();
        // als de gebruiker op de view certificaten knop drukt wordt de methode
        // certificatenVanCursist uit de statistiek database aangeroepen
        // deze methode krijgt het cursist ID mee en geeft een input string terug
        // vervolgens wordt de methode viewCertificatenCursist aangeroepen, deze krijgt
        // de input string mee
        // deze methode geeft een stage terug en deze wordt getoond aan de gebruiker
        Button viewCertificaten = new Button("View Certificaten");
        viewCertificaten.setOnAction((e) -> {
            int cursistId = ((Cursist) certificaatCursistField.getValue()).getId();
            Stage view = viewCertificatenCursist(sdb.certificatenVanCursist(cursistId).toString() + "");
            view.setWidth(700);
            view.setHeight(400);
            view.show();
        });
        certificatenBehaald.getChildren().addAll(certificaatCursistLabel, certificaatCursistField, viewCertificaten);
        // view certificaten wordt aan de layout toegevoegd
        layout.getChildren().addAll(certificatenLabel, certificatenBehaald, certificatenOutput);

        // CRUD buttons krijgen een horizontale box
        HBox cursistButtons = new HBox();

        // als de gebruiker op de create button drukt wordt de createCursist methode
        // aangeroepen
        // deze methode geeft een stage terug en deze wordt getoond aan de gebruiker
        Button create = new Button("Create");
        create.setOnAction((e) -> {
            Stage createWindow = createCursist();
            createWindow.setWidth(700);
            createWindow.setHeight(400);
            createWindow.show();
        });

        // Delete
        Button delete = new Button("Delete");
        delete.setOnAction((e) -> {
            try {
                Cursist c = (Cursist) cursistTable.getSelectionModel().getSelectedItem();
                boolean deleted = cdb.deleteCursist(c);
                if (!deleted) {
                    errorLabel.setText("Deletion failed, possible FK constraint");
                } else {
                    errorLabel.setText("");
                }
                cursist.clear();
                cursist.addAll(cdb.getAllCursisten());
            } catch (Exception ex) {
                nothingSelected().show();
            }
        });

        // als de gebruiker op de update button drukt wordt de editCursist methode
        // aangeroepen
        // deze methode geeft een stage terug en deze wordt getoond aan de gebruiker
        Button update = new Button("Update");
        update.setOnAction((e) -> {
            try {
                Stage deleteWindow = editCursist((Cursist) cursistTable.getSelectionModel().getSelectedItem());
                deleteWindow.setWidth(700);
                deleteWindow.setHeight(400);
                deleteWindow.show();
            } catch (Exception ex) {
                nothingSelected().show();
            }
        });

        // als de gebruiker op de return button klikt sluit de stage
        Button returnButton = new Button("Return");
        returnButton.setOnAction((e) -> {
            window.hide();
        });

        // CRUD buttons en return button worden toegevoegd aan layout
        cursistButtons.getChildren().addAll(create, delete, update, returnButton);
        cursistButtons.setSpacing(5);
        layout.getChildren().add(cursistButtons);

        // layout wordt omgezet in scene, en deze wordt gereturnt naar de GUI klasse
        Scene cursistScene = new Scene(layout);
        window.setScene(cursistScene);
        return window;
    }

    // methode die alle cursist gegevens verwijderd en opnieuw de getAllCursisten
    // methode aanroept in de cursist database
    public void refreshCursistTable() {
        cursist.clear();
        cursist.addAll(cdb.getAllCursisten());
    }

    // methode returnt een stage waarop de voortgang van alle modules te zien is
    public Stage voortgangCursusPerModule(int cursistId, int cursusId) {
        HashMap<Integer, Double> voortgang = sdb.voortgangPerModuleVanCursusEnCursist(cursusId, cursistId);

        Stage window = new Stage();
        VBox layout = new VBox();
        layout.setPadding(new Insets(8, 8, 8, 8));
        for (Map.Entry<Integer, Double> entry : voortgang.entrySet()) {
            Label l = new Label(
                    "Module: " + mdb.getModuleById(entry.getKey()) + ", voortgang: " + entry.getValue() + "%");
            Label label = new Label("-----------------------------------------");
            layout.getChildren().addAll(l, label);
        }
        HBox button = new HBox();

        // return button, stage wordt gesloten
        Button returnButton = new Button("Return");
        returnButton.setOnAction((e) -> {
            window.hide();
        });
        button.getChildren().add(returnButton);
        layout.getChildren().add(button);
        Scene voortgangScene = new Scene(layout);
        setTitle(window);
        window.setScene(voortgangScene);
        return window;

    }

    // methode returnt een stage waarop alle certificaten te zien zijn die een
    // cursist behaald heeft
    public Stage viewCertificatenCursist(String input) {
        Stage window = new Stage();
        VBox layout = new VBox();
        layout.setPadding(new Insets(8, 8, 8, 8));
        String[] inputSplit = toStringListCleaner(input);
        if (inputSplit.length == 0) {
            Label label = new Label("De cursist heeft nog geen cursussen behaald");
            layout.getChildren().add(label);
        } else {
            for (int i = 0; i < inputSplit.length; i++) {
                // the if with the e int makes a line every 4 labels
                double e = 4.0;
                if (i / e == 1) {
                    Label label = new Label("-----------------------------------------");
                    layout.getChildren().addAll(label);
                    e = e + 4;
                }
                Label label = new Label(inputSplit[i]);

                layout.getChildren().add(label);
            }
            Label label = new Label("-----------------------------------------");
            layout.getChildren().add(label);

        }
        HBox button = new HBox();
        // return button sluit stage af
        Button returnButton = new Button("Return");
        returnButton.setOnAction((e) -> {
            window.hide();
        });
        button.getChildren().add(returnButton);
        layout.getChildren().add(button);
        Scene voortgangScene = new Scene(layout);
        setTitle(window);
        window.setScene(voortgangScene);

        return window;
    }

    // methode returnt een stage waarop de gebruiker input kan invullen om een
    // nieuwe cursist aan te maken
    public Stage createCursist() {
        Stage window = new Stage();
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(8, 8, 8, 8));
        layout.setHgap(10);
        layout.setVgap(5);
        setTitle(window);

        Label cursistLabel = new Label("Create Cursist:");
        layout.add(cursistLabel, 0, 0);

        Label emailLabel = new Label("Email");
        layout.add(emailLabel, 0, 1);
        TextField emailField = new TextField("Email");
        layout.add(emailField, 1, 1);
        Label naamLabel = new Label("Naam");
        layout.add(naamLabel, 0, 2);
        TextField naamField = new TextField("Naam");
        layout.add(naamField, 1, 2);
        Label jaarLabel = new Label("Geboortedatum (jjjj-mm-dd)");
        layout.add(jaarLabel, 0, 3);
        TextField jaarField = new TextField("Geboortejaar");
        layout.add(jaarField, 1, 3);
        TextField maandField = new TextField("Geboortemaand");
        layout.add(maandField, 2, 3);
        TextField dagField = new TextField("Geboortedag");
        layout.add(dagField, 3, 3);

        Label geslachtLabel = new Label("Geslacht");
        layout.add(geslachtLabel, 0, 4);
        ComboBox geslachtField = new ComboBox();
        geslachtField.getItems().addAll("Man", "Vrouw", "Anders");
        layout.add(geslachtField, 1, 4);

        Label straatLabel = new Label("Straat en huisnummer");
        layout.add(straatLabel, 0, 5);
        TextField straatField = new TextField("Straat");
        layout.add(straatField, 1, 5);
        TextField huisnrField = new TextField("Huisnummer");
        layout.add(huisnrField, 2, 5);

        Label postcodeLabel = new Label("Postcode en woonplaats");
        layout.add(postcodeLabel, 0, 6);
        TextField postcodeField = new TextField("Postcode");
        layout.add(postcodeField, 1, 6);
        TextField woonplaatsField = new TextField("Woonplaats");
        layout.add(woonplaatsField, 2, 6);

        Label landLabel = new Label("Land");
        layout.add(landLabel, 0, 7);
        TextField landField = new TextField("Land");
        layout.add(landField, 1, 7);

        Button create = new Button("Create");
        layout.add(create, 0, 8);

        // create button sluit de stage af, en maakt een nieuwe cursist in de cursist
        // database aan met de gegevens uit de input velden
        create.setOnAction((e) -> {

            if (val.isValidEmail(emailField.getText()) &&
                    val.isValidDate(jaarField.getText(), maandField.getText(), dagField.getText()) &&
                    val.isValidPostcode(postcodeField.getText())) {
                Cursist newC = new Cursist(
                        0,
                        emailField.getText(),
                        naamField.getText(),
                        LocalDate.of(Integer.parseInt(jaarField.getText()), Integer.parseInt(maandField.getText()),
                                Integer.parseInt(dagField.getText())),
                        Geslacht.fromString((String) geslachtField.getValue()),
                        straatField.getText(),
                        huisnrField.getText(),
                        postcodeField.getText(),
                        woonplaatsField.getText(),
                        landField.getText());
                cdb.addCursist(newC);
                cursist.clear();
                cursist.addAll(cdb.getAllCursisten());
                window.hide();
            } else {
                inputError().show();
            }

        });

        Scene createCursist = new Scene(layout);
        window.setScene(createCursist);
        return window;

    }

    // methode returnt een stage waarop de gebruiker gegevens van een cursist kan
    // wijzigen
    public Stage editCursist(Cursist c) {
        Stage window = new Stage();
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(8, 8, 8, 8));
        layout.setHgap(10);
        layout.setVgap(5);
        setTitle(window);

        Label cursistLabel = new Label("Update Cursist:");
        layout.add(cursistLabel, 0, 0);

        Label emailLabel = new Label("Email");
        layout.add(emailLabel, 0, 1);
        TextField emailField = new TextField(c.getEmailAdres());
        layout.add(emailField, 1, 1);
        Label naamLabel = new Label("Naam");
        layout.add(naamLabel, 0, 2);
        TextField naamField = new TextField(c.getNaam());
        layout.add(naamField, 1, 2);
        Label jaarLabel = new Label("Geboortedatum (jjjj-mm-dd)");
        layout.add(jaarLabel, 0, 3);
        TextField jaarField = new TextField(String.valueOf(c.getGeboortedatum().getYear()));
        layout.add(jaarField, 1, 3);
        TextField maandField = new TextField(String.valueOf(c.getGeboortedatum().getMonthValue()));
        layout.add(maandField, 2, 3);
        TextField dagField = new TextField(String.valueOf(c.getGeboortedatum().getDayOfMonth()));
        layout.add(dagField, 3, 3);

        Label geslachtLabel = new Label("Geslacht (" + c.getGeslacht() + ")");
        layout.add(geslachtLabel, 0, 4);
        ComboBox geslachtField = new ComboBox();
        geslachtField.getItems().addAll("Man", "Vrouw", "Anders");
        layout.add(geslachtField, 1, 4);

        Label straatLabel = new Label("Straat en huisnummer");
        layout.add(straatLabel, 0, 5);
        TextField straatField = new TextField(c.getStraat());
        layout.add(straatField, 1, 5);
        TextField huisnrField = new TextField(c.getHuisnr());
        layout.add(huisnrField, 2, 5);

        Label postcodeLabel = new Label("Postcode en woonplaats");
        layout.add(postcodeLabel, 0, 6);
        TextField postcodeField = new TextField(c.getPostcode());
        layout.add(postcodeField, 1, 6);
        TextField woonplaatsField = new TextField(c.getWoonplaats());
        layout.add(woonplaatsField, 2, 6);

        Label landLabel = new Label("Land");
        layout.add(landLabel, 0, 7);
        TextField landField = new TextField(c.getLand());
        layout.add(landField, 1, 7);

        Button update = new Button("Update");
        layout.add(update, 0, 8);

        // update button sluit de stage af, en maakt een nieuwe cursist aan en deze
        // vervangt de oude cursist in de cursist database
        update.setOnAction((e) -> {
            if (val.isValidEmail(emailField.getText()) &&
                    val.isValidDate(jaarField.getText(), maandField.getText(), dagField.getText()) &&
                    val.isValidPostcode(postcodeField.getText())) {
                Cursist newC = new Cursist(
                        0,
                        emailField.getText(),
                        naamField.getText(),
                        LocalDate.of(Integer.parseInt(jaarField.getText()), Integer.parseInt(maandField.getText()),
                                Integer.parseInt(dagField.getText())),
                        Geslacht.fromString((String) geslachtField.getValue()),
                        straatField.getText(),
                        huisnrField.getText(),
                        postcodeField.getText(),
                        woonplaatsField.getText(),
                        landField.getText());
                cdb.updateCursist(c, newC);
                cursist.clear();
                cursist.addAll(cdb.getAllCursisten());
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

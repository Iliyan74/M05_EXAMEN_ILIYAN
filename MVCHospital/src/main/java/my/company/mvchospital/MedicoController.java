package my.company.mvchospital;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MedicoController {
    @FXML
    private Button primaryButton;
    @FXML
    private TableView<Medico> medicoTable;
    @FXML
    private TableColumn<Medico, String> codigoColumn;
    @FXML
    private TableColumn<Medico, String> nombreColumn;
    @FXML
    private TableColumn<Medico, String> apellidosColumn;
    @FXML
    private TableColumn<Medico, String> especialidadColumn;
    @FXML
    private TableColumn<Medico, Integer> numeroColegiadoColumn;
    @FXML
    private TableColumn<Medico, String> cargoColumn;
    @FXML
    private TableColumn<Medico, String> observacionesColumn;    
  


    private ConsultasBD consultasBD = new ConsultasBD();

    @FXML
    public void initialize() {
        codigoColumn.setCellValueFactory(new PropertyValueFactory<>("codigoIdentifiacion"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        apellidosColumn.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        especialidadColumn.setCellValueFactory(new PropertyValueFactory<>("especialidad"));
        numeroColegiadoColumn.setCellValueFactory(new PropertyValueFactory<>("numeroColegiado"));
        cargoColumn.setCellValueFactory(new PropertyValueFactory<>("cargo"));
        observacionesColumn.setCellValueFactory(new PropertyValueFactory<>("observaciones"));



        ObservableList<Medico> medicos = FXCollections.observableArrayList(consultasBD.obtenerMedicos());
        medicoTable.setItems(medicos);
    }

}

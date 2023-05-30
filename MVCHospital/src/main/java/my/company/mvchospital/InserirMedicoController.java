package my.company.mvchospital;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InserirMedicoController {
    @FXML
    private TextField codigoIdentifiacionField;
    @FXML
    private TextField nombreField;
    @FXML
    private TextField apellidosField;
    @FXML
    private TextField especialidadField;
    @FXML
    private TextField numeroColegiadoField;
    @FXML
    private TextField cargoField;
    @FXML
    private TextField observacionesField;
    private ConsultasBD consultasBD = new ConsultasBD();

    @FXML
    private void inserirMediconuevo() {
        // Lógica para guardar los datos ingresados en la vista FXML "insertar_medico.fxml"
        // Aquí puedes acceder a los campos de texto y obtener los valores ingresados por el usuario
        // Puedes crear una instancia de Medico y guardarla en la base de datos o en la lista de medicos

        // Ejemplo:
        String codigoIdentifiacion = codigoIdentifiacionField.getText();
        String nombre = nombreField.getText();
        String apellidos = apellidosField.getText();
        String especialidad = especialidadField.getText();
        int numeroColegiado = Integer.parseInt(numeroColegiadoField.getText());
        String cargo = cargoField.getText();
        String observaciones = observacionesField.getText();
        // Crea un nuevo objeto Medico con los valores ingresados
        Medico nuevoMedico = new Medico(codigoIdentifiacion, nombre, apellidos, especialidad, numeroColegiado, cargo, observaciones);

        // Aquí puedes guardar el nuevoMedico en la base de datos o en la lista de medicos
        consultasBD.inserirMedico(nuevoMedico);

        // Limpia los campos de texto después de guardar el médico
        clearFields();
    }

    private void clearFields() {
        codigoIdentifiacionField.clear();
        nombreField.clear();
        apellidosField.clear();
        especialidadField.clear();
        numeroColegiadoField.clear();
        cargoField.clear();
        observacionesField.clear();
    }
}

package my.company.mvchospital;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

//cambiale el nombre añadiendo controller
public class ActualizarMedico {
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
    public void actualizarMedico() {
        // Recoges los datos que el usuario introduce en las pestañas
        String codigoIdentifiacion = codigoIdentifiacionField.getText();
        String nombre = nombreField.getText();
        String apellidos = apellidosField.getText();
        String especialidad = especialidadField.getText();
        int numeroColegiado = Integer.parseInt(numeroColegiadoField.getText());
        String cargo = cargoField.getText();
        String observaciones = observacionesField.getText();
        // Crea un nuevo objeto Medico con los valores ingresados
        Medico nuevoMedico = new Medico(codigoIdentifiacion, nombre, apellidos, especialidad, numeroColegiado, cargo, observaciones);

        consultasBD.actualizarMedico(nuevoMedico);
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

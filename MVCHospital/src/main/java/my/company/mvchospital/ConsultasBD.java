package my.company.mvchospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultasBD {

    private ConexionBD conexionBD = new ConexionBD();
    private String codigoIdentifiacion;

    public List<Medico> obtenerMedicos() {
        List<Medico> medicos = new ArrayList<>();
        String query = "SELECT * FROM medicos";
        try (Connection connection = conexionBD.establecerConexion();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Medico medico = new Medico(codigoIdentifiacion);
                medico.setCodigoIdentifiacion(rs.getString("Código_de_indentifiación_del_médico"));
                medico.setNombre(rs.getString("Nombre_de_médico"));
                medico.setApellidos(rs.getString("Apellidos_del_médico"));
                medico.setEspecialidad(rs.getString("Especilidad"));
                medico.setNumeroColegiado(rs.getInt("Número_de_colegiado"));
                medico.setCargo(rs.getString("Cargo"));
                medico.setObservaciones(rs.getString("Observaciones"));
                medicos.add(medico);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicos;
    }

    public void inserirMedico(Medico medico) {
        String query = "INSERT INTO medicos (`Código_de_indentifiación_del_médico`, `Nombre_de_médico`, `Apellidos_del_médico`, `Especilidad`, `Número_de_colegiado`, `Cargo`, `Observaciones`)" +
                       "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = conexionBD.establecerConexion();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, medico.getCodigoIdentifiacion());
            statement.setString(2, medico.getNombre());
            statement.setString(3, medico.getApellidos());
            statement.setString(4, medico.getEspecialidad());
            statement.setInt(5, medico.getNumeroColegiado());
            statement.setString(6, medico.getCargo());
            statement.setString(7, medico.getObservaciones());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Update
    public void actualizarMedico(Medico medico) {
        String query = "UPDATE medicos SET `Nombre_de_médico` = ?, `Apellidos_del_médico` = ?, `Especilidad` = ?, `Número_de_colegiado` = ?, `Cargo` = ?, `Observaciones` = ? WHERE `Código_de_indentifiación_del_médico` = ?";
    
        try (Connection connection = conexionBD.establecerConexion();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, medico.getNombre());
            statement.setString(2, medico.getApellidos());
            statement.setString(3, medico.getEspecialidad());
            statement.setInt(4, medico.getNumeroColegiado());
            statement.setString(5, medico.getCargo());
            statement.setString(6, medico.getObservaciones());
            statement.setString(7, medico.getCodigoIdentifiacion());
    
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Eliminar
    public void eliminarMedico(Medico medico) {
        String query = "DELETE FROM medicos WHERE codigo_identificacion = ?";
        
        try (Connection connection = conexionBD.establecerConexion();
             PreparedStatement statement = connection.prepareStatement(query)) {
            if (medico == null) {
    throw new IllegalArgumentException("El objeto Medico es nulo. Por favor, proporcione un objeto válido.");
}

            if (medico.getCodigoIdentifiacion() == null || medico.getCodigoIdentifiacion().isEmpty()) {
    throw new IllegalArgumentException("El código de identificación del médico está vacío o nulo. Por favor, ingrese un código válido.");
}
            
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("El médico con código de identificación " + medico.getCodigoIdentifiacion() + " ha sido eliminado.");
            } else {
                System.out.println("No se encontró ningún médico con código de identificación " + medico.getCodigoIdentifiacion() + ".");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
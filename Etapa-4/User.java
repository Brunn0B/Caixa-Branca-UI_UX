import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe que gerencia as operações de login de um usuário no sistema.
 * 
 * Esta classe é responsável por verificar as credenciais do usuário no banco de dados.
 */
public class User {

    /**
     * Estabelece uma conexão com o banco de dados MySQL.
     * 
     * @return conn A conexão com o banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            // Define a URL de conexão ao banco de dados
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção vazio
        }
        return conn;
    }

    // A variável 'nome' armazenará o nome do usuário autenticado
    public String nome = "";

    // A variável 'result' indica se a autenticação foi bem-sucedida
    public boolean result = false;

    /**
     * Verifica as credenciais de login do usuário no banco de dados.
     * 
     * @param login O nome de usuário que o usuário forneceu para login.
     * @param senha A senha fornecida pelo usuário para login.
     * @return true se as credenciais estiverem corretas, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // Montagem da consulta SQL
        sql += "SELECT nome FROM usuarios ";
        sql += "WHERE login = '" + login + "' ";
        sql += "AND senha = '" + senha + "'";

        try {
            // Cria uma declaração para executar a consulta
            Statement st = conn.createStatement();
            // Executa a consulta e obtém os resultados
            ResultSet rs = st.executeQuery(sql);

            // Se houver um resultado, define 'result' como verdadeiro e armazena o nome do usuário
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Tratamento de exceção vazio
        }
        return result;
    }
}

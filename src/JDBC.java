
// static final String DB_URL = "jdbc:mysql://localhost/JDBC";
// 	static final String USER = "root";
// 	static final String PASS = "NewPassword";



// // connection of the olduser

//             try (Connection conn = DriverManager.getConnection(firststage.DB_URL, firststage.USER, firststage.PASS);)

//             {
//                 String user = String.valueOf(txtUser.getText());
//                 String password = String.valueOf(pwBox.getText());

//                 Statement stmt = conn.createStatement();
//                 String sql = "INSERT INTO olduser (user,pass) VALUES ('" + user + "','" +
//                         password + "')";
//                 stmt.executeUpdate(sql);
//                 System.out.println("new record successfully inserted ... ");
//             } catch (SQLException t) {
//                 t.printStackTrace();
//             }









// try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)

// {
// String name = String.valueOf(TfName.getText());
// String pass = String.valueOf(TfPass.getText());
// String lname = String.valueOf(TfLname.getText());
// String age = String.valueOf(TfAge.getText());
// String adress = String.valueOf(TfAddress.getText());
// String temail = String.valueOf(TfEmail.getText());

// Statement stmt = conn.createStatement();
// String sql = "INSERT INTO newuser (NewUser,LN,email,Age,adress,pass) VALUES
// ('" + name + "','" +lname + "','" + temail + "','" +age + "','" + adress +
// "','" + pass + "')";
// stmt.executeUpdate(sql);
// System.out.println("new user record successfully inserted ... ");
// } catch (SQLException t) {
// t.printStackTrace();
// }





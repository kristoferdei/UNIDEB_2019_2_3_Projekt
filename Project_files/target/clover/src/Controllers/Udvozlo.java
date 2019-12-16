/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controllers;

import Database.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public class Udvozlo extends Controller<User>{public static class __CLR4_3_1r0r0k3yg1ivn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575896423404L,8589935092L,1024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    Button regButton, newPassButton, signInButton, signInGuestButton, alertButton;

    @FXML
    TextField userName;

    @FXML
    PasswordField passWord;

    @FXML
    Pane alertPane, signPane;

    static Optional<User> loggedUser;

    static boolean loggedIn = false;

    /**
     * \u00daj jelsz\u00f3t ig\u00e9nyl\u0151 fel\u00fclet megnyit\u00e1sa
     * @throws Exception
     */
    public void newPassButtonClicked() throws Exception {try{__CLR4_3_1r0r0k3yg1ivn.R.inc(972);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(973);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Uj_jelszo.fxml"));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(974);Stage regStage = new Stage();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(975);regStage.setTitle("Jelsz\u00f3 megv\u00e1ltoztat\u00e1sa");
        __CLR4_3_1r0r0k3yg1ivn.R.inc(976);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(977);regStage.setScene(new Scene(newUser, 600, 300));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(978);regStage.setResizable(false);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(979);regStage.show();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(980);Stage stage = (Stage) newPassButton.getScene().getWindow();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(981);stage.close();

    }finally{__CLR4_3_1r0r0k3yg1ivn.R.flushNeeded();}}

    /**
     * Regiszt\u00e1ci\u00f3s fel\u00fclelet megnyit\u00e1sa
     * @throws Exception
     */
    public void regButtonClicked() throws Exception {try{__CLR4_3_1r0r0k3yg1ivn.R.inc(982);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(983);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Regisztracio.fxml"));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(984);Stage regStage = new Stage();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(985);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_1r0r0k3yg1ivn.R.inc(986);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(987);regStage.setScene(new Scene(newUser, 600, 300));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(988);regStage.setResizable(false);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(989);regStage.show();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(990);Stage stage = (Stage) regButton.getScene().getWindow();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(991);stage.close();

    }finally{__CLR4_3_1r0r0k3yg1ivn.R.flushNeeded();}}

    /**
     * Bejelentkez\u00e9s gombra val\u00f3 kattint\u00e1s,
     * megny\u00edlik a F\u0151k\u00e9perny\u0151 fel\u00fclet
     * @throws Exception
     */
    public void signInButtonClicked() throws Exception {try{__CLR4_3_1r0r0k3yg1ivn.R.inc(992);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(993);loggedUser = getData().stream().filter(e -> e.getUsername().equals(userName.getText()) && e.getPassword().equals(Regisztracio.hasher(passWord.getText()))).findFirst();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(994);if((((loggedUser.isPresent())&&(__CLR4_3_1r0r0k3yg1ivn.R.iget(995)!=0|true))||(__CLR4_3_1r0r0k3yg1ivn.R.iget(996)==0&false))) {{
            __CLR4_3_1r0r0k3yg1ivn.R.inc(997);loggedIn = true;
            __CLR4_3_1r0r0k3yg1ivn.R.inc(998);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
            __CLR4_3_1r0r0k3yg1ivn.R.inc(999);Stage mainStage = new Stage();
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1000);mainStage.setTitle("F\u0151k\u00e9perny\u0151");
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1001);mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1002);mainStage.setScene(new Scene(newUser, 960, 720));
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1003);mainStage.setResizable(false);
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1004);mainStage.show();
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1005);Stage stage = (Stage) signInButton.getScene().getWindow();
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1006);stage.close();
        } }else {{
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1007);alertPane.setVisible(true);
            __CLR4_3_1r0r0k3yg1ivn.R.inc(1008);signPane.setVisible(false);

        }

    }}finally{__CLR4_3_1r0r0k3yg1ivn.R.flushNeeded();}}

    /**
     * OK gombra val\u00f3 kattint\u00e1s,
     * hib\u00e1s jelsz\u00f3 vagy felhaszn\u00e1l\u00f3n\u00e9v eset\u00e9n
     * @throws Exception
     */
    public void alertButtonClicked() throws Exception {try{__CLR4_3_1r0r0k3yg1ivn.R.inc(1009);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1010);signPane.setVisible(true);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1011);alertPane.setVisible(false);

    }finally{__CLR4_3_1r0r0k3yg1ivn.R.flushNeeded();}}

    /**
     * Bejelentkez\u00e9s vend\u00e9gk\u00e9nt gombra val\u00f3 kattint\u00e1s,
     * megny\u00edlik a F\u0151k\u00e9perny\u0151 fel\u00fclet
     * @throws Exception
     */
    public void signInGuestButtonClicked() throws Exception {try{__CLR4_3_1r0r0k3yg1ivn.R.inc(1012);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1013);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1014);Stage mainStage = new Stage();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1015);mainStage.setTitle("F\u0151k\u00e9perny\u0151");
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1016);mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1017);mainStage.setScene(new Scene(newUser, 960, 720));
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1018);mainStage.setResizable(false);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1019);mainStage.show();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1020);Stage stage = (Stage) signInGuestButton.getScene().getWindow();
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1021);stage.close();

    }finally{__CLR4_3_1r0r0k3yg1ivn.R.flushNeeded();}}

    @Override
    public List<User> getData() {try{__CLR4_3_1r0r0k3yg1ivn.R.inc(1022);
        __CLR4_3_1r0r0k3yg1ivn.R.inc(1023);return userDao.getAllUser();

    }finally{__CLR4_3_1r0r0k3yg1ivn.R.flushNeeded();}}
    
}

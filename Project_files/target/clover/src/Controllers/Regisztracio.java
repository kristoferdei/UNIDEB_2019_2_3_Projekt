/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controllers;

import Database.User;
import Database.UserDAO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.List;

public class Regisztracio extends Controller<User> {public static class __CLR4_3_1djdjk3rbb32x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575465208341L,8589935092L,549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    Button registButton, backButton;

    @FXML
    TextField registName;

    @FXML
    PasswordField registPasw;

    @FXML
    Label warningName, warningPassw;

    /**
     * Regisztr\u00e1ci\u00f3s mez\u0151k helyes kit\u00f6lt\u00e9s\u00e9nek ellen\u0151rz\u00e9se,
     * \u00fcresen hagyott mez\u0151k eset\u00e9n figyelmeztet\u00e9s
     * @throws Exception
     */

    public void registCheck()
    throws Exception{try{__CLR4_3_1djdjk3rbb32x.R.inc(487);
        __CLR4_3_1djdjk3rbb32x.R.inc(488);warningName.setVisible(false);
        __CLR4_3_1djdjk3rbb32x.R.inc(489);warningPassw.setVisible(false);
        __CLR4_3_1djdjk3rbb32x.R.inc(490);if((((registName.getText().equals("") && registPasw.getText().equals(""))&&(__CLR4_3_1djdjk3rbb32x.R.iget(491)!=0|true))||(__CLR4_3_1djdjk3rbb32x.R.iget(492)==0&false))){{
                __CLR4_3_1djdjk3rbb32x.R.inc(493);warningName.setVisible(true);
                __CLR4_3_1djdjk3rbb32x.R.inc(494);warningPassw.setVisible(true);

        } }else {__CLR4_3_1djdjk3rbb32x.R.inc(495);if((((registName.getText().equals(""))&&(__CLR4_3_1djdjk3rbb32x.R.iget(496)!=0|true))||(__CLR4_3_1djdjk3rbb32x.R.iget(497)==0&false))) {{
           __CLR4_3_1djdjk3rbb32x.R.inc(498);warningName.setVisible(true);
        } }else {__CLR4_3_1djdjk3rbb32x.R.inc(499);if((((registPasw.getText().equals(""))&&(__CLR4_3_1djdjk3rbb32x.R.iget(500)!=0|true))||(__CLR4_3_1djdjk3rbb32x.R.iget(501)==0&false))) {{
            __CLR4_3_1djdjk3rbb32x.R.inc(502);warningPassw.setVisible(true);
        } }else {{
            __CLR4_3_1djdjk3rbb32x.R.inc(503);if ((((getData().stream().anyMatch(e -> e.getUsername().equals(registName.getText())))&&(__CLR4_3_1djdjk3rbb32x.R.iget(504)!=0|true))||(__CLR4_3_1djdjk3rbb32x.R.iget(505)==0&false))) {{
                //TODO: Visszajelz\u00e9s, hogy l\u00e9tezik m\u00e1r a felhaszn\u00e1l\u00f3
            } }else {{
                __CLR4_3_1djdjk3rbb32x.R.inc(506);User newUser = User.builder()
                        .username(registName.getText())
                        .password(hasher(registPasw.getText())).build();

                __CLR4_3_1djdjk3rbb32x.R.inc(507);userDao.persist(newUser);
                __CLR4_3_1djdjk3rbb32x.R.inc(508);backToLogin();
            }
        }}
    }}}}finally{__CLR4_3_1djdjk3rbb32x.R.flushNeeded();}}
    /**
     * Regsztr\u00e1ci\u00f3 gombra val\u00f3 kattint\u00e1s,
     * megny\u00edlik az \u00dcdv\u00f6zl\u0151 fel\u00fclet
     * @throws Exception
     */
    public void backToLogin() throws Exception{try{__CLR4_3_1djdjk3rbb32x.R.inc(509);
        __CLR4_3_1djdjk3rbb32x.R.inc(510);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        __CLR4_3_1djdjk3rbb32x.R.inc(511);Stage regStage = new Stage();
        __CLR4_3_1djdjk3rbb32x.R.inc(512);regStage.setTitle("Game_Over");
        __CLR4_3_1djdjk3rbb32x.R.inc(513);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1djdjk3rbb32x.R.inc(514);regStage.setScene(new Scene(newUser, 480, 720));
        __CLR4_3_1djdjk3rbb32x.R.inc(515);regStage.setResizable(false);
        __CLR4_3_1djdjk3rbb32x.R.inc(516);regStage.show();
        __CLR4_3_1djdjk3rbb32x.R.inc(517);Stage stage = (Stage) registButton.getScene().getWindow();
        __CLR4_3_1djdjk3rbb32x.R.inc(518);stage.close();

    }finally{__CLR4_3_1djdjk3rbb32x.R.flushNeeded();}}

    /**
     * Vissza gombra val\u00f3 kattint\u00e1s,
     * visszal\u00e9p\u00e9s az \u00dcdv\u00f6zl\u0151 fel\u00fcletre
     * @throws Exception
     */
    public void backButtonClicked() throws Exception {try{__CLR4_3_1djdjk3rbb32x.R.inc(519);
        __CLR4_3_1djdjk3rbb32x.R.inc(520);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        __CLR4_3_1djdjk3rbb32x.R.inc(521);Stage regStage = new Stage();
        __CLR4_3_1djdjk3rbb32x.R.inc(522);regStage.setTitle("Game_Over");
        __CLR4_3_1djdjk3rbb32x.R.inc(523);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1djdjk3rbb32x.R.inc(524);regStage.setScene(new Scene(newUser, 480, 720));
        __CLR4_3_1djdjk3rbb32x.R.inc(525);regStage.setResizable(false);
        __CLR4_3_1djdjk3rbb32x.R.inc(526);regStage.show();
        __CLR4_3_1djdjk3rbb32x.R.inc(527);Stage stage = (Stage) backButton.getScene().getWindow();
        __CLR4_3_1djdjk3rbb32x.R.inc(528);stage.close();

    }finally{__CLR4_3_1djdjk3rbb32x.R.flushNeeded();}}

    @Override
    public List<User> getData() {try{__CLR4_3_1djdjk3rbb32x.R.inc(529);
        __CLR4_3_1djdjk3rbb32x.R.inc(530);return userDao.getAllUser();
    }finally{__CLR4_3_1djdjk3rbb32x.R.flushNeeded();}}


    public static String hasher(String string) {try{__CLR4_3_1djdjk3rbb32x.R.inc(531);
        __CLR4_3_1djdjk3rbb32x.R.inc(532);String hash1 = "xtrezrtu6tfia2gsudhijdad";
        __CLR4_3_1djdjk3rbb32x.R.inc(533);String hash2 = "ddbo1e3768798p3ue1hbdncv";
        __CLR4_3_1djdjk3rbb32x.R.inc(534);return hash1 + caesarCoder(string) + hash2;
    }finally{__CLR4_3_1djdjk3rbb32x.R.flushNeeded();}}

    private static StringBuffer caesarCoder(String passwd) {try{__CLR4_3_1djdjk3rbb32x.R.inc(535);
        __CLR4_3_1djdjk3rbb32x.R.inc(536);int s = 5;
        __CLR4_3_1djdjk3rbb32x.R.inc(537);StringBuffer result= new StringBuffer();

        __CLR4_3_1djdjk3rbb32x.R.inc(538);for (int i=0; (((i<passwd.length())&&(__CLR4_3_1djdjk3rbb32x.R.iget(539)!=0|true))||(__CLR4_3_1djdjk3rbb32x.R.iget(540)==0&false)); i++)
        {{
            __CLR4_3_1djdjk3rbb32x.R.inc(541);if ((((Character.isUpperCase(passwd.charAt(i)))&&(__CLR4_3_1djdjk3rbb32x.R.iget(542)!=0|true))||(__CLR4_3_1djdjk3rbb32x.R.iget(543)==0&false)))
            {{
                __CLR4_3_1djdjk3rbb32x.R.inc(544);char ch = (char)(((int)passwd.charAt(i) +
                        s - 65) % 26 + 65);
                __CLR4_3_1djdjk3rbb32x.R.inc(545);result.append(ch);
            }
            }else
            {{
                __CLR4_3_1djdjk3rbb32x.R.inc(546);char ch = (char)(((int)passwd.charAt(i) +
                        s - 97) % 26 + 97);
                __CLR4_3_1djdjk3rbb32x.R.inc(547);result.append(ch);
            }
        }}
        }__CLR4_3_1djdjk3rbb32x.R.inc(548);return result;
    }finally{__CLR4_3_1djdjk3rbb32x.R.flushNeeded();}}
}

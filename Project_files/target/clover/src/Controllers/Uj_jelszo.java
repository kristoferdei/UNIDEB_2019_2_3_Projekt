/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Uj_jelszo {public static class __CLR4_3_1jzjzk3vk35uc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575721819848L,8589935092L,756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    Button saveButton, backButton1;

    @FXML
    Label warningName, warningPassw;

    @FXML
    JFXTextField userName, newPassw;

    /**
     * \u00daj jelsz\u00f3 ig\u00e9nyl\u00e9s\u00e9hez sz\u00fcks\u00e9ges mez\u0151k kit\u00f6lt\u00e9s\u00e9nek ellen\u0151rz\u00e9se,
     * \u00fcresen hagyott mez\u0151k eset\u00e9n figyelmeztet\u00e9s
     * @throws Exception
     */
    public void emptyCheck() throws Exception{try{__CLR4_3_1jzjzk3vk35uc.R.inc(719);
        __CLR4_3_1jzjzk3vk35uc.R.inc(720);warningName.setVisible(false);
        __CLR4_3_1jzjzk3vk35uc.R.inc(721);warningPassw.setVisible(false);
        __CLR4_3_1jzjzk3vk35uc.R.inc(722);if((((userName.getText().equals("") && newPassw.getText().equals(""))&&(__CLR4_3_1jzjzk3vk35uc.R.iget(723)!=0|true))||(__CLR4_3_1jzjzk3vk35uc.R.iget(724)==0&false))){{
            __CLR4_3_1jzjzk3vk35uc.R.inc(725);warningName.setVisible(true);
            __CLR4_3_1jzjzk3vk35uc.R.inc(726);warningPassw.setVisible(true);
        } }else {__CLR4_3_1jzjzk3vk35uc.R.inc(727);if((((userName.getText().equals(""))&&(__CLR4_3_1jzjzk3vk35uc.R.iget(728)!=0|true))||(__CLR4_3_1jzjzk3vk35uc.R.iget(729)==0&false))) {{
            __CLR4_3_1jzjzk3vk35uc.R.inc(730);warningName.setVisible(true);
        } }else {__CLR4_3_1jzjzk3vk35uc.R.inc(731);if((((newPassw.getText().equals(""))&&(__CLR4_3_1jzjzk3vk35uc.R.iget(732)!=0|true))||(__CLR4_3_1jzjzk3vk35uc.R.iget(733)==0&false))) {{
            __CLR4_3_1jzjzk3vk35uc.R.inc(734);warningPassw.setVisible(true);
        } }else {{
            __CLR4_3_1jzjzk3vk35uc.R.inc(735);saveButtonClicked();
        }

    }}}}finally{__CLR4_3_1jzjzk3vk35uc.R.flushNeeded();}}

    /**
     * Ment\u00e9s gombra val\u00f3 kattint\u00e1s,
     * megny\u00edlik az \u00dcdv\u00f6zl\u0151 fel\u00fclet
     * @throws Exception
     */
    public void saveButtonClicked() throws Exception {try{__CLR4_3_1jzjzk3vk35uc.R.inc(736);
        __CLR4_3_1jzjzk3vk35uc.R.inc(737);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        __CLR4_3_1jzjzk3vk35uc.R.inc(738);Stage regStage = new Stage();
        __CLR4_3_1jzjzk3vk35uc.R.inc(739);regStage.setTitle("Game_Over");
        __CLR4_3_1jzjzk3vk35uc.R.inc(740);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1jzjzk3vk35uc.R.inc(741);regStage.setScene(new Scene(newUser, 480, 720));
        __CLR4_3_1jzjzk3vk35uc.R.inc(742);regStage.setResizable(false);
        __CLR4_3_1jzjzk3vk35uc.R.inc(743);regStage.show();
        __CLR4_3_1jzjzk3vk35uc.R.inc(744);Stage stage = (Stage) saveButton.getScene().getWindow();
        __CLR4_3_1jzjzk3vk35uc.R.inc(745);stage.close();

    }finally{__CLR4_3_1jzjzk3vk35uc.R.flushNeeded();}}

    /**
     * Vissza gombra val\u00f3 kattint\u00e1s,
     * visszal\u00e9p\u00e9s az \u00dcdv\u00f6zl\u0151 fel\u00fcletre
     * @throws Exception
     */
    public void backButton1Clicked() throws Exception {try{__CLR4_3_1jzjzk3vk35uc.R.inc(746);
        __CLR4_3_1jzjzk3vk35uc.R.inc(747);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        __CLR4_3_1jzjzk3vk35uc.R.inc(748);Stage regStage = new Stage();
        __CLR4_3_1jzjzk3vk35uc.R.inc(749);regStage.setTitle("Game_Over");
        __CLR4_3_1jzjzk3vk35uc.R.inc(750);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1jzjzk3vk35uc.R.inc(751);regStage.setScene(new Scene(newUser, 480, 720));
        __CLR4_3_1jzjzk3vk35uc.R.inc(752);regStage.setResizable(false);
        __CLR4_3_1jzjzk3vk35uc.R.inc(753);regStage.show();
        __CLR4_3_1jzjzk3vk35uc.R.inc(754);Stage stage = (Stage) backButton1.getScene().getWindow();
        __CLR4_3_1jzjzk3vk35uc.R.inc(755);stage.close();

    }finally{__CLR4_3_1jzjzk3vk35uc.R.flushNeeded();}}

}

/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Udvozlo {public static class __CLR4_3_11w1wk3eba1fx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1574679099277L,8589935092L,108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    Button regButton, newPassButton, signInButton, signInGuestButton;

    /**
     * \u00daj jelsz\u00f3t ig\u00e9nyl\u0151 fel\u00fclet megnyit\u00e1sa
     * @throws Exception
     */
    public void newPassButtonClicked() throws Exception {try{__CLR4_3_11w1wk3eba1fx.R.inc(68);
        __CLR4_3_11w1wk3eba1fx.R.inc(69);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Uj_jelszo.fxml"));
        __CLR4_3_11w1wk3eba1fx.R.inc(70);Stage regStage = new Stage();
        __CLR4_3_11w1wk3eba1fx.R.inc(71);regStage.setTitle("Jelsz\u00f3 megv\u00e1ltoztat\u00e1sa");
        __CLR4_3_11w1wk3eba1fx.R.inc(72);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_11w1wk3eba1fx.R.inc(73);regStage.setScene(new Scene(newUser, 600, 300));
        __CLR4_3_11w1wk3eba1fx.R.inc(74);regStage.setResizable(false);
        __CLR4_3_11w1wk3eba1fx.R.inc(75);regStage.show();
        __CLR4_3_11w1wk3eba1fx.R.inc(76);Stage stage = (Stage) newPassButton.getScene().getWindow();
        __CLR4_3_11w1wk3eba1fx.R.inc(77);stage.close();

    }finally{__CLR4_3_11w1wk3eba1fx.R.flushNeeded();}}

    /**
     * Regiszt\u00e1ci\u00f3s fel\u00fclelet megnyit\u00e1sa
     * @throws Exception
     */
    public void regButtonClicked() throws Exception {try{__CLR4_3_11w1wk3eba1fx.R.inc(78);
        __CLR4_3_11w1wk3eba1fx.R.inc(79);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Regisztracio.fxml"));
        __CLR4_3_11w1wk3eba1fx.R.inc(80);Stage regStage = new Stage();
        __CLR4_3_11w1wk3eba1fx.R.inc(81);regStage.setTitle("Regisztr\u00e1ci\u00f3");
        __CLR4_3_11w1wk3eba1fx.R.inc(82);regStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_11w1wk3eba1fx.R.inc(83);regStage.setScene(new Scene(newUser, 600, 300));
        __CLR4_3_11w1wk3eba1fx.R.inc(84);regStage.setResizable(false);
        __CLR4_3_11w1wk3eba1fx.R.inc(85);regStage.show();
        __CLR4_3_11w1wk3eba1fx.R.inc(86);Stage stage = (Stage) regButton.getScene().getWindow();
        __CLR4_3_11w1wk3eba1fx.R.inc(87);stage.close();

    }finally{__CLR4_3_11w1wk3eba1fx.R.flushNeeded();}}

    /**
     * Bejelentkez\u00e9s gombra val\u00f3 kattint\u00e1s,
     * megny\u00edlik a F\u0151k\u00e9perny\u0151 fel\u00fclet
     * @throws Exception
     */
    public void signInButtonClicked() throws Exception {try{__CLR4_3_11w1wk3eba1fx.R.inc(88);
        __CLR4_3_11w1wk3eba1fx.R.inc(89);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        __CLR4_3_11w1wk3eba1fx.R.inc(90);Stage mainStage = new Stage();
        __CLR4_3_11w1wk3eba1fx.R.inc(91);mainStage.setTitle("F\u0151k\u00e9perny\u0151");
        __CLR4_3_11w1wk3eba1fx.R.inc(92);mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_11w1wk3eba1fx.R.inc(93);mainStage.setScene(new Scene(newUser, 960, 720));
        __CLR4_3_11w1wk3eba1fx.R.inc(94);mainStage.setResizable(false);
        __CLR4_3_11w1wk3eba1fx.R.inc(95);mainStage.show();
        __CLR4_3_11w1wk3eba1fx.R.inc(96);Stage stage = (Stage) signInButton.getScene().getWindow();
        __CLR4_3_11w1wk3eba1fx.R.inc(97);stage.close();
    }finally{__CLR4_3_11w1wk3eba1fx.R.flushNeeded();}}

    /**
     * Bejelentkez\u00e9s vend\u00e9gk\u00e9nt gombra val\u00f3 kattint\u00e1s,
     * megny\u00edlik a F\u0151k\u00e9perny\u0151 fel\u00fclet
     * @throws Exception
     */
    public void signInGuestButtonClicked() throws Exception {try{__CLR4_3_11w1wk3eba1fx.R.inc(98);
        __CLR4_3_11w1wk3eba1fx.R.inc(99);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        __CLR4_3_11w1wk3eba1fx.R.inc(100);Stage mainStage = new Stage();
        __CLR4_3_11w1wk3eba1fx.R.inc(101);mainStage.setTitle("F\u0151k\u00e9perny\u0151");
        __CLR4_3_11w1wk3eba1fx.R.inc(102);mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_11w1wk3eba1fx.R.inc(103);mainStage.setScene(new Scene(newUser, 960, 720));
        __CLR4_3_11w1wk3eba1fx.R.inc(104);mainStage.setResizable(false);
        __CLR4_3_11w1wk3eba1fx.R.inc(105);mainStage.show();
        __CLR4_3_11w1wk3eba1fx.R.inc(106);Stage stage = (Stage) signInGuestButton.getScene().getWindow();
        __CLR4_3_11w1wk3eba1fx.R.inc(107);stage.close();
    }finally{__CLR4_3_11w1wk3eba1fx.R.flushNeeded();}}

}

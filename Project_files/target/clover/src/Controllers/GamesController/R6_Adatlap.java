/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controllers.GamesController;

import Controllers.Controller;
import Database.Game;
import Database.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class R6_Adatlap extends Controller<User> {public static class __CLR4_3_1jijik3vk35tb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575721819848L,8589935092L,719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //TODO: A klikkelt j\u00e1t\u00e9k megjelen\u00edt\u00e9se.
    //TODO: Ment\u00e9se a k\u00f6nyvt\u00e1rban m\u0171k\u00f6d\u00e9se.

    @FXML
    Button backButton, trailerButton;

    @FXML
    Label saveSuc;

    /**
     * Vissza gombra val\u00f3 klikkel\u00e9s,
     * megny\u00edlik a F\u0151k\u00e9perny\u0151 fel\u00fclet
     * @throws Exception
     */
    public void backButtonClicked() throws Exception {try{__CLR4_3_1jijik3vk35tb.R.inc(702);
        __CLR4_3_1jijik3vk35tb.R.inc(703);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Fokepernyo.fxml"));
        __CLR4_3_1jijik3vk35tb.R.inc(704);Stage dataStage = new Stage();
        __CLR4_3_1jijik3vk35tb.R.inc(705);dataStage.setTitle("F\u0151k\u00e9preny\u0151");
        __CLR4_3_1jijik3vk35tb.R.inc(706);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1jijik3vk35tb.R.inc(707);dataStage.setScene(new Scene(newUser, 960, 720));
        __CLR4_3_1jijik3vk35tb.R.inc(708);dataStage.setResizable(false);
        __CLR4_3_1jijik3vk35tb.R.inc(709);dataStage.show();
        __CLR4_3_1jijik3vk35tb.R.inc(710);Stage stage = (Stage) backButton.getScene().getWindow();
        __CLR4_3_1jijik3vk35tb.R.inc(711);stage.close();

    }finally{__CLR4_3_1jijik3vk35tb.R.flushNeeded();}}

    /**
     * Trailer gombra val\u00f3 klikkel\u00e9s,
     * megny\u00edlik a b\u00f6ng\u00e9sz\u0151ben az adott j\u00e1t\u00e9k trailer vide\u00f3ja
     * @throws Exception
     */
    public void trailerButtonClicked() throws Exception {try{__CLR4_3_1jijik3vk35tb.R.inc(712);
        __CLR4_3_1jijik3vk35tb.R.inc(713);Desktop browser = Desktop.getDesktop();
        __CLR4_3_1jijik3vk35tb.R.inc(714);browser.browse(new URI("https://youtu.be/6wlvYh0h63k"));

    }finally{__CLR4_3_1jijik3vk35tb.R.flushNeeded();}}

    /**
     *
     * @throws Exception
     */
    public void saveButtonClicked()throws Exception {try{__CLR4_3_1jijik3vk35tb.R.inc(715);
        __CLR4_3_1jijik3vk35tb.R.inc(716);saveSuc.setVisible(true);
    }finally{__CLR4_3_1jijik3vk35tb.R.flushNeeded();}}

    @Override
    public List<User> getData() {try{__CLR4_3_1jijik3vk35tb.R.inc(717);
        __CLR4_3_1jijik3vk35tb.R.inc(718);return null;
    }finally{__CLR4_3_1jijik3vk35tb.R.flushNeeded();}}
}

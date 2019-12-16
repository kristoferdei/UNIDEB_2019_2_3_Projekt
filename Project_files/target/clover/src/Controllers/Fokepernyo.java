/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Fokepernyo implements Initializable {public static class __CLR4_3_1lklkk3yg1iqb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575896423404L,8589935092L,870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    Button signOutButton, mainButton, libButton, exitButton;

    @FXML
    ImageView rainbowPic, dsPic, nfsPic, pubgPic, rd2Pic,rlPic,codPic;

    @FXML
    Pane mainPane, libPane;

    /**
     * Kijelentkez\u00e9s gombra val\u00f3 klikkel\u00e9s,
     * megny\u00edlik az \u00dcdv\u00f6zl\u0151 fel\u00fclet
     * @throws Exception
     */
    public void signOutButtonClicked() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(776);
        __CLR4_3_1lklkk3yg1iqb.R.inc(777);Udvozlo.loggedIn = false;
        __CLR4_3_1lklkk3yg1iqb.R.inc(778);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/Udvozlo.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(779);Stage mainStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(780);mainStage.setTitle("Bejelentkez\u00e9s");
        __CLR4_3_1lklkk3yg1iqb.R.inc(781);mainStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(782);mainStage.setScene(new Scene(newUser, 480, 720));
        __CLR4_3_1lklkk3yg1iqb.R.inc(783);mainStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(784);mainStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(785);Stage stage = (Stage) signOutButton.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(786);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}



    /**
     * J\u00e1t\u00e9k bor\u00edt\u00f3j\u00e1ra val\u00f3 kattint\u00e1ssal,
     * megny\u00edlik a j\u00e1t\u00e9k adatlapja
     * @throws Exception
     */
    public void rainbowGame() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(787);
        __CLR4_3_1lklkk3yg1iqb.R.inc(788);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/R6_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(789);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(790);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(791);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(792);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(793);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(794);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(795);Stage stage = (Stage) rainbowPic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(796);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
    public void dsGame() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(797);
        __CLR4_3_1lklkk3yg1iqb.R.inc(798);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/DS_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(799);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(800);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(801);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(802);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(803);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(804);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(805);Stage stage = (Stage) dsPic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(806);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
    public void nfsGame() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(807);
        __CLR4_3_1lklkk3yg1iqb.R.inc(808);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/NFS_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(809);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(810);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(811);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(812);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(813);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(814);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(815);Stage stage = (Stage) nfsPic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(816);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
    public void pubgGame() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(817);
        __CLR4_3_1lklkk3yg1iqb.R.inc(818);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/PUBG_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(819);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(820);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(821);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(822);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(823);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(824);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(825);Stage stage = (Stage) pubgPic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(826);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
    public void reddead2Game() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(827);
        __CLR4_3_1lklkk3yg1iqb.R.inc(828);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/RD2_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(829);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(830);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(831);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(832);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(833);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(834);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(835);Stage stage = (Stage) rd2Pic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(836);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
    public void rocketleagueGame() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(837);
        __CLR4_3_1lklkk3yg1iqb.R.inc(838);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/RL_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(839);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(840);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(841);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(842);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(843);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(844);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(845);Stage stage = (Stage) rlPic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(846);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
    public void codGame() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(847);
        __CLR4_3_1lklkk3yg1iqb.R.inc(848);Parent newUser = FXMLLoader.load(getClass().getResource("/FXML/GamesFXML/COD_Adatlap.fxml"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(849);Stage dataStage = new Stage();
        __CLR4_3_1lklkk3yg1iqb.R.inc(850);dataStage.setTitle("Adatlap");
        __CLR4_3_1lklkk3yg1iqb.R.inc(851);dataStage.getIcons().add(new Image("/Pictures/Icon.png"));
        __CLR4_3_1lklkk3yg1iqb.R.inc(852);dataStage.setScene(new Scene(newUser, 810, 600));
        __CLR4_3_1lklkk3yg1iqb.R.inc(853);dataStage.setResizable(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(854);dataStage.show();
        __CLR4_3_1lklkk3yg1iqb.R.inc(855);Stage stage = (Stage) codPic.getScene().getWindow();
        __CLR4_3_1lklkk3yg1iqb.R.inc(856);stage.close();
    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}

    /**
     * F\u0151oldal gombra val\u00f3 klikkel\u00e9s,
     * megny\u00edlik a F\u00f6oldal fel\u00fclet
     * @throws Exception
     */
    public void mainButtonClicked() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(857);
        __CLR4_3_1lklkk3yg1iqb.R.inc(858);mainPane.setVisible(true);
        __CLR4_3_1lklkk3yg1iqb.R.inc(859);libPane.setVisible(false);

    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}

    /**
     * K\u00f6nyvt\u00e1r gombra val\u00f3 klikkel\u00e9s,
     * megny\u00edlik a k\u00f6nyvt\u00e1r fel\u00fclet
     * @throws Exception
     */
    public void libButtonClicked() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(860);
        __CLR4_3_1lklkk3yg1iqb.R.inc(861);mainPane.setVisible(false);
        __CLR4_3_1lklkk3yg1iqb.R.inc(862);libPane.setVisible(true);

    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}

    /**
     * Kil\u00e9p\u00e9s gombra val\u00f3 klikkel\u00e9s,
     * a programb\u00f3l val\u00f3 kil\u00e9p\u00e9s
     * @throws Exception
     */
    public void exitButtonClicked() throws Exception {try{__CLR4_3_1lklkk3yg1iqb.R.inc(863);
        __CLR4_3_1lklkk3yg1iqb.R.inc(864);System.exit(0);

    }finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {try{__CLR4_3_1lklkk3yg1iqb.R.inc(865);
        __CLR4_3_1lklkk3yg1iqb.R.inc(866);if((((!Udvozlo.loggedIn)&&(__CLR4_3_1lklkk3yg1iqb.R.iget(867)!=0|true))||(__CLR4_3_1lklkk3yg1iqb.R.iget(868)==0&false))){{
            __CLR4_3_1lklkk3yg1iqb.R.inc(869);libButton.setDisable(true);
        }
    }}finally{__CLR4_3_1lklkk3yg1iqb.R.flushNeeded();}}
}

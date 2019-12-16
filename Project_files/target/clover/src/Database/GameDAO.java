/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Database;

import util.jpa.GenericJpaDao;

import javax.persistence.TemporalType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GameDAO extends GenericJpaDao<Game>{public static class __CLR4_3_1auauk3ole9rr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575300754545L,8589935092L,400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public GameDAO() {
        super(Game.class);__CLR4_3_1auauk3ole9rr.R.inc(391);try{__CLR4_3_1auauk3ole9rr.R.inc(390);
    }finally{__CLR4_3_1auauk3ole9rr.R.flushNeeded();}}

    public List<Game> findAfter(int n){try{__CLR4_3_1auauk3ole9rr.R.inc(392);

        __CLR4_3_1auauk3ole9rr.R.inc(393);Date date = new Date();

        __CLR4_3_1auauk3ole9rr.R.inc(394);try {
            __CLR4_3_1auauk3ole9rr.R.inc(395);date = new SimpleDateFormat("yyyy").parse(String.valueOf(n));
        } catch (ParseException e) {
            __CLR4_3_1auauk3ole9rr.R.inc(396);e.printStackTrace();
        }

        __CLR4_3_1auauk3ole9rr.R.inc(397);return entityManager.createQuery("SELECT g FROM Game g WHERE releaseDate > :date").setParameter("date",date, TemporalType.DATE).getResultList();
    }finally{__CLR4_3_1auauk3ole9rr.R.flushNeeded();}}

    public List<Game> findGenre(String genre){try{__CLR4_3_1auauk3ole9rr.R.inc(398);
        __CLR4_3_1auauk3ole9rr.R.inc(399);return entityManager.createQuery("SELECT g from Game g WHERE (:genre) member of genres").setParameter("genre",genre).getResultList();
    }finally{__CLR4_3_1auauk3ole9rr.R.flushNeeded();}}
}

/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package Database;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {public static class __CLR4_3_17h7hk3mv3ndd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0072\u0069\u0073\u0074\u006f\u0066\u0065\u0072\u0064\u0065\u0069\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0047\u0069\u0074\u0048\u0075\u0062\u002f\u0047\u0061\u006d\u0065\u004f\u0076\u0065\u0072\u005f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u005f\u0066\u0069\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1575196122865L,8589935092L,278,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {try{__CLR4_3_17h7hk3mv3ndd.R.inc(269);
        __CLR4_3_17h7hk3mv3ndd.R.inc(270);try {
            // Create the SessionFactory from hibernate.cfg.xml
            __CLR4_3_17h7hk3mv3ndd.R.inc(271);return new AnnotationConfiguration().configure(
                    new File("hibernate.cgf.xml")).buildSessionFactory();

        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            __CLR4_3_17h7hk3mv3ndd.R.inc(272);System.err.println("Initial SessionFactory creation failed." + ex);
            __CLR4_3_17h7hk3mv3ndd.R.inc(273);throw new ExceptionInInitializerError(ex);
        }
    }finally{__CLR4_3_17h7hk3mv3ndd.R.flushNeeded();}}

    public static SessionFactory getSessionFactory() {try{__CLR4_3_17h7hk3mv3ndd.R.inc(274);
        __CLR4_3_17h7hk3mv3ndd.R.inc(275);return sessionFactory;
    }finally{__CLR4_3_17h7hk3mv3ndd.R.flushNeeded();}}

    public static void shutdown() {try{__CLR4_3_17h7hk3mv3ndd.R.inc(276);
        // Close caches and connection pools
        __CLR4_3_17h7hk3mv3ndd.R.inc(277);getSessionFactory().close();
    }finally{__CLR4_3_17h7hk3mv3ndd.R.flushNeeded();}}
}
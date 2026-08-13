            package p000;

            import android.os.Process;
            import android.os.WorkSource;
            import android.util.Log;
            import java.lang.reflect.Method;
            
            public abstract class i01Oi1i {
                public static final Method I00000oIO;
                public static final Method I00000oOI;
                public static Boolean I0000Il00O;

                static {
                    Method method;
                    Method method2;
/* 7 */             Class cls = Integer.TYPE;
/* 11 */            Process.myUid();
                    try {
/* 21 */                method = WorkSource.class.getMethod("add", cls);
                    } catch (Exception unused) {
/* 26 */                method = null;
                    }
/* 27 */            I00000oIO = method;
                    try {
/* 36 */                method2 = WorkSource.class.getMethod("add", cls, String.class);
                    } catch (Exception unused2) {
/* 41 */                method2 = null;
                    }
/* 42 */            I00000oOI = method2;
                    try {
/* 46 */                WorkSource.class.getMethod("size", null);
                    } catch (Exception unused3) {
                    }
                    try {
/* 55 */                WorkSource.class.getMethod("get", cls);
                    } catch (Exception unused4) {
                    }
                    try {
/* 64 */                WorkSource.class.getMethod("getName", cls);
                    } catch (Exception unused5) {
                    }
                    try {
/* 69 */                WorkSource.class.getMethod("createWorkChain", null);
                    } catch (Exception e) {
/* 76 */                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
                    }
                    try {
/* 91 */                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
                    } catch (Exception e2) {
/* 98 */                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
                    }
                    try {
/* 107 */               WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
                    } catch (Exception unused6) {
                    }
/* 110 */           I0000Il00O = null;
                }
            }

            package p000;

            import java.io.PrintWriter;
            import java.io.StringWriter;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public abstract class ilIilolOlIoO {
                public static void I00000oIO(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             if (th != th2) {
/* 3 */                 Integer num = O00O1IiOllOO.I00000oIO;
/* 19 */                if (num == null || num.intValue() >= 19) {
/* 21 */                    th.addSuppressed(th2);
/* 24 */                    return;
                        }
/* 25 */                Method method = OO1IIol.I00000oIO;
/* 27 */                if (method != null) {
/* 33 */                    method.invoke(th, th2);
                        }
                    }
                }

                public static String I00000oOI(Throwable th) {
/* 3 */             StringWriter stringWriter = new StringWriter();
/* 8 */             PrintWriter printWriter = new PrintWriter(stringWriter);
/* 11 */            th.printStackTrace(printWriter);
/* 14 */            printWriter.flush();
/* 17 */            return stringWriter.toString();
                }
            }

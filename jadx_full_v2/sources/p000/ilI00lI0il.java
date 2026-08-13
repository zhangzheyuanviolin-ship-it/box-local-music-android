            package p000;

            import java.lang.reflect.InvocationTargetException;
            
            public abstract class ilI00lI0il {
                public static final ilI1Oiilo00 I00000oIO;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v6, types: [ilI1Oiilo00] */
                static {
                    ilIiOiOoOl iliioioool;
                    try {
/* 2 */                 iliioioool = ilIlIil0IO.I00000oIO;
                    } catch (NoClassDefFoundError unused) {
/* 5 */                 iliioioool = null;
                    }
/* 6 */             if (iliioioool == null) {
/* 11 */                StringBuilder sb = new StringBuilder();
/* 17 */                for (int i = 0; i < 3; i++) {
/* 21 */                    String str = ilI1Oiilo00.I00000oIO[i];
                            try {
/* 35 */                        iliioioool = (ilI1Oiilo00) Class.forName(str).getConstructor(null).newInstance(null);
                            } catch (Throwable th) {
/* 41 */                        th = th;
/* 44 */                        sb.append('\n');
/* 47 */                        sb.append(str);
/* 52 */                        sb.append(": ");
/* 57 */                        if (th instanceof InvocationTargetException) {
/* 59 */                            th = th.getCause();
                                }
/* 63 */                        sb.append(th);
                            }
                        }
/* 110 */               throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
                    }
/* 38 */            I00000oIO = iliioioool;
                }
            }

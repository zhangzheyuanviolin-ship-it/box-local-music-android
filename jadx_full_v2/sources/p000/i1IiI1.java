            package p000;

            import java.lang.reflect.InvocationTargetException;
            
            public abstract class i1IiI1 {
                public static final i1IioiiO1 I00000oIO;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v6, types: [i1IioiiO1] */
                static {
                    i1O00ooO i1o00ooo;
                    try {
/* 2 */                 i1o00ooo = i1O0Il.I00000oIO;
                    } catch (NoClassDefFoundError unused) {
/* 5 */                 i1o00ooo = null;
                    }
/* 6 */             if (i1o00ooo == null) {
/* 11 */                StringBuilder sb = new StringBuilder();
/* 17 */                for (int i = 0; i < 3; i++) {
/* 21 */                    String str = i1IioiiO1.I00000oIO[i];
                            try {
/* 35 */                        i1o00ooo = (i1IioiiO1) Class.forName(str).getConstructor(null).newInstance(null);
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
/* 38 */            I00000oIO = i1o00ooo;
                }
            }

            package p000;

            import java.lang.reflect.InvocationTargetException;
            
            public abstract class iilio10l1i {
                public static final iio00I10 I00000oIO;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v6, types: [iio00I10] */
                static {
                    iioiOOllOioi iioioolloioi;
                    try {
/* 2 */                 iioioolloioi = iiolIoOo0io.I00000oIO;
                    } catch (NoClassDefFoundError unused) {
/* 5 */                 iioioolloioi = null;
                    }
/* 6 */             if (iioioolloioi == null) {
/* 11 */                StringBuilder sb = new StringBuilder();
/* 17 */                for (int i = 0; i < 3; i++) {
/* 21 */                    String str = iio00I10.I00000oIO[i];
                            try {
/* 35 */                        iioioolloioi = (iio00I10) Class.forName(str).getConstructor(null).newInstance(null);
                            } catch (Throwable th) {
/* 41 */                        th = th;
/* 44 */                        if (th instanceof InvocationTargetException) {
/* 46 */                            th = th.getCause();
                                }
/* 52 */                        sb.append('\n');
/* 55 */                        sb.append(str);
/* 60 */                        sb.append(": ");
/* 63 */                        sb.append(th);
                            }
                        }
/* 110 */               throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
                    }
/* 38 */            I00000oIO = iioioolloioi;
                }
            }

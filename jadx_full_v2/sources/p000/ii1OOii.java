            package p000;

            import java.io.Closeable;
            
            public abstract class ii1OOii {
                public static final void I00000oIO(Closeable closeable, Throwable th) {
/* 1 */             if (closeable != null) {
/* 3 */                 if (th == null) {
/* 5 */                     closeable.close();
/* 8 */                     return;
                        }
                        try {
/* 9 */                     closeable.close();
                        } catch (Throwable th2) {
/* 14 */                    ilIilolOlIoO.I00000oIO(th, th2);
                        }
                    }
                }
            }

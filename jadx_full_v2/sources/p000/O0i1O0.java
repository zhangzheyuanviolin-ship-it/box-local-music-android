            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            public abstract class O0i1O0 {
                public static final CopyOnWriteArrayList I00000oIO = new CopyOnWriteArrayList();

                public static I0oO1Io0l I00000oIO(String str) throws GeneralSecurityException {
                    boolean zStartsWith;
/* 3 */             Iterator it = I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                I0oO1Io0l i0oO1Io0l = (I0oO1Io0l) it.next();
                        synchronized (i0oO1Io0l) {
/* 28 */                    zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
                        }
/* 33 */                if (zStartsWith) {
/* 35 */                    return i0oO1Io0l;
                        }
                    }
/* 186 */           throw new GeneralSecurityException(IIl001iO0Io.I000o00OoI0I("No KMS client does support: ", str));
                }
            }

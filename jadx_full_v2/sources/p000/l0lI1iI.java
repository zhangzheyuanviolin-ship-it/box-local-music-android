            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class l0lI1iI {
                public static O0OIIioi I00000oIO(String str) throws GeneralSecurityException {
                    Map mapUnmodifiableMap;
/* 1 */             AtomicReference atomicReference = OOoiolOO0i.I00000oIO;
                    synchronized (OOoiolOO0i.class) {
/* 8 */                 mapUnmodifiableMap = Collections.unmodifiableMap(OOoiolOO0i.I0000O);
                    }
/* 17 */            O0OIIioi o0OIIioi = (O0OIIioi) mapUnmodifiableMap.get(str);
/* 19 */            if (o0OIIioi != null) {
/* 21 */                return o0OIIioi;
                    }
/* 33 */            throw new GeneralSecurityException(IIl001iO0Io.I000o00OoI0I("cannot find key template: ", str));
                }
            }

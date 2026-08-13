            package p000;

            import android.os.Looper;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            
            public abstract class O1OI1l011OO1 {
                public static final Io11l1li I00000oIO;

                static {
                    String property;
/* 3 */             int i = Olli0OOiloi.I00000oIO;
/* 5 */             Object next = null;
                    try {
/* 6 */                 property = System.getProperty("kotlinx.coroutines.fast.service.loader");
                    } catch (SecurityException unused) {
/* 11 */                property = null;
                    }
/* 12 */            if (property != null) {
/* 14 */                Boolean.parseBoolean(property);
                    }
                    try {
/* 44 */                Iterator it = OilO1oiooiII.I000lI(OilO1oiooiII.I0000Il00O(Arrays.asList(new I0o0ooi()).iterator())).iterator();
/* 52 */                if (it.hasNext()) {
/* 55 */                    next = it.next();
/* 63 */                    if (it.hasNext()) {
/* 69 */                        ((I0o0ooi) next).getClass();
/* 85 */                        do {
/* 78 */                            ((I0o0ooi) it.next()).getClass();
/* 85 */                        } while (it.hasNext());
                            }
                        }
/* 89 */                if (((I0o0ooi) next) == null) {
/* 117 */                   I000II.I001IO000("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
/* 120 */                   return;
                        }
/* 91 */                Looper mainLooper = Looper.getMainLooper();
/* 95 */                if (mainLooper != null) {
/* 106 */                   I00000oIO = new Io11l1li(Io11lOo1OOi.I00000oIO(mainLooper));
                        } else {
/* 111 */                   I000II.I001IO000("The main looper is not available");
                        }
                    } catch (Throwable th) {
/* 541 */               throw new ServiceConfigurationError(th.getMessage(), th);
                    }
                }
            }

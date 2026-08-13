            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IlIoi1iOOlOI implements I1looi1iO1il {
                public static final AtomicReference I00000oIO = new AtomicReference();

                @Override
                public final void I00000oIO(boolean z) {
                    synchronized (IlIoliIO.I000OiO) {
                        try {
/* 15 */                    Iterator it = new ArrayList(IlIoliIO.I000iOII.values()).iterator();
/* 23 */                    while (it.hasNext()) {
/* 29 */                        IlIoliIO ilIoliIO = (IlIoliIO) it.next();
/* 37 */                        if (ilIoliIO.I0000oI00.get()) {
/* 41 */                            Iterator it2 = ilIoliIO.I000OOo1O.iterator();
/* 49 */                            while (it2.hasNext()) {
/* 57 */                                IlIoliIO ilIoliIO2 = ((IlIoOiIl1l0) it2.next()).I00000oIO;
/* 59 */                                if (!z) {
/* 69 */                                    ((Ii1oil) ilIoliIO2.I000O01llI0.get()).I00000oOI();
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 186 */                   throw th;
                        }
                    }
                }
            }

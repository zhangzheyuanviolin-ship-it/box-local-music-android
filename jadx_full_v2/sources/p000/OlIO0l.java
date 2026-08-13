            package p000;

            import android.view.ViewConfiguration;
            import java.lang.invoke.VarHandle;
            
            public abstract class OlIO0l {
                public static final float I00000oIO = ViewConfiguration.getScrollFriction();

                /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Ii1OoIll0 I00000oIO(IloI0lOlll1 iloI0lOlll1) {
                    Object obj;
/* 7 */             IiIooOOOI iiIooOOOI = (IiIooOOOI) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000O01llI0);
/* 13 */            boolean zI0000O = iloI0lOlll1.I0000O(iiIooOOOI.I00000oIO());
/* 17 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 21 */            if (!zI0000O) {
                        obj = objI00O0i0ii;
/* 25 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 29 */                    IIOOoll iIOOoll = new IIOOoll(iiIooOOOI);
/* 34 */                    Ii1OoIll0 ii1OoIll0 = new Ii1OoIll0();
/* 37 */                    ii1OoIll0.I00000oIO = iIOOoll;
/* 39 */                    VarHandle.storeStoreFence();
/* 42 */                    iloI0lOlll1.I00iio(ii1OoIll0);
                            obj = ii1OoIll0;
                        }
                    }
/* 45 */            return (Ii1OoIll0) obj;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LIli0l1l01l1;", "LO1oooooIio;", "LIli0oiOI1i10;", "<init>", "()V", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            final class Ili0l1l01l1 extends O1oooooIio {
                public static final Ili0l1l01l1 I00000oIO = new Ili0l1l01l1();

                private Ili0l1l01l1() {
                }

                @Override
                public final O1ooOo I000II() {
/* 3 */             Ili0oiOI1i10 ili0oiOI1i10 = new Ili0oiOI1i10();
/* 9 */             Ili0o0i ili0o0i = new Ili0o0i(0);
/* 12 */            ili0o0i.I00iiI = ili0oiOI1i10;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            ili0oiOI1i10.I00o0l1o1o0 = ili0o0i;
/* 22 */            Ili0o0i ili0o0i2 = new Ili0o0i(1);
/* 25 */            ili0o0i2.I00iiI = ili0oiOI1i10;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            ili0oiOI1i10.I00o101lO = ili0o0i2;
/* 32 */            VarHandle.storeStoreFence();
/* 55 */            return ili0oiOI1i10;
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
/* 1 */             return -1929324230;
                }
            }

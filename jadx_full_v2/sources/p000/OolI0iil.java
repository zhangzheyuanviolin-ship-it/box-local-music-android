            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class OolI0iil extends Oll0io implements Function1 {
                public int I00iOIl;
                public int I00iiI;
                public final OolI1lo I00iiO;
                public final int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OolI0iil(OolI1lo oolI1lo, int i, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00iiO = oolI1lo;
/* 3 */             this.I00iio = i;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new OolI0iil(this.I00iiO, this.I00iio, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((OolI0iil) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i;
                    IOi10loi iOi10loiI00000oOI;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i2 = this.I00iiI;
                    try {
/* 10 */                if (i2 == 0) {
/* 26 */                    lIoii1l01l0i.I00000oOI(obj);
/* 29 */                    l11I11lO.I0000O(3, "CXCP");
/* 32 */                    OolI1lo oolI1lo = this.I00iiO;
/* 34 */                    int i3 = this.I00iio;
/* 38 */                    IIll0oO iIll0oOI00000oIO = oolI1lo.I0000Il00O.I00000oIO();
/* 42 */                    this.I00iOIl = i3;
/* 44 */                    this.I00iiI = 1;
/* 46 */                    obj = iIll0oOI00000oIO.I0000Il00O(this);
/* 50 */                    if (obj == ii0111o) {
/* 52 */                        return ii0111o;
                            }
/* 53 */                    i = i3;
                        } else {
/* 12 */                    if (i2 != 1) {
/* 22 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 14 */                    i = this.I00iOIl;
/* 16 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 54 */                AutoCloseable autoCloseable = (AutoCloseable) obj;
                        try {
/* 57 */                    IIll1i iIll1i = (IIll1i) autoCloseable;
/* 59 */                    I0OIi10lO0iO i0OIi10lO0iOI00000oIO = I0OIi10lO0iO.I00000oIO(i);
/* 69 */                    if (iIll1i.I00iOIl.I00000oIO()) {
/* 97 */                        IOOlIIilOl0.I0001Ioi1lo(iIll1i, "Cannot call setTorchOff on ", " after close.");
/* 100 */                       iOi10loiI00000oOI = null;
                            } else {
/* 71 */                        IOol1Ol iOol1Ol = iIll1i.I00iiO;
/* 73 */                        iOol1Ol.getClass();
/* 88 */                        iOi10loiI00000oOI = IOol1Ol.I00000oOI(iOol1Ol, i0OIi10lO0iOI00000oIO, null, null, IlOI0loiiI.I00000oIO(0), null, null, null, 118);
                            }
/* 101 */                   iOOl00.I00000oIO(autoCloseable, null);
/* 104 */                   return iOi10loiI00000oOI;
                        } finally {
                        }
                    } catch (CancellationException unused) {
/* 113 */               l11I11lO.I0000O(3, "CXCP");
/* 116 */               return OolI1lo.I000l1;
                    }
                }
            }

            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            
            public final class OOIl1Io0 {
                public static final OOIl1Io0 I00000oOI;
                public IOiOol0 I00000oIO;

                static {
/* 7 */             IOiOol0 iOiOol0 = new IOiOol0(8);
/* 15 */            iOiOol0.I00iiO = new Object();
/* 19 */            iOiOol0.I00ilO0 = Ioil1IIo.I00iiO;
/* 26 */            iOiOol0.I00iiI = new HashMap();
/* 33 */            iOiOol0.I00ilI0I1 = new HashSet();
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            OOIl1Io0 oOIl1Io0 = new OOIl1Io0();
/* 41 */            oOIl1Io0.I00000oIO = iOiOol0;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            I00000oOI = oOIl1Io0;
                }

                public final O0oOi0i1O I00000oIO(O0oiOi o0oiOi, IIo0l1 iIo0l1, Ool10o... ool10oArr) {
                    int i;
/* 1 */             IOiOol0 iOiOol0 = this.I00000oIO;
/* 8 */             Ool10o[] ool10oArr2 = (Ool10o[]) Arrays.copyOf(ool10oArr, ool10oArr.length);
/* 12 */            lOo0I0iOi11O.I00000oIO("CX:bindToLifecycle");
                    try {
/* 17 */                IIoIloi0 iIoIloi0 = (IIoIloi0) iOiOol0.I00io1l;
/* 19 */                int i2 = 0;
/* 26 */                if (iIoIloi0 != null) {
/* 28 */                    IIlOoolol0ll iIlOoolol0ll = iIoIloi0.I000II;
/* 30 */                    if (iIlOoolol0ll == null) {
/* 54 */                        throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 34 */                    IIlOO01iI iIlOO01iI = (IIlOO01iI) iIlOoolol0ll.I00io1l;
                            synchronized (iIlOO01iI.I00000oOI) {
/* 39 */                        i = iIlOO01iI.I0001Ioi1lo;
                            }
/* 42 */                    i2 = i;
                        }
/* 56 */                if (i2 == 2) {
/* 87 */                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                        }
/* 58 */                iOiOol0.I00IO1oi11O(1);
/* 72 */                return IOiOol0.I00000oOI(iOiOol0, o0oiOi, iIo0l1, new IOiOol0(I1IoiO1l.I001IIilI0O(ool10oArr2), Il01100l.I00iOIl));
                    } finally {
/* 89 */                Trace.endSection();
                    }
                }

                public final void I00000oOI() {
/* 3 */             this.I00000oIO.I00IoIO0lI();
                }
            }

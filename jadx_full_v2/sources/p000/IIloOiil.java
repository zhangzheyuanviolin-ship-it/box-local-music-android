            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            
            public final class IIloOiil {
                public Ii10oo I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public boolean I0000O;

                public final IIoI1li1o1l I00000oIO() {
                    IIoI1li1o1l iIoI1li1o1l;
                    synchronized (this.I0000Il00O) {
/* 6 */                 if (this.I0000O) {
/* 29 */                    throw new IllegalStateException("Check failed.");
                        }
/* 16 */                iIoI1li1o1l = (IIoI1li1o1l) this.I00000oIO.I001l0I00.get();
                    }
/* 19 */            return iIoI1li1o1l;
                }

                public final IIlOlol0liO I00000oOI() {
                    IIlOlol0liO iIlOlol0liO;
                    synchronized (this.I0000Il00O) {
/* 6 */                 if (this.I0000O) {
/* 29 */                    throw new IllegalStateException("Check failed.");
                        }
/* 16 */                iIlOlol0liO = (IIlOlol0liO) this.I00000oIO.I001i1lo1io.get();
                    }
/* 19 */            return iIlOlol0liO;
                }

                public final IIll0oO I0000Il00O(IIliIi1O0OiO iIliIi1O0OiO, IIll0Oilo iIll0Oilo) {
                    try {
/* 21 */                Trace.beginSection("CXCP#CameraGraph-" + ((Object) IIllI0o.I0000Il00O(iIliIi1O0OiO.I00000oIO)));
/* 28 */                Ii10oo ii10oo = this.I00000oIO.I0000Il00O;
/* 32 */                OlOO1i11110 olOO1i11110 = new OlOO1i11110(10);
/* 35 */                olOO1i11110.I00iiI = ii10oo;
/* 37 */                VarHandle.storeStoreFence();
/* 43 */                IIlio101Io iIlio101Io = new IIlio101Io(0);
/* 46 */                iIlio101Io.I00iiI = iIliIi1O0OiO;
/* 48 */                iIlio101Io.I00iiO = iIll0Oilo;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                olOO1i11110.I00iiO = iIlio101Io;
/* 67 */                return (IIll0oO) ((OOiIoli) olOO1i11110.I000II().I00100l0).get();
                    } finally {
/* 74 */                Trace.endSection();
                    }
                }

                public final String toString() {
/* 13 */            return "CameraPipe-" + this.I00000oOI;
                }
            }

            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            
            public abstract class iilO1O {
                protected int zza;

                public abstract int I00000oIO(ioO0I1oi1lio ioo0i1oi1lio);

                public final byte[] I00000oOI() {
                    try {
/* 1 */                 int iI0000Il00O = I0000Il00O();
/* 5 */                 byte[] bArr = new byte[iI0000Il00O];
/* 7 */                 il1O00loO1 il1o00loo1I00100l0 = il1O00loO1.I00100l0(iI0000Il00O, bArr);
/* 12 */                ilOl10 ilol10 = (ilOl10) this;
/* 20 */                ioO0I1oi1lio ioo0i1oi1lioI00000oIO = ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10.getClass());
/* 24 */                i11I1Ili i11i1ili = il1o00loo1I00100l0.I00000oIO;
/* 26 */                if (i11i1ili == null) {
/* 32 */                    i11i1ili = new i11I1Ili(5);
/* 35 */                    Charset charset = ililOO0.I00000oIO;
/* 37 */                    i11i1ili.I00iiI = il1o00loo1I00100l0;
/* 39 */                    il1o00loo1I00100l0.I00000oIO = i11i1ili;
/* 41 */                    VarHandle.storeStoreFence();
                        }
/* 44 */                ioo0i1oi1lioI00000oIO.I0001Ioi1lo(ilol10, i11i1ili);
/* 52 */                if (il1o00loo1I00100l0.I0000Il00O - il1o00loo1I00100l0.I0000O == 0) {
/* 54 */                    return bArr;
                        }
/* 62 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 80 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 83 */                return null;
                    }
                }

                public abstract int I0000Il00O();
            }

            package p000;

            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            
            public abstract class i1ilO0II {
                protected transient int zza;

                public final byte[] I00000oIO() {
                    try {
/* 2 */                 i1oi01OllI i1oi01olli = (i1oi01OllI) this;
/* 4 */                 int iI000l1 = i1oi01olli.I000l1();
/* 8 */                 byte[] bArr = new byte[iI000l1];
/* 10 */                boolean z = i1lllO0.I00000oOI;
/* 14 */                i1lOo10 i1loo10 = new i1lOo10(iI000l1, bArr);
/* 17 */                i1oi01olli.I0000oI00(i1loo10);
/* 24 */                if (i1loo10.I001i1lo1io() > 0) {
/* 48 */                    throw new IllegalStateException("Did not write as much data as expected.");
                        }
/* 30 */                if (i1loo10.I001i1lo1io() >= 0) {
/* 32 */                    return bArr;
                        }
/* 40 */                throw new IllegalStateException("Wrote more data than expected.");
                    } catch (IOException e) {
/* 54 */                String name = getClass().getName();
/* 77 */                OIiilo1Ool0o.I000iOII(IIlIOloOOO.I0010I0i(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
/* 80 */                return null;
                    }
                }

                public final void I00000oOI(OutputStream outputStream) {
/* 1 */             i1oi01OllI i1oi01olli = (i1oi01OllI) this;
/* 3 */             int iI000l1 = i1oi01olli.I000l1();
/* 7 */             boolean z = i1lllO0.I00000oOI;
/* 11 */            if (iI000l1 > 4096) {
/* 13 */                iI000l1 = 4096;
                    }
/* 16 */            i1liI1O0iI i1lii1o0ii = new i1liI1O0iI();
/* 19 */            if (outputStream == null) {
/* 59 */                IOOlIIilOl0.I000II("out");
/* 77 */                return;
                    }
/* 21 */            i1lii1o0ii.I0001Ioi1lo = outputStream;
/* 23 */            if (iI000l1 < 0) {
/* 53 */                I000II.I000iOII("bufferSize must be >= 0");
/* 56 */                return;
                    }
/* 27 */            int iMax = Math.max(iI000l1, 20);
/* 33 */            i1lii1o0ii.I0000Il00O = new byte[iMax];
/* 35 */            i1lii1o0ii.I0000O = iMax;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            i1oi01olli.I0000oI00(i1lii1o0ii);
/* 45 */            if (i1lii1o0ii.I0000oI00 > 0) {
/* 47 */                i1lii1o0ii.I001lllioOl();
                    }
                }

                public abstract int I0000Il00O(iI110OIoiOl ii110oioiol);
            }

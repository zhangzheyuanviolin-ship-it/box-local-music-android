            package p000;

            import java.io.IOException;
            
            public abstract class i1111ll {
                protected int zba;

                public abstract int I00000oIO(i11lo1 i11lo1Var);

                public final byte[] I00000oOI() {
                    try {
/* 2 */                 i11O1oIl i11o1oil = (i11O1oIl) this;
/* 4 */                 int iI000OiO = i11o1oil.I000OiO();
/* 8 */                 byte[] bArr = new byte[iI000OiO];
/* 12 */                i11I0o0ii i11i0o0ii = new i11I0o0ii(iI000OiO, bArr);
/* 15 */                i11o1oil.I000O01llI0(i11i0o0ii);
/* 21 */                if (iI000OiO - i11i0o0ii.I0000O == 0) {
/* 23 */                    return bArr;
                        }
/* 31 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 49 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 52 */                return null;
                    }
                }
            }

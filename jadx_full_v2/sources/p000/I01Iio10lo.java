            package p000;

            import java.io.IOException;
            
            public abstract class I01Iio10lo implements O1lIi0I01l1 {
                protected int memoizedHashCode;

                public abstract int I00000oOI(OiOIiIO0 oiOIiIO0);

                public final String I0000Il00O(String str) {
/* 32 */            return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
                }

                public abstract IloooliI0I I0000O();

                public final byte[] I0000oI00() {
                    try {
/* 9 */                 byte[] bArr = new byte[((Io00Io0IO11) this).I00000oOI(null)];
/* 11 */                IOOOi1I1I1 iOOOi1I1I1I000iOII = IOOOi1I1I1.I000iOII(bArr);
/* 15 */                I0001Ioi1lo(iOOOi1I1I1I000iOII);
/* 23 */                if (iOOOi1I1I1I000iOII.I0000Il00O - iOOOi1I1I1I000iOII.I0000O == 0) {
/* 25 */                    return bArr;
                        }
/* 33 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 41 */                OIiilo1Ool0o.I000iOII(I0000Il00O("byte array"), e);
/* 1 */                 return null;
                    }
                }

                public abstract void I0001Ioi1lo(IOOOi1I1I1 iOOOi1I1I1);
            }

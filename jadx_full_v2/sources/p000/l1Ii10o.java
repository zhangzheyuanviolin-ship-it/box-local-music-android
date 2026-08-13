            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public abstract class l1Ii10o implements lIoolOoilO {
                protected int zza;

                public abstract int I00000oIO(lO1liolI0IO lo1lioli0io);

                public final byte[] I00000oOI() {
                    try {
/* 3 */                 lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) this;
/* 5 */                 int iI000l1 = liioo0oi1o.I000l1();
/* 9 */                 byte[] bArr = new byte[iI000l1];
/* 13 */                l1lo010IOi0 l1lo010ioi0 = new l1lo010IOi0();
/* 16 */                int length = bArr.length;
/* 21 */                if (((length - iI000l1) | iI000l1) < 0) {
/* 69 */                    OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(iI000l1)});
/* 72 */                    throw null;
                        }
/* 23 */                l1lo010ioi0.I00000oOI = bArr;
/* 25 */                l1lo010ioi0.I0000O = 0;
/* 27 */                l1lo010ioi0.I0000Il00O = iI000l1;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                liioo0oi1o.I000OOo1O(l1lo010ioi0);
/* 38 */                if (iI000l1 - l1lo010ioi0.I0000O == 0) {
/* 40 */                    return bArr;
                        }
/* 48 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 89 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 1 */                 return null;
                    }
                }
            }

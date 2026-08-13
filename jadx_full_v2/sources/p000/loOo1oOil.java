            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public abstract class loOo1oOil implements o0IIiol0oIo {
                protected int zza;

                public abstract int I00000oIO(o0O1iOilloll o0o1ioilloll);

                public final byte[] I00000oOI() {
                    try {
/* 3 */                 o001IlOi0O o001iloi0o = (o001IlOi0O) this;
/* 5 */                 int iI000l1 = o001iloi0o.I000l1();
/* 9 */                 byte[] bArr = new byte[iI000l1];
/* 13 */                loliO00 lolio00 = new loliO00();
/* 16 */                int length = bArr.length;
/* 21 */                if (((length - iI000l1) | iI000l1) < 0) {
/* 69 */                    OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(iI000l1)});
/* 72 */                    throw null;
                        }
/* 23 */                lolio00.I00000oOI = bArr;
/* 25 */                lolio00.I0000O = 0;
/* 27 */                lolio00.I0000Il00O = iI000l1;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                o001iloi0o.I000OiO(lolio00);
/* 38 */                if (iI000l1 - lolio00.I0000O == 0) {
/* 40 */                    return bArr;
                        }
/* 48 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 89 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 1 */                 return null;
                    }
                }
            }

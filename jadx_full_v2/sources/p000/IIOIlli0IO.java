            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class IIOIlli0IO {
                public byte[] I00000oIO;

                public static IIOIlli0IO I00000oIO(byte[] bArr) {
/* 1 */             if (bArr == null) {
/* 23 */                IOOlIIilOl0.I000II("data must be non-null");
/* 26 */                return null;
                    }
/* 3 */             int length = bArr.length;
/* 6 */             IIOIlli0IO iIOIlli0IO = new IIOIlli0IO();
/* 9 */             byte[] bArr2 = new byte[length];
/* 11 */            iIOIlli0IO.I00000oIO = bArr2;
/* 14 */            System.arraycopy(bArr, 0, bArr2, 0, length);
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return iIOIlli0IO;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof IIOIlli0IO) {
/* 13 */                return Arrays.equals(((IIOIlli0IO) obj).I00000oIO, this.I00000oIO);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 22 */            return "Bytes(" + ilo01iOOoO0l.I00000oOI(this.I00000oIO) + ")";
                }
            }

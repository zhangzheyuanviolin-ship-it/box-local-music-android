            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class Ii0o1ll0 extends I00OIO1 implements I00Ol10 {
                public byte[] I00iOIl;

                static {
/* 6 */             new I001lllioOl(3, Ii0o1ll0.class);
                }

                public static Ii0o1ll0 I001i1O0Ol(byte[] bArr) {
/* 3 */             Ii0o1ll0 ii0o1ll0 = new Ii0o1ll0();
/* 6 */             if (bArr == null) {
/* 16 */                IOOlIIilOl0.I000II("'contents' cannot be null");
/* 19 */                return null;
                    }
/* 8 */             ii0o1ll0.I00iOIl = bArr;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return ii0o1ll0;
                }

                @Override
                public final String I0000oI00() {
/* 3 */             return OlOoIoi11.I00000oIO(this.I00iOIl);
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 3 */             if (i00oio1 instanceof Ii0o1ll0) {
/* 13 */                return Arrays.equals(this.I00iOIl, ((Ii0o1ll0) i00oio1).I00iOIl);
                    }
/* 5 */             return false;
                }

                @Override
                public final void I000oI1ioi(O1OIll00i o1OIll00i, boolean z) {
/* 5 */             o1OIll00i.I00Ol10(25, z, this.I00iOIl);
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return false;
                }

                @Override
                public final int I0010I0i(boolean z) {
/* 4 */             return O1OIll00i.I00O10llo(this.I00iOIl.length, z);
                }

                @Override
                public final int hashCode() {
/* 3 */             return iOO1iOiOl.I00000oOI(this.I00iOIl);
                }
            }

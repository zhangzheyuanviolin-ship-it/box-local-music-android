            package p000;

            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            
            public final class OooO0l0000 implements Comparable {
                public static final OooO0l0000 I00ilO0;
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final String I00iio;
                public final OllO00oiil I00ilI0I1;

                static {
/* 6 */             new OooO0l0000(0, 0, 0, "");
/* 15 */            I00ilO0 = new OooO0l0000(0, 1, 0, "");
/* 19 */            new OooO0l0000(1, 0, 0, "");
                }

                public OooO0l0000(int i, int i2, int i3, String str) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            this.I00iio = str;
/* 16 */            OlOi0iollo olOi0iollo = new OlOi0iollo(16);
/* 19 */            olOi0iollo.I00iiI = this;
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            this.I00ilI0I1 = new OllO00oiil(olOi0iollo);
                }

                @Override
                public final int compareTo(Object obj) {
/* 19 */            return ((BigInteger) this.I00ilI0I1.getValue()).compareTo((BigInteger) ((OooO0l0000) obj).I00ilI0I1.getValue());
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof OooO0l0000)) {
/* 3 */                 return false;
                    }
/* 7 */             OooO0l0000 oooO0l0000 = (OooO0l0000) obj;
                    return this.I00iOIl == oooO0l0000.I00iOIl && this.I00iiI == oooO0l0000.I00iiI && this.I00iiO == oooO0l0000.I00iiO;
                }

                public final int hashCode() {
/* 15 */            return ((((527 + this.I00iOIl) * 31) + this.I00iiI) * 31) + this.I00iiO;
                }

                public final String toString() {
/* 1 */             String str = this.I00iio;
/* 16 */            String strConcat = !OlOoOIi0o.I001l0I00(str) ? "-".concat(str) : "";
/* 20 */            StringBuilder sb = new StringBuilder();
/* 25 */            sb.append(this.I00iOIl);
/* 30 */            sb.append('.');
/* 35 */            sb.append(this.I00iiI);
/* 38 */            sb.append('.');
/* 43 */            return IIl001iO0Io.I000lI(this.I00iiO, strConcat, sb);
                }
            }

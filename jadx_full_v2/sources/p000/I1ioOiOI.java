            package p000;

            import android.util.Size;
            import java.util.ArrayList;
            
            public final class I1ioOiOI {
                public IIl1Ol I00000oIO;
                public IIl1Ol I00000oOI;
                public IoilI00 I0000Il00O;
                public IoilI00 I0000O;
                public IoilI00 I0000oI00;
                public Size I0001Ioi1lo;
                public int I000II;
                public ArrayList I000O01llI0;
                public boolean I000OOo1O;
                public IioO0ilo1Ii I000OiO;
                public IioO0ilo1Ii I000iOII;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 62 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1ioOiOI)) {
/* 64 */                return false;
                    }
/* 8 */             I1ioOiOI i1ioOiOI = (I1ioOiOI) obj;
                    return this.I0001Ioi1lo.equals(i1ioOiOI.I0001Ioi1lo) && this.I000II == i1ioOiOI.I000II && this.I000O01llI0.equals(i1ioOiOI.I000O01llI0) && this.I000OOo1O == i1ioOiOI.I000OOo1O && this.I000OiO.equals(i1ioOiOI.I000OiO) && this.I000iOII.equals(i1ioOiOI.I000iOII);
                }

                public final int hashCode() {
/* 52 */            return this.I000iOII.hashCode() ^ ((((((((((this.I0001Ioi1lo.hashCode() ^ 1000003) * 1000003) ^ this.I000II) * 1000003) ^ this.I000O01llI0.hashCode()) * 1000003) ^ (this.I000OOo1O ? 1231 : 1237)) * 583896283) ^ this.I000OiO.hashCode()) * 1000003);
                }

                public final String toString() {
/* 68 */            return "In{size=" + this.I0001Ioi1lo + ", inputFormat=" + this.I000II + ", outputFormats=" + this.I000O01llI0 + ", virtualCamera=" + this.I000OOo1O + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.I000OiO + ", errorEdge=" + this.I000iOII + "}";
                }
            }

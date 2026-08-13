            package p000;

            import android.os.Bundle;
            import java.util.Arrays;
            
            public final class OI1Oo1II110 {
                public OI1OloOIO1O I00000oIO;
                public OI1ilOI1ioo0 I00000oOI;
                public Bundle I0000Il00O;
                public O0oOi0I I0000O;
                public OI1i0o1Ilo I0000oI00;
                public String I0001Ioi1lo;
                public Bundle I000II;
                public IIlio101Io I000O01llI0;
                public boolean I000OOo1O;
                public O0oiiOll0O1 I000OiO;
                public O0oOi0I I000iOII;
                public OiIol0o I000l1;

                public final Bundle I00000oIO() {
/* 1 */             Bundle bundle = this.I0000Il00O;
/* 3 */             if (bundle == null) {
/* 5 */                 return null;
                    }
/* 8 */             OIoi0IIoi[] oIoi0IIoiArr = new OIoi0IIoi[0];
/* 17 */            Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(oIoi0IIoiArr, oIoi0IIoiArr.length));
/* 21 */            bundleI00000oIO.putAll(bundle);
/* 55 */            return bundleI00000oIO;
                }

                public final void I00000oOI() {
/* 1 */             IIlio101Io iIlio101Io = this.I000O01llI0;
/* 5 */             if (!this.I000OOo1O) {
/* 7 */                 iIlio101Io.I00oliIiO01i();
/* 11 */                this.I000OOo1O = true;
/* 15 */                if (this.I0000oI00 != null) {
/* 19 */                    OiIoII10il0.I00000oOI(this.I00000oIO);
                        }
/* 24 */                iIlio101Io.I00oo1iO0ll(this.I000II);
                    }
/* 29 */            int iOrdinal = this.I0000O.ordinal();
/* 35 */            int iOrdinal2 = this.I000iOII.ordinal();
/* 39 */            O0oiiOll0O1 o0oiiOll0O1 = this.I000OiO;
/* 41 */            if (iOrdinal < iOrdinal2) {
/* 45 */                o0oiiOll0O1.I010l10O(this.I0000O);
                    } else {
/* 51 */                o0oiiOll0O1.I010l10O(this.I000iOII);
                    }
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 18 */            sb.append(OOoOl0i.I00000oIO.I00000oOI(OI1OloOIO1O.class).I000oI1ioi());
/* 42 */            sb.append("(" + this.I0001Ioi1lo + ')');
/* 47 */            sb.append(" destination=");
/* 52 */            sb.append(this.I00000oOI);
/* 55 */            return sb.toString();
                }
            }

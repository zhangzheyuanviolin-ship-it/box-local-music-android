            package p000;

            import android.util.Size;
            import java.util.List;
            
            public abstract class OIlI1io {
                public final Size I00000oIO;
                public final int I00000oOI;
                public final String I0000Il00O;
                public final OIlIOlIi I0000O;
                public final OIlII1I1 I0000oI00;
                public final OIlIOo I0001Ioi1lo;
                public final OIlIOoOil I000II;
                public final List I000O01llI0;

                public OIlI1io(Size size, int i, String str, OIlIOlIi oIlIOlIi, OIlII1I1 oIlII1I1, OIlIOo oIlIOo, OIlIOoOil oIlIOoOil, List list) {
/* 4 */             this.I00000oIO = size;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = oIlIOlIi;
/* 12 */            this.I0000oI00 = oIlII1I1;
/* 14 */            this.I0001Ioi1lo = oIlIOo;
/* 16 */            this.I000II = oIlIOoOil;
/* 18 */            this.I000O01llI0 = list;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Config(size=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", format=");
/* 24 */            sb.append((Object) OlOIOoII1i.I0000Il00O(this.I00000oOI));
/* 29 */            sb.append(", camera=");
/* 32 */            String str = this.I0000Il00O;
/* 43 */            sb.append((Object) (str == null ? "null" : IIllI0o.I0000Il00O(str)));
/* 48 */            sb.append(", mirrorMode=");
/* 53 */            sb.append(this.I0000O);
/* 58 */            sb.append(", timestampBase=null, dynamicRangeProfile=");
/* 63 */            sb.append(this.I0000oI00);
/* 68 */            sb.append(", streamUseCase=");
/* 73 */            sb.append(this.I0001Ioi1lo);
/* 78 */            sb.append(", streamUseHint=");
/* 83 */            sb.append(this.I000II);
/* 88 */            sb.append(", sensorPixelModes=");
/* 93 */            sb.append(this.I000O01llI0);
/* 98 */            sb.append(')');
/* 101 */           return sb.toString();
                }
            }

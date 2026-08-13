            package p000;

            import android.view.textclassifier.TextClassification;
            import java.util.ArrayList;
            
            public final class OloiIl {
                public CharSequence I00000oIO;
                public long I00000oOI;
                public TextClassification I0000Il00O;
                public ArrayList I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof OloiIl)) {
/* 54 */                return false;
                    }
/* 9 */             OloiIl oloiIl = (OloiIl) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oloiIl.I00000oIO) && Oo0lI00l.I0000Il00O(this.I00000oOI, oloiIl.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oloiIl.I0000Il00O) && this.I0000O.equals(oloiIl.I0000O);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            long j = this.I00000oOI;
/* 12 */            int i = Oo0lI00l.I0000Il00O;
/* 32 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + IIlIOloOOO.I0000O(j, iHashCode, 31)) * 31);
                }

                public final String toString() {
/* 1 */             CharSequence charSequence = this.I00000oIO;
/* 52 */            return "TextClassificationResult(text=" + ((Object) charSequence) + ", selection=" + Oo0lI00l.I000OOo1O(this.I00000oOI) + ", textClassification=" + this.I0000Il00O + ", icons=" + this.I0000O + ")";
                }
            }

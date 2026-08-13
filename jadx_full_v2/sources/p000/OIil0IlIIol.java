            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.ColorSpace;
            import java.util.Arrays;
            
            public final class OIil0IlIIol {
                public Context I00000oIO;
                public Bitmap.Config I00000oOI;
                public ColorSpace I0000Il00O;
                public Ol0i11lo1l1I I0000O;
                public OiO0llO0IO I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;
                public String I000OOo1O;
                public Io1Io0OOi011 I000OiO;
                public Olo100 I000iOII;
                public OIol1l11o I000l1;
                public IIi11lllool1 I000lI;
                public IIi11lllool1 I000o00OoI0I;
                public IIi11lllool1 I000oI1ioi;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OIil0IlIIol)) {
/* 130 */               return false;
                    }
/* 11 */            OIil0IlIIol oIil0IlIIol = (OIil0IlIIol) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oIil0IlIIol.I00000oIO) && this.I00000oOI == oIil0IlIIol.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, oIil0IlIIol.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oIil0IlIIol.I0000O) && this.I0000oI00 == oIil0IlIIol.I0000oI00 && this.I0001Ioi1lo == oIil0IlIIol.I0001Ioi1lo && this.I000II == oIil0IlIIol.I000II && this.I000O01llI0 == oIil0IlIIol.I000O01llI0 && O0000Ioio00.I0000O(this.I000OOo1O, oIil0IlIIol.I000OOo1O) && O0000Ioio00.I0000O(this.I000OiO, oIil0IlIIol.I000OiO) && O0000Ioio00.I0000O(this.I000iOII, oIil0IlIIol.I000iOII) && O0000Ioio00.I0000O(this.I000l1, oIil0IlIIol.I000l1) && this.I000lI == oIil0IlIIol.I000lI && this.I000o00OoI0I == oIil0IlIIol.I000o00OoI0I && this.I000oI1ioi == oIil0IlIIol.I000oI1ioi;
                }

                public final int hashCode() {
/* 17 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            ColorSpace colorSpace = this.I0000Il00O;
/* 61 */            int iI000OOo1O = Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((this.I0000oI00.hashCode() + ((this.I0000O.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.I0001Ioi1lo), 31, this.I000II), 31, this.I000O01llI0);
/* 65 */            String str = this.I000OOo1O;
/* 123 */           return this.I000oI1ioi.hashCode() + ((this.I000o00OoI0I.hashCode() + ((this.I000lI.hashCode() + Oi010OO0.I000iOII(this.I000l1.I00iOIl, Oi010OO0.I000iOII(this.I000iOII.I00000oIO, (((iI000OOo1O + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.I000OiO.I00iOIl)) * 31, 31), 31)) * 31)) * 31);
                }
            }

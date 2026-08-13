            package p000;

            import android.graphics.drawable.Drawable;
            
            public final class Iilo1lOIl01i extends IlIIlll {
                public final Drawable I00000oIO;
                public final boolean I00000oOI;
                public final Ii1I1OOilolI I0000Il00O;

                public Iilo1lOIl01i(Drawable drawable, boolean z, Ii1I1OOilolI ii1I1OOilolI) {
/* 4 */             this.I00000oIO = drawable;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = ii1I1OOilolI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 32 */                return true;
                    }
/* 6 */             if (!(obj instanceof Iilo1lOIl01i)) {
/* 34 */                return false;
                    }
/* 8 */             Iilo1lOIl01i iilo1lOIl01i = (Iilo1lOIl01i) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iilo1lOIl01i.I00000oIO) && this.I00000oOI == iilo1lOIl01i.I00000oOI && this.I0000Il00O == iilo1lOIl01i.I0000Il00O;
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
                }
            }

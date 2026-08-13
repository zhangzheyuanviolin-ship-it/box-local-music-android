            package p000;

            import android.graphics.drawable.Drawable;
            
            public final class OliOlO1o1 extends IoiOl01IilO {
                public final Drawable I00000oIO;
                public final IoiOl011o I00000oOI;
                public final Ii1I1OOilolI I0000Il00O;
                public final O1il00oooo I0000O;
                public final String I0000oI00;
                public final boolean I0001Ioi1lo;
                public final boolean I000II;

                public OliOlO1o1(Drawable drawable, IoiOl011o ioiOl011o, Ii1I1OOilolI ii1I1OOilolI, O1il00oooo o1il00oooo, String str, boolean z, boolean z2) {
/* 4 */             this.I00000oIO = drawable;
/* 6 */             this.I00000oOI = ioiOl011o;
/* 8 */             this.I0000Il00O = ii1I1OOilolI;
/* 10 */            this.I0000O = o1il00oooo;
/* 12 */            this.I0000oI00 = str;
/* 14 */            this.I0001Ioi1lo = z;
/* 16 */            this.I000II = z2;
                }

                @Override
                public final Drawable I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final IoiOl011o I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OliOlO1o1)) {
/* 70 */                return false;
                    }
/* 9 */             OliOlO1o1 oliOlO1o1 = (OliOlO1o1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oliOlO1o1.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oliOlO1o1.I00000oOI) && this.I0000Il00O == oliOlO1o1.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, oliOlO1o1.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, oliOlO1o1.I0000oI00) && this.I0001Ioi1lo == oliOlO1o1.I0001Ioi1lo && this.I000II == oliOlO1o1.I000II;
                }

                public final int hashCode() {
/* 25 */            int iHashCode = (this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31;
/* 27 */            O1il00oooo o1il00oooo = this.I0000O;
/* 38 */            int iHashCode2 = (iHashCode + (o1il00oooo != null ? o1il00oooo.hashCode() : 0)) * 31;
/* 39 */            String str = this.I0000oI00;
/* 61 */            return Boolean.hashCode(this.I000II) + Oi010OO0.I000OOo1O((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.I0001Ioi1lo);
                }
            }

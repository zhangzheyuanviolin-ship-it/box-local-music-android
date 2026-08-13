            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
/* 30 */    public final class OO1loiii {
                public final int I00000oIO;
                public final boolean I00000oOI;
                public final boolean I0000Il00O;
                public final boolean I0000O;
                public final boolean I0000oI00;
                public final int I0001Ioi1lo;

                /* JADX WARN: Illegal instructions before constructor call */
                public OO1loiii(boolean z, Oii0IOl oii0IOl, boolean z2) {
/* 1 */             IOlO1IilOlOl iOlO1IilOlOl = I0olo0.I00000oIO;
/* 9 */             int i = !z ? 262152 : 262144;
/* 15 */            i = oii0IOl == Oii0IOl.I00iiI ? i | 8192 : i;
/* 28 */            this(z2 ? i : i | Barcode.FORMAT_UPC_A, oii0IOl == Oii0IOl.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 54 */                return true;
                    }
/* 6 */             if (!(obj instanceof OO1loiii)) {
/* 52 */                return false;
                    }
/* 9 */             OO1loiii oO1loiii = (OO1loiii) obj;
                    return this.I00000oIO == oO1loiii.I00000oIO && this.I00000oOI == oO1loiii.I00000oOI && this.I0000Il00O == oO1loiii.I0000Il00O && this.I0000O == oO1loiii.I0000O && this.I0000oI00 == oO1loiii.I0000oI00 && this.I0001Ioi1lo == oO1loiii.I0001Ioi1lo;
                }

                public final int hashCode() {
/* 38 */            return (Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(this.I00000oIO * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00), 31, false) + this.I0001Ioi1lo) * 31;
                }

/* 31 */        public OO1loiii(int i, boolean z) {
/* 33 */            this.I00000oIO = i;
/* 34 */            this.I00000oOI = z;
/* 35 */            this.I0000Il00O = true;
/* 36 */            this.I0000O = true;
/* 37 */            this.I0000oI00 = true;
/* 38 */            this.I0001Ioi1lo = 1002;
                }

/* 38 */        public OO1loiii(boolean z, int i) {
/* 40 */            this((i & 1) != 0 ? false : z, Oii0IOl.I00iOIl, (i & 8) != 0);
                }
            }

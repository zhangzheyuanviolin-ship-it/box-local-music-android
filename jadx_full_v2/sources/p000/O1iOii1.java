            package p000;

            import java.util.List;
            
            public final class O1iOii1 {
                public int I00000oIO;
                public List I00000oOI;
                public long I0000Il00O;
                public Object I0000O;
                public II0O000iIl I0000oI00;
                public O0iOOoiioO I0001Ioi1lo;
                public boolean I000II;
                public int I000O01llI0;
                public int[] I000OOo1O;
                public int I000OiO;
                public int I000iOII;

                public final void I00000oIO(int i) {
                    this.I000OiO += i;
/* 6 */             int[] iArr = this.I000OOo1O;
/* 8 */             int length = iArr.length;
/* 10 */            for (int i2 = 0; i2 < length; i2++) {
/* 12 */                boolean z = this.I000II;
/* 14 */                if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
/* 30 */                    iArr[i2] = iArr[i2] + i;
                        }
                    }
                }

                public final void I00000oOI(int i, int i2, int i3) {
                    int i4;
/* 1 */             int[] iArr = this.I000OOo1O;
/* 3 */             this.I000OiO = i;
/* 5 */             boolean z = this.I000II;
/* 12 */            this.I000iOII = z ? i3 : i2;
/* 14 */            List list = this.I00000oOI;
/* 19 */            int size = list.size();
/* 24 */            for (int i5 = 0; i5 < size; i5++) {
/* 30 */                OO1I0001000i oO1I0001000i = (OO1I0001000i) list.get(i5);
/* 32 */                int i6 = i5 * 2;
/* 34 */                if (z) {
/* 63 */                    iArr[i6] = Math.round((1.0f + (this.I0001Ioi1lo != O0iOOoiioO.I00iOIl ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - oO1I0001000i.I00iOIl) / 2.0f));
/* 67 */                    iArr[i6 + 1] = i;
/* 69 */                    i4 = oO1I0001000i.I00iiI;
                        } else {
/* 73 */                    iArr[i6] = i;
/* 75 */                    int i7 = i6 + 1;
/* 77 */                    II0O000iIl iI0O000iIl = this.I0000oI00;
/* 79 */                    if (iI0O000iIl == null) {
/* 101 */                       throw IlIi0I0.I0000oI00("null verticalAlignment");
                            }
/* 87 */                    iArr[i7] = iI0O000iIl.I00000oIO(oO1I0001000i.I00iiI, i3);
/* 89 */                    i4 = oO1I0001000i.I00iOIl;
                        }
/* 71 */                i += i4;
                    }
                }
            }

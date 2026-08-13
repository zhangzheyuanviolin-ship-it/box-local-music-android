            package p000;
            
            public abstract class illoi1i0olIl {
                public static final int I00000oIO(float f, float f2, float f3, int i, int i2) {
/* 1 */             if (i == i2) {
/* 3 */                 return -1;
                    }
                    int i3 = i - 2;
/* 7 */             if (i3 < 0) {
/* 9 */                 i3 = 0;
                    }
/* 22 */            return O1OooO0IlOo.I000II((f3 * (i - 1 <= 1 ? r3 : 1)) + (f2 * i3) + f);
                }

                public static final void I00000oOI(int i, int i2) {
/* 10 */            if (!(i > 0 && i2 > 0)) {
/* 39 */                Ioll0IliO1l.I00000oIO("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
                    }
/* 45 */            if (i <= i2) {
/* 106 */               return;
                    }
/* 69 */            Ioll0IliO1l.I00000oIO("minLines " + i + " must be less than or equal to maxLines " + i2);
                }
            }

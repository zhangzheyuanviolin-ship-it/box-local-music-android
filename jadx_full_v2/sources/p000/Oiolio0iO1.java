            package p000;
            
            public abstract class Oiolio0iO1 {
                public static final I0OooiI1I I00000oIO = new I0OooiI1I("NO_VALUE", 3);

                public static final Oiolio I00000oIO(int i, int i2, IIII0i iIII0i) {
/* 2 */             if (i < 0) {
/* 49 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "replay cannot be negative, but was "));
/* 1 */                 return null;
                    }
/* 4 */             if (i2 < 0) {
/* 39 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i2, "extraBufferCapacity cannot be negative, but was "));
/* 1 */                 return null;
                    }
/* 6 */             if (i <= 0 && i2 <= 0 && iIII0i != IIII0i.I00iOIl) {
/* 17 */                OIiilo1Ool0o.I000O01llI0("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", iIII0i);
/* 1 */                 return null;
                    }
/* 21 */            int i3 = i2 + i;
/* 22 */            if (i3 < 0) {
/* 24 */                i3 = Integer.MAX_VALUE;
                    }
/* 29 */            return new Oiolio(i, i3, iIII0i);
                }

                public static Oiolio I00000oOI(int i, int i2, IIII0i iIII0i) {
/* 8 */             int i3 = (i2 & 1) != 0 ? 0 : 1;
/* 11 */            if ((i2 & 2) != 0) {
/* 13 */                i = 0;
                    }
/* 16 */            if ((i2 & 4) != 0) {
/* 18 */                iIII0i = IIII0i.I00iOIl;
                    }
/* 20 */            return I00000oIO(i3, i, iIII0i);
                }

                public static final IlOil1ii I0000Il00O(OiolOO0il0l1 oiolOO0il0l1, Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
                    return ((i == 0 || i == -3) && iIII0i == IIII0i.I00iOIl) ? oiolOO0il0l1 : new IO10O0lOI0oI(i, iIII0i, ii00l101O, oiolOO0il0l1);
                }

                public static final void I0000O(Object[] objArr, long j, Object obj) {
/* 6 */             objArr[((int) j) & (objArr.length - 1)] = obj;
                }
            }

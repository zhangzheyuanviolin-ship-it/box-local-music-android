            package p000;
            
            public abstract class Oolo0ioool {
                public static final IoOi0looIo I00000oIO = new IoOi0looIo(OIOlO0iIO.I00000oIO, 0, 0);

                public static final OoI0llll I00000oIO(OoooioIi0I ooooioIi0I, I1111OO10i i1111OO10i) {
/* 1 */             OoI0llll ooI0llllI00000oIO = ooooioIi0I.I00000oIO(i1111OO10i);
/* 7 */             int length = i1111OO10i.I00iiI.length();
/* 11 */            I1111OO10i i1111OO10i2 = ooI0llllI00000oIO.I00000oIO;
/* 13 */            OIOlOI oIOlOI = ooI0llllI00000oIO.I00000oOI;
/* 17 */            int length2 = i1111OO10i2.I00iiI.length();
/* 23 */            int iMin = Math.min(length, 100);
/* 29 */            for (int i = 0; i < iMin; i++) {
/* 35 */                I00000oOI(oIOlOI.I000o00OoI0I(i), length2, i);
                    }
/* 45 */            I00000oOI(oIOlOI.I000o00OoI0I(length), length2, length);
/* 48 */            int iMin2 = Math.min(length2, 100);
/* 52 */            for (int i2 = 0; i2 < iMin2; i2++) {
/* 58 */                I0000Il00O(oIOlOI.I000O01llI0(i2), length, i2);
                    }
/* 68 */            I0000Il00O(oIOlOI.I000O01llI0(length2), length, length2);
/* 90 */            return new OoI0llll(i1111OO10i2, new IoOi0looIo(oIOlOI, i1111OO10i.I00iiI.length(), i1111OO10i2.I00iiI.length()));
                }

                public static final void I00000oOI(int i, int i2, int i3) {
/* 1 */             boolean z = false;
/* 2 */             if (i >= 0 && i <= i2) {
/* 6 */                 z = true;
                    }
/* 7 */             if (z) {
/* 98 */                return;
                    }
/* 15 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", i, " is not in range of transformed text [0, ");
/* 19 */            sbI0010I0i.append(i2);
/* 24 */            sbI0010I0i.append("]");
/* 31 */            Ioll0IliO1l.I0000Il00O(sbI0010I0i.toString());
                }

                public static final void I0000Il00O(int i, int i2, int i3) {
/* 1 */             boolean z = false;
/* 2 */             if (i >= 0 && i <= i2) {
/* 6 */                 z = true;
                    }
/* 7 */             if (z) {
/* 98 */                return;
                    }
/* 15 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", i, " is not in range of original text [0, ");
/* 19 */            sbI0010I0i.append(i2);
/* 24 */            sbI0010I0i.append("]");
/* 31 */            Ioll0IliO1l.I0000Il00O(sbI0010I0i.toString());
                }
            }

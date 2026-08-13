            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Oo0ioO {
                public IliO0o11i01 I00000oIO;
                public IiIooOOOI I00000oOI;
                public O0iOOoiioO I0000Il00O;
                public IoIlOo1o0IIl I0000O;

                public static Oo0iil0o0oI I00000oIO(Oo0ioO oo0ioO, I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, long j, O0iOOoiioO o0iOOoiioO, IiIooOOOI iiIooOOOI, IliO0o11i01 iliO0o11i01, int i) {
                    Oo0iil0o0oI oo0iil0o0oI;
/* 13 */            IliO0o11i01 iliO0o11i012 = (i & Barcode.FORMAT_UPC_A) != 0 ? oo0ioO.I00000oIO : iliO0o11i01;
/* 15 */            IoIlOo1o0IIl ioIlOo1o0IIl = oo0ioO.I0000O;
/* 19 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 41 */            Oo0iiO1 oo0iiO1 = new Oo0iiO1(i1111OO10i, oo0lloOiiIOI, il01100l, Integer.MAX_VALUE, true, 1, iiIooOOOI, o0iOOoiioO, iliO0o11i012, j);
/* 46 */            Oo0iil0o0oI oo0iil0o0oI2 = null;
/* 47 */            if (ioIlOo1o0IIl != null) {
/* 51 */                IIi1iOOI0l10 iIi1iOOI0l10 = new IIi1iOOI0l10(oo0iiO1);
/* 56 */                O1Il00 o1Il00 = (O1Il00) ioIlOo1o0IIl.I00iiI;
/* 58 */                if (o1Il00 != null) {
/* 64 */                    oo0iil0o0oI = (Oo0iil0o0oI) o1Il00.I0000Il00O(iIi1iOOI0l10);
                        } else if (O0000Ioio00.I0000O((IIi1iOOI0l10) ioIlOo1o0IIl.I00iiO, iIi1iOOI0l10)) {
/* 79 */                    oo0iil0o0oI = (Oo0iil0o0oI) ioIlOo1o0IIl.I00iio;
                        }
/* 81 */                if (oo0iil0o0oI != null && !oo0iil0o0oI.I00000oOI.I00000oIO.I0000O()) {
/* 95 */                    oo0iil0o0oI2 = oo0iil0o0oI;
                        }
                    }
/* 103 */           if (oo0iil0o0oI2 != null) {
/* 138 */               return new Oo0iil0o0oI(oo0iiO1, oo0iil0o0oI2.I00000oOI, IOo0olo.I0000O(j, (((int) Math.ceil(r1.I0000oI00)) & 4294967295L) | (((int) Math.ceil(r1.I0000O)) << 32)));
                    }
/* 158 */           I1ii1o0 i1ii1o0 = new I1ii1o0(i1111OO10i, iiIooOOOI, iliO0o11i012, lOlilIi0I.I00000oIO(oo0lloOiiIOI, o0iOOoiioO), il01100l, true);
/* 161 */           int iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 176 */           int iI000OiO = IOo0oO11ll1O.I0001Ioi1lo(j) ? IOo0oO11ll1O.I000OiO(j) : Integer.MAX_VALUE;
/* 179 */           if (iI000l1 != iI000OiO) {
/* 193 */               iI000OiO = lIiioliIlo.I0000Il00O((int) Math.ceil(i1ii1o0.I000l1()), iI000l1, iI000OiO);
                    }
/* 245 */           Oo0iil0o0oI oo0iil0o0oI3 = new Oo0iil0o0oI(oo0iiO1, new OI0OIIiOi(i1ii1o0, iio0lo1i.I00000oOI(0, iI000OiO, 0, IOo0oO11ll1O.I000OOo1O(j)), Integer.MAX_VALUE, 1), IOo0olo.I0000O(j, (((int) Math.ceil(r13.I0000oI00)) & 4294967295L) | (((int) Math.ceil(r13.I0000O)) << 32)));
/* 248 */           if (ioIlOo1o0IIl != null) {
/* 252 */               O1Il00 o1Il002 = (O1Il00) ioIlOo1o0IIl.I00iiI;
/* 254 */               if (o1Il002 != null) {
/* 261 */                   o1Il002.I0000O(new IIi1iOOI0l10(oo0iiO1), oo0iil0o0oI3);
/* 264 */                   return oo0iil0o0oI3;
                        }
/* 270 */               ioIlOo1o0IIl.I00iiO = new IIi1iOOI0l10(oo0iiO1);
/* 272 */               ioIlOo1o0IIl.I00iio = oo0iil0o0oI3;
                    }
/* 1750 */          return oo0iil0o0oI3;
                }
            }

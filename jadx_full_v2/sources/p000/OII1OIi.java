            package p000;

            import java.util.Arrays;
            import java.util.HashMap;
            
            public final class OII1OIi extends OI10OloOOoi {
                public OI10OloOOoi I000oI1ioi;
                public boolean I00100l0;

                @Override
                public final void I0000Il00O() {
/* 3 */             if (this.I0000Il00O) {
/* 20 */                return;
                    }
/* 5 */             super.I0000Il00O();
/* 10 */            if (this.I00100l0) {
/* 20 */                return;
                    }
/* 13 */            this.I00100l0 = true;
/* 17 */            this.I000oI1ioi.I000l1();
                }

                @Override
                public final lOIo01O01 I001i1O0Ol() {
                    OII1OIi oII1OIi;
/* 1 */             OI10OloOOoi oI10OloOOoi = this.I000oI1ioi;
/* 5 */             if (oI10OloOOoi.I000lI || oI10OloOOoi.I0000Il00O) {
/* 248 */               return new Ol1ilI(this);
                    }
/* 14 */            OI10IIO oi10iio = this.I000O01llI0;
/* 16 */            long j = this.I00000oOI;
/* 37 */            HashMap mapI000lI = oi10iio != null ? Ol1l1lI1Ili.I000lI(oI10OloOOoi.I000II(), this, this.I000oI1ioi.I0000O()) : null;
/* 38 */            Object obj = Ol1l1lI1Ili.I0000Il00O;
                    synchronized (obj) {
                        try {
/* 41 */                    Ol1l1lI1Ili.I001IO000(this);
/* 44 */                    if (oi10iio == null || oi10iio.I0000O == 0) {
/* 50 */                        oII1OIi = this;
/* 103 */                       oII1OIi.I00000oIO();
                            } else {
/* 64 */                        oII1OIi = this;
/* 65 */                        lOIo01O01 loio01o01I001l0I00 = oII1OIi.I001l0I00(this.I000oI1ioi.I000II(), oi10iio, mapI000lI, this.I000oI1ioi.I0000O());
/* 75 */                        if (!loio01o01I001l0I00.equals(Ol1ilo1.I00000oIO)) {
/* 78 */                            return loio01o01I001l0I00;
                                }
/* 81 */                        OI10IIO oi10iioI001i1lo1io = oII1OIi.I000oI1ioi.I001i1lo1io();
/* 85 */                        if (oi10iioI001i1lo1io != null) {
/* 87 */                            oi10iioI001i1lo1io.I000OiO(oi10iio);
                                } else {
/* 97 */                            oII1OIi.I000oI1ioi.I001lllioOl(oi10iio);
/* 100 */                           oII1OIi.I000O01llI0 = null;
                                }
                            }
/* 116 */                   if (O0000Ioio00.I0001Ioi1lo(oII1OIi.I000oI1ioi.I000II(), j) < 0) {
/* 120 */                       oII1OIi.I000oI1ioi.I001IO000();
                            }
/* 123 */                   OI10OloOOoi oI10OloOOoi2 = oII1OIi.I000oI1ioi;
/* 139 */                   oI10OloOOoi2.I0010I0i(oI10OloOOoi2.I0000O().I0000O(j).I00000oOI(oII1OIi.I000OiO));
/* 144 */                   oII1OIi.I000oI1ioi.I001lIiIIo1O(j);
/* 147 */                   OI10OloOOoi oI10OloOOoi3 = oII1OIi.I000oI1ioi;
/* 149 */                   int i = oII1OIi.I0000O;
/* 152 */                   oII1OIi.I0000O = -1;
/* 154 */                   if (i >= 0) {
/* 156 */                       int[] iArr = oI10OloOOoi3.I000iOII;
/* 158 */                       int length = iArr.length;
/* 161 */                       int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
/* 165 */                       iArrCopyOf[length] = i;
/* 167 */                       oI10OloOOoi3.I000iOII = iArrCopyOf;
                            } else {
/* 170 */                       oI10OloOOoi3.getClass();
                            }
/* 173 */                   OI10OloOOoi oI10OloOOoi4 = oII1OIi.I000oI1ioi;
/* 175 */                   Ol1l0OoOo ol1l0OoOo = oII1OIi.I000OiO;
/* 177 */                   oI10OloOOoi4.getClass();
                            synchronized (obj) {
/* 187 */                       oI10OloOOoi4.I000OiO = oI10OloOOoi4.I000OiO.I000OiO(ol1l0OoOo);
/* 190 */                       OI10OloOOoi oI10OloOOoi5 = oII1OIi.I000oI1ioi;
/* 192 */                       int[] iArr2 = oII1OIi.I000iOII;
/* 194 */                       oI10OloOOoi5.getClass();
/* 198 */                       if (iArr2.length != 0) {
/* 201 */                           int[] iArr3 = oI10OloOOoi5.I000iOII;
/* 204 */                           if (iArr3.length != 0) {
/* 207 */                               int length2 = iArr3.length;
/* 208 */                               int length3 = iArr2.length;
/* 211 */                               int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
/* 216 */                               System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
/* 219 */                               iArr2 = iArrCopyOf2;
                                    }
/* 220 */                           oI10OloOOoi5.I000iOII = iArr2;
                                }
                            }
/* 224 */                   oII1OIi.I000lI = true;
/* 228 */                   if (!oII1OIi.I00100l0) {
/* 230 */                       oII1OIi.I00100l0 = true;
/* 234 */                       oII1OIi.I000oI1ioi.I000l1();
                            }
/* 237 */                   return Ol1ilo1.I00000oIO;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }
            }

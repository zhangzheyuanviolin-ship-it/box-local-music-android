            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public final class O0l0II1 implements O0liilOIOii {
                public O0l101IIlOI0 I00000oIO;
                public O0l0I1 I00000oOI;
                public I00Ol00 I0000Il00O;

                @Override
                public final int I00000oIO() {
/* 7 */             return this.I00000oOI.I00000oOI().I00000oOI;
                }

                @Override
                public final Object I00000oOI(int i) {
/* 3 */             Object objI000OOo1O = this.I0000Il00O.I000OOo1O(i);
                    return objI000OOo1O == null ? this.I00000oOI.I0000Il00O(i) : objI000OOo1O;
                }

                @Override
                public final Object I0000Il00O(int i) {
/* 3 */             return this.I00000oOI.I00000oIO(i);
                }

                @Override
                public final void I0000O(int i, Object obj, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    Object obj2;
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(1493551140);
/* 11 */            int i4 = 2;
/* 41 */            int i5 = i2 | (iloI0lOlll1.I0000oI00(i) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(obj) ? 32 : 16) | (iloI0lOlll1.I000II(this) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 57 */            int i6 = 14;
/* 59 */            if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 147) != 146)) {
/* 63 */                O0ll1ilooi o0ll1ilooi = this.I00000oIO.I00100o1O0lo;
/* 67 */                I0o0iI i0o0iI = new I0o0iI(i4);
/* 70 */                i0o0iI.I00iiO = this;
/* 72 */                i0o0iI.I00iiI = i;
/* 74 */                VarHandle.storeStoreFence();
/* 95 */                i3 = i;
/* 96 */                obj2 = obj;
/* 97 */                iloI0lOlll12 = iloI0lOlll1;
/* 98 */                l1000111l0.I00000oIO(obj2, i3, o0ll1ilooi, iiioOl1O.I00000oOI(726189336, i0o0iI, iloI0lOlll1), iloI0lOlll12, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
                    } else {
/* 102 */               i3 = i;
/* 103 */               obj2 = obj;
/* 104 */               iloI0lOlll12 = iloI0lOlll1;
/* 105 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 108 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 112 */           if (oOloioIlI001IO000 != null) {
/* 116 */               I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(i6);
/* 119 */               i0O0llIiIlOO.I00iiO = this;
/* 121 */               i0O0llIiIlOO.I00iiI = i3;
/* 123 */               i0O0llIiIlOO.I00iio = obj2;
/* 125 */               VarHandle.storeStoreFence();
/* 128 */               oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }

                @Override
                public final int I0000oI00(Object obj) {
/* 3 */             return this.I0000Il00O.I000O01llI0(obj);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof O0l0II1) {
/* 17 */                return O0000Ioio00.I0000O(this.I00000oOI, ((O0l0II1) obj).I00000oOI);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oOI.hashCode();
                }
            }

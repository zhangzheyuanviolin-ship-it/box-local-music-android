            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public final class O0loo1 implements O0liilOIOii {
                public O0o0I1i0O I00000oIO;
                public O0lolo I00000oOI;
                public O0l11l1iOO I0000Il00O;
                public I00Ol00 I0000O;

                @Override
                public final int I00000oIO() {
/* 7 */             return this.I00000oOI.I00000oOI().I00000oOI;
                }

                @Override
                public final Object I00000oOI(int i) {
/* 3 */             Object objI000OOo1O = this.I0000O.I000OOo1O(i);
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
/* 4 */             iloI0lOlll1.I00i0O(-462424778);
/* 21 */            int i4 = 16;
/* 41 */            int i5 = i2 | (iloI0lOlll1.I0000oI00(i) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(obj) ? 32 : 16) | (iloI0lOlll1.I000II(this) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 57 */            if (iloI0lOlll1.I00OIl(i5 & 1, (i5 & 147) != 146)) {
/* 61 */                O0ll1ilooi o0ll1ilooi = this.I00000oIO.I0010o;
/* 66 */                I0o0iI i0o0iI = new I0o0iI(3);
/* 69 */                i0o0iI.I00iiO = this;
/* 71 */                i0o0iI.I00iiI = i;
/* 73 */                VarHandle.storeStoreFence();
/* 94 */                i3 = i;
/* 95 */                obj2 = obj;
/* 96 */                iloI0lOlll12 = iloI0lOlll1;
/* 97 */                l1000111l0.I00000oIO(obj2, i3, o0ll1ilooi, iiioOl1O.I00000oOI(-824725566, i0o0iI, iloI0lOlll1), iloI0lOlll12, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
                    } else {
/* 101 */               i3 = i;
/* 102 */               obj2 = obj;
/* 103 */               iloI0lOlll12 = iloI0lOlll1;
/* 104 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 107 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 111 */           if (oOloioIlI001IO000 != null) {
/* 115 */               I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(i4);
/* 118 */               i0O0llIiIlOO.I00iiO = this;
/* 120 */               i0O0llIiIlOO.I00iiI = i3;
/* 122 */               i0O0llIiIlOO.I00iio = obj2;
/* 124 */               VarHandle.storeStoreFence();
/* 127 */               oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }

                @Override
                public final int I0000oI00(Object obj) {
/* 3 */             return this.I0000O.I000O01llI0(obj);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof O0loo1) {
/* 17 */                return O0000Ioio00.I0000O(this.I00000oOI, ((O0loo1) obj).I00000oOI);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00000oOI.hashCode();
                }
            }

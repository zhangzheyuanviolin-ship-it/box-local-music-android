            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public final class O0O0oI {
                public static final O0O0oI I00000oOI = new O0O0oI(Il011I1OiO0I.I00iOIl);
                public final Map I00000oIO;

                public O0O0oI(Map map) {
/* 4 */             this.I00000oIO = map;
                }

                /* JADX WARN: Removed duplicated region for block: B:75:0x0103  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O0O0o1io I00000oIO(O0O01O0o o0O01O0o) {
                    I011olOoO iiOOIlll;
                    I011olOoO i011olOoOI001lloI;
                    I011olOoO i011olOoOI001l0I00;
/* 1 */             boolean z = o0O01O0o instanceof I011olOoO;
/* 10 */            I011olOoO i011olOoO = z ? (I011olOoO) o0O01O0o : null;
/* 18 */            I011olOoO i011olOoOI001l0I002 = i011olOoO != null ? i011olOoO.I001l0I00() : null;
/* 25 */            I011olOoO i011olOoO2 = z ? (I011olOoO) o0O01O0o : null;
/* 33 */            I011olOoO i011olOoOI001lloI2 = i011olOoO2 != null ? i011olOoO2.I001lloI() : null;
/* 34 */            boolean z2 = false;
/* 35 */            if (i011olOoOI001l0I002 != null && i011olOoOI001lloI2 != null) {
/* 39 */                O0O0o1io o0O0o1ioI00000oIO = I00000oIO(i011olOoOI001l0I002);
/* 43 */                O0O01O0o o0O01O0o2 = o0O0o1ioI00000oIO.I00000oOI;
/* 52 */                I011olOoO i011olOoO3 = o0O01O0o2 instanceof I011olOoO ? (I011olOoO) o0O01O0o2 : null;
/* 53 */                if (i011olOoO3 != null && (i011olOoOI001l0I00 = i011olOoO3.I001l0I00()) != null) {
/* 65 */                    o0O0o1ioI00000oIO = new O0O0o1io(o0O0o1ioI00000oIO.I00000oIO, i011olOoOI001l0I00);
                        }
/* 69 */                O0O0o1io o0O0o1ioI00000oIO2 = I00000oIO(i011olOoOI001lloI2);
/* 73 */                O0O01O0o o0O01O0o3 = o0O0o1ioI00000oIO2.I00000oOI;
/* 82 */                I011olOoO i011olOoO4 = o0O01O0o3 instanceof I011olOoO ? (I011olOoO) o0O01O0o3 : null;
/* 83 */                if (i011olOoO4 != null && (i011olOoOI001lloI = i011olOoO4.I001lloI()) != null) {
/* 95 */                    o0O0o1ioI00000oIO2 = new O0O0o1io(o0O0o1ioI00000oIO2.I00000oIO, i011olOoOI001lloI);
                        }
/* 101 */               O0O10O o0o10o = o0O0o1ioI00000oIO.I00000oIO;
/* 103 */               O0O01O0o o0O01O0o4 = o0O0o1ioI00000oIO.I00000oOI;
/* 105 */               O0O01O0o o0O01O0o5 = o0O0o1ioI00000oIO2.I00000oOI;
/* 109 */               if (OllOoiO.I00000oIO) {
/* 129 */                   iiOOIlll = new IiOOIlll(l0loOIIo0iOo.I00000oIO((Ol0O0iI0l0O) ((IiOOIlll) o0O01O0o4).I00iiI, (Ol0O0iI0l0O) ((IiOOIlll) o0O01O0o5).I00iiI));
                        } else {
/* 133 */                   I011olOoO i011olOoO5 = (I011olOoO) o0O01O0o4;
/* 135 */                   I011olOoO i011olOoO6 = (I011olOoO) o0O01O0o5;
/* 141 */                   if (i011olOoO5.equals(i011olOoO6)) {
/* 143 */                       iiOOIlll = i011olOoO5;
                            } else {
/* 147 */                       IlOIO00Oi ilOIO00Oi = new IlOIO00Oi(null);
/* 150 */                       ilOIO00Oi.I00iiI = i011olOoO5;
/* 152 */                       ilOIO00Oi.I00iiO = i011olOoO6;
/* 154 */                       ilOIO00Oi.I00iio = false;
/* 156 */                       VarHandle.storeStoreFence();
/* 159 */                       iiOOIlll = ilOIO00Oi;
                            }
                        }
/* 160 */               return new O0O0o1io(o0o10o, iiOOIlll);
                    }
/* 164 */           O0IiIl0il o0IiIl0ilI001IIilI0O = o0O01O0o.I001IIilI0O();
/* 168 */           if (o0IiIl0ilI001IIilI0O == null) {
/* 170 */               O0O0o1io o0O0o1io = O0O0o1io.I0000Il00O;
/* 172 */               return l0iOII0lllIo.I00000oIO(o0O01O0o);
                    }
/* 183 */           O0O0o1io o0O0o1io2 = (O0O0o1io) this.I00000oIO.get(o0IiIl0ilI001IIilI0O);
/* 185 */           if (o0O0o1io2 == null) {
/* 269 */               O0O0o1io o0O0o1io3 = O0O0o1io.I0000Il00O;
/* 279 */               if (!o0O01O0o.I00111O().isEmpty()) {
/* 282 */                   List listI00111O = o0O01O0o.I00111O();
/* 296 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00111O, 10));
/* 299 */                   Iterator it = listI00111O.iterator();
/* 307 */                   while (it.hasNext()) {
/* 315 */                       O0O01O0o o0O01O0o6 = ((O0O0o1io) it.next()).I00000oOI;
/* 326 */                       arrayList.add(o0O01O0o6 != null ? I00000oIO(o0O01O0o6) : O0O0o1io.I0000Il00O);
                            }
/* 330 */                   boolean zI000lI = o0O01O0o.I000lI();
/* 334 */                   List listI001iOo1i0O = o0O01O0o.I001iOo1i0O();
/* 343 */                   I011olOoO i011olOoO7 = z ? (I011olOoO) o0O01O0o : null;
/* 350 */                   o0O01O0o = l0i10lIio.I0000Il00O(o0IiIl0ilI001IIilI0O, arrayList, zI000lI, listI001iOo1i0O, i011olOoO7 != null ? i011olOoO7.I0000O() : null);
                        }
/* 354 */               return l0iOII0lllIo.I00000oIO(o0O01O0o);
                    }
/* 187 */           O0O10O o0o10o2 = o0O0o1io2.I00000oIO;
/* 189 */           O0O01O0o o0O01O0o7 = o0O0o1io2.I00000oOI;
/* 191 */           if (o0O01O0o7 == null) {
/* 193 */               return o0O0o1io2;
                    }
/* 197 */           Oi1iIiI1 oi1iIiI1 = (Oi1iIiI1) o0O01O0o7;
/* 219 */           I011olOoO i011olOoOI001lllioOl = ((I011olOoO) oi1iIiI1).I001lllioOl(o0O01O0o.I000lI() || o0O01O0o7.I000lI());
/* 229 */           I011olOoO i011olOoO8 = z ? (I011olOoO) o0O01O0o : null;
/* 230 */           if (i011olOoO8 == null || !i011olOoO8.I000l1()) {
/* 244 */               I011olOoO i011olOoO9 = oi1iIiI1 instanceof I011olOoO ? (I011olOoO) oi1iIiI1 : null;
/* 246 */               if (i011olOoO9 != null && i011olOoO9.I000l1() && !o0O01O0o.I000lI()) {
/* 260 */                   z2 = true;
                        }
                    }
/* 265 */           return new O0O0o1io(o0o10o2, i011olOoOI001lllioOl.I001lIiIIo1O(z2));
                }
            }

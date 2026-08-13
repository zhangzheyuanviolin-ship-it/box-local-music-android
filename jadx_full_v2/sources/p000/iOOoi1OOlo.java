            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOOoi1OOlo {
                /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[PHI: r0
                  0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(IliIO10oO0 iliIO10oO0, int i, Function1 function1) {
                    int i2;
                    int i3;
                    Object objInvoke;
                    O1ooOo o1ooOoI0000Il00O;
                    O0lOOOI0Oo o0lOOOI0OoI010oio1OO0;
                    IIlOoolol0ll iIlOoolol0ll;
/* 5 */             if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 9 */                 IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                    }
/* 14 */            O1ooOo o1ooOo = iliIO10oO0.I00iOIl.I00ilI0I1;
/* 16 */            O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
                    loop0: while (true) {
/* 20 */                i2 = 0;
/* 21 */                i3 = 1;
/* 22 */                objInvoke = null;
/* 23 */                if (o0iiOioolIiI000O01llI0 == null) {
/* 135 */                   o1ooOoI0000Il00O = null;
                            break;
                        }
/* 35 */                if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 37 */                    while (o1ooOo != null) {
/* 43 */                        if ((o1ooOo.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 45 */                            o1ooOoI0000Il00O = o1ooOo;
/* 46 */                            OI110O0 oi110o0 = null;
/* 47 */                            while (o1ooOoI0000Il00O != null) {
/* 51 */                                if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
                                            break loop0;
                                        }
/* 58 */                                if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 69 */                                    int i4 = 0;
/* 70 */                                    for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 76 */                                        if ((o1ooOo2.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 78 */                                            i4++;
/* 80 */                                            if (i4 == 1) {
/* 82 */                                                o1ooOoI0000Il00O = o1ooOo2;
                                                    } else {
/* 84 */                                                if (oi110o0 == null) {
/* 92 */                                                    oi110o0 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 95 */                                                if (o1ooOoI0000Il00O != null) {
/* 97 */                                                    oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 100 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 101 */                                               oi110o0.I00000oOI(o1ooOo2);
                                                    }
                                                }
                                            }
/* 107 */                                   if (i4 == 1) {
                                            }
                                        }
/* 110 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                    }
                                }
/* 115 */                       o1ooOo = o1ooOo.I00ilI0I1;
                            }
                        }
/* 118 */               o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 133 */               o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                    }
/* 136 */           IliIO10oO0 iliIO10oO02 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 138 */           if ((iliIO10oO02 == null || !O0000Ioio00.I0000O(iliIO10oO02.I010oio1OO0(), iliIO10oO0.I010oio1OO0())) && (o0lOOOI0OoI010oio1OO0 = iliIO10oO0.I010oio1OO0()) != null) {
/* 162 */               int i5 = 5;
/* 164 */               if (i == 5) {
/* 166 */                   i3 = i5;
                        } else {
/* 168 */                   i5 = 6;
/* 169 */                   if (i != 6) {
/* 172 */                       i5 = 3;
/* 173 */                       if (i != 3) {
/* 176 */                           i5 = 4;
/* 177 */                           if (i != 4) {
/* 180 */                               if (i == 1) {
/* 182 */                                   i3 = 2;
                                        } else if (i != 2) {
/* 366 */                                   I000II.I001IO000("Unsupported direction for beyond bounds layout");
                                        }
                                    }
                                }
                            }
                        }
/* 192 */               if (o0lOOOI0OoI010oio1OO0.I00o0iI0io1.I00000oIO() <= 0 || !o0lOOOI0OoI010oio1OO0.I00o0iI0io1.I0000O() || !o0lOOOI0OoI010oio1OO0.I00lll10) {
/* 359 */                   return function1.invoke(O0lOOOI0Oo.I00oI0i);
                        }
/* 208 */               boolean zI010l1ol111 = o0lOOOI0OoI010oio1OO0.I010l1ol111(i3);
/* 212 */               O0lOOii o0lOOii = o0lOOOI0OoI010oio1OO0.I00o0iI0io1;
/* 221 */               int iI00000oOI = zI010l1ol111 ? o0lOOii.I00000oOI() : o0lOOii.I0000oI00();
/* 227 */               OOo0ooi oOo0ooi = new OOo0ooi();
/* 236 */               oOo0ooi.I00iOIl = o0lOOOI0OoI010oio1OO0.I00o0l1o1o0.I0000Il00O(iI00000oOI, iI00000oOI);
/* 244 */               int iI0000Il00O = o0lOOOI0OoI010oio1OO0.I00o0iI0io1.I0000Il00O() * 2;
/* 247 */               int iI00000oIO = o0lOOOI0OoI010oio1OO0.I00o0iI0io1.I00000oIO();
/* 251 */               if (iI0000Il00O > iI00000oIO) {
/* 253 */                   iI0000Il00O = iI00000oIO;
                        }
/* 254 */               while (objInvoke == null && o0lOOOI0OoI010oio1OO0.I010l1O((O0lO1lilIooO) oOo0ooi.I00iOIl, i3) && i2 < iI0000Il00O) {
/* 270 */                   O0lO1lilIooO o0lO1lilIooO = (O0lO1lilIooO) oOo0ooi.I00iOIl;
/* 272 */                   int i6 = o0lO1lilIooO.I00000oIO;
/* 274 */                   int i7 = o0lO1lilIooO.I00000oOI;
/* 280 */                   if (o0lOOOI0OoI010oio1OO0.I010l1ol111(i3)) {
/* 282 */                       i7++;
                            } else {
                                i6--;
                            }
/* 289 */                   O0lO1lilIooO o0lO1lilIooOI0000Il00O = o0lOOOI0OoI010oio1OO0.I00o0l1o1o0.I0000Il00O(i6, i7);
/* 303 */                   ((OI110O0) o0lOOOI0OoI010oio1OO0.I00o0l1o1o0.I00iiI).I000iOII((O0lO1lilIooO) oOo0ooi.I00iOIl);
/* 306 */                   oOo0ooi.I00iOIl = o0lO1lilIooOI0000Il00O;
/* 308 */                   i2++;
/* 314 */                   il0lI1i1olii.I000O01llI0(o0lOOOI0OoI010oio1OO0).I000iOII();
/* 319 */                   O0lOOIio1O1 o0lOOIio1O1 = new O0lOOIio1O1();
/* 322 */                   o0lOOIio1O1.I00000oIO = o0lOOOI0OoI010oio1OO0;
/* 324 */                   o0lOOIio1O1.I00000oOI = oOo0ooi;
/* 326 */                   o0lOOIio1O1.I0000Il00O = i3;
/* 328 */                   VarHandle.storeStoreFence();
/* 331 */                   objInvoke = function1.invoke(o0lOOIio1O1);
                        }
/* 346 */               ((OI110O0) o0lOOOI0OoI010oio1OO0.I00o0l1o1o0.I00iiI).I000iOII((O0lO1lilIooO) oOo0ooi.I00iOIl);
/* 353 */               il0lI1i1olii.I000O01llI0(o0lOOOI0OoI010oio1OO0).I000iOII();
/* 356 */               return objInvoke;
                    }
/* 22 */            return null;
                }
            }

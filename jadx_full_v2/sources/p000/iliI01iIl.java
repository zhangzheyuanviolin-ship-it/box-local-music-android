            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class iliI01iIl {
                public static final Ii0ii1 I00000oIO(IliIO10oO0 iliIO10oO0, int i) {
/* 5 */             int iOrdinal = iliIO10oO0.I01101IOlO().ordinal();
/* 9 */             if (iOrdinal != 0) {
/* 13 */                if (iOrdinal == 1) {
/* 30 */                    IliIO10oO0 iliIO10oO0I0000Il00O = iliI1i0.I0000Il00O(iliIO10oO0);
/* 34 */                    if (iliIO10oO0I0000Il00O == null) {
/* 132 */                       I000II.I000iOII("ActiveParent with no focused child");
/* 11 */                        return null;
                            }
/* 36 */                    Ii0ii1 ii0ii1I00000oIO = I00000oIO(iliIO10oO0I0000Il00O, i);
/* 40 */                    Ii0ii1 ii0ii1 = Ii0ii1.I00iOIl;
/* 42 */                    Ii0ii1 ii0ii12 = ii0ii1I00000oIO != ii0ii1 ? ii0ii1I00000oIO : null;
/* 46 */                    if (ii0ii12 != null) {
/* 129 */                       return ii0ii12;
                            }
/* 50 */                    if (iliIO10oO0.I00o101lO) {
/* 128 */                       return ii0ii1;
                            }
/* 52 */                    iliIO10oO0.I00o101lO = true;
                            try {
/* 55 */                        Ili1l01O ili1l01OI010lI0oi = iliIO10oO0.I010lI0oi();
/* 61 */                        IIoOi1IoOO iIoOi1IoOO = new IIoOi1IoOO(i);
/* 74 */                        Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner();
/* 76 */                        IliIO10oO0 iliIO10oO0I000II = ili1ioOlo0oO.I000II();
/* 82 */                        ili1l01OI010lI0oi.I000iOII.invoke(iIoOi1IoOO);
/* 85 */                        IliIO10oO0 iliIO10oO0I000II2 = ili1ioOlo0oO.I000II();
/* 91 */                        if (!iIoOi1IoOO.I00000oOI) {
                                    return (iliIO10oO0I000II == iliIO10oO0I000II2 || iliIO10oO0I000II2 == null) ? ii0ii1 : Ili1lII.I0000O == Ili1lII.I0000Il00O ? Ii0ii1.I00iiI : Ii0ii1.I00iiO;
                                }
/* 93 */                        Ili1lII ili1lII = Ili1lII.I00000oOI;
/* 95 */                        return Ii0ii1.I00iiI;
                            } finally {
/* 125 */                       iliIO10oO0.I00o101lO = false;
                            }
                        }
/* 16 */                if (iOrdinal == 2) {
/* 27 */                    return Ii0ii1.I00iiI;
                        }
/* 19 */                if (iOrdinal != 3) {
/* 23 */                    I000II.I00000oIO();
/* 11 */                    return null;
                        }
                    }
/* 136 */           return Ii0ii1.I00iOIl;
                }

                public static final Ii0ii1 I00000oOI(IliIO10oO0 iliIO10oO0, int i) {
/* 3 */             if (!iliIO10oO0.I00oI0i) {
/* 6 */                 iliIO10oO0.I00oI0i = true;
                        try {
/* 9 */                     Ili1l01O ili1l01OI010lI0oi = iliIO10oO0.I010lI0oi();
/* 15 */                    IIoOi1IoOO iIoOi1IoOO = new IIoOi1IoOO(i);
/* 28 */                    Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner();
/* 30 */                    IliIO10oO0 iliIO10oO0I000II = ili1ioOlo0oO.I000II();
/* 36 */                    ili1l01OI010lI0oi.I000OiO.invoke(iIoOi1IoOO);
/* 39 */                    IliIO10oO0 iliIO10oO0I000II2 = ili1ioOlo0oO.I000II();
/* 45 */                    if (iIoOi1IoOO.I00000oOI) {
/* 47 */                        Ili1lII ili1lII = Ili1lII.I00000oOI;
/* 49 */                        return Ii0ii1.I00iiI;
                            }
/* 56 */                    if (iliIO10oO0I000II != iliIO10oO0I000II2 && iliIO10oO0I000II2 != null) {
                                return Ili1lII.I0000O == Ili1lII.I0000Il00O ? Ii0ii1.I00iiI : Ii0ii1.I00iiO;
                            }
                        } finally {
/* 79 */                    iliIO10oO0.I00oI0i = false;
                        }
                    }
/* 82 */            return Ii0ii1.I00iOIl;
                }

                public static final Ii0ii1 I0000Il00O(IliIO10oO0 iliIO10oO0, int i) {
                    O1ooOo o1ooOoI0000Il00O;
                    IIlOoolol0ll iIlOoolol0ll;
/* 5 */             int iOrdinal = iliIO10oO0.I01101IOlO().ordinal();
/* 9 */             if (iOrdinal != 0) {
/* 13 */                if (iOrdinal == 1) {
/* 215 */                   IliIO10oO0 iliIO10oO0I0000Il00O = iliI1i0.I0000Il00O(iliIO10oO0);
/* 219 */                   if (iliIO10oO0I0000Il00O != null) {
/* 221 */                       return I00000oIO(iliIO10oO0I0000Il00O, i);
                            }
/* 228 */                   I000II.I000iOII("ActiveParent with no focused child");
/* 11 */                    return null;
                        }
/* 16 */                if (iOrdinal != 2) {
/* 19 */                    if (iOrdinal != 3) {
/* 211 */                       I000II.I00000oIO();
/* 11 */                        return null;
                            }
/* 25 */                    if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 29 */                        IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 34 */                    O1ooOo o1ooOo = iliIO10oO0.I00iOIl.I00ilI0I1;
/* 36 */                    O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
                            loop0: while (true) {
/* 40 */                        if (o0iiOioolIiI000O01llI0 == null) {
/* 152 */                           o1ooOoI0000Il00O = null;
                                    break;
                                }
/* 52 */                        if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 54 */                            while (o1ooOo != null) {
/* 60 */                                if ((o1ooOo.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 62 */                                    o1ooOoI0000Il00O = o1ooOo;
/* 63 */                                    OI110O0 oi110o0 = null;
/* 64 */                                    while (o1ooOoI0000Il00O != null) {
/* 68 */                                        if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
                                                    break loop0;
                                                }
/* 75 */                                        if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 86 */                                            int i2 = 0;
/* 87 */                                            for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 93 */                                                if ((o1ooOo2.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 95 */                                                    i2++;
/* 97 */                                                    if (i2 == 1) {
/* 99 */                                                        o1ooOoI0000Il00O = o1ooOo2;
                                                            } else {
/* 101 */                                                       if (oi110o0 == null) {
/* 109 */                                                           oi110o0 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 112 */                                                       if (o1ooOoI0000Il00O != null) {
/* 114 */                                                           oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 117 */                                                           o1ooOoI0000Il00O = null;
                                                                }
/* 118 */                                                       oi110o0.I00000oOI(o1ooOo2);
                                                            }
                                                        }
                                                    }
/* 124 */                                           if (i2 == 1) {
                                                    }
                                                }
/* 127 */                                       o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                            }
                                        }
/* 132 */                               o1ooOo = o1ooOo.I00ilI0I1;
                                    }
                                }
/* 135 */                       o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 150 */                       o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                            }
/* 153 */                   IliIO10oO0 iliIO10oO02 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 155 */                   if (iliIO10oO02 == null) {
/* 157 */                       return Ii0ii1.I00iOIl;
                            }
/* 164 */                   int iOrdinal2 = iliIO10oO02.I01101IOlO().ordinal();
/* 168 */                   if (iOrdinal2 == 0) {
/* 206 */                       return I00000oOI(iliIO10oO02, i);
                            }
/* 170 */                   if (iOrdinal2 == 1) {
/* 201 */                       return I0000Il00O(iliIO10oO02, i);
                            }
/* 172 */                   if (iOrdinal2 == 2) {
/* 198 */                       return Ii0ii1.I00iiI;
                            }
/* 174 */                   if (iOrdinal2 != 3) {
/* 194 */                       I000II.I00000oIO();
/* 11 */                        return null;
                            }
/* 176 */                   Ii0ii1 ii0ii1I0000Il00O = I0000Il00O(iliIO10oO02, i);
/* 182 */                   Ii0ii1 ii0ii1 = ii0ii1I0000Il00O != Ii0ii1.I00iOIl ? ii0ii1I0000Il00O : null;
                            return ii0ii1 == null ? I00000oOI(iliIO10oO02, i) : ii0ii1;
                        }
                    }
/* 232 */           return Ii0ii1.I00iOIl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v10, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r15v12 */
                /* JADX WARN: Type inference failed for: r15v13 */
                /* JADX WARN: Type inference failed for: r15v14 */
                /* JADX WARN: Type inference failed for: r15v15 */
                /* JADX WARN: Type inference failed for: r15v16 */
                /* JADX WARN: Type inference failed for: r15v21 */
                /* JADX WARN: Type inference failed for: r15v22 */
                /* JADX WARN: Type inference failed for: r15v23 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r15v8, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r15v9 */
                /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r5v10, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r5v18 */
                /* JADX WARN: Type inference failed for: r5v9 */
                public static final boolean I0000O(IliIO10oO0 iliIO10oO0) {
                    OI110O0 oi110o0;
                    IIlOoolol0ll iIlOoolol0ll;
                    Ili1ioOlo0oO ili1ioOlo0oO;
                    boolean z;
                    int i;
                    ?? oi110o02;
                    int i2;
                    int i3;
                    IIlOoolol0ll iIlOoolol0ll2;
/* 13 */            Ili1ioOlo0oO ili1ioOlo0oO2 = (Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner();
/* 15 */            IliIO10oO0 iliIO10oO0I000II = ili1ioOlo0oO2.I000II();
/* 19 */            IliI0101O0Oi iliI0101O0OiI01101IOlO = iliIO10oO0.I01101IOlO();
/* 24 */            if (iliIO10oO0I000II == iliIO10oO0) {
/* 26 */                iliIO10oO0.I010l1ol111(iliI0101O0OiI01101IOlO, iliI0101O0OiI01101IOlO);
/* 23 */                return true;
                    }
/* 30 */            if ((iliIO10oO0I000II == null || iliIO10oO0I000II.I00o0iI0io1) && !iliIO10oO0.I00o0iI0io1 && !((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner()).I00000oIO.I001lloI()) {
/* 61 */                return false;
                    }
/* 69 */            if (iliIO10oO0I000II != null) {
/* 75 */                oi110o0 = new OI110O0(new IliIO10oO0[16]);
/* 82 */                if (!iliIO10oO0I000II.I00iOIl.I00lll10) {
/* 84 */                    IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                        }
/* 89 */                O1ooOo o1ooOo = iliIO10oO0I000II.I00iOIl.I00ilI0I1;
/* 91 */                O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I000II);
/* 95 */                while (o0iiOioolIiI000O01llI0 != null) {
/* 107 */                   if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 109 */                       while (o1ooOo != null) {
/* 115 */                           if ((o1ooOo.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 117 */                               O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 118 */                               OI110O0 oi110o03 = null;
/* 119 */                               while (o1ooOoI0000Il00O != null) {
/* 123 */                                   if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 127 */                                       oi110o0.I00000oOI((IliIO10oO0) o1ooOoI0000Il00O);
                                            } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 146 */                                       int i4 = 0;
/* 147 */                                       for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 153 */                                           if ((o1ooOo2.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 155 */                                               i4++;
/* 157 */                                               if (i4 == 1) {
/* 159 */                                                   o1ooOoI0000Il00O = o1ooOo2;
                                                        } else {
/* 161 */                                                   if (oi110o03 == null) {
/* 167 */                                                       oi110o03 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 171 */                                                   if (o1ooOoI0000Il00O != null) {
/* 173 */                                                       oi110o03.I00000oOI(o1ooOoI0000Il00O);
/* 176 */                                                       o1ooOoI0000Il00O = null;
                                                            }
/* 177 */                                                   oi110o03.I00000oOI(o1ooOo2);
                                                        }
                                                    }
                                                }
/* 183 */                                       if (i4 == 1) {
                                                }
                                            }
/* 186 */                                   o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o03);
                                        }
                                    }
/* 191 */                           o1ooOo = o1ooOo.I00ilI0I1;
                                }
                            }
/* 194 */                   o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 210 */                   o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll2 = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll2.I00ilO0;
                        }
                    } else {
/* 212 */               oi110o0 = null;
                    }
/* 213 */           IliIO10oO0[] iliIO10oO0Arr = new IliIO10oO0[16];
/* 215 */           IliIO10oO0[] iliIO10oO0Arr2 = new IliIO10oO0[16];
/* 221 */           if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 223 */               IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                    }
/* 228 */           O1ooOo o1ooOo3 = iliIO10oO0.I00iOIl.I00ilI0I1;
/* 230 */           O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
/* 234 */           boolean z2 = true;
/* 235 */           int i5 = 0;
/* 236 */           int i6 = 0;
/* 237 */           while (o0iiOioolIiI000O01llI02 != null) {
/* 249 */               if ((((O1ooOo) o0iiOioolIiI000O01llI02.I010101Oo1lO.I00io1l).I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 251 */                   while (o1ooOo3 != null) {
/* 257 */                       if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 259 */                           IliIO10oO0 iliIO10oO0I0000Il00O = o1ooOo3;
/* 260 */                           OI110O0 oi110o04 = null;
/* 262 */                           while (iliIO10oO0I0000Il00O != 0) {
/* 266 */                               if (iliIO10oO0I0000Il00O instanceof IliIO10oO0) {
/* 269 */                                   IliIO10oO0 iliIO10oO02 = iliIO10oO0I0000Il00O;
/* 291 */                                   if (O0000Ioio00.I0000O(oi110o0 != null ? Boolean.valueOf(oi110o0.I000iOII(iliIO10oO02)) : null, Boolean.TRUE)) {
/* 293 */                                       int i7 = i5 + 1;
/* 296 */                                       if (iliIO10oO0Arr.length < i7) {
/* 298 */                                           int length = iliIO10oO0Arr.length;
/* 299 */                                           ili1ioOlo0oO = ili1ioOlo0oO2;
/* 307 */                                           ?? r1 = new Object[Math.max(i7, length * 2)];
/* 309 */                                           i3 = i7;
/* 312 */                                           System.arraycopy(iliIO10oO0Arr, 0, r1, 0, length);
/* 315 */                                           iliIO10oO0Arr = r1;
                                                } else {
/* 317 */                                           ili1ioOlo0oO = ili1ioOlo0oO2;
/* 319 */                                           i3 = i7;
                                                }
/* 321 */                                       iliIO10oO0Arr[i5] = iliIO10oO02;
/* 323 */                                       i5 = i3;
                                            } else {
/* 326 */                                       ili1ioOlo0oO = ili1ioOlo0oO2;
/* 328 */                                       int i8 = i6 + 1;
/* 331 */                                       if (iliIO10oO0Arr2.length < i8) {
/* 333 */                                           int length2 = iliIO10oO0Arr2.length;
/* 340 */                                           ?? r5 = new Object[Math.max(i8, length2 * 2)];
/* 342 */                                           i2 = i8;
/* 345 */                                           System.arraycopy(iliIO10oO0Arr2, 0, r5, 0, length2);
/* 348 */                                           iliIO10oO0Arr2 = r5;
                                                } else {
/* 350 */                                           i2 = i8;
                                                }
/* 352 */                                       iliIO10oO0Arr2[i6] = iliIO10oO02;
/* 354 */                                       i6 = i2;
                                            }
/* 356 */                                   if (iliIO10oO02 == iliIO10oO0I000II) {
/* 358 */                                       z2 = false;
                                            }
/* 359 */                                   z = false;
                                        } else {
/* 361 */                                   ili1ioOlo0oO = ili1ioOlo0oO2;
/* 363 */                                   z = true;
                                        }
/* 364 */                               if (z && (iliIO10oO0I0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (iliIO10oO0I0000Il00O instanceof IiIioO0ol1oI)) {
/* 379 */                                   O1ooOo o1ooOo4 = iliIO10oO0I0000Il00O.I00o0l1o1o0;
/* 381 */                                   int i9 = 0;
                                            iliIO10oO0I0000Il00O = iliIO10oO0I0000Il00O;
/* 382 */                                   while (o1ooOo4 != null) {
/* 388 */                                       if ((o1ooOo4.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 390 */                                           int i10 = i9 + 1;
/* 393 */                                           if (i10 == 1) {
/* 395 */                                               iliIO10oO0I0000Il00O = o1ooOo4;
/* 396 */                                               i = i10;
                                                    } else {
/* 401 */                                               if (oi110o04 == null) {
/* 405 */                                                   i = i10;
/* 411 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        } else {
/* 415 */                                                   i = i10;
/* 419 */                                                   oi110o02 = oi110o04;
                                                        }
/* 421 */                                               if (iliIO10oO0I0000Il00O != 0) {
/* 423 */                                                   oi110o02.I00000oOI(iliIO10oO0I0000Il00O);
/* 426 */                                                   iliIO10oO0I0000Il00O = 0;
                                                        }
/* 427 */                                               oi110o02.I00000oOI(o1ooOo4);
/* 430 */                                               oi110o04 = oi110o02;
                                                        iliIO10oO0I0000Il00O = iliIO10oO0I0000Il00O;
                                                    }
/* 432 */                                           i9 = i;
                                                }
/* 437 */                                       o1ooOo4 = o1ooOo4.I00ilO0;
                                                iliIO10oO0I0000Il00O = iliIO10oO0I0000Il00O;
                                            }
/* 443 */                                   if (i9 == 1) {
/* 446 */                                       ili1ioOlo0oO2 = ili1ioOlo0oO;
                                            } else {
/* 452 */                                       iliIO10oO0I0000Il00O = il0lI1i1olii.I0000Il00O(oi110o04);
/* 456 */                                       ili1ioOlo0oO2 = ili1ioOlo0oO;
                                            }
                                        } else {
/* 452 */                                   iliIO10oO0I0000Il00O = il0lI1i1olii.I0000Il00O(oi110o04);
/* 456 */                                   ili1ioOlo0oO2 = ili1ioOlo0oO;
                                        }
                                    }
                                }
/* 463 */                       o1ooOo3 = o1ooOo3.I00ilI0I1;
/* 465 */                       ili1ioOlo0oO2 = ili1ioOlo0oO2;
                            }
                        }
/* 470 */               Ili1ioOlo0oO ili1ioOlo0oO3 = ili1ioOlo0oO2;
/* 472 */               o0iiOioolIiI000O01llI02 = o0iiOioolIiI000O01llI02.I001IO000();
/* 488 */               o1ooOo3 = (o0iiOioolIiI000O01llI02 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI02.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
/* 489 */               ili1ioOlo0oO2 = ili1ioOlo0oO3;
                    }
/* 494 */           Ili1ioOlo0oO ili1ioOlo0oO4 = ili1ioOlo0oO2;
/* 496 */           if (z2 && iliIO10oO0I000II != null && !I0000oI00(iliIO10oO0I000II, false)) {
/* 61 */                return false;
                    }
/* 512 */           IlIi0Il ilIi0Il = new IlIi0Il(1);
/* 515 */           ilIi0Il.I00iiI = iliIO10oO0;
/* 517 */           VarHandle.storeStoreFence();
/* 520 */           l1ioloOOl00l.I00000oIO(iliIO10oO0, ilIi0Il);
/* 527 */           int iOrdinal = iliIO10oO0.I01101IOlO().ordinal();
/* 531 */           if (iOrdinal != 0) {
/* 533 */               if (iOrdinal == 1) {
/* 560 */                   ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner()).I000OiO(iliIO10oO0);
                        } else if (iOrdinal != 2) {
/* 539 */                   if (iOrdinal != 3) {
/* 542 */                       I000II.I00000oIO();
/* 545 */                       return false;
                            }
/* 560 */                   ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner()).I000OiO(iliIO10oO0);
                        }
                    }
/* 563 */           if (z2 && iliIO10oO0I000II != null) {
/* 571 */               iliIO10oO0I000II.I010l1ol111(IliI0101O0Oi.I00iOIl, IliI0101O0Oi.I00iiO);
                    }
/* 574 */           if (oi110o0 != null) {
                        int i11 = oi110o0.I00iiO - 1;
/* 582 */               Object[] objArr = oi110o0.I00iOIl;
/* 585 */               if (i11 < objArr.length) {
/* 587 */                   while (i11 >= 0) {
/* 591 */                       IliIO10oO0 iliIO10oO03 = (IliIO10oO0) objArr[i11];
/* 597 */                       if (ili1ioOlo0oO4.I000II() != iliIO10oO0) {
/* 61 */                            return false;
                                }
/* 605 */                       iliIO10oO03.I010l1ol111(IliI0101O0Oi.I00iiI, IliI0101O0Oi.I00iiO);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
/* 616 */           if (i12 < iliIO10oO0Arr2.length) {
/* 618 */               while (i12 >= 0) {
/* 620 */                   IliIO10oO0 iliIO10oO04 = iliIO10oO0Arr2[i12];
/* 628 */                   if (ili1ioOlo0oO4.I000II() != iliIO10oO0) {
/* 61 */                        return false;
                            }
/* 641 */                   iliIO10oO04.I010l1ol111(iliIO10oO04 == iliIO10oO0I000II ? IliI0101O0Oi.I00iOIl : IliI0101O0Oi.I00iiO, IliI0101O0Oi.I00iiI);
                            i12--;
                        }
                    }
/* 651 */           if (ili1ioOlo0oO4.I000II() != iliIO10oO0) {
/* 61 */                return false;
                    }
/* 657 */           iliIO10oO0.I010l1ol111(iliI0101O0OiI01101IOlO, IliI0101O0Oi.I00iOIl);
                    return ili1ioOlo0oO4.I000II() == iliIO10oO0;
                }

                public static final boolean I0000oI00(IliIO10oO0 iliIO10oO0, boolean z) {
/* 5 */             int iOrdinal = iliIO10oO0.I01101IOlO().ordinal();
/* 10 */            if (iOrdinal != 0) {
/* 13 */                if (iOrdinal == 1) {
/* 27 */                    IliIO10oO0 iliIO10oO0I0000Il00O = iliI1i0.I0000Il00O(iliIO10oO0);
/* 39 */                    if (!(iliIO10oO0I0000Il00O != null ? I0000oI00(iliIO10oO0I0000Il00O, z) : true)) {
/* 12 */                        return false;
                            }
/* 45 */                    iliIO10oO0.I010l1ol111(IliI0101O0Oi.I00iiI, IliI0101O0Oi.I00iiO);
/* 9 */                     return true;
                        }
/* 16 */                if (iOrdinal == 2) {
/* 26 */                    return z;
                        }
/* 19 */                if (iOrdinal != 3) {
/* 22 */                    I000II.I00000oIO();
/* 12 */                    return false;
                        }
                    }
/* 9 */             return true;
                }
            }

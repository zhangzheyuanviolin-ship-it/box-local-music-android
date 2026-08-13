            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class OIIlOOiIlo {
                public static final OI0o11I1 I00000oIO;

                static {
/* 1 */             OI0o11I1 oI0o11I1 = OIOi1iO01.I00000oIO;
/* 8 */             I00000oIO = new OI0o11I1();
                }

                public static final void I00000oIO(O1ooOo o1ooOo, int i, int i2) {
/* 3 */             if (!(o1ooOo instanceof IiIioO0ol1oI)) {
/* 31 */                I00000oOI(o1ooOo, i & o1ooOo.I00iiO, i2);
/* 98 */                return;
                    }
/* 6 */             IiIioO0ol1oI iiIioO0ol1oI = (IiIioO0ol1oI) o1ooOo;
/* 8 */             int i3 = iiIioO0ol1oI.I00o0iI0io1;
/* 12 */            I00000oOI(o1ooOo, i3 & i, i2);
/* 16 */            int i4 = (~i3) & i;
/* 19 */            for (O1ooOo o1ooOo2 = iiIioO0ol1oI.I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 21 */                I00000oIO(o1ooOo2, i4, i2);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final void I00000oOI(O1ooOo o1ooOo, int i, int i2) {
/* 1 */             if (i2 != 0 || o1ooOo.I00oooO()) {
/* 14 */                if ((i & 2) != 0 && (o1ooOo instanceof O0iOoioOoI)) {
/* 23 */                    l0o11Oi.I00000oOI((O0iOoioOoI) o1ooOo);
/* 26 */                    if (i2 == 2) {
/* 32 */                        il0lI1i1olii.I0000oI00(o1ooOo, 2).I011lO1liO1O();
                            }
                        }
/* 37 */                if ((i & Barcode.FORMAT_ITF) != 0 && i2 != 2) {
/* 45 */                    il0lI1i1olii.I000O01llI0(o1ooOo).I00IOO();
                        }
/* 52 */                if ((4194304 & i) != 0 && i2 != 2) {
/* 60 */                    il0lI1i1olii.I000O01llI0(o1ooOo).I00Oio(false);
                        }
/* 67 */                if ((i & Barcode.FORMAT_QR_CODE) != 0 && (o1ooOo instanceof Io0Illo)) {
/* 73 */                    if (i2 == 1) {
/* 90 */                        O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(o1ooOo);
/* 97 */                        o0iiOioolIiI000O01llI0.I00i0O(o0iiOioolIiI000O01llI0.I010lI0oi + 1);
                            } else if (i2 == 2) {
/* 86 */                        il0lI1i1olii.I000O01llI0(o1ooOo).I00i0O(r0.I010lI0oi - 1);
                            }
/* 100 */                   if (i2 != 2) {
/* 102 */                       O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(o1ooOo);
/* 108 */                       if (o0iiOioolIiI000O01llI02.I010lI0oi != 0 && !o0iiOioolIiI000O01llI02.I00100l0() && !o0iiOioolIiI000O01llI02.I00100o1O0lo() && !o0iiOioolIiI000O01llI02.I010l1ol111) {
/* 131 */                           I0lio1O01i01 i0lio1O01i01 = (I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIiI000O01llI02);
/* 135 */                           IoloOio0I ioloOio0I = i0lio1O01i01.I010l1ol111.I0000oI00;
/* 137 */                           ioloOio0I.getClass();
/* 142 */                           if (o0iiOioolIiI000O01llI02.I010lI0oi > 0) {
/* 148 */                               ((OI110O0) ioloOio0I.I00iiI).I00000oOI(o0iiOioolIiI000O01llI02);
/* 151 */                               o0iiOioolIiI000O01llI02.I010l1ol111 = true;
                                    }
/* 153 */                           i0lio1O01i01.I00II0oii1o(null);
                                }
                            }
                        }
/* 158 */               if ((i & 4) != 0 && (o1ooOo instanceof Iillo1il11l)) {
/* 167 */                   il1ollIO0I.I00000oIO((Iillo1il11l) o1ooOo);
                        }
/* 172 */               if ((i & 8) != 0 && (o1ooOo instanceof OiiooOl)) {
/* 182 */                   il0lI1i1olii.I000O01llI0(o1ooOo).I00oII = true;
                        }
/* 186 */               if ((i & 64) != 0 && (o1ooOo instanceof OO0101O11i)) {
/* 199 */                   O0iioO o0iioO = il0lI1i1olii.I000O01llI0((OO0101O11i) o1ooOo).I010I0;
/* 203 */                   o0iioO.I00100l0.I00oI0i = true;
/* 205 */                   O1IioI o1IioI = o0iioO.I00100o1O0lo;
/* 207 */                   if (o1IioI != null) {
/* 209 */                       o1IioI.I00olI = true;
                            }
                        }
/* 213 */               if ((i & Barcode.FORMAT_PDF417) != 0 && (o1ooOo instanceof Ili1l10)) {
/* 220 */                   Ili1l10 ili1l10 = (Ili1l10) o1ooOo;
/* 222 */                   IIoO1IiIO0.I00000oOI = null;
/* 226 */                   ili1l10.I001lloI(IIoO1IiIO0.I00000oIO);
/* 231 */                   if (IIoO1IiIO0.I00000oOI != null) {
/* 233 */                       O1ooOo o1ooOo2 = (O1ooOo) ili1l10;
/* 239 */                       if (!o1ooOo2.I00iOIl.I00lll10) {
/* 243 */                           IolioOO1.I0000Il00O("visitChildren called on an unattached node");
                                }
/* 252 */                       OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 255 */                       O1ooOo o1ooOo3 = o1ooOo2.I00iOIl;
/* 257 */                       O1ooOo o1ooOo4 = o1ooOo3.I00ilO0;
/* 259 */                       if (o1ooOo4 == null) {
/* 261 */                           il0lI1i1olii.I00000oIO(oi110o0, o1ooOo3);
                                } else {
/* 265 */                           oi110o0.I00000oOI(o1ooOo4);
                                }
                                while (true) {
/* 268 */                           int i3 = oi110o0.I00iiO;
/* 270 */                           if (i3 == 0) {
                                        break;
                                    }
/* 278 */                           O1ooOo o1ooOoI0000Il00O = (O1ooOo) oi110o0.I000l1(i3 - 1);
/* 284 */                           if ((o1ooOoI0000Il00O.I00iio & Barcode.FORMAT_UPC_E) == 0) {
/* 286 */                               il0lI1i1olii.I00000oIO(oi110o0, o1ooOoI0000Il00O);
                                    } else {
                                        while (true) {
/* 290 */                                   if (o1ooOoI0000Il00O == null) {
                                                break;
                                            }
/* 296 */                                   if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 298 */                                       OI110O0 oi110o02 = null;
/* 299 */                                       while (o1ooOoI0000Il00O != null) {
/* 303 */                                           if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 305 */                                               IliIO10oO0 iliIO10oO0 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 319 */                                               Ili1O0oO00o ili1O0oO00o = ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO0)).getFocusOwner()).I0000O;
/* 327 */                                               if (ili1O0oO00o.I0000Il00O.I00000oIO(iliIO10oO0)) {
/* 329 */                                                   ili1O0oO00o.I00000oIO();
                                                        }
                                                    } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 348 */                                               int i4 = 0;
/* 349 */                                               for (O1ooOo o1ooOo5 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo5 != null; o1ooOo5 = o1ooOo5.I00ilO0) {
/* 355 */                                                   if ((o1ooOo5.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 357 */                                                       i4++;
/* 359 */                                                       if (i4 == 1) {
/* 361 */                                                           o1ooOoI0000Il00O = o1ooOo5;
                                                                } else {
/* 363 */                                                           if (oi110o02 == null) {
/* 369 */                                                               oi110o02 = new OI110O0(new O1ooOo[16]);
                                                                    }
/* 372 */                                                           if (o1ooOoI0000Il00O != null) {
/* 374 */                                                               oi110o02.I00000oOI(o1ooOoI0000Il00O);
/* 377 */                                                               o1ooOoI0000Il00O = null;
                                                                    }
/* 378 */                                                           oi110o02.I00000oOI(o1ooOo5);
                                                                }
                                                            }
                                                        }
/* 384 */                                               if (i4 == 1) {
                                                        }
                                                    }
/* 387 */                                           o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                                }
                                            } else {
/* 392 */                                       o1ooOoI0000Il00O = o1ooOoI0000Il00O.I00ilO0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 397 */               if ((i & Barcode.FORMAT_AZTEC) != 0 && (o1ooOo instanceof Ili0l001o1Io)) {
/* 404 */                   Ili0l001o1Io ili0l001o1Io = (Ili0l001o1Io) o1ooOo;
/* 418 */                   Ili1O0oO00o ili1O0oO00o2 = ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(ili0l001o1Io)).getFocusOwner()).I0000O;
/* 426 */                   if (ili1O0oO00o2.I0000O.I00000oIO(ili0l001o1Io)) {
/* 428 */                       ili1O0oO00o2.I00000oIO();
                            }
                        }
/* 434 */               if ((i & 2097152) != 0 && (o1ooOo instanceof IolI11) && i2 == 2) {
/* 444 */                   ((IolI11) o1ooOo).I00iIi0i1o();
                        }
                    }
                }

                public static final void I0000Il00O(O1ooOo o1ooOo) {
/* 3 */             if (!o1ooOo.I00lll10) {
/* 7 */                 IolioOO1.I0000Il00O("autoInvalidateUpdatedNode called on unattached node");
                    }
/* 12 */            I00000oIO(o1ooOo, -1, 0);
                }

                public static final int I0000O(O1ooIoIolOli o1ooIoIolOli) {
/* 7 */             int i = o1ooIoIolOli instanceof O0iOliloIli ? 3 : 1;
/* 10 */            if (o1ooIoIolOli instanceof Iillllo1oI1i) {
/* 12 */                i |= 4;
                    }
/* 16 */            if (o1ooIoIolOli instanceof OiioloI0I0oO) {
/* 18 */                i |= 8;
                    }
/* 22 */            if (o1ooIoIolOli instanceof OO1ioi) {
/* 24 */                i |= 16;
                    }
/* 28 */            if (o1ooIoIolOli instanceof O1ooll) {
/* 30 */                i |= 32;
                    }
/* 34 */            if (o1ooIoIolOli instanceof OO00oIlloIl) {
/* 36 */                i |= 64;
                    }
                    return o1ooIoIolOli instanceof III010o1O ? 524288 | i : i;
                }

                public static final int I0000oI00(O1ooOo o1ooOo) {
/* 1 */             int i = o1ooOo.I00iiO;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 6 */             Class<?> cls = o1ooOo.getClass();
/* 10 */            OI0o11I1 oI0o11I1 = I00000oIO;
/* 12 */            int iI0000O = oI0o11I1.I0000O(cls);
/* 16 */            if (iI0000O >= 0) {
/* 20 */                return oI0o11I1.I0000Il00O[iI0000O];
                    }
/* 29 */            int i2 = o1ooOo instanceof O0iOoioOoI ? 3 : 1;
/* 32 */            if (o1ooOo instanceof Iillo1il11l) {
/* 34 */                i2 |= 4;
                    }
/* 38 */            if (o1ooOo instanceof OiiooOl) {
/* 40 */                i2 |= 8;
                    }
/* 44 */            if (o1ooOo instanceof OO1iloII0lOo) {
/* 46 */                i2 |= 16;
                    }
/* 50 */            if (o1ooOo instanceof O1oolIO0) {
/* 52 */                i2 |= 32;
                    }
/* 56 */            if (o1ooOo instanceof OO0101O11i) {
/* 58 */                i2 |= 64;
                    }
/* 62 */            if (o1ooOo instanceof O0iOIlio1O) {
/* 67 */                i2 |= 4194432;
                    } else if (o1ooOo instanceof O1iOiiOo) {
/* 73 */                i2 |= Barcode.FORMAT_ITF;
                    }
/* 77 */            if (o1ooOo instanceof Io0Illo) {
/* 79 */                i2 |= Barcode.FORMAT_QR_CODE;
                    }
/* 83 */            if (o1ooOo instanceof Oiol1OoI) {
/* 85 */                i2 |= Barcode.FORMAT_UPC_A;
                    }
/* 89 */            if (o1ooOo instanceof IliIO10oO0) {
/* 91 */                i2 |= Barcode.FORMAT_UPC_E;
                    }
/* 95 */            if (o1ooOo instanceof Ili1l10) {
/* 97 */                i2 |= Barcode.FORMAT_PDF417;
                    }
/* 101 */           if (o1ooOo instanceof Ili0l001o1Io) {
/* 103 */               i2 |= Barcode.FORMAT_AZTEC;
                    }
/* 107 */           if (o1ooOo instanceof O0O1ll1l1o10) {
/* 109 */               i2 |= 8192;
                    }
/* 113 */           if (o1ooOo instanceof I0li1O0) {
/* 115 */               i2 |= 16384;
                    }
/* 119 */           if (o1ooOo instanceof IOlIil1) {
/* 124 */               i2 |= 32768;
                    }
/* 127 */           if (o1ooOo instanceof OoIOloiIii) {
/* 131 */               i2 |= 262144;
                    }
/* 134 */           if (o1ooOo instanceof III010o1O) {
/* 138 */               i2 |= 524288;
                    }
/* 141 */           if (o1ooOo instanceof Ooii0O0) {
/* 145 */               i2 |= 1048576;
                    }
/* 148 */           if (o1ooOo instanceof IolI11) {
/* 152 */               i2 |= 2097152;
                    }
/* 155 */           if (o1ooOo instanceof O0lOOOI0Oo) {
/* 159 */               i2 |= 8388608;
                    }
/* 160 */           oI0o11I1.I000II(i2, cls);
/* 168 */           return i2;
                }

                public static final int I0001Ioi1lo(O1ooOo o1ooOo) {
/* 3 */             if (!(o1ooOo instanceof IiIioO0ol1oI)) {
/* 22 */                return I0000oI00(o1ooOo);
                    }
/* 5 */             IiIioO0ol1oI iiIioO0ol1oI = (IiIioO0ol1oI) o1ooOo;
/* 7 */             int iI0001Ioi1lo = iiIioO0ol1oI.I00o0iI0io1;
/* 11 */            for (O1ooOo o1ooOo2 = iiIioO0ol1oI.I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 17 */                iI0001Ioi1lo |= I0001Ioi1lo(o1ooOo2);
                    }
/* 21 */            return iI0001Ioi1lo;
                }

                public static final boolean I000II(int i) {
/* 16 */            return ((i & Barcode.FORMAT_ITF) != 0) | ((i & 4194304) != 0);
                }
            }

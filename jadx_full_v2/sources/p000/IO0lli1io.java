            package p000;

            import java.io.IOException;
            import java.math.BigInteger;
            import java.util.Enumeration;
            import java.util.Hashtable;
            import java.util.Vector;
            
            public final class IO0lli1io extends I00IoO0 {
                public I00OOll1 I00iOIl;
                public OlliI1olI I00iiI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0253 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0243 A[LOOP:1: B:54:0x0177->B:92:0x0243, LOOP_END] */
                /* JADX WARN: Type inference failed for: r17v10 */
                /* JADX WARN: Type inference failed for: r17v11, types: [IO0lli1io] */
                /* JADX WARN: Type inference failed for: r17v4 */
                /* JADX WARN: Type inference failed for: r17v5 */
                /* JADX WARN: Type inference failed for: r17v6 */
                /* JADX WARN: Type inference failed for: r17v7, types: [IO0lli1io] */
                /* JADX WARN: Type inference failed for: r17v8, types: [IO0lli1io] */
                /* JADX WARN: Type inference failed for: r17v9 */
                /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v30 */
                /* JADX WARN: Type inference failed for: r2v33 */
                /* JADX WARN: Type inference failed for: r9v17, types: [I00OOll1] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IO0lli1io I000o00OoI0I(I00OIO1 i00oio1) {
                    I00IoIO0lI i00IoIO0lI;
                    int i;
                    boolean z;
                    boolean z2;
                    I00IoIO0lI i00IoIO0lI2;
                    ?? r17;
                    int i2;
                    Il1oi01OOI1 il1oi01OOI1;
                    int i3;
                    Il1l1ooI il1l1ooI;
                    I00II0oii1o i00II0oii1o;
                    Hashtable hashtable;
                    I00O0i0ii i00O0i0ii;
/* 3 */             I00OOll1 i00OOll1I001lllioOl = I00OOll1.I001lllioOl(i00oio1);
/* 7 */             IO0lli1io iO0lli1io = new IO0lli1io();
/* 10 */            iO0lli1io.I00iOIl = i00OOll1I001lllioOl;
/* 16 */            OlliI1olI olliI1olI = null;
/* 17 */            int i4 = 3;
/* 18 */            if (i00OOll1I001lllioOl.size() != 3) {
/* 738 */               I000II.I000iOII("sequence wrong size for a certificate");
/* 16 */                return null;
                    }
/* 20 */            boolean z3 = false;
/* 21 */            I00IO1oi11O i00IO1oi11OI001lloI = i00OOll1I001lllioOl.I001lloI(0);
/* 27 */            boolean z4 = true;
/* 28 */            int i5 = 2;
/* 29 */            if (i00IO1oi11OI001lloI instanceof OlliI1olI) {
/* 32 */                olliI1olI = (OlliI1olI) i00IO1oi11OI001lloI;
                    } else if (i00IO1oi11OI001lloI != null) {
/* 40 */                I00OOll1 i00OOll1I001lllioOl2 = I00OOll1.I001lllioOl(i00IO1oi11OI001lloI);
/* 44 */                OlliI1olI olliI1olI2 = new OlliI1olI();
/* 47 */                olliI1olI2.I00iOIl = i00OOll1I001lllioOl2;
/* 55 */                if (i00OOll1I001lllioOl2.I001lloI(0) instanceof I00Ol1ll1) {
/* 69 */                    i00IoIO0lI = (I00IoIO0lI) I00IoIO0lI.I00iiO.I0001Ioi1lo((I00Ol1ll1) i00OOll1I001lllioOl2.I001lloI(0), true);
/* 71 */                    olliI1olI2.I00iiI = i00IoIO0lI;
/* 73 */                    i = 0;
                        } else {
/* 77 */                    i00IoIO0lI = new I00IoIO0lI();
/* 90 */                    i00IoIO0lI.I00iOIl = BigInteger.valueOf(0L).toByteArray();
/* 92 */                    i00IoIO0lI.I00iiI = 0;
/* 94 */                    olliI1olI2.I00iiI = i00IoIO0lI;
/* 96 */                    i = -1;
                        }
/* 101 */               if (i00IoIO0lI.I001iOo1i0O(0)) {
/* 103 */                   z2 = false;
/* 104 */                   z = true;
                        } else if (i00IoIO0lI.I001iOo1i0O(1)) {
/* 112 */                   z = false;
/* 113 */                   z2 = true;
                        } else {
/* 119 */                   if (!i00IoIO0lI.I001iOo1i0O(2)) {
/* 709 */                       I000II.I000iOII("version number not recognised");
/* 16 */                        return null;
                            }
/* 121 */                   z = false;
/* 122 */                   z2 = false;
                        }
/* 125 */               Object objI001lloI = i00OOll1I001lllioOl2.I001lloI(i + 1);
/* 133 */               if (objI001lloI == null || (objI001lloI instanceof I00IoIO0lI)) {
/* 220 */                   i00IoIO0lI2 = (I00IoIO0lI) objI001lloI;
                        } else {
/* 142 */                   if (!(objI001lloI instanceof byte[])) {
/* 216 */                       I000II.I000iOII("illegal object in getInstance: ".concat(objI001lloI.getClass().getName()));
/* 16 */                        return null;
                            }
                            try {
/* 146 */                       I00OIO1 i00oio1I00111O = I00OIO1.I00111O((byte[]) objI001lloI);
/* 156 */                       if (!I00IoIO0lI.class.isInstance(i00oio1I00111O)) {
/* 178 */                           throw new IllegalStateException("unexpected object: ".concat(i00oio1I00111O.getClass().getName()));
                                }
/* 158 */                       i00IoIO0lI2 = (I00IoIO0lI) i00oio1I00111O;
                            } catch (Exception e) {
/* 203 */                       throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
                            }
                        }
/* 222 */               olliI1olI2.I00iiO = i00IoIO0lI2;
/* 234 */               olliI1olI2.I00iio = I0ioOiiIO0.I000o00OoI0I(i00OOll1I001lllioOl2.I001lloI(i + 2));
/* 246 */               olliI1olI2.I00ilI0I1 = i01lOO0li.I000o00OoI0I(i00OOll1I001lllioOl2.I001lloI(i + 3));
/* 254 */               I00OOll1 i00OOll1 = (I00OOll1) i00OOll1I001lllioOl2.I001lloI(i + 4);
/* 264 */               olliI1olI2.I00ilO0 = Oo110i.I000o00OoI0I(i00OOll1.I001lloI(0));
/* 274 */               olliI1olI2.I00io1l = Oo110i.I000o00OoI0I(i00OOll1.I001lloI(1));
/* 286 */               olliI1olI2.I00ioIO = i01lOO0li.I000o00OoI0I(i00OOll1I001lllioOl2.I001lloI(i + 5));
/* 288 */               int i6 = i + 6;
/* 298 */               olliI1olI2.I00l0I0l0lO1 = OliI1l0l.I000o00OoI0I(i00OOll1I001lllioOl2.I001lloI(i6));
/* 305 */               int size = (i00OOll1I001lllioOl2.size() - i6) - 1;
/* 306 */               if (size != 0 && z) {
/* 313 */                   I000II.I000iOII("version 1 certificate contains extra data");
/* 16 */                    return null;
                        }
/* 317 */               while (size > 0) {
/* 325 */                   I00Ol1ll1 i00Ol1ll1 = (I00Ol1ll1) i00OOll1I001lllioOl2.I001lloI(i6 + size);
/* 327 */                   int i7 = i00Ol1ll1.I00iiO;
/* 329 */                   if (i7 == z4) {
/* 662 */                       r17 = olliI1olI;
/* 664 */                       i2 = i4;
/* 665 */                       I00OIO1 i00oio1I001lIiIIo1O = i00Ol1ll1.I001lIiIIo1O();
/* 691 */                       olliI1olI2.I00l0OO0IO = i00oio1I001lIiIIo1O instanceof Ii0o0iiI ? Ii0o0iiI.I001lIiIIo1O(i00oio1I001lIiIIo1O) : new Ii0o0iiI(I00O0o1oo.I001i1O0Ol(i00oio1I001lIiIIo1O).I00iOIl, true);
                            } else if (i7 == i5) {
/* 630 */                       r17 = olliI1olI;
/* 632 */                       i2 = i4;
/* 633 */                       I00OIO1 i00oio1I001lIiIIo1O2 = i00Ol1ll1.I001lIiIIo1O();
/* 659 */                       olliI1olI2.I00li1OI = i00oio1I001lIiIIo1O2 instanceof Ii0o0iiI ? Ii0o0iiI.I001lIiIIo1O(i00oio1I001lIiIIo1O2) : new Ii0o0iiI(I00O0o1oo.I001i1O0Ol(i00oio1I001lIiIIo1O2).I00iOIl, true);
                            } else {
/* 333 */                       if (i7 != i4) {
/* 620 */                           ?? r172 = olliI1olI;
/* 626 */                           IioIoO10iOiI.I0001Ioi1lo(i00Ol1ll1.I00iiO, "Unknown tag encountered in structure: ");
/* 629 */                           return r172;
                                }
/* 335 */                       if (z2) {
/* 612 */                           ?? r173 = olliI1olI;
/* 616 */                           I000II.I000iOII("version 2 certificate cannot contain extensions");
/* 619 */                           return r173;
                                }
/* 343 */                       I00OOll1 i00OOll12 = (I00OOll1) I00OOll1.I00iiI.I0001Ioi1lo(i00Ol1ll1, z4);
/* 345 */                       if (i00OOll12 != null) {
/* 349 */                           I00OOll1 i00OOll1I001lllioOl3 = I00OOll1.I001lllioOl(i00OOll12);
/* 353 */                           il1oi01OOI1 = new Il1oi01OOI1();
/* 356 */                           r17 = olliI1olI;
/* 363 */                           il1oi01OOI1.I00iOIl = new Hashtable();
/* 370 */                           il1oi01OOI1.I00iiI = new Vector();
/* 372 */                           Enumeration enumerationI00II0Ol1O0l = i00OOll1I001lllioOl3.I00II0Ol1O0l();
                                    ?? r2 = z3;
/* 380 */                           while (enumerationI00II0Ol1O0l.hasMoreElements()) {
/* 382 */                               Object objNextElement = enumerationI00II0Ol1O0l.nextElement();
/* 386 */                               I00O0i0ii i00O0i0ii2 = Il1l1ooI.I00iio;
/* 390 */                               if (objNextElement instanceof Il1l1ooI) {
/* 392 */                                   il1l1ooI = (Il1l1ooI) objNextElement;
                                        } else {
/* 397 */                                   if (objNextElement != null) {
/* 401 */                                       ?? I001lllioOl = I00OOll1.I001lllioOl(objNextElement);
/* 405 */                                       Il1l1ooI il1l1ooI2 = new Il1l1ooI();
/* 412 */                                       if (I001lllioOl.size() == i5) {
/* 422 */                                           il1l1ooI2.I00iOIl = I00O0i0ii.I001lloI(I001lllioOl.I001lloI(r2));
/* 424 */                                           il1l1ooI2.I00iiI = r2;
/* 435 */                                           il1l1ooI2.I00iiO = I00O0o1oo.I001i1O0Ol(I001lllioOl.I001lloI(1));
/* 437 */                                           il1l1ooI = il1l1ooI2;
                                                } else {
/* 444 */                                           i3 = 3;
/* 445 */                                           if (I001lllioOl.size() != 3) {
/* 563 */                                               IioIoO10iOiI.I0001Ioi1lo(I001lllioOl.size(), "Bad sequence size: ");
/* 566 */                                               return r17;
                                                    }
/* 455 */                                           il1l1ooI2.I00iOIl = I00O0i0ii.I001lloI(I001lllioOl.I001lloI(r2));
/* 458 */                                           Object objI001lloI2 = I001lllioOl.I001lloI(1);
/* 462 */                                           if (objI001lloI2 == null || (objI001lloI2 instanceof I00II0oii1o)) {
/* 536 */                                               i00II0oii1o = (I00II0oii1o) objI001lloI2;
                                                    } else {
/* 471 */                                               if (!(objI001lloI2 instanceof byte[])) {
/* 532 */                                                   I000II.I000iOII("illegal object in getInstance: ".concat(objI001lloI2.getClass().getName()));
/* 535 */                                                   return r17;
                                                        }
                                                        try {
/* 475 */                                                   I00OIO1 i00oio1I00111O2 = I00OIO1.I00111O((byte[]) objI001lloI2);
/* 485 */                                                   if (!I00II0oii1o.class.isInstance(i00oio1I00111O2)) {
/* 509 */                                                       throw new IllegalStateException("unexpected object: ".concat(i00oio1I00111O2.getClass().getName()));
                                                            }
/* 487 */                                                   i00II0oii1o = (I00II0oii1o) i00oio1I00111O2;
                                                        } catch (IOException e2) {
/* 516 */                                                   IoOOl0iOl1io.I001l0I00("failed to construct boolean from byte[]: ", e2.getMessage());
/* 519 */                                                   return r17;
                                                        }
                                                    }
/* 542 */                                           il1l1ooI2.I00iiI = i00II0oii1o.I001iOo1i0O();
/* 553 */                                           il1l1ooI2.I00iiO = I00O0o1oo.I001i1O0Ol(I001lllioOl.I001lloI(2));
/* 555 */                                           il1l1ooI = il1l1ooI2;
                                                }
                                            } else {
/* 567 */                                       i3 = 3;
/* 568 */                                       il1l1ooI = r17;
                                            }
/* 570 */                                   hashtable = il1oi01OOI1.I00iOIl;
/* 572 */                                   i00O0i0ii = il1l1ooI.I00iOIl;
/* 578 */                                   if (!hashtable.containsKey(i00O0i0ii)) {
/* 598 */                                       IioIoO10iOiI.I000OiO("repeated extension found: ", i00O0i0ii);
/* 601 */                                       return r17;
                                            }
/* 582 */                                   il1oi01OOI1.I00iOIl.put(i00O0i0ii, il1l1ooI);
/* 587 */                                   il1oi01OOI1.I00iiI.addElement(i00O0i0ii);
/* 590 */                                   i4 = i3;
/* 591 */                                   r2 = 0;
/* 593 */                                   i5 = 2;
                                        }
/* 394 */                               i3 = 3;
/* 570 */                               hashtable = il1oi01OOI1.I00iOIl;
/* 572 */                               i00O0i0ii = il1l1ooI.I00iOIl;
/* 578 */                               if (!hashtable.containsKey(i00O0i0ii)) {
                                        }
                                    }
                                } else {
/* 604 */                           r17 = olliI1olI;
/* 606 */                           il1oi01OOI1 = r17;
                                }
/* 602 */                       i2 = i4;
/* 609 */                       olliI1olI2.I00ll1 = il1oi01OOI1;
                            }
                            size--;
/* 695 */                   z3 = false;
/* 696 */                   olliI1olI = r17;
/* 698 */                   i4 = i2;
/* 699 */                   z4 = true;
/* 700 */                   i5 = 2;
                        }
/* 703 */               olliI1olI = olliI1olI2;
                    }
/* 715 */           iO0lli1io.I00iiI = olliI1olI;
/* 722 */           I0ioOiiIO0.I000o00OoI0I(i00OOll1I001lllioOl.I001lloI(1));
/* 730 */           I001lloI.I001iOo1i0O(i00OOll1I001lllioOl.I001lloI(2));
/* 733 */           return iO0lli1io;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 1 */             return this.I00iOIl;
                }
            }

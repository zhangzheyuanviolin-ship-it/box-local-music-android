            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.PriorityQueue;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class Ilii0Oi0I1O {
                public static final IOloio1Ili I0000oI00;
                public I1I0i0Ilo1Oi I00000oIO;
                public LinkedHashMap I00000oOI;
                public OoIllIioi1l I0000Il00O;
                public HashMap I0000O;

                static {
/* 3 */             IOloio1Ili iOloio1Ili = new IOloio1Ili();
/* 11 */            iOloio1Ili.I00000oIO = new ConcurrentHashMap();
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            I0000oI00 = iOloio1Ili;
                }

                public static LinkedHashMap I00000oOI(ArrayList arrayList) {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                IlIiiolo0OO ilIiiolo0OO = (IlIiiolo0OO) it.next();
/* 22 */                String str = ilIiiolo0OO.I00000oIO;
/* 27 */                HashSet hashSet = new HashSet(2);
/* 30 */                hashSet.add(str);
/* 41 */                hashSet.add(str.replace("-", ""));
/* 44 */                Iterator it2 = hashSet.iterator();
/* 52 */                while (it2.hasNext()) {
/* 66 */                    linkedHashMap.put(((String) it2.next()).toLowerCase(Locale.ENGLISH), ilIiiolo0OO);
                        }
                    }
/* 186 */           return linkedHashMap;
                }

                public static String I0001Ioi1lo(OIll1lio oIll1lio) {
/* 1 */             if (oIll1lio == null) {
/* 140 */               return "Times-Roman";
                    }
/* 8 */             boolean z = false;
/* 9 */             if (oIll1lio.I0000Il00O() != null) {
/* 15 */                String lowerCase = oIll1lio.I0000Il00O().toLowerCase();
/* 25 */                if (lowerCase.contains("bold") || lowerCase.contains("black") || lowerCase.contains("heavy")) {
/* 43 */                    z = true;
                        }
                    }
                    return oIll1lio.I0000oI00(1) ? (z && oIll1lio.I0000oI00(64)) ? "Courier-BoldOblique" : z ? "Courier-Bold" : oIll1lio.I0000oI00(64) ? "Courier-Oblique" : "Courier" : oIll1lio.I0000oI00(2) ? (z && oIll1lio.I0000oI00(64)) ? "Times-BoldItalic" : z ? "Times-Bold" : oIll1lio.I0000oI00(64) ? "Times-Italic" : "Times-Roman" : (z && oIll1lio.I0000oI00(64)) ? "Helvetica-BoldOblique" : z ? "Helvetica-Bold" : oIll1lio.I0000oI00(64) ? "Helvetica-Oblique" : "Helvetica";
                }

                public final void I00000oIO(String str, ArrayList arrayList) {
/* 9 */             this.I0000O.put(str.toLowerCase(Locale.ENGLISH), arrayList);
                }

                public final IliIo0lOI I0000Il00O(int i, String str) {
/* 1 */             if (str == null) {
/* 160 */               return null;
                    }
/* 7 */             if (this.I00000oIO == null) {
                        synchronized (this) {
/* 12 */                    if (this.I00000oIO == null) {
/* 14 */                        I1I0i0Ilo1Oi i1I0i0Ilo1Oi = IliOo0o.I00000oIO;
                                synchronized (this) {
/* 25 */                            this.I00000oOI = I00000oOI((ArrayList) i1I0i0Ilo1Oi.I00iiI);
/* 27 */                            this.I00000oIO = i1I0i0Ilo1Oi;
                                }
                            }
                        }
                    }
/* 40 */            IlIiiolo0OO ilIiiolo0OOI000II = I000II(i, str);
/* 44 */            if (ilIiiolo0OOI000II != null) {
/* 46 */                return ilIiiolo0OOI000II.I00000oIO();
                    }
/* 59 */            IlIiiolo0OO ilIiiolo0OOI000II2 = I000II(i, str.replace("-", ""));
/* 63 */            if (ilIiiolo0OOI000II2 != null) {
/* 65 */                return ilIiiolo0OOI000II2.I00000oIO();
                    }
/* 90 */            List list = (List) this.I0000O.get(str.replace(" ", "").toLowerCase(Locale.ENGLISH));
/* 92 */            if (list == null) {
/* 95 */                list = Collections.EMPTY_LIST;
                    }
/* 97 */            Iterator it = list.iterator();
/* 105 */           while (it.hasNext()) {
/* 113 */               IlIiiolo0OO ilIiiolo0OOI000II3 = I000II(i, (String) it.next());
/* 117 */               if (ilIiiolo0OOI000II3 != null) {
/* 119 */                   return ilIiiolo0OOI000II3.I00000oIO();
                        }
                    }
/* 132 */           IlIiiolo0OO ilIiiolo0OOI000II4 = I000II(i, str.replace(",", "-"));
/* 136 */           if (ilIiiolo0OOI000II4 != null) {
/* 138 */               return ilIiiolo0OOI000II4.I00000oIO();
                    }
/* 149 */           IlIiiolo0OO ilIiiolo0OOI000II5 = I000II(i, str.concat("-Regular"));
/* 153 */           if (ilIiiolo0OOI000II5 != null) {
/* 155 */               return ilIiiolo0OOI000II5.I00000oIO();
                    }
/* 160 */           return null;
                }

                public final IliIo0lOI I0000O(String str) {
/* 6 */             OoIoiiol0o ooIoiiol0o = (OoIoiiol0o) I0000Il00O(3, str);
/* 8 */             if (ooIoiiol0o != null) {
/* 10 */                return ooIoiiol0o;
                    }
/* 16 */            OoIllIioi1l ooIllIioi1l = (OoIllIioi1l) I0000Il00O(1, str);
/* 18 */            if (ooIllIioi1l != null) {
/* 20 */                return ooIllIioi1l;
                    }
/* 26 */            OIi1OliIo0Ol oIi1OliIo0Ol = (OIi1OliIo0Ol) I0000Il00O(2, str);
/* 28 */            if (oIi1OliIo0Ol != null) {
/* 30 */                return oIi1OliIo0Ol;
                    }
/* 31 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:148:0x0275  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIOl1Oooo I0000oI00(String str, OIll1lio oIll1lio, OIlOo0I1lIl oIlOo0I1lIl) {
                    boolean z;
                    OIi1OliIo0Ol oIi1OliIo0Ol;
                    byte b;
                    Ilii0IO1 ilii0IO1;
                    OIloI11OoI01 oIloI11OoI01I0000O;
                    IIOoi0ooOoO iIOoi0ooOoO;
                    IIloOI iIloOI;
                    byte b2;
                    double d;
/* 12 */            OIi1OliIo0Ol oIi1OliIo0Ol2 = (OIi1OliIo0Ol) I0000Il00O(2, str);
/* 14 */            byte b3 = 0;
/* 16 */            if (oIi1OliIo0Ol2 != null) {
/* 20 */                return new IIOl1Oooo(oIi1OliIo0Ol2, null, false);
                    }
/* 24 */            byte b4 = 1;
/* 29 */            OoIllIioi1l ooIllIioi1l = (OoIllIioi1l) I0000Il00O(1, str);
/* 31 */            if (ooIllIioi1l != null) {
/* 35 */                return new IIOl1Oooo(null, ooIllIioi1l, false);
                    }
/* 39 */            if (oIlOo0I1lIl != null) {
/* 41 */                IIOoi0ooOoO iIOoi0ooOoO2 = oIlOo0I1lIl.I00iiI;
/* 69 */                String str2 = iIOoi0ooOoO2.I010101Oo1lO(IIi0I0I0o.I0II0OiI) + "-" + oIlOo0I1lIl.I00000oIO();
/* 79 */                if (str2.equals("Adobe-GB1") || str2.equals("Adobe-CNS1") || str2.equals("Adobe-Japan1") || str2.equals("Adobe-Korea1")) {
/* 114 */                   PriorityQueue priorityQueue = new PriorityQueue(20);
/* 131 */                   for (IlIiiolo0OO ilIiiolo0OO : this.I00000oOI.values()) {
/* 139 */                       I00Ol00 i00Ol00 = ilIiiolo0OO.I0000Il00O;
/* 141 */                       String str3 = ilIiiolo0OO.I00000oIO;
/* 143 */                       int i = ilIiiolo0OO.I0000O;
/* 145 */                       if (i00Ol00 == null) {
/* 200 */                           b = b3;
/* 207 */                           long j = ((ilIiiolo0OO.I000II & 4294967295L) << 32) | (ilIiiolo0OO.I0001Ioi1lo & 4294967295L);
/* 214 */                           if ("MalgunGothic-Semilight".equals(str3)) {
/* 219 */                               j &= -1441793;
                                    }
/* 230 */                           if ((oIlOo0I1lIl.I00000oIO().equals("GB1") && (j & 262144) == 262144) || ((oIlOo0I1lIl.I00000oIO().equals("CNS1") && (j & 1048576) == 1048576) || ((oIlOo0I1lIl.I00000oIO().equals("Japan1") && (j & 131072) == 131072) || (oIlOo0I1lIl.I00000oIO().equals("Korea1") && ((j & 524288) == 524288 || (j & 2097152) == 2097152))))) {
/* 322 */                               ilii0IO1 = new Ilii0IO1();
/* 325 */                               ilii0IO1.I00iiI = ilIiiolo0OO;
/* 327 */                               VarHandle.storeStoreFence();
/* 330 */                               oIloI11OoI01I0000O = oIll1lio.I0000O();
/* 336 */                               iIOoi0ooOoO = oIll1lio.I00iOIl;
/* 340 */                               if (oIloI11OoI01I0000O != null) {
/* 641 */                                   if (iIOoi0ooOoO.I00ooiO1I(IIi0I0I0o.I01iIIO, 0.0f) > 0.0f) {
/* 667 */                                       ilii0IO1.I00iOIl = (1.0d - ((Math.abs(iIOoi0ooOoO.I00ooiO1I(r4, 0.0f) - i) / 100.0f) * 0.5d)) + ilii0IO1.I00iOIl;
                                            }
/* 669 */                                   priorityQueue.add(ilii0IO1);
                                        }
                                    }
/* 672 */                           b3 = b;
/* 674 */                           b4 = 1;
                                } else if (((String) i00Ol00.I0000Il00O).equals(iIOoi0ooOoO2.I010101Oo1lO(IIi0I0I0o.I0II0OiI)) && ((String) ilIiiolo0OO.I0000Il00O.I0000O).equals(oIlOo0I1lIl.I00000oIO())) {
/* 179 */                           b = b3;
/* 322 */                           ilii0IO1 = new Ilii0IO1();
/* 325 */                           ilii0IO1.I00iiI = ilIiiolo0OO;
/* 327 */                           VarHandle.storeStoreFence();
/* 330 */                           oIloI11OoI01I0000O = oIll1lio.I0000O();
/* 336 */                           iIOoi0ooOoO = oIll1lio.I00iOIl;
/* 340 */                           if (oIloI11OoI01I0000O != null || (iIloOI = ilIiiolo0OO.I000OOo1O) == null) {
/* 641 */                               if (iIOoi0ooOoO.I00ooiO1I(IIi0I0I0o.I01iIIO, 0.0f) > 0.0f && i > 0) {
/* 667 */                                   ilii0IO1.I00iOIl = (1.0d - ((Math.abs(iIOoi0ooOoO.I00ooiO1I(r4, 0.0f) - i) / 100.0f) * 0.5d)) + ilii0IO1.I00iOIl;
                                        }
                                    } else {
/* 348 */                               byte[] bArr = (byte[]) iIloOI.I00iiI;
/* 360 */                               byte[] bArrCopyOfRange = Arrays.copyOfRange(oIll1lio.I0000O().I00000oIO, 2, 12);
/* 364 */                               byte b5 = bArrCopyOfRange[b];
/* 368 */                               if (b5 == bArr[b]) {
/* 370 */                                   if (b5 == 0) {
/* 382 */                                       b2 = b4;
/* 386 */                                       if (str3.toLowerCase().contains("barcode") || str3.startsWith(OlIo0Ooi1loI.I00Io1lO)) {
/* 400 */                                           IIi0l1 iIi0l1 = (IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I01i000i0iI);
/* 409 */                                           String strI00ioIO = iIi0l1 != null ? iIi0l1.I00ioIO() : null;
/* 412 */                                           if (strI00ioIO == null) {
/* 410 */                                               strI00ioIO = "";
                                                    }
/* 415 */                                           String strI0000Il00O = oIll1lio.I0000Il00O();
/* 410 */                                           String str4 = strI0000Il00O != null ? strI0000Il00O : "";
/* 427 */                                           if (!strI00ioIO.startsWith(OlIo0Ooi1loI.I00Io1lO) && !strI00ioIO.toLowerCase().contains("barcode") && !str4.startsWith(OlIo0Ooi1loI.I00Io1lO) && !str4.toLowerCase().contains("barcode")) {
/* 456 */                                               b4 = b2;
/* 458 */                                               b3 = b;
                                                    }
                                                }
                                            } else {
/* 463 */                                       b2 = b4;
                                            }
/* 465 */                                   byte b6 = bArrCopyOfRange[b2];
/* 467 */                                   byte b7 = bArr[b2];
/* 469 */                                   byte b8 = 5;
/* 470 */                                   if (b6 == b7) {
/* 472 */                                       d = 2.0d;
                                                ilii0IO1.I00iOIl += 2.0d;
                                            } else {
/* 481 */                                       d = 2.0d;
/* 483 */                                       if (b6 >= 2 && b6 <= 5 && b7 >= 2 && b7 <= 5) {
                                                    ilii0IO1.I00iOIl += 1.0d;
                                                } else if (b6 >= 11 && b6 <= 13 && b7 >= 11 && b7 <= 13) {
                                                    ilii0IO1.I00iOIl += 1.0d;
                                                } else if (b6 != 0 && b7 != 0) {
                                                    ilii0IO1.I00iOIl -= 1.0d;
                                                }
                                            }
/* 527 */                                   byte b9 = bArr[2];
/* 531 */                                   if (i == 100) {
/* 585 */                                       b8 = 2;
                                            } else if (i == 200) {
/* 583 */                                       b8 = 3;
                                            } else if (i == 300) {
/* 581 */                                       b8 = 4;
                                            } else if (i != 400) {
/* 579 */                                       b8 = i != 500 ? i != 600 ? i != 700 ? i != 800 ? i != 900 ? b : (byte) 10 : (byte) 9 : (byte) 8 : (byte) 7 : (byte) 6;
                                            }
/* 592 */                                   if (Math.abs(b9 - b8) > 2) {
/* 594 */                                       b9 = b8;
                                            }
/* 595 */                                   byte b10 = bArrCopyOfRange[2];
/* 597 */                                   if (b10 == b9) {
                                                ilii0IO1.I00iOIl += d;
                                            } else {
/* 606 */                                       byte b11 = b2;
/* 608 */                                       if (b10 > b11 && b9 > b11) {
/* 627 */                                           ilii0IO1.I00iOIl = (1.0d - (Math.abs(b10 - b9) * 0.5d)) + ilii0IO1.I00iOIl;
                                                }
                                            }
                                        }
                                    }
/* 669 */                           priorityQueue.add(ilii0IO1);
/* 672 */                           b3 = b;
/* 674 */                           b4 = 1;
                                } else {
/* 185 */                           b = b3;
/* 672 */                           b3 = b;
/* 674 */                           b4 = 1;
                                }
                            }
/* 681 */                   Ilii0IO1 ilii0IO12 = (Ilii0IO1) priorityQueue.poll();
/* 683 */                   if (ilii0IO12 != null) {
/* 687 */                       IliIo0lOI iliIo0lOII00000oIO = ilii0IO12.I00iiI.I00000oIO();
/* 693 */                       if (iliIo0lOII00000oIO instanceof OIi1OliIo0Ol) {
/* 701 */                           return new IIOl1Oooo((OIi1OliIo0Ol) iliIo0lOII00000oIO, null, true);
                                }
/* 705 */                       oIi1OliIo0Ol = null;
/* 706 */                       z = true;
/* 707 */                       if (iliIo0lOII00000oIO != null) {
/* 711 */                           return new IIOl1Oooo(null, iliIo0lOII00000oIO, true);
                                }
                            } else {
/* 715 */                       oIi1OliIo0Ol = null;
/* 716 */                       z = true;
                            }
                        } else {
/* 106 */                   z = true;
/* 107 */                   oIi1OliIo0Ol = null;
                        }
                    }
/* 721 */           return new IIOl1Oooo(oIi1OliIo0Ol, this.I0000Il00O, z);
                }

                public final IlIiiolo0OO I000II(int i, String str) {
/* 7 */             if (str.contains("+")) {
/* 17 */                str = str.substring(str.indexOf(43) + 1);
                    }
/* 33 */            IlIiiolo0OO ilIiiolo0OO = (IlIiiolo0OO) this.I00000oOI.get(str.toLowerCase(Locale.ENGLISH));
/* 35 */            if (ilIiiolo0OO == null || ilIiiolo0OO.I00000oOI != i) {
/* 42 */                return null;
                    }
/* 41 */            return ilIiiolo0OO;
                }

                public final IIOo1i I000O01llI0(String str, OIll1lio oIll1lio) {
/* 1 */             IliIo0lOI iliIo0lOII0000O = I0000O(str);
/* 5 */             int i = 5;
/* 6 */             if (iliIo0lOII0000O != null) {
/* 11 */                return new IIOo1i(i, (Object) iliIo0lOII0000O, false);
                    }
/* 19 */            IliIo0lOI iliIo0lOII0000O2 = I0000O(I0001Ioi1lo(oIll1lio));
/* 23 */            if (iliIo0lOII0000O2 == null) {
/* 25 */                iliIo0lOII0000O2 = this.I0000Il00O;
                    }
/* 30 */            return new IIOo1i(i, (Object) iliIo0lOII0000O2, true);
                }
            }

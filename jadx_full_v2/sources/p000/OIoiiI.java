            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class OIoiiI extends I00io1l {
                public OIoi1lo00I00 I00000oIO;
                public O0ooo1Oo I00000oOI;

                @Override
                public final void I00000oIO(OlII0Io1 olII0Io1) {
                    String str;
/* 1 */             O0ooo1Oo o0ooo1Oo = this.I00000oOI;
/* 3 */             ArrayList arrayList = o0ooo1Oo.I00000oOI;
/* 5 */             arrayList.add(olII0Io1);
/* 11 */            if (o0ooo1Oo.I00000oIO == 6) {
/* 480 */               return;
                    }
/* 17 */            ArrayList arrayList2 = new ArrayList();
/* 20 */            arrayList2.add(olII0Io1);
/* 25 */            iOlI10l ioli10l = new iOlI10l();
/* 35 */            ioli10l.I0000O = OlII0Io1.I00000oIO("", null);
/* 38 */            ioli10l.I0000oI00 = 0;
/* 40 */            ioli10l.I0000Il00O = arrayList2;
/* 42 */            ioli10l.I00000oIO = 0;
/* 44 */            ioli10l.I00000oOI = 0;
/* 50 */            if (!arrayList2.isEmpty()) {
/* 52 */                ioli10l.I00000oIO(0, 0);
/* 59 */                OlII0Io1 olII0Io12 = (OlII0Io1) arrayList2.get(0);
/* 61 */                ioli10l.I0000O = olII0Io12;
/* 69 */                ioli10l.I0000oI00 = olII0Io12.I00000oIO.length();
                    }
/* 71 */            VarHandle.storeStoreFence();
/* 78 */            while (ioli10l.I0000O()) {
/* 82 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(o0ooo1Oo.I00000oIO);
/* 89 */                if (iI001lIiIIo1O == 0) {
/* 444 */                   ioli10l.I000lI();
/* 453 */                   if (!ioli10l.I000O01llI0('[')) {
/* 455 */                       o0ooo1Oo.I00000oIO = 6;
/* 457 */                       return;
                            }
/* 458 */                   o0ooo1Oo.I00000oIO = 2;
/* 465 */                   o0ooo1Oo.I0000oI00 = new StringBuilder();
/* 471 */                   if (!ioli10l.I0000O()) {
/* 475 */                       o0ooo1Oo.I0000oI00.append('\n');
                            }
                        } else {
/* 93 */                    if (iI001lIiIIo1O == 1) {
/* 351 */                       IIOOoI iIOOoII000iOII = ioli10l.I000iOII();
/* 359 */                       if (l10i0Ooi.I00000oOI(ioli10l)) {
/* 376 */                           o0ooo1Oo.I0000oI00.append(ioli10l.I0000Il00O(iIOOoII000iOII, ioli10l.I000iOII()).I00000oIO());
/* 383 */                           if (!ioli10l.I0000O()) {
/* 387 */                               o0ooo1Oo.I0000oI00.append('\n');
                                    } else if (ioli10l.I000O01llI0(']') && ioli10l.I000O01llI0(':') && o0ooo1Oo.I0000oI00.length() <= 999 && !Il0oolIl0.I00000oIO(o0ooo1Oo.I0000oI00.toString()).isEmpty()) {
/* 437 */                               o0ooo1Oo.I00000oIO = 3;
/* 439 */                               ioli10l.I000lI();
                                    }
                                }
/* 455 */                       o0ooo1Oo.I00000oIO = 6;
/* 457 */                       return;
                            }
/* 96 */                    if (iI001lIiIIo1O == 2) {
/* 281 */                       ioli10l.I000lI();
/* 284 */                       IIOOoI iIOOoII000iOII2 = ioli10l.I000iOII();
/* 292 */                       if (l10i0Ooi.I00000oIO(ioli10l)) {
/* 304 */                           String strI00000oIO = ioli10l.I0000Il00O(iIOOoII000iOII2, ioli10l.I000iOII()).I00000oIO();
/* 314 */                           if (strI00000oIO.startsWith("<")) {
/* 321 */                               strI00000oIO = strI00000oIO.substring(1, strI00000oIO.length() - 1);
                                    }
/* 325 */                           o0ooo1Oo.I0001Ioi1lo = strI00000oIO;
/* 327 */                           int iI000lI = ioli10l.I000lI();
/* 335 */                           if (!ioli10l.I0000O()) {
/* 337 */                               o0ooo1Oo.I000OOo1O = true;
/* 339 */                               arrayList.clear();
                                    } else if (iI000lI == 0) {
                                    }
/* 347 */                           o0ooo1Oo.I00000oIO = 4;
                                }
/* 455 */                       o0ooo1Oo.I00000oIO = 6;
/* 457 */                       return;
                            }
/* 98 */                    if (iI001lIiIIo1O != 3) {
/* 100 */                       if (iI001lIiIIo1O == 4) {
/* 102 */                           IIOOoI iIOOoII000iOII3 = ioli10l.I000iOII();
/* 112 */                           if (l10i0Ooi.I0000Il00O(ioli10l, o0ooo1Oo.I000II)) {
/* 130 */                               o0ooo1Oo.I000O01llI0.append(ioli10l.I0000Il00O(iIOOoII000iOII3, ioli10l.I000iOII()).I00000oIO());
/* 137 */                               if (ioli10l.I0000O()) {
/* 145 */                                   ioli10l.I000II();
/* 148 */                                   ioli10l.I000lI();
/* 155 */                                   if (!ioli10l.I0000O()) {
/* 159 */                                       o0ooo1Oo.I000OOo1O = true;
/* 161 */                                       o0ooo1Oo.I00000oIO();
/* 164 */                                       arrayList.clear();
/* 167 */                                       o0ooo1Oo.I00000oIO = 1;
                                            }
                                        } else {
/* 141 */                                   o0ooo1Oo.I000O01llI0.append('\n');
                                        }
                                    }
/* 455 */                           o0ooo1Oo.I00000oIO = 6;
/* 457 */                           return;
                                }
                                switch (o0ooo1Oo.I00000oIO) {
                                    case 1:
/* 193 */                               str = "START_DEFINITION";
                                        break;
                                    case 2:
/* 190 */                               str = "LABEL";
                                        break;
                                    case 3:
/* 187 */                               str = "DESTINATION";
                                        break;
                                    case 4:
/* 184 */                               str = "START_TITLE";
                                        break;
                                    case 5:
/* 181 */                               str = "TITLE";
                                        break;
                                    case 6:
/* 178 */                               str = "PARAGRAPH";
                                        break;
                                    default:
/* 175 */                               str = "null";
                                        break;
                                }
/* 201 */                       I000II.I001IO000("Unknown parsing state: ".concat(str));
/* 204 */                       return;
                            }
/* 205 */                   ioli10l.I000lI();
/* 212 */                   if (ioli10l.I0000O()) {
/* 218 */                       o0ooo1Oo.I000II = (char) 0;
/* 220 */                       char cI000OiO = ioli10l.I000OiO();
/* 226 */                       if (cI000OiO == '\"' || cI000OiO == '\'') {
/* 242 */                           o0ooo1Oo.I000II = cI000OiO;
                                } else if (cI000OiO == '(') {
/* 239 */                           o0ooo1Oo.I000II = ')';
                                }
/* 246 */                       if (o0ooo1Oo.I000II != 0) {
/* 249 */                           o0ooo1Oo.I00000oIO = 5;
/* 256 */                           o0ooo1Oo.I000O01llI0 = new StringBuilder();
/* 258 */                           ioli10l.I000II();
/* 265 */                           if (!ioli10l.I0000O()) {
/* 269 */                               o0ooo1Oo.I000O01llI0.append('\n');
                                    }
                                } else {
/* 274 */                           o0ooo1Oo.I00000oIO();
/* 277 */                           o0ooo1Oo.I00000oIO = 1;
                                }
                            } else {
/* 214 */                       o0ooo1Oo.I00000oIO = 1;
                            }
                        }
                    }
                }

                @Override
                public final void I00000oOI(OlIIOI0o olIIOI0o) {
/* 5 */             this.I00000oOI.I0000O.add(olIIOI0o);
                }

                @Override
                public final void I0000oI00() {
/* 1 */             O0ooo1Oo o0ooo1Oo = this.I00000oOI;
/* 3 */             ArrayList arrayList = o0ooo1Oo.I00000oOI;
/* 7 */             ArrayList arrayList2 = new ArrayList();
/* 10 */            arrayList2.addAll(arrayList);
/* 13 */            boolean zIsEmpty = arrayList2.isEmpty();
/* 17 */            OIoi1lo00I00 oIoi1lo00I00 = this.I00000oIO;
/* 19 */            if (zIsEmpty) {
/* 21 */                oIoi1lo00I00.I000OOo1O();
                    } else {
/* 27 */                oIoi1lo00I00.I000II(o0ooo1Oo.I0000O);
                    }
                }

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final void I000O01llI0(IollOIOOI00 iollOIOOI00) {
/* 3 */             ArrayList arrayList = this.I00000oOI.I00000oOI;
/* 7 */             OlII11110Iol olII11110Iol = new OlII11110Iol();
/* 10 */            ArrayList arrayList2 = olII11110Iol.I00iOIl;
/* 12 */            arrayList2.addAll(arrayList);
/* 19 */            if (arrayList2.isEmpty()) {
/* 49 */                return;
                    }
/* 23 */            iollOIOOI00.I0000oI00(olII11110Iol, this.I00000oIO);
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
/* 3 */             if (iiiliIioo0oi.I000OOo1O) {
/* 12 */                return null;
                    }
/* 7 */             return II0oOO1.I00000oIO(iiiliIioo0oi.I0000Il00O);
                }
            }

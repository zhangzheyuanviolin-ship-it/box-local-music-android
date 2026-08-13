            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l0ooo0ii0Ii {
                public static final void I00000oIO(int i, int i2, I0o1iIoolIi i0o1iIoolIi, II0O000iIl iI0O000iIl, IOO0o0I1l iOO0o0I1l, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, O1ooiI111i o1ooiI111i, OII1lIlol oII1lIlol, OIo1Oi1l1lI oIo1Oi1l1lI, OIoIoIO0oI1O oIoIoIO0oI1O, Ol1iIOI ol1iIOI, lo1iloiI1 lo1iloii1, boolean z) {
                    int i3;
                    int i4;
                    I0o1iIoolIi i0o1iIoolIi2;
                    O1ooiI111i o1ooiI111i2;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    OIoIoIO0oI1O oIoIoIO0oI1O2;
                    Ol1iIOI ol1iIOI2;
                    lo1iloiI1 lo1iloii12;
                    OII1lIlol oII1lIlol2;
                    boolean z2;
                    OIilII oIilII;
                    O1ooiI111i o1ooiI111iI00000oIO;
                    OIilII oIilII2;
                    O1ooiI111i o1ooiI111iI0000O;
/* 27 */            OIilII oIilII3 = OIilII.I00iiI;
/* 29 */            Object obj = i1O01oOIoI0I.I00o0l1o1o0;
/* 34 */            iloI0lOlll1.I00i0O(-572816025);
/* 41 */            if ((i & 6) == 0) {
/* 54 */                i3 = i | (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2);
                    } else {
/* 57 */                i3 = i;
                    }
/* 63 */            if ((i & 48) == 0) {
/* 76 */                i3 |= iloI0lOlll1.I000II(oIoIoIO0oI1O) ? 32 : 16;
                    }
/* 78 */            int i5 = i & 384;
/* 80 */            int i6 = Barcode.FORMAT_ITF;
/* 84 */            if (i5 == 0) {
/* 97 */                i3 |= iloI0lOlll1.I000II(oIo1Oi1l1lI) ? Barcode.FORMAT_QR_CODE : 128;
                    }
/* 99 */            int i7 = i & 3072;
/* 101 */           int i8 = Barcode.FORMAT_UPC_E;
/* 108 */           if (i7 == 0) {
/* 121 */               i3 |= iloI0lOlll1.I000O01llI0(false) ? Barcode.FORMAT_PDF417 : 1024;
                    }
/* 128 */           if ((i & 24576) == 0) {
/* 141 */               i3 |= iloI0lOlll1.I0000oI00(1) ? 16384 : 8192;
                    }
/* 151 */           if ((i & 196608) == 0) {
/* 164 */               i3 |= iloI0lOlll1.I000II(ol1iIOI) ? 131072 : 65536;
                    }
/* 172 */           if ((i & 1572864) == 0) {
/* 185 */               i3 |= iloI0lOlll1.I000O01llI0(z) ? 1048576 : 524288;
                    }
/* 191 */           if ((i & 12582912) == 0) {
/* 204 */               i3 |= iloI0lOlll1.I000II(i0o1iIoolIi) ? 8388608 : 4194304;
                    }
/* 210 */           if ((i & 100663296) == 0) {
/* 224 */               i3 |= iloI0lOlll1.I0000oI00(0) ? 67108864 : 33554432;
                    }
/* 233 */           if ((i & 805306368) == 0) {
/* 246 */               i3 |= iloI0lOlll1.I0000O(0.0f) ? 536870912 : 268435456;
                    }
/* 250 */           if ((i2 & 6) == 0) {
/* 263 */               i4 = i2 | (iloI0lOlll1.I000II(lo1iloii1) ? 4 : 2);
                    } else {
/* 266 */               i4 = i2;
                    }
/* 270 */           if ((i2 & 48) == 0) {
/* 280 */               i4 |= iloI0lOlll1.I000OOo1O(oII1lIlol) ? 32 : 16;
                    }
/* 285 */           if ((i2 & 384) == 0) {
/* 291 */               if (iloI0lOlll1.I000OOo1O(null)) {
/* 293 */                   i6 = Barcode.FORMAT_QR_CODE;
                        }
/* 295 */               i4 |= i6;
                    }
/* 299 */           if ((i2 & 3072) == 0) {
/* 305 */               if (iloI0lOlll1.I000II(obj)) {
/* 307 */                   i8 = Barcode.FORMAT_PDF417;
                        }
/* 309 */               i4 |= i8;
                    }
/* 313 */           if ((i2 & 24576) == 0) {
/* 323 */               i4 |= iloI0lOlll1.I000II(iI0O000iIl) ? 16384 : 8192;
                    }
/* 327 */           if ((i2 & 196608) == 0) {
/* 337 */               i4 |= iloI0lOlll1.I000II(iOO0o0I1l) ? 131072 : 65536;
                    }
/* 341 */           if ((i2 & 1572864) == 0) {
/* 351 */               i4 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 1048576 : 524288;
                    }
/* 353 */           int i9 = i4;
/* 384 */           if (iloI0lOlll1.I00OIl(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i9) == 599186) ? false : true)) {
/* 386 */               int i10 = i3 & 112;
/* 395 */               boolean z3 = i10 == 32;
/* 397 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 401 */               Object obj2 = IOl11li.I00000oIO;
                        Object obj3 = objI00O0i0ii;
/* 403 */               if (z3 || objI00O0i0ii == obj2) {
/* 410 */                   O0liooO o0liooO = new O0liooO(0);
/* 413 */                   o0liooO.I00iiI = oIoIoIO0oI1O;
/* 415 */                   VarHandle.storeStoreFence();
/* 418 */                   iloI0lOlll1.I00iio(o0liooO);
                            obj3 = o0liooO;
                        }
/* 421 */               Object obj4 = (IllOOo00lI) obj3;
/* 423 */               int i11 = i3 >> 3;
/* 425 */               int i12 = i11 & 14;
/* 427 */               int i13 = i9 >> 15;
/* 437 */               int i14 = i12 | (i13 & 112) | (i9 & 896);
/* 441 */               Object objI00000oOI = lOO00IiI0li.I00000oOI(iOii1l, iloI0lOlll1);
/* 448 */               Object objI00000oOI2 = lOO00IiI0li.I00000oOI(null, iloI0lOlll1);
/* 486 */               boolean zI000II = ((((i14 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(oIoIoIO0oI1O)) || (i14 & 6) == 4) | iloI0lOlll1.I000II(objI00000oOI) | iloI0lOlll1.I000II(objI00000oOI2) | iloI0lOlll1.I000II(obj4);
/* 487 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 491 */               if (zI000II || objI00O0i0ii2 == obj2) {
/* 495 */                   IOO0o0I1l iOO0o0I1l2 = IOO0o0I1l.I00ilI0I1;
/* 501 */                   I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(23);
/* 504 */                   i0iI0O1IoIoI.I00iiO = objI00000oOI;
/* 506 */                   i0iI0O1IoIoI.I00iio = objI00000oOI2;
/* 508 */                   i0iI0O1IoIoI.I00iiI = obj4;
/* 510 */                   VarHandle.storeStoreFence();
/* 513 */                   IOO000ilo iOO000ilo = Ol1llolil.I00000oIO;
/* 517 */                   IiO0o1I iiO0o1I = new IiO0o1I(i0iI0O1IoIoI, iOO0o0I1l2);
/* 524 */                   IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(27);
/* 527 */                   iO1Io1IOOOIi.I00iiI = iiO0o1I;
/* 529 */                   iO1Io1IOOOIi.I00iiO = oIoIoIO0oI1O;
/* 531 */                   VarHandle.storeStoreFence();
/* 553 */                   objI00O0i0ii2 = new O0l0IOol0(0, 1, OlO01l1oOil.class, new IiO0o1I(iO1Io1IOOOIi, iOO0o0I1l2), "value", "getValue()Ljava/lang/Object;");
/* 558 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 561 */               O0Iooi01 o0Iooi01 = (O0Iooi01) objI00O0i0ii2;
/* 563 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 567 */               if (objI00O0i0ii3 == obj2) {
/* 569 */                   objI00O0i0ii3 = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 573 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 576 */               Ii0110 ii0110 = (Ii0110) objI00O0i0ii3;
/* 584 */               boolean z4 = i10 == 32;
/* 585 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii4;
/* 589 */               if (z4 || objI00O0i0ii4 == obj2) {
/* 596 */                   O0liooO o0liooO2 = new O0liooO(1);
/* 599 */                   o0liooO2.I00iiI = oIoIoIO0oI1O;
/* 601 */                   VarHandle.storeStoreFence();
/* 604 */                   iloI0lOlll1.I00iio(o0liooO2);
                            obj5 = o0liooO2;
                        }
/* 607 */               Object obj6 = (IllOOo00lI) obj5;
/* 614 */               int i15 = i3 >> 9;
/* 633 */               int i16 = (i3 & 65520) | (i15 & 458752) | (i15 & 3670016) | ((i9 << 21) & 29360128);
/* 634 */               int i17 = i9 << 15;
/* 646 */               int i18 = i16 | (i17 & 234881024) | (i17 & 1879048192);
/* 893 */               boolean zI000II2 = ((((i18 & 234881024) ^ 100663296) > 67108864 && iloI0lOlll1.I000II(obj)) || (i18 & 100663296) == 67108864) | ((((i18 & 112) ^ 48) > 32 && iloI0lOlll1.I000II(oIoIoIO0oI1O)) || (i18 & 48) == 32) | ((((i18 & 896) ^ 384) > 256 && iloI0lOlll1.I000II(oIo1Oi1l1lI)) || (i18 & 384) == 256) | ((((i18 & 7168) ^ 3072) > 2048 && iloI0lOlll1.I000O01llI0(false)) || (i18 & 3072) == 2048) | ((((57344 & i18) ^ 24576) > 16384 && iloI0lOlll1.I0000oI00(1)) || (i18 & 24576) == 16384) | ((((i18 & 1879048192) ^ 805306368) > 536870912 && iloI0lOlll1.I000II(iI0O000iIl)) || (i18 & 805306368) == 536870912) | ((((i18 & 3670016) ^ 1572864) > 1048576 && iloI0lOlll1.I0000O(0.0f)) || (i18 & 1572864) == 1048576) | ((((i18 & 29360128) ^ 12582912) > 8388608 && iloI0lOlll1.I000II(lo1iloii1)) || (i18 & 12582912) == 8388608) | ((((i13 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(iOO0o0I1l)) || (i13 & 6) == 4) | iloI0lOlll1.I000II(obj6) | ((((i18 & 458752) ^ 196608) > 131072 && iloI0lOlll1.I0000oI00(0)) || (i18 & 196608) == 131072) | iloI0lOlll1.I000II(ii0110);
/* 894 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj7 = objI00O0i0ii5;
/* 898 */               if (zI000II2 || objI00O0i0ii5 == obj2) {
/* 905 */                   O0l0Oo0oOo o0l0Oo0oOo = new O0l0Oo0oOo(1);
/* 908 */                   o0l0Oo0oOo.I0000oI00 = oIoIoIO0oI1O;
/* 910 */                   o0l0Oo0oOo.I00000oOI = oIo1Oi1l1lI;
/* 912 */                   o0l0Oo0oOo.I0001Ioi1lo = lo1iloii1;
/* 914 */                   o0l0Oo0oOo.I0000Il00O = o0Iooi01;
/* 916 */                   o0l0Oo0oOo.I000II = obj6;
/* 918 */                   o0l0Oo0oOo.I000O01llI0 = iI0O000iIl;
/* 920 */                   o0l0Oo0oOo.I000OOo1O = iOO0o0I1l;
/* 922 */                   o0l0Oo0oOo.I0000O = ii0110;
/* 924 */                   VarHandle.storeStoreFence();
/* 927 */                   iloI0lOlll1.I00iio(o0l0Oo0oOo);
                            obj7 = o0l0Oo0oOo;
                        }
/* 931 */               O0liioil o0liioil = (O0liioil) obj7;
/* 933 */               OIilII oIilII4 = OIilII.I00iOIl;
/* 961 */               boolean zI000O01llI0 = (((i12 ^ 6) > 4 && iloI0lOlll1.I000II(oIoIoIO0oI1O)) || (i11 & 6) == 4) | iloI0lOlll1.I000O01llI0(false);
/* 963 */               Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        Object obj8 = objI00O0i0ii6;
/* 967 */               if (zI000O01llI0 || objI00O0i0ii6 == obj2) {
/* 973 */                   O0lo1OIIOlol o0lo1OIIOlol = new O0lo1OIIOlol();
/* 976 */                   o0lo1OIIOlol.I00000oIO = oIoIoIO0oI1O;
/* 978 */                   o0lo1OIIOlol.I00000oOI = false;
/* 980 */                   VarHandle.storeStoreFence();
/* 983 */                   iloI0lOlll1.I00iio(o0lo1OIIOlol);
                            obj8 = o0lo1OIIOlol;
                        }
/* 986 */               O0lo0l o0lo0l = (O0lo0l) obj8;
/* 1004 */              boolean z5 = (i10 == 32) | ((i3 & 458752) == 131072);
/* 1005 */              Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                        Object obj9 = objI00O0i0ii7;
/* 1009 */              if (z5 || objI00O0i0ii7 == obj2) {
/* 1015 */                  OIoOIIoIIoO oIoOIIoIIoO = new OIoOIIoIIoO();
/* 1018 */                  oIoOIIoIIoO.I00000oIO = ol1iIOI;
/* 1020 */                  oIoOIIoIIoO.I00000oOI = oIoIoIO0oI1O;
/* 1022 */                  VarHandle.storeStoreFence();
/* 1025 */                  iloI0lOlll1.I00iio(oIoOIIoIIoO);
                            obj9 = oIoOIIoIIoO;
                        }
/* 1029 */              OIoOIIoIIoO oIoOIIoIIoO2 = (OIoOIIoIIoO) obj9;
/* 1037 */              III0liIO iII0liIO = (III0liIO) iloI0lOlll1.I000iOII(III0o1oi.I00000oIO);
/* 1045 */              O0iOOoiioO o0iOOoiioO = (O0iOOoiioO) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000o00OoI0I);
/* 1067 */              boolean zI000II3 = (i10 == 32) | iloI0lOlll1.I000II(iII0liIO) | iloI0lOlll1.I0000oI00(o0iOOoiioO.ordinal());
/* 1068 */              Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        Object obj10 = objI00O0i0ii8;
/* 1072 */              if (zI000II3 || objI00O0i0ii8 == obj2) {
/* 1078 */                  OIo1lIO1Ill oIo1lIO1Ill = new OIo1lIO1Ill();
/* 1081 */                  oIo1lIO1Ill.I00000oOI = oIoIoIO0oI1O;
/* 1083 */                  oIo1lIO1Ill.I0000Il00O = iII0liIO;
/* 1085 */                  oIo1lIO1Ill.I0000O = o0iOOoiioO;
/* 1087 */                  VarHandle.storeStoreFence();
/* 1090 */                  iloI0lOlll1.I00iio(oIo1lIO1Ill);
                            obj10 = oIo1lIO1Ill;
                        }
/* 1094 */              OIo1lIO1Ill oIo1lIO1Ill2 = (OIo1lIO1Ill) obj10;
/* 1096 */              O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 1098 */              if (z) {
/* 1103 */                  iloI0lOlll1.I00i01iIIliI(-853734429);
/* 1110 */                  int i19 = i12 | ((i3 >> 21) & 112);
/* 1158 */                  boolean z6 = ((((i19 & 14) ^ 6) > 4 && iloI0lOlll1.I000II(oIoIoIO0oI1O)) || (i19 & 6) == 4) | ((((i19 & 112) ^ 48) > 32 && iloI0lOlll1.I0000oI00(0)) || (i19 & 48) == 32);
/* 1160 */                  Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                            Object obj11 = objI00O0i0ii9;
/* 1164 */                  if (z6 || objI00O0i0ii9 == obj2) {
/* 1170 */                      OIo1lII0 oIo1lII0 = new OIo1lII0();
/* 1173 */                      oIo1lII0.I00000oIO = oIoIoIO0oI1O;
/* 1175 */                      VarHandle.storeStoreFence();
/* 1178 */                      iloI0lOlll1.I00iio(oIo1lII0);
                                obj11 = oIo1lII0;
                            }
/* 1185 */                  oIilII = oIilII3;
/* 1187 */                  o1ooiI111iI00000oIO = iIoIoOi00.I00000oIO((OIo1lII0) obj11, oIoIoIO0oI1O.I001IO000, oIilII);
/* 1192 */                  iloI0lOlll1.I0010I0i(false);
                        } else {
/* 1196 */                  oIilII = oIilII3;
/* 1202 */                  iloI0lOlll1.I00i01iIIliI(-853304645);
/* 1205 */                  iloI0lOlll1.I0010I0i(false);
/* 1208 */                  o1ooiI111iI00000oIO = o1ooIo101ll;
                        }
/* 1213 */              o1ooiI111i2 = o1ooiI111i;
/* 1227 */              O1ooiI111i o1ooiI111iI00000oIO2 = iIoOIl1il.I00000oIO(o1ooiI111i2.I0000O(oIoIoIO0oI1O.I001iOo1i0O).I0000O(oIoIoIO0oI1O.I001i1O0Ol), o0Iooi01, o0lo0l, oIilII, z);
/* 1231 */              if (z) {
/* 1235 */                  oIilII2 = oIilII;
/* 1238 */                  Iii0IOio iii0IOio = new Iii0IOio(1);
/* 1242 */                  iii0IOio.I00iiI = false;
/* 1244 */                  iii0IOio.I00iiO = oIoIoIO0oI1O;
/* 1246 */                  iii0IOio.I00iio = ii0110;
/* 1248 */                  VarHandle.storeStoreFence();
/* 1255 */                  o1ooiI111iI0000O = o1ooiI111iI00000oIO2.I0000O(OiioloIlOlIi.I00000oOI(o1ooIo101ll, false, iii0IOio));
                        } else {
/* 1260 */                  oIilII2 = oIilII;
/* 1262 */                  o1ooiI111iI0000O = o1ooiI111iI00000oIO2.I0000O(o1ooIo101ll);
                        }
/* 1272 */              oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 1274 */              ol1iIOI2 = ol1iIOI;
/* 1276 */              lo1iloii12 = lo1iloii1;
/* 1282 */              O1ooiI111i o1ooiI111iI00000oIO3 = iO0lIo11i11O.I00000oIO(o1ooiI111iI0000O.I0000O(o1ooiI111iI00000oIO), oIoIoIO0oI1O, oIilII2, i0o1iIoolIi, z, oIoOIIoIIoO2, oIoIoIO0oI1O.I00100l0, oIo1lIO1Ill2);
/* 1286 */              oIoIoIO0oI1O2 = oIoIoIO0oI1O;
/* 1287 */              i0o1iIoolIi2 = i0o1iIoolIi;
/* 1291 */              I0o1Oi0IO1 i0o1Oi0IO1 = new I0o1Oi0IO1(2);
/* 1294 */              i0o1Oi0IO1.I00000oOI = oIoIoIO0oI1O2;
/* 1296 */              VarHandle.storeStoreFence();
/* 1303 */              O1ooiI111i o1ooiI111iI0000O2 = o1ooiI111iI00000oIO3.I0000O(Oll10I.I00000oIO(o1ooIo101ll, oIoIoIO0oI1O2, i0o1Oi0IO1));
/* 1307 */              oII1lIlol2 = oII1lIlol;
/* 1322 */              z2 = z;
/* 1324 */              l0oolIloOO.I00000oIO(o0Iooi01, iO0011o0iIIl.I00000oIO(o1ooiI111iI0000O2, oII1lIlol2, null), oIoIoIO0oI1O2.I00111O, o0liioil, iloI0lOlll1, 0);
                    } else {
/* 1328 */              i0o1iIoolIi2 = i0o1iIoolIi;
/* 1330 */              o1ooiI111i2 = o1ooiI111i;
/* 1332 */              oIo1Oi1l1lI2 = oIo1Oi1l1lI;
/* 1333 */              oIoIoIO0oI1O2 = oIoIoIO0oI1O;
/* 1334 */              ol1iIOI2 = ol1iIOI;
/* 1335 */              lo1iloii12 = lo1iloii1;
/* 1336 */              oII1lIlol2 = oII1lIlol;
/* 1337 */              z2 = z;
/* 1338 */              iloI0lOlll1.I00OilO00Il();
                    }
/* 1341 */          OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 1345 */          if (oOloioIlI001IO000 != null) {
/* 1350 */              O0ll00l o0ll00l = new O0ll00l(0);
/* 1353 */              o0ll00l.I00iiO = o1ooiI111i2;
/* 1355 */              o0ll00l.I00iiI = oIoIoIO0oI1O2;
/* 1357 */              o0ll00l.I00iio = oIo1Oi1l1lI2;
/* 1359 */              o0ll00l.I00io1l = ol1iIOI2;
/* 1361 */              o0ll00l.I00ioIO = z2;
/* 1363 */              o0ll00l.I00li1OI = i0o1iIoolIi2;
/* 1365 */              o0ll00l.I00ilI0I1 = lo1iloii12;
/* 1367 */              o0ll00l.I00l0I0l0lO1 = oII1lIlol2;
/* 1369 */              o0ll00l.I00ilO0 = iI0O000iIl;
/* 1371 */              o0ll00l.I00l0OO0IO = iOO0o0I1l;
/* 1375 */              o0ll00l.I00ll1 = iOii1l;
/* 1379 */              o0ll00l.I00lli11 = i;
/* 1383 */              o0ll00l.I00lll10 = i2;
/* 1385 */              VarHandle.storeStoreFence();
/* 1388 */              oOloioIlI001IO000.I0000O = o0ll00l;
                    }
                }
            }

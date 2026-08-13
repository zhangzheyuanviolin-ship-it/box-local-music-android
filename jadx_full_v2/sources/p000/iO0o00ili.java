            package p000;

            import android.graphics.Rect;
            import android.graphics.Region;
            import android.os.Trace;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0o00ili {
                public static final OOo0IO I00000oIO = new OOo0IO(0.0f, 0.0f, 10.0f, 10.0f);

                public static final OI0l1oli1I I00000oIO(Oil01I0 oil01I0, Function1 function1) {
/* 3 */             Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
                    try {
/* 6 */                 Oil000 oil000I00000oIO = oil01I0.I00000oIO();
/* 10 */                O0iiOioolIi o0iiOioolIi = oil000I00000oIO.I0000Il00O;
/* 16 */                if (o0iiOioolIi.I00Io1o110i() && o0iiOioolIi.I00Io1lO()) {
/* 25 */                    OOo0IO oOo0IOI000II = oil000I00000oIO.I000II();
/* 33 */                    OI0l1oli1I oI0l1oli1I = new OI0l1oli1I(48);
/* 36 */                    IIloOI iIloOII00000oIO = lO1i11Ol01.I00000oIO();
/* 44 */                    iIloOII00000oIO.I00OI1(ioooOioll1.I00000oOI(oOo0IOI000II));
/* 53 */                    I0000O(lO1i11Ol01.I00000oIO(), iIloOII00000oIO, oI0l1oli1I, oil000I00000oIO, oil000I00000oIO, function1);
/* 59 */                    return oI0l1oli1I;
                        }
/* 60 */                return IooO001.I00000oIO;
                    } finally {
/* 68 */                Trace.endSection();
                    }
                }

                public static final void I00000oOI(IIloOI iIloOI, IIloOI iIloOI2, OI0l1oli1I oI0l1oli1I, Oil000 oil000, Oil000 oil0002, Function1 function1) {
/* 1 */             IIloOI iIloOI3 = iIloOI;
/* 7 */             Region region = (Region) iIloOI3.I00iiI;
/* 9 */             IIloOI iIloOI4 = iIloOI2;
/* 14 */            Region region2 = (Region) iIloOI4.I00iiI;
/* 16 */            O0iiOioolIi o0iiOioolIi = oil0002.I0000Il00O;
/* 18 */            O0iiOioolIi o0iiOioolIi2 = oil0002.I0000Il00O;
/* 24 */            if (!o0iiOioolIi.I00Io1o110i() || !o0iiOioolIi2.I00Io1lO() || region2.isEmpty()) {
/* 245 */               if (oil0002.I000o00OoI0I()) {
/* 247 */                   I0000Il00O(oI0l1oli1I, oil000, oil0002);
/* 685 */                   return;
                        }
/* 685 */               return;
                    }
/* 40 */            OOo0IO oOo0IOI000lI = oil0002.I000lI();
/* 49 */            if (oOo0IOI000lI.I000II()) {
/* 51 */                IiIill0O0li1 iiIill0O0li1I0001Ioi1lo = oil0002.I0001Ioi1lo();
/* 56 */                if (iiIill0O0li1I0001Ioi1lo == null) {
/* 62 */                    Iollol0oI iollol0oI = (Iollol0oI) o0iiOioolIi2.I010101Oo1lO.I00iio;
/* 68 */                    oOo0IOI000lI = l0o0IlOil1.I0000Il00O(iollol0oI).I00IoiI(iollol0oI, false);
                        } else {
/* 75 */                    O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1I0001Ioi1lo).I00iOIl;
/* 83 */                    Object objI000II = oil0002.I0000O.I00iOIl.I000II(Oiioi1IoIIli.I00000oOI);
/* 87 */                    if (objI000II == null) {
/* 89 */                        objI000II = null;
                            }
/* 95 */                    oOo0IOI000lI = lO1OiIiIo0oi.I00000oIO(o1ooOo, objI000II != null, false);
                        }
                    }
/* 99 */            IooO1IOlo iooO1IOloI00000oOI = ioooOioll1.I00000oOI(oOo0IOI000lI);
/* 103 */           iIloOI3.I00OI1(iooO1IOloI00000oOI);
/* 112 */           if (region.op(region2, Region.Op.INTERSECT)) {
/* 114 */               int i = oil0002.I0001Ioi1lo;
/* 116 */               Oil000 oil0003 = oil000;
/* 121 */               if (i == oil0003.I0001Ioi1lo) {
/* 123 */                   i = -1;
                        }
/* 126 */               Rect bounds = region.getBounds();
/* 143 */               Oil00l oil00l = new Oil00l(oil0002, new IooO1IOlo(bounds.left, bounds.top, bounds.right, bounds.bottom));
/* 146 */               OI0l1oli1I oI0l1oli1I2 = oI0l1oli1I;
/* 148 */               oI0l1oli1I2.I000OOo1O(i, oil00l);
/* 18 */                List listI000OOo1O = oil0002.I000OOo1O((4 & 1) != 0 ? !oil0002.I00000oOI : false, (4 & 2) == 0);
/* 160 */               int size = listI000OOo1O.size() - 1;
/* 162 */               while (-1 < size) {
/* 180 */                   if (!((Boolean) function1.invoke(listI000OOo1O.get(size))).booleanValue()) {
/* 195 */                       I00000oOI(iIloOI3, iIloOI4, oI0l1oli1I2, oil0003, (Oil000) listI000OOo1O.get(size), function1);
                            }
                            size--;
/* 200 */                   iIloOI3 = iIloOI;
/* 202 */                   iIloOI4 = iIloOI2;
/* 204 */                   oI0l1oli1I2 = oI0l1oli1I;
/* 206 */                   oil0003 = oil000;
                        }
/* 213 */               if (I0001Ioi1lo(oil0002)) {
/* 237 */                   region2.op(iooO1IOloI00000oOI.I00000oIO, iooO1IOloI00000oOI.I00000oOI, iooO1IOloI00000oOI.I0000Il00O, iooO1IOloI00000oOI.I0000O, Region.Op.DIFFERENCE);
                        }
                    }
                }

                public static final void I0000Il00O(OI0l1oli1I oI0l1oli1I, Oil000 oil000, Oil000 oil0002) {
                    O0iiOioolIi o0iiOioolIi;
/* 1 */             Oil000 oil000I000l1 = oil0002.I000l1();
/* 23 */            OOo0IO oOo0IOI000II = (oil000I000l1 == null || (o0iiOioolIi = oil000I000l1.I0000Il00O) == null || !o0iiOioolIi.I00Io1o110i()) ? I00000oIO : oil000I000l1.I000II();
/* 25 */            int i = oil0002.I0001Ioi1lo;
/* 29 */            if (i == oil000.I0001Ioi1lo) {
/* 31 */                i = -1;
                    }
/* 41 */            oI0l1oli1I.I000OOo1O(i, new Oil00l(oil0002, ioooOioll1.I00000oOI(oOo0IOI000II)));
                }

                /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I0000O(IIloOI iIloOI, IIloOI iIloOI2, OI0l1oli1I oI0l1oli1I, Oil000 oil000, Oil000 oil0002, Function1 function1) {
                    boolean z;
                    OOo0IO oOo0IOI00000oIO;
                    OIIlIII0Ili oIIlIII0IliI0000O;
/* 7 */             Oil000 oil0003 = oil000;
/* 9 */             Function1 function12 = function1;
/* 11 */            int i = oil0003.I0001Ioi1lo;
/* 15 */            Region region = (Region) iIloOI.I00iiI;
/* 17 */            IIloOI iIloOI3 = iIloOI2;
/* 21 */            Region region2 = (Region) iIloOI3.I00iiI;
/* 23 */            O0iiOioolIi o0iiOioolIi = oil0002.I0000Il00O;
/* 25 */            OiioiIIlooo oiioiIIlooo = oil0002.I0000O;
/* 27 */            O0iiOioolIi o0iiOioolIi2 = oil0002.I0000Il00O;
/* 29 */            int i2 = oil0002.I0001Ioi1lo;
/* 46 */            boolean z2 = (o0iiOioolIi.I00Io1o110i() && o0iiOioolIi2.I00Io1lO()) ? false : true;
/* 51 */            if (!region2.isEmpty() || i2 == i) {
/* 55 */                if (!z2 || oil0002.I000o00OoI0I()) {
/* 69 */                    IooO1IOlo iooO1IOloI00000oOI = ioooOioll1.I00000oOI(oil0002.I000lI());
/* 73 */                    iIloOI.I00OI1(iooO1IOloI00000oOI);
/* 76 */                    if (i2 == i) {
/* 78 */                        i2 = -1;
                            }
/* 85 */                    if (!region.op(region2, Region.Op.INTERSECT)) {
/* 433 */                       if (oil0002.I000o00OoI0I()) {
/* 435 */                           I0000Il00O(oI0l1oli1I, oil000, oil0002);
/* 438 */                           return;
                                } else {
/* 440 */                           if (i2 == -1) {
/* 444 */                               Rect bounds = region.getBounds();
/* 464 */                               oI0l1oli1I.I000OOo1O(i2, new Oil00l(oil0002, new IooO1IOlo(bounds.left, bounds.top, bounds.right, bounds.bottom)));
/* 685 */                               return;
                                    }
/* 685 */                           return;
                                }
                            }
/* 89 */                    Rect bounds2 = region.getBounds();
/* 111 */                   oI0l1oli1I.I000OOo1O(i2, new Oil00l(oil0002, new IooO1IOlo(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
/* 18 */                    List listI000OOo1O = oil0002.I000OOo1O((4 & 1) != 0 ? !oil0002.I00000oOI : false, (4 & 2) == 0);
/* 121 */                   if (oiioiIIlooo.I00iiO) {
/* 123 */                       Oil000 oil000I000l1 = oil0002.I000l1();
                                while (true) {
/* 127 */                           if (oil000I000l1 == null) {
/* 155 */                               oil000I000l1 = null;
                                        break;
                                    }
/* 131 */                           OI10I1IoI0Ol oI10I1IoI0Ol = oil000I000l1.I0000O.I00iOIl;
/* 139 */                           if (oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I001i1O0Ol) || oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I001IO000)) {
                                        break;
                                    } else {
/* 150 */                               oil000I000l1 = oil000I000l1.I000l1();
                                    }
                                }
/* 156 */                       if (oil000I000l1 == null) {
/* 231 */                           z = false;
/* 232 */                           if (z) {
/* 234 */                               IIloOI iIloOII00000oIO = lO1i11Ol01.I00000oIO();
/* 238 */                               IiIill0O0li1 iiIill0O0li1I0001Ioi1lo = oil0002.I0001Ioi1lo();
/* 242 */                               if (iiIill0O0li1I0001Ioi1lo == null) {
/* 248 */                                   Iollol0oI iollol0oI = (Iollol0oI) o0iiOioolIi2.I010101Oo1lO.I00iio;
/* 255 */                                   oOo0IOI00000oIO = l0o0IlOil1.I0000Il00O(iollol0oI).I00IoiI(iollol0oI, false);
                                        } else {
/* 262 */                                   O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1I0001Ioi1lo).I00iOIl;
/* 268 */                                   Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oiioi1IoIIli.I00000oOI);
/* 285 */                                   oOo0IOI00000oIO = lO1OiIiIo0oi.I00000oIO(o1ooOo, (objI000II == null ? null : objI000II) != null, false);
                                        }
/* 293 */                               iIloOII00000oIO.I00OI1(ioooOioll1.I00000oOI(oOo0IOI00000oIO));
                                        int size = listI000OOo1O.size() - 1;
/* 304 */                               while (-1 < size) {
/* 320 */                                   if (!((Boolean) function12.invoke(listI000OOo1O.get(size))).booleanValue()) {
/* 336 */                                       I00000oOI(lO1i11Ol01.I00000oIO(), iIloOII00000oIO, oI0l1oli1I, oil0003, (Oil000) listI000OOo1O.get(size), function12);
                                            }
                                            size--;
/* 341 */                                   oil0003 = oil000;
                                        }
                                    } else {
                                        int size2 = listI000OOo1O.size() - 1;
/* 352 */                               while (-1 < size2) {
/* 368 */                                   if (!((Boolean) function12.invoke(listI000OOo1O.get(size2))).booleanValue()) {
/* 387 */                                       I0000O(iIloOI, iIloOI3, oI0l1oli1I, oil000, (Oil000) listI000OOo1O.get(size2), function12);
                                            }
                                            size2--;
/* 392 */                                   iIloOI3 = iIloOI2;
/* 394 */                                   function12 = function1;
                                        }
                                    }
                                } else {
/* 158 */                           OIIlIII0Ili oIIlIII0IliI0000O2 = oil0002.I0000O();
/* 162 */                           if (oIIlIII0IliI0000O2 == null) {
/* 177 */                               oIIlIII0IliI0000O2 = null;
/* 178 */                               oIIlIII0IliI0000O = oil000I000l1.I0000O();
/* 182 */                               if (oIIlIII0IliI0000O == null) {
/* 197 */                                   oIIlIII0IliI0000O = null;
/* 198 */                                   if (oIIlIII0IliI0000O2 == null && oIIlIII0IliI0000O != null) {
/* 204 */                                       OOo0IO oOo0IOI00IoiI = oIIlIII0IliI0000O.I00IoiI(oIIlIII0IliI0000O2, false);
                                                z = !oOo0IOI00IoiI.equals(oOo0IOI00IoiI.I0001Ioi1lo(lIl0looO.I00000oIO(0L, l000O1l.I00000oOI(oIIlIII0IliI0000O.I00iiO))));
                                            }
/* 232 */                                   if (z) {
                                            }
                                        } else {
/* 190 */                                   if (!oIIlIII0IliI0000O.I0110OiO().I00lll10) {
/* 193 */                                       oIIlIII0IliI0000O = null;
                                            }
/* 194 */                                   if (oIIlIII0IliI0000O == null) {
                                            }
/* 198 */                                   if (oIIlIII0IliI0000O2 == null) {
/* 231 */                                       z = false;
/* 232 */                                       if (z) {
                                                }
                                            }
                                        }
                                    } else {
/* 170 */                               if (!oIIlIII0IliI0000O2.I0110OiO().I00lll10) {
/* 173 */                                   oIIlIII0IliI0000O2 = null;
                                        }
/* 174 */                               if (oIIlIII0IliI0000O2 == null) {
                                        }
/* 178 */                               oIIlIII0IliI0000O = oil000I000l1.I0000O();
/* 182 */                               if (oIIlIII0IliI0000O == null) {
                                        }
                                    }
                                }
                            }
/* 401 */                   if (I0001Ioi1lo(oil0002)) {
/* 425 */                       region2.op(iooO1IOloI00000oOI.I00000oIO, iooO1IOloI00000oOI.I00000oOI, iooO1IOloI00000oOI.I0000Il00O, iooO1IOloI00000oOI.I0000O, Region.Op.DIFFERENCE);
                            }
                        }
                    }
                }

                public static final boolean I0000oI00(Oil000 oil000) {
/* 1 */             OIIlIII0Ili oIIlIII0IliI0000O = oil000.I0000O();
/* 7 */             OI10I1IoI0Ol oI10I1IoI0Ol = oil000.I0000O.I00iOIl;
                    return (oIIlIII0IliI0000O != null ? oIIlIII0IliI0000O.I011iIOio() : false) || oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I00100o1O0lo) || oI10I1IoI0Ol.I0000Il00O(Oil0I1O.I00100l0);
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I0001Ioi1lo(Oil000 oil000) {
/* 6 */             if (!I0000oI00(oil000)) {
/* 9 */                 OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 13 */                if (oiioiIIlooo.I00iiO) {
/* 80 */                    return true;
                        }
/* 16 */                OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 18 */                Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 20 */                Object[] objArr2 = oI10I1IoI0Ol.I0000Il00O;
/* 22 */                long[] jArr = oI10I1IoI0Ol.I00000oIO;
                        int length = jArr.length - 2;
/* 27 */                if (length >= 0) {
/* 29 */                    int i = 0;
                            while (true) {
/* 30 */                        long j = jArr[i];
/* 44 */                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 53 */                            int i2 = 8 - ((~(i - length)) >>> 31);
/* 56 */                            for (int i3 = 0; i3 < i2; i3++) {
/* 65 */                                if ((255 & j) < 128) {
/* 69 */                                    int i4 = (i << 3) + i3;
/* 70 */                                    Object obj = objArr[i4];
/* 72 */                                    Object obj2 = objArr2[i4];
/* 78 */                                    if (((Oil0IoooOio) obj).I0000Il00O) {
/* 80 */                                        return true;
                                            }
                                        }
/* 82 */                                j >>= 8;
                                    }
/* 86 */                            if (i2 != 8) {
                                        break;
                                    }
/* 88 */                            if (i == length) {
                                        break;
                                    }
/* 90 */                            i++;
                                }
                            }
                        }
                    }
/* 5 */             return false;
                }
            }

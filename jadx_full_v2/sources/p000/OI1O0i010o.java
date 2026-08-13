            package p000;

            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class OI1O0i010o extends OlliIl0 {
                public ArrayList I0001Ioi1lo;
                public HashMap I000II;
                public String I000O01llI0;

                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) {
/* 1 */             ioiOloi.I00OIl();
/* 4 */             int iI00OIl = ioiOloi.I00OIl();
/* 8 */             ioiOloi.I00OIl();
/* 16 */            this.I0001Ioi1lo = new ArrayList(iI00OIl);
/* 20 */            for (int i = 0; i < iI00OIl; i++) {
/* 24 */                OI1Il1Io1Io1 oI1Il1Io1Io1 = new OI1Il1Io1Io1();
/* 31 */                oI1Il1Io1Io1.I00000oIO = ioiOloi.I00OIl();
/* 37 */                oI1Il1Io1Io1.I00000oOI = ioiOloi.I00OIl();
/* 43 */                oI1Il1Io1Io1.I0000Il00O = ioiOloi.I00OIl();
/* 49 */                oI1Il1Io1Io1.I0000O = ioiOloi.I00OIl();
/* 55 */                oI1Il1Io1Io1.I0000oI00 = ioiOloi.I00OIl();
/* 61 */                oI1Il1Io1Io1.I0001Ioi1lo = ioiOloi.I00OIl();
/* 65 */                this.I0001Ioi1lo.add(oI1Il1Io1Io1);
                    }
/* 73 */            Iterator it = this.I0001Ioi1lo.iterator();
/* 84 */            while (it.hasNext()) {
/* 90 */                OI1Il1Io1Io1 oI1Il1Io1Io12 = (OI1Il1Io1Io1) it.next();
/* 92 */                long j = oI1Il1Io1Io12.I0001Ioi1lo;
/* 99 */                if (j > this.I0000Il00O) {
/* 102 */                   oI1Il1Io1Io12.I000II = null;
                        } else {
/* 115 */                   ioiOloi.I00Ol00(this.I00000oOI + 6 + (iI00OIl * 12) + j);
/* 118 */                   int i2 = oI1Il1Io1Io12.I00000oIO;
/* 120 */                   int i3 = oI1Il1Io1Io12.I00000oOI;
/* 122 */                   Charset charset = IO1IOO01oiO.I00000oIO;
/* 124 */                   if ((i2 == 3 && (i3 == 0 || i3 == 1)) || i2 == 0) {
/* 135 */                       charset = IO1IOO01oiO.I00000oOI;
                            } else if (i2 == 2) {
/* 140 */                       if (i3 == 0) {
/* 148 */                           charset = IO1IOO01oiO.I0000O;
                                } else if (i3 == 1) {
/* 145 */                           charset = IO1IOO01oiO.I0000oI00;
                                }
                            }
/* 156 */                   oI1Il1Io1Io12.I000II = ioiOloi.I00Io1lO(oI1Il1Io1Io12.I0000oI00, charset);
                        }
                    }
/* 170 */           this.I000II = new HashMap(this.I0001Ioi1lo.size());
/* 174 */           Iterator it2 = this.I0001Ioi1lo.iterator();
/* 182 */           while (it2.hasNext()) {
/* 188 */               OI1Il1Io1Io1 oI1Il1Io1Io13 = (OI1Il1Io1Io1) it2.next();
/* 202 */               Map map = (Map) this.I000II.get(Integer.valueOf(oI1Il1Io1Io13.I0000O));
/* 204 */               if (map == null) {
/* 208 */                   map = new HashMap();
/* 219 */                   this.I000II.put(Integer.valueOf(oI1Il1Io1Io13.I0000O), map);
                        }
/* 232 */               Map map2 = (Map) map.get(Integer.valueOf(oI1Il1Io1Io13.I00000oIO));
/* 234 */               if (map2 == null) {
/* 238 */                   map2 = new HashMap();
/* 247 */                   map.put(Integer.valueOf(oI1Il1Io1Io13.I00000oIO), map2);
                        }
/* 260 */               Map map3 = (Map) map2.get(Integer.valueOf(oI1Il1Io1Io13.I00000oOI));
/* 262 */               if (map3 == null) {
/* 266 */                   map3 = new HashMap();
/* 275 */                   map2.put(Integer.valueOf(oI1Il1Io1Io13.I00000oOI), map3);
                        }
/* 286 */               map3.put(Integer.valueOf(oI1Il1Io1Io13.I0000Il00O), oI1Il1Io1Io13.I000II);
                    }
/* 290 */           int i4 = 4;
/* 291 */           int i5 = 4;
                    while (true) {
/* 294 */               if (i5 >= 0) {
/* 300 */                   if (I00000oOI(1, 0, i5, 0) != null) {
                                break;
                            } else {
                                i5--;
                            }
                        } else if (I00000oOI(1, 3, 1, 1033) == null) {
/* 313 */                   I00000oOI(1, 1, 0, 0);
                        }
                    }
                    while (true) {
/* 316 */               if (i4 >= 0) {
/* 322 */                   if (I00000oOI(2, 0, i4, 0) != null) {
                                break;
                            } else {
                                i4--;
                            }
                        } else if (I00000oOI(2, 3, 1, 1033) == null) {
/* 335 */                   I00000oOI(2, 1, 0, 0);
                        }
                    }
/* 339 */           String strI00000oOI = I00000oOI(6, 1, 0, 0);
/* 343 */           this.I000O01llI0 = strI00000oOI;
/* 345 */           if (strI00000oOI == null) {
/* 347 */               strI00000oOI = I00000oOI(6, 3, 1, 1033);
/* 351 */               this.I000O01llI0 = strI00000oOI;
                    }
/* 353 */           if (strI00000oOI != null) {
/* 359 */               this.I000O01llI0 = strI00000oOI.trim();
                    }
/* 361 */           this.I0000O = true;
                }

                public final String I00000oOI(int i, int i2, int i3, int i4) {
                    Map map;
                    Map map2;
/* 11 */            Map map3 = (Map) this.I000II.get(Integer.valueOf(i));
/* 13 */            if (map3 == null || (map = (Map) map3.get(Integer.valueOf(i2))) == null || (map2 = (Map) map.get(Integer.valueOf(i3))) == null) {
/* 41 */                return null;
                    }
/* 51 */            return (String) map2.get(Integer.valueOf(i4));
                }
            }

            package p000;
            
            public abstract class lO0oOIoolo {
                public static final void I00000oIO(OI10I1IoI0Ol oI10I1IoI0Ol, Object obj, Object obj2) {
/* 1 */             int iI0001Ioi1lo = oI10I1IoI0Ol.I0001Ioi1lo(obj);
/* 9 */             boolean z = iI0001Ioi1lo < 0;
/* 16 */            Object obj3 = z ? null : oI10I1IoI0Ol.I0000Il00O[iI0001Ioi1lo];
/* 18 */            if (obj3 != null) {
/* 23 */                if (obj3 instanceof OI10IIO) {
/* 28 */                    ((OI10IIO) obj3).I00000oIO(obj2);
                        } else if (obj3 != obj2) {
/* 36 */                    OI10IIO oi10iio = new OI10IIO();
/* 39 */                    oi10iio.I00000oIO(obj3);
/* 42 */                    oi10iio.I00000oIO(obj2);
/* 45 */                    obj2 = oi10iio;
                        }
/* 47 */                obj2 = obj3;
                    }
/* 48 */            if (!z) {
/* 62 */                oI10I1IoI0Ol.I0000Il00O[iI0001Ioi1lo] = obj2;
/* 98 */                return;
                    }
/* 50 */            int i = ~iI0001Ioi1lo;
/* 53 */            oI10I1IoI0Ol.I00000oOI[i] = obj;
/* 57 */            oI10I1IoI0Ol.I0000Il00O[i] = obj2;
                }

                public static OI10I1IoI0Ol I00000oOI() {
/* 1 */             long[] jArr = OiO10oio.I00000oIO;
/* 5 */             return new OI10I1IoI0Ol();
                }

                public static final boolean I0000Il00O(OI10I1IoI0Ol oI10I1IoI0Ol, Object obj, Object obj2) {
/* 1 */             Object objI000II = oI10I1IoI0Ol.I000II(obj);
/* 6 */             if (objI000II == null) {
/* 5 */                 return false;
                    }
/* 11 */            if (!(objI000II instanceof OI10IIO)) {
/* 35 */                if (!objI000II.equals(obj2)) {
/* 5 */                     return false;
                        }
/* 37 */                oI10I1IoI0Ol.I000iOII(obj);
/* 40 */                return true;
                    }
/* 13 */            OI10IIO oi10iio = (OI10IIO) objI000II;
/* 15 */            boolean zI000l1 = oi10iio.I000l1(obj2);
/* 19 */            if (zI000l1 && oi10iio.I000II()) {
/* 27 */                oI10I1IoI0Ol.I000iOII(obj);
                    }
/* 30 */            return zI000l1;
                }

                public static final void I0000O(OI10I1IoI0Ol oI10I1IoI0Ol, Object obj) {
                    boolean zI000II;
/* 1 */             long[] jArr = oI10I1IoI0Ol.I00000oIO;
                    int length = jArr.length - 2;
/* 6 */             if (length < 0) {
/* 106 */               return;
                    }
/* 9 */             int i = 0;
                    while (true) {
/* 10 */                long j = jArr[i];
/* 24 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 33 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 36 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 45 */                        if ((255 & j) < 128) {
/* 49 */                            int i4 = (i << 3) + i3;
/* 52 */                            Object obj2 = oI10I1IoI0Ol.I00000oOI[i4];
/* 56 */                            Object obj3 = oI10I1IoI0Ol.I0000Il00O[i4];
/* 60 */                            if (obj3 instanceof OI10IIO) {
/* 62 */                                OI10IIO oi10iio = (OI10IIO) obj3;
/* 64 */                                oi10iio.I000l1(obj);
/* 67 */                                zI000II = oi10iio.I000II();
                                    } else {
/* 76 */                                zI000II = obj3 == obj;
                                    }
/* 77 */                            if (zI000II) {
/* 79 */                                oI10I1IoI0Ol.I000l1(i4);
                                    }
                                }
/* 82 */                        j >>= 8;
                            }
/* 86 */                    if (i2 != 8) {
/* 106 */                       return;
                            }
                        }
/* 88 */                if (i == length) {
/* 106 */                   return;
                        } else {
/* 90 */                    i++;
                        }
                    }
                }
            }

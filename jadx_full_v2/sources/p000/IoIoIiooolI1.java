            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.regex.Pattern;
            import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
            
            public abstract class IoIoIiooolI1 {
                static {
/* 14 */            new IIOIIi1ilIO("\"\\".getBytes(IO1IOI.I00000oIO)).I00iiO = "\"\\";
/* 29 */            new IIOIIi1ilIO("\t ,=".getBytes(IO1IOI.I00000oIO)).I00iiO = "\t ,=";
                }

                public static final boolean I00000oIO(Oi1001l0Il oi1001l0Il) {
/* 13 */            if (O0000Ioio00.I0000O((String) oi1001l0Il.I00iOIl.I00iiO, "HEAD")) {
/* 65 */                return false;
                    }
/* 16 */            int i = oi1001l0Il.I00iio;
/* 20 */            if (((i < 100 || i >= 200) && i != 204 && i != 304) || OollIoI001lo.I000OiO(oi1001l0Il) != -1) {
/* 67 */                return true;
                    }
/* 49 */            String strI00000oOI = oi1001l0Il.I00ilO0.I00000oOI("Transfer-Encoding");
/* 53 */            if (strI00000oOI == null) {
/* 55 */                strI00000oOI = null;
                    }
                    return "chunked".equalsIgnoreCase(strI00000oOI);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oOI(o0llIi o0llii, IoOi01OlIl1o ioOi01OlIl1o, Io1Io0OOi011 io1Io0OOi011) {
                    int i;
                    IOoll0l1oOO iOoll0l1oOO;
                    IoOi01OlIl1o ioOi01OlIl1o2;
                    long j;
                    String strSubstring;
/* 7 */             if (o0llii == o0llIi.I00iiO) {
/* 9 */                 return;
                    }
/* 10 */            Pattern pattern = IOoll0l1oOO.I000OiO;
/* 12 */            int size = io1Io0OOi011.size();
/* 16 */            int i2 = 0;
/* 18 */            ArrayList arrayList = null;
/* 19 */            for (int i3 = 0; i3 < size; i3++) {
/* 31 */                if ("Set-Cookie".equalsIgnoreCase(io1Io0OOi011.I0000O(i3))) {
/* 33 */                    if (arrayList == null) {
/* 38 */                        arrayList = new ArrayList(2);
                            }
/* 45 */                    arrayList.add(io1Io0OOi011.I000OiO(i3));
                        }
                    }
/* 51 */            List listUnmodifiableList = Il01100l.I00iOIl;
/* 61 */            List listUnmodifiableList2 = arrayList != null ? Collections.unmodifiableList(arrayList) : listUnmodifiableList;
/* 62 */            int size2 = listUnmodifiableList2.size();
/* 66 */            int i4 = 0;
/* 67 */            ArrayList arrayList2 = null;
/* 68 */            while (i4 < size2) {
/* 75 */                String str = (String) listUnmodifiableList2.get(i4);
/* 77 */                long jCurrentTimeMillis = System.currentTimeMillis();
/* 81 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 87 */                char c = ';';
/* 89 */                int iI000II = OollIoI001lo.I000II(str, ';', i2, str.length());
/* 93 */                char c2 = '=';
/* 95 */                int iI000II2 = OollIoI001lo.I000II(str, '=', i2, iI000II);
/* 99 */                if (iI000II2 == iI000II) {
/* 151 */                   i = i2;
/* 152 */                   iOoll0l1oOO = null;
                        } else {
/* 102 */                   int iI000lI = OollIoI001lo.I000lI(i2, iI000II2, str);
/* 110 */                   String strSubstring2 = str.substring(iI000lI, OollIoI001lo.I000o00OoI0I(iI000lI, iI000II2, str));
/* 118 */                   if (strSubstring2.length() != 0 && OollIoI001lo.I000l1(strSubstring2) == -1) {
/* 131 */                       int iI000lI2 = OollIoI001lo.I000lI(iI000II2 + 1, iI000II, str);
/* 139 */                       String strSubstring3 = str.substring(iI000lI2, OollIoI001lo.I000o00OoI0I(iI000lI2, iI000II, str));
/* 147 */                       if (OollIoI001lo.I000l1(strSubstring3) == -1) {
/* 155 */                           int i5 = iI000II + 1;
/* 157 */                           int length = str.length();
/* 168 */                           int i6 = i2;
/* 170 */                           int i7 = i6;
/* 172 */                           int i8 = i7;
/* 174 */                           long j2 = -1;
/* 176 */                           long jI00000oOI = 253402300799999L;
/* 180 */                           String str2 = null;
/* 181 */                           String str3 = null;
/* 183 */                           boolean z = true;
                                    while (true) {
/* 192 */                               if (i5 < length) {
/* 194 */                                   int iI000II3 = OollIoI001lo.I000II(str, c, i5, length);
/* 198 */                                   int iI000II4 = OollIoI001lo.I000II(str, c2, i5, iI000II3);
/* 202 */                                   int iI000lI3 = OollIoI001lo.I000lI(i5, iI000II4, str);
/* 210 */                                   String strSubstring4 = str.substring(iI000lI3, OollIoI001lo.I000o00OoI0I(iI000lI3, iI000II4, str));
/* 214 */                                   if (iI000II4 < iI000II3) {
/* 218 */                                       int iI000lI4 = OollIoI001lo.I000lI(iI000II4 + 1, iI000II3, str);
/* 226 */                                       strSubstring = str.substring(iI000lI4, OollIoI001lo.I000o00OoI0I(iI000lI4, iI000II3, str));
                                            } else {
/* 231 */                                       strSubstring = "";
                                            }
/* 239 */                                   if (strSubstring4.equalsIgnoreCase("expires")) {
                                                try {
/* 245 */                                           jI00000oOI = iioiIiIlo.I00000oOI(strSubstring.length(), strSubstring);
/* 249 */                                           i7 = 1;
                                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                                }
                                            } else if (strSubstring4.equalsIgnoreCase("max-age")) {
                                                try {
/* 261 */                                           long j3 = Long.parseLong(strSubstring);
/* 274 */                                           j2 = j3 <= 0 ? Long.MIN_VALUE : j3;
                                                } catch (NumberFormatException e) {
/* 292 */                                           if (!Pattern.compile("-?\\d+").matcher(strSubstring).matches()) {
/* 308 */                                               throw e;
                                                    }
/* 301 */                                           j2 = OlOolloIIOl0.I000l1(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                                }
/* 249 */                                       i7 = 1;
                                            } else if (strSubstring4.equalsIgnoreCase("domain")) {
/* 324 */                                       if (OlOolloIIOl0.I000II(strSubstring, ".", false)) {
/* 353 */                                           throw new IllegalArgumentException("Failed requirement.");
                                                }
/* 330 */                                       String strI00000oOI = iloo10Oil.I00000oOI(OlOoOIi0o.I00IOO(".", strSubstring));
/* 334 */                                       if (strI00000oOI == null) {
/* 345 */                                           throw new IllegalArgumentException();
                                                }
/* 336 */                                       str2 = strI00000oOI;
/* 337 */                                       z = false;
                                            } else if (strSubstring4.equalsIgnoreCase("path")) {
/* 362 */                                       str3 = strSubstring;
                                            } else if (strSubstring4.equalsIgnoreCase("secure")) {
/* 373 */                                       i8 = 1;
                                            } else if (strSubstring4.equalsIgnoreCase("httponly")) {
/* 384 */                                       i6 = 1;
                                            }
/* 386 */                                   i5 = iI000II3 + 1;
/* 389 */                                   c = ';';
/* 391 */                                   c2 = '=';
                                        } else {
/* 397 */                                   if (j2 == Long.MIN_VALUE) {
/* 399 */                                       ioOi01OlIl1o2 = ioOi01OlIl1o;
/* 401 */                                       j = Long.MIN_VALUE;
                                            } else if (j2 != -1) {
/* 421 */                                       long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
/* 425 */                                       if (j4 < jCurrentTimeMillis || j4 > 253402300799999L) {
/* 437 */                                           ioOi01OlIl1o2 = ioOi01OlIl1o;
/* 439 */                                           j = 253402300799999L;
                                                } else {
/* 432 */                                           ioOi01OlIl1o2 = ioOi01OlIl1o;
/* 434 */                                           j = j4;
                                                }
                                            } else {
/* 442 */                                       ioOi01OlIl1o2 = ioOi01OlIl1o;
/* 444 */                                       j = jI00000oOI;
                                            }
/* 446 */                                   String str4 = ioOi01OlIl1o2.I0000O;
/* 448 */                                   if (str2 == null) {
/* 450 */                                       str2 = str4;
                                            } else if (!O0000Ioio00.I0000O(str4, str2) && (!OlOolloIIOl0.I000II(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || OollIoI001lo.I0001Ioi1lo.I0000O(str4))) {
/* 583 */                                       i = 0;
                                            }
/* 501 */                                   if (str4.length() == str2.length() || PublicSuffixDatabase.I000II.I00000oIO(str2) != null) {
/* 516 */                                       String strSubstring5 = str3;
/* 518 */                                       i = 0;
/* 519 */                                       if (strSubstring5 == null || !OlOolloIIOl0.I000l1(strSubstring5, "/", false)) {
/* 527 */                                           String strI00000oOI2 = ioOi01OlIl1o2.I00000oOI();
/* 534 */                                           int iI001lllioOl = OlOoOIi0o.I001lllioOl(strI00000oOI2, '/', 0, 6);
/* 540 */                                           strSubstring5 = iI001lllioOl != 0 ? strI00000oOI2.substring(0, iI001lllioOl) : "/";
                                                }
/* 550 */                                       iOoll0l1oOO = new IOoll0l1oOO();
/* 553 */                                       iOoll0l1oOO.I00000oIO = strSubstring2;
/* 555 */                                       iOoll0l1oOO.I00000oOI = strSubstring3;
/* 557 */                                       iOoll0l1oOO.I0000Il00O = j;
/* 559 */                                       iOoll0l1oOO.I0000O = str2;
/* 561 */                                       iOoll0l1oOO.I0000oI00 = strSubstring5;
/* 565 */                                       iOoll0l1oOO.I0001Ioi1lo = i8;
/* 569 */                                       iOoll0l1oOO.I000II = i6;
/* 573 */                                       iOoll0l1oOO.I000O01llI0 = i7;
/* 577 */                                       iOoll0l1oOO.I000OOo1O = z;
/* 579 */                                       VarHandle.storeStoreFence();
                                            } else {
/* 511 */                                       iOoll0l1oOO = null;
/* 512 */                                       i = 0;
                                            }
                                        }
                                    }
                                }
/* 152 */                       iOoll0l1oOO = null;
                            }
                        }
/* 586 */               if (iOoll0l1oOO != null) {
/* 589 */                   if (arrayList2 == null) {
/* 593 */                       arrayList2 = new ArrayList();
                            }
/* 597 */                   arrayList2.add(iOoll0l1oOO);
                        }
/* 600 */               i4++;
/* 602 */               i2 = i;
                    }
/* 605 */           if (arrayList2 != null) {
/* 607 */               listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                    }
/* 611 */           listUnmodifiableList.isEmpty();
                }
            }

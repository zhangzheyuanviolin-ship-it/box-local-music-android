            package p000;

            import java.io.EOFException;
            import java.util.ArrayList;
            
            public abstract class I0000oI00 {
                public static final IIOIIi1ilIO I00000oIO;
                public static final IIOIIi1ilIO I00000oOI;
                public static final IIOIIi1ilIO I0000Il00O;
                public static final IIOIIi1ilIO I0000O;
                public static final IIOIIi1ilIO I0000oI00;

                static {
/* 11 */            IIOIIi1ilIO iIOIIi1ilIO = new IIOIIi1ilIO("/".getBytes(IO1IOI.I00000oIO));
/* 14 */            iIOIIi1ilIO.I00iiO = "/";
/* 16 */            I00000oIO = iIOIIi1ilIO;
/* 28 */            IIOIIi1ilIO iIOIIi1ilIO2 = new IIOIIi1ilIO("\\".getBytes(IO1IOI.I00000oIO));
/* 31 */            iIOIIi1ilIO2.I00iiO = "\\";
/* 33 */            I00000oOI = iIOIIi1ilIO2;
/* 45 */            IIOIIi1ilIO iIOIIi1ilIO3 = new IIOIIi1ilIO("/\\".getBytes(IO1IOI.I00000oIO));
/* 48 */            iIOIIi1ilIO3.I00iiO = "/\\";
/* 50 */            I0000Il00O = iIOIIi1ilIO3;
/* 62 */            IIOIIi1ilIO iIOIIi1ilIO4 = new IIOIIi1ilIO(".".getBytes(IO1IOI.I00000oIO));
/* 65 */            iIOIIi1ilIO4.I00iiO = ".";
/* 67 */            I0000O = iIOIIi1ilIO4;
/* 79 */            IIOIIi1ilIO iIOIIi1ilIO5 = new IIOIIi1ilIO("..".getBytes(IO1IOI.I00000oIO));
/* 82 */            iIOIIi1ilIO5.I00iiO = "..";
/* 84 */            I0000oI00 = iIOIIi1ilIO5;
                }

                public static final OO0IIO1Il I00000oIO(OO0IIO1Il oO0IIO1Il, OO0IIO1Il oO0IIO1Il2, boolean z) {
/* 6 */             if (I0000Il00O(oO0IIO1Il2) != -1 || oO0IIO1Il2.I0000oI00() != null) {
/* 15 */                return oO0IIO1Il2;
                    }
/* 16 */            IIOIIi1ilIO iIOIIi1ilIOI00000oOI = I00000oOI(oO0IIO1Il);
/* 20 */            if (iIOIIi1ilIOI00000oOI == null && (iIOIIi1ilIOI00000oOI = I00000oOI(oO0IIO1Il2)) == null) {
/* 30 */                iIOIIi1ilIOI00000oOI = I0001Ioi1lo(OO0IIO1Il.I00iiI);
                    }
/* 36 */            III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 41 */            iII1o0lOio0.I00l0I0l0lO1(oO0IIO1Il.I00iOIl);
/* 50 */            if (iII1o0lOio0.I00iiI > 0) {
/* 52 */                iII1o0lOio0.I00l0I0l0lO1(iIOIIi1ilIOI00000oOI);
                    }
/* 57 */            iII1o0lOio0.I00l0I0l0lO1(oO0IIO1Il2.I00iOIl);
/* 60 */            return I0000O(iII1o0lOio0, z);
                }

                public static final IIOIIi1ilIO I00000oOI(OO0IIO1Il oO0IIO1Il) {
/* 1 */             IIOIIi1ilIO iIOIIi1ilIO = oO0IIO1Il.I00iOIl;
/* 3 */             IIOIIi1ilIO iIOIIi1ilIO2 = I00000oIO;
/* 10 */            if (IIOIIi1ilIO.I0000oI00(iIOIIi1ilIO, iIOIIi1ilIO2) != -1) {
/* 12 */                return iIOIIi1ilIO2;
                    }
/* 13 */            IIOIIi1ilIO iIOIIi1ilIO3 = oO0IIO1Il.I00iOIl;
/* 15 */            IIOIIi1ilIO iIOIIi1ilIO4 = I00000oOI;
/* 21 */            if (IIOIIi1ilIO.I0000oI00(iIOIIi1ilIO3, iIOIIi1ilIO4) != -1) {
/* 23 */                return iIOIIi1ilIO4;
                    }
/* 24 */            return null;
                }

                public static final int I0000Il00O(OO0IIO1Il oO0IIO1Il) {
/* 1 */             IIOIIi1ilIO iIOIIi1ilIO = oO0IIO1Il.I00iOIl;
/* 8 */             if (iIOIIi1ilIO.I00000oOI() != 0) {
/* 19 */                if (iIOIIi1ilIO.I000II(0) != 47) {
/* 29 */                    if (iIOIIi1ilIO.I000II(0) == 92) {
/* 35 */                        if (iIOIIi1ilIO.I00000oOI() > 2 && iIOIIi1ilIO.I000II(1) == 92) {
/* 49 */                            int iI0000O = iIOIIi1ilIO.I0000O(2, I00000oOI.I0001Ioi1lo());
                                    return iI0000O == -1 ? iIOIIi1ilIO.I00000oOI() : iI0000O;
                                }
                            } else if (iIOIIi1ilIO.I00000oOI() > 2 && iIOIIi1ilIO.I000II(1) == 58 && iIOIIi1ilIO.I000II(2) == 92) {
/* 86 */                        char cI000II = (char) iIOIIi1ilIO.I000II(0);
/* 89 */                        if ('a' <= cI000II && cI000II < '{') {
/* 104 */                           return 3;
                                }
/* 98 */                        if ('A' <= cI000II && cI000II < '[') {
/* 104 */                           return 3;
                                }
                            }
                        }
/* 18 */                return 1;
                    }
/* 7 */             return -1;
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0112 A[EDGE_INSN: B:98:0x0112->B:81:0x0112 BREAK  A[LOOP:1: B:53:0x00ad->B:112:0x00ad], SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OO0IIO1Il I0000O(III1o0lOio0 iII1o0lOio0, boolean z) throws EOFException {
                    IIOIIi1ilIO iIOIIi1ilIO;
                    long j;
                    char cI000O01llI0;
                    boolean zI00II0Ol1O0l;
                    IIOIIi1ilIO iIOIIi1ilIO2;
                    int size;
                    int i;
                    IIOIIi1ilIO iIOIIi1ilIOI00IOO;
/* 5 */             III1o0lOio0 iII1o0lOio02 = new III1o0lOio0();
/* 8 */             IIOIIi1ilIO iIOIIi1ilIOI0000oI00 = null;
/* 9 */             int i2 = 0;
                    while (true) {
/* 10 */                IIOIIi1ilIO iIOIIi1ilIO3 = I00000oIO;
/* 22 */                if (!iII1o0lOio0.I001i1lo1io(0L, iIOIIi1ilIO3, iIOIIi1ilIO3.I00000oOI())) {
/* 24 */                    iIOIIi1ilIO = I00000oOI;
/* 34 */                    if (!iII1o0lOio0.I001i1lo1io(0L, iIOIIi1ilIO, iIOIIi1ilIO.I00000oOI())) {
                                break;
                            }
                        }
/* 320 */               byte b = iII1o0lOio0.readByte();
/* 324 */               if (iIOIIi1ilIOI0000oI00 == null) {
/* 326 */                   iIOIIi1ilIOI0000oI00 = I0000oI00(b);
                        }
/* 330 */               i2++;
                    }
/* 50 */            boolean z2 = i2 >= 2 && O0000Ioio00.I0000O(iIOIIi1ilIOI0000oI00, iIOIIi1ilIO);
/* 53 */            IIOIIi1ilIO iIOIIi1ilIO4 = I0000Il00O;
/* 55 */            if (z2) {
/* 57 */                iII1o0lOio02.I00l0I0l0lO1(iIOIIi1ilIOI0000oI00);
/* 60 */                iII1o0lOio02.I00l0I0l0lO1(iIOIIi1ilIOI0000oI00);
                    } else {
/* 64 */                if (i2 <= 0) {
/* 71 */                    long jI00100l0 = iII1o0lOio0.I00100l0(iIOIIi1ilIO4, 0L);
/* 75 */                    if (iIOIIi1ilIOI0000oI00 == null) {
/* 92 */                        iIOIIi1ilIOI0000oI00 = jI00100l0 == -1 ? I0001Ioi1lo(OO0IIO1Il.I00iiI) : I0000oI00(iII1o0lOio0.I000O01llI0(jI00100l0));
                            }
/* 100 */                   if (O0000Ioio00.I0000O(iIOIIi1ilIOI0000oI00, iIOIIi1ilIO) && iII1o0lOio0.I00iiI >= 2) {
/* 113 */                       j = -1;
/* 122 */                       if (iII1o0lOio0.I000O01llI0(1L) == 58 && (('a' <= (cI000O01llI0 = (char) iII1o0lOio0.I000O01llI0(0L)) && cI000O01llI0 < '{') || ('A' <= cI000O01llI0 && cI000O01llI0 < '['))) {
/* 149 */                           if (jI00100l0 == 2) {
/* 153 */                               iII1o0lOio02.write(iII1o0lOio0, 3L);
                                    } else {
/* 157 */                               iII1o0lOio02.write(iII1o0lOio0, 2L);
                                    }
                                }
                            }
/* 168 */                   boolean z3 = iII1o0lOio02.I00iiI <= 0;
/* 171 */                   ArrayList arrayList = new ArrayList();
                            while (true) {
/* 174 */                       zI00II0Ol1O0l = iII1o0lOio0.I00II0Ol1O0l();
/* 178 */                       iIOIIi1ilIO2 = I0000O;
/* 180 */                       if (!zI00II0Ol1O0l) {
                                    break;
                                }
/* 182 */                       long jI00100l02 = iII1o0lOio0.I00100l0(iIOIIi1ilIO4, 0L);
/* 188 */                       if (jI00100l02 == j) {
/* 192 */                           iIOIIi1ilIOI00IOO = iII1o0lOio0.I00IOO(iII1o0lOio0.I00iiI);
                                } else {
/* 197 */                           iIOIIi1ilIOI00IOO = iII1o0lOio0.I00IOO(jI00100l02);
/* 201 */                           iII1o0lOio0.readByte();
                                }
/* 204 */                       IIOIIi1ilIO iIOIIi1ilIO5 = I0000oI00;
/* 210 */                       if (iIOIIi1ilIOI00IOO.equals(iIOIIi1ilIO5)) {
/* 212 */                           if (!z3 || !arrayList.isEmpty()) {
/* 220 */                               if (!z || (!z3 && (arrayList.isEmpty() || O0000Ioio00.I0000O(IOOi0Ool1i.I00Io1o110i(arrayList), iIOIIi1ilIO5)))) {
/* 253 */                                   arrayList.add(iIOIIi1ilIOI00IOO);
                                        } else if (!z2 || arrayList.size() != 1) {
/* 249 */                                   IOOii0O10Io0.I001IIilI0O(arrayList);
                                        }
                                    }
                                } else if (!iIOIIi1ilIOI00IOO.equals(iIOIIi1ilIO2) && !iIOIIi1ilIOI00IOO.equals(IIOIIi1ilIO.I00iio)) {
/* 271 */                           arrayList.add(iIOIIi1ilIOI00IOO);
                                }
                            }
/* 275 */                   size = arrayList.size();
/* 280 */                   for (i = 0; i < size; i++) {
/* 282 */                       if (i > 0) {
/* 284 */                           iII1o0lOio02.I00l0I0l0lO1(iIOIIi1ilIOI0000oI00);
                                }
/* 293 */                       iII1o0lOio02.I00l0I0l0lO1((IIOIIi1ilIO) arrayList.get(i));
                            }
/* 303 */                   if (iII1o0lOio02.I00iiI == 0) {
/* 305 */                       iII1o0lOio02.I00l0I0l0lO1(iIOIIi1ilIO2);
                            }
/* 316 */                   return new OO0IIO1Il(iII1o0lOio02.I00IOO(iII1o0lOio02.I00iiI));
                        }
/* 66 */                iII1o0lOio02.I00l0I0l0lO1(iIOIIi1ilIOI0000oI00);
                    }
/* 69 */            j = -1;
/* 168 */           if (iII1o0lOio02.I00iiI <= 0) {
                    }
/* 171 */           ArrayList arrayList2 = new ArrayList();
                    while (true) {
/* 174 */               zI00II0Ol1O0l = iII1o0lOio0.I00II0Ol1O0l();
/* 178 */               iIOIIi1ilIO2 = I0000O;
/* 180 */               if (!zI00II0Ol1O0l) {
                        }
                    }
/* 275 */           size = arrayList2.size();
/* 280 */           while (i < size) {
                    }
/* 303 */           if (iII1o0lOio02.I00iiI == 0) {
                    }
/* 316 */           return new OO0IIO1Il(iII1o0lOio02.I00IOO(iII1o0lOio02.I00iiI));
                }

                public static final IIOIIi1ilIO I0000oI00(byte b) {
/* 3 */             if (b == 47) {
/* 23 */                return I00000oIO;
                    }
/* 7 */             if (b == 92) {
/* 9 */                 return I00000oOI;
                    }
/* 18 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(b, "not a directory separator: "));
/* 21 */            return null;
                }

                public static final IIOIIi1ilIO I0001Ioi1lo(String str) {
/* 7 */             if (O0000Ioio00.I0000O(str, "/")) {
/* 9 */                 return I00000oIO;
                    }
/* 18 */            if (O0000Ioio00.I0000O(str, "\\")) {
/* 20 */                return I00000oOI;
                    }
/* 29 */            I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("not a directory separator: ", str));
/* 32 */            return null;
                }
            }

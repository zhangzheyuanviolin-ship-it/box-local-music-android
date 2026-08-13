            package p000;

            import java.io.EOFException;
            
            public abstract class lOO1Ill {
                /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static long I00000oIO(OlI1iil1l0 olI1iil1l0, byte b, long j, int i) {
                    long j2;
                    StringBuilder sbI001iOo1i0O;
                    String str;
                    Oii1O1l oii1O1l;
                    long j3;
                    long j4;
                    long j5;
/* 13 */            long j6 = (i & 4) != 0 ? Long.MAX_VALUE : j;
/* 15 */            long j7 = 0;
/* 19 */            if (0 > j6) {
/* 286 */               if (j6 < 0) {
/* 290 */                   j2 = 0;
/* 292 */                   sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(0L, "startIndex (", ") and endIndex (");
/* 296 */                   str = ") should be non negative";
                        } else {
/* 303 */                   j2 = 0;
/* 307 */                   sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(0L, "startIndex (", ") is not within the range [0..endIndex(");
/* 311 */                   str = "))";
                        }
/* 314 */               I000II.I0010I0i(IlIi0I0.I000o00OoI0I(sbI001iOo1i0O, j6, str));
/* 483 */               return j2;
                    }
/* 21 */            if (0 == j6) {
/* 23 */                return -1L;
                    }
/* 27 */            long j8 = 0;
/* 30 */            while (j8 < j6 && olI1iil1l0.I000lI(1 + j8)) {
/* 43 */                III1oo00i1li iII1oo00i1liI0000oI00 = olI1iil1l0.I0000oI00();
/* 59 */                long jMin = Math.min(Math.min(j6, olI1iil1l0.I0000oI00().I00iiO), iII1oo00i1liI0000oI00.I00iiO);
/* 65 */                iO1i0iI.I00000oIO(iII1oo00i1liI0000oI00.I00iiO, j8, jMin);
/* 70 */                if (j8 == jMin || (oii1O1l = iII1oo00i1liI0000oI00.I00iOIl) == null) {
/* 72 */                    j4 = j7;
/* 74 */                    j3 = -1;
/* 76 */                    j5 = -1;
                        } else {
/* 85 */                    j3 = -1;
/* 87 */                    long jI00000oIO = iII1oo00i1liI0000oI00.I00iiO;
/* 93 */                    String str2 = "Check failed.";
/* 95 */                    j4 = j7;
/* 97 */                    if (jI00000oIO - j8 < j8) {
/* 99 */                        Oii1O1l oii1O1l2 = iII1oo00i1liI0000oI00.I00iiI;
/* 101 */                       while (oii1O1l2 != null && jI00000oIO > j8) {
/* 113 */                           jI00000oIO -= oii1O1l2.I0000Il00O - oii1O1l2.I00000oOI;
/* 116 */                           if (jI00000oIO <= j8) {
                                        break;
                                    }
/* 118 */                           oii1O1l2 = oii1O1l2.I000II;
                                }
/* 123 */                       if (jI00000oIO != -1) {
/* 131 */                           while (jMin > jI00000oIO) {
/* 145 */                               String str3 = str2;
/* 153 */                               int iI00000oIO = lO11oI0I00l1.I00000oIO(oii1O1l2, b, Math.max((int) (j8 - jI00000oIO), 0), Math.min(oii1O1l2.I00000oIO(), (int) (jMin - jI00000oIO)));
/* 158 */                               if (iI00000oIO != -1) {
/* 161 */                                   j5 = jI00000oIO + iI00000oIO;
                                        } else {
/* 169 */                                   jI00000oIO += oii1O1l2.I00000oIO();
/* 170 */                                   oii1O1l2 = oii1O1l2.I0001Ioi1lo;
/* 172 */                                   if (oii1O1l2 == null || jI00000oIO >= jMin) {
/* 125 */                                       j5 = -1;
                                            } else {
/* 179 */                                       str2 = str3;
                                            }
                                        }
                                    }
/* 182 */                           I000II.I001IO000(str2);
/* 185 */                           return j4;
                                }
/* 125 */                       j5 = -1;
                            } else {
/* 187 */                       long jI00000oIO2 = j4;
/* 189 */                       while (oii1O1l != null) {
/* 197 */                           long j9 = (oii1O1l.I0000Il00O - oii1O1l.I00000oOI) + jI00000oIO2;
/* 200 */                           if (j9 > j8) {
                                        break;
                                    }
/* 202 */                           oii1O1l = oii1O1l.I0001Ioi1lo;
/* 204 */                           jI00000oIO2 = j9;
                                }
/* 208 */                       if (jI00000oIO2 != -1) {
/* 213 */                           while (jMin > jI00000oIO2) {
/* 234 */                               int iI00000oIO2 = lO11oI0I00l1.I00000oIO(oii1O1l, b, Math.max((int) (j8 - jI00000oIO2), 0), Math.min(oii1O1l.I00000oIO(), (int) (jMin - jI00000oIO2)));
/* 239 */                               if (iI00000oIO2 != -1) {
/* 242 */                                   j5 = iI00000oIO2 + jI00000oIO2;
                                        } else {
/* 249 */                                   jI00000oIO2 += oii1O1l.I00000oIO();
/* 250 */                                   oii1O1l = oii1O1l.I0001Ioi1lo;
/* 252 */                                   if (oii1O1l == null || jI00000oIO2 >= jMin) {
/* 125 */                                       j5 = -1;
                                            }
                                        }
                                    }
/* 275 */                           I000II.I001IO000("Check failed.");
/* 278 */                           return j4;
                                }
                            }
                        }
/* 262 */               if (j5 != j3) {
/* 264 */                   return j5;
                        }
/* 269 */               j8 = olI1iil1l0.I0000oI00().I00iiO;
/* 271 */               j7 = j4;
                    }
/* 23 */            return -1L;
                }

                public static final byte[] I00000oOI(OlI1iil1l0 olI1iil1l0, int i) {
                    long j = i;
/* 6 */             if (j >= 0) {
/* 8 */                 return I0000Il00O(olI1iil1l0, i);
                    }
/* 21 */            I000II.I0010I0i(IlIi0I0.I000l1(j, "byteCount (", ") < 0"));
/* 24 */            return null;
                }

                public static final byte[] I0000Il00O(OlI1iil1l0 olI1iil1l0, int i) throws EOFException {
/* 2 */             if (i == -1) {
/* 16 */                for (long j = 2147483647L; olI1iil1l0.I0000oI00().I00iiO < 2147483647L && olI1iil1l0.I000lI(j); j *= 2) {
                        }
/* 36 */                if (olI1iil1l0.I0000oI00().I00iiO >= 2147483647L) {
/* 75 */                    throw new IllegalStateException(("Can't create an array of size " + olI1iil1l0.I0000oI00().I00iiO).toString());
                        }
/* 44 */                i = (int) olI1iil1l0.I0000oI00().I00iiO;
                    } else {
/* 77 */                olI1iil1l0.I00100o1O0lo(i);
                    }
/* 80 */            byte[] bArr = new byte[i];
/* 82 */            III1oo00i1li iII1oo00i1liI0000oI00 = olI1iil1l0.I0000oI00();
                    long j2 = i;
/* 90 */            iO1i0iI.I00000oIO(j2, 0L, j2);
/* 93 */            int i2 = 0;
/* 94 */            while (i2 < i) {
/* 96 */                int iI0000Il00O = iII1oo00i1liI0000oI00.I0000Il00O(bArr, i2, i);
/* 100 */               if (iI0000Il00O == -1) {
/* 119 */                   throw new EOFException(Oi010OO0.I0010o("Source exhausted before reading ", i, " bytes. Only ", iI0000Il00O, " bytes were read."));
                        }
/* 102 */               i2 += iI0000Il00O;
                    }
/* 551 */           return bArr;
                }
            }

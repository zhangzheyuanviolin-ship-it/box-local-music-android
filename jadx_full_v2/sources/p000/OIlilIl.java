            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.TreeMap;
            
            public final class OIlilIl extends I1oO1oiO00O {
                public static final char[] I001IO000 = {'x', 'r', 'e', 'f'};
                public static final char[] I001i1O0Ol = {'/', 'X', 'R', 'e', 'f'};
                public static final char[] I001i1lo1io = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};
                public static final byte[] I001iOo1i0O = {101, 110, 100, 115, 116, 114, 101, 97, 109};
                public static final byte[] I001l0I00 = {101, 110, 100, 111, 98, 106};
                public static final char[] I001lIiIIo1O = {'%', '%', 'E', 'O', 'F'};
                public static final char[] I001lllioOl = {'o', 'b', 'j'};
                public static final char[] I001lloI = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};
                public static final char[] I00II0Ol1O0l = {'/', 'O', 'b', 'j', 'S', 't', 'm'};
                public final byte[] I0000oI00;
                public final OiOOiIO1 I0001Ioi1lo;
                public final String I000II;
                public long I000O01llI0;
                public final long I000OOo1O;
                public final boolean I000OiO;
                public boolean I000iOII;
                public boolean I000l1;
                public HashMap I000lI;
                public Long I000o00OoI0I;
                public ArrayList I000oI1ioi;
                public ArrayList I00100l0;
                public OIliiIOOiI1l I00100o1O0lo;
                public Oii0OIIO I0010I0i;
                public final int I0010o;
                public final Oo1ol1ll I00111O;
                public final byte[] I001IIilI0O;

                public OIlilIl(OiOOiIO1 oiOOiIO1, OiOOiI1lllOo oiOOiI1lllOo) throws NumberFormatException {
/* 3 */             OOl1lOl0001 oOl1lOl0001 = new OOl1lOl0001();
/* 6 */             oOl1lOl0001.I00iOIl = oiOOiIO1;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            super(oOl1lOl0001);
/* 18 */            this.I0000oI00 = new byte[Barcode.FORMAT_PDF417];
/* 22 */            this.I000II = "";
/* 25 */            this.I000OiO = true;
/* 28 */            this.I000iOII = false;
/* 30 */            this.I000l1 = false;
/* 33 */            this.I000lI = null;
/* 35 */            this.I000o00OoI0I = null;
/* 37 */            this.I000oI1ioi = null;
/* 39 */            this.I00100l0 = null;
/* 41 */            this.I00100o1O0lo = null;
/* 43 */            this.I0010I0i = null;
/* 45 */            this.I0010o = Barcode.FORMAT_PDF417;
/* 50 */            Oo1ol1ll oo1ol1ll = new Oo1ol1ll(3);
/* 58 */            oo1ol1ll.I00iiI = new HashMap();
/* 60 */            oo1ol1ll.I00iiO = null;
/* 62 */            oo1ol1ll.I00iio = null;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            this.I00111O = oo1ol1ll;
/* 73 */            this.I001IIilI0O = new byte[8192];
/* 75 */            this.I0001Ioi1lo = oiOOiIO1;
/* 77 */            this.I000II = "";
/* 81 */            this.I000OOo1O = oiOOiIO1.I00iiO;
/* 85 */            String property = System.getProperty("com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange");
/* 89 */            if (property != null) {
                        try {
/* 91 */                    int i = Integer.parseInt(property);
/* 97 */                    if (i > 15) {
/* 99 */                        this.I0010o = i;
                            }
                        } catch (NumberFormatException unused) {
/* 123 */                   Log.w("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + "'");
                        }
                    }
/* 128 */           IIOolO1li iIOolO1li = new IIOolO1li();
/* 136 */           iIOolO1li.I00iOIl = new HashMap();
/* 143 */           iIOolO1li.I00iiI = new HashMap();
/* 150 */           iIOolO1li.I00iiO = new ArrayList();
/* 152 */           iIOolO1li.I00ilI0I1 = true;
/* 154 */           iIOolO1li.I00ilO0 = false;
/* 156 */           iIOolO1li.I00io1l = oiOOiI1lllOo;
/* 158 */           VarHandle.storeStoreFence();
/* 161 */           this.I0000Il00O = iIOolO1li;
                }

                public static void I001i1O0Ol(LinkedList linkedList, IIOoOiOI iIOoOiOI, HashSet hashSet) {
/* 3 */             if (iIOoOiOI instanceof IIi0O10I) {
/* 26 */                if (hashSet.add(Long.valueOf((((IIi0O10I) iIOoOiOI).I00iiI << 32) | r0.I00iiO))) {
/* 29 */                    linkedList.add(iIOoOiOI);
/* 32 */                    return;
                        }
/* 42 */                return;
                    }
/* 35 */            if ((iIOoOiOI instanceof IIOoi0ooOoO) || (iIOoOiOI instanceof IIOoIilO)) {
/* 43 */                linkedList.add(iIOoOiOI);
                    }
                }

                public static int I001l0I00(IIOoi0ooOoO iIOoi0ooOoO, HashSet hashSet) {
/* 3 */             IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(IIi0I0I0o.I01lloolio1l);
/* 9 */             int iI001l0I00 = 0;
/* 10 */            if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 12 */                IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oII;
/* 21 */                Iterator it = new ArrayList(iIOoIilO.I00iOIl).iterator();
/* 29 */                while (it.hasNext()) {
/* 35 */                    IIOoOiOI iIOoOiOI = (IIOoOiOI) it.next();
/* 39 */                    if (iIOoOiOI instanceof IIi0O10I) {
/* 42 */                        IIi0O10I iIi0O10I = (IIi0O10I) iIOoOiOI;
/* 48 */                        if (!hashSet.contains(iIi0O10I)) {
/* 51 */                            IIOoOiOI iIOoOiOI2 = iIi0O10I.I00iOIl;
/* 53 */                            if (iIOoOiOI2 == null || iIOoOiOI2.equals(IIi0II0l0o.I00iOIl)) {
/* 126 */                               Log.w("PdfBox-Android", "Removed null object " + iIOoOiOI + " from pages dictionary");
/* 129 */                               iIOoIilO.I00oII(iIOoOiOI);
                                    } else if (iIOoOiOI2 instanceof IIOoi0ooOoO) {
/* 68 */                                IIOoi0ooOoO iIOoi0ooOoO2 = (IIOoi0ooOoO) iIOoOiOI2;
/* 72 */                                IIi0I0I0o iIi0I0I0oI00o0iI0io1 = iIOoi0ooOoO2.I00o0iI0io1(IIi0I0I0o.I0IilI00l);
/* 82 */                                if (IIi0I0I0o.I0I11O000oO.equals(iIi0I0I0oI00o0iI0io1)) {
/* 84 */                                    hashSet.add(iIi0O10I);
/* 91 */                                    iI001l0I00 = I001l0I00(iIOoi0ooOoO2, hashSet) + iI001l0I00;
                                        } else if (IIi0I0I0o.I0I1101l0.equals(iIi0I0I0oI00o0iI0io1)) {
/* 102 */                                   iI001l0I00++;
                                        }
                                    }
                                }
                            }
/* 133 */                   iIOoIilO.I00oII(iIOoOiOI);
                        }
                    }
/* 139 */           iIOoi0ooOoO.I010i10l(IIi0I0I0o.I011IOil, iI001l0I00);
/* 551 */           return iI001l0I00;
                }

                public static IIi0O10I I001lllioOl(IIi0O10I iIi0O10I, Long l, IIi0O10I iIi0O10I2, Long l2) {
                    return (iIi0O10I2 == null || (iIi0O10I2.I00iiI != iIi0O10I.I00iiI ? !(l2 == null || l.longValue() <= l2.longValue()) : iIi0O10I2.I00iiO < iIi0O10I.I00iiO)) ? iIi0O10I : iIi0O10I2;
                }

                public static boolean I00IO1(IIOoi0ooOoO iIOoi0ooOoO) {
/* 9 */             if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0I1IlI1)) {
/* 114 */               return false;
                    }
/* 19 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I00ilI0I1)) {
/* 114 */               return false;
                    }
/* 29 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I01Ii0ll10O)) {
/* 114 */               return false;
                    }
/* 40 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0I01IoIO)) {
/* 112 */               return true;
                    }
/* 50 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0IiIiiIOIO)) {
/* 112 */               return true;
                    }
/* 60 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I00oII)) {
/* 112 */               return true;
                    }
/* 70 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0Ii0i)) {
/* 112 */               return true;
                    }
/* 80 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I01lli)) {
/* 112 */               return true;
                    }
/* 90 */            if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I011Io0I1ioi)) {
/* 112 */               return true;
                    }
/* 100 */           if (iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0I1liIO0ii)) {
/* 112 */               return true;
                    }
                    return iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I011Ill);
                }

                public static int I00IOO(char[] cArr, byte[] bArr, int i) {
                    int length = cArr.length - 1;
/* 4 */             char c = cArr[length];
                    while (true) {
/* 6 */                 int i2 = length;
                        while (true) {
                            i--;
/* 9 */                     if (i < 0) {
/* 7 */                         return -1;
                            }
/* 13 */                    if (bArr[i] == c) {
                                i2--;
/* 17 */                        if (i2 < 0) {
/* 19 */                            return i;
                                }
/* 20 */                        c = cArr[i2];
                            } else if (i2 < length) {
                                break;
                            }
                        }
/* 25 */                c = cArr[length];
                    }
                }

                public static long I00OOll1(ArrayList arrayList, long j) {
/* 1 */             int size = arrayList.size();
/* 5 */             Long lValueOf = null;
/* 8 */             int i = -1;
/* 9 */             for (int i2 = 0; i2 < size; i2++) {
/* 21 */                long jLongValue = j - ((Long) arrayList.get(i2)).longValue();
/* 23 */                if (lValueOf == null || Math.abs(lValueOf.longValue()) > Math.abs(jLongValue)) {
/* 41 */                    lValueOf = Long.valueOf(jLongValue);
/* 45 */                    i = i2;
                        }
                    }
/* 49 */            if (i > -1) {
/* 57 */                return ((Long) arrayList.get(i)).longValue();
                    }
/* 62 */            return -1L;
                }

                public final void I001i1lo1io() throws Throwable {
                    Iterator it;
                    IIi0io1lIo iIi0io1lIo;
                    IIi0io1lIo iIi0io1lIo2;
                    IIi0io1lIo iIi0io1lIo3;
                    int i;
                    Iterator it2;
                    Long l;
                    long j;
                    long j2;
/* 5 */             HashMap map = new HashMap();
/* 8 */             OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 10 */            long position = oiOOiIO1.getPosition();
/* 14 */            long j3 = 6;
/* 16 */            oiOOiIO1.I000l1(6L);
/* 20 */            char[] cArr = {' ', 'o', 'b', 'j'};
                    while (true) {
/* 29 */                long j4 = 0;
/* 32 */                if (oiOOiIO1.I00l0OO0IO()) {
                            break;
                        }
/* 40 */                if (I00IO1oi11O(I00II0Ol1O0l)) {
/* 42 */                    long position2 = oiOOiIO1.getPosition();
/* 46 */                    j = j3;
/* 48 */                    boolean z = false;
/* 49 */                    int i2 = 1;
/* 52 */                    while (i2 < 40 && !z) {
/* 59 */                        long j5 = position2 - (i2 * 10);
/* 63 */                        if (j5 > j4) {
/* 65 */                            oiOOiIO1.I000l1(j5);
/* 68 */                            j2 = j4;
/* 70 */                            int i3 = 0;
                                    while (true) {
/* 73 */                                if (i3 >= 10) {
                                            break;
                                        }
/* 81 */                                if (I00IO1oi11O(cArr)) {
/* 85 */                                    oiOOiIO1.I000l1(j5 - 1);
/* 96 */                                    if (I1oO1oiO00O.I0000O(oiOOiIO1.peek())) {
/* 102 */                                       oiOOiIO1.I000l1(j5 - 2);
/* 113 */                                       if (32 == this.I00000oOI.peek()) {
/* 117 */                                           long j6 = j5 - 3;
/* 118 */                                           oiOOiIO1.I000l1(j6);
/* 121 */                                           int i4 = 0;
/* 124 */                                           while (j6 > j && I0000Il00O()) {
/* 132 */                                               j6--;
/* 134 */                                               oiOOiIO1.I000l1(j6);
/* 137 */                                               i4++;
                                                    }
/* 140 */                                           if (i4 > 0) {
/* 142 */                                               oiOOiIO1.read();
/* 166 */                                               map.put(Long.valueOf(oiOOiIO1.getPosition()), new IIi0O11lioI1(I000oI1ioi(), I0010I0i()));
                                                    }
                                                }
                                            }
/* 169 */                                   z = true;
                                        } else {
/* 171 */                                   j5++;
/* 173 */                                   oiOOiIO1.read();
/* 176 */                                   i3++;
                                        }
                                    }
                                } else {
/* 179 */                           j2 = j4;
                                }
/* 181 */                       i2++;
/* 183 */                       j4 = j2;
                            }
/* 190 */                   oiOOiIO1.I000l1(position2 + 7);
                        } else {
/* 194 */                   j = j3;
                        }
/* 196 */               oiOOiIO1.read();
/* 199 */               j3 = j;
                    }
/* 209 */           Iterator it3 = map.keySet().iterator();
/* 217 */           while (it3.hasNext()) {
/* 223 */               Long l2 = (Long) it3.next();
/* 235 */               Long l3 = (Long) this.I000lI.get(map.get(l2));
/* 237 */               if (l3 == null) {
/* 267 */                   Log.w("PdfBox-Android", "Skipped incomplete object stream:" + map.get(l2) + " at " + l2);
                        } else {
/* 275 */                   if (l2.equals(l3)) {
/* 281 */                       oiOOiIO1.I000l1(l2.longValue());
/* 284 */                       long jI0010I0i = I0010I0i();
/* 288 */                       int iI000oI1ioi = I000oI1ioi();
/* 294 */                       I000o00OoI0I(I001lllioOl);
                                try {
/* 298 */                           IIOoi0ooOoO iIOoi0ooOoOI000OOo1O = I000OOo1O();
/* 305 */                           int iI00oooO = iIOoi0ooOoOI000OOo1O.I00oooO(IIi0I0I0o.I01Oi01Ilol, null, -1);
/* 311 */                           int iI00oooO2 = iIOoi0ooOoOI000OOo1O.I00oooO(IIi0I0I0o.I0I0I10I, null, -1);
/* 315 */                           if (iI00oooO != -1 && iI00oooO2 != -1) {
/* 323 */                               IIi0io1lIo iIi0io1lIoI00IlilI0i0i = I00IlilI0i0i(iIOoi0ooOoOI000OOo1O);
                                        try {
/* 327 */                                   Oii0OIIO oii0OIIO = this.I0010I0i;
/* 329 */                                   if (oii0OIIO != null) {
                                                long j7 = iI000oI1ioi;
/* 334 */                                       i = iI00oooO2;
/* 335 */                                       iIi0io1lIo3 = iIi0io1lIoI00IlilI0i0i;
                                                try {
/* 339 */                                           oii0OIIO.I0000Il00O(iIi0io1lIo3, jI0010I0i, j7);
                                                } catch (IOException unused) {
/* 347 */                                           it = it3;
/* 349 */                                           iIi0io1lIo2 = iIi0io1lIo3;
/* 545 */                                           if (iIi0io1lIo2 != null) {
/* 547 */                                               iIi0io1lIo2.close();
                                                    }
/* 535 */                                           it3 = it;
                                                } catch (Throwable th) {
/* 343 */                                           th = th;
/* 344 */                                           iIi0io1lIo = iIi0io1lIo3;
/* 539 */                                           if (iIi0io1lIo != null) {
/* 541 */                                               iIi0io1lIo.close();
                                                    }
/* 544 */                                           throw th;
                                                }
                                            } else {
/* 352 */                                       i = iI00oooO2;
/* 353 */                                       iIi0io1lIo3 = iIi0io1lIoI00IlilI0i0i;
                                            }
/* 358 */                                   OIliioo1i0 oIliioo1i0 = new OIliioo1i0(iIi0io1lIo3, this.I0000Il00O);
/* 363 */                                   ArrayList arrayList = new ArrayList(i);
/* 367 */                                   for (int i5 = 0; i5 < i; i5++) {
/* 377 */                                       arrayList.add(Long.valueOf(oIliioo1i0.I0010I0i()));
/* 380 */                                       oIliioo1i0.I00100o1O0lo();
                                            }
/* 386 */                                   iIi0io1lIo3.close();
/* 393 */                                   if (arrayList.size() >= i) {
/* 401 */                                       i01oi0o i01oi0oVar = (i01oi0o) this.I00111O.I00iio;
/* 407 */                                       HashMap map2 = i01oi0oVar == null ? null : i01oi0oVar.I00000oOI;
/* 409 */                                       Iterator it4 = arrayList.iterator();
/* 417 */                                       while (it4.hasNext()) {
/* 431 */                                           IIi0O11lioI1 iIi0O11lioI1 = new IIi0O11lioI1(0, ((Long) it4.next()).longValue());
/* 440 */                                           Long l4 = (Long) this.I000lI.get(iIi0O11lioI1);
/* 442 */                                           if (l4 == null || l4.longValue() >= 0) {
/* 479 */                                               it2 = it3;
/* 481 */                                               l = l2;
                                                    } else {
/* 458 */                                               it2 = it3;
/* 460 */                                               l = l2;
/* 476 */                                               l4 = (Long) this.I000lI.get(new IIi0O11lioI1(0, Math.abs(l4.longValue())));
                                                    }
/* 483 */                                           if (l4 == null || l.longValue() > l4.longValue()) {
/* 499 */                                               long j8 = -jI0010I0i;
/* 504 */                                               this.I000lI.put(iIi0O11lioI1, Long.valueOf(j8));
/* 511 */                                               map2.put(iIi0O11lioI1, Long.valueOf(j8));
                                                    }
/* 514 */                                           it3 = it2;
/* 516 */                                           l2 = l;
                                                }
                                            }
                                        } catch (IOException unused2) {
/* 523 */                                   it = it3;
/* 525 */                                   iIi0io1lIo3 = iIi0io1lIoI00IlilI0i0i;
                                        } catch (Throwable th2) {
/* 519 */                                   th = th2;
/* 520 */                                   iIi0io1lIo3 = iIi0io1lIoI00IlilI0i0i;
                                        }
                                    }
                                } catch (IOException unused3) {
/* 531 */                           it = it3;
/* 533 */                           iIi0io1lIo2 = null;
                                } catch (Throwable th3) {
/* 528 */                           th = th3;
/* 529 */                           iIi0io1lIo = null;
                                }
                            }
/* 319 */                   it = it3;
/* 535 */                   it3 = it;
                        }
                    }
/* 551 */           oiOOiIO1.I000l1(position);
                }

                public final void I001iOo1i0O() throws IOException {
                    long j;
/* 5 */             if (this.I000lI == null) {
/* 7 */                 Long l = this.I000o00OoI0I;
/* 14 */                long j2 = 6;
/* 16 */                OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 18 */                if (l == null) {
/* 20 */                    long position = oiOOiIO1.getPosition();
/* 24 */                    oiOOiIO1.I000l1(6L);
/* 31 */                    while (!oiOOiIO1.I00l0OO0IO()) {
/* 39 */                        if (I00IO1oi11O(I001lIiIIo1O)) {
/* 41 */                            long position2 = oiOOiIO1.getPosition();
/* 48 */                            oiOOiIO1.I000l1(5 + position2);
                                    try {
/* 51 */                                I001IIilI0O();
/* 60 */                                if (!I00IO1oi11O(I001IO000)) {
/* 62 */                                    I0010I0i();
/* 65 */                                    I000oI1ioi();
                                        }
                                    } catch (IOException unused) {
/* 73 */                                this.I000o00OoI0I = Long.valueOf(position2);
                                    }
                                }
/* 75 */                        oiOOiIO1.read();
                            }
/* 79 */                    oiOOiIO1.I000l1(position);
/* 84 */                    if (this.I000o00OoI0I == null) {
/* 90 */                        this.I000o00OoI0I = Long.MAX_VALUE;
                            }
                        }
/* 97 */                this.I000lI = new HashMap();
/* 99 */                long position3 = oiOOiIO1.getPosition();
/* 104 */               char[] cArr = {'n', 'd', 'o'};
/* 110 */               char[] cArr2 = {'b', 'j'};
/* 115 */               long j3 = Long.MIN_VALUE;
/* 121 */               long j4 = 6;
/* 122 */               int i = Integer.MIN_VALUE;
/* 123 */               boolean z = false;
/* 125 */               long j5 = Long.MIN_VALUE;
                        while (true) {
/* 126 */                   oiOOiIO1.I000l1(j4);
/* 129 */                   long j6 = j2;
/* 131 */                   int i2 = oiOOiIO1.read();
/* 137 */                   long j7 = j4 + 1;
/* 147 */                   if (I1oO1oiO00O.I000II(i2) && I00IO1oi11O(I001lllioOl)) {
/* 160 */                       oiOOiIO1.I000l1((-1) + j4);
/* 163 */                       int iPeek = oiOOiIO1.peek();
/* 171 */                       if (I1oO1oiO00O.I0000O(iPeek)) {
                                    int i3 = iPeek - 48;
/* 177 */                           j = j5;
                                    long j8 = j4 - 2;
/* 181 */                           oiOOiIO1.I000l1(j8);
/* 184 */                           OilOll oilOll = this.I00000oOI;
/* 194 */                           if (I1oO1oiO00O.I000II(oilOll.peek())) {
/* 198 */                               while (j8 > j6 && I1oO1oiO00O.I000II(oilOll.peek())) {
/* 210 */                                   j8--;
/* 212 */                                   oiOOiIO1.I000l1(j8);
                                        }
/* 216 */                               boolean z2 = false;
/* 219 */                               while (j8 > j6 && I0000Il00O()) {
/* 227 */                                   j8--;
/* 229 */                                   oiOOiIO1.I000l1(j8);
/* 232 */                                   z2 = true;
                                        }
/* 235 */                               if (z2) {
/* 237 */                                   oiOOiIO1.read();
/* 240 */                                   long jI0010I0i = I0010I0i();
/* 246 */                                   if (j > 0) {
/* 259 */                                       this.I000lI.put(new IIi0O11lioI1(i, j3), Long.valueOf(j));
                                            }
/* 262 */                                   j5 = j8 + 1;
/* 267 */                                   i = i3;
/* 268 */                                   j3 = jI0010I0i;
/* 270 */                                   z = false;
/* 266 */                                   j7 = j4 + 3;
                                        }
/* 279 */                               j4 = j7;
                                    }
                                } else {
/* 275 */                           j = j5;
                                }
/* 277 */                       j5 = j;
/* 279 */                       j4 = j7;
                            } else {
/* 282 */                       long j9 = j5;
/* 286 */                       if (i2 == 101 && I00IO1oi11O(cArr)) {
/* 296 */                           long j10 = 4 + j4;
/* 297 */                           oiOOiIO1.I000l1(j10);
/* 304 */                           if (oiOOiIO1.I00l0OO0IO()) {
/* 306 */                               j4 = j10;
                                    } else if (I00IO1oi11O(cArr2)) {
/* 318 */                               j4 += j6;
                                    } else {
/* 321 */                               j4 = j10;
                                    }
/* 307 */                           z = true;
                                } else {
/* 323 */                           j4 = j7;
                                }
/* 309 */                       j5 = j9;
                            }
/* 334 */                   if (j4 >= this.I000o00OoI0I.longValue() || oiOOiIO1.I00l0OO0IO()) {
                                break;
                            } else {
/* 343 */                       j2 = j6;
                            }
                        }
/* 355 */               if ((this.I000o00OoI0I.longValue() < Long.MAX_VALUE || z) && j5 > 0) {
/* 374 */                   this.I000lI.put(new IIi0O11lioI1(i, j3), Long.valueOf(j5));
                        }
/* 377 */               oiOOiIO1.I000l1(position3);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
                
                    if ("XRef".equals(r3.I010101Oo1lO(p000.IIi0I0I0o.I0IilI00l)) != false) goto L110;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I001lIiIIo1O(long j) throws IOException {
                    long j2;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
/* 5 */             boolean z = this.I000OiO;
/* 7 */             if (z) {
/* 11 */                OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 13 */                oiOOiIO1.I000l1(j);
/* 16 */                I001IIilI0O();
/* 19 */                int iPeek = oiOOiIO1.peek();
/* 25 */                char[] cArr = I001IO000;
/* 27 */                if (iPeek != 120 || !I00IO1oi11O(cArr)) {
/* 41 */                    if (j <= 0) {
/* 556 */                       return -1L;
                            }
/* 43 */                    if (z && j != 0) {
/* 49 */                        long j7 = 1;
/* 53 */                        oiOOiIO1.I000l1(j - 1);
/* 64 */                        if (I1oO1oiO00O.I000II(oiOOiIO1.read())) {
/* 66 */                            I001IIilI0O();
/* 73 */                            if (I0000Il00O()) {
                                        try {
/* 75 */                                    I0010I0i();
/* 78 */                                    I000oI1ioi();
/* 83 */                                    I000o00OoI0I(I001lllioOl);
/* 86 */                                    IIOoi0ooOoO iIOoi0ooOoOI000OOo1O = I000OOo1O();
/* 90 */                                    oiOOiIO1.I000l1(j);
                                        } catch (IOException unused) {
/* 109 */                                   oiOOiIO1.I000l1(j);
                                        }
                                    }
                                }
/* 114 */                       if (j < 0) {
/* 135 */                           Log.e("PdfBox-Android", "Invalid object offset " + j + " when searching for a xref table/stream");
/* 37 */                            return 0L;
                                }
/* 140 */                       ArrayList arrayList = this.I000oI1ioi;
/* 142 */                       OilOll oilOll = this.I00000oOI;
/* 144 */                       long j8 = 6;
/* 146 */                       if (arrayList == null) {
/* 153 */                           this.I000oI1ioi = new ArrayList();
/* 155 */                           j2 = 0;
/* 157 */                           long position = oiOOiIO1.getPosition();
/* 161 */                           oiOOiIO1.I000l1(6L);
/* 168 */                           while (!oiOOiIO1.I00l0OO0IO()) {
/* 174 */                               if (I00IO1oi11O(cArr)) {
/* 176 */                                   long position2 = oiOOiIO1.getPosition();
/* 184 */                                   oiOOiIO1.I000l1(position2 - 1);
/* 195 */                                   if (I1oO1oiO00O.I000II(oilOll.peek())) {
/* 203 */                                       this.I000oI1ioi.add(Long.valueOf(position2));
                                            }
/* 210 */                                   oiOOiIO1.I000l1(position2 + 4);
                                        }
/* 216 */                               oiOOiIO1.read();
                                    }
/* 220 */                           j3 = -1;
/* 222 */                           oiOOiIO1.I000l1(position);
                                } else {
/* 226 */                           j2 = 0;
/* 228 */                           j3 = -1;
                                }
/* 232 */                       if (this.I00100l0 == null) {
/* 239 */                           this.I00100l0 = new ArrayList();
/* 241 */                           long position3 = oiOOiIO1.getPosition();
/* 245 */                           oiOOiIO1.I000l1(6L);
/* 249 */                           char[] cArr2 = {' ', 'o', 'b', 'j'};
/* 258 */                           while (!oiOOiIO1.I00l0OO0IO()) {
/* 266 */                               if (I00IO1oi11O(I001i1O0Ol)) {
/* 268 */                                   long position4 = oiOOiIO1.getPosition();
/* 274 */                                   j4 = j7;
/* 276 */                                   boolean z2 = false;
/* 278 */                                   long position5 = j3;
/* 280 */                                   int i = 1;
/* 283 */                                   while (i < 40 && !z2) {
/* 290 */                                       long j9 = position4 - (i * 10);
/* 294 */                                       if (j9 > j2) {
/* 296 */                                           oiOOiIO1.I000l1(j9);
/* 299 */                                           j6 = j8;
/* 301 */                                           int i2 = 0;
                                                    while (true) {
/* 305 */                                               if (i2 >= 10) {
                                                            break;
                                                        }
/* 311 */                                               if (I00IO1oi11O(cArr2)) {
/* 315 */                                                   oiOOiIO1.I000l1(j9 - j4);
/* 326 */                                                   if (I1oO1oiO00O.I0000O(oiOOiIO1.peek())) {
/* 332 */                                                       oiOOiIO1.I000l1(j9 - 2);
/* 341 */                                                       if (32 == oilOll.peek()) {
/* 345 */                                                           long j10 = j9 - 3;
/* 346 */                                                           oiOOiIO1.I000l1(j10);
/* 349 */                                                           int i3 = 0;
/* 353 */                                                           while (j10 > j6 && I0000Il00O()) {
/* 361 */                                                               j10 -= j4;
/* 363 */                                                               oiOOiIO1.I000l1(j10);
/* 366 */                                                               i3++;
                                                                    }
/* 369 */                                                           if (i3 > 0) {
/* 371 */                                                               oiOOiIO1.read();
/* 374 */                                                               position5 = oiOOiIO1.getPosition();
                                                                    }
                                                                }
                                                            }
/* 378 */                                                   z2 = true;
                                                        } else {
/* 381 */                                                   j9 += j4;
/* 383 */                                                   oiOOiIO1.read();
/* 386 */                                                   i2++;
                                                        }
                                                    }
                                                } else {
/* 389 */                                           j6 = j8;
                                                }
/* 391 */                                       i++;
/* 393 */                                       j8 = j6;
                                            }
/* 396 */                                   j5 = j8;
/* 400 */                                   if (position5 > j3) {
/* 408 */                                       this.I00100l0.add(Long.valueOf(position5));
                                            }
/* 414 */                                   oiOOiIO1.I000l1(position4 + 5);
                                        } else {
/* 418 */                                   j4 = j7;
/* 420 */                                   j5 = j8;
                                        }
/* 422 */                               oiOOiIO1.read();
/* 425 */                               j7 = j4;
/* 427 */                               j8 = j5;
                                    }
/* 431 */                           oiOOiIO1.I000l1(position3);
                                }
/* 434 */                       ArrayList arrayList2 = this.I000oI1ioi;
/* 443 */                       long jI00OOll1 = arrayList2 != null ? I00OOll1(arrayList2, j) : j3;
/* 445 */                       ArrayList arrayList3 = this.I00100l0;
/* 454 */                       long jI00OOll12 = arrayList3 != null ? I00OOll1(arrayList3, j) : j3;
/* 458 */                       if (jI00OOll1 <= j3 || jI00OOll12 <= j3) {
/* 501 */                           if (jI00OOll1 > j3) {
/* 509 */                               this.I000oI1ioi.remove(Long.valueOf(jI00OOll1));
                                    } else if (jI00OOll12 > j3) {
/* 523 */                               this.I00100l0.remove(Long.valueOf(jI00OOll12));
/* 489 */                               jI00OOll1 = jI00OOll12;
                                    } else {
/* 527 */                               jI00OOll1 = j3;
                                    }
                                } else if (Math.abs(j - jI00OOll1) > Math.abs(j - jI00OOll12)) {
/* 486 */                           this.I00100l0.remove(Long.valueOf(jI00OOll12));
/* 489 */                           jI00OOll1 = jI00OOll12;
                                } else {
/* 497 */                           this.I000oI1ioi.remove(Long.valueOf(jI00OOll1));
                                }
/* 531 */                       if (jI00OOll1 > j3) {
/* 533 */                           return jI00OOll1;
                                }
/* 549 */                       Log.e("PdfBox-Android", "Can't find the object xref table/stream at offset " + j);
/* 552 */                       return j2;
                            }
                        }
                    }
/* 3 */             return j;
                }

                public final OIliOo11 I001lloI() throws IOException {
/* 3 */             IIOolO1li iIOolO1li = this.I0000Il00O;
/* 6 */             if (iIOolO1li == null) {
/* 107 */               IioIoO10iOiI.I000OOo1O("You must parse the document first before calling getDocument()");
/* 5 */                 return null;
                    }
/* 8 */             if (iIOolO1li == null) {
/* 101 */               IioIoO10iOiI.I000OOo1O("You must parse the document first before calling getAccessPermission()");
/* 5 */                 return null;
                    }
/* 10 */            OIliOo11 oIliOo11 = new OIliOo11();
/* 15 */            new HashSet();
/* 23 */            oIliOo11.I00iio = new HashSet();
/* 30 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(10, false);
/* 38 */            ioIlOo1o0IIl.I00iiI = new HashMap();
/* 42 */            new HashMap();
/* 50 */            ioIlOo1o0IIl.I00iiO = new HashMap();
/* 57 */            ioIlOo1o0IIl.I00iio = new HashMap();
/* 61 */            new HashMap();
/* 66 */            new HashMap();
/* 71 */            new HashMap();
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            oIliOo11.I00ilI0I1 = ioIlOo1o0IIl;
/* 79 */            oIliOo11.I00iOIl = iIOolO1li;
/* 83 */            oIliOo11.I00iiO = this.I0001Ioi1lo;
/* 85 */            VarHandle.storeStoreFence();
/* 90 */            if (this.I0000Il00O != null) {
/* 92 */                return oIliOo11;
                    }
/* 95 */            IioIoO10iOiI.I000OOo1O("You must parse the document first before calling getEncryption()");
/* 5 */             return null;
                }

                public final long I00II0Ol1O0l() throws IOException {
/* 1 */             OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
                    try {
/* 5 */                 long j = this.I000OOo1O;
/* 7 */                 int i = this.I0010o;
/* 12 */                if (j < i) {
/* 14 */                    i = (int) j;
                        }
/* 15 */                byte[] bArr = new byte[i];
/* 18 */                long j2 = j - i;
/* 19 */                oiOOiIO1.I000l1(j2);
/* 22 */                int i2 = 0;
/* 23 */                while (i2 < i) {
/* 25 */                    int i3 = i - i2;
/* 27 */                    int i4 = oiOOiIO1.read(bArr, i2, i3);
/* 32 */                    if (i4 < 1) {
/* 58 */                        throw new IOException("No more bytes to read for trailing buffer, but expected: " + i3);
                            }
/* 34 */                    i2 += i4;
                        }
/* 61 */                oiOOiIO1.I000l1(0L);
/* 64 */                char[] cArr = I001lIiIIo1O;
/* 66 */                int iI00IOO = I00IOO(cArr, bArr, i);
/* 70 */                if (iI00IOO >= 0) {
/* 112 */                   i = iI00IOO;
                        } else {
/* 74 */                    if (!this.I000OiO) {
/* 111 */                       throw new IOException("Missing end of file marker '" + new String(cArr) + "'");
                            }
/* 78 */                    new String(cArr);
                        }
/* 115 */               int iI00IOO2 = I00IOO(I001i1lo1io, bArr, i);
/* 119 */               if (iI00IOO2 >= 0) {
/* 122 */                   return j2 + iI00IOO2;
                        }
/* 126 */               IioIoO10iOiI.I000OOo1O("Missing 'startxref' marker.");
/* 3 */                 return 0L;
                    } catch (Throwable th) {
/* 130 */               oiOOiIO1.I000l1(0L);
/* 541 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x0192  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0216  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0172  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00II0oii1o() throws Throwable {
                    boolean z;
                    IIOoi0ooOoO iIOoi0ooOoOI00Iooi00oi;
                    IIi0O10I iIi0O10I;
                    boolean z2;
                    IIOoi0ooOoO iIOoi0ooOoOI00OIO1;
                    IIOoi0ooOoO iIOoi0ooOoOI00OIO12;
                    long jI00II0Ol1O0l;
/* 1 */             boolean z3 = this.I000OiO;
                    try {
/* 6 */                 jI00II0Ol1O0l = I00II0Ol1O0l();
                    } catch (IOException e) {
/* 26 */                if (!z3) {
/* 541 */                   throw e;
                        }
/* 28 */                z = true;
                    }
/* 14 */            if (jI00II0Ol1O0l > -1) {
/* 16 */                iIOoi0ooOoOI00Iooi00oi = I00Iooi00oi(jI00II0Ol1O0l);
/* 20 */                z = false;
/* 30 */                if (iIOoi0ooOoOI00Iooi00oi != null && iIOoi0ooOoOI00Iooi00oi.I0100i(IIi0I0I0o.I0II1Il) == null) {
/* 40 */                    z = z3;
                        }
/* 41 */                if (z) {
/* 371 */                   I00O0o1oo();
/* 374 */                   HashMap map = this.I000lI;
/* 376 */                   if (map != null && !map.isEmpty()) {
/* 384 */                       I001i1lo1io();
                            }
                        } else {
/* 43 */                    I001iOo1i0O();
/* 48 */                    if (this.I000lI != null) {
/* 50 */                        Oo1ol1ll oo1ol1ll = this.I00111O;
/* 60 */                        Iterator it = ((HashMap) oo1ol1ll.I00iiI).values().iterator();
/* 68 */                        while (it.hasNext()) {
/* 78 */                            ((i01oi0o) it.next()).I00000oOI.clear();
                                }
/* 82 */                        oo1ol1ll.I00iiO = null;
/* 84 */                        oo1ol1ll.I00iio = null;
/* 88 */                        oo1ol1ll.I000iOII(1, 0L);
/* 105 */                       for (Map.Entry entry : this.I000lI.entrySet()) {
/* 129 */                           oo1ol1ll.I000o00OoI0I((IIi0O11lioI1) entry.getKey(), ((Long) entry.getValue()).longValue());
                                }
/* 133 */                       oo1ol1ll.I000lI(0L);
/* 138 */                       i01oi0o i01oi0oVar = (i01oi0o) oo1ol1ll.I00iio;
/* 144 */                       iIOoi0ooOoOI00Iooi00oi = i01oi0oVar == null ? null : i01oi0oVar.I00000oIO;
/* 146 */                       IIOolO1li iIOolO1li = this.I0000Il00O;
/* 148 */                       if (iIOolO1li == null) {
/* 363 */                           IioIoO10iOiI.I000OOo1O("You must parse the document first before calling getDocument()");
/* 366 */                           return;
                                }
/* 150 */                       iIOolO1li.I00iio = iIOoi0ooOoOI00Iooi00oi;
/* 152 */                       OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 154 */                       long position = oiOOiIO1.getPosition();
/* 160 */                       oiOOiIO1.I000l1(6L);
                                while (true) {
/* 167 */                           if (oiOOiIO1.I00l0OO0IO()) {
/* 334 */                               oiOOiIO1.I000l1(position);
/* 341 */                               if (!I00OIo(iIOoi0ooOoOI00Iooi00oi)) {
/* 343 */                                   I001i1lo1io();
/* 346 */                                   I00OIo(iIOoi0ooOoOI00Iooi00oi);
/* 349 */                                   z2 = true;
                                        }
                                    } else {
/* 175 */                               if (I00IO1oi11O(I001lloI)) {
/* 184 */                                   oiOOiIO1.I000l1(oiOOiIO1.getPosition() + 7);
                                            try {
/* 187 */                                       I001IIilI0O();
/* 190 */                                       IIOoi0ooOoO iIOoi0ooOoOI000OOo1O = I000OOo1O();
/* 194 */                                       IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0II1Il;
/* 196 */                                       IIOoOiOI iIOoOiOII0100i = iIOoi0ooOoOI000OOo1O.I0100i(iIi0I0I0o);
/* 207 */                                       IIi0O10I iIi0O10I2 = iIOoOiOII0100i instanceof IIi0O10I ? (IIi0O10I) iIOoOiOII0100i : null;
/* 232 */                                       boolean z4 = (iIi0O10I2 == null || (iIOoi0ooOoOI00OIO12 = I00OIO1(iIi0O10I2)) == null || !IIi0I0I0o.I010101Oo1lO.equals(iIOoi0ooOoOI00OIO12.I00o0iI0io1(IIi0I0I0o.I0IilI00l))) ? false : true;
/* 233 */                                       IIi0I0I0o iIi0I0I0o2 = IIi0I0I0o.I01lIi;
/* 235 */                                       IIOoOiOI iIOoOiOII0100i2 = iIOoi0ooOoOI000OOo1O.I0100i(iIi0I0I0o2);
/* 246 */                                       IIi0O10I iIi0O10I3 = iIOoOiOII0100i2 instanceof IIi0O10I ? (IIi0O10I) iIOoOiOII0100i2 : null;
/* 263 */                                       boolean z5 = (iIi0O10I3 == null || (iIOoi0ooOoOI00OIO1 = I00OIO1(iIi0O10I3)) == null || !I00IO1(iIOoi0ooOoOI00OIO1)) ? false : true;
/* 264 */                                       if (z4 && z5) {
/* 268 */                                           iIOoi0ooOoOI00Iooi00oi.I010iIIOlo(iIi0I0I0o, iIi0O10I2);
/* 271 */                                           iIOoi0ooOoOI00Iooi00oi.I010iIIOlo(iIi0I0I0o2, iIi0O10I3);
/* 274 */                                           IIi0I0I0o iIi0I0I0o3 = IIi0I0I0o.I01O1I1;
/* 282 */                                           if (iIOoi0ooOoOI000OOo1O.I00iOIl.containsKey(iIi0I0I0o3)) {
/* 284 */                                               IIOoOiOI iIOoOiOII0100i3 = iIOoi0ooOoOI000OOo1O.I0100i(iIi0I0I0o3);
/* 295 */                                               IIi0O10I iIi0O10I4 = iIOoOiOII0100i3 instanceof IIi0O10I ? (IIi0O10I) iIOoOiOII0100i3 : null;
/* 296 */                                               if (iIi0O10I4 != null && I00OIO1(iIi0O10I4) != null) {
/* 304 */                                                   iIOoi0ooOoOI00Iooi00oi.I010iIIOlo(iIi0I0I0o3, iIi0O10I4);
                                                        }
                                                    }
/* 307 */                                           IIi0I0I0o iIi0I0I0o4 = IIi0I0I0o.I01illiiIill;
/* 315 */                                           if (!iIOoi0ooOoOI000OOo1O.I00iOIl.containsKey(iIi0I0I0o4)) {
                                                        break;
                                                    }
/* 317 */                                           IIOoOiOI iIOoOiOII0100i4 = iIOoi0ooOoOI000OOo1O.I0100i(iIi0I0I0o4);
/* 323 */                                           if (!(iIOoOiOII0100i4 instanceof IIOoIilO)) {
                                                        break;
                                                    }
/* 325 */                                           iIOoi0ooOoOI00Iooi00oi.I010iIIOlo(iIi0I0I0o4, iIOoOiOII0100i4);
                                                    break;
                                                }
                                            } catch (IOException unused) {
                                                continue;
                                            }
                                        }
/* 329 */                               oiOOiIO1.read();
                                    }
                                }
/* 351 */                       z2 = false;
/* 352 */                       I00O0o1oo();
/* 355 */                       if (!z2) {
/* 357 */                           I001i1lo1io();
                                }
                            } else {
/* 367 */                       iIOoi0ooOoOI00Iooi00oi = null;
                            }
/* 368 */                   this.I000l1 = true;
                        }
/* 401 */               for (IIOoOiOI iIOoOiOI : iIOoi0ooOoOI00Iooi00oi.I00iOIl.values()) {
/* 411 */                   if (iIOoOiOI instanceof IIi0O10I) {
/* 413 */                       IIi0O10I iIi0O10I5 = (IIi0O10I) iIOoOiOI;
/* 419 */                       I00IoO0(iIi0O10I5.I00iiO, iIi0O10I5.I00iiI, false);
                            }
                        }
/* 425 */               IIOoOiOI iIOoOiOII0100i5 = iIOoi0ooOoOI00Iooi00oi.I0100i(IIi0I0I0o.I0II1Il);
/* 434 */               iIi0O10I = iIOoOiOII0100i5 instanceof IIi0O10I ? (IIi0O10I) iIOoOiOII0100i5 : null;
/* 436 */               if (iIi0O10I != null) {
/* 537 */                   IioIoO10iOiI.I000OOo1O("Missing root object specification in trailer.");
/* 540 */                   return;
                        }
/* 438 */               IIOoOiOI iIOoOiOI2 = iIi0O10I.I00iOIl;
/* 442 */               if (!(iIOoOiOI2 instanceof IIOoi0ooOoO)) {
/* 531 */                   IOOlIIilOl0.I000l1("Expected root dictionary, but got this: ", iIOoOiOI2);
/* 534 */                   return;
                        }
/* 444 */               IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) iIOoOiOI2;
/* 446 */               if (z3) {
/* 448 */                   IIi0I0I0o iIi0I0I0o5 = IIi0I0I0o.I0IilI00l;
/* 456 */                   if (!iIOoi0ooOoO.I00iOIl.containsKey(iIi0I0I0o5)) {
/* 460 */                       iIOoi0ooOoO.I010iIIOlo(iIi0I0I0o5, IIi0I0I0o.I010101Oo1lO);
                            }
                        }
/* 463 */               I00Io1lO(iIOoi0ooOoO);
/* 468 */               IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoOI00Iooi00oi.I00oII(IIi0I0I0o.I01lIi);
/* 474 */               if (iIOoOiOII00oII instanceof IIOoi0ooOoO) {
/* 478 */                   I00Io1lO((IIOoi0ooOoO) iIOoOiOII00oII);
                        }
/* 483 */               if (this.I000l1) {
/* 487 */                   IIOoOiOI iIOoOiOII00oII2 = iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I11O000oO);
/* 493 */                   if (iIOoOiOII00oII2 instanceof IIOoi0ooOoO) {
/* 502 */                       I001l0I00((IIOoi0ooOoO) iIOoOiOII00oII2, new HashSet());
                            }
                        }
/* 513 */               if (!(iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I11O000oO) instanceof IIOoi0ooOoO)) {
/* 525 */                   IioIoO10iOiI.I000OOo1O("Page tree root must be a dictionary");
/* 528 */                   return;
                        } else {
/* 517 */                   this.I0000Il00O.getClass();
/* 520 */                   this.I000iOII = true;
/* 522 */                   return;
                        }
                    }
/* 24 */            z = z3;
/* 29 */            iIOoi0ooOoOI00Iooi00oi = null;
/* 30 */            if (iIOoi0ooOoOI00Iooi00oi != null) {
/* 40 */                z = z3;
                    }
/* 41 */            if (z) {
                    }
/* 401 */           while (r5.hasNext()) {
                    }
/* 425 */           IIOoOiOI iIOoOiOII0100i52 = iIOoi0ooOoOI00Iooi00oi.I0100i(IIi0I0I0o.I0II1Il);
/* 434 */           if (iIOoOiOII0100i52 instanceof IIi0O10I) {
                    }
/* 436 */           if (iIi0O10I != null) {
                    }
                }

                public final boolean I00IO1oi11O(char[] cArr) throws IOException {
/* 1 */             OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 3 */             long position = oiOOiIO1.getPosition();
/* 7 */             int length = cArr.length;
/* 8 */             boolean z = false;
/* 9 */             int i = 0;
                    while (true) {
/* 10 */                if (i >= length) {
/* 24 */                    z = true;
                            break;
                        }
/* 18 */                if (oiOOiIO1.read() != cArr[i]) {
                            break;
                        }
/* 21 */                i++;
                    }
/* 25 */            oiOOiIO1.I000l1(position);
/* 49 */            return z;
                }

                public final void I00IioO0OiOi() {
                    try {
/* 9 */                 if (!I00IoIO0lI("%PDF-", "1.4") && !I00IoIO0lI("%FDF-", "1.0")) {
/* 29 */                    throw new IOException("Error: Header doesn't contain versioninfo");
                        }
/* 34 */                if (this.I000iOII) {
/* 39 */                    return;
                        }
/* 36 */                I00II0oii1o();
                    } catch (Throwable th) {
/* 40 */                IIOolO1li iIOolO1li = this.I0000Il00O;
/* 42 */                if (iIOolO1li != null) {
/* 44 */                    io0iolo.I00000oOI(iIOolO1li);
/* 48 */                    this.I0000Il00O = null;
                        }
/* 113 */               throw th;
                    }
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0232  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0239  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIi0io1lIo I00IlilI0i0i(IIOoi0ooOoO iIOoi0ooOoO) throws IOException {
                    IIi0IoOo iIi0IoOo;
                    IIi0IoOo iIi0IoOo2;
                    boolean z;
                    IIi0io1lIo iIi0io1lIo;
                    IIi0OI0 iIi0OI0I010o0o0oO;
                    String strI0010o;
                    IIi0io1lIo iIi0io1lIo2;
                    boolean zEquals;
                    boolean z2;
/* 9 */             OiOOiI1lllOo oiOOiI1lllOo = this.I0000Il00O.I00io1l;
/* 11 */            IIi0io1lIo iIi0io1lIo3 = new IIi0io1lIo();
/* 16 */            int i = 0;
/* 17 */            iIi0io1lIo3.I010i10l(IIi0I0I0o.I01o00iOi, 0);
/* 24 */            if (oiOOiI1lllOo == null) {
                        try {
/* 31 */                    O1ilIl1l0I o1ilIl1l0I = new O1ilIl1l0I(i);
/* 34 */                    o1ilIl1l0I.I00iiI = true;
/* 36 */                    VarHandle.storeStoreFence();
/* 39 */                    oiOOiI1lllOo = new OiOOiI1lllOo(o1ilIl1l0I);
                        } catch (IOException e) {
/* 62 */                    Log.e("PdfBox-Android", "Unexpected exception occurred creating main memory scratch file instance: " + e.getMessage());
/* 65 */                    oiOOiI1lllOo = null;
                        }
                    }
/* 66 */            iIi0io1lIo3.I00iiO = oiOOiI1lllOo;
/* 68 */            VarHandle.storeStoreFence();
/* 85 */            for (Map.Entry entry : iIOoi0ooOoO.I00iOIl.entrySet()) {
/* 105 */               iIi0io1lIo3.I010iIIOlo((IIi0I0I0o) entry.getKey(), (IIOoOiOI) entry.getValue());
                    }
/* 109 */           I0010o();
/* 112 */           I001IO000();
/* 117 */           IIOoOiOI iIOoOiOII0100i = iIOoi0ooOoO.I0100i(IIi0I0I0o.I01o00iOi);
/* 123 */           IIi0I0I0o iIi0I0I0oI00o0iI0io1 = iIOoi0ooOoO.I00o0iI0io1(IIi0I0I0o.I0IilI00l);
/* 127 */           OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 129 */           if (iIOoOiOII0100i != null) {
/* 135 */               if (iIOoOiOII0100i instanceof IIi0IoOo) {
/* 137 */                   iIi0IoOo = (IIi0IoOo) iIOoOiOII0100i;
                        } else {
/* 143 */                   if (!(iIOoOiOII0100i instanceof IIi0O10I)) {
/* 663 */                       IioIoO10iOiI.I000OOo1O("Wrong type of length object: ".concat(iIOoOiOII0100i.getClass().getSimpleName()));
/* 21 */                        return null;
                            }
/* 145 */                   IIi0O10I iIi0O10I = (IIi0O10I) iIOoOiOII0100i;
/* 147 */                   Object obj = iIi0O10I.I00iOIl;
/* 149 */                   if (obj == null) {
/* 151 */                       long position = oiOOiIO1.getPosition();
/* 165 */                       I00IoO0(iIi0O10I.I00iiO, iIi0O10I.I00iiI, IIi0I0I0o.I0I0Oollll1i.equals(iIi0I0I0oI00o0iI0io1));
/* 168 */                       oiOOiIO1.I000l1(position);
/* 171 */                       obj = iIi0O10I.I00iOIl;
                            }
/* 173 */                   if (obj == null) {
/* 645 */                       IioIoO10iOiI.I000OOo1O("Length object content was not read.");
/* 21 */                        return null;
                            }
/* 177 */                   if (IIi0II0l0o.I00iOIl == obj) {
/* 210 */                       Log.w("PdfBox-Android", "Length object (" + iIi0O10I.I00iiI + " " + iIi0O10I.I00iiO + ") not found");
/* 131 */                       iIi0IoOo2 = null;
                            } else {
/* 216 */                       if (!(obj instanceof IIi0IoOo)) {
/* 613 */                           StringBuilder sb = new StringBuilder("Wrong type of referenced length object ");
/* 616 */                           sb.append(iIi0O10I);
/* 623 */                           String simpleName = obj.getClass().getSimpleName();
/* 629 */                           sb.append(": ");
/* 632 */                           sb.append(simpleName);
/* 642 */                           throw new IOException(sb.toString());
                                }
/* 219 */                       iIi0IoOo = (IIi0IoOo) obj;
                            }
                        }
/* 139 */               iIi0IoOo2 = iIi0IoOo;
                    } else {
/* 131 */               iIi0IoOo2 = null;
                    }
/* 222 */           boolean z3 = this.I000OiO;
/* 224 */           if (iIi0IoOo2 == null) {
/* 226 */               if (!z3) {
/* 252 */                   IioIoO10iOiI.I000OOo1O("Missing length for stream.");
/* 21 */                    return null;
                        }
/* 246 */               Log.w("PdfBox-Android", "The stream doesn't provide any stream length, using fallback readUntilEnd, at offset " + oiOOiIO1.getPosition());
                    }
                    try {
/* 256 */               if (iIi0IoOo2 != null) {
/* 258 */                   long jI00lll10 = iIi0IoOo2.I00lll10();
/* 262 */                   long position2 = oiOOiIO1.getPosition();
/* 266 */                   long j = position2 + jI00lll10;
/* 279 */                   if (j > this.I000OOo1O) {
/* 283 */                       StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(position2, "The end of the stream is out of range, using workaround to read the stream, stream start position: ", ", length: ");
/* 287 */                       sbI001iOo1i0O.append(jI00lll10);
/* 290 */                       sbI001iOo1i0O.append(", expected end position: ");
/* 293 */                       sbI001iOo1i0O.append(j);
/* 300 */                       Log.w("PdfBox-Android", sbI001iOo1i0O.toString());
/* 303 */                       z = z3;
/* 305 */                       iIi0io1lIo2 = iIi0io1lIo3;
/* 307 */                       z2 = false;
                            } else {
/* 310 */                       oiOOiIO1.I000l1(j);
/* 313 */                       I001IIilI0O();
/* 316 */                       int iPeek = oiOOiIO1.peek();
/* 320 */                       byte[] bArr = I001iOo1i0O;
/* 322 */                       z = z3;
/* 326 */                       if (iPeek == bArr[0]) {
/* 330 */                           byte[] bArr2 = new byte[9];
/* 332 */                           iIi0io1lIo2 = iIi0io1lIo3;
/* 336 */                           int i2 = oiOOiIO1.read(bArr2, 0, 9);
/* 342 */                           for (int i3 = 9; i2 < i3; i3 = 9) {
/* 346 */                               int i4 = oiOOiIO1.read(bArr2, i2, 9 - i2);
/* 350 */                               if (i4 < 0) {
                                            break;
                                        }
/* 353 */                               i2 += i4;
                                    }
/* 357 */                           zEquals = Arrays.equals(bArr, bArr2);
/* 361 */                           oiOOiIO1.I000O01llI0(i2);
                                } else {
/* 365 */                           iIi0io1lIo2 = iIi0io1lIo3;
/* 367 */                           zEquals = false;
                                }
/* 368 */                       if (zEquals) {
/* 394 */                           z2 = true;
                                } else {
/* 372 */                           StringBuilder sbI001iOo1i0O2 = Oi010OO0.I001iOo1i0O(position2, "The end of the stream doesn't point to the correct offset, using workaround to read the stream, stream start position: ", ", length: ");
/* 376 */                           sbI001iOo1i0O2.append(jI00lll10);
/* 379 */                           sbI001iOo1i0O2.append(", expected end position: ");
/* 382 */                           sbI001iOo1i0O2.append(j);
/* 389 */                           Log.w("PdfBox-Android", sbI001iOo1i0O2.toString());
/* 392 */                           z2 = false;
                                }
/* 395 */                       oiOOiIO1.I000l1(position2);
                            }
/* 398 */                   if (z2) {
/* 400 */                       IIi0OI0 iIi0OI0I010o0o0oO2 = iIi0io1lIo2.I010o0o0oO();
                                try {
/* 404 */                           I00OI1(iIi0OI0I010o0o0oO2, iIi0IoOo2);
/* 407 */                           iIi0OI0I010o0o0oO2.close();
/* 412 */                           iIi0io1lIo = iIi0io1lIo2;
/* 414 */                           iIi0io1lIo.I010iIIOlo(IIi0I0I0o.I01o00iOi, iIi0IoOo2);
/* 468 */                           strI0010o = I0010o();
/* 478 */                           if (!strI0010o.equals("endobj") && z) {
/* 500 */                               Log.w("PdfBox-Android", "stream ends with 'endobj' instead of 'endstream' at offset " + oiOOiIO1.getPosition());
/* 504 */                               oiOOiIO1.I000O01llI0(6);
                                    } else if (strI0010o.length() <= 9 && z && strI0010o.startsWith("endstream")) {
/* 530 */                               StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("stream ends with '", strI0010o, "' instead of 'endstream' at offset ");
/* 538 */                               sbI001IIilI0O.append(oiOOiIO1.getPosition());
/* 545 */                               Log.w("PdfBox-Android", sbI001IIilI0O.toString());
/* 559 */                               oiOOiIO1.I000O01llI0(strI0010o.substring(9).getBytes(IO1IIilll1I.I0000O).length);
                                    } else if (!strI0010o.equals("endstream")) {
/* 576 */                               StringBuilder sbI001IIilI0O2 = IIlIOloOOO.I001IIilI0O("Error reading stream, expected='endstream' actual='", strI0010o, "' at offset ");
/* 584 */                               sbI001IIilI0O2.append(oiOOiIO1.getPosition());
/* 594 */                               throw new IOException(sbI001IIilI0O2.toString());
                                    }
/* 569 */                           return iIi0io1lIo;
                                } catch (Throwable th) {
/* 421 */                           iIi0OI0I010o0o0oO2.close();
/* 426 */                           iIi0io1lIo2.I010iIIOlo(IIi0I0I0o.I01o00iOi, iIi0IoOo2);
/* 429 */                           throw th;
                                }
                            }
/* 430 */                   iIi0io1lIo = iIi0io1lIo2;
                        } else {
/* 433 */                   z = z3;
/* 435 */                   iIi0io1lIo = iIi0io1lIo3;
                        }
/* 442 */               Il0O0i il0O0i = new Il0O0i(iIi0OI0I010o0o0oO);
/* 446 */               il0O0i.I00iOIl = false;
/* 448 */               il0O0i.I00iiI = false;
/* 450 */               il0O0i.I00iiO = 0;
/* 453 */               il0O0i.I00iio = true;
/* 455 */               I00O10llo(il0O0i);
/* 458 */               iIi0OI0I010o0o0oO.close();
/* 461 */               if (iIi0IoOo2 != null) {
/* 465 */                   iIi0io1lIo.I010iIIOlo(IIi0I0I0o.I01o00iOi, iIi0IoOo2);
                        }
/* 468 */               strI0010o = I0010o();
/* 478 */               if (!strI0010o.equals("endobj")) {
/* 516 */                   if (strI0010o.length() <= 9) {
/* 567 */                       if (!strI0010o.equals("endstream")) {
                                }
                            }
                        }
/* 569 */               return iIi0io1lIo;
                    } catch (Throwable th2) {
/* 596 */               iIi0OI0I010o0o0oO.close();
/* 599 */               if (iIi0IoOo2 != null) {
/* 603 */                   iIi0io1lIo.I010iIIOlo(IIi0I0I0o.I01o00iOi, iIi0IoOo2);
                        }
/* 606 */               throw th2;
                    }
/* 436 */           iIi0OI0I010o0o0oO = iIi0io1lIo.I010o0o0oO();
                }

                /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x0193, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O(r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x01a7, code lost:
                
                    if (r1.isEmpty() == false) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
                
                    r14 = ((java.util.List) r1.remove(r1.firstKey())).iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
                
                    if (r14.hasNext() == false) goto L80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x01be, code lost:
                
                    r6 = (p000.IIi0O10I) r14.next();
                    r7 = I00IoO0(r6.I00iiO, r6.I00iiI, false);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x01cc, code lost:
                
                    if (r7 == null) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x01ce, code lost:
                
                    r6.I00iOIl = r7;
                    I001i1O0Ol(r0, r7, r3);
                    r2.add(java.lang.Long.valueOf((r6.I00iiI << 32) | r6.I00iiO));
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00Io1lO(IIOoi0ooOoO iIOoi0ooOoO) throws IOException {
/* 3 */             LinkedList linkedList = new LinkedList();
/* 8 */             TreeMap treeMap = new TreeMap();
/* 13 */            HashSet hashSet = new HashSet();
/* 18 */            HashSet hashSet2 = new HashSet();
/* 27 */            Iterator it = iIOoi0ooOoO.I00iOIl.values().iterator();
/* 35 */            while (it.hasNext()) {
/* 43 */                I001i1O0Ol(linkedList, (IIOoOiOI) it.next(), hashSet2);
                    }
                    loop1: while (true) {
/* 51 */                if (!linkedList.isEmpty() || !treeMap.isEmpty()) {
                            while (true) {
/* 63 */                        IIOoOiOI iIOoOiOI = (IIOoOiOI) linkedList.poll();
/* 68 */                        if (iIOoOiOI == null) {
                                    break;
                                }
/* 72 */                        if (iIOoOiOI instanceof IIOoi0ooOoO) {
/* 82 */                            Iterator it2 = ((IIOoi0ooOoO) iIOoOiOI).I00iOIl.values().iterator();
/* 90 */                            while (it2.hasNext()) {
/* 98 */                                I001i1O0Ol(linkedList, (IIOoOiOI) it2.next(), hashSet2);
                                    }
                                } else if (iIOoOiOI instanceof IIOoIilO) {
/* 110 */                           Iterator it3 = ((IIOoIilO) iIOoOiOI).I00iOIl.iterator();
/* 118 */                           while (it3.hasNext()) {
/* 126 */                               I001i1O0Ol(linkedList, (IIOoOiOI) it3.next(), hashSet2);
                                    }
                                } else if (iIOoOiOI instanceof IIi0O10I) {
/* 134 */                           IIi0O10I iIi0O10I = (IIi0O10I) iIOoOiOI;
/* 136 */                           long j = iIi0O10I.I00iiI;
/* 140 */                           int i = iIi0O10I.I00iiO;
/* 143 */                           long j2 = (j << 32) | i;
/* 146 */                           IIi0O11lioI1 iIi0O11lioI1 = new IIi0O11lioI1(i, j);
/* 157 */                           if (hashSet.contains(Long.valueOf(j2))) {
                                        continue;
                                    } else {
/* 167 */                               Long l = (Long) this.I0000Il00O.I00iiI.get(iIi0O11lioI1);
/* 169 */                               boolean z = this.I000OiO;
/* 171 */                               if (l == null && z) {
/* 175 */                                   I001iOo1i0O();
/* 184 */                                   l = (Long) this.I000lI.get(iIi0O11lioI1);
/* 186 */                                   if (l != null) {
/* 188 */                                       iIi0O11lioI1.toString();
/* 195 */                                       this.I0000Il00O.I00iiI.put(iIi0O11lioI1, l);
                                            }
                                        }
/* 198 */                               if (l == null || l.longValue() == 0) {
/* 416 */                                   this.I0000Il00O.I00ioIO(iIi0O11lioI1).I00iOIl = IIi0II0l0o.I00iOIl;
                                        } else if (l.longValue() > 0) {
/* 222 */                                   treeMap.put(l, Collections.singletonList(iIi0O10I));
                                        } else {
/* 236 */                                   IIi0O11lioI1 iIi0O11lioI12 = new IIi0O11lioI1(0, (int) (-l.longValue()));
/* 247 */                                   Long l2 = (Long) this.I0000Il00O.I00iiI.get(iIi0O11lioI12);
/* 249 */                                   if (l2 == null || l2.longValue() <= 0) {
/* 265 */                                       if (z) {
/* 267 */                                           I001iOo1i0O();
/* 276 */                                           l2 = (Long) this.I000lI.get(iIi0O11lioI12);
/* 278 */                                           if (l2 != null) {
/* 280 */                                               iIi0O11lioI12.toString();
/* 287 */                                               this.I0000Il00O.I00iiI.put(iIi0O11lioI12, l2);
                                                    } else {
/* 372 */                                               Log.w("PdfBox-Android", "Invalid object stream xref object reference for key '" + iIi0O11lioI1 + "': " + l2);
                                                    }
                                                } else {
/* 391 */                                           String str = "Invalid object stream xref object reference for key '" + iIi0O11lioI1 + "': " + l2;
/* 395 */                                           if (!z || l2 != null) {
                                                        break loop1;
                                                    } else {
/* 399 */                                               Log.w("PdfBox-Android", str);
                                                    }
                                                }
                                            }
/* 294 */                                   List arrayList = (List) treeMap.get(l2);
/* 296 */                                   if (arrayList == null) {
/* 300 */                                       arrayList = new ArrayList();
/* 303 */                                       treeMap.put(l2, arrayList);
                                            } else if (!(arrayList instanceof ArrayList)) {
/* 320 */                                       StringBuilder sb = new StringBuilder();
/* 323 */                                       sb.append(iIi0O10I);
/* 328 */                                       sb.append(" cannot be assigned to offset ");
/* 331 */                                       sb.append(l2);
/* 334 */                                       Object obj = arrayList.get(0);
/* 340 */                                       sb.append(", this belongs to ");
/* 343 */                                       sb.append(obj);
/* 353 */                                       throw new IOException(sb.toString());
                                            }
/* 311 */                                   arrayList.add(iIi0O10I);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
/* 426 */                   return;
                        }
                    }
                }

                public final void I00Io1o110i(IIi0O10I iIi0O10I) throws IOException {
/* 6 */             I00IoO0(iIi0O10I.I00iiO, iIi0O10I.I00iiI, true);
/* 9 */             IIOoOiOI iIOoOiOI = iIi0O10I.I00iOIl;
/* 13 */            if (!(iIOoOiOI instanceof IIOoi0ooOoO)) {
/* 186 */               throw new IOException("Dictionary object expected at offset " + this.I0001Ioi1lo.getPosition());
                    }
/* 31 */            for (IIOoOiOI iIOoOiOI2 : ((IIOoi0ooOoO) iIOoOiOI).I00iOIl.values()) {
/* 41 */                if (iIOoOiOI2 instanceof IIi0O10I) {
/* 43 */                    IIi0O10I iIi0O10I2 = (IIi0O10I) iIOoOiOI2;
/* 47 */                    if (iIi0O10I2.I00iOIl == null) {
/* 49 */                        I00Io1o110i(iIi0O10I2);
                            }
                        }
                    }
                }

                public final boolean I00IoIO0lI(String str, String str2) throws IOException, NumberFormatException {
/* 1 */             String strI00100l0 = I00100l0();
/* 10 */            if (!strI00100l0.contains(str)) {
/* 12 */                strI00100l0 = I00100l0();
/* 20 */                while (!strI00100l0.contains(str) && (strI00100l0.length() <= 0 || !Character.isDigit(strI00100l0.charAt(0)))) {
/* 39 */                    strI00100l0 = I00100l0();
                        }
                    }
/* 44 */            boolean zContains = strI00100l0.contains(str);
/* 50 */            OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 52 */            if (!zContains) {
/* 54 */                oiOOiIO1.I000l1(0L);
/* 9 */                 return false;
                    }
/* 58 */            int iIndexOf = strI00100l0.indexOf(str);
/* 62 */            if (iIndexOf > 0) {
/* 64 */                strI00100l0 = strI00100l0.substring(iIndexOf);
                    }
/* 72 */            if (strI00100l0.startsWith(str) && !strI00100l0.matches(str.concat("\\d.\\d"))) {
/* 96 */                if (strI00100l0.length() < str.length() + 3) {
/* 98 */                    strI00100l0 = str.concat(str2);
                        } else {
/* 119 */                   String strConcat = strI00100l0.substring(str.length() + 3, strI00100l0.length()).concat("\n");
/* 129 */                   strI00100l0 = strI00100l0.substring(0, str.length() + 3);
/* 140 */                   oiOOiIO1.I000O01llI0(strConcat.getBytes(IO1IIilll1I.I0000O).length);
                        }
                    }
/* 144 */           float f = -1.0f;
                    try {
/* 148 */               String[] strArrSplit = strI00100l0.split("-");
/* 154 */               if (strArrSplit.length == 2) {
/* 158 */                   f = Float.parseFloat(strArrSplit[1]);
                        }
                    } catch (NumberFormatException unused) {
                    }
/* 165 */           if (f < 0.0f && !this.I000OiO) {
/* 178 */               IioIoO10iOiI.I000OOo1O("Error getting header version: ".concat(strI00100l0));
/* 9 */                 return false;
                    }
/* 184 */           this.I0000Il00O.getClass();
/* 187 */           oiOOiIO1.I000l1(0L);
/* 143 */           return true;
                }

                public final IIOoOiOI I00IoO0(int i, long j, boolean z) throws IOException {
/* 9 */             IIi0O11lioI1 iIi0O11lioI1 = new IIi0O11lioI1(i, j);
/* 14 */            IIi0O10I iIi0O10II00ioIO = this.I0000Il00O.I00ioIO(iIi0O11lioI1);
/* 20 */            if (iIi0O10II00ioIO.I00iOIl == null) {
/* 30 */                Long l = (Long) this.I0000Il00O.I00iiI.get(iIi0O11lioI1);
/* 32 */                boolean z2 = this.I000OiO;
/* 34 */                if (l == null && z2) {
/* 38 */                    I001iOo1i0O();
/* 47 */                    l = (Long) this.I000lI.get(iIi0O11lioI1);
/* 49 */                    if (l != null) {
/* 51 */                        iIi0O11lioI1.toString();
/* 58 */                        this.I0000Il00O.I00iiI.put(iIi0O11lioI1, l);
                            }
                        }
/* 65 */                if (z && (l == null || l.longValue() <= 0)) {
/* 103 */                   throw new IOException("Object must be defined and must not be compressed object: " + j + ":" + i);
                        }
/* 106 */               if (iIi0O10II00ioIO.I00iio) {
/* 553 */                   throw new IOException("Possible recursion detected when dereferencing object " + j + " " + i);
                        }
/* 109 */               iIi0O10II00ioIO.I00iio = true;
/* 111 */               if (l == null && z2 && this.I000lI == null) {
/* 119 */                   I001iOo1i0O();
/* 128 */                   if (!this.I000lI.isEmpty()) {
/* 132 */                       HashMap map = this.I0000Il00O.I00iiI;
/* 148 */                       for (Map.Entry entry : this.I000lI.entrySet()) {
/* 160 */                           IIi0O11lioI1 iIi0O11lioI12 = (IIi0O11lioI1) entry.getKey();
/* 166 */                           if (!map.containsKey(iIi0O11lioI12)) {
/* 172 */                               map.put(iIi0O11lioI12, entry.getValue());
                                    }
                                }
/* 181 */                       l = (Long) map.get(iIi0O11lioI1);
                            }
                        }
/* 183 */               if (l == null) {
/* 187 */                   iIi0O10II00ioIO.I00iOIl = IIi0II0l0o.I00iOIl;
                        } else if (l.longValue() > 0) {
/* 199 */                   long jLongValue = l.longValue();
/* 203 */                   OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 205 */                   oiOOiIO1.I000l1(jLongValue);
/* 208 */                   long jI0010I0i = I0010I0i();
/* 212 */                   int iI000oI1ioi = I000oI1ioi();
/* 218 */                   I000o00OoI0I(I001lllioOl);
/* 223 */                   int i2 = iIi0O11lioI1.I00iiI;
/* 225 */                   if (jI0010I0i != j || iI000oI1ioi != i2) {
/* 512 */                       throw new IOException("XREF for " + j + ":" + i2 + " points to wrong object: " + jI0010I0i + ":" + iI000oI1ioi + " at offset " + l);
                            }
/* 229 */                   I001IIilI0O();
/* 232 */                   IIOoOiOI iIOoOiOII000l1 = I000l1();
/* 236 */                   String strI0010o = I0010o();
/* 248 */                   if (strI0010o.equals("stream")) {
/* 257 */                       oiOOiIO1.I000O01llI0(strI0010o.getBytes(IO1IIilll1I.I0000O).length);
/* 262 */                       if (!(iIOoOiOII000l1 instanceof IIOoi0ooOoO)) {
/* 354 */                           throw new IOException("Stream not preceded by dictionary (offset: " + l + ").");
                                }
/* 266 */                       IIi0io1lIo iIi0io1lIoI00IlilI0i0i = I00IlilI0i0i((IIOoi0ooOoO) iIOoOiOII000l1);
/* 270 */                       Oii0OIIO oii0OIIO = this.I0010I0i;
/* 272 */                       if (oii0OIIO != null) {
/* 283 */                           oii0OIIO.I0000Il00O(iIi0io1lIoI00IlilI0i0i, iIi0O11lioI1.I00iOIl, i2);
                                }
/* 286 */                       I001IIilI0O();
/* 289 */                       strI0010o = I00100l0();
/* 297 */                       if (!strI0010o.startsWith("endobj") && strI0010o.startsWith("endstream")) {
/* 313 */                           strI0010o = strI0010o.substring(9).trim();
/* 321 */                           if (strI0010o.length() == 0) {
/* 323 */                               strI0010o = I00100l0();
                                    }
                                }
/* 327 */                       iIOoOiOII000l1 = iIi0io1lIoI00IlilI0i0i;
                            } else {
/* 355 */                       Oii0OIIO oii0OIIO2 = this.I0010I0i;
/* 357 */                       if (oii0OIIO2 != null) {
/* 366 */                           oii0OIIO2.I00000oIO(iIOoOiOII000l1, iIi0O11lioI1.I00iOIl, i2);
                                }
                            }
/* 369 */                   iIi0O10II00ioIO.I00iOIl = iIOoOiOII000l1;
/* 375 */                   if (!strI0010o.startsWith("endobj")) {
/* 385 */                       if (!z2) {
/* 464 */                           throw new IOException("Object (" + jI0010I0i + ":" + iI000oI1ioi + ") at offset " + l + " does not end with 'endobj' but with '" + strI0010o + "'");
                                }
/* 422 */                       Log.w("PdfBox-Android", "Object (" + jI0010I0i + ":" + iI000oI1ioi + ") at offset " + l + " does not end with 'endobj' but with '" + strI0010o + "'");
                            }
                        } else {
/* 519 */                   I00IoiI((int) (-l.longValue()));
                        }
/* 523 */               iIi0O10II00ioIO.I00iio = false;
                    }
/* 554 */           return iIi0O10II00ioIO.I00iOIl;
                }

                public final void I00IoiI(int i) throws IOException {
/* 1 */             boolean z = this.I000OiO;
/* 6 */             IIOoOiOI iIOoOiOII00IoO0 = I00IoO0(0, i, true);
/* 12 */            if (iIOoOiOII00IoO0 instanceof IIi0io1lIo) {
                        try {
/* 20 */                    OIliioo1i0 oIliioo1i0 = new OIliioo1i0((IIi0io1lIo) iIOoOiOII00IoO0, this.I0000Il00O);
                            try {
/* 23 */                        oIliioo1i0.I001i1O0Ol();
/* 28 */                        Iterator it = oIliioo1i0.I0000oI00.iterator();
/* 36 */                        while (it.hasNext()) {
/* 42 */                            IIi0O10I iIi0O10I = (IIi0O10I) it.next();
/* 50 */                            IIi0O11lioI1 iIi0O11lioI1 = new IIi0O11lioI1(iIi0O10I.I00iiO, iIi0O10I.I00iiI);
/* 57 */                            i01oi0o i01oi0oVar = (i01oi0o) this.I00111O.I00iio;
/* 69 */                            Long l = (Long) (i01oi0oVar == null ? null : i01oi0oVar.I00000oOI).get(iIi0O11lioI1);
/* 71 */                            if (l != null && l.longValue() == (-i)) {
/* 91 */                                this.I0000Il00O.I00ioIO(iIi0O11lioI1).I00iOIl = iIi0O10I.I00iOIl;
                                    }
                                }
                            } catch (IOException e) {
/* 95 */                        if (!z) {
/* 98 */                            throw e;
                                }
                            }
                        } catch (IOException e2) {
/* 100 */                   if (!z) {
/* 127 */                       throw e2;
                            }
/* 123 */                   Log.e("PdfBox-Android", "object stream " + i + " could not be parsed due to an exception", e2);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:112:0x02ce  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x0438  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x0420 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIOoi0ooOoO I00Iooi00oi(long j) throws IOException, NumberFormatException {
                    long jI00100o1O0lo;
                    IIi0O11lioI1 iIi0O11lioI1;
                    HashSet hashSet;
                    long jI00O0i0ii;
                    IIOoi0ooOoO iIOoi0ooOoO;
/* 3 */             OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 7 */             oiOOiIO1.I000l1(j);
/* 16 */            long j2 = -1;
/* 18 */            if (I00IO1oi11O(I001i1lo1io)) {
/* 20 */                I0010o();
/* 23 */                I001IIilI0O();
/* 26 */                jI00100o1O0lo = I00100o1O0lo();
                    } else {
/* 31 */                jI00100o1O0lo = -1;
                    }
/* 32 */            long j3 = 0;
/* 34 */            long jMax = Math.max(0L, jI00100o1O0lo);
/* 38 */            long jI001lIiIIo1O = I001lIiIIo1O(jMax);
/* 44 */            if (jI001lIiIIo1O > -1) {
/* 46 */                jMax = jI001lIiIIo1O;
                    }
/* 49 */            this.I0000Il00O.getClass();
/* 54 */            HashSet hashSet2 = new HashSet();
/* 57 */            long j4 = jMax;
                    loop0: while (true) {
/* 60 */                boolean z = this.I000OiO;
/* 62 */                long j5 = j2;
/* 66 */                Oo1ol1ll oo1ol1ll = this.I00111O;
/* 68 */                if (j4 <= j3) {
/* 751 */                   long j6 = j3;
/* 759 */                   oo1ol1ll.I000lI(jMax);
/* 764 */                   i01oi0o i01oi0oVar = (i01oi0o) oo1ol1ll.I00iio;
/* 771 */                   IIOoi0ooOoO iIOoi0ooOoO2 = i01oi0oVar == null ? null : i01oi0oVar.I00000oIO;
/* 775 */                   this.I0000Il00O.I00iio = iIOoi0ooOoO2;
/* 777 */                   if (z) {
/* 786 */                       HashMap map = i01oi0oVar == null ? null : i01oi0oVar.I00000oOI;
/* 788 */                       if (map != null) {
/* 794 */                           HashMap map2 = new HashMap();
/* 799 */                           HashSet hashSet3 = new HashSet();
/* 806 */                           Iterator it = map.entrySet().iterator();
                                    while (true) {
/* 814 */                               if (it.hasNext()) {
/* 820 */                                   Map.Entry entry = (Map.Entry) it.next();
/* 826 */                                   IIi0O11lioI1 iIi0O11lioI12 = (IIi0O11lioI1) entry.getKey();
/* 832 */                                   Long l = (Long) entry.getValue();
/* 834 */                                   if (l != null && l.longValue() >= j6) {
/* 844 */                                       long jLongValue = l.longValue();
/* 852 */                                       if (jLongValue >= 6) {
                                                    try {
/* 858 */                                               oiOOiIO1.I000l1(jLongValue);
/* 861 */                                               I001IO000();
/* 870 */                                               if (oiOOiIO1.getPosition() == jLongValue) {
/* 874 */                                                   oiOOiIO1.I000l1(jLongValue - 1);
/* 883 */                                                   if (oiOOiIO1.getPosition() < jLongValue) {
/* 889 */                                                       if (I0000Il00O()) {
/* 899 */                                                           long position = oiOOiIO1.getPosition() - 1;
/* 901 */                                                           oiOOiIO1.I000l1(position);
/* 908 */                                                           while (I0000Il00O()) {
/* 910 */                                                               position--;
/* 912 */                                                               oiOOiIO1.I000l1(position);
                                                                    }
/* 926 */                                                           IIi0O11lioI1 iIi0O11lioI13 = new IIi0O11lioI1(I000oI1ioi(), I0010I0i());
/* 933 */                                                           Long l2 = (Long) map.get(iIi0O11lioI13);
/* 935 */                                                           if (l2 == null || l2.longValue() <= j6 || Math.abs(jLongValue - l2.longValue()) >= 10) {
/* 968 */                                                               oiOOiIO1.I000l1(jLongValue);
                                                                    } else {
/* 961 */                                                               iIi0O11lioI13.toString();
/* 964 */                                                               Objects.toString(iIi0O11lioI12);
                                                                    }
                                                                } else {
/* 891 */                                                           oiOOiIO1.read();
                                                                }
                                                            }
                                                        }
/* 971 */                                               long jI0010I0i = I0010I0i();
/* 979 */                                               if (iIi0O11lioI12.I00iOIl != jI0010I0i) {
/* 1013 */                                                  Log.w("PdfBox-Android", "found wrong object number. expected [" + iIi0O11lioI12.I00iOIl + "] found [" + jI0010I0i + "]");
/* 1016 */                                                  if (z) {
/* 1024 */                                                      iIi0O11lioI1 = new IIi0O11lioI1(iIi0O11lioI12.I00iiI, jI0010I0i);
                                                            }
                                                        } else {
/* 1028 */                                                  iIi0O11lioI1 = iIi0O11lioI12;
                                                        }
/* 1029 */                                              int iI000oI1ioi = I000oI1ioi();
/* 1035 */                                              I000o00OoI0I(I001lllioOl);
/* 1038 */                                              int i = iIi0O11lioI1.I00iiI;
/* 1040 */                                              if (iI000oI1ioi != i) {
/* 1043 */                                                  if (z && iI000oI1ioi > i) {
/* 1051 */                                                      iIi0O11lioI1 = new IIi0O11lioI1(iI000oI1ioi, iIi0O11lioI1.I00iOIl);
                                                            }
                                                        }
                                                    } catch (IOException unused) {
                                                    }
/* 1055 */                                          if (iIi0O11lioI1 != null) {
/* 1057 */                                              Objects.toString(iIi0O11lioI12);
/* 1060 */                                              I001iOo1i0O();
/* 1069 */                                              if (!this.I000lI.isEmpty()) {
/* 1071 */                                                  map.clear();
/* 1076 */                                                  map.putAll(this.I000lI);
                                                        }
                                                    } else if (iIi0O11lioI1 != iIi0O11lioI12) {
/* 1083 */                                              map2.put(iIi0O11lioI12, iIi0O11lioI1);
                                                    } else {
/* 1088 */                                              hashSet3.add(iIi0O11lioI12);
                                                    }
                                                }
/* 854 */                                       iIi0O11lioI1 = null;
/* 1055 */                                      if (iIi0O11lioI1 != null) {
                                                }
                                            }
                                        } else {
/* 1095 */                                  HashMap map3 = new HashMap();
/* 1110 */                                  for (Map.Entry entry2 : map2.entrySet()) {
/* 1126 */                                      if (!hashSet3.contains(entry2.getValue())) {
/* 1140 */                                          map3.put(entry2.getValue(), map.get(entry2.getKey()));
                                                }
                                            }
/* 1148 */                                  Iterator it2 = map2.entrySet().iterator();
/* 1156 */                                  while (it2.hasNext()) {
/* 1168 */                                      map.remove(((Map.Entry) it2.next()).getKey());
                                            }
/* 1184 */                                  for (Map.Entry entry3 : map3.entrySet()) {
/* 1200 */                                      map.put(entry3.getKey(), entry3.getValue());
                                            }
                                        }
                                    }
                                }
                            }
/* 1204 */                  IIOolO1li iIOolO1li = this.I0000Il00O;
/* 1208 */                  i01oi0o i01oi0oVar2 = (i01oi0o) oo1ol1ll.I00iio;
/* 1219 */                  iIOolO1li.I00iiI.putAll(i01oi0oVar2 == null ? null : i01oi0oVar2.I00000oOI);
/* 6116 */                  return iIOoi0ooOoO2;
                        }
/* 74 */                hashSet2.add(Long.valueOf(j4));
/* 77 */                oiOOiIO1.I000l1(j4);
/* 80 */                I001IIilI0O();
/* 91 */                hashSet2.add(Long.valueOf(oiOOiIO1.getPosition()));
/* 98 */                long j7 = j3;
/* 102 */               boolean z2 = true;
/* 103 */               if (oiOOiIO1.peek() == 120) {
/* 113 */                   if (oiOOiIO1.peek() != 120 || !I0010o().trim().equals("xref")) {
                                break;
                            }
/* 131 */                   String strI0010o = I0010o();
/* 142 */                   oiOOiIO1.I000O01llI0(strI0010o.getBytes(IO1IIilll1I.I0000O).length);
/* 145 */                   oo1ol1ll.I000iOII(1, j4);
/* 154 */                   if (strI0010o.startsWith("trailer")) {
/* 651 */                       Log.w("PdfBox-Android", "skipping empty xref table");
                                break;
                            }
                            while (true) {
/* 156 */                       String strI00100l0 = I00100l0();
/* 160 */                       String str = "\\s";
/* 162 */                       boolean z3 = z2;
/* 164 */                       String[] strArrSplit = strI00100l0.split("\\s");
/* 174 */                       if (strArrSplit.length != 2) {
/* 645 */                           Log.w("PdfBox-Android", "Unexpected XRefTable Entry: ".concat(strI00100l0));
                                    break loop0;
                                }
/* 176 */                       int i2 = 0;
                                try {
/* 179 */                           long j8 = Long.parseLong(strArrSplit[0]);
                                    try {
/* 185 */                               int i3 = Integer.parseInt(strArrSplit[z3 ? 1 : 0]);
/* 189 */                               I001IIilI0O();
/* 194 */                               hashSet = hashSet2;
/* 196 */                               long j9 = j8;
/* 200 */                               boolean z4 = z;
                                        while (true) {
/* 202 */                                   if (i2 >= i3 || oiOOiIO1.I00l0OO0IO() || I1oO1oiO00O.I0000oI00((char) oiOOiIO1.peek())) {
                                                break;
                                            }
/* 227 */                                   int i4 = i3;
/* 231 */                                   if (oiOOiIO1.peek() == 116) {
                                                break;
                                            }
/* 234 */                                   String strI00100l02 = I00100l0();
/* 238 */                                   String[] strArrSplit2 = strI00100l02.split(str);
/* 242 */                                   int i5 = i2;
/* 245 */                                   String str2 = str;
/* 248 */                                   if (strArrSplit2.length < 3) {
/* 256 */                                       Log.w("PdfBox-Android", "invalid xref line: ".concat(strI00100l02));
                                                break;
                                            }
/* 271 */                                   if (strArrSplit2[strArrSplit2.length - 1].equals("n")) {
                                                try {
/* 276 */                                           long j10 = Long.parseLong(strArrSplit2[0]);
/* 282 */                                           if (j10 > j7) {
/* 295 */                                               oo1ol1ll.I000o00OoI0I(new IIi0O11lioI1(Integer.parseInt(strArrSplit2[z3 ? 1 : 0]), j9), j10);
                                                    }
                                                } catch (NumberFormatException e) {
/* 305 */                                           throw new IOException(e);
                                                }
                                            } else if (!strArrSplit2[2].equals("f")) {
/* 335 */                                       IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j9, "Corrupt XRefTable Entry - ObjID:"));
/* 168 */                                       return null;
                                            }
/* 317 */                                   j9++;
/* 319 */                                   I001IIilI0O();
/* 322 */                                   i2 = i5 + 1;
/* 324 */                                   i3 = i4;
/* 326 */                                   str = str2;
                                        }
/* 339 */                               I001IIilI0O();
/* 346 */                               if (!I0000Il00O()) {
/* 352 */                                   this.I000O01llI0 = oiOOiIO1.getPosition();
/* 354 */                                   if (z4) {
/* 362 */                                       for (int iPeek = oiOOiIO1.peek(); iPeek != 116 && I1oO1oiO00O.I0000O(iPeek); iPeek = oiOOiIO1.peek()) {
/* 378 */                                           if (oiOOiIO1.getPosition() == this.I000O01llI0) {
/* 399 */                                               Log.w("PdfBox-Android", "Expected trailer object at offset " + this.I000O01llI0 + ", keep trying");
                                                    }
/* 402 */                                           I00100l0();
                                                }
                                            }
/* 416 */                                   if (oiOOiIO1.peek() != 116) {
                                                break;
                                            }
/* 418 */                                   long position2 = oiOOiIO1.getPosition();
/* 422 */                                   String strI00100l03 = I00100l0();
/* 434 */                                   if (!strI00100l03.trim().equals("trailer")) {
/* 440 */                                       if (!strI00100l03.startsWith("trailer")) {
                                                    break;
                                                }
/* 445 */                                       oiOOiIO1.I000l1(position2 + 7);
                                            }
/* 448 */                                   I001IIilI0O();
/* 451 */                                   IIOoi0ooOoO iIOoi0ooOoOI000OOo1O = I000OOo1O();
/* 457 */                                   i01oi0o i01oi0oVar3 = (i01oi0o) oo1ol1ll.I00iiO;
/* 459 */                                   if (i01oi0oVar3 == null) {
/* 463 */                                       Log.w("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
                                            } else {
/* 467 */                                       i01oi0oVar3.I00000oIO = iIOoi0ooOoOI000OOo1O;
                                            }
/* 469 */                                   I001IIilI0O();
/* 476 */                                   iIOoi0ooOoO = ((i01oi0o) oo1ol1ll.I00iiO).I00000oIO;
/* 478 */                                   IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0Io10i;
/* 486 */                                   if (iIOoi0ooOoO.I00iOIl.containsKey(iIi0I0I0o)) {
/* 491 */                                       int iI00oooO = iIOoi0ooOoO.I00oooO(iIi0I0I0o, null, -1);
                                                long j11 = iI00oooO;
/* 496 */                                       long jI001lIiIIo1O2 = I001lIiIIo1O(j11);
/* 502 */                                       if (jI001lIiIIo1O2 > j5 && jI001lIiIIo1O2 != j11) {
/* 530 */                                           Log.w("PdfBox-Android", "/XRefStm offset " + iI00oooO + " is incorrect, corrected to " + jI001lIiIIo1O2);
/* 533 */                                           iI00oooO = (int) jI001lIiIIo1O2;
/* 534 */                                           iIOoi0ooOoO.I010i10l(iIi0I0I0o, iI00oooO);
                                                }
/* 537 */                                       if (iI00oooO > 0) {
/* 540 */                                           oiOOiIO1.I000l1(iI00oooO);
/* 543 */                                           I001IIilI0O();
                                                    try {
/* 548 */                                               I00O0i0ii(j4, false);
                                                    } catch (IOException e2) {
/* 553 */                                               if (!z4) {
/* 573 */                                                   throw e2;
                                                        }
/* 569 */                                               Log.e("PdfBox-Android", "Failed to parse /XRefStm at offset " + iI00oooO, e2);
                                                    }
                                                } else {
/* 576 */                                           if (!z4) {
/* 598 */                                               IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00oooO, "Skipped XRef stream due to a corrupt offset:"));
/* 601 */                                               return null;
                                                    }
/* 590 */                                           Log.e("PdfBox-Android", "Skipped XRef stream due to a corrupt offset:" + iI00oooO);
                                                }
                                            }
/* 606 */                                   jI00O0i0ii = iIOoi0ooOoO.I0100o111I(IIi0I0I0o.I0I1lIio);
                                        } else {
/* 611 */                                   z2 = z3 ? 1 : 0;
/* 613 */                                   hashSet2 = hashSet;
/* 615 */                                   z = z4;
                                        }
                                    } catch (NumberFormatException unused2) {
/* 625 */                               Log.w("PdfBox-Android", "XRefTable: invalid number of objects: ".concat(strI00100l0));
                                    }
                                } catch (NumberFormatException unused3) {
/* 635 */                           Log.w("PdfBox-Android", "XRefTable: invalid ID for the first object: ".concat(strI00100l0));
                                }
                            }
                        } else {
/* 677 */                   hashSet = hashSet2;
/* 679 */                   jI00O0i0ii = I00O0i0ii(j4, true);
/* 687 */                   iIOoi0ooOoO = ((i01oi0o) oo1ol1ll.I00iiO).I00000oIO;
                        }
/* 691 */               if (jI00O0i0ii > j7) {
/* 693 */                   long jI001lIiIIo1O3 = I001lIiIIo1O(jI00O0i0ii);
/* 699 */                   if (jI001lIiIIo1O3 <= j5 || jI001lIiIIo1O3 == jI00O0i0ii) {
/* 719 */                       j4 = jI00O0i0ii;
                            } else {
/* 705 */                       IIi0I0I0o iIi0I0I0o2 = IIi0I0I0o.I0I1lIio;
/* 707 */                       iIOoi0ooOoO.getClass();
/* 714 */                       iIOoi0ooOoO.I010iIIOlo(iIi0I0I0o2, IIOool.I00o0iI0io1(jI001lIiIIo1O3));
/* 717 */                       j4 = jI001lIiIIo1O3;
                            }
                        }
/* 724 */               HashSet hashSet4 = hashSet;
/* 730 */               if (hashSet4.contains(Long.valueOf(j4))) {
/* 745 */                   IioIoO10iOiI.I000OOo1O(IlIi0I0.I000iOII(j4, "/Prev loop at offset "));
/* 748 */                   return null;
                        }
/* 732 */               hashSet2 = hashSet4;
/* 733 */               j3 = j7;
/* 735 */               j2 = j5;
                    }
/* 675 */           throw new IOException("Expected trailer object at offset " + oiOOiIO1.getPosition());
                }

                public final long I00O0i0ii(long j, boolean z) throws IOException {
/* 3 */             long jI0010I0i = I0010I0i();
/* 7 */             IIOolO1li iIOolO1li = this.I0000Il00O;
/* 15 */            iIOolO1li.I00ioIO = Math.max(iIOolO1li.I00ioIO, jI0010I0i);
/* 17 */            I000oI1ioi();
/* 22 */            I000o00OoI0I(I001lllioOl);
/* 25 */            IIOoi0ooOoO iIOoi0ooOoOI000OOo1O = I000OOo1O();
/* 29 */            IIi0io1lIo iIi0io1lIoI00IlilI0i0i = I00IlilI0i0i(iIOoi0ooOoOI000OOo1O);
/* 34 */            Oo1ol1ll oo1ol1ll = this.I00111O;
/* 36 */            if (z) {
/* 40 */                oo1ol1ll.I000iOII(2, j);
/* 45 */                i01oi0o i01oi0oVar = (i01oi0o) oo1ol1ll.I00iiO;
/* 47 */                if (i01oi0oVar == null) {
/* 53 */                    Log.w("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
                        } else {
/* 57 */                    i01oi0oVar.I00000oIO = iIi0io1lIoI00IlilI0i0i;
                        }
                    }
/* 61 */            IIOolO1li iIOolO1li2 = this.I0000Il00O;
/* 72 */            OIll0lliIll oIll0lliIll = new OIll0lliIll(new Ioo011Oi(iIi0io1lIoI00IlilI0i0i.I010l1ol111()));
/* 75 */            OilOll oilOll = oIll0lliIll.I00000oOI;
/* 78 */            int[] iArr = new int[3];
/* 80 */            oIll0lliIll.I0001Ioi1lo = iArr;
/* 83 */            oIll0lliIll.I000II = null;
/* 85 */            oIll0lliIll.I0000Il00O = iIOolO1li2;
/* 87 */            oIll0lliIll.I0000oI00 = oo1ol1ll;
                    try {
/* 89 */                oIll0lliIll.I001i1O0Ol(iIi0io1lIoI00IlilI0i0i);
/* 92 */                VarHandle.storeStoreFence();
/* 95 */                int i = 0;
/* 98 */                int i2 = 1;
/* 105 */               byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
/* 111 */               while (!oilOll.I00l0OO0IO() && oIll0lliIll.I000II.hasNext()) {
/* 121 */                   oilOll.read(bArr);
/* 130 */                   long jLongValue = oIll0lliIll.I000II.next().longValue();
/* 134 */                   int i3 = iArr[i];
/* 144 */                   int iI001i1lo1io = i3 == 0 ? i2 : (int) OIll0lliIll.I001i1lo1io(bArr, i, i3);
/* 145 */                   if (iI001i1lo1io != 0) {
/* 152 */                       long jI001i1lo1io = OIll0lliIll.I001i1lo1io(bArr, iArr[i], iArr[i2]);
/* 175 */                       IIi0O11lioI1 iIi0O11lioI1 = new IIi0O11lioI1(iI001i1lo1io == i2 ? (int) OIll0lliIll.I001i1lo1io(bArr, iArr[i] + iArr[i2], iArr[2]) : 0, jLongValue);
/* 178 */                       Oo1ol1ll oo1ol1ll2 = oIll0lliIll.I0000oI00;
/* 180 */                       i2 = 1;
/* 181 */                       if (iI001i1lo1io == 1) {
/* 183 */                           oo1ol1ll2.I000o00OoI0I(iIi0O11lioI1, jI001i1lo1io);
                                } else {
/* 188 */                           oo1ol1ll2.I000o00OoI0I(iIi0O11lioI1, -jI001i1lo1io);
                                }
/* 191 */                       i = 0;
                            }
                        }
/* 194 */               oilOll.close();
/* 198 */               oIll0lliIll.I0000Il00O = null;
/* 200 */               iIi0io1lIoI00IlilI0i0i.close();
/* 205 */               return iIOoi0ooOoOI000OOo1O.I0100o111I(IIi0I0I0o.I0I1lIio);
                    } catch (IOException e) {
/* 212 */               oilOll.close();
/* 215 */               oIll0lliIll.I0000Il00O = null;
/* 551 */               throw e;
                    }
                }

                public final void I00O0o1oo() throws IOException {
/* 1 */             String str = this.I000II;
/* 5 */             if (this.I00100o1O0lo != null) {
/* 541 */               return;
                    }
/* 10 */            IIOoi0ooOoO iIOoi0ooOoO = this.I0000Il00O.I00iio;
/* 12 */            IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I01O1I1;
/* 14 */            IIOoOiOI iIOoOiOII0100i = iIOoi0ooOoO.I0100i(iIi0I0I0o);
/* 18 */            if (iIOoOiOII0100i == null || (iIOoOiOII0100i instanceof IIi0II0l0o)) {
/* 541 */               return;
                    }
/* 27 */            if (iIOoOiOII0100i instanceof IIi0O10I) {
/* 31 */                I00Io1o110i((IIi0O10I) iIOoOiOII0100i);
                    }
                    try {
/* 44 */                OIliiIOOiI1l oIliiIOOiI1l = new OIliiIOOiI1l(this.I0000Il00O.I00iio.I00lll10(iIi0I0I0o));
/* 47 */                this.I00100o1O0lo = oIliiIOOiI1l;
/* 51 */                OlIl1l olIl1l = new OlIl1l();
/* 54 */                olIl1l.I00000oIO = str;
/* 56 */                VarHandle.storeStoreFence();
/* 59 */                Oii0OIIO oii0OIIOI000OOo1O = oIliiIOOiI1l.I000OOo1O();
/* 63 */                this.I0010I0i = oii0OIIOI000OOo1O;
/* 77 */                oii0OIIOI000OOo1O.I000O01llI0(this.I00100o1O0lo, this.I0000Il00O.I00iio.I00lli11(IIi0I0I0o.I01illiiIill), olIl1l);
/* 82 */                Il1IIl1 il1IIl1 = this.I0010I0i.I000II;
                    } catch (IOException e) {
/* 122 */               throw e;
                    } catch (Exception e2) {
/* 120 */               throw new IOException("Error (" + e2.getClass().getSimpleName() + ") while creating security handler for decryption", e2);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00O10llo(Il0O0i il0O0i) throws IOException {
                    byte b;
/* 2 */             byte[] bArr = I001iOo1i0O;
/* 4 */             int i = 0;
/* 5 */             byte[] bArr2 = bArr;
                    while (true) {
/* 8 */                 OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 10 */                byte[] bArr3 = this.I0000oI00;
/* 12 */                int i2 = oiOOiIO1.read(bArr3, i, 2048 - i);
/* 16 */                if (i2 <= 0) {
                            break;
                        }
/* 18 */                int i3 = i2 + i;
                        int i4 = i3 - 5;
/* 21 */                byte[] bArr4 = bArr2;
/* 22 */                int i5 = i;
                        while (true) {
/* 23 */                    if (i >= i3) {
                                break;
                            }
/* 25 */                    int i6 = i + 5;
/* 28 */                    if (i5 != 0 || i6 >= i4 || ((b = bArr3[i6]) <= 116 && b >= 97)) {
/* 44 */                        byte b2 = bArr3[i];
/* 48 */                        if (b2 == bArr4[i5]) {
/* 50 */                            i5++;
/* 53 */                            if (i5 == bArr4.length) {
/* 55 */                                i++;
                                        break;
                                    }
                                } else if (i5 == 3) {
/* 61 */                            bArr4 = I001l0I00;
/* 65 */                            if (b2 == bArr4[i5]) {
/* 67 */                                i5++;
                                    } else {
/* 85 */                                i5 = b2 == 101 ? 1 : (b2 == 110 && i5 == 7) ? 2 : 0;
/* 86 */                                bArr4 = bArr;
                                    }
                                }
                            } else {
/* 42 */                        i = i6;
                            }
/* 87 */                    i++;
                        }
/* 90 */                int iMax = Math.max(0, i - i5);
/* 94 */                if (iMax > 0) {
/* 96 */                    il0O0i.write(bArr3, 0, iMax);
                        }
/* 100 */               if (i5 == bArr4.length) {
/* 103 */                   oiOOiIO1.I000O01llI0(i3 - iMax);
                            break;
                        } else {
/* 107 */                   System.arraycopy(bArr4, 0, bArr3, 0, i5);
/* 110 */                   i = i5;
/* 111 */                   bArr2 = bArr4;
                        }
                    }
/* 113 */           il0O0i.flush();
                }

                public final void I00OI1(IIi0OI0 iIi0OI0, IIi0IoOo iIi0IoOo) throws IOException {
/* 1 */             long jI00lll10 = iIi0IoOo.I00lll10();
/* 9 */             while (jI00lll10 > 0) {
/* 20 */                int i = jI00lll10 > 8192 ? 8192 : (int) jI00lll10;
/* 21 */                OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 23 */                byte[] bArr = this.I001IIilI0O;
/* 26 */                int i2 = oiOOiIO1.read(bArr, 0, i);
/* 30 */                if (i2 <= 0) {
/* 77 */                    throw new IOException("read error at offset " + oiOOiIO1.getPosition() + ": expected " + i + " bytes, but read() returns " + i2);
                        }
/* 32 */                iIi0OI0.write(bArr, 0, i2);
/* 36 */                jI00lll10 -= i2;
                    }
                }

                public final IIOoi0ooOoO I00OIO1(IIi0O10I iIi0O10I) throws IOException {
/* 7 */             IIi0O11lioI1 iIi0O11lioI1 = new IIi0O11lioI1(iIi0O10I.I00iiO, iIi0O10I.I00iiI);
/* 16 */            Long l = (Long) this.I000lI.get(iIi0O11lioI1);
/* 18 */            if (l == null) {
/* 38 */                return null;
                    }
/* 20 */            OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 22 */            long position = oiOOiIO1.getPosition();
/* 30 */            IIOoi0ooOoO iIOoi0ooOoOI00OIl = I00OIl(iIi0O11lioI1, l.longValue());
/* 34 */            oiOOiIO1.I000l1(position);
/* 37 */            return iIOoi0ooOoOI00OIl;
                }

                public final IIOoi0ooOoO I00OIl(IIi0O11lioI1 iIi0O11lioI1, long j) throws IOException {
/* 6 */             if (j < 0) {
/* 10 */                IIi0O10I iIi0O10II00ioIO = this.I0000Il00O.I00ioIO(iIi0O11lioI1);
/* 16 */                if (iIi0O10II00ioIO.I00iOIl == null) {
/* 20 */                    I00IoiI((int) (-j));
                        }
/* 23 */                IIOoOiOI iIOoOiOI = iIi0O10II00ioIO.I00iOIl;
/* 27 */                if (iIOoOiOI instanceof IIOoi0ooOoO) {
/* 29 */                    return (IIOoi0ooOoO) iIOoOiOI;
                        }
                    } else {
/* 32 */                OiOOiIO1 oiOOiIO1 = this.I0001Ioi1lo;
/* 34 */                oiOOiIO1.I000l1(j);
/* 37 */                I0010I0i();
/* 40 */                I000oI1ioi();
/* 45 */                I000o00OoI0I(I001lllioOl);
/* 54 */                if (oiOOiIO1.peek() == 60) {
                            try {
/* 57 */                        return I000OOo1O();
                            } catch (IOException unused) {
/* 62 */                        Objects.toString(iIi0O11lioI1);
/* 5 */                         return null;
                            }
                        }
                    }
/* 5 */             return null;
                }

                public final boolean I00OIo(IIOoi0ooOoO iIOoi0ooOoO) throws IOException {
                    IIi0O10I iIi0O10II00ioIO;
/* 11 */            IIi0O10I iIi0O10II001lllioOl = null;
/* 12 */            IIi0O10I iIi0O10II001lllioOl2 = null;
/* 13 */            Long l = null;
/* 14 */            Long l2 = null;
/* 19 */            for (Map.Entry entry : this.I000lI.entrySet()) {
/* 43 */                IIOoi0ooOoO iIOoi0ooOoOI00OIl = I00OIl((IIi0O11lioI1) entry.getKey(), ((Long) entry.getValue()).longValue());
/* 47 */                if (iIOoi0ooOoOI00OIl != null) {
/* 62 */                    if (IIi0I0I0o.I010101Oo1lO.equals(iIOoi0ooOoOI00OIl.I00o0iI0io1(IIi0I0I0o.I0IilI00l))) {
/* 72 */                        IIi0O10I iIi0O10II00ioIO2 = this.I0000Il00O.I00ioIO((IIi0O11lioI1) entry.getKey());
/* 82 */                        iIi0O10II001lllioOl = I001lllioOl(iIi0O10II00ioIO2, (Long) entry.getValue(), iIi0O10II001lllioOl, l);
/* 86 */                        if (iIi0O10II001lllioOl == iIi0O10II00ioIO2) {
/* 92 */                            l = (Long) entry.getValue();
                                }
                            } else if (I00IO1(iIOoi0ooOoOI00OIl) && (iIi0O10II001lllioOl2 = I001lllioOl((iIi0O10II00ioIO = this.I0000Il00O.I00ioIO((IIi0O11lioI1) entry.getKey())), (Long) entry.getValue(), iIi0O10II001lllioOl2, l2)) == iIi0O10II00ioIO) {
/* 129 */                       l2 = (Long) entry.getValue();
                            }
                        }
                    }
/* 132 */           if (iIi0O10II001lllioOl != null) {
/* 136 */               iIOoi0ooOoO.I010iIIOlo(IIi0I0I0o.I0II1Il, iIi0O10II001lllioOl);
                    }
/* 139 */           if (iIi0O10II001lllioOl2 != null) {
/* 143 */               iIOoi0ooOoO.I010iIIOlo(IIi0I0I0o.I01lIi, iIi0O10II001lllioOl2);
                    }
                    return iIi0O10II001lllioOl != null;
                }
            }

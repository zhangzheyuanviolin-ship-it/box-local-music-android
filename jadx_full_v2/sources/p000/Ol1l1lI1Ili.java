            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Ol1l1lI1Ili {
                public static final OiioI1Io0o I00000oIO = new OiioI1Io0o(13);
                public static final IOO000ilo I00000oOI = new IOO000ilo();
                public static final Object I0000Il00O = new Object();
                public static Ol1l0OoOo I0000O;
                public static long I0000oI00;
                public static final I101oOiOiI I0001Ioi1lo;
                public static final I00Ol00 I000II;
                public static List I000O01llI0;
                public static List I000OOo1O;
                public static final Io0O010 I000OiO;
                public static final I1Ooo1ii0l I000iOII;

                /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
                static {
/* 24 */            Ol1l0OoOo ol1l0OoOo = Ol1l0OoOo.I00ilI0I1;
/* 26 */            I0000O = ol1l0OoOo;
/* 30 */            I0000oI00 = 2L;
/* 34 */            I101oOiOiI i101oOiOiI = new I101oOiOiI();
/* 41 */            i101oOiOiI.I0000Il00O = new long[16];
/* 45 */            i101oOiOiI.I0000O = new int[16];
/* 47 */            int[] iArr = new int[16];
/* 49 */            short s = 0;
/* 50 */            int i = 0;
/* 51 */            while (i < 16) {
/* 53 */                int i2 = i + 1;
/* 55 */                iArr[i] = i2;
/* 57 */                i = i2;
                    }
/* 59 */            i101oOiOiI.I0000oI00 = iArr;
/* 61 */            I0001Ioi1lo = i101oOiOiI;
/* 67 */            I00Ol00 i00Ol00 = new I00Ol00(12, s);
/* 72 */            i00Ol00.I0000Il00O = new int[16];
/* 76 */            i00Ol00.I0000O = new i000liO[16];
/* 78 */            I000II = i00Ol00;
/* 80 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 82 */            I000O01llI0 = il01100l;
/* 84 */            I000OOo1O = il01100l;
/* 86 */            long j = I0000oI00;
/* 91 */            I0000oI00 = 1 + j;
/* 103 */           Io0O010 io0O010 = new Io0O010(j, ol1l0OoOo, null, new Ilo10O1IlOl(29));
/* 114 */           I0000O = I0000O.I000iOII(io0O010.I00000oOI);
/* 116 */           I000OiO = io0O010;
/* 123 */           I000iOII = new I1Ooo1ii0l(0);
                }

                public static final Ol1l0OoOo I00000oIO(Ol1l0OoOo ol1l0OoOo, long j, long j2) {
/* 5 */             while (O0000Ioio00.I0001Ioi1lo(j, j2) < 0) {
/* 7 */                 ol1l0OoOo = ol1l0OoOo.I000iOII(j);
/* 13 */                j++;
                    }
/* 98 */            return ol1l0OoOo;
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Function1 function1) {
                    OI10IIO oi10iio;
                    Object objI001IIilI0O;
/* 1 */             Io0O010 io0O010 = I000OiO;
                    synchronized (I0000Il00O) {
                        try {
/* 6 */                     oi10iio = io0O010.I000O01llI0;
/* 8 */                     if (oi10iio != null) {
/* 13 */                        I000iOII.addAndGet(1);
                            }
/* 20 */                    objI001IIilI0O = I001IIilI0O(io0O010, function1);
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 26 */            if (oi10iio != null) {
                        try {
/* 29 */                    List list = I000O01llI0;
/* 31 */                    OiO1IO0000l oiO1IO0000lI00000oIO = lO0o01OilO.I00000oIO(oi10iio);
/* 38 */                    int size = list.size();
/* 43 */                    for (int i = 0; i < size; i++) {
/* 51 */                        ((IlliIl1l11O) list.get(i)).invoke(oiO1IO0000lI00000oIO, io0O010);
                            }
                        } finally {
/* 67 */                    I000iOII.addAndGet(-1);
                        }
                    }
                    synchronized (I0000Il00O) {
/* 74 */                I0000O();
/* 77 */                if (oi10iio != null) {
/* 79 */                    Object[] objArr = oi10iio.I00000oOI;
/* 81 */                    long[] jArr = oi10iio.I00000oIO;
                            int length = jArr.length - 2;
/* 86 */                    if (length >= 0) {
/* 88 */                        int i2 = 0;
                                while (true) {
/* 89 */                            long j = jArr[i2];
/* 103 */                           if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 112 */                               int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 115 */                               for (int i4 = 0; i4 < i3; i4++) {
/* 124 */                                   if ((255 & j) < 128) {
/* 133 */                                       I00100l0((OlO11I0O1l) objArr[(i2 << 3) + i4]);
                                            }
/* 139 */                                   j >>= 8;
                                        }
/* 143 */                               if (i3 != 8) {
                                            break;
                                        }
/* 145 */                               if (i2 == length) {
                                            break;
                                        }
/* 147 */                               i2++;
                                    }
                                }
                            }
                        }
                    }
/* 151 */           return objI001IIilI0O;
                }

                public static final void I0000Il00O() {
/* 3 */             I00000oOI(I00000oIO);
                }

                public static final void I0000O() {
/* 1 */             I00Ol00 i00Ol00 = I000II;
/* 3 */             int i = i00Ol00.I00000oOI;
/* 6 */             int i2 = 0;
/* 7 */             int i3 = 0;
                    while (true) {
/* 9 */                 if (i2 >= i) {
                            break;
                        }
/* 15 */                i000liO i000lio = ((i000liO[]) i00Ol00.I0000O)[i2];
/* 19 */                Object obj = i000lio != null ? i000lio.get() : null;
/* 23 */                if (obj != null && I000oI1ioi((OlO11I0O1l) obj)) {
/* 33 */                    if (i3 != i2) {
/* 39 */                        ((i000liO[]) i00Ol00.I0000O)[i3] = i000lio;
/* 43 */                        int[] iArr = (int[]) i00Ol00.I0000Il00O;
/* 47 */                        iArr[i3] = iArr[i2];
                            }
/* 49 */                    i3++;
                        }
/* 51 */                i2++;
                    }
/* 55 */            for (int i4 = i3; i4 < i; i4++) {
/* 61 */                ((i000liO[]) i00Ol00.I0000O)[i4] = null;
/* 67 */                ((int[]) i00Ol00.I0000Il00O)[i4] = 0;
                    }
/* 72 */            if (i3 != i) {
/* 74 */                i00Ol00.I00000oOI = i3;
                    }
                }

                public static final Ol1il1o1 I0000oI00(Ol1il1o1 ol1il1o1, Function1 function1, boolean z) {
/* 1 */             boolean z2 = ol1il1o1 instanceof OI10OloOOoi;
/* 3 */             if (z2 || ol1il1o1 == null) {
/* 29 */                return new OoIOO1001(z2 ? (OI10OloOOoi) ol1il1o1 : null, function1, null, false, z);
                    }
/* 11 */            return new OoIOOo1(ol1il1o1, function1, false, z);
                }

                public static final OlO1Ol0il0i I0001Ioi1lo(OlO1Ol0il0i olO1Ol0il0i) {
                    OlO1Ol0il0i olO1Ol0il0iI0010I0i;
/* 1 */             Ol1il1o1 ol1il1o1I000O01llI0 = I000O01llI0();
/* 13 */            OlO1Ol0il0i olO1Ol0il0iI0010I0i2 = I0010I0i(olO1Ol0il0i, ol1il1o1I000O01llI0.I000II(), ol1il1o1I000O01llI0.I0000O());
/* 17 */            if (olO1Ol0il0iI0010I0i2 != null) {
/* 77 */                return olO1Ol0il0iI0010I0i2;
                    }
                    synchronized (I0000Il00O) {
/* 22 */                Ol1il1o1 ol1il1o1I000O01llI02 = I000O01llI0();
/* 34 */                olO1Ol0il0iI0010I0i = I0010I0i(olO1Ol0il0i, ol1il1o1I000O01llI02.I000II(), ol1il1o1I000O01llI02.I0000O());
                    }
/* 39 */            if (olO1Ol0il0iI0010I0i != null) {
/* 41 */                return olO1Ol0il0iI0010I0i;
                    }
/* 42 */            I00100o1O0lo();
/* 46 */            throw null;
                }

                public static final OlO1Ol0il0i I000II(OlO1Ol0il0i olO1Ol0il0i, Ol1il1o1 ol1il1o1) {
                    OlO1Ol0il0i olO1Ol0il0iI0010I0i;
/* 9 */             OlO1Ol0il0i olO1Ol0il0iI0010I0i2 = I0010I0i(olO1Ol0il0i, ol1il1o1.I000II(), ol1il1o1.I0000O());
/* 13 */            if (olO1Ol0il0iI0010I0i2 != null) {
/* 106 */               return olO1Ol0il0iI0010I0i2;
                    }
                    synchronized (I0000Il00O) {
/* 26 */                olO1Ol0il0iI0010I0i = I0010I0i(olO1Ol0il0i, ol1il1o1.I000II(), ol1il1o1.I0000O());
                    }
/* 31 */            if (olO1Ol0il0iI0010I0i != null) {
/* 33 */                return olO1Ol0il0iI0010I0i;
                    }
/* 34 */            I00100o1O0lo();
/* 38 */            throw null;
                }

                public static final Ol1il1o1 I000O01llI0() {
/* 7 */             Ol1il1o1 ol1il1o1 = (Ol1il1o1) I00000oOI.I0010I0i();
                    return ol1il1o1 == null ? I000OiO : ol1il1o1;
                }

                public static final Function1 I000OOo1O(Function1 function1, Function1 function12, boolean z) {
/* 1 */             if (!z) {
/* 4 */                 function12 = null;
                    }
/* 5 */             if (function1 == null || function12 == null || function1 == function12) {
                        return function1 == null ? function12 : function1;
                    }
/* 14 */            IoIlOo ioIlOo = new IoIlOo(1);
/* 17 */            ioIlOo.I00iiI = function1;
/* 19 */            ioIlOo.I00iiO = function12;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            return ioIlOo;
                }

                public static final Function1 I000OiO(Function1 function1, Function1 function12) {
/* 1 */             if (function1 == null || function12 == null || function1 == function12) {
                        return function1 == null ? function12 : function1;
                    }
/* 10 */            IoIlOo ioIlOo = new IoIlOo(2);
/* 13 */            ioIlOo.I00iiI = function1;
/* 15 */            ioIlOo.I00iiO = function12;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return ioIlOo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
                
                    r3 = r0;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OlO1Ol0il0i I000iOII(OlO1Ol0il0i olO1Ol0il0i, OlO11I0O1l olO11I0O1l) {
/* 1 */             OlO1Ol0il0i olO1Ol0il0iI00000oOI = olO11I0O1l.I00000oOI();
/* 5 */             long j = I0000oI00;
/* 7 */             I101oOiOiI i101oOiOiI = I0001Ioi1lo;
/* 11 */            if (i101oOiOiI.I00000oIO > 0) {
/* 18 */                j = ((long[]) i101oOiOiI.I0000Il00O)[0];
                    }
/* 22 */            long j2 = j - 1;
/* 23 */            OlO1Ol0il0i olO1Ol0il0i2 = null;
/* 24 */            OlO1Ol0il0i olO1Ol0il0i3 = null;
                    while (true) {
/* 25 */                if (olO1Ol0il0iI00000oOI == null) {
                            break;
                        }
/* 27 */                long j3 = olO1Ol0il0iI00000oOI.I00000oIO;
/* 33 */                if (j3 == 0) {
                            break;
                        }
/* 38 */                if (j3 != 0 && O0000Ioio00.I0001Ioi1lo(j3, j2) <= 0 && !Ol1l0OoOo.I00ilI0I1.I000OOo1O(j3)) {
/* 54 */                    if (olO1Ol0il0i3 == null) {
/* 56 */                        olO1Ol0il0i3 = olO1Ol0il0iI00000oOI;
                            } else {
/* 66 */                        if (O0000Ioio00.I0001Ioi1lo(olO1Ol0il0iI00000oOI.I00000oIO, olO1Ol0il0i3.I00000oIO) < 0) {
                                    break;
                                }
/* 70 */                        olO1Ol0il0i2 = olO1Ol0il0i3;
                            }
                        }
/* 72 */                olO1Ol0il0iI00000oOI = olO1Ol0il0iI00000oOI.I00000oOI;
                    }
/* 80 */            if (olO1Ol0il0i2 != null) {
/* 82 */                olO1Ol0il0i2.I00000oIO = Long.MAX_VALUE;
/* 84 */                return olO1Ol0il0i2;
                    }
/* 85 */            OlO1Ol0il0i olO1Ol0il0iI00000oOI2 = olO1Ol0il0i.I00000oOI(Long.MAX_VALUE);
/* 93 */            olO1Ol0il0iI00000oOI2.I00000oOI = olO11I0O1l.I00000oOI();
/* 95 */            olO11I0O1l.I000OOo1O(olO1Ol0il0iI00000oOI2);
/* 106 */           return olO1Ol0il0iI00000oOI2;
                }

                public static final void I000l1(Ol1il1o1 ol1il1o1, OlO11I0O1l olO11I0O1l) {
/* 7 */             ol1il1o1.I00111O(ol1il1o1.I000O01llI0() + 1);
/* 10 */            Function1 function1I000OOo1O = ol1il1o1.I000OOo1O();
/* 14 */            if (function1I000OOo1O != null) {
/* 16 */                function1I000OOo1O.invoke(olO11I0O1l);
                    }
                }

                public static final HashMap I000lI(long j, OI10OloOOoi oI10OloOOoi, Ol1l0OoOo ol1l0OoOo) {
                    long[] jArr;
                    Ol1l0OoOo ol1l0OoOo2;
                    long[] jArr2;
                    Ol1l0OoOo ol1l0OoOo3;
                    int i;
                    int i2;
                    OlO1Ol0il0i olO1Ol0il0iI0010I0i;
/* 1 */             OI10IIO oi10iioI001i1lo1io = oI10OloOOoi.I001i1lo1io();
/* 5 */             if (oi10iioI001i1lo1io != null) {
/* 11 */                long jI000II = oI10OloOOoi.I000II();
/* 27 */                Ol1l0OoOo ol1l0OoOoI000OiO = oI10OloOOoi.I0000O().I000iOII(jI000II).I000OiO(oI10OloOOoi.I000OiO);
/* 31 */                Object[] objArr = oi10iioI001i1lo1io.I00000oOI;
/* 33 */                long[] jArr3 = oi10iioI001i1lo1io.I00000oIO;
                        int length = jArr3.length - 2;
/* 38 */                if (length >= 0) {
/* 40 */                    int i3 = 0;
/* 41 */                    HashMap map = null;
                            while (true) {
/* 42 */                        long j2 = jArr3[i3];
/* 56 */                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 63 */                            int i4 = 8;
/* 65 */                            int i5 = 8 - ((~(i3 - length)) >>> 31);
/* 67 */                            int i6 = 0;
/* 68 */                            while (i6 < i5) {
/* 78 */                                if ((j2 & 255) < 128) {
/* 90 */                                    OlO11I0O1l olO11I0O1l = (OlO11I0O1l) objArr[(i3 << 3) + i6];
/* 92 */                                    OlO1Ol0il0i olO1Ol0il0iI00000oOI = olO11I0O1l.I00000oOI();
/* 96 */                                    jArr2 = jArr3;
/* 98 */                                    i = i4;
/* 100 */                                   i2 = i6;
/* 106 */                                   OlO1Ol0il0i olO1Ol0il0iI0010I0i2 = I0010I0i(olO1Ol0il0iI00000oOI, j, ol1l0OoOo);
/* 110 */                                   if (olO1Ol0il0iI0010I0i2 == null || (olO1Ol0il0iI0010I0i = I0010I0i(olO1Ol0il0iI00000oOI, jI000II, ol1l0OoOoI000OiO)) == null || olO1Ol0il0iI0010I0i2.equals(olO1Ol0il0iI0010I0i)) {
/* 161 */                                       ol1l0OoOo3 = ol1l0OoOoI000OiO;
                                            } else {
/* 126 */                                       ol1l0OoOo3 = ol1l0OoOoI000OiO;
/* 132 */                                       OlO1Ol0il0i olO1Ol0il0iI0010I0i3 = I0010I0i(olO1Ol0il0iI00000oOI, jI000II, oI10OloOOoi.I0000O());
/* 136 */                                       if (olO1Ol0il0iI0010I0i3 == null) {
/* 157 */                                           I00100o1O0lo();
/* 160 */                                           throw null;
                                                }
/* 138 */                                       OlO1Ol0il0i olO1Ol0il0iI0000O = olO11I0O1l.I0000O(olO1Ol0il0iI0010I0i, olO1Ol0il0iI0010I0i2, olO1Ol0il0iI0010I0i3);
/* 142 */                                       if (olO1Ol0il0iI0000O == null) {
/* 86 */                                            return null;
                                                }
/* 144 */                                       if (map == null) {
/* 148 */                                           map = new HashMap();
                                                }
/* 152 */                                       map.put(olO1Ol0il0iI0010I0i2, olO1Ol0il0iI0000O);
/* 155 */                                       map = map;
                                            }
                                        } else {
/* 164 */                                   jArr2 = jArr3;
/* 166 */                                   ol1l0OoOo3 = ol1l0OoOoI000OiO;
/* 168 */                                   i = i4;
/* 170 */                                   i2 = i6;
                                        }
/* 176 */                               j2 >>= i;
/* 178 */                               i6 = i2 + 1;
/* 183 */                               i4 = i;
/* 185 */                               jArr3 = jArr2;
/* 187 */                               ol1l0OoOoI000OiO = ol1l0OoOo3;
                                    }
/* 190 */                           jArr = jArr3;
/* 192 */                           ol1l0OoOo2 = ol1l0OoOoI000OiO;
/* 199 */                           if (i5 != i4) {
/* 202 */                               return map;
                                    }
                                } else {
/* 205 */                           jArr = jArr3;
/* 207 */                           ol1l0OoOo2 = ol1l0OoOoI000OiO;
                                }
/* 211 */                       if (i3 == length) {
/* 223 */                           return map;
                                }
/* 213 */                       i3++;
/* 217 */                       jArr3 = jArr;
/* 219 */                       ol1l0OoOoI000OiO = ol1l0OoOo2;
                            }
                        }
                    }
/* 7 */             return null;
                }

                public static final OlO1Ol0il0i I000o00OoI0I(OlO1Ol0il0i olO1Ol0il0i, OlO1IOi1lli olO1IOi1lli, Ol1il1o1 ol1il1o1, OlO1Ol0il0i olO1Ol0il0i2) {
                    OlO1Ol0il0i olO1Ol0il0iI000iOII;
/* 5 */             if (ol1il1o1.I0001Ioi1lo()) {
/* 7 */                 ol1il1o1.I000o00OoI0I(olO1IOi1lli);
                    }
/* 10 */            long jI000II = ol1il1o1.I000II();
/* 18 */            if (olO1Ol0il0i2.I00000oIO == jI000II) {
/* 20 */                return olO1Ol0il0i2;
                    }
                    synchronized (I0000Il00O) {
/* 24 */                olO1Ol0il0iI000iOII = I000iOII(olO1Ol0il0i, olO1IOi1lli);
                    }
/* 29 */            olO1Ol0il0iI000iOII.I00000oIO = jI000II;
/* 31 */            ol1il1o1.I000o00OoI0I(olO1IOi1lli);
/* 34 */            return olO1Ol0il0iI000iOII;
                }

                public static final boolean I000oI1ioi(OlO11I0O1l olO11I0O1l) {
                    OlO1Ol0il0i olO1Ol0il0i;
/* 5 */             long j = I0000oI00;
/* 7 */             I101oOiOiI i101oOiOiI = I0001Ioi1lo;
/* 12 */            if (i101oOiOiI.I00000oIO > 0) {
/* 18 */                j = ((long[]) i101oOiOiI.I0000Il00O)[0];
                    }
/* 20 */            OlO1Ol0il0i olO1Ol0il0i2 = null;
/* 21 */            OlO1Ol0il0i olO1Ol0il0iI00000oOI = null;
/* 22 */            int i = 0;
/* 23 */            for (OlO1Ol0il0i olO1Ol0il0iI00000oOI2 = olO11I0O1l.I00000oOI(); olO1Ol0il0iI00000oOI2 != null; olO1Ol0il0iI00000oOI2 = olO1Ol0il0iI00000oOI2.I00000oOI) {
/* 25 */                long j2 = olO1Ol0il0iI00000oOI2.I00000oIO;
/* 31 */                if (j2 != 0) {
/* 37 */                    if (O0000Ioio00.I0001Ioi1lo(j2, j) >= 0) {
/* 99 */                        i++;
                            } else if (olO1Ol0il0i2 == null) {
/* 41 */                        i++;
/* 43 */                        olO1Ol0il0i2 = olO1Ol0il0iI00000oOI2;
                            } else {
/* 53 */                        if (O0000Ioio00.I0001Ioi1lo(olO1Ol0il0iI00000oOI2.I00000oIO, olO1Ol0il0i2.I00000oIO) < 0) {
/* 55 */                            olO1Ol0il0i = olO1Ol0il0i2;
/* 56 */                            olO1Ol0il0i2 = olO1Ol0il0iI00000oOI2;
                                } else {
/* 58 */                            olO1Ol0il0i = olO1Ol0il0iI00000oOI2;
                                }
/* 59 */                        if (olO1Ol0il0iI00000oOI == null) {
/* 61 */                            olO1Ol0il0iI00000oOI = olO11I0O1l.I00000oOI();
/* 65 */                            OlO1Ol0il0i olO1Ol0il0i3 = olO1Ol0il0iI00000oOI;
                                    while (true) {
/* 66 */                                if (olO1Ol0il0iI00000oOI == null) {
/* 91 */                                    olO1Ol0il0iI00000oOI = olO1Ol0il0i3;
                                            break;
                                        }
/* 74 */                                if (O0000Ioio00.I0001Ioi1lo(olO1Ol0il0iI00000oOI.I00000oIO, j) >= 0) {
                                            break;
                                        }
/* 85 */                                if (O0000Ioio00.I0001Ioi1lo(olO1Ol0il0i3.I00000oIO, olO1Ol0il0iI00000oOI.I00000oIO) < 0) {
/* 87 */                                    olO1Ol0il0i3 = olO1Ol0il0iI00000oOI;
                                        }
/* 88 */                                olO1Ol0il0iI00000oOI = olO1Ol0il0iI00000oOI.I00000oOI;
                                    }
                                }
/* 92 */                        olO1Ol0il0i2.I00000oIO = 0L;
/* 94 */                        olO1Ol0il0i2.I00000oIO(olO1Ol0il0iI00000oOI);
/* 97 */                        olO1Ol0il0i2 = olO1Ol0il0i;
                            }
                        }
                    }
                    return i > 1;
                }

                public static final void I00100l0(OlO11I0O1l olO11I0O1l) {
/* 5 */             if (I000oI1ioi(olO11I0O1l)) {
/* 7 */                 I00Ol00 i00Ol00 = I000II;
/* 9 */                 int i = i00Ol00.I00000oOI;
/* 11 */                int iIdentityHashCode = System.identityHashCode(olO11I0O1l);
/* 16 */                int i2 = -1;
/* 17 */                if (i > 0) {
                            int i3 = i00Ol00.I00000oOI - 1;
/* 23 */                    int i4 = 0;
                            while (true) {
/* 24 */                        if (i4 > i3) {
/* 145 */                           i2 = -(i4 + 1);
                                    break;
                                }
/* 28 */                        int i5 = (i4 + i3) >>> 1;
/* 34 */                        int i6 = ((int[]) i00Ol00.I0000Il00O)[i5];
/* 36 */                        if (i6 < iIdentityHashCode) {
/* 38 */                            i4 = i5 + 1;
                                } else if (i6 > iIdentityHashCode) {
                                    i3 = i5 - 1;
                                } else {
/* 50 */                            i000liO i000lio = ((i000liO[]) i00Ol00.I0000O)[i5];
/* 61 */                            if (olO11I0O1l == (i000lio != null ? i000lio.get() : null)) {
/* 63 */                                i2 = i5;
                                    } else {
/* 67 */                                for (int i7 = i5 - 1; -1 < i7 && ((int[]) i00Ol00.I0000Il00O)[i7] == iIdentityHashCode; i7--) {
/* 82 */                                    i000liO i000lio2 = ((i000liO[]) i00Ol00.I0000O)[i7];
/* 92 */                                    if ((i000lio2 != null ? i000lio2.get() : null) == olO11I0O1l) {
/* 94 */                                        i2 = i7;
                                                break;
                                            }
                                        }
/* 99 */                                i5++;
/* 101 */                               int i8 = i00Ol00.I00000oOI;
                                        while (true) {
/* 103 */                                   if (i5 >= i8) {
/* 141 */                                       i2 = -(i00Ol00.I00000oOI + 1);
                                                break;
                                            } else {
/* 111 */                                       if (((int[]) i00Ol00.I0000Il00O)[i5] != iIdentityHashCode) {
/* 115 */                                           i2 = -(i5 + 1);
                                                    break;
                                                }
/* 121 */                                       i000liO i000lio3 = ((i000liO[]) i00Ol00.I0000O)[i5];
/* 131 */                                       if ((i000lio3 != null ? i000lio3.get() : null) == olO11I0O1l) {
                                                    break;
                                                } else {
/* 134 */                                           i5++;
                                                }
                                            }
                                        }
/* 63 */                                i2 = i5;
                                    }
                                }
                            }
/* 146 */                   if (i2 >= 0) {
/* 437 */                       return;
                            }
                        }
/* 151 */               int i9 = -(i2 + 1);
/* 154 */               i000liO[] i000lioArr = (i000liO[]) i00Ol00.I0000O;
/* 156 */               int length = i000lioArr.length;
/* 157 */               if (i == length) {
/* 159 */                   int i10 = length * 2;
/* 161 */                   i000liO[] i000lioArr2 = new i000liO[i10];
/* 163 */                   int[] iArr = new int[i10];
/* 165 */                   int i11 = i9 + 1;
/* 169 */                   System.arraycopy(i000lioArr, i9, i000lioArr2, i11, i - i9);
/* 176 */                   System.arraycopy((i000liO[]) i00Ol00.I0000O, 0, i000lioArr2, 0, i9);
/* 183 */                   I1IoiO1l.I000O01llI0(i11, i9, i, (int[]) i00Ol00.I0000Il00O, iArr);
/* 191 */                   I1IoiO1l.I000l1(0, i9, 6, (int[]) i00Ol00.I0000Il00O, iArr);
/* 194 */                   i00Ol00.I0000O = i000lioArr2;
/* 196 */                   i00Ol00.I0000Il00O = iArr;
                        } else {
/* 199 */                   int i12 = i9 + 1;
/* 203 */                   System.arraycopy(i000lioArr, i9, i000lioArr, i12, i - i9);
/* 208 */                   int[] iArr2 = (int[]) i00Ol00.I0000Il00O;
/* 210 */                   I1IoiO1l.I000O01llI0(i12, i9, i, iArr2, iArr2);
                        }
/* 222 */               ((i000liO[]) i00Ol00.I0000O)[i9] = new i000liO(olO11I0O1l);
/* 228 */               ((int[]) i00Ol00.I0000Il00O)[i9] = iIdentityHashCode;
                        i00Ol00.I00000oOI++;
                    }
                }

                public static final void I00100o1O0lo() {
/* 20 */            throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }

                public static final OlO1Ol0il0i I0010I0i(OlO1Ol0il0i olO1Ol0il0i, long j, Ol1l0OoOo ol1l0OoOo) {
/* 2 */             OlO1Ol0il0i olO1Ol0il0i2 = null;
/* 3 */             while (olO1Ol0il0i != null) {
/* 5 */                 long j2 = olO1Ol0il0i.I00000oIO;
/* 11 */                if (j2 != 0 && O0000Ioio00.I0001Ioi1lo(j2, j) <= 0 && !ol1l0OoOo.I000OOo1O(j2) && (olO1Ol0il0i2 == null || O0000Ioio00.I0001Ioi1lo(olO1Ol0il0i2.I00000oIO, olO1Ol0il0i.I00000oIO) < 0)) {
/* 38 */                    olO1Ol0il0i2 = olO1Ol0il0i;
                        }
/* 39 */                olO1Ol0il0i = olO1Ol0il0i.I00000oOI;
                    }
/* 42 */            if (olO1Ol0il0i2 != null) {
/* 44 */                return olO1Ol0il0i2;
                    }
/* 1 */             return null;
                }

                public static final OlO1Ol0il0i I0010o(OlO1Ol0il0i olO1Ol0il0i, OlO11I0O1l olO11I0O1l) {
                    OlO1Ol0il0i olO1Ol0il0iI0010I0i;
/* 1 */             Ol1il1o1 ol1il1o1I000O01llI0 = I000O01llI0();
/* 5 */             Function1 function1I0000oI00 = ol1il1o1I000O01llI0.I0000oI00();
/* 9 */             if (function1I0000oI00 != null) {
/* 11 */                function1I0000oI00.invoke(olO11I0O1l);
                    }
/* 22 */            OlO1Ol0il0i olO1Ol0il0iI0010I0i2 = I0010I0i(olO1Ol0il0i, ol1il1o1I000O01llI0.I000II(), ol1il1o1I000O01llI0.I0000O());
/* 26 */            if (olO1Ol0il0iI0010I0i2 != null) {
/* 106 */               return olO1Ol0il0iI0010I0i2;
                    }
                    synchronized (I0000Il00O) {
/* 31 */                Ol1il1o1 ol1il1o1I000O01llI02 = I000O01llI0();
/* 47 */                olO1Ol0il0iI0010I0i = I0010I0i(olO11I0O1l.I00000oOI(), ol1il1o1I000O01llI02.I000II(), ol1il1o1I000O01llI02.I0000O());
/* 51 */                if (olO1Ol0il0iI0010I0i == null) {
/* 55 */                    I00100o1O0lo();
/* 59 */                    throw null;
                        }
                    }
/* 54 */            return olO1Ol0il0iI0010I0i;
                }

                public static final void I00111O(int i) {
/* 1 */             I101oOiOiI i101oOiOiI = I0001Ioi1lo;
/* 7 */             int i2 = ((int[]) i101oOiOiI.I0000oI00)[i];
/* 13 */            i101oOiOiI.I000OOo1O(i2, i101oOiOiI.I00000oIO - 1);
                    i101oOiOiI.I00000oIO--;
/* 24 */            long[] jArr = (long[]) i101oOiOiI.I0000Il00O;
/* 26 */            long j = jArr[i2];
/* 28 */            int i3 = i2;
/* 29 */            while (i3 > 0) {
                        int i4 = ((i3 + 1) >> 1) - 1;
/* 43 */                if (O0000Ioio00.I0001Ioi1lo(jArr[i4], j) <= 0) {
                            break;
                        }
/* 45 */                i101oOiOiI.I000OOo1O(i4, i3);
/* 48 */                i3 = i4;
                    }
/* 52 */            long[] jArr2 = (long[]) i101oOiOiI.I0000Il00O;
/* 56 */            int i5 = i101oOiOiI.I00000oIO >> 1;
/* 58 */            while (i2 < i5) {
/* 62 */                int i6 = (i2 + 1) << 1;
                        int i7 = i6 - 1;
/* 68 */                if (i6 < i101oOiOiI.I00000oIO && O0000Ioio00.I0001Ioi1lo(jArr2[i6], jArr2[i7]) < 0) {
/* 88 */                    if (O0000Ioio00.I0001Ioi1lo(jArr2[i6], jArr2[i2]) >= 0) {
                                break;
                            }
/* 90 */                    i101oOiOiI.I000OOo1O(i6, i2);
/* 93 */                    i2 = i6;
                        } else {
/* 103 */                   if (O0000Ioio00.I0001Ioi1lo(jArr2[i7], jArr2[i2]) >= 0) {
                                break;
                            }
/* 105 */                   i101oOiOiI.I000OOo1O(i7, i2);
/* 108 */                   i2 = i7;
                        }
                    }
/* 116 */           ((int[]) i101oOiOiI.I0000oI00)[i] = i101oOiOiI.I00000oOI;
/* 118 */           i101oOiOiI.I00000oOI = i;
                }

                public static final Object I001IIilI0O(Io0O010 io0O010, Function1 function1) {
/* 1 */             long j = io0O010.I00000oOI;
/* 9 */             Object objInvoke = function1.invoke(I0000O.I0000O(j));
/* 13 */            long j2 = I0000oI00;
/* 18 */            I0000oI00 = 1 + j2;
/* 22 */            Ol1l0OoOo ol1l0OoOoI0000O = I0000O.I0000O(j);
/* 26 */            I0000O = ol1l0OoOoI0000O;
/* 28 */            io0O010.I00000oOI = j2;
/* 30 */            io0O010.I00000oIO = ol1l0OoOoI0000O;
/* 33 */            io0O010.I000II = 0;
/* 36 */            io0O010.I000O01llI0 = null;
/* 38 */            io0O010.I000oI1ioi();
/* 47 */            I0000O = I0000O.I000iOII(j2);
/* 106 */           return objInvoke;
                }

                public static final void I001IO000(Ol1il1o1 ol1il1o1) {
                    Long lValueOf;
/* 11 */            if (I0000O.I000OOo1O(ol1il1o1.I000II())) {
/* 168 */               return;
                    }
/* 13 */            long jI000II = ol1il1o1.I000II();
/* 17 */            boolean z = ol1il1o1.I0000Il00O;
/* 26 */            OI10OloOOoi oI10OloOOoi = ol1il1o1 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1 : null;
/* 36 */            String strValueOf = oI10OloOOoi != null ? Boolean.valueOf(oI10OloOOoi.I000lI) : "read-only";
                    synchronized (I0000Il00O) {
/* 41 */                I101oOiOiI i101oOiOiI = I0001Ioi1lo;
/* 57 */                lValueOf = Long.valueOf(i101oOiOiI.I00000oIO > 0 ? ((long[]) i101oOiOiI.I0000Il00O)[0] : -1L);
                    }
/* 109 */           throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jI000II + ", disposed=" + z + ", applied=" + strValueOf + ", lowestPin=" + lValueOf).toString());
                }

                public static final OlO1Ol0il0i I001i1O0Ol(OlO1Ol0il0i olO1Ol0il0i, OlO11I0O1l olO11I0O1l, Ol1il1o1 ol1il1o1) {
                    OlO1Ol0il0i olO1Ol0il0iI0010I0i;
                    OlO1Ol0il0i olO1Ol0il0iI0010I0i2;
/* 5 */             if (ol1il1o1.I0001Ioi1lo()) {
/* 7 */                 ol1il1o1.I000o00OoI0I(olO11I0O1l);
                    }
/* 10 */            long jI000II = ol1il1o1.I000II();
/* 18 */            OlO1Ol0il0i olO1Ol0il0iI0010I0i3 = I0010I0i(olO1Ol0il0i, jI000II, ol1il1o1.I0000O());
/* 23 */            if (olO1Ol0il0iI0010I0i3 == null) {
                        synchronized (I0000Il00O) {
/* 28 */                    Ol1il1o1 ol1il1o1I000O01llI0 = I000O01llI0();
/* 44 */                    olO1Ol0il0iI0010I0i2 = I0010I0i(olO11I0O1l.I00000oOI(), ol1il1o1I000O01llI0.I000II(), ol1il1o1I000O01llI0.I0000O());
/* 48 */                    if (olO1Ol0il0iI0010I0i2 == null) {
/* 53 */                        I00100o1O0lo();
/* 56 */                        throw null;
                            }
                        }
/* 51 */                olO1Ol0il0iI0010I0i3 = olO1Ol0il0iI0010I0i2;
                    }
/* 68 */            if (olO1Ol0il0iI0010I0i3.I00000oIO == ol1il1o1.I000II()) {
/* 70 */                return olO1Ol0il0iI0010I0i3;
                    }
                    synchronized (I0000Il00O) {
/* 82 */                olO1Ol0il0iI0010I0i = I0010I0i(olO11I0O1l.I00000oOI(), jI000II, ol1il1o1.I0000O());
/* 86 */                if (olO1Ol0il0iI0010I0i == null) {
/* 116 */                   I00100o1O0lo();
/* 119 */                   throw null;
                        }
/* 92 */                if (olO1Ol0il0iI0010I0i.I00000oIO != jI000II) {
/* 95 */                    OlO1Ol0il0i olO1Ol0il0iI000iOII = I000iOII(olO1Ol0il0iI0010I0i, olO11I0O1l);
/* 99 */                    olO1Ol0il0iI000iOII.I00000oIO(olO1Ol0il0iI0010I0i);
/* 106 */                   olO1Ol0il0iI000iOII.I00000oIO = ol1il1o1.I000II();
/* 108 */                   olO1Ol0il0iI0010I0i = olO1Ol0il0iI000iOII;
                        }
                    }
/* 110 */           ol1il1o1.I000o00OoI0I(olO11I0O1l);
/* 113 */           return olO1Ol0il0iI0010I0i;
                }
            }

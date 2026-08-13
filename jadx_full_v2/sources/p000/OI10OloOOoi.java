            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public class OI10OloOOoi extends Ol1il1o1 {
                public static final int[] I000o00OoI0I = new int[0];
                public final Function1 I0000oI00;
                public final Function1 I0001Ioi1lo;
                public int I000II;
                public OI10IIO I000O01llI0;
                public ArrayList I000OOo1O;
                public Ol1l0OoOo I000OiO;
                public int[] I000iOII;
                public int I000l1;
                public boolean I000lI;

                public OI10OloOOoi(long j, Ol1l0OoOo ol1l0OoOo, Function1 function1, Function1 function12) {
/* 1 */             super(j, ol1l0OoOo);
/* 4 */             this.I0000oI00 = function1;
/* 6 */             this.I0001Ioi1lo = function12;
/* 10 */            this.I000OiO = Ol1l0OoOo.I00ilI0I1;
/* 14 */            this.I000iOII = I000o00OoI0I;
/* 17 */            this.I000l1 = 1;
                }

                @Override
                public final void I00000oOI() {
/* 17 */            Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I0000O(I000II()).I00000oOI(this.I000OiO);
                }

                @Override
                public void I0000Il00O() {
/* 3 */             if (this.I0000Il00O) {
/* 55 */                return;
                    }
/* 6 */             this.I0000Il00O = true;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 11 */                I000oI1ioi();
                    }
/* 15 */            I000l1();
                }

                @Override
                public boolean I0001Ioi1lo() {
/* 1 */             return false;
                }

                @Override
                public int I000O01llI0() {
/* 1 */             return this.I000II;
                }

                @Override
                public Function1 I000OOo1O() {
/* 1 */             return this.I0001Ioi1lo;
                }

                @Override
                public void I000iOII() {
                    this.I000l1++;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000l1() {
/* 5 */             if (this.I000l1 <= 0) {
/* 10 */                OO1oio00IO.I00000oIO("no pending nested snapshots");
                    }
                    int i = this.I000l1 - 1;
/* 17 */            this.I000l1 = i;
/* 19 */            if (i != 0 || this.I000lI) {
/* 245 */               return;
                    }
/* 25 */            OI10IIO oi10iioI001i1lo1io = I001i1lo1io();
/* 29 */            if (oi10iioI001i1lo1io != null) {
/* 33 */                if (this.I000lI) {
/* 37 */                    OO1oio00IO.I00000oOI("Unsupported operation on a snapshot that has been applied");
                        }
/* 41 */                I001lllioOl(null);
/* 44 */                long jI000II = I000II();
/* 48 */                Object[] objArr = oi10iioI001i1lo1io.I00000oOI;
/* 50 */                long[] jArr = oi10iioI001i1lo1io.I00000oIO;
                        int length = jArr.length - 2;
/* 55 */                if (length >= 0) {
/* 57 */                    int i2 = 0;
                            while (true) {
/* 58 */                        long j = jArr[i2];
/* 72 */                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 81 */                            int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 84 */                            for (int i4 = 0; i4 < i3; i4++) {
/* 93 */                                if ((255 & j) < 128) {
/* 106 */                                   for (OlO1Ol0il0i olO1Ol0il0iI00000oOI = ((OlO11I0O1l) objArr[(i2 << 3) + i4]).I00000oOI(); olO1Ol0il0iI00000oOI != null; olO1Ol0il0iI00000oOI = olO1Ol0il0iI00000oOI.I00000oOI) {
/* 108 */                                       long j2 = olO1Ol0il0iI00000oOI.I00000oIO;
/* 112 */                                       if (j2 == jI000II || IOOi0Ool1i.I001i1O0Ol(this.I000OiO, Long.valueOf(j2))) {
/* 126 */                                           OiioI1Io0o oiioI1Io0o = Ol1l1lI1Ili.I00000oIO;
/* 130 */                                           olO1Ol0il0iI00000oOI.I00000oIO = 0L;
                                                }
                                            }
                                        }
/* 135 */                               j >>= 8;
                                    }
/* 139 */                           if (i3 != 8) {
                                        break;
                                    } else if (i2 == length) {
                                        break;
                                    } else {
/* 143 */                               i2++;
                                    }
                                }
                            }
                        }
                    }
/* 146 */           I00000oIO();
                }

                @Override
                public void I000lI() {
/* 3 */             if (this.I000lI || this.I0000Il00O) {
/* 20 */                return;
                    }
/* 10 */            I001IO000();
                }

                @Override
                public void I000o00OoI0I(OlO11I0O1l olO11I0O1l) {
/* 1 */             OI10IIO oi10iioI001i1lo1io = I001i1lo1io();
/* 5 */             if (oi10iioI001i1lo1io == null) {
/* 7 */                 OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 11 */                oi10iioI001i1lo1io = new OI10IIO();
/* 14 */                I001lllioOl(oi10iioI001i1lo1io);
                    }
/* 17 */            oi10iioI001i1lo1io.I00000oIO(olO11I0O1l);
                }

                @Override
                public final void I00100l0() {
/* 3 */             int length = this.I000iOII.length;
/* 5 */             for (int i = 0; i < length; i++) {
/* 11 */                Ol1l1lI1Ili.I00111O(this.I000iOII[i]);
                    }
/* 17 */            I000oI1ioi();
                }

                @Override
                public void I00111O(int i) {
/* 1 */             this.I000II = i;
                }

                @Override
                public Ol1il1o1 I001IIilI0O(Function1 function1) {
                    OII1iOOOl oII1iOOOl;
/* 3 */             if (this.I0000Il00O) {
/* 7 */                 OO1oio00IO.I00000oIO("Cannot use a disposed snapshot");
                    }
/* 12 */            if (this.I000lI && this.I0000O < 0) {
/* 21 */                OO1oio00IO.I00000oOI("Unsupported operation on a disposed or applied snapshot");
                    }
/* 24 */            long jI000II = I000II();
/* 32 */            I001lIiIIo1O(I000II());
/* 35 */            Object obj = Ol1l1lI1Ili.I0000Il00O;
                    synchronized (obj) {
/* 38 */                long j = Ol1l1lI1Ili.I0000oI00;
/* 44 */                Ol1l1lI1Ili.I0000oI00 = j + 1;
/* 52 */                Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I000iOII(j);
/* 75 */                oII1iOOOl = new OII1iOOOl(j, Ol1l1lI1Ili.I00000oIO(I0000O(), jI000II + 1, j), Ol1l1lI1Ili.I000OOo1O(function1, I0000oI00(), true), this);
                    }
/* 81 */            if (this.I000lI || this.I0000Il00O) {
/* 135 */               return oII1iOOOl;
                    }
/* 87 */            long jI000II2 = I000II();
                    synchronized (obj) {
/* 92 */                long j2 = Ol1l1lI1Ili.I0000oI00;
/* 96 */                Ol1l1lI1Ili.I0000oI00 = j2 + 1;
/* 98 */                I0010o(j2);
/* 111 */               Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I000iOII(I000II());
                    }
/* 127 */           I0010I0i(Ol1l1lI1Ili.I00000oIO(I0000O(), jI000II2 + 1, I000II()));
/* 130 */           return oII1iOOOl;
                }

                public final void I001IO000() {
/* 5 */             I001lIiIIo1O(I000II());
/* 10 */            if (this.I000lI || this.I0000Il00O) {
/* 110 */               return;
                    }
/* 16 */            long jI000II = I000II();
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 23 */                long j = Ol1l1lI1Ili.I0000oI00;
/* 29 */                Ol1l1lI1Ili.I0000oI00 = j + 1;
/* 31 */                I0010o(j);
/* 44 */                Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I000iOII(I000II());
                    }
/* 60 */            I0010I0i(Ol1l1lI1Ili.I00000oIO(I0000O(), jI000II + 1, I000II()));
                }

                /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public lOIo01O01 I001i1O0Ol() {
                    HashMap mapI000lI;
                    List list;
                    OI10IIO oi10iio;
                    long j;
                    long j2;
/* 3 */             OI10IIO oi10iioI001i1lo1io = I001i1lo1io();
/* 8 */             if (oi10iioI001i1lo1io != null) {
/* 12 */                long j3 = Ol1l1lI1Ili.I000OiO.I00000oOI;
/* 20 */                mapI000lI = Ol1l1lI1Ili.I000lI(j3, this, Ol1l1lI1Ili.I0000O.I0000O(j3));
                    } else {
/* 26 */                mapI000lI = null;
                    }
/* 27 */            Il01100l il01100l = Il01100l.I00iOIl;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
                        try {
/* 32 */                    Ol1l1lI1Ili.I001IO000(this);
/* 35 */                    if (oi10iioI001i1lo1io == null || oi10iioI001i1lo1io.I0000O == 0) {
/* 89 */                        I00000oOI();
/* 92 */                        Io0O010 io0O010 = Ol1l1lI1Ili.I000OiO;
/* 94 */                        OI10IIO oi10iio2 = io0O010.I000O01llI0;
/* 98 */                        Ol1l1lI1Ili.I001IIilI0O(io0O010, Ol1l1lI1Ili.I00000oIO);
/* 101 */                       if (oi10iio2 == null || !oi10iio2.I000O01llI0()) {
/* 114 */                           list = il01100l;
/* 115 */                           oi10iio = null;
                                } else {
/* 109 */                           list = Ol1l1lI1Ili.I000O01llI0;
/* 112 */                           oi10iio = oi10iio2;
                                }
                            } else {
/* 42 */                        Io0O010 io0O0102 = Ol1l1lI1Ili.I000OiO;
/* 54 */                        lOIo01O01 loio01o01I001l0I00 = I001l0I00(Ol1l1lI1Ili.I0000oI00, oi10iioI001i1lo1io, mapI000lI, Ol1l1lI1Ili.I0000O.I0000O(io0O0102.I00000oOI));
/* 64 */                        if (!loio01o01I001l0I00.equals(Ol1ilo1.I00000oIO)) {
/* 67 */                            return loio01o01I001l0I00;
                                }
/* 68 */                        I00000oOI();
/* 71 */                        oi10iio = io0O0102.I000O01llI0;
/* 75 */                        Ol1l1lI1Ili.I001IIilI0O(io0O0102, Ol1l1lI1Ili.I00000oIO);
/* 78 */                        I001lllioOl(null);
/* 81 */                        io0O0102.I000O01llI0 = null;
/* 83 */                        list = Ol1l1lI1Ili.I000O01llI0;
                            }
/* 118 */                   this.I000lI = true;
/* 120 */                   if (oi10iio != null) {
/* 122 */                       OiO1IO0000l oiO1IO0000lI00000oIO = lO0o01OilO.I00000oIO(oi10iio);
/* 132 */                       if (!oiO1IO0000lI00000oIO.I00iOIl.I000II()) {
/* 137 */                           int size = list.size();
/* 142 */                           for (int i = 0; i < size; i++) {
/* 150 */                               ((IlliIl1l11O) list.get(i)).invoke(oiO1IO0000lI00000oIO, this);
                                    }
                                }
                            }
/* 156 */                   if (oi10iioI001i1lo1io != null && oi10iioI001i1lo1io.I000O01llI0()) {
/* 164 */                       OiO1IO0000l oiO1IO0000lI00000oIO2 = lO0o01OilO.I00000oIO(oi10iioI001i1lo1io);
/* 171 */                       int size2 = list.size();
/* 176 */                       for (int i2 = 0; i2 < size2; i2++) {
/* 184 */                           ((IlliIl1l11O) list.get(i2)).invoke(oiO1IO0000lI00000oIO2, this);
                                }
                            }
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
                                try {
/* 193 */                           I00100l0();
/* 196 */                           Ol1l1lI1Ili.I0000O();
/* 207 */                           if (oi10iio != null) {
/* 209 */                               Object[] objArr = oi10iio.I00000oOI;
/* 211 */                               long[] jArr = oi10iio.I00000oIO;
                                        int length = jArr.length - 2;
/* 216 */                               if (length >= 0) {
/* 218 */                                   int i3 = 0;
/* 219 */                                   j = 128;
                                            while (true) {
/* 221 */                                       long j4 = jArr[i3];
/* 223 */                                       j2 = 255;
/* 231 */                                       if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 238 */                                           int i4 = 8 - ((~(i3 - length)) >>> 31);
/* 241 */                                           for (int i5 = 0; i5 < i4; i5++) {
/* 247 */                                               if ((j4 & 255) < 128) {
/* 257 */                                                   Ol1l1lI1Ili.I00100l0((OlO11I0O1l) objArr[(i3 << 3) + i5]);
                                                        }
/* 263 */                                               j4 >>= 8;
                                                    }
/* 267 */                                           if (i4 != 8) {
                                                        break;
                                                    }
/* 269 */                                           if (i3 == length) {
                                                        break;
                                                    }
/* 271 */                                           i3++;
                                                }
                                            }
                                        } else {
/* 274 */                                   j = 128;
/* 276 */                                   j2 = 255;
                                        }
                                    }
/* 278 */                           if (oi10iioI001i1lo1io != null) {
/* 280 */                               Object[] objArr2 = oi10iioI001i1lo1io.I00000oOI;
/* 282 */                               long[] jArr2 = oi10iioI001i1lo1io.I00000oIO;
                                        int length2 = jArr2.length - 2;
/* 287 */                               if (length2 >= 0) {
/* 289 */                                   int i6 = 0;
                                            while (true) {
/* 290 */                                       long j5 = jArr2[i6];
/* 298 */                                       if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 305 */                                           int i7 = 8 - ((~(i6 - length2)) >>> 31);
/* 308 */                                           for (int i8 = 0; i8 < i7; i8++) {
/* 314 */                                               if ((j5 & j2) < j) {
/* 323 */                                                   Ol1l1lI1Ili.I00100l0((OlO11I0O1l) objArr2[(i6 << 3) + i8]);
                                                        }
/* 326 */                                               j5 >>= 8;
                                                    }
/* 330 */                                           if (i7 != 8) {
                                                        break;
                                                    }
/* 332 */                                           if (i6 == length2) {
                                                        break;
                                                    }
/* 334 */                                           i6++;
                                                }
                                            }
                                        }
                                    }
/* 337 */                           ArrayList arrayList = this.I000OOo1O;
/* 339 */                           if (arrayList != null) {
/* 341 */                               int size3 = arrayList.size();
/* 346 */                               for (int i9 = 0; i9 < size3; i9++) {
/* 354 */                                   Ol1l1lI1Ili.I00100l0((OlO11I0O1l) arrayList.get(i9));
                                        }
                                    }
/* 360 */                           this.I000OOo1O = null;
                                } catch (Throwable th) {
/* 367 */                           throw th;
                                }
                            }
/* 363 */                   return Ol1ilo1.I00000oIO;
                        } catch (Throwable th2) {
/* 743 */                   throw th2;
                        }
                    }
                }

                public OI10IIO I001i1lo1io() {
/* 1 */             return this.I000O01llI0;
                }

                @Override
                public Function1 I0000oI00() {
/* 1 */             return this.I0000oI00;
                }

                public final lOIo01O01 I001l0I00(long j, OI10IIO oi10iio, HashMap map, Ol1l0OoOo ol1l0OoOo) {
                    ArrayList arrayList;
                    ArrayList arrayListI00O10llo;
                    ArrayList arrayList2;
                    Ol1l0OoOo ol1l0OoOo2;
                    Object[] objArr;
                    long[] jArr;
                    Ol1l0OoOo ol1l0OoOo3;
                    Object[] objArr2;
                    long[] jArr2;
                    int i;
                    long j2;
                    ArrayList arrayList3;
                    OlO1Ol0il0i olO1Ol0il0iI0000O;
/* 23 */            Ol1l0OoOo ol1l0OoOoI000OiO = I0000O().I000iOII(I000II()).I000OiO(this.I000OiO);
/* 27 */            Object[] objArr3 = oi10iio.I00000oOI;
/* 29 */            long[] jArr3 = oi10iio.I00000oIO;
                    int length = jArr3.length - 2;
/* 34 */            if (length >= 0) {
/* 36 */                int i2 = 0;
/* 37 */                arrayList2 = null;
/* 38 */                arrayListI00O10llo = null;
                        while (true) {
/* 39 */                    long j3 = jArr3[i2];
/* 58 */                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 67 */                        int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 71 */                        int i4 = 0;
/* 72 */                        while (i4 < i3) {
/* 82 */                            if ((j3 & 255) < 128) {
/* 90 */                                objArr2 = objArr3;
/* 94 */                                OlO11I0O1l olO11I0O1l = (OlO11I0O1l) objArr3[(i2 << 3) + i4];
/* 96 */                                jArr2 = jArr3;
/* 98 */                                OlO1Ol0il0i olO1Ol0il0iI00000oOI = olO11I0O1l.I00000oOI();
/* 102 */                               i = i4;
/* 104 */                               ArrayList arrayList4 = arrayList2;
/* 108 */                               OlO1Ol0il0i olO1Ol0il0iI0010I0i = Ol1l1lI1Ili.I0010I0i(olO1Ol0il0iI00000oOI, j, ol1l0OoOo);
/* 112 */                               if (olO1Ol0il0iI0010I0i == null) {
/* 114 */                                   arrayList3 = arrayListI00O10llo;
/* 116 */                                   j2 = j3;
                                        } else {
/* 119 */                                   arrayList3 = arrayListI00O10llo;
/* 121 */                                   j2 = j3;
/* 127 */                                   OlO1Ol0il0i olO1Ol0il0iI0010I0i2 = Ol1l1lI1Ili.I0010I0i(olO1Ol0il0iI00000oOI, I000II(), ol1l0OoOoI000OiO);
/* 131 */                                   if (olO1Ol0il0iI0010I0i2 != null && olO1Ol0il0iI0010I0i2.I00000oIO != 1 && !olO1Ol0il0iI0010I0i.equals(olO1Ol0il0iI0010I0i2)) {
/* 156 */                                       ol1l0OoOo3 = ol1l0OoOoI000OiO;
/* 162 */                                       OlO1Ol0il0i olO1Ol0il0iI0010I0i3 = Ol1l1lI1Ili.I0010I0i(olO1Ol0il0iI00000oOI, I000II(), I0000O());
/* 166 */                                       if (olO1Ol0il0iI0010I0i3 == null) {
/* 287 */                                           Ol1l1lI1Ili.I00100o1O0lo();
/* 290 */                                           throw null;
                                                }
/* 168 */                                       if (map == null || (olO1Ol0il0iI0000O = (OlO1Ol0il0i) map.get(olO1Ol0il0iI0010I0i)) == null) {
/* 178 */                                           olO1Ol0il0iI0000O = olO11I0O1l.I0000O(olO1Ol0il0iI0010I0i2, olO1Ol0il0iI0010I0i, olO1Ol0il0iI0010I0i3);
                                                }
/* 182 */                                       if (olO1Ol0il0iI0000O == null) {
/* 186 */                                           return new Ol1ilI(this);
                                                }
/* 194 */                                       if (!olO1Ol0il0iI0000O.equals(olO1Ol0il0iI0010I0i3)) {
/* 200 */                                           if (olO1Ol0il0iI0000O.equals(olO1Ol0il0iI0010I0i)) {
/* 210 */                                               ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
/* 225 */                                               arrayList5.add(new OIoi0IIoi(olO11I0O1l, olO1Ol0il0iI0010I0i.I00000oOI(I000II())));
/* 237 */                                               arrayListI00O10llo = arrayList3 == null ? new ArrayList() : arrayList3;
/* 239 */                                               arrayListI00O10llo.add(olO11I0O1l);
/* 242 */                                               arrayList2 = arrayList5;
                                                    } else {
/* 253 */                                               arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
/* 281 */                                               arrayList2.add(!olO1Ol0il0iI0000O.equals(olO1Ol0il0iI0010I0i2) ? new OIoi0IIoi(olO11I0O1l, olO1Ol0il0iI0000O) : new OIoi0IIoi(olO11I0O1l, olO1Ol0il0iI0010I0i2.I00000oOI(I000II())));
                                                    }
                                                }
/* 284 */                                       arrayListI00O10llo = arrayList3;
                                            }
/* 291 */                                   arrayList2 = arrayList4;
/* 284 */                                   arrayListI00O10llo = arrayList3;
                                        }
/* 142 */                               ol1l0OoOo3 = ol1l0OoOoI000OiO;
/* 291 */                               arrayList2 = arrayList4;
/* 284 */                               arrayListI00O10llo = arrayList3;
                                    } else {
/* 294 */                               ol1l0OoOo3 = ol1l0OoOoI000OiO;
/* 296 */                               objArr2 = objArr3;
/* 298 */                               jArr2 = jArr3;
/* 300 */                               i = i4;
/* 306 */                               j2 = j3;
                                    }
/* 310 */                           j3 = j2 >> 8;
/* 312 */                           i4 = i + 1;
/* 315 */                           jArr3 = jArr2;
/* 317 */                           objArr3 = objArr2;
/* 319 */                           ol1l0OoOoI000OiO = ol1l0OoOo3;
                                }
/* 325 */                       ol1l0OoOo2 = ol1l0OoOoI000OiO;
/* 327 */                       objArr = objArr3;
/* 329 */                       jArr = jArr3;
/* 337 */                       if (i3 != 8) {
                                    break;
                                }
                            } else {
/* 342 */                       ol1l0OoOo2 = ol1l0OoOoI000OiO;
/* 344 */                       objArr = objArr3;
/* 346 */                       jArr = jArr3;
                            }
/* 348 */                   if (i2 == length) {
/* 360 */                       arrayList = arrayList2;
                                break;
                            }
/* 350 */                   i2++;
/* 352 */                   jArr3 = jArr;
/* 354 */                   objArr3 = objArr;
/* 356 */                   ol1l0OoOoI000OiO = ol1l0OoOo2;
                        }
                    } else {
/* 364 */               arrayList = null;
/* 366 */               arrayListI00O10llo = null;
                    }
/* 367 */           arrayList2 = arrayList;
/* 368 */           if (arrayList2 != null) {
/* 370 */               I001IO000();
/* 373 */               int size = arrayList2.size();
/* 378 */               for (int i5 = 0; i5 < size; i5++) {
/* 384 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) arrayList2.get(i5);
/* 388 */                   OlO11I0O1l olO11I0O1l2 = (OlO11I0O1l) oIoi0IIoi.I00iOIl;
/* 392 */                   OlO1Ol0il0i olO1Ol0il0i = (OlO1Ol0il0i) oIoi0IIoi.I00iiI;
/* 394 */                   olO1Ol0il0i.I00000oIO = j;
                            synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 403 */                       olO1Ol0il0i.I00000oOI = olO11I0O1l2.I00000oOI();
/* 405 */                       olO11I0O1l2.I000OOo1O(olO1Ol0il0i);
                            }
                        }
                    }
/* 415 */           if (arrayListI00O10llo != null) {
/* 417 */               int size2 = arrayListI00O10llo.size();
/* 422 */               for (int i6 = 0; i6 < size2; i6++) {
/* 430 */                   oi10iio.I000l1((OlO11I0O1l) arrayListI00O10llo.get(i6));
                        }
/* 436 */               ArrayList arrayList6 = this.I000OOo1O;
/* 438 */               if (arrayList6 != null) {
/* 441 */                   arrayListI00O10llo = IOOi0Ool1i.I00O10llo(arrayList6, arrayListI00O10llo);
                        }
/* 445 */               this.I000OOo1O = arrayListI00O10llo;
                    }
/* 447 */           return Ol1ilo1.I00000oIO;
                }

                public final void I001lIiIIo1O(long j) {
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 10 */                this.I000OiO = this.I000OiO.I000iOII(j);
                    }
                }

                public void I001lllioOl(OI10IIO oi10iio) {
/* 1 */             this.I000O01llI0 = oi10iio;
                }

                public OI10OloOOoi I001lloI(Function1 function1, Function1 function12) {
                    OII1OIi oII1OIi;
/* 3 */             if (this.I0000Il00O) {
/* 7 */                 OO1oio00IO.I00000oIO("Cannot use a disposed snapshot");
                    }
/* 12 */            if (this.I000lI && this.I0000O < 0) {
/* 21 */                OO1oio00IO.I00000oOI("Unsupported operation on a disposed or applied snapshot");
                    }
/* 28 */            I001lIiIIo1O(I000II());
/* 31 */            Object obj = Ol1l1lI1Ili.I0000Il00O;
                    synchronized (obj) {
/* 34 */                long j = Ol1l1lI1Ili.I0000oI00;
/* 40 */                Ol1l1lI1Ili.I0000oI00 = j + 1;
/* 48 */                Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I000iOII(j);
/* 50 */                Ol1l0OoOo ol1l0OoOoI0000O = I0000O();
/* 58 */                I0010I0i(ol1l0OoOoI0000O.I000iOII(j));
/* 89 */                oII1OIi = new OII1OIi(j, Ol1l1lI1Ili.I00000oIO(ol1l0OoOoI0000O, I000II() + 1, j), Ol1l1lI1Ili.I000OOo1O(function1, I0000oI00(), true), Ol1l1lI1Ili.I000OiO(function12, I000OOo1O()));
/* 92 */                oII1OIi.I000oI1ioi = this;
/* 94 */                I000iOII();
/* 97 */                VarHandle.storeStoreFence();
                    }
/* 103 */           if (this.I000lI || this.I0000Il00O) {
/* 157 */               return oII1OIi;
                    }
/* 109 */           long jI000II = I000II();
                    synchronized (obj) {
/* 114 */               long j2 = Ol1l1lI1Ili.I0000oI00;
/* 118 */               Ol1l1lI1Ili.I0000oI00 = j2 + 1;
/* 120 */               I0010o(j2);
/* 133 */               Ol1l1lI1Ili.I0000O = Ol1l1lI1Ili.I0000O.I000iOII(I000II());
                    }
/* 149 */           I0010I0i(Ol1l1lI1Ili.I00000oIO(I0000O(), jI000II + 1, I000II()));
/* 152 */           return oII1OIi;
                }
            }

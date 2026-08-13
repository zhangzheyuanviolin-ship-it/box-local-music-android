            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O0o0oil1l1o implements OiIiol10, OiIii0 {
                public final OiIl0IIi0 I00iOIl;
                public final OiIii0 I00iiI;
                public final OI10IIO I00iiO;

                public O0o0oil1l1o(OiIiol10 oiIiol10, Map map, OiIil1il oiIil1il) {
/* 4 */             O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(7);
/* 7 */             o0l0IlolloIO.I00iiI = oiIiol10;
/* 9 */             VarHandle.storeStoreFence();
/* 19 */            this.I00iOIl = OiIl0oI.I00000oIO(map, o0l0IlolloIO);
/* 21 */            this.I00iiI = oiIil1il;
/* 23 */            OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 30 */            this.I00iiO = new OI10IIO();
                }

                @Override
                public final OiIiloli0I I00000oIO(String str, IllOOo00lI illOOo00lI) {
/* 3 */             return this.I00iOIl.I00000oIO(str, illOOo00lI);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Object obj, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-858296452);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(obj) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000OOo1O(this) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 70 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 76 */                this.I00iiI.I00000oOI(obj, iOii1l, iloI0lOlll1, i2 & 126);
/* 87 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(this) | iloI0lOlll1.I000OOo1O(obj);
/* 88 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 92 */                if (!zI000OOo1O) {
                            Object obj2 = objI00O0i0ii;
/* 96 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 102 */                       IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(22);
/* 105 */                       iiioilIl1Il.I00iiI = this;
/* 107 */                       iiioilIl1Il.I00iiO = obj;
/* 109 */                       VarHandle.storeStoreFence();
/* 112 */                       iloI0lOlll1.I00iio(iiioilIl1Il);
                                obj2 = iiioilIl1Il;
                            }
/* 117 */                   iIO0iiOiOl0l.I00000oOI(obj, (Function1) obj2, iloI0lOlll1);
                        }
                    } else {
/* 121 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 124 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 128 */           if (oOloioIlI001IO000 != null) {
/* 134 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(14);
/* 137 */               i0IliiililIo.I00iiO = this;
/* 139 */               i0IliiililIo.I00iio = obj;
/* 141 */               i0IliiililIo.I00ilI0I1 = iOii1l;
/* 143 */               i0IliiililIo.I00iiI = i;
/* 145 */               VarHandle.storeStoreFence();
/* 148 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 3 */             return this.I00iOIl.I0000Il00O(obj);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Map I0000O() {
/* 1 */             OI10IIO oi10iio = this.I00iiO;
/* 3 */             Object[] objArr = oi10iio.I00000oOI;
/* 5 */             long[] jArr = oi10iio.I00000oIO;
                    int length = jArr.length - 2;
/* 10 */            if (length >= 0) {
/* 13 */                int i = 0;
                        while (true) {
/* 14 */                    long j = jArr[i];
/* 28 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 37 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 40 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 49 */                            if ((255 & j) < 128) {
/* 58 */                                this.I00iiI.I0001Ioi1lo(objArr[(i << 3) + i3]);
                                    }
/* 61 */                            j >>= 8;
                                }
/* 65 */                        if (i2 != 8) {
                                    break;
                                }
/* 67 */                        if (i == length) {
                                    break;
                                }
/* 69 */                        i++;
                            }
                        }
                    }
/* 74 */            return this.I00iOIl.I0000O();
                }

                @Override
                public final Object I0000oI00(String str) {
/* 3 */             return this.I00iOIl.I0000oI00(str);
                }

                @Override
                public final void I0001Ioi1lo(Object obj) {
/* 3 */             this.I00iiI.I0001Ioi1lo(obj);
                }
            }

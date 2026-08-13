            package p000;

            import android.content.Context;
            import android.graphics.BlendModeColorFilter;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class IiII11OIl {
                public static final OO1loiii I00000oIO = new OO1loiii(true, 30);

                /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oloo01 oloo01, Olol0I1o1IO olol0I1o1IO, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(1904307118);
/* 29 */            int i2 = i | (iloI0lOlll1.I000II(oloo01) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(olol0I1o1IO) ? 32 : 16);
/* 47 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 52 */                iloI0lOlll1.I00i01iIIliI(-1009482584);
/* 61 */                Object obj = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 63 */                iloI0lOlll1.I0010I0i(false);
/* 82 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(olol0I1o1IO) | ((i2 & 14) == 4) | iloI0lOlll1.I000OOo1O(obj);
/* 83 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 87 */                if (!zI000OOo1O) {
                            Object obj2 = objI00O0i0ii;
/* 91 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 97 */                        I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(13);
/* 100 */                       i01oIoOI01l.I00iiI = olol0I1o1IO;
/* 102 */                       i01oIoOI01l.I00iiO = obj;
/* 104 */                       i01oIoOI01l.I00iio = oloo01;
/* 106 */                       VarHandle.storeStoreFence();
/* 109 */                       iloI0lOlll1.I00iio(i01oIoOI01l);
                                obj2 = i01oIoOI01l;
                            }
/* 119 */                   iloI0lOlll12 = iloI0lOlll1;
/* 120 */                   IOoiO0l.I00000oOI(null, null, (Function1) obj2, iloI0lOlll12, 0, 3);
                        }
                    } else {
/* 124 */               iloI0lOlll12 = iloI0lOlll1;
/* 125 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 128 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 132 */           if (oOloioIlI001IO000 != null) {
/* 138 */               I0Il0I1o i0Il0I1o = new I0Il0I1o(23);
/* 141 */               i0Il0I1o.I00iiO = oloo01;
/* 143 */               i0Il0I1o.I00iiI = olol0I1o1IO;
/* 145 */               VarHandle.storeStoreFence();
/* 148 */               oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }

                public static final void I00000oOI(int i, long j, IloI0lOlll1 iloI0lOlll1, int i2) {
                    int i3;
                    OOloioIl oOloioIlI001IO000;
                    IiII0oOOoiO iiII0oOOoiO;
                    Object obj;
/* 12 */            iloI0lOlll1.I00i0O(-1240244237);
/* 18 */            if ((i2 & 6) == 0) {
/* 29 */                i3 = (iloI0lOlll1.I0000oI00(i) ? 4 : 2) | i2;
                    } else {
/* 31 */                i3 = i2;
                    }
/* 36 */            if ((i2 & 48) == 0) {
/* 48 */                i3 |= iloI0lOlll1.I0001Ioi1lo(j) ? 32 : 16;
                    }
/* 54 */            int i4 = 0;
/* 66 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 74 */                Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 87 */                boolean zI000II = ((i3 & 14) == 4) | iloI0lOlll1.I000II(context);
/* 88 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 93 */                Object obj2 = IOl11li.I00000oIO;
/* 95 */                if (zI000II || objI00O0i0ii == obj2) {
/* 111 */                   objI00O0i0ii = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
/* 115 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 120 */               int iIntValue = ((Number) objI00O0i0ii).intValue();
/* 124 */               if (iIntValue == -1) {
/* 126 */                   oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 130 */                   if (oOloioIlI001IO000 != null) {
/* 134 */                       iiII0oOOoiO = new IiII0oOOoiO(i);
/* 137 */                       iiII0oOOoiO.I00iiI = i;
/* 139 */                       iiII0oOOoiO.I00iiO = j;
/* 141 */                       iiII0oOOoiO.I00iio = i2;
/* 143 */                       VarHandle.storeStoreFence();
/* 146 */                       oOloioIlI001IO000.I0000O = iiII0oOOoiO;
                            }
/* 1182 */                  return;
                        }
/* 149 */               OIoOo11 oIoOo11I00000oIO = l1o1loI0I0o.I00000oIO(iIntValue, iloI0lOlll1);
/* 155 */               i = (i3 & 112) != 32 ? 0 : 1;
/* 159 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 163 */               if (i != 0 || objI00O0i0ii2 == obj2) {
/* 171 */                   if (j == 16) {
/* 173 */                       obj = null;
                            } else {
/* 191 */                       II0oIl iI0oIl = new II0oIl(new BlendModeColorFilter(iiO01ll11o1l.I000OOo1O(j), iOIill.I00000oIO(5)));
/* 194 */                       iI0oIl.I00000oOI = j;
/* 196 */                       iI0oIl.I0000Il00O = 5;
/* 198 */                       VarHandle.storeStoreFence();
                                obj = iI0oIl;
                            }
/* 201 */                   iloI0lOlll1.I00iio(obj);
                            obj3 = obj;
                        }
/* 228 */               II1oOI10.I00000oIO(iO01O00o.I00000oIO(Ol0iOOO0.I000lI(O1ooIo101ll.I00000oIO, IOoiIOo1.I0000oI00), oIoOo11I00000oIO, null, IOoOIiOl1llI.I00000oOI, 0.0f, (IOOil0) obj3, 22), iloI0lOlll1, 0);
                    } else {
/* 232 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 235 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 239 */           if (oOloioIlI001IO000 != null) {
/* 243 */               iiII0oOOoiO = new IiII0oOOoiO(i4);
/* 137 */               iiII0oOOoiO.I00iiI = i;
/* 139 */               iiII0oOOoiO.I00iiO = j;
/* 141 */               iiII0oOOoiO.I00iio = i2;
/* 143 */               VarHandle.storeStoreFence();
/* 146 */               oOloioIlI001IO000.I0000O = iiII0oOOoiO;
                    }
                }

                public static final void I0000Il00O(Oloo01 oloo01, Olol1IOOol0 olol1IOOol0, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 7 */             iloI0lOlll1.I00i0O(-2040393164);
/* 13 */            if ((i & 6) == 0) {
/* 33 */                i2 = ((i & 8) == 0 ? iloI0lOlll1.I000II(oloo01) : iloI0lOlll1.I000OOo1O(oloo01) ? 4 : 2) | i;
                    } else {
/* 35 */                i2 = i;
                    }
/* 40 */            if ((i & 48) == 0) {
/* 61 */                i2 |= (i & 64) == 0 ? iloI0lOlll1.I000II(olol1IOOol0) : iloI0lOlll1.I000OOo1O(olol1IOOol0) ? 32 : 16;
                    }
/* 64 */            if ((i & 384) == 0) {
/* 77 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 82 */            boolean z = false;
/* 95 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 114 */               boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && iloI0lOlll1.I000II(olol1IOOol0));
/* 115 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 119 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 121 */               if (z2 || objI00O0i0ii == obj) {
/* 132 */                   IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(3);
/* 135 */                   iO1Io1IOOOIi.I00iiI = olol1IOOol0;
/* 137 */                   iO1Io1IOOOIi.I00iiO = illOOo00lI;
/* 139 */                   VarHandle.storeStoreFence();
/* 143 */                   Oi1ol0llI oi1ol0llI = new Oi1ol0llI(7, z);
/* 146 */                   oi1ol0llI.I00iiI = iO1Io1IOOOIi;
/* 148 */                   VarHandle.storeStoreFence();
/* 151 */                   O1OIO00iii o1OIO00iii = new O1OIO00iii();
/* 154 */                   o1OIO00iii.I00iOIl = oi1ol0llI;
/* 156 */                   VarHandle.storeStoreFence();
/* 159 */                   iloI0lOlll1.I00iio(o1OIO00iii);
                            obj2 = o1OIO00iii;
                        }
/* 162 */               O1OIO00iii o1OIO00iii2 = (O1OIO00iii) obj2;
/* 166 */               if ((i2 & 14) == 4 || ((i2 & 8) != 0 && iloI0lOlll1.I000OOo1O(oloo01))) {
/* 178 */                   z = true;
                        }
/* 179 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 183 */               if (z || objI00O0i0ii2 == obj) {
/* 191 */                   I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(26);
/* 194 */                   i0OIOO00l0O.I00iiI = oloo01;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   iloI0lOlll1.I00iio(i0OIOO00l0O);
                            obj3 = i0OIOO00l0O;
                        }
/* 203 */               IllOOo00lI illOOo00lI2 = (IllOOo00lI) obj3;
/* 209 */               I0Il0I1o i0Il0I1o = new I0Il0I1o(22);
/* 212 */               i0Il0I1o.I00iiO = olol1IOOol0;
/* 214 */               i0Il0I1o.I00iiI = oloo01;
/* 216 */               VarHandle.storeStoreFence();
/* 234 */               I0olo0.I00000oIO(o1OIO00iii2, illOOo00lI2, I00000oIO, iiioOl1O.I00000oOI(1315155414, i0Il0I1o, iloI0lOlll1), iloI0lOlll1, 3456, 0);
                    } else {
/* 238 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 241 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 245 */           if (oOloioIlI001IO000 != null) {
/* 251 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(9);
/* 254 */               i0IliiililIo.I00iiO = oloo01;
/* 256 */               i0IliiililIo.I00ilI0I1 = olol1IOOol0;
/* 258 */               i0IliiililIo.I00iio = illOOo00lI;
/* 260 */               i0IliiililIo.I00iiI = i;
/* 262 */               VarHandle.storeStoreFence();
/* 265 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                public static final void I0000O(O1ooiI111i o1ooiI111i, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(1392105195);
/* 9 */             int i3 = 2;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 55 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 68 */                iOOo1li.I00000oIO(o1ooiI111i, OloloO.I00000oIO, iOii1l, iloI0lOlll1, ((i2 << 6) & 7168) | (i2 & 14) | 432);
                    } else {
/* 72 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 75 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 79 */            if (oOloioIlI001IO000 != null) {
/* 83 */                I100Oio0OiOo i100Oio0OiOo = new I100Oio0OiOo(i3);
/* 86 */                i100Oio0OiOo.I00iiI = o1ooiI111i;
/* 88 */                i100Oio0OiOo.I00iiO = iOii1l;
/* 90 */                i100Oio0OiOo.I00iio = i;
/* 92 */                VarHandle.storeStoreFence();
/* 95 */                oOloioIlI001IO000.I0000O = i100Oio0OiOo;
                    }
                }
            }

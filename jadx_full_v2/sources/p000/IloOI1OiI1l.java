            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IloOI1OiI1l implements Function1 {
                public OI1OIlllll0 I00iOIl;
                public boolean I00iiI;
                public long I00iiO;
                public boolean I00iio;
                public long I00ilI0I1;
                public long I00ilO0;

                @Override
                public final Object invoke(Object obj) {
                    char c;
                    ArrayList arrayList;
                    long j;
                    IilloIOOO0i iilloIOOO0i;
                    LinkedHashMap linkedHashMap;
/* 3 */             OI1OIlllll0 oI1OIlllll0 = this.I00iOIl;
/* 5 */             boolean z = this.I00iiI;
/* 7 */             long j2 = this.I00iiO;
/* 9 */             boolean z2 = this.I00iio;
/* 11 */            long j3 = this.I00ilI0I1;
/* 13 */            long j4 = this.I00ilO0;
/* 17 */            IilloIOOO0i iilloIOOO0i2 = (IilloIOOO0i) obj;
/* 23 */            char c2 = ' ';
/* 27 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() >> 32));
/* 43 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() & 4294967295L));
/* 47 */            float f = oI1OIlllll0.I00000oOI;
/* 50 */            float f2 = oI1OIlllll0.I0000Il00O;
/* 56 */            if (f > 0.0f && f2 > 0.0f && fIntBitsToFloat > 0.0f && fIntBitsToFloat2 > 0.0f) {
/* 87 */                float fMax = z ? Math.max(fIntBitsToFloat / f, fIntBitsToFloat2 / f2) : Math.min(fIntBitsToFloat / f, fIntBitsToFloat2 / f2);
/* 96 */                float f3 = (fIntBitsToFloat - (f * fMax)) / 2.0f;
/* 100 */               float f4 = (fIntBitsToFloat2 - (f2 * fMax)) / 2.0f;
/* 104 */               float fI00i0ilIl0i = iilloIOOO0i2.I00i0ilIl0i(3.0f);
/* 108 */               OI1OIiIiIl oI1OIiIiIl = oI1OIlllll0.I00000oIO;
/* 112 */               if (oI1OIiIiIl instanceof OI1O1iOo00i0) {
/* 116 */                   ArrayList<OI1O1lOIio0> arrayList2 = ((OI1O1iOo00i0) oI1OIiIiIl).I00000oIO;
/* 124 */                   int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(arrayList2, 10));
/* 130 */                   if (iI00000oIO < 16) {
/* 132 */                       iI00000oIO = 16;
                            }
/* 135 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap(iI00000oIO);
/* 146 */                   for (Object obj2 : arrayList2) {
/* 161 */                       linkedHashMap2.put(Integer.valueOf(((OI1O1lOIio0) obj2).I00000oIO), obj2);
                            }
/* 179 */                   for (OIoi0IIoi oIoi0IIoi : Iloo0ilo.I00000oIO) {
/* 191 */                       int iIntValue = ((Number) oIoi0IIoi.I00iOIl).intValue();
/* 199 */                       int iIntValue2 = ((Number) oIoi0IIoi.I00iiI).intValue();
/* 211 */                       OI1O1lOIio0 oI1O1lOIio0 = (OI1O1lOIio0) linkedHashMap2.get(Integer.valueOf(iIntValue));
/* 221 */                       OI1O1lOIio0 oI1O1lOIio02 = (OI1O1lOIio0) linkedHashMap2.get(Integer.valueOf(iIntValue2));
/* 223 */                       if (oI1O1lOIio0 == null || oI1O1lOIio02 == null || oI1O1lOIio0.I0000O <= 0.5f || oI1O1lOIio02.I0000O <= 0.5f) {
/* 317 */                           c = c2;
/* 319 */                           arrayList = arrayList2;
/* 321 */                           j = j3;
/* 322 */                           iilloIOOO0i = iilloIOOO0i2;
/* 323 */                           linkedHashMap = linkedHashMap2;
                                } else {
/* 242 */                           float f5 = (oI1O1lOIio0.I00000oOI * fMax) + f3;
/* 244 */                           if (z2) {
/* 246 */                               f5 = fIntBitsToFloat - f5;
                                    }
/* 262 */                           c = c2;
/* 264 */                           arrayList = arrayList2;
/* 271 */                           long jFloatToRawIntBits = (Float.floatToRawIntBits((oI1O1lOIio0.I0000Il00O * fMax) + f4) & 4294967295L) | (Float.floatToRawIntBits(f5) << c);
/* 275 */                           float f6 = (oI1O1lOIio02.I00000oOI * fMax) + f3;
/* 277 */                           if (z2) {
/* 279 */                               f6 = fIntBitsToFloat - f6;
                                    }
/* 302 */                           long jFloatToRawIntBits2 = (Float.floatToRawIntBits((oI1O1lOIio02.I0000Il00O * fMax) + f4) & 4294967295L) | (Float.floatToRawIntBits(f6) << c);
/* 307 */                           iilloIOOO0i = iilloIOOO0i2;
/* 308 */                           linkedHashMap = linkedHashMap2;
/* 310 */                           j = j3;
/* 313 */                           IilloIOOO0i.I00oli(iilloIOOO0i, j2, jFloatToRawIntBits, jFloatToRawIntBits2, fI00i0ilIl0i, 0, null, 496);
                                }
/* 324 */                       j3 = j;
/* 325 */                       linkedHashMap2 = linkedHashMap;
/* 326 */                       arrayList2 = arrayList;
/* 328 */                       c2 = c;
/* 330 */                       iilloIOOO0i2 = iilloIOOO0i;
                            }
/* 333 */                   char c3 = c2;
/* 337 */                   long j5 = j3;
/* 338 */                   IilloIOOO0i iilloIOOO0i3 = iilloIOOO0i2;
/* 341 */                   float fI00i0ilIl0i2 = iilloIOOO0i3.I00i0ilIl0i(5.0f);
/* 353 */                   for (OI1O1lOIio0 oI1O1lOIio03 : arrayList2) {
/* 365 */                       if (oI1O1lOIio03.I0000O > 0.5f) {
/* 370 */                           float f7 = (oI1O1lOIio03.I00000oOI * fMax) + f3;
/* 372 */                           if (z2) {
/* 374 */                               f7 = fIntBitsToFloat - f7;
                                    }
/* 402 */                           IilloIOOO0i.I00iiO(iilloIOOO0i3, j5, fI00i0ilIl0i2, (Float.floatToRawIntBits(f7) << c3) | (Float.floatToRawIntBits((oI1O1lOIio03.I0000Il00O * fMax) + f4) & 4294967295L), null, 120);
                                }
                            }
                        } else {
/* 411 */                   if (!(oI1OIiIiIl instanceof OI1O1i)) {
/* 510 */                       I000II.I00000oIO();
/* 513 */                       return null;
                            }
/* 415 */                   float fI00i0ilIl0i3 = iilloIOOO0i2.I00i0ilIl0i(1.5f);
/* 423 */                   Iterator it = ((OI1O1i) oI1OIiIiIl).I00000oIO.iterator();
/* 431 */                   while (it.hasNext()) {
/* 441 */                       Iterator it2 = ((List) it.next()).iterator();
/* 449 */                       while (it2.hasNext()) {
/* 467 */                           float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (((OIOlIiiioi) it2.next()).I00000oIO >> 32)) * fMax) + f3;
/* 469 */                           if (z2) {
/* 471 */                               fIntBitsToFloat3 = fIntBitsToFloat - fIntBitsToFloat3;
                                    }
/* 506 */                           IilloIOOO0i.I00iiO(iilloIOOO0i2, j4, fI00i0ilIl0i3, (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (r4 & 4294967295L)) * fMax) + f4) & 4294967295L), null, 120);
                                }
                            }
                        }
                    }
/* 515 */           return OoiIlOl1iI.I00000oIO;
                }
            }

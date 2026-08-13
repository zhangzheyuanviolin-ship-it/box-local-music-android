            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            public abstract class lOO0oI {
                public static OlI1Oi I00000oIO(byte[] bArr) {
                    float fIntBitsToFloat;
/* 5 */             ArrayList arrayList = new ArrayList();
/* 11 */            Ii11iIi ii11iIi = new Ii11iIi(2);
/* 14 */            ii11iIi.I00000oOI = bArr;
/* 16 */            int i = 0;
/* 17 */            ii11iIi.I0000Il00O = 0;
/* 19 */            VarHandle.storeStoreFence();
                    while (true) {
/* 26 */                fIntBitsToFloat = 0.0f;
/* 28 */                if (ii11iIi.I0000Il00O >= bArr.length) {
                            break;
                        }
/* 30 */                long jI000OOo1O = ii11iIi.I000OOo1O();
/* 37 */                int i2 = (int) (jI000OOo1O >>> 3);
/* 38 */                long j = 7;
/* 41 */                int i3 = (int) (jI000OOo1O & 7);
/* 42 */                if (i2 == 1 && i3 == 2) {
/* 53 */                    int iI000OOo1O = ii11iIi.I0000Il00O + ((int) ii11iIi.I000OOo1O());
/* 54 */                    String str = "";
/* 56 */                    int iI000OOo1O2 = 1;
/* 59 */                    while (ii11iIi.I0000Il00O < iI000OOo1O) {
/* 61 */                        long jI000OOo1O2 = ii11iIi.I000OOo1O();
/* 65 */                        long j2 = j;
/* 69 */                        int i4 = (int) (jI000OOo1O2 >>> 3);
/* 72 */                        int i5 = (int) (jI000OOo1O2 & j2);
/* 73 */                        if (i4 == 1 && i5 == 2) {
/* 81 */                            int iI000OOo1O3 = (int) ii11iIi.I000OOo1O();
/* 88 */                            String str2 = new String(bArr, ii11iIi.I0000Il00O, iI000OOo1O3, IO1IOI.I00000oIO);
                                    ii11iIi.I0000Il00O += iI000OOo1O3;
/* 96 */                            str = str2;
                                } else if (i4 == 2 && i5 == 5) {
/* 105 */                           byte[] bArr2 = ii11iIi.I00000oOI;
/* 107 */                           int i6 = ii11iIi.I0000Il00O;
/* 139 */                           int i7 = ((bArr2[i6 + 3] & 255) << 24) | (bArr2[i6] & 255) | ((bArr2[i6 + 1] & 255) << 8) | ((bArr2[i6 + 2] & 255) << 16);
/* 141 */                           ii11iIi.I0000Il00O = i6 + 4;
/* 143 */                           fIntBitsToFloat = Float.intBitsToFloat(i7);
                                } else if (i4 == 3 && i5 == 0) {
/* 156 */                           iI000OOo1O2 = (int) ii11iIi.I000OOo1O();
                                } else {
/* 158 */                           ii11iIi.I000O01llI0(i5);
                                }
/* 97 */                        j = j2;
                            }
/* 162 */                   ii11iIi.I0000Il00O = iI000OOo1O;
/* 166 */                   OlI1OOIoii1l olI1OOIoii1l = new OlI1OOIoii1l();
/* 169 */                   olI1OOIoii1l.I00000oIO = str;
/* 171 */                   olI1OOIoii1l.I00000oOI = fIntBitsToFloat;
/* 173 */                   olI1OOIoii1l.I0000Il00O = iI000OOo1O2;
/* 175 */                   VarHandle.storeStoreFence();
/* 178 */                   arrayList.add(olI1OOIoii1l);
                        } else {
/* 183 */                   ii11iIi.I000O01llI0(i3);
                        }
                    }
/* 195 */           HashMap map = new HashMap(arrayList.size() * 2);
/* 198 */           int size = arrayList.size();
/* 202 */           float[] fArr = new float[size];
/* 205 */           for (int i8 = 0; i8 < size; i8++) {
/* 210 */               fArr[i8] = -1.0E30f;
                    }
/* 215 */           Iterator it = arrayList.iterator();
/* 219 */           int length = 1;
/* 224 */           while (it.hasNext()) {
/* 226 */               int i9 = i + 1;
/* 232 */               OlI1OOIoii1l olI1OOIoii1l2 = (OlI1OOIoii1l) it.next();
/* 234 */               float f = olI1OOIoii1l2.I00000oOI;
/* 236 */               String str3 = olI1OOIoii1l2.I00000oIO;
/* 238 */               fArr[i] = f;
/* 240 */               int i10 = olI1OOIoii1l2.I0000Il00O;
/* 242 */               if ((i10 == 1 || i10 == 4) && str3.length() > 0) {
/* 256 */                   map.put(str3, Integer.valueOf(i));
/* 263 */                   if (str3.length() > length) {
/* 265 */                       length = str3.length();
                            }
/* 270 */                   float f2 = olI1OOIoii1l2.I00000oOI;
/* 274 */                   if (f2 < fIntBitsToFloat) {
/* 276 */                       fIntBitsToFloat = f2;
                            }
                        }
/* 277 */               i = i9;
                    }
/* 284 */           OlI1Oi olI1Oi = new OlI1Oi();
/* 287 */           olI1Oi.I00000oIO = map;
/* 289 */           olI1Oi.I00000oOI = length;
/* 291 */           olI1Oi.I0000Il00O = fIntBitsToFloat - 10.0f;
/* 293 */           VarHandle.storeStoreFence();
/* 296 */           olI1Oi.I0000O = fArr;
/* 298 */           arrayList.size();
/* 437 */           return olI1Oi;
                }
            }

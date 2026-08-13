            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            public abstract class lOO011Io1 {
                public static o00io0IiOOo0 I00000oIO(byte[] bArr) {
                    char c;
                    Integer numI000lI;
/* 8 */             ArrayList arrayList = new ArrayList(256000);
/* 14 */            Ii11iIi ii11iIi = new Ii11iIi(1);
/* 17 */            ii11iIi.I00000oOI = bArr;
/* 20 */            ii11iIi.I0000Il00O = 0;
/* 22 */            VarHandle.storeStoreFence();
/* 33 */            while (ii11iIi.I0000Il00O < bArr.length) {
/* 35 */                long jI000OOo1O = ii11iIi.I000OOo1O();
/* 41 */                int i = (int) (jI000OOo1O >>> 3);
/* 42 */                long j = 7;
/* 45 */                int i2 = (int) (jI000OOo1O & 7);
/* 46 */                if (i == 1 && i2 == 2) {
/* 57 */                    int iI000OOo1O = ii11iIi.I0000Il00O + ((int) ii11iIi.I000OOo1O());
/* 58 */                    String str = "";
/* 60 */                    float fIntBitsToFloat = 0.0f;
/* 61 */                    int iI000OOo1O2 = 1;
/* 64 */                    while (ii11iIi.I0000Il00O < iI000OOo1O) {
/* 66 */                        long jI000OOo1O2 = ii11iIi.I000OOo1O();
/* 70 */                        long j2 = j;
/* 74 */                        int i3 = (int) (jI000OOo1O2 >>> 3);
/* 75 */                        String str2 = str;
/* 79 */                        int i4 = (int) (jI000OOo1O2 & j2);
/* 80 */                        if (i3 == 1 && i4 == 2) {
/* 88 */                            int iI000OOo1O3 = (int) ii11iIi.I000OOo1O();
/* 95 */                            str = new String(bArr, ii11iIi.I0000Il00O, iI000OOo1O3, IO1IOI.I00000oIO);
                                    ii11iIi.I0000Il00O += iI000OOo1O3;
/* 103 */                           j = j2;
                                } else {
/* 107 */                           if (i3 == 2 && i4 == 5) {
/* 111 */                               byte[] bArr2 = ii11iIi.I00000oOI;
/* 113 */                               int i5 = ii11iIi.I0000Il00O;
/* 144 */                               int i6 = ((bArr2[i5 + 3] & 255) << 24) | (bArr2[i5] & 255) | ((bArr2[i5 + 1] & 255) << 8) | ((bArr2[i5 + 2] & 255) << 16);
/* 147 */                               ii11iIi.I0000Il00O = i5 + 4;
/* 149 */                               fIntBitsToFloat = Float.intBitsToFloat(i6);
                                    } else if (i3 == 3 && i4 == 0) {
/* 166 */                               iI000OOo1O2 = (int) ii11iIi.I000OOo1O();
                                    } else {
/* 168 */                               ii11iIi.I000O01llI0(i4);
                                    }
/* 153 */                           j = j2;
/* 155 */                           str = str2;
                                }
                            }
/* 174 */                   ii11iIi.I0000Il00O = iI000OOo1O;
/* 178 */                   OlI1IiII1 olI1IiII1 = new OlI1IiII1();
/* 181 */                   olI1IiII1.I00000oIO = str;
/* 183 */                   olI1IiII1.I00000oOI = fIntBitsToFloat;
/* 185 */                   olI1IiII1.I0000Il00O = iI000OOo1O2;
/* 187 */                   VarHandle.storeStoreFence();
/* 190 */                   arrayList.add(olI1IiII1);
                        } else {
/* 196 */                   ii11iIi.I000O01llI0(i2);
                        }
                    }
/* 207 */           HashMap map = new HashMap(arrayList.size() * 2);
/* 214 */           float[] fArr = new float[arrayList.size()];
/* 218 */           int[] iArr = new int[Barcode.FORMAT_QR_CODE];
/* 222 */           for (int i7 = 0; i7 < 256; i7++) {
/* 224 */               iArr[i7] = -1;
                    }
/* 229 */           Iterator it = arrayList.iterator();
/* 233 */           int i8 = 0;
/* 234 */           int i9 = 0;
/* 240 */           while (it.hasNext()) {
/* 242 */               int i10 = i9 + 1;
/* 250 */               OlI1IiII1 olI1IiII12 = (OlI1IiII1) it.next();
/* 252 */               float f = olI1IiII12.I00000oOI;
/* 254 */               String str3 = olI1IiII12.I00000oIO;
/* 256 */               fArr[i9] = f;
/* 258 */               int i11 = olI1IiII12.I0000Il00O;
/* 260 */               if (i11 != 2) {
/* 262 */                   if (i11 != 6) {
/* 268 */                       if (str3.length() > 0) {
/* 274 */                           map.put(str3, Integer.valueOf(i9));
                                }
/* 277 */                       c = 256;
                            } else {
/* 319 */                       int iIntValue = (str3.length() == 6 && OlOolloIIOl0.I000l1(str3, "<0x", false) && OlOolloIIOl0.I000II(str3, ">", false) && (numI000lI = OlOolloIIOl0.I000lI(16, str3.substring(3, 5))) != null) ? numI000lI.intValue() : -1;
/* 323 */                       c = 256;
/* 325 */                       if (iIntValue >= 0 && iIntValue < 256) {
/* 329 */                           iArr[iIntValue] = i9;
                                }
                            }
/* 332 */                   i9 = i10;
                        } else {
/* 335 */                   i8 = i9;
/* 336 */                   i9 = i10;
                        }
                    }
/* 340 */           arrayList.size();
/* 345 */           o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(6);
/* 348 */           o00io0iiooo0.I00iiO = map;
/* 350 */           o00io0iiooo0.I00iio = fArr;
/* 352 */           o00io0iiooo0.I00ilI0I1 = iArr;
/* 354 */           o00io0iiooo0.I00iiI = i8;
/* 356 */           VarHandle.storeStoreFence();
/* 966 */           return o00io0iiooo0;
                }
            }

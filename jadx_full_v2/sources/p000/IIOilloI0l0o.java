            package p000;

            import android.os.Parcel;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class IIOilloI0l0o implements OOooilOIIl0I {
                public final int I00iOIl;
                public String I00iiI;
                public String[] I00iiO;

                public IIOilloI0l0o(int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 1:
                            break;
                        default:
/* 10 */                    this.I00iiO = null;
                            break;
                    }
                }

                public static IIOOoi1IlOi I0000Il00O(IIOO0O0OliO iIOO0O0OliO) throws IOException, NumberFormatException {
                    int iI0001Ioi1lo;
                    Double dValueOf;
/* 3 */             IIOOoi1IlOi iIOOoi1IlOi = new IIOOoi1IlOi();
/* 11 */            iIOOoi1IlOi.I00000oIO = new ArrayList();
/* 14 */            iIOOoi1IlOi.I00000oOI = null;
                    while (true) {
/* 16 */                iI0001Ioi1lo = iIOO0O0OliO.I0001Ioi1lo();
/* 20 */                if (iI0001Ioi1lo >= 0 && iI0001Ioi1lo <= 21) {
/* 53 */                    iIOOoi1IlOi.I00000oOI = (IIOOlioOo0i) IIOOlioOo0i.I0000Il00O.get(iI0001Ioi1lo == 12 ? new IIOOlii0l1(iI0001Ioi1lo, iIOO0O0OliO.I0001Ioi1lo()) : new IIOOlii0l1(iI0001Ioi1lo));
/* 55 */                    return iIOOoi1IlOi;
                        }
/* 58 */                if (iI0001Ioi1lo == 28 || iI0001Ioi1lo == 29) {
/* 267 */                   iIOOoi1IlOi.I00000oIO.add(I0001Ioi1lo(iIOO0O0OliO, iI0001Ioi1lo));
                        } else if (iI0001Ioi1lo == 30) {
/* 70 */                    ArrayList arrayList = iIOOoi1IlOi.I00000oIO;
/* 74 */                    StringBuilder sb = new StringBuilder();
/* 78 */                    boolean z = false;
/* 79 */                    boolean z2 = false;
/* 80 */                    boolean z3 = false;
/* 81 */                    while (!z) {
/* 83 */                        int iI0001Ioi1lo2 = iIOO0O0OliO.I0001Ioi1lo();
/* 91 */                        int[] iArr = {iI0001Ioi1lo2 / 16, iI0001Ioi1lo2 % 16};
/* 97 */                        for (int i = 0; i < 2; i++) {
/* 99 */                            int i2 = iArr[i];
                                    switch (i2) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
/* 185 */                                   sb.append(i2);
/* 188 */                                   z2 = false;
                                        case 10:
/* 181 */                                   sb.append(".");
                                        case 11:
/* 153 */                                   if (z3) {
/* 169 */                                       Log.w("PdfBox-Android", "duplicate 'E' ignored after " + ((Object) sb));
                                            } else {
/* 175 */                                       sb.append("E");
/* 150 */                                       z2 = true;
/* 151 */                                       z3 = true;
                                            }
                                        case 12:
/* 125 */                                   if (z3) {
/* 141 */                                       Log.w("PdfBox-Android", "duplicate 'E-' ignored after " + ((Object) sb));
                                            } else {
/* 147 */                                       sb.append("E-");
/* 150 */                                       z2 = true;
/* 151 */                                       z3 = true;
                                            }
                                        case 13:
                                        case 14:
/* 121 */                                   sb.append("-");
                                        case 15:
/* 117 */                                   z = true;
                                        default:
/* 113 */                                   I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "illegal nibble "));
/* 13 */                                    return null;
                                    }
                                }
                            }
/* 192 */                   if (z2) {
/* 196 */                       sb.append(OIllioIilO.I01OO1I);
                            }
/* 203 */                   if (sb.length() == 0) {
/* 207 */                       dValueOf = Double.valueOf(0.0d);
                            } else {
                                try {
/* 216 */                           dValueOf = Double.valueOf(sb.toString());
                                } catch (NumberFormatException e) {
/* 231 */                           throw new IOException(e);
                                }
                            }
/* 220 */                   arrayList.add(dValueOf);
                        } else if (iI0001Ioi1lo >= 32 && iI0001Ioi1lo <= 254) {
/* 246 */                   iIOOoi1IlOi.I00000oIO.add(I0001Ioi1lo(iIOO0O0OliO, iI0001Ioi1lo));
                        }
                    }
/* 257 */           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0001Ioi1lo, "invalid DICT data b0 byte: "));
/* 13 */            return null;
                }

                public static byte[][] I0000O(IIOO0O0OliO iIOO0O0OliO) throws IOException {
/* 1 */             int[] iArrI0000oI00 = I0000oI00(iIOO0O0OliO);
/* 5 */             if (iArrI0000oI00 == null) {
/* 7 */                 return null;
                    }
                    int length = iArrI0000oI00.length - 1;
/* 12 */            byte[][] bArr = new byte[length][];
/* 14 */            int i = 0;
/* 15 */            while (i < length) {
/* 17 */                int i2 = i + 1;
/* 28 */                bArr[i] = iIOO0O0OliO.I0000O(iArrI0000oI00[i2] - iArrI0000oI00[i]);
/* 30 */                i = i2;
                    }
/* 49 */            return bArr;
                }

                public static int[] I0000oI00(IIOO0O0OliO iIOO0O0OliO) throws IOException {
/* 1 */             int iI000II = iIOO0O0OliO.I000II();
/* 6 */             if (iI000II == 0) {
/* 5 */                 return null;
                    }
/* 9 */             int iI000OiO = iIOO0O0OliO.I000OiO();
/* 15 */            int[] iArr = new int[iI000II + 1];
/* 19 */            for (int i = 0; i <= iI000II; i++) {
/* 22 */                int iI0001Ioi1lo = 0;
/* 23 */                for (int i2 = 0; i2 < iI000OiO; i2++) {
/* 31 */                    iI0001Ioi1lo = (iI0001Ioi1lo << 8) | iIOO0O0OliO.I0001Ioi1lo();
                        }
/* 38 */                if (iI0001Ioi1lo > iIOO0O0OliO.I00000oOI.length) {
/* 53 */                    IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("illegal offset value ", iI0001Ioi1lo, " in CFF font"));
/* 5 */                     return null;
                        }
/* 40 */                iArr[i] = iI0001Ioi1lo;
                    }
/* 186 */           return iArr;
                }

                public static Integer I0001Ioi1lo(IIOO0O0OliO iIOO0O0OliO, int i) throws EOFException {
/* 3 */             if (i == 28) {
/* 10 */                return Integer.valueOf((short) iIOO0O0OliO.I000II());
                    }
/* 17 */            if (i == 29) {
/* 23 */                return Integer.valueOf(iIOO0O0OliO.I0000oI00());
                    }
/* 30 */            if (i >= 32 && i <= 246) {
/* 38 */                return Integer.valueOf(i - 139);
                    }
/* 45 */            if (i >= 247 && i <= 250) {
/* 61 */                return Integer.valueOf(((i - 247) * Barcode.FORMAT_QR_CODE) + iIOO0O0OliO.I0001Ioi1lo() + 108);
                    }
/* 68 */            if (i < 251 || i > 254) {
/* 90 */                OIiilo1Ool0o.I00100o1O0lo();
/* 93 */                return null;
                    }
/* 85 */            return Integer.valueOf((((-(i - 251)) * Barcode.FORMAT_QR_CODE) - iIOO0O0OliO.I0001Ioi1lo()) - 108);
                }

                public static LinkedHashMap I000II(IIOOoll iIOOoll) {
/* 5 */             LinkedHashMap linkedHashMap = new LinkedHashMap(17);
/* 14 */            linkedHashMap.put("BlueValues", iIOOoll.I00IoiI("BlueValues"));
/* 23 */            linkedHashMap.put("OtherBlues", iIOOoll.I00IoiI("OtherBlues"));
/* 32 */            linkedHashMap.put("FamilyBlues", iIOOoll.I00IoiI("FamilyBlues"));
/* 41 */            linkedHashMap.put("FamilyOtherBlues", iIOOoll.I00IoiI("FamilyOtherBlues"));
/* 59 */            linkedHashMap.put("BlueScale", iIOOoll.I00O0i0ii(Double.valueOf(0.039625d), "BlueScale"));
/* 73 */            linkedHashMap.put("BlueShift", iIOOoll.I00O0i0ii(7, "BlueShift"));
/* 87 */            linkedHashMap.put("BlueFuzz", iIOOoll.I00O0i0ii(1, "BlueFuzz"));
/* 97 */            linkedHashMap.put("StdHW", iIOOoll.I00O0i0ii(null, "StdHW"));
/* 106 */           linkedHashMap.put("StdVW", iIOOoll.I00O0i0ii(null, "StdVW"));
/* 115 */           linkedHashMap.put("StemSnapH", iIOOoll.I00IoiI("StemSnapH"));
/* 124 */           linkedHashMap.put("StemSnapV", iIOOoll.I00IoiI("StemSnapV"));
/* 138 */           linkedHashMap.put("ForceBold", iIOOoll.I00IoO0("ForceBold"));
/* 147 */           linkedHashMap.put("LanguageGroup", iIOOoll.I00O0i0ii(0, "LanguageGroup"));
/* 165 */           linkedHashMap.put("ExpansionFactor", iIOOoll.I00O0i0ii(Double.valueOf(0.06d), "ExpansionFactor"));
/* 174 */           linkedHashMap.put("initialRandomSeed", iIOOoll.I00O0i0ii(0, "initialRandomSeed"));
/* 183 */           linkedHashMap.put("defaultWidthX", iIOOoll.I00O0i0ii(0, "defaultWidthX"));
/* 192 */           linkedHashMap.put("nominalWidthX", iIOOoll.I00O0i0ii(0, "nominalWidthX"));
/* 966 */           return linkedHashMap;
                }

                public static String[] I000OOo1O(IIOO0O0OliO iIOO0O0OliO) throws IOException {
/* 1 */             int[] iArrI0000oI00 = I0000oI00(iIOO0O0OliO);
/* 5 */             if (iArrI0000oI00 == null) {
/* 7 */                 return null;
                    }
                    int length = iArrI0000oI00.length - 1;
/* 12 */            String[] strArr = new String[length];
/* 14 */            int i = 0;
/* 15 */            while (i < length) {
/* 17 */                int i2 = i + 1;
/* 23 */                int i3 = iArrI0000oI00[i2] - iArrI0000oI00[i];
/* 24 */                if (i3 < 0) {
/* 49 */                    StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Negative index data length + ", i3, " at ", i, ": offsets[");
/* 53 */                    sbI0010I0i.append(i2);
/* 58 */                    sbI0010I0i.append("]=");
/* 63 */                    sbI0010I0i.append(iArrI0000oI00[i2]);
/* 68 */                    sbI0010I0i.append(", offsets[");
/* 71 */                    sbI0010I0i.append(i);
/* 74 */                    sbI0010I0i.append("]=");
/* 79 */                    sbI0010I0i.append(iArrI0000oI00[i]);
/* 89 */                    throw new IOException(sbI0010I0i.toString());
                        }
/* 37 */                strArr[i] = new String(iIOO0O0OliO.I0000O(i3), IO1IOO01oiO.I00000oIO);
/* 39 */                i = i2;
                    }
/* 186 */           return strArr;
                }

                public String I00000oIO(IIOOoll iIOOoll, String str) {
/* 1 */             IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi = iIOOoll.I00Iooi00oi(str);
/* 5 */             if (iIOOoi1IlOiI00Iooi00oi == null || !iIOOoi1IlOiI00Iooi00oi.I00000oOI()) {
/* 27 */                return null;
                    }
/* 22 */            return I000O01llI0(iIOOoi1IlOiI00Iooi00oi.I00000oIO(0).intValue());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v1, types: [IIOOoll] */
                /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Number, java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r1v75, types: [IIOiOoliI, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v83, types: [IIOO0I, IIOi100oO] */
                /* JADX WARN: Type inference failed for: r3v84 */
                /* JADX WARN: Type inference failed for: r3v85, types: [IIOO0I, IIOi1ll] */
                /* JADX WARN: Type inference failed for: r45v0, types: [IIOilloI0l0o] */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v3, types: [IIOOOIl1oI, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v9 */
                public ArrayList I00000oOI(byte[] bArr, IIOOlli1 iIOOlli1) throws IOException, NumberFormatException {
                    ?? r16;
                    String[] strArr;
                    IIOO01IIlii iIOO01IIlii;
                    String str;
                    byte[][] bArr2;
                    ArrayList arrayList;
                    int i;
                    Double d;
                    Double d2;
                    String str2;
                    IIOO0I iIOi0o1oII1o;
                    IIOO0l iIOO0l;
                    int i2;
                    byte[][] bArr3;
                    IIOi1liiolI0 iIOi1liiolI0;
                    int i3;
                    int i4;
                    int i5;
                    ?? iIOi100oO;
                    String str3;
                    byte[][] bArr4;
                    String str4;
/* 7 */             IIOO0O0OliO iIOO0O0OliO = new IIOO0O0OliO(bArr);
/* 10 */            int i6 = 4;
/* 19 */            String str5 = new String(iIOO0O0OliO.I0000O(4), IO1IOO01oiO.I00000oIO);
/* 28 */            Object obj = null;
/* 29 */            int i7 = 0;
/* 30 */            if ("OTTO".equals(str5)) {
/* 36 */                short sI000II = (short) iIOO0O0OliO.I000II();
/* 37 */                iIOO0O0OliO.I000II();
/* 40 */                iIOO0O0OliO.I000II();
/* 43 */                iIOO0O0OliO.I000II();
/* 47 */                for (int i8 = 0; i8 < sI000II; i8++) {
/* 57 */                    String str6 = new String(iIOO0O0OliO.I0000O(4), IO1IOO01oiO.I00000oIO);
/* 60 */                    iIOO0O0OliO.I000II();
/* 63 */                    iIOO0O0OliO.I000II();
/* 76 */                    long jI000II = (iIOO0O0OliO.I000II() << 16) | iIOO0O0OliO.I000II();
/* 88 */                    long jI000II2 = (iIOO0O0OliO.I000II() << 16) | iIOO0O0OliO.I000II();
/* 96 */                    if ("CFF ".equals(str6)) {
/* 107 */                       iIOO0O0OliO = new IIOO0O0OliO(Arrays.copyOfRange(bArr, (int) jI000II, (int) (jI000II + jI000II2)));
                            }
                        }
/* 116 */               IioIoO10iOiI.I000OOo1O("CFF tag not found in this OpenType font.");
/* 28 */                return null;
                    }
/* 126 */           if ("ttcf".equals(str5)) {
/* 2218 */              IioIoO10iOiI.I000OOo1O("True Type Collection fonts are not supported.");
/* 28 */                return null;
                    }
/* 134 */           if ("\u0000\u0001\u0000\u0000".equals(str5)) {
/* 2210 */              IioIoO10iOiI.I000OOo1O("OpenType fonts containing a true type font are not supported.");
/* 28 */                return null;
                    }
/* 136 */           iIOO0O0OliO.I0000Il00O = 0;
/* 138 */           iIOO0O0OliO.I0001Ioi1lo();
/* 141 */           iIOO0O0OliO.I0001Ioi1lo();
/* 144 */           iIOO0O0OliO.I0001Ioi1lo();
/* 147 */           iIOO0O0OliO.I000OiO();
/* 150 */           String[] strArrI000OOo1O = I000OOo1O(iIOO0O0OliO);
/* 154 */           if (strArrI000OOo1O == null) {
/* 2202 */              IioIoO10iOiI.I000OOo1O("Name index missing in CFF font");
/* 28 */                return null;
                    }
/* 156 */           byte[][] bArrI0000O = I0000O(iIOO0O0OliO);
/* 164 */           this.I00iiO = I000OOo1O(iIOO0O0OliO);
/* 166 */           byte[][] bArrI0000O2 = I0000O(iIOO0O0OliO);
/* 173 */           ArrayList arrayList2 = new ArrayList(strArrI000OOo1O.length);
/* 176 */           int i9 = 0;
/* 178 */           while (i9 < strArrI000OOo1O.length) {
/* 180 */               String str7 = strArrI000OOo1O[i9];
/* 182 */               byte[] bArr5 = bArrI0000O[i9];
/* 189 */               Double dValueOf = Double.valueOf(0.001d);
/* 195 */               Double dValueOf2 = Double.valueOf(0.0d);
/* 199 */               Integer numValueOf = Integer.valueOf(i7);
/* 205 */               IIOO0O0OliO iIOO0O0OliO2 = new IIOO0O0OliO(bArr5);
/* 210 */               ?? iIOOoll = new IIOOoll();
/* 213 */               int i10 = i6;
                        while (true) {
/* 217 */                   r16 = obj;
/* 222 */                   if (iIOO0O0OliO2.I0000Il00O >= iIOO0O0OliO2.I00000oOI.length) {
                                break;
                            }
/* 224 */                   IIOOoi1IlOi iIOOoi1IlOiI0000Il00O = I0000Il00O(iIOO0O0OliO2);
/* 228 */                   IIOOlioOo0i iIOOlioOo0i = iIOOoi1IlOiI0000Il00O.I00000oOI;
/* 230 */                   if (iIOOlioOo0i != null) {
/* 238 */                       ((HashMap) iIOOoll.I00iiI).put(iIOOlioOo0i.I00000oOI, iIOOoi1IlOiI0000Il00O);
                            }
/* 241 */                   obj = r16;
                        }
/* 251 */               if (iIOOoll.I00Iooi00oi("SyntheticBase") != null) {
/* 2192 */                  IioIoO10iOiI.I000OOo1O("Synthetic Fonts are not supported");
/* 2195 */                  return r16;
                        }
/* 263 */               boolean z = iIOOoll.I00Iooi00oi("ROS") != null;
/* 264 */               if (z) {
/* 268 */                   IIOO01IIlii iIOO01IIlii2 = new IIOO01IIlii();
/* 273 */                   new LinkedList();
/* 281 */                   iIOO01IIlii2.I00l0I0l0lO1 = new LinkedList();
/* 288 */                   iIOO01IIlii2.I00li1OI = new ConcurrentHashMap();
/* 292 */                   iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 295 */                   iiolilo0iiil.I00iOIl = iIOO01IIlii2;
/* 297 */                   VarHandle.storeStoreFence();
/* 300 */                   iIOO01IIlii2.I00ll1 = iiolilo0iiil;
/* 302 */                   VarHandle.storeStoreFence();
/* 305 */                   IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi = iIOOoll.I00Iooi00oi("ROS");
/* 309 */                   if (iIOOoi1IlOiI00Iooi00oi != null) {
/* 317 */                       strArr = strArrI000OOo1O;
/* 320 */                       if (iIOOoi1IlOiI00Iooi00oi.I00000oIO.size() >= 3) {
/* 335 */                           iIOO01IIlii2.I00ilO0 = I000O01llI0(iIOOoi1IlOiI00Iooi00oi.I00000oIO(0).intValue());
/* 350 */                           iIOO01IIlii2.I00io1l = I000O01llI0(iIOOoi1IlOiI00Iooi00oi.I00000oIO(1).intValue());
/* 361 */                           iIOO01IIlii2.I00ioIO = iIOOoi1IlOiI00Iooi00oi.I00000oIO(2).intValue();
                                    iIOO01IIlii = iIOO01IIlii2;
                                }
                            }
/* 366 */                   IioIoO10iOiI.I000OOo1O("ROS entry must have 3 elements");
/* 369 */                   return r16;
                        }
/* 370 */               strArr = strArrI000OOo1O;
/* 374 */               IIOiool0I iIOiool0I = new IIOiool0I();
/* 382 */               iIOiool0I.I00ilO0 = new LinkedHashMap();
/* 389 */               iIOiool0I.I00ioIO = new ConcurrentHashMap();
/* 394 */               IIOOoll iIOOoll2 = new IIOOoll(7);
/* 397 */               iIOOoll2.I00iiI = iIOiool0I;
/* 399 */               VarHandle.storeStoreFence();
/* 402 */               iIOiool0I.I00l0I0l0lO1 = iIOOoll2;
/* 404 */               VarHandle.storeStoreFence();
                        iIOO01IIlii = iIOiool0I;
/* 407 */               this.I00iiI = str7;
/* 409 */               iIOO01IIlii.I00iOIl = str7;
/* 417 */               iIOO01IIlii.I0000O("version", I00000oIO(iIOOoll, "version"));
/* 426 */               iIOO01IIlii.I0000O("Notice", I00000oIO(iIOOoll, "Notice"));
/* 435 */               iIOO01IIlii.I0000O("Copyright", I00000oIO(iIOOoll, "Copyright"));
/* 444 */               iIOO01IIlii.I0000O("FullName", I00000oIO(iIOOoll, "FullName"));
/* 453 */               iIOO01IIlii.I0000O("FamilyName", I00000oIO(iIOOoll, "FamilyName"));
/* 462 */               iIOO01IIlii.I0000O("Weight", I00000oIO(iIOOoll, "Weight"));
/* 471 */               iIOO01IIlii.I0000O("isFixedPitch", iIOOoll.I00IoO0("isFixedPitch"));
/* 480 */               iIOO01IIlii.I0000O("ItalicAngle", iIOOoll.I00O0i0ii(numValueOf, "ItalicAngle"));
/* 495 */               iIOO01IIlii.I0000O("UnderlinePosition", iIOOoll.I00O0i0ii(-100, "UnderlinePosition"));
/* 510 */               iIOO01IIlii.I0000O("UnderlineThickness", iIOOoll.I00O0i0ii(50, "UnderlineThickness"));
/* 519 */               iIOO01IIlii.I0000O("PaintType", iIOOoll.I00O0i0ii(numValueOf, "PaintType"));
/* 533 */               iIOO01IIlii.I0000O("CharstringType", iIOOoll.I00O0i0ii(2, "CharstringType"));
/* 537 */               Number[] numberArr = new Number[6];
/* 541 */               numberArr[0] = dValueOf;
/* 545 */               numberArr[1] = dValueOf2;
/* 547 */               numberArr[2] = dValueOf2;
/* 551 */               numberArr[3] = dValueOf;
/* 553 */               numberArr[i10] = dValueOf2;
/* 556 */               numberArr[5] = dValueOf2;
/* 562 */               String str8 = "FontMatrix";
/* 568 */               iIOO01IIlii.I0000O("FontMatrix", iIOOoll.I00Io1o110i("FontMatrix", Arrays.asList(numberArr)));
/* 581 */               iIOO01IIlii.I0000O("UniqueID", iIOOoll.I00O0i0ii(r16, "UniqueID"));
/* 586 */               Number[] numberArr2 = new Number[i10];
/* 590 */               numberArr2[0] = numValueOf;
/* 594 */               numberArr2[1] = numValueOf;
/* 597 */               numberArr2[2] = numValueOf;
/* 601 */               numberArr2[3] = numValueOf;
/* 603 */               List listAsList = Arrays.asList(numberArr2);
/* 607 */               String str9 = "FontBBox";
/* 613 */               iIOO01IIlii.I0000O("FontBBox", iIOOoll.I00Io1o110i("FontBBox", listAsList));
/* 622 */               iIOO01IIlii.I0000O("StrokeWidth", iIOOoll.I00O0i0ii(numValueOf, "StrokeWidth"));
/* 627 */               byte[][] bArr6 = bArrI0000O;
/* 634 */               iIOO01IIlii.I0000O("XUID", iIOOoll.I00Io1o110i("XUID", null));
/* 639 */               IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi2 = iIOOoll.I00Iooi00oi("CharStrings");
/* 643 */               if (iIOOoi1IlOiI00Iooi00oi2 == null || !iIOOoi1IlOiI00Iooi00oi2.I00000oOI()) {
/* 2186 */                  IioIoO10iOiI.I000OOo1O("CharStrings is missing or empty");
/* 2182 */                  return null;
                        }
/* 660 */               iIOO0O0OliO.I0000Il00O = iIOOoi1IlOiI00Iooi00oi2.I00000oIO(0).intValue();
/* 662 */               byte[][] bArrI0000O3 = I0000O(iIOO0O0OliO);
/* 666 */               if (bArrI0000O3 == null) {
/* 2178 */                  IioIoO10iOiI.I000OOo1O("CharStringsIndex is missing");
/* 2174 */                  return null;
                        }
/* 670 */               IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi3 = iIOOoll.I00Iooi00oi("charset");
/* 676 */               if (iIOOoi1IlOiI00Iooi00oi3 == null || !iIOOoi1IlOiI00Iooi00oi3.I00000oOI()) {
/* 607 */                   str = "FontBBox";
/* 1023 */                  bArr2 = bArrI0000O2;
/* 1025 */                  arrayList = arrayList2;
/* 1027 */                  i = i9;
/* 1029 */                  d = dValueOf;
/* 1031 */                  d2 = dValueOf2;
/* 562 */                   str2 = "FontMatrix";
/* 1035 */                  if (z) {
/* 1039 */                      int length = bArrI0000O3.length;
/* 1041 */                      iIOi0o1oII1o = new IIOi0o1oII1o(true);
/* 1045 */                      iIOi0o1oII1o.I00000oIO(0, 0);
/* 1049 */                      for (int i11 = 1; i11 <= length; i11++) {
/* 1051 */                          iIOi0o1oII1o.I00000oIO(i11, i11);
                                }
                            } else {
/* 1057 */                      iIOi0o1oII1o = IIOOOliI.I000O01llI0;
                            }
                        } else {
/* 684 */                   i = i9;
/* 691 */                   int iIntValue = iIOOoi1IlOiI00Iooi00oi3.I00000oIO(0).intValue();
/* 695 */                   if (!z && iIntValue == 0) {
/* 699 */                       iIOi0o1oII1o = IIOOOliI.I000O01llI0;
                            } else if (!z && iIntValue == 1) {
/* 720 */                       iIOi0o1oII1o = IIOO1Io11.I000O01llI0;
                            } else if (z || iIntValue != 2) {
/* 731 */                       iIOO0O0OliO.I0000Il00O = iIntValue;
/* 733 */                       int length2 = bArrI0000O3.length;
/* 734 */                       int iI0001Ioi1lo = iIOO0O0OliO.I0001Ioi1lo();
/* 738 */                       if (iI0001Ioi1lo != 0) {
/* 740 */                           d = dValueOf;
/* 743 */                           if (iI0001Ioi1lo == 1) {
/* 607 */                               str = "FontBBox";
/* 883 */                               bArr2 = bArrI0000O2;
/* 885 */                               arrayList = arrayList2;
/* 887 */                               d2 = dValueOf2;
/* 562 */                               str2 = "FontMatrix";
/* 893 */                               iIOi100oO = new IIOi1ll(z);
/* 896 */                               iIOi100oO.I000II = iI0001Ioi1lo;
/* 898 */                               if (z) {
/* 901 */                                   iIOi100oO.I00000oIO(0, 0);
/* 909 */                                   iIOi100oO.I000O01llI0 = new ArrayList();
                                        } else {
/* 913 */                                   iIOi100oO.I00000oOI(0, 0, ".notdef");
                                        }
/* 916 */                               int i12 = 1;
/* 917 */                               while (i12 < length2) {
/* 919 */                                   int iI000II = iIOO0O0OliO.I000II();
/* 923 */                                   int iI0001Ioi1lo2 = iIOO0O0OliO.I0001Ioi1lo();
/* 927 */                                   if (z) {
/* 957 */                                       iIOi100oO.I000O01llI0.add(new IIOiiiOi0l(i12, iI000II, iI0001Ioi1lo2));
                                            } else {
/* 932 */                                       for (int i13 = 0; i13 < iI0001Ioi1lo2 + 1; i13++) {
/* 934 */                                           int i14 = iI000II + i13;
/* 944 */                                           iIOi100oO.I00000oOI(i12 + i13, i14, I000O01llI0(i14));
                                                }
                                            }
/* 963 */                                   i12 = i12 + iI0001Ioi1lo2 + 1;
                                        }
                                    } else {
/* 746 */                               if (iI0001Ioi1lo != 2) {
/* 875 */                                   IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0001Ioi1lo, "Incorrect charset format "));
/* 878 */                                   return null;
                                        }
/* 750 */                               IIOiOIoiOo iIOiOIoiOo = new IIOiOIoiOo(z);
/* 753 */                               iIOiOIoiOo.I000II = iI0001Ioi1lo;
/* 755 */                               if (z) {
/* 758 */                                   iIOiOIoiOo.I00000oIO(0, 0);
/* 766 */                                   iIOiOIoiOo.I000O01llI0 = new ArrayList();
                                        } else {
/* 770 */                                   iIOiOIoiOo.I00000oOI(0, 0, ".notdef");
                                        }
/* 773 */                               int i15 = 1;
/* 774 */                               while (i15 < length2) {
/* 776 */                                   Double d3 = dValueOf2;
/* 778 */                                   int iI000II2 = iIOO0O0OliO.I000II();
/* 782 */                                   ArrayList arrayList3 = arrayList2;
/* 784 */                                   int iI000II3 = iIOO0O0OliO.I000II();
/* 788 */                                   if (z) {
/* 824 */                                       str3 = str9;
/* 826 */                                       bArr4 = bArrI0000O2;
/* 828 */                                       str4 = str8;
/* 837 */                                       iIOiOIoiOo.I000O01llI0.add(new IIOiiiOi0l(i15, iI000II2, iI000II3));
                                            } else {
/* 790 */                                       bArr4 = bArrI0000O2;
/* 792 */                                       int i16 = 0;
                                                while (true) {
/* 793 */                                           str4 = str8;
/* 797 */                                           if (i16 >= iI000II3 + 1) {
                                                        break;
                                                    }
/* 799 */                                           int i17 = iI000II2 + i16;
/* 801 */                                           int i18 = i16;
/* 811 */                                           iIOiOIoiOo.I00000oOI(i15 + i18, i17, I000O01llI0(i17));
/* 814 */                                           i16 = i18 + 1;
/* 816 */                                           str8 = str4;
/* 818 */                                           str9 = str9;
                                                }
/* 821 */                                       str3 = str9;
                                            }
/* 843 */                                   i15 = i15 + iI000II3 + 1;
/* 845 */                                   dValueOf2 = d3;
/* 847 */                                   arrayList2 = arrayList3;
/* 849 */                                   bArrI0000O2 = bArr4;
/* 851 */                                   str8 = str4;
/* 853 */                                   str9 = str3;
                                        }
/* 856 */                               str = str9;
/* 858 */                               bArr2 = bArrI0000O2;
/* 860 */                               arrayList = arrayList2;
/* 862 */                               d2 = dValueOf2;
/* 864 */                               str2 = str8;
/* 866 */                               iIOi0o1oII1o = iIOiOIoiOo;
                                    }
                                } else {
/* 607 */                           str = "FontBBox";
/* 970 */                           bArr2 = bArrI0000O2;
/* 972 */                           arrayList = arrayList2;
/* 974 */                           d = dValueOf;
/* 976 */                           d2 = dValueOf2;
/* 562 */                           str2 = "FontMatrix";
/* 982 */                           iIOi100oO = new IIOi100oO(z);
/* 985 */                           iIOi100oO.I000II = iI0001Ioi1lo;
/* 987 */                           if (z) {
/* 990 */                               iIOi100oO.I00000oIO(0, 0);
                                    } else {
/* 995 */                               iIOi100oO.I00000oOI(0, 0, ".notdef");
                                    }
/* 999 */                           for (int i19 = 1; i19 < length2; i19++) {
/* 1001 */                              int iI000II4 = iIOO0O0OliO.I000II();
/* 1005 */                              if (z) {
/* 1007 */                                  iIOi100oO.I00000oIO(i19, iI000II4);
                                        } else {
/* 1015 */                                  iIOi100oO.I00000oOI(i19, iI000II4, I000O01llI0(iI000II4));
                                        }
                                    }
                                }
/* 966 */                       iIOi0o1oII1o = iIOi100oO;
                            } else {
/* 728 */                       iIOi0o1oII1o = IIOOO01.I000O01llI0;
                            }
/* 607 */                   str = "FontBBox";
/* 703 */                   bArr2 = bArrI0000O2;
/* 705 */                   arrayList = arrayList2;
/* 707 */                   d = dValueOf;
/* 709 */                   d2 = dValueOf2;
/* 562 */                   str2 = "FontMatrix";
                        }
/* 1059 */              iIOO01IIlii.I00iiO = iIOi0o1oII1o;
/* 1061 */              iIOO01IIlii.I00iio = bArrI0000O3;
/* 1063 */              String str10 = OlIo0Ooi1loI.I000l1;
/* 1067 */              if (z) {
/* 1070 */                  IIOO01IIlii iIOO01IIlii3 = iIOO01IIlii;
/* 1072 */                  int length3 = bArrI0000O3.length;
/* 1075 */                  IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi4 = iIOOoll.I00Iooi00oi("FDArray");
/* 1079 */                  if (iIOOoi1IlOiI00Iooi00oi4 == null || !iIOOoi1IlOiI00Iooi00oi4.I00000oOI()) {
/* 1810 */                      IioIoO10iOiI.I000OOo1O("FDArray is missing for a CIDKeyed Font.");
/* 1806 */                      return null;
                            }
/* 1096 */                  iIOO0O0OliO.I0000Il00O = iIOOoi1IlOiI00Iooi00oi4.I00000oIO(0).intValue();
/* 1098 */                  byte[][] bArrI0000O4 = I0000O(iIOO0O0OliO);
/* 1102 */                  if (bArrI0000O4 == null) {
/* 1802 */                      IioIoO10iOiI.I000OOo1O("Font dict index is missing for a CIDKeyed Font");
/* 1798 */                      return null;
                            }
/* 1106 */                  LinkedList linkedList = new LinkedList();
/* 1111 */                  LinkedList linkedList2 = new LinkedList();
/* 1114 */                  int length4 = bArrI0000O4.length;
/* 1115 */                  int i20 = 0;
/* 1116 */                  while (i20 < length4) {
/* 1122 */                      IIOO0O0OliO iIOO0O0OliO3 = new IIOO0O0OliO(bArrI0000O4[i20]);
/* 1127 */                      IIOOoll iIOOoll3 = new IIOOoll();
/* 1130 */                      byte[][] bArr7 = bArrI0000O4;
                                while (true) {
/* 1134 */                          i3 = length4;
/* 1139 */                          if (iIOO0O0OliO3.I0000Il00O >= iIOO0O0OliO3.I00000oOI.length) {
                                        break;
                                    }
/* 1141 */                          IIOOoi1IlOi iIOOoi1IlOiI0000Il00O2 = I0000Il00O(iIOO0O0OliO3);
/* 1145 */                          IIOOlioOo0i iIOOlioOo0i2 = iIOOoi1IlOiI0000Il00O2.I00000oOI;
/* 1147 */                          if (iIOOlioOo0i2 != null) {
/* 1149 */                              i5 = i20;
/* 1157 */                              ((HashMap) iIOOoll3.I00iiI).put(iIOOlioOo0i2.I00000oOI, iIOOoi1IlOiI0000Il00O2);
                                    } else {
/* 1161 */                              i5 = i20;
                                    }
/* 1163 */                          length4 = i3;
/* 1165 */                          i20 = i5;
                                }
/* 1168 */                      int i21 = i20;
/* 1170 */                      IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi5 = iIOOoll3.I00Iooi00oi(str10);
/* 1174 */                      if (iIOOoi1IlOiI00Iooi00oi5 == null || iIOOoi1IlOiI00Iooi00oi5.I00000oIO.size() < 2) {
/* 1350 */                          IioIoO10iOiI.I000OOo1O("Font DICT invalid without \"Private\" entry");
/* 1353 */                          return null;
                                }
/* 1188 */                      LinkedHashMap linkedHashMap = new LinkedHashMap(4);
/* 1197 */                      linkedHashMap.put("FontName", I00000oIO(iIOOoll3, "FontName"));
/* 1206 */                      linkedHashMap.put("FontType", iIOOoll3.I00O0i0ii(numValueOf, "FontType"));
/* 1209 */                      String str11 = str;
/* 1212 */                      String str12 = str10;
/* 1218 */                      linkedHashMap.put(str11, iIOOoll3.I00Io1o110i(str11, null));
/* 1221 */                      String str13 = str2;
/* 1227 */                      linkedHashMap.put(str13, iIOOoll3.I00Io1o110i(str13, null));
/* 1230 */                      linkedList2.add(linkedHashMap);
/* 1238 */                      int iIntValue2 = iIOOoi1IlOiI00Iooi00oi5.I00000oIO(1).intValue();
/* 1242 */                      iIOO0O0OliO.I0000Il00O = iIntValue2;
/* 1249 */                      int iIntValue3 = iIOOoi1IlOiI00Iooi00oi5.I00000oIO(0).intValue();
/* 1255 */                      IIOOoll iIOOoll4 = new IIOOoll();
/* 1260 */                      int i22 = iIOO0O0OliO.I0000Il00O + iIntValue3;
/* 1263 */                      while (iIOO0O0OliO.I0000Il00O < i22) {
/* 1265 */                          IIOOoi1IlOi iIOOoi1IlOiI0000Il00O3 = I0000Il00O(iIOO0O0OliO);
/* 1269 */                          int i23 = iIntValue2;
/* 1271 */                          IIOOlioOo0i iIOOlioOo0i3 = iIOOoi1IlOiI0000Il00O3.I00000oOI;
/* 1273 */                          if (iIOOlioOo0i3 != null) {
/* 1275 */                              i4 = i22;
/* 1283 */                              ((HashMap) iIOOoll4.I00iiI).put(iIOOlioOo0i3.I00000oOI, iIOOoi1IlOiI0000Il00O3);
                                    } else {
/* 1287 */                              i4 = i22;
                                    }
/* 1289 */                          iIntValue2 = i23;
/* 1291 */                          i22 = i4;
                                }
/* 1294 */                      int i24 = iIntValue2;
/* 1296 */                      LinkedHashMap linkedHashMapI000II = I000II(iIOOoll4);
/* 1300 */                      linkedList.add(linkedHashMapI000II);
/* 1303 */                      Number numberI00O0i0ii = iIOOoll4.I00O0i0ii(numValueOf, "Subrs");
/* 1309 */                      if (numberI00O0i0ii instanceof Integer) {
/* 1311 */                          Integer num = (Integer) numberI00O0i0ii;
/* 1317 */                          if (num.intValue() > 0) {
/* 1325 */                              iIOO0O0OliO.I0000Il00O = num.intValue() + i24;
/* 1331 */                              linkedHashMapI000II.put("Subrs", I0000O(iIOO0O0OliO));
                                    }
                                }
/* 1334 */                      i20 = i21 + 1;
/* 1336 */                      str2 = str13;
/* 1338 */                      bArrI0000O4 = bArr7;
/* 1340 */                      str10 = str12;
/* 1342 */                      length4 = i3;
/* 1344 */                      str = str11;
                            }
/* 1356 */                  String str14 = str2;
/* 1360 */                  IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi6 = iIOOoll.I00Iooi00oi("FDSelect");
/* 1364 */                  if (iIOOoi1IlOiI00Iooi00oi6 == null || !iIOOoi1IlOiI00Iooi00oi6.I00000oOI()) {
/* 1792 */                      IioIoO10iOiI.I000OOo1O("FDSelect is missing or empty");
/* 1795 */                      return null;
                            }
/* 1381 */                  iIOO0O0OliO.I0000Il00O = iIOOoi1IlOiI00Iooi00oi6.I00000oIO(0).intValue();
/* 1383 */                  int iI0001Ioi1lo3 = iIOO0O0OliO.I0001Ioi1lo();
/* 1387 */                  if (iI0001Ioi1lo3 == 0) {
/* 1454 */                      IIOi1liiolI0 iIOi1liiolI02 = new IIOi1liiolI0();
/* 1459 */                      iIOi1liiolI02.I00000oIO = new int[length3];
/* 1461 */                      int i25 = 0;
                                while (true) {
/* 1462 */                          int[] iArr = iIOi1liiolI02.I00000oIO;
/* 1465 */                          if (i25 >= iArr.length) {
                                        break;
                                    }
/* 1471 */                          iArr[i25] = iIOO0O0OliO.I0001Ioi1lo();
/* 1473 */                          i25++;
                                }
/* 1476 */                      iIOi1liiolI0 = iIOi1liiolI02;
                            } else {
/* 1390 */                      if (iI0001Ioi1lo3 != 3) {
/* 1446 */                          OIiilo1Ool0o.I00100o1O0lo();
/* 1449 */                          return null;
                                }
/* 1394 */                      ?? iIOiOoliI = new IIOiOoliI();
/* 1397 */                      iIOiOoliI.I00000oIO = iI0001Ioi1lo3;
/* 1399 */                      int iI000II5 = iIOO0O0OliO.I000II();
/* 1403 */                      iIOiOoliI.I00000oOI = iI000II5;
/* 1407 */                      iIOiOoliI.I0000Il00O = new IIOiiIi[iI000II5];
/* 1412 */                      for (int i26 = 0; i26 < iIOiOoliI.I00000oOI; i26++) {
/* 1417 */                          IIOiiIi iIOiiIi = new IIOiiIi(0);
/* 1424 */                          iIOiiIi.I00000oOI = iIOO0O0OliO.I000II();
/* 1430 */                          iIOiiIi.I0000Il00O = iIOO0O0OliO.I0001Ioi1lo();
/* 1434 */                          iIOiOoliI.I0000Il00O[i26] = iIOiiIi;
                                }
/* 1443 */                      iIOiOoliI.I0000O = iIOO0O0OliO.I000II();
                                iIOi1liiolI0 = iIOiOoliI;
                            }
/* 1477 */                  iIOO01IIlii3.I00l0I0l0lO1 = linkedList;
/* 1479 */                  iIOO01IIlii3.I00l0OO0IO = iIOi1liiolI0;
/* 1514 */                  List list = (linkedList2.isEmpty() || !((Map) linkedList2.get(0)).containsKey(str14)) ? null : (List) ((Map) linkedList2.get(0)).get(str14);
/* 1516 */                  List listI00Io1o110i = iIOOoll.I00Io1o110i(str14, null);
/* 1520 */                  if (listI00Io1o110i != null) {
/* 1569 */                      i2 = 0;
/* 1570 */                      if (list != null) {
/* 1578 */                          double dDoubleValue = ((Number) listI00Io1o110i.get(0)).doubleValue();
/* 1589 */                          double dDoubleValue2 = ((Number) listI00Io1o110i.get(1)).doubleValue();
/* 1600 */                          double dDoubleValue3 = ((Number) listI00Io1o110i.get(2)).doubleValue();
/* 1611 */                          double dDoubleValue4 = ((Number) listI00Io1o110i.get(3)).doubleValue();
/* 1622 */                          double dDoubleValue5 = ((Number) listI00Io1o110i.get(4)).doubleValue();
/* 1634 */                          double dDoubleValue6 = ((Number) listI00Io1o110i.get(5)).doubleValue();
/* 1645 */                          double dDoubleValue7 = ((Number) list.get(0)).doubleValue();
/* 1656 */                          double dDoubleValue8 = ((Number) list.get(1)).doubleValue();
/* 1667 */                          double dDoubleValue9 = ((Number) list.get(2)).doubleValue();
/* 1678 */                          double dDoubleValue10 = ((Number) list.get(3)).doubleValue();
/* 1689 */                          double dDoubleValue11 = ((Number) list.get(4)).doubleValue();
/* 1700 */                          double dDoubleValue12 = ((Number) list.get(5)).doubleValue();
/* 1715 */                          listI00Io1o110i.set(0, Double.valueOf((dDoubleValue2 * dDoubleValue9) + (dDoubleValue * dDoubleValue7)));
/* 1727 */                          listI00Io1o110i.set(1, Double.valueOf((dDoubleValue2 * dDoubleValue4) + (dDoubleValue * dDoubleValue8)));
/* 1740 */                          listI00Io1o110i.set(2, Double.valueOf((dDoubleValue4 * dDoubleValue9) + (dDoubleValue3 * dDoubleValue7)));
/* 1753 */                          listI00Io1o110i.set(3, Double.valueOf((dDoubleValue4 * dDoubleValue10) + (dDoubleValue3 * dDoubleValue8)));
/* 1769 */                          listI00Io1o110i.set(4, Double.valueOf((dDoubleValue9 * dDoubleValue6) + (dDoubleValue7 * dDoubleValue5) + dDoubleValue11));
/* 1785 */                          listI00Io1o110i.set(5, Double.valueOf((dDoubleValue6 * dDoubleValue10) + (dDoubleValue5 * dDoubleValue8) + dDoubleValue12));
/* 1527 */                          bArr3 = bArr2;
/* 1529 */                          i2 = 0;
                                }
                            } else if (list != null) {
/* 1524 */                      iIOO01IIlii.I0000O(str14, list);
/* 1527 */                      bArr3 = bArr2;
/* 1529 */                      i2 = 0;
                            } else {
/* 1535 */                      i2 = 0;
/* 1562 */                      iIOO01IIlii.I0000O(str14, iIOOoll.I00Io1o110i(str14, Arrays.asList(d, d2, d2, d, d2, d2)));
                            }
/* 2144 */                  iIOO01IIlii.I00ilI0I1 = bArr3;
/* 2146 */                  ArrayList arrayList4 = arrayList;
/* 2148 */                  arrayList4.add(iIOO01IIlii);
/* 2151 */                  i9 = i + 1;
/* 2153 */                  bArrI0000O2 = bArr3;
/* 2154 */                  arrayList2 = arrayList4;
/* 2155 */                  i7 = i2;
/* 2156 */                  strArrI000OOo1O = strArr;
/* 2158 */                  bArrI0000O = bArr6;
/* 2160 */                  i6 = 4;
/* 2161 */                  obj = null;
                        } else {
/* 1818 */                  IIOiool0I iIOiool0I2 = iIOO01IIlii;
/* 1820 */                  LinkedHashMap linkedHashMap2 = iIOiool0I2.I00ilO0;
/* 1824 */                  IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi7 = iIOOoll.I00Iooi00oi("Encoding");
/* 1846 */                  int iIntValue4 = (iIOOoi1IlOiI00Iooi00oi7 == null || !iIOOoi1IlOiI00Iooi00oi7.I00000oOI()) ? 0 : iIOOoi1IlOiI00Iooi00oi7.I00000oIO(0).intValue();
/* 1847 */                  if (iIntValue4 == 0) {
/* 1999 */                      iIOO0l = IIOio1Oo.I0000Il00O;
                            } else if (iIntValue4 != 1) {
/* 1852 */                      iIOO0O0OliO.I0000Il00O = iIntValue4;
/* 1854 */                      int iI0001Ioi1lo4 = iIOO0O0OliO.I0001Ioi1lo();
/* 1858 */                      int i27 = iI0001Ioi1lo4 & 127;
/* 1860 */                      if (i27 == 0) {
/* 1950 */                          IIOi1l0OoiIo iIOi1l0OoiIo = new IIOi1l0OoiIo(5);
/* 1953 */                          iIOi1l0OoiIo.I0000O = iI0001Ioi1lo4;
/* 1959 */                          iIOi1l0OoiIo.I0000oI00 = iIOO0O0OliO.I0001Ioi1lo();
/* 1962 */                          iIOi1l0OoiIo.I0000O(0, ".notdef");
/* 1968 */                          for (int i28 = 1; i28 <= iIOi1l0OoiIo.I0000oI00; i28++) {
/* 1982 */                              iIOi1l0OoiIo.I0000O(iIOO0O0OliO.I0001Ioi1lo(), I000O01llI0(iIOi0o1oII1o.I0000oI00(i28)));
                                    }
                                    iIOO0l = iIOi1l0OoiIo;
/* 1990 */                          if ((iI0001Ioi1lo4 & Barcode.FORMAT_ITF) != 0) {
/* 1992 */                              I000OiO(iIOO0O0OliO, iIOi1l0OoiIo);
                                        iIOO0l = iIOi1l0OoiIo;
                                    }
                                } else {
/* 1862 */                          if (i27 != 1) {
/* 1941 */                              IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(i27, "Invalid encoding base format "));
/* 1944 */                              return null;
                                    }
/* 1867 */                          IIOi1oOi1oO iIOi1oOi1oO = new IIOi1oOi1oO(5);
/* 1870 */                          iIOi1oOi1oO.I0000O = iI0001Ioi1lo4;
/* 1876 */                          iIOi1oOi1oO.I0000oI00 = iIOO0O0OliO.I0001Ioi1lo();
/* 1879 */                          iIOi1oOi1oO.I0000O(0, ".notdef");
/* 1882 */                          int i29 = 1;
/* 1886 */                          for (int i30 = 0; i30 < iIOi1oOi1oO.I0000oI00; i30++) {
/* 1888 */                              int iI0001Ioi1lo5 = iIOO0O0OliO.I0001Ioi1lo();
/* 1892 */                              int iI0001Ioi1lo6 = iIOO0O0OliO.I0001Ioi1lo();
/* 1896 */                              int i31 = 0;
/* 1897 */                              while (i31 <= iI0001Ioi1lo6) {
/* 1899 */                                  int i32 = i31;
/* 1913 */                                  iIOi1oOi1oO.I0000O(iI0001Ioi1lo5 + i32, I000O01llI0(iIOi0o1oII1o.I0000oI00(i29)));
/* 1916 */                                  i29++;
/* 1918 */                                  i31 = i32 + 1;
                                        }
                                    }
                                    iIOO0l = iIOi1oOi1oO;
/* 1929 */                          if ((iI0001Ioi1lo4 & Barcode.FORMAT_ITF) != 0) {
/* 1931 */                              I000OiO(iIOO0O0OliO, iIOi1oOi1oO);
                                        iIOO0l = iIOi1oOi1oO;
                                    }
                                }
                            } else {
/* 1996 */                      iIOO0l = IIOOI1Ill1ii.I0000Il00O;
                            }
/* 2001 */                  iIOiool0I2.I00io1l = iIOO0l;
/* 2005 */                  IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi8 = iIOOoll.I00Iooi00oi(OlIo0Ooi1loI.I000l1);
/* 2009 */                  if (iIOOoi1IlOiI00Iooi00oi8 == null || iIOOoi1IlOiI00Iooi00oi8.I00000oIO.size() < 2) {
/* 2168 */                      I000II.I00111O("Private dictionary entry missing for font ", iIOiool0I2.I00iOIl);
/* 2171 */                      return null;
                            }
/* 2025 */                  int iIntValue5 = iIOOoi1IlOiI00Iooi00oi8.I00000oIO(1).intValue();
/* 2029 */                  iIOO0O0OliO.I0000Il00O = iIntValue5;
/* 2031 */                  i2 = 0;
/* 2036 */                  int iIntValue6 = iIOOoi1IlOiI00Iooi00oi8.I00000oIO(0).intValue();
/* 2042 */                  IIOOoll iIOOoll5 = new IIOOoll();
/* 2047 */                  int i33 = iIOO0O0OliO.I0000Il00O + iIntValue6;
/* 2050 */                  while (iIOO0O0OliO.I0000Il00O < i33) {
/* 2052 */                      IIOOoi1IlOi iIOOoi1IlOiI0000Il00O4 = I0000Il00O(iIOO0O0OliO);
/* 2056 */                      IIOOlioOo0i iIOOlioOo0i4 = iIOOoi1IlOiI0000Il00O4.I00000oOI;
/* 2058 */                      if (iIOOlioOo0i4 != null) {
/* 2066 */                          ((HashMap) iIOOoll5.I00iiI).put(iIOOlioOo0i4.I00000oOI, iIOOoi1IlOiI0000Il00O4);
                                }
                            }
/* 2086 */                  for (Map.Entry entry : I000II(iIOOoll5).entrySet()) {
/* 2098 */                      String str15 = (String) entry.getKey();
/* 2100 */                      Object value = entry.getValue();
/* 2104 */                      if (value != null) {
/* 2106 */                          linkedHashMap2.put(str15, value);
                                }
                            }
/* 2110 */                  Number numberI00O0i0ii2 = iIOOoll5.I00O0i0ii(numValueOf, "Subrs");
/* 2116 */                  if (numberI00O0i0ii2 instanceof Integer) {
/* 2118 */                      Integer num2 = (Integer) numberI00O0i0ii2;
/* 2124 */                      if (num2.intValue() > 0) {
/* 2131 */                          iIOO0O0OliO.I0000Il00O = num2.intValue() + iIntValue5;
/* 2133 */                          byte[][] bArrI0000O5 = I0000O(iIOO0O0OliO);
/* 2137 */                          if (bArrI0000O5 != null) {
/* 2139 */                              linkedHashMap2.put("Subrs", bArrI0000O5);
                                    }
                                }
                            }
                        }
/* 1565 */              bArr3 = bArr2;
/* 2144 */              iIOO01IIlii.I00ilI0I1 = bArr3;
/* 2146 */              ArrayList arrayList42 = arrayList;
/* 2148 */              arrayList42.add(iIOO01IIlii);
/* 2151 */              i9 = i + 1;
/* 2153 */              bArrI0000O2 = bArr3;
/* 2154 */              arrayList2 = arrayList42;
/* 2155 */              i7 = i2;
/* 2156 */              strArrI000OOo1O = strArr;
/* 2158 */              bArrI0000O = bArr6;
/* 2160 */              i6 = 4;
/* 2161 */              obj = null;
                    }
/* 2196 */          return arrayList2;
                }

                public String I000O01llI0(int i) throws IOException {
                    int i2;
/* 1 */             if (i < 0) {
/* 33 */                IioIoO10iOiI.I000OOo1O("Invalid negative index when reading a string");
/* 36 */                return null;
                    }
/* 5 */             if (i <= 390) {
/* 9 */                 return i1IolI.I00000oIO[i];
                    }
/* 12 */            String[] strArr = this.I00iiO;
                    return (strArr == null || (i2 = i + (-391)) >= strArr.length) ? Oi010OO0.I000oI1ioi(i, "SID") : strArr[i2];
                }

                public void I000OiO(IIOO0O0OliO iIOO0O0OliO, IIOOoIIllI iIOOoIIllI) throws IOException {
/* 7 */             iIOOoIIllI.I0000Il00O = new IIOOoI[iIOO0O0OliO.I0001Ioi1lo()];
/* 14 */            for (int i = 0; i < iIOOoIIllI.I0000Il00O.length; i++) {
/* 18 */                IIOOoI iIOOoI = new IIOOoI(0, (byte) 0);
/* 25 */                iIOOoI.I00000oOI = iIOO0O0OliO.I0001Ioi1lo();
/* 27 */                int iI000II = iIOO0O0OliO.I000II();
/* 31 */                iIOOoI.I0000Il00O = iI000II;
/* 33 */                I000O01llI0(iI000II);
/* 38 */                iIOOoIIllI.I0000Il00O[i] = iIOOoI;
/* 48 */                iIOOoIIllI.I0000O(iIOOoI.I00000oOI, I000O01llI0(iIOOoI.I0000Il00O));
                    }
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 5 */             int i = lI1i1OI1O0l.I000iOII;
/* 9 */             l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((OloIlI0ll) obj2);
/* 16 */            lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) obj).I000l1();
/* 18 */            String[] strArr = this.I00iiO;
/* 20 */            String str = this.I00iiI;
/* 22 */            Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 26 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 29 */            parcelI00Iooi00oi.writeString(str);
/* 33 */            parcelI00Iooi00oi.writeInt(0);
/* 36 */            parcelI00Iooi00oi.writeStringArray(strArr);
/* 40 */            parcelI00Iooi00oi.writeByteArray(null);
/* 44 */            liil1lol0ioi.I00O0o1oo(1, parcelI00Iooi00oi);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    StringBuilder sb = new StringBuilder(IIOilloI0l0o.class.getSimpleName());
/* 24 */                    sb.append("[");
/* 31 */                    return IIl001iO0Io.I00100l0(sb, this.I00iiI, "]");
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }

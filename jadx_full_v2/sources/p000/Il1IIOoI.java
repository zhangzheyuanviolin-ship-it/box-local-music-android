            package p000;

            import android.util.Pair;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            public final class Il1IIOoI {
                public static final Pattern I0000Il00O = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                public static final Pattern I0000O = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                public static final Pattern I0000oI00 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                public static final ArrayList I0001Ioi1lo;
                public ArrayList I00000oIO;
                public ByteOrder I00000oOI;

                static {
/* 28 */            Il1I1I1Io il1I1I1Io = new Il1I1I1Io(0);
/* 31 */            il1I1I1Io.I00000oOI = 0;
/* 37 */            I0001Ioi1lo = Collections.list(il1I1I1Io);
                }

                public static Pair I00000oIO(String str) throws NumberFormatException {
/* 35 */            if (str.contains(",")) {
/* 37 */                String[] strArrSplit = str.split(",", -1);
/* 43 */                Pair pairI00000oIO = I00000oIO(strArrSplit[0]);
/* 55 */                if (((Integer) pairI00000oIO.first).intValue() == 2) {
/* 57 */                    return pairI00000oIO;
                        }
/* 59 */                for (int i = 1; i < strArrSplit.length; i++) {
/* 63 */                    Pair pairI00000oIO2 = I00000oIO(strArrSplit[i]);
/* 98 */                    int iIntValue = (((Integer) pairI00000oIO2.first).equals(pairI00000oIO.first) || ((Integer) pairI00000oIO2.second).equals(pairI00000oIO.first)) ? ((Integer) pairI00000oIO.first).intValue() : -1;
/* 145 */                   int iIntValue2 = (((Integer) pairI00000oIO.second).intValue() == -1 || !(((Integer) pairI00000oIO2.first).equals(pairI00000oIO.second) || ((Integer) pairI00000oIO2.second).equals(pairI00000oIO.second))) ? -1 : ((Integer) pairI00000oIO.second).intValue();
/* 146 */                   if (iIntValue == -1 && iIntValue2 == -1) {
/* 152 */                       return new Pair(2, -1);
                            }
/* 156 */                   if (iIntValue == -1) {
/* 164 */                       pairI00000oIO = new Pair(Integer.valueOf(iIntValue2), -1);
                            } else if (iIntValue2 == -1) {
/* 176 */                       pairI00000oIO = new Pair(Integer.valueOf(iIntValue), -1);
                            }
                        }
/* 182 */               return pairI00000oIO;
                    }
/* 191 */           if (!str.contains("/")) {
                        try {
                            try {
/* 259 */                       long j = Long.parseLong(str);
                                return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                            } catch (NumberFormatException unused) {
/* 322 */                       return new Pair(2, -1);
                            }
                        } catch (NumberFormatException unused2) {
/* 305 */                   Double.parseDouble(str);
/* 316 */                   return new Pair(12, -1);
                        }
                    }
/* 193 */           String[] strArrSplit2 = str.split("/", -1);
/* 198 */           if (strArrSplit2.length == 2) {
                        try {
/* 206 */                   long j2 = (long) Double.parseDouble(strArrSplit2[0]);
/* 213 */                   long j3 = (long) Double.parseDouble(strArrSplit2[1]);
/* 216 */                   if (j2 >= 0 && j3 >= 0) {
/* 228 */                       if (j2 <= 2147483647L && j3 <= 2147483647L) {
/* 237 */                           return new Pair(10, 5);
                                }
/* 243 */                       return new Pair(5, -1);
                            }
/* 249 */                   return new Pair(10, -1);
                        } catch (NumberFormatException unused3) {
                        }
                    }
/* 255 */           return new Pair(2, -1);
                }

                public final void I00000oOI(String str, String str2, ArrayList arrayList) {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             while (it.hasNext()) {
/* 21 */                if (((Map) it.next()).containsKey(str)) {
/* 23 */                    return;
                        }
                    }
/* 24 */            I0000Il00O(str, str2, arrayList);
                }

                /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
                
                    if (r7 != r9) goto L45;
                 */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0335  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0382  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x03a4  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01d4  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0297  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x030c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(String str, String str2, List list) {
                    int i;
                    int i2;
                    int i3;
                    Il1I11oilOo il1I11oilOo;
                    int i4;
                    int i5;
                    int i6;
/* 1 */             String str3 = str;
/* 3 */             String strReplaceAll = str2;
/* 11 */            ByteOrder byteOrder = this.I00000oOI;
/* 25 */            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
/* 51 */                boolean zFind = I0000O.matcher(strReplaceAll).find();
/* 61 */                boolean zFind2 = I0000oI00.matcher(strReplaceAll).find();
/* 71 */                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
/* 107 */                   l11I11lO.I0000oI00("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
/* 110 */                   return;
                        }
/* 78 */                if (zFind2) {
/* 84 */                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                        }
                    }
/* 117 */           if ("ISOSpeedRatings".equals(str3)) {
/* 119 */               str3 = "PhotographicSensitivity";
                    }
/* 121 */           String str4 = str3;
/* 122 */           int i7 = 3;
/* 123 */           int i8 = 2;
/* 124 */           int i9 = 1;
/* 125 */           if (strReplaceAll != null && Il1IO1oOioO0.I0000oI00.contains(str4)) {
/* 141 */               if (str4.equals("GPSTimeStamp")) {
/* 145 */                   Matcher matcher = I0000Il00O.matcher(strReplaceAll);
/* 153 */                   if (!matcher.find()) {
/* 173 */                       l11I11lO.I0000oI00("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
/* 176 */                       return;
                            }
/* 179 */                   StringBuilder sb = new StringBuilder();
/* 182 */                   String strGroup = matcher.group(1);
/* 186 */                   strGroup.getClass();
/* 193 */                   sb.append(Integer.parseInt(strGroup));
/* 198 */                   sb.append("/1,");
/* 201 */                   String strGroup2 = matcher.group(2);
/* 205 */                   strGroup2.getClass();
/* 212 */                   sb.append(Integer.parseInt(strGroup2));
/* 215 */                   sb.append("/1,");
/* 218 */                   String strGroup3 = matcher.group(3);
/* 222 */                   strGroup3.getClass();
/* 229 */                   sb.append(Integer.parseInt(strGroup3));
/* 234 */                   sb.append("/1");
/* 237 */                   strReplaceAll = sb.toString();
                        } else {
                            try {
/* 264 */                       strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                            } catch (NumberFormatException e) {
/* 274 */                       l11I11lO.I0001Ioi1lo("ExifData", IIl001iO0Io.I000oI1ioi("Invalid value for ", str4, " : ", strReplaceAll), e);
/* 277 */                       return;
                            }
                        }
                    }
/* 279 */           int i10 = 0;
                    while (true) {
/* 280 */               Il1O11[] il1O11Arr = Il1IO1oOioO0.I0000Il00O;
/* 283 */               if (i10 >= 4) {
/* 1008 */                  return;
                        }
/* 297 */               Il1O11 il1O11 = (Il1O11) ((HashMap) I0001Ioi1lo.get(i10)).get(str4);
/* 299 */               if (il1O11 != null) {
/* 301 */                   int i11 = il1O11.I0000O;
/* 303 */                   int i12 = il1O11.I0000Il00O;
/* 305 */                   if (strReplaceAll == null) {
/* 313 */                       ((Map) list.get(i10)).remove(str4);
                            } else {
/* 321 */                       Pair pairI00000oIO = I00000oIO(strReplaceAll);
/* 333 */                       int i13 = -1;
/* 334 */                       if (i12 == ((Integer) pairI00000oIO.first).intValue() || i12 == ((Integer) pairI00000oIO.second).intValue()) {
/* 377 */                           i11 = i12;
                                    switch (i11) {
                                        case 1:
/* 933 */                                   i = i8;
/* 934 */                                   int i14 = i9;
/* 936 */                                   i3 = i7;
/* 941 */                                   Map map = (Map) list.get(i10);
/* 943 */                                   Charset charset = Il1I11oilOo.I0000O;
/* 949 */                                   i2 = i14;
/* 951 */                                   if (strReplaceAll.length() != i2 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
/* 987 */                                       byte[] bytes = strReplaceAll.getBytes(Il1I11oilOo.I0000O);
/* 994 */                                       il1I11oilOo = new Il1I11oilOo(bytes, i2, bytes.length);
                                            } else {
/* 975 */                                       byte[] bArr = new byte[i2];
/* 977 */                                       bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
/* 981 */                                       il1I11oilOo = new Il1I11oilOo(bArr, i2, i2);
                                            }
/* 998 */                                   map.put(str4, il1I11oilOo);
                                            break;
                                        case 2:
                                        case 7:
/* 899 */                                   i4 = i9;
/* 901 */                                   i3 = i7;
/* 906 */                                   Map map2 = (Map) list.get(i10);
/* 908 */                                   Charset charset2 = Il1I11oilOo.I0000O;
/* 918 */                                   byte[] bytes2 = strReplaceAll.concat("\u0000").getBytes(Il1I11oilOo.I0000O);
/* 925 */                                   i = 2;
/* 929 */                                   map2.put(str4, new Il1I11oilOo(bytes2, 2, bytes2.length));
/* 896 */                                   i2 = i4;
                                            break;
                                        case 3:
/* 822 */                                   int i15 = i7;
/* 824 */                                   i4 = i9;
/* 827 */                                   String[] strArrSplit = strReplaceAll.split(",", -1);
/* 831 */                                   int length = strArrSplit.length;
/* 832 */                                   int[] iArr = new int[length];
/* 836 */                                   for (int i16 = 0; i16 < strArrSplit.length; i16++) {
/* 844 */                                       iArr[i16] = Integer.parseInt(strArrSplit[i16]);
                                            }
/* 853 */                                   Map map3 = (Map) list.get(i10);
/* 862 */                                   ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Il1I11oilOo.I0001Ioi1lo[i15] * length]);
/* 866 */                                   byteBufferWrap.order(byteOrder);
/* 870 */                                   for (int i17 = 0; i17 < length; i17++) {
/* 875 */                                       byteBufferWrap.putShort((short) iArr[i17]);
                                            }
/* 887 */                                   i3 = i15;
/* 892 */                                   map3.put(str4, new Il1I11oilOo(byteBufferWrap.array(), i3, length));
/* 895 */                                   i = 2;
/* 896 */                                   i2 = i4;
                                            break;
                                        case 4:
/* 781 */                                   i5 = i7;
/* 783 */                                   i6 = i9;
/* 786 */                                   String[] strArrSplit2 = strReplaceAll.split(",", -1);
/* 791 */                                   long[] jArr = new long[strArrSplit2.length];
/* 795 */                                   for (int i18 = 0; i18 < strArrSplit2.length; i18++) {
/* 803 */                                       jArr[i18] = Long.parseLong(strArrSplit2[i18]);
                                            }
/* 818 */                                   ((Map) list.get(i10)).put(str4, Il1I11oilOo.I00000oOI(jArr, byteOrder));
/* 774 */                                   i = 2;
/* 775 */                                   i2 = i6;
/* 777 */                                   i3 = i5;
                                            break;
                                        case 5:
/* 664 */                                   i5 = i7;
/* 666 */                                   i6 = i9;
/* 668 */                                   int i19 = -1;
/* 669 */                                   String[] strArrSplit3 = strReplaceAll.split(",", -1);
/* 673 */                                   int length2 = strArrSplit3.length;
/* 674 */                                   I0OIIiOo0O[] i0OIIiOo0OArr = new I0OIIiOo0O[length2];
/* 676 */                                   int i20 = 0;
/* 678 */                                   while (i20 < strArrSplit3.length) {
/* 682 */                                       String[] strArrSplit4 = strArrSplit3[i20].split("/", i19);
/* 707 */                                       i0OIIiOo0OArr[i20] = new I0OIIiOo0O((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i6]));
/* 709 */                                       i20++;
/* 711 */                                       length2 = length2;
/* 713 */                                       i19 = -1;
                                            }
/* 716 */                                   int i21 = length2;
/* 722 */                                   Map map4 = (Map) list.get(i10);
/* 733 */                                   ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[Il1I11oilOo.I0001Ioi1lo[5] * i21]);
/* 737 */                                   byteBufferWrap2.order(byteOrder);
/* 743 */                                   for (int i22 = 0; i22 < i21; i22++) {
/* 745 */                                       I0OIIiOo0O i0OIIiOo0O = i0OIIiOo0OArr[i22];
/* 750 */                                       byteBufferWrap2.putInt((int) i0OIIiOo0O.I00000oOI);
/* 756 */                                       byteBufferWrap2.putInt((int) i0OIIiOo0O.I0000Il00O);
                                            }
/* 771 */                                   map4.put(str4, new Il1I11oilOo(byteBufferWrap2.array(), 5, i21));
/* 774 */                                   i = 2;
/* 775 */                                   i2 = i6;
/* 777 */                                   i3 = i5;
                                            break;
                                        case 9:
/* 586 */                                   int i23 = i7;
/* 588 */                                   int i24 = i9;
/* 591 */                                   String[] strArrSplit5 = strReplaceAll.split(",", -1);
/* 595 */                                   int length3 = strArrSplit5.length;
/* 596 */                                   int[] iArr2 = new int[length3];
/* 600 */                                   for (int i25 = 0; i25 < strArrSplit5.length; i25++) {
/* 608 */                                       iArr2[i25] = Integer.parseInt(strArrSplit5[i25]);
                                            }
/* 617 */                                   Map map5 = (Map) list.get(i10);
/* 628 */                                   ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[Il1I11oilOo.I0001Ioi1lo[9] * length3]);
/* 632 */                                   byteBufferWrap3.order(byteOrder);
/* 636 */                                   for (int i26 = 0; i26 < length3; i26++) {
/* 640 */                                       byteBufferWrap3.putInt(iArr2[i26]);
                                            }
/* 655 */                                   map5.put(str4, new Il1I11oilOo(byteBufferWrap3.array(), 9, length3));
/* 658 */                                   i2 = i24;
/* 660 */                                   i3 = i23;
/* 466 */                                   i = i8;
                                            break;
                                        case 10:
/* 469 */                                   int i27 = i9;
/* 471 */                                   String[] strArrSplit6 = strReplaceAll.split(",", -1);
/* 475 */                                   int length4 = strArrSplit6.length;
/* 476 */                                   I0OIIiOo0O[] i0OIIiOo0OArr2 = new I0OIIiOo0O[length4];
/* 478 */                                   int i28 = 0;
/* 480 */                                   while (i28 < strArrSplit6.length) {
/* 484 */                                       String[] strArrSplit7 = strArrSplit6[i28].split("/", i13);
/* 511 */                                       i0OIIiOo0OArr2[i28] = new I0OIIiOo0O((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i27]));
/* 513 */                                       i28++;
/* 515 */                                       i7 = i7;
/* 517 */                                       strReplaceAll = strReplaceAll;
/* 519 */                                       i13 = -1;
                                            }
/* 521 */                                   int i29 = i7;
/* 523 */                                   String str5 = strReplaceAll;
/* 529 */                                   Map map6 = (Map) list.get(i10);
/* 540 */                                   ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(new byte[Il1I11oilOo.I0001Ioi1lo[10] * length4]);
/* 544 */                                   byteBufferWrap4.order(byteOrder);
/* 548 */                                   for (int i30 = 0; i30 < length4; i30++) {
/* 550 */                                       I0OIIiOo0O i0OIIiOo0O2 = i0OIIiOo0OArr2[i30];
/* 555 */                                       byteBufferWrap4.putInt((int) i0OIIiOo0O2.I00000oOI);
/* 561 */                                       byteBufferWrap4.putInt((int) i0OIIiOo0O2.I0000Il00O);
                                            }
/* 576 */                                   map6.put(str4, new Il1I11oilOo(byteBufferWrap4.array(), 10, length4));
/* 579 */                                   i2 = i27;
/* 581 */                                   i3 = i29;
/* 583 */                                   strReplaceAll = str5;
/* 466 */                                   i = i8;
                                            break;
                                        case 12:
/* 386 */                                   String[] strArrSplit8 = strReplaceAll.split(",", -1);
/* 390 */                                   int length5 = strArrSplit8.length;
/* 391 */                                   double[] dArr = new double[length5];
/* 395 */                                   for (int i31 = 0; i31 < strArrSplit8.length; i31++) {
/* 403 */                                       dArr[i31] = Double.parseDouble(strArrSplit8[i31]);
                                            }
/* 412 */                                   Map map7 = (Map) list.get(i10);
/* 423 */                                   ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(new byte[Il1I11oilOo.I0001Ioi1lo[12] * length5]);
/* 427 */                                   byteBufferWrap5.order(byteOrder);
/* 430 */                                   int i32 = 0;
/* 431 */                                   while (i32 < length5) {
/* 435 */                                       double[] dArr2 = dArr;
/* 439 */                                       byteBufferWrap5.putDouble(dArr2[i32]);
/* 442 */                                       i32++;
/* 444 */                                       i9 = i9;
/* 446 */                                       dArr = dArr2;
                                            }
/* 460 */                                   map7.put(str4, new Il1I11oilOo(byteBufferWrap5.array(), 12, length5));
/* 463 */                                   i2 = i9;
/* 465 */                                   i3 = i7;
/* 466 */                                   i = i8;
                                            break;
                                    }
                                } else if (i11 == -1 || !(i11 == ((Integer) pairI00000oIO.first).intValue() || i11 == ((Integer) pairI00000oIO.second).intValue())) {
/* 370 */                           if (i12 != i9) {
/* 373 */                               if (i12 != 7) {
                                        }
                                    }
/* 377 */                           i11 = i12;
                                    switch (i11) {
                                    }
                                } else {
                                    switch (i11) {
                                    }
                                }
                            }
/* 316 */                   i = i8;
/* 317 */                   i2 = i9;
/* 318 */                   i3 = i7;
                        } else {
/* 316 */                   i = i8;
/* 317 */                   i2 = i9;
/* 318 */                   i3 = i7;
                        }
/* 1001 */              i10++;
/* 1003 */              i7 = i3;
/* 1004 */              i8 = i;
/* 1005 */              i9 = i2;
                    }
                }

                public final void I0000O(int i) {
                    int i2;
/* 1 */             if (i == 0) {
/* 48 */                i2 = 1;
                    } else if (i == 90) {
/* 46 */                i2 = 6;
                    } else if (i == 180) {
/* 44 */                i2 = 3;
                    } else if (i != 270) {
/* 36 */                l11I11lO.I0000oI00("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
/* 39 */                i2 = 0;
                    } else {
/* 41 */                i2 = 8;
                    }
/* 57 */            I0000Il00O("Orientation", String.valueOf(i2), this.I00000oIO);
                }
            }

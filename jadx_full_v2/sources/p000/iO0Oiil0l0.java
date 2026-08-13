            package p000;

            import android.text.TextUtils;
            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Objects;
            
            public final class iO0Oiil0l0 implements Closeable {
                public static final int I00iiI = 0;
                public String I00iOIl;

                static {
/* 4 */             new iI1oo1lO1(0);
                }

                @Override
                public final void close() {
/* 7 */             iOli00o11Olo ioli00o11olo = (iOli00o11Olo) iIl1i1i11.I0000O.get();
/* 9 */             iO0Oiil0l0 io0oiil0l0 = ioli00o11olo.I00000oOI;
/* 11 */            if (io0oiil0l0 == null) {
/* 60 */                StringBuilder sb = new StringBuilder(115);
/* 65 */                sb.append("Tried to end [<missing root>], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
/* 110 */               throw new IOIoIlIlO(sb.toString(), 9);
                    }
/* 13 */            if (this != io0oiil0l0) {
/* 36 */                StringBuilder sb2 = new StringBuilder(108);
/* 41 */                sb2.append("Tried to end span <missing root>, but that span is not the current span. The current span is <missing root>.");
/* 53 */                throw new IOIoIlIlO(sb2.toString(), 10);
                    }
/* 18 */            if (ioli00o11olo.I0000O != null) {
/* 21 */                iIl1i1i11.I00000oIO(ioli00o11olo, null, 2);
                    } else {
/* 26 */                iIl1i1i11.I00000oIO(ioli00o11olo, null, 4);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:115:0x02bf, code lost:
                
                    r11 = r12.I0000O;
                    r12 = java.lang.Integer.valueOf(r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x02c9, code lost:
                
                    if (r11.containsKey(r12) != false) goto L204;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:117:0x02cb, code lost:
                
                    ((p000.iOiI110l1OI) r1.I000II).I0000O.put(r12, new p000.iOiI110l1OI(r8, 1073741824));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:118:0x02d9, code lost:
                
                    if (r10 == null) goto L207;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x02db, code lost:
                
                    r10.I0000Il00O = (p000.iOiI110l1OI) r1.I000II;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x02ed, code lost:
                
                    if (r10 == null) goto L123;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:122:0x02ef, code lost:
                
                    r10.I0000Il00O = (p000.iOiI110l1OI) r1.I000II;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x02f5, code lost:
                
                    r1.I00000oOI = r8;
                    r1.I0000Il00O++;
                    r1.I0000Il00O();
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:101:0x0267  */
                /* JADX WARN: Removed duplicated region for block: B:103:0x026b  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0412  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x047b  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x04da A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:186:0x04de  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x0413 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01be A[PHI: r19
                  0x01be: PHI (r19v2 short[]) = (r19v0 short[]), (r19v3 short[]) binds: [B:91:0x022d, B:73:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r0v22 */
                /* JADX WARN: Type inference failed for: r0v23 */
                /* JADX WARN: Type inference failed for: r0v25, types: [iiO11110] */
                /* JADX WARN: Type inference failed for: r0v26, types: [iiO11110] */
                /* JADX WARN: Type inference failed for: r0v45 */
                /* JADX WARN: Type inference failed for: r18v10 */
                /* JADX WARN: Type inference failed for: r18v7, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r18v8 */
                /* JADX WARN: Type inference failed for: r19v1 */
                /* JADX WARN: Type inference failed for: r4v5, types: [int[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    int i;
                    Object obj;
                    int i2;
                    iO0Oiil0l0 io0oiil0l0;
                    int i3;
                    int i4;
                    short[] sArr;
                    ?? r19;
                    Object obj2;
                    short[] sArr2;
                    Object obj3;
                    ?? r0;
                    Object obj4;
                    OOoli1l oOoli1l;
                    ?? r18;
                    int i5;
                    int i6;
                    IioIO1i iioIO1i;
                    iOiI110l1OI ioii110l1oi;
                    iOOiO1IoOo iooio1iooo;
                    String strConcat;
/* 1 */             boolean z = iIl1i1i11.I00000oIO;
/* 3 */             int i7 = 0;
/* 4 */             int i8 = 0;
/* 5 */             iO0Oiil0l0 io0oiil0l02 = this;
                    while (true) {
/* 7 */                 i = 14;
/* 9 */                 obj = null;
/* 10 */                if (io0oiil0l02 == null) {
                            break;
                        }
/* 12 */                i8 += 14;
/* 13 */                i7++;
/* 15 */                io0oiil0l02 = null;
                    }
/* 21 */            if (i7 > 250) {
                        int i9 = i7 - 1;
/* 25 */                String[] strArr = new String[i7];
/* 27 */                iO0Oiil0l0 io0oiil0l03 = this;
/* 29 */                while (i9 >= 0) {
/* 31 */                    io0oiil0l03.getClass();
/* 34 */                    strArr[i9] = "<missing root>";
                            i9--;
/* 38 */                    io0oiil0l03 = null;
                        }
/* 42 */                Object[] objArrCopyOf = new Object[8];
/* 54 */                OoiOOoOlo ooiOOoOloI001i1O0Ol = iiOlI01i1iI.I001lloI(i7, (Object[]) strArr.clone()).I001i1O0Ol();
/* 58 */                int i10 = 0;
/* 59 */                int iIntValue = 0;
                        while (true) {
/* 65 */                    int i11 = 1;
/* 66 */                    if (ooiOOoOloI001i1O0Ol.hasNext()) {
/* 68 */                        Object next = ooiOOoOloI001i1O0Ol.next();
/* 72 */                        int i12 = i10 + 1;
/* 74 */                        Integer numValueOf = Integer.valueOf(i10);
/* 78 */                        int i13 = iIntValue + 1;
/* 80 */                        int i14 = i;
/* 82 */                        int length = objArrCopyOf.length;
/* 85 */                        int i15 = i13 + i13;
/* 87 */                        if (i15 > length) {
/* 89 */                            if (i15 > length) {
/* 95 */                                length = length + (length >> 1) + 1;
/* 96 */                                if (length < i15) {
/* 98 */                                    length = OooioIOo1.I0000Il00O(i15, -1);
                                        }
/* 103 */                               if (length < 0) {
/* 105 */                                   length = Integer.MAX_VALUE;
                                        }
                                    }
/* 108 */                           objArrCopyOf = Arrays.copyOf(objArrCopyOf, length);
                                }
/* 113 */                       if (next == null) {
/* 136 */                           IOOlIIilOl0.I000II("null key in entry: null=".concat(String.valueOf(numValueOf)));
/* 9 */                             return null;
                                }
/* 115 */                       int i16 = iIntValue + iIntValue;
/* 116 */                       objArrCopyOf[i16] = next;
/* 119 */                       objArrCopyOf[i16 + 1] = numValueOf;
/* 121 */                       i10 = i12;
/* 122 */                       iIntValue = i13;
/* 123 */                       i = i14;
                            } else {
/* 140 */                       i2 = i;
/* 144 */                       int i17 = 2;
/* 145 */                       if (iIntValue == 0) {
/* 147 */                           oOoli1l = OOoli1l.I00l0OO0IO;
                                } else if (iIntValue == 1) {
/* 160 */                           Objects.requireNonNull(objArrCopyOf[0]);
/* 165 */                           Objects.requireNonNull(objArrCopyOf[1]);
/* 170 */                           oOoli1l = new OOoli1l(i11, i17, obj, objArrCopyOf);
                                } else {
/* 177 */                           lilI1o.I00000oOI(iIntValue, objArrCopyOf.length >> 1);
/* 180 */                           int iI001iOo1i0O = iiOlI01i1iI.I001iOo1i0O(iIntValue);
/* 184 */                           if (iIntValue == 1) {
/* 188 */                               Objects.requireNonNull(objArrCopyOf[0]);
/* 193 */                               Objects.requireNonNull(objArrCopyOf[1]);
/* 196 */                               i3 = 2;
/* 198 */                               obj2 = null;
/* 199 */                               obj3 = null;
/* 201 */                               iIntValue = 1;
/* 202 */                               i4 = 1;
                                    } else {
                                        int i18 = iI001iOo1i0O - 1;
/* 210 */                               if (iI001iOo1i0O <= 128) {
/* 212 */                                   byte[] bArr = new byte[iI001iOo1i0O];
/* 214 */                                   Arrays.fill(bArr, (byte) -1);
/* 217 */                                   iiO11110 iio11110 = null;
/* 218 */                                   int i19 = 0;
/* 220 */                                   int i20 = 0;
/* 221 */                                   while (i19 < iIntValue) {
/* 223 */                                       Object obj5 = obj;
/* 225 */                                       int i21 = i20 + i20;
/* 227 */                                       int i22 = i19 + i19;
/* 229 */                                       int i23 = i11;
/* 231 */                                       Object obj6 = objArrCopyOf[i22];
/* 233 */                                       Objects.requireNonNull(obj6);
/* 238 */                                       int i24 = i17;
/* 240 */                                       Object obj7 = objArrCopyOf[i22 ^ 1];
/* 242 */                                       Objects.requireNonNull(obj7);
/* 249 */                                       int iI00000oIO = lilOIIIlIO.I00000oIO(obj6.hashCode());
                                                while (true) {
/* 253 */                                           int i25 = iI00000oIO & i18;
/* 259 */                                           int i26 = bArr[i25] & 255;
/* 260 */                                           if (i26 == 255) {
/* 263 */                                               bArr[i25] = (byte) i21;
/* 265 */                                               if (i20 < i19) {
/* 267 */                                                   objArrCopyOf[i21] = obj6;
/* 271 */                                                   objArrCopyOf[i21 ^ 1] = obj7;
                                                        }
/* 273 */                                               i20++;
                                                    } else {
/* 282 */                                               if (obj6.equals(objArrCopyOf[i26])) {
/* 284 */                                                   int i27 = i26 ^ 1;
/* 288 */                                                   Object obj8 = objArrCopyOf[i27];
/* 290 */                                                   Objects.requireNonNull(obj8);
/* 293 */                                                   iio11110 = new iiO11110(obj6, obj7, obj8);
/* 296 */                                                   objArrCopyOf[i27] = obj7;
                                                            break;
                                                        }
/* 308 */                                               iI00000oIO = i25 + 1;
                                                    }
                                                }
/* 298 */                                       i19++;
/* 300 */                                       obj = obj5;
/* 302 */                                       i11 = i23;
/* 304 */                                       i17 = i24;
                                            }
/* 312 */                                   i3 = i17;
/* 314 */                                   Object obj9 = obj;
/* 316 */                                   i4 = i11;
                                            obj2 = bArr;
                                            obj3 = obj9;
/* 318 */                                   if (i20 != iIntValue) {
/* 323 */                                       Object[] objArr = new Object[3];
/* 325 */                                       objArr[0] = bArr;
/* 331 */                                       objArr[i4] = Integer.valueOf(i20);
/* 333 */                                       objArr[i3] = iio11110;
/* 335 */                                       obj2 = objArr;
                                                obj3 = obj9;
                                            }
                                        } else {
/* 338 */                                   i3 = 2;
/* 340 */                                   Object obj10 = null;
/* 342 */                                   i4 = 1;
/* 347 */                                   if (iI001iOo1i0O <= 32768) {
/* 349 */                                       short[] sArr3 = new short[iI001iOo1i0O];
/* 352 */                                       Arrays.fill(sArr3, (short) -1);
/* 355 */                                       int i28 = 0;
/* 357 */                                       int i29 = 0;
/* 358 */                                       iiO11110 iio111102 = null;
/* 360 */                                       while (i28 < iIntValue) {
/* 362 */                                           int i30 = i29 + i29;
/* 364 */                                           int i31 = i28 + i28;
/* 366 */                                           Object obj11 = objArrCopyOf[i31];
/* 368 */                                           Objects.requireNonNull(obj11);
/* 373 */                                           Object obj12 = objArrCopyOf[i31 ^ 1];
/* 375 */                                           Objects.requireNonNull(obj12);
/* 382 */                                           int iI00000oIO2 = lilOIIIlIO.I00000oIO(obj11.hashCode());
                                                    while (true) {
/* 386 */                                               int i32 = iI00000oIO2 & i18;
/* 389 */                                               char c = (char) sArr3[i32];
/* 390 */                                               sArr2 = sArr3;
/* 395 */                                               if (c == 65535) {
/* 398 */                                                   sArr2[i32] = (short) i30;
/* 400 */                                                   if (i29 < i28) {
/* 402 */                                                       objArrCopyOf[i30] = obj11;
/* 406 */                                                       objArrCopyOf[i30 ^ 1] = obj12;
                                                            }
/* 408 */                                                   i29++;
                                                        } else {
/* 417 */                                                   if (obj11.equals(objArrCopyOf[c])) {
/* 419 */                                                       int i33 = c ^ 1;
/* 423 */                                                       Object obj13 = objArrCopyOf[i33];
/* 425 */                                                       Objects.requireNonNull(obj13);
/* 428 */                                                       iio111102 = new iiO11110(obj11, obj12, obj13);
/* 431 */                                                       objArrCopyOf[i33] = obj12;
                                                                break;
                                                            }
/* 438 */                                                   iI00000oIO2 = i32 + 1;
/* 440 */                                                   sArr3 = sArr2;
                                                        }
                                                    }
/* 433 */                                           i28++;
/* 435 */                                           sArr3 = sArr2;
                                                }
/* 443 */                                       sArr = sArr3;
/* 445 */                                       if (i29 == iIntValue) {
/* 447 */                                           obj2 = sArr;
                                                    obj3 = obj10;
                                                } else {
/* 452 */                                           obj2 = new Object[]{sArr, Integer.valueOf(i29), iio111102};
                                                    obj3 = obj10;
                                                }
                                            } else {
/* 466 */                                       ?? r4 = new int[iI001iOo1i0O];
/* 469 */                                       Arrays.fill((int[]) r4, -1);
/* 472 */                                       int i34 = 0;
/* 474 */                                       int i35 = 0;
/* 475 */                                       iiO11110 iio111103 = null;
                                                short[] sArr4 = r4;
/* 477 */                                       while (i34 < iIntValue) {
/* 479 */                                           int i36 = i35 + i35;
/* 481 */                                           int i37 = i34 + i34;
/* 483 */                                           Object obj14 = objArrCopyOf[i37];
/* 485 */                                           Objects.requireNonNull(obj14);
/* 490 */                                           Object obj15 = objArrCopyOf[i37 ^ 1];
/* 492 */                                           Objects.requireNonNull(obj15);
/* 499 */                                           int iI00000oIO3 = lilOIIIlIO.I00000oIO(obj14.hashCode());
                                                    short[] sArr5 = sArr4;
                                                    while (true) {
/* 503 */                                               int i38 = iI00000oIO3 & i18;
/* 504 */                                               short s = sArr5[i38];
/* 506 */                                               r19 = sArr5;
/* 509 */                                               if (s == -1) {
/* 511 */                                                   r19[i38] = i36;
/* 513 */                                                   if (i35 < i34) {
/* 515 */                                                       objArrCopyOf[i36] = obj14;
/* 519 */                                                       objArrCopyOf[i36 ^ 1] = obj15;
                                                            }
/* 521 */                                                   i35++;
                                                        } else {
/* 530 */                                                   if (obj14.equals(objArrCopyOf[s])) {
/* 532 */                                                       int i39 = s ^ 1;
/* 536 */                                                       Object obj16 = objArrCopyOf[i39];
/* 538 */                                                       Objects.requireNonNull(obj16);
/* 541 */                                                       iio111103 = new iiO11110(obj14, obj15, obj16);
/* 544 */                                                       objArrCopyOf[i39] = obj15;
                                                                break;
                                                            }
/* 551 */                                                   iI00000oIO3 = i38 + 1;
/* 553 */                                                   sArr5 = r19;
                                                        }
                                                    }
/* 546 */                                           i34++;
/* 548 */                                           sArr4 = r19;
                                                }
/* 556 */                                       sArr = sArr4;
/* 558 */                                       if (i35 != iIntValue) {
/* 562 */                                           obj2 = new Object[]{sArr, Integer.valueOf(i35), iio111103};
                                                    obj3 = obj10;
                                                }
                                            }
                                        }
                                    }
/* 576 */                           if (obj2 instanceof Object[]) {
/* 578 */                               Object[] objArr2 = (Object[]) obj2;
/* 582 */                               r0 = (iiO11110) objArr2[i3];
/* 584 */                               Object obj17 = objArr2[0];
/* 590 */                               iIntValue = ((Integer) objArr2[i4]).intValue();
/* 596 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 600 */                               obj4 = obj17;
                                    } else {
/* 602 */                               r0 = obj3;
                                        obj4 = obj2;
                                    }
/* 608 */                           oOoli1l = new OOoli1l(iIntValue, i3, obj4, objArrCopyOf);
                                    r18 = obj3;
/* 612 */                           int i40 = oOoli1l.I00iio;
/* 614 */                           if (r0 == null) {
/* 1247 */                              Object obj18 = r0.I0000Il00O;
/* 1249 */                              Object obj19 = r0.I00000oOI;
/* 1251 */                              Object obj20 = r0.I00000oIO;
/* 1253 */                              String strValueOf = String.valueOf(obj20);
/* 1257 */                              String strValueOf2 = String.valueOf(obj19);
/* 1261 */                              String strValueOf3 = String.valueOf(obj20);
/* 1265 */                              String strValueOf4 = String.valueOf(obj18);
/* 1298 */                              StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length() + 5 + strValueOf3.length() + 1 + strValueOf4.length());
/* 1305 */                              IIl001iO0Io.I001lIiIIo1O(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
/* 1314 */                              I000II.I000iOII(IIl001iO0Io.I00100o1O0lo(sb, " and ", strValueOf3, "=", strValueOf4));
/* 1317 */                              return r18;
                                    }
/* 616 */                           int i41 = i7 >> 2;
/* 618 */                           if (i40 > i41) {
/* 620 */                               iioIO1i = r18;
/* 1143 */                              strConcat = "";
/* 1145 */                              if (iioIO1i != null) {
/* 1148 */                                  int i42 = iioIO1i.I00000oOI;
/* 1166 */                                  String strConcat2 = i42 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i42))).concat(" -> ") : "";
/* 1172 */                                  int i43 = iioIO1i.I0000Il00O;
/* 1174 */                                  int i44 = iioIO1i.I0000O;
/* 1179 */                                  int i45 = ((i43 - i42) * i44) + i42;
/* 1194 */                                  strConcat = i45 < i7 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i45, i7)))) : "";
/* 1202 */                                  String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i42, i43));
/* 1206 */                                  Locale locale = Locale.US;
/* 1232 */                                  strConcat = strConcat2 + "{" + strJoin + "}x" + i44 + strConcat;
                                        }
                                        io0oiil0l0 = r18;
/* 1240 */                              if (!strConcat.isEmpty()) {
/* 1243 */                                  return strConcat;
                                        }
                                    } else {
/* 624 */                               int i46 = i7 + 1;
/* 626 */                               int[] iArr = new int[i46];
/* 630 */                               for (int i47 = 0; i47 < i7; i47++) {
/* 644 */                                   iArr[i47] = ((Integer) oOoli1l.get(strArr[i47])).intValue();
                                        }
/* 649 */                               iArr[i7] = i40;
/* 653 */                               int i48 = i4;
/* 655 */                               Iiool010Oi iiool010Oi = new Iiool010Oi(i48);
/* 658 */                               iiool010Oi.I0000oI00 = iArr;
/* 663 */                               iOiI110l1OI ioii110l1oi2 = new iOiI110l1OI(-1, -1);
/* 666 */                               iiool010Oi.I0001Ioi1lo = ioii110l1oi2;
/* 668 */                               iiool010Oi.I000II = ioii110l1oi2;
/* 670 */                               VarHandle.storeStoreFence();
/* 673 */                               int i49 = 0;
/* 675 */                               while (i49 < i46) {
                                            iiool010Oi.I0000O += i48;
/* 684 */                                   int[] iArr2 = (int[]) iiool010Oi.I0000oI00;
/* 686 */                                   int i50 = iArr2[i49];
                                            while (true) {
/* 688 */                                       iOiI110l1OI ioii110l1oi3 = r18;
                                                while (true) {
/* 692 */                                           if (iiool010Oi.I0000O > 0) {
/* 694 */                                               int i51 = iiool010Oi.I0000Il00O;
/* 698 */                                               iOiI110l1OI ioii110l1oi4 = (iOiI110l1OI) iiool010Oi.I000II;
/* 702 */                                               if (i51 == 0) {
                                                            break;
                                                        }
/* 789 */                                               int i52 = ((iOiI110l1OI) ioii110l1oi4.I0000O.get(Integer.valueOf(iArr2[iiool010Oi.I00000oOI]))).I00000oIO;
/* 791 */                                               int i53 = iiool010Oi.I0000Il00O;
/* 796 */                                               if (iArr2[i52 + i53] == i50) {
/* 798 */                                                   if (ioii110l1oi3 != null) {
/* 804 */                                                       ioii110l1oi3.I0000Il00O = (iOiI110l1OI) iiool010Oi.I000II;
                                                            }
/* 808 */                                                   iiool010Oi.I0000Il00O = i53 + 1;
/* 810 */                                                   iiool010Oi.I0000Il00O();
                                                        } else {
/* 832 */                                                   iOiI110l1OI ioii110l1oi5 = (iOiI110l1OI) ((iOiI110l1OI) iiool010Oi.I000II).I0000O.get(Integer.valueOf(iArr2[iiool010Oi.I00000oOI]));
/* 845 */                                                   iOiI110l1OI ioii110l1oi6 = new iOiI110l1OI(ioii110l1oi5.I00000oIO, (iiool010Oi.I0000Il00O + r14) - 1);
/* 862 */                                                   ((iOiI110l1OI) iiool010Oi.I000II).I0000O.put(Integer.valueOf(iArr2[iiool010Oi.I00000oOI]), ioii110l1oi6);
/* 869 */                                                   int i54 = ioii110l1oi6.I00000oOI + 1;
/* 873 */                                                   Integer numValueOf2 = Integer.valueOf(iArr2[i54]);
/* 877 */                                                   HashMap map = ioii110l1oi6.I0000O;
/* 879 */                                                   map.put(numValueOf2, ioii110l1oi5);
/* 882 */                                                   ioii110l1oi5.I00000oIO = i54;
/* 884 */                                                   if (ioii110l1oi3 != null) {
/* 886 */                                                       ioii110l1oi3.I0000Il00O = ioii110l1oi6;
                                                            }
/* 899 */                                                   map.put(Integer.valueOf(i50), new iOiI110l1OI(i49, 1073741824));
                                                            iiool010Oi.I0000O--;
/* 910 */                                                   iiool010Oi.I0000O();
/* 913 */                                                   ioii110l1oi3 = ioii110l1oi6;
                                                        }
                                                    }
                                                }
                                                iiool010Oi.I0000O--;
/* 746 */                                       iiool010Oi.I0000O();
                                            }
/* 916 */                                   i49++;
/* 918 */                                   i48 = 1;
                                        }
/* 923 */                               ArrayDeque arrayDeque = new ArrayDeque();
/* 930 */                               iOiI110l1OI ioii110l1oi7 = (iOiI110l1OI) iiool010Oi.I0001Ioi1lo;
/* 935 */                               iOOiO1IoOo iooio1iooo2 = new iOOiO1IoOo(ioii110l1oi7, 0, -1, -1);
/* 938 */                               arrayDeque.push(iooio1iooo2);
/* 945 */                               while (!arrayDeque.isEmpty()) {
/* 951 */                                   iOOiO1IoOo iooio1iooo3 = (iOOiO1IoOo) arrayDeque.pop();
/* 969 */                                   for (iOiI110l1OI ioii110l1oi8 : iooio1iooo3.I0000O.I0000O.values()) {
/* 977 */                                       int i55 = iooio1iooo3.I00000oOI;
/* 979 */                                       int i56 = iooio1iooo3.I0000Il00O;
/* 981 */                                       int i57 = ioii110l1oi8.I00000oIO;
/* 983 */                                       int i58 = ioii110l1oi8.I00000oOI;
/* 989 */                                       if (iiool010Oi.I000II(i55, i56, i57, i58)) {
/* 1026 */                                          ioii110l1oi = ioii110l1oi7;
                                                } else {
/* 997 */                                           if (ioii110l1oi8.I0000O.isEmpty()) {
/* 999 */                                               int i59 = ioii110l1oi8.I00000oIO;
/* 1003 */                                              ioii110l1oi = ioii110l1oi7;
/* 1011 */                                              if (iiool010Oi.I000II(i55, i56, i59, (i59 + i56) - i55)) {
                                                        }
/* 1041 */                                              if (iooio1iooo2.I00000oIO < iooio1iooo.I00000oIO) {
/* 1043 */                                                  iooio1iooo2 = iooio1iooo;
                                                        }
/* 1044 */                                              arrayDeque.push(iooio1iooo);
/* 1047 */                                              ioii110l1oi7 = ioii110l1oi;
                                                    } else {
/* 1015 */                                              ioii110l1oi = ioii110l1oi7;
                                                    }
/* 1022 */                                          iooio1iooo = new iOOiO1IoOo(ioii110l1oi8, 1, ioii110l1oi8.I00000oIO, i58);
/* 1041 */                                          if (iooio1iooo2.I00000oIO < iooio1iooo.I00000oIO) {
                                                    }
/* 1044 */                                          arrayDeque.push(iooio1iooo);
/* 1047 */                                          ioii110l1oi7 = ioii110l1oi;
                                                }
/* 1034 */                                      iooio1iooo = new iOOiO1IoOo(ioii110l1oi8, iooio1iooo3.I00000oIO + 1, i55, i56);
/* 1041 */                                      if (iooio1iooo2.I00000oIO < iooio1iooo.I00000oIO) {
                                                }
/* 1044 */                                      arrayDeque.push(iooio1iooo);
/* 1047 */                                      ioii110l1oi7 = ioii110l1oi;
                                            }
                                        }
/* 1050 */                              iOiI110l1OI ioii110l1oi9 = ioii110l1oi7;
/* 1055 */                              int[] iArr3 = (int[]) iiool010Oi.I0000oI00;
/* 1064 */                              int iMin = Math.min(iArr3.length, iooio1iooo2.I0000Il00O + 1);
/* 1068 */                              iOiI110l1OI ioii110l1oi10 = ioii110l1oi9;
/* 1070 */                              int i60 = 0;
                                        loop10: while (true) {
/* 1071 */                                  i5 = iooio1iooo2.I00000oOI;
/* 1073 */                                  i6 = iMin - i5;
/* 1090 */                                  ioii110l1oi10 = (iOiI110l1OI) ioii110l1oi10.I0000O.get(Integer.valueOf(iArr3[(i60 % i6) + i5]));
/* 1092 */                                  if (ioii110l1oi10 == null) {
                                                break;
                                            }
/* 1103 */                                  for (int i61 = ioii110l1oi10.I00000oIO; i61 < ioii110l1oi10.I00000oOI + 1 && i61 < iArr3.length; i61++) {
/* 1115 */                                      if (iArr3[(i60 % i6) + i5] != iArr3[i61]) {
                                                    break loop10;
                                                }
/* 1117 */                                      i60++;
                                            }
                                        }
/* 1124 */                              int i62 = i60 / i6;
/* 1126 */                              iioIO1i = new IioIO1i(2);
/* 1129 */                              iioIO1i.I00000oOI = i5;
/* 1131 */                              iioIO1i.I0000Il00O = iMin;
/* 1133 */                              iioIO1i.I0000O = i62;
/* 1135 */                              VarHandle.storeStoreFence();
/* 1139 */                              if (i6 * i62 < i41) {
                                        }
/* 1143 */                              strConcat = "";
/* 1145 */                              if (iioIO1i != null) {
                                        }
                                        io0oiil0l0 = r18;
/* 1240 */                              if (!strConcat.isEmpty()) {
                                        }
                                    }
                                }
/* 149 */                       r0 = null;
/* 150 */                       r18 = 0;
/* 152 */                       i4 = 1;
/* 612 */                       int i402 = oOoli1l.I00iio;
/* 614 */                       if (r0 == null) {
                                }
                            }
                        }
                    } else {
/* 1318 */              i2 = 14;
/* 1320 */              io0oiil0l0 = null;
                    }
/* 1322 */          char[] cArr = new char[i8];
/* 1326 */          for (iO0Oiil0l0 io0oiil0l04 = this; io0oiil0l04 != null; io0oiil0l04 = io0oiil0l0) {
                        i8 -= 14;
/* 1333 */              "<missing root>".getChars(0, i2, cArr, i8);
                    }
/* 1341 */          return new String(cArr);
                }
            }

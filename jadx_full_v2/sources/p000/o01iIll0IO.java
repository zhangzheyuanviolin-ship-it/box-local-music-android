            package p000;

            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class o01iIll0IO implements o0OllIoI {
                public o01iIll0IO I00iOIl = null;
                public UUID I00iiI;
                public String I00iiO;
                public String I00iio;
                public Thread I00ilI0I1;

                public o01iIll0IO(String str, UUID uuid, String str2, o0Ol1IO o0ol1io) {
/* 4 */             this.I00iio = str;
/* 9 */             this.I00iiI = uuid;
/* 11 */            this.I00iiO = str2;
/* 13 */            o0ol1io.getClass();
/* 20 */            this.I00ilI0I1 = Thread.currentThread();
                }

                public static String I00000oIO(UUID uuid) {
/* 19 */            return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
                }

                @Override
                public final void close() {
/* 1 */             String str = this.I00iio;
/* 3 */             o0Ol1IO o0ol1ioI0000Il00O = o0IOOIili01o.I0000Il00O();
/* 7 */             o0OllIoI o0ollioi = o0ol1ioI0000Il00O.I00000oOI;
/* 9 */             if (o0ollioi == null) {
/* 110 */               throw new IOIoIlIlO(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."), 11);
                    }
/* 11 */            if (this == o0ollioi) {
/* 17 */                o0IOOIili01o.I00000oOI(o0ol1ioI0000Il00O, ((o01iIll0IO) o0ollioi).I00iOIl);
/* 21 */                this.I00ilI0I1 = null;
/* 23 */                return;
                    }
/* 26 */            String str2 = ((o01iIll0IO) o0ollioi).I00iio;
/* 53 */            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length() + 1);
/* 60 */            IIl001iO0Io.I001lIiIIo1O(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
/* 65 */            sb.append(".");
/* 77 */            throw new IOIoIlIlO(sb.toString(), 12);
                }

                /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
                
                    r4 = r4.I0000O;
                    r10 = java.lang.Integer.valueOf(r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
                
                    if (r4.containsKey(r10) != false) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
                
                    ((p000.o0Oi1I) r1.I000II).I0000O.put(r10, new p000.o0Oi1I(r8, 1073741824));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
                
                    if (r15 == null) goto L130;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
                
                    r15.I0000Il00O = (p000.o0Oi1I) r1.I000II;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
                
                    if (r15 == null) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
                
                    r15.I0000Il00O = (p000.o0Oi1I) r1.I000II;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
                
                    r1.I00000oOI = r8;
                    r1.I0000Il00O++;
                    r1.I0000Il00O();
                 */
                /* JADX WARN: Removed duplicated region for block: B:109:0x02f6 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:137:0x022c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x022b  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() {
                    int i;
                    int i2;
                    IioIO1i iioIO1i;
                    o0Oi1I o0oi1i;
                    o0OOloIlol o0ooloilol;
                    int i3;
                    String strConcat;
/* 1 */             AtomicReference atomicReference = o0IOOIili01o.I00000oIO;
/* 4 */             o01iIll0IO o01iill0io = this;
/* 6 */             int i4 = 0;
/* 7 */             int length = 0;
/* 8 */             while (o01iill0io != null) {
/* 10 */                i4++;
/* 18 */                length += o01iill0io.I00iio.length();
/* 19 */                o01iill0io = o01iill0io.I00iOIl;
/* 21 */                if (o01iill0io != null) {
/* 23 */                    length += 4;
                        }
                    }
/* 31 */            if (i4 > 250) {
/* 35 */                String[] strArr = new String[i4];
/* 37 */                o01iIll0IO o01iill0io2 = this;
/* 39 */                for (int i5 = i4 - 1; i5 >= 0; i5--) {
/* 43 */                    strArr[i5] = o01iill0io2.I00iio;
/* 45 */                    o01iill0io2 = o01iill0io2.I00iOIl;
                        }
/* 53 */                I00Ol00 i00Ol00 = new I00Ol00(4, 7);
/* 56 */                int i6 = 1;
/* 83 */                OoiOOoOlo it = (i4 != 0 ? i4 != 1 ? Ioio0O.I000o00OoI0I(i4, (Object[]) strArr.clone()) : new Ol0i0ill1l(strArr[0]) : OOoliIo1ol.I00l0OO0IO).iterator();
/* 87 */                int i7 = 0;
/* 92 */                while (it.hasNext()) {
/* 104 */                   i00Ol00.I0010I0i(it.next(), Integer.valueOf(i7));
/* 98 */                    i7++;
                        }
/* 109 */               OOoli1l oOoli1lI0000Il00O = i00Ol00.I0000Il00O(true);
/* 113 */               int i8 = oOoli1lI0000Il00O.I00iio;
/* 115 */               int i9 = i4 >> 2;
/* 117 */               if (i8 > i9) {
/* 119 */                   iioIO1i = null;
/* 661 */                   strConcat = "";
/* 663 */                   if (iioIO1i != null) {
/* 666 */                       int i10 = iioIO1i.I00000oOI;
/* 682 */                       String strConcat2 = i10 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i10))).concat(" -> ") : "";
/* 688 */                       int i11 = iioIO1i.I0000Il00O;
/* 690 */                       int i12 = iioIO1i.I0000O;
/* 695 */                       int i13 = ((i11 - i10) * i12) + i10;
/* 710 */                       strConcat = i13 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i13, i4)))) : "";
/* 718 */                       String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i10, i11));
/* 722 */                       Locale locale = Locale.US;
/* 748 */                       strConcat = strConcat2 + "{" + strJoin + "}x" + i12 + strConcat;
                            }
/* 756 */                   if (!strConcat.isEmpty()) {
/* 759 */                       return strConcat;
                            }
                        } else {
/* 122 */                   int i14 = i4 + 1;
/* 124 */                   int[] iArr = new int[i14];
/* 127 */                   for (int i15 = 0; i15 < i4; i15++) {
/* 141 */                       iArr[i15] = ((Integer) oOoli1lI0000Il00O.get(strArr[i15])).intValue();
                            }
/* 146 */                   iArr[i4] = i8;
/* 151 */                   Iiool010Oi iiool010Oi = new Iiool010Oi(2);
/* 154 */                   iiool010Oi.I0000oI00 = iArr;
/* 158 */                   int i16 = -1;
/* 159 */                   o0Oi1I o0oi1i2 = new o0Oi1I(-1, -1);
/* 162 */                   iiool010Oi.I0001Ioi1lo = o0oi1i2;
/* 164 */                   iiool010Oi.I000II = o0oi1i2;
/* 166 */                   VarHandle.storeStoreFence();
/* 169 */                   int i17 = 0;
/* 170 */                   while (i17 < i14) {
                                iiool010Oi.I0000O += i6;
/* 179 */                       int[] iArr2 = (int[]) iiool010Oi.I0000oI00;
/* 181 */                       int i18 = iArr2[i17];
                                while (true) {
/* 183 */                           o0Oi1I o0oi1i3 = null;
                                    while (true) {
/* 186 */                               if (iiool010Oi.I0000O <= 0) {
/* 414 */                                   i3 = i6;
                                            break;
                                        }
/* 188 */                               int i19 = iiool010Oi.I0000Il00O;
/* 192 */                               o0Oi1I o0oi1i4 = (o0Oi1I) iiool010Oi.I000II;
/* 194 */                               i3 = i6;
/* 198 */                               if (i19 == 0) {
                                            break;
                                        }
/* 285 */                               int i20 = ((o0Oi1I) o0oi1i4.I0000O.get(Integer.valueOf(iArr2[iiool010Oi.I00000oOI]))).I00000oIO;
/* 287 */                               int i21 = iiool010Oi.I0000Il00O;
/* 292 */                               if (iArr2[i20 + i21] == i18) {
/* 294 */                                   if (o0oi1i3 != null) {
/* 300 */                                       o0oi1i3.I0000Il00O = (o0Oi1I) iiool010Oi.I000II;
                                            }
/* 304 */                                   iiool010Oi.I0000Il00O = i21 + 1;
/* 306 */                                   iiool010Oi.I0000Il00O();
                                        } else {
/* 328 */                                   o0Oi1I o0oi1i5 = (o0Oi1I) ((o0Oi1I) iiool010Oi.I000II).I0000O.get(Integer.valueOf(iArr2[iiool010Oi.I00000oOI]));
/* 334 */                                   int i22 = i16;
/* 341 */                                   o0Oi1I o0oi1i6 = new o0Oi1I(o0oi1i5.I00000oIO, (iiool010Oi.I0000Il00O + r0) - 1);
/* 358 */                                   ((o0Oi1I) iiool010Oi.I000II).I0000O.put(Integer.valueOf(iArr2[iiool010Oi.I00000oOI]), o0oi1i6);
/* 363 */                                   int i23 = o0oi1i6.I00000oOI + 1;
/* 367 */                                   Integer numValueOf = Integer.valueOf(iArr2[i23]);
/* 371 */                                   HashMap map = o0oi1i6.I0000O;
/* 373 */                                   map.put(numValueOf, o0oi1i5);
/* 376 */                                   o0oi1i5.I00000oIO = i23;
/* 378 */                                   if (o0oi1i3 != null) {
/* 380 */                                       o0oi1i3.I0000Il00O = o0oi1i6;
                                            }
/* 393 */                                   map.put(Integer.valueOf(i18), new o0Oi1I(i17, 1073741824));
                                            iiool010Oi.I0000O--;
/* 402 */                                   iiool010Oi.I0000O();
/* 405 */                                   o0oi1i3 = o0oi1i6;
/* 406 */                                   i6 = i3;
/* 408 */                                   i16 = i22;
                                        }
                                    }
                                    iiool010Oi.I0000O += i16;
/* 239 */                           iiool010Oi.I0000O();
/* 242 */                           i6 = i3;
                                }
/* 418 */                       i17++;
/* 420 */                       i6 = i3;
/* 422 */                       i16 = i16;
                            }
/* 428 */                   int i24 = i6;
/* 430 */                   int i25 = i16;
/* 434 */                   ArrayDeque arrayDeque = new ArrayDeque();
/* 441 */                   o0Oi1I o0oi1i7 = (o0Oi1I) iiool010Oi.I0001Ioi1lo;
/* 446 */                   o0OOloIlol o0ooloilol2 = new o0OOloIlol(o0oi1i7, 0, i25, i25);
/* 449 */                   arrayDeque.push(o0ooloilol2);
/* 456 */                   while (!arrayDeque.isEmpty()) {
/* 462 */                       o0OOloIlol o0ooloilol3 = (o0OOloIlol) arrayDeque.pop();
/* 480 */                       for (o0Oi1I o0oi1i8 : o0ooloilol3.I0000O.I0000O.values()) {
/* 488 */                           int i26 = o0ooloilol3.I00000oOI;
/* 490 */                           int i27 = o0ooloilol3.I0000Il00O;
/* 492 */                           int i28 = o0oi1i8.I00000oIO;
/* 494 */                           int i29 = o0oi1i8.I00000oOI;
/* 500 */                           if (iiool010Oi.I000II(i26, i27, i28, i29)) {
/* 539 */                               o0oi1i = o0oi1i7;
                                    } else {
/* 508 */                               if (o0oi1i8.I0000O.isEmpty()) {
/* 510 */                                   int i30 = o0oi1i8.I00000oIO;
/* 514 */                                   o0oi1i = o0oi1i7;
/* 522 */                                   if (iiool010Oi.I000II(i26, i27, i30, (i30 + i27) - i26)) {
                                            }
/* 554 */                                   if (o0ooloilol2.I00000oIO < o0ooloilol.I00000oIO) {
/* 556 */                                       o0ooloilol2 = o0ooloilol;
                                            }
/* 557 */                                   arrayDeque.push(o0ooloilol);
/* 560 */                                   o0oi1i7 = o0oi1i;
/* 562 */                                   i24 = 1;
                                        } else {
/* 527 */                                   o0oi1i = o0oi1i7;
                                        }
/* 535 */                               o0ooloilol = new o0OOloIlol(o0oi1i8, i24, o0oi1i8.I00000oIO, i29);
/* 554 */                               if (o0ooloilol2.I00000oIO < o0ooloilol.I00000oIO) {
                                        }
/* 557 */                               arrayDeque.push(o0ooloilol);
/* 560 */                               o0oi1i7 = o0oi1i;
/* 562 */                               i24 = 1;
                                    }
/* 547 */                           o0ooloilol = new o0OOloIlol(o0oi1i8, o0ooloilol3.I00000oIO + i24, i26, i27);
/* 554 */                           if (o0ooloilol2.I00000oIO < o0ooloilol.I00000oIO) {
                                    }
/* 557 */                           arrayDeque.push(o0ooloilol);
/* 560 */                           o0oi1i7 = o0oi1i;
/* 562 */                           i24 = 1;
                                }
/* 565 */                       i24 = 1;
                            }
/* 572 */                   int[] iArr3 = (int[]) iiool010Oi.I0000oI00;
/* 581 */                   int iMin = Math.min(iArr3.length, o0ooloilol2.I0000Il00O + 1);
/* 585 */                   o0Oi1I o0oi1i9 = o0oi1i7;
/* 587 */                   int i31 = 0;
                            loop9: while (true) {
/* 588 */                       i = o0ooloilol2.I00000oOI;
/* 590 */                       i2 = iMin - i;
/* 607 */                       o0oi1i9 = (o0Oi1I) o0oi1i9.I0000O.get(Integer.valueOf(iArr3[(i31 % i2) + i]));
/* 609 */                       if (o0oi1i9 == null) {
                                    break;
                                }
/* 620 */                       for (int i32 = o0oi1i9.I00000oIO; i32 < o0oi1i9.I00000oOI + 1 && i32 < iArr3.length; i32++) {
/* 632 */                           if (iArr3[(i31 % i2) + i] != iArr3[i32]) {
                                        break loop9;
                                    }
/* 634 */                           i31++;
                                }
                            }
/* 641 */                   int i33 = i31 / i2;
/* 643 */                   IioIO1i iioIO1i2 = new IioIO1i(3);
/* 646 */                   iioIO1i2.I00000oOI = i;
/* 648 */                   iioIO1i2.I0000Il00O = iMin;
/* 650 */                   iioIO1i2.I0000O = i33;
/* 652 */                   VarHandle.storeStoreFence();
/* 656 */                   if (i2 * i33 >= i9) {
/* 660 */                       iioIO1i = iioIO1i2;
                            }
/* 661 */                   strConcat = "";
/* 663 */                   if (iioIO1i != null) {
                            }
/* 756 */                   if (!strConcat.isEmpty()) {
                            }
                        }
                    }
/* 760 */           char[] cArr = new char[length];
/* 762 */           o01iIll0IO o01iill0io3 = this;
/* 764 */           while (o01iill0io3 != null) {
/* 766 */               String str = o01iill0io3.I00iio;
/* 772 */               length -= str.length();
/* 778 */               str.getChars(0, str.length(), cArr, length);
/* 781 */               o01iill0io3 = o01iill0io3.I00iOIl;
/* 783 */               if (o01iill0io3 != null) {
                            length -= 4;
/* 788 */                   " -> ".getChars(0, 4, cArr, length);
                        }
                    }
/* 794 */           return new String(cArr);
                }
            }

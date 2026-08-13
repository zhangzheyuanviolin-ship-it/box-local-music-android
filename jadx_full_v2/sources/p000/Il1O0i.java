            package p000;

            import java.io.FilterOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
/* 877 */   public final class Il1O0i extends FilterOutputStream {
                public static final byte[] I00io1l = "Exif\u0000\u0000".getBytes(Il1I11oilOo.I0000O);
                public Il1IO1oOioO0 I00iOIl;
                public byte[] I00iiI;
                public ByteBuffer I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;

                /* JADX WARN: Code restructure failed: missing block: B:127:0x0366, code lost:
                
                    if (r4 <= 0) goto L162;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x0368, code lost:
                
                    ((java.io.FilterOutputStream) r17).out.write(r18, r3, r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x036d, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
                
                    return;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void write(byte[] bArr, int i, int i2) throws IOException {
                    int i3;
/* 5 */             ByteBuffer byteBuffer = this.I00iiO;
/* 7 */             int i4 = i;
/* 9 */             int i5 = i2;
                    while (true) {
/* 11 */                int i6 = this.I00ilI0I1;
/* 14 */                if ((i6 <= 0 && this.I00ilO0 <= 0 && this.I00iio == 2) || i5 <= 0) {
                            break;
                        }
/* 26 */                if (i6 > 0) {
/* 28 */                    int iMin = Math.min(i5, i6);
/* 32 */                    i5 -= iMin;
                            this.I00ilI0I1 -= iMin;
/* 38 */                    i4 += iMin;
                        }
/* 39 */                int i7 = this.I00ilO0;
/* 41 */                if (i7 > 0) {
/* 43 */                    int iMin2 = Math.min(i5, i7);
/* 49 */                    ((FilterOutputStream) this).out.write(bArr, i4, iMin2);
/* 52 */                    i5 -= iMin2;
                            this.I00ilO0 -= iMin2;
/* 58 */                    i4 += iMin2;
                        }
/* 59 */                if (i5 == 0) {
/* 1638 */                  return;
                        }
/* 63 */                int i8 = this.I00iio;
/* 68 */                int i9 = 0;
/* 69 */                int i10 = 4;
/* 70 */                if (i8 == 0) {
/* 207 */                   int iMin3 = Math.min(i5, 2 - byteBuffer.position());
/* 211 */                   byteBuffer.put(bArr, i4, iMin3);
/* 214 */                   i4 += iMin3;
/* 215 */                   i5 -= iMin3;
/* 220 */                   if (byteBuffer.position() < 2) {
/* 1638 */                      return;
                            }
/* 224 */                   byteBuffer.rewind();
/* 233 */                   if (byteBuffer.getShort() != -40) {
/* 867 */                       IioIoO10iOiI.I000OOo1O("Not a valid jpeg image, cannot write exif");
/* 870 */                       return;
                            }
/* 241 */                   ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
/* 244 */                   this.I00iio = 1;
/* 246 */                   byteBuffer.rewind();
/* 251 */                   OutputStream outputStream = ((FilterOutputStream) this).out;
/* 253 */                   ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
/* 255 */                   IIIoiI01 iIIoiI01 = new IIIoiI01(outputStream);
/* 258 */                   iIIoiI01.I00iOIl = outputStream;
/* 260 */                   iIIoiI01.I00iiI = byteOrder;
/* 262 */                   VarHandle.storeStoreFence();
/* 265 */                   iIIoiI01.I0000Il00O((short) -31);
/* 268 */                   Il1IO1oOioO0 il1IO1oOioO0 = this.I00iOIl;
/* 270 */                   int[] iArr = new int[4];
/* 272 */                   int[] iArr2 = new int[4];
/* 274 */                   Il1O11[] il1O11Arr = Il1IO1oOioO0.I0000Il00O;
/* 276 */                   int i11 = 0;
/* 277 */                   while (i11 < i10) {
/* 279 */                       Il1O11 il1O11 = il1O11Arr[i11];
/* 281 */                       int i12 = i9;
                                while (true) {
/* 282 */                           Il1O11[] il1O11Arr2 = Il1IO1oOioO0.I0000Il00O;
/* 284 */                           if (i12 < i10) {
/* 292 */                               il1IO1oOioO0.I00000oIO(i12).remove(il1O11.I00000oOI);
/* 295 */                               i12++;
/* 298 */                               i10 = 4;
                                    }
                                }
/* 300 */                       i11++;
/* 303 */                       i9 = 0;
/* 304 */                       i10 = 4;
                            }
/* 306 */                   Map mapI00000oIO = il1IO1oOioO0.I00000oIO(1);
/* 310 */                   ByteOrder byteOrder2 = il1IO1oOioO0.I00000oOI;
/* 318 */                   if (mapI00000oIO.isEmpty()) {
/* 340 */                       i3 = 0;
                            } else {
/* 320 */                       i3 = 0;
/* 335 */                       il1IO1oOioO0.I00000oIO(0).put(Il1IO1oOioO0.I0000Il00O[1].I00000oOI, Il1I11oilOo.I00000oIO(0L, byteOrder2));
                            }
/* 350 */                   if (!il1IO1oOioO0.I00000oIO(2).isEmpty()) {
/* 366 */                       il1IO1oOioO0.I00000oIO(i3).put(Il1IO1oOioO0.I0000Il00O[2].I00000oOI, Il1I11oilOo.I00000oIO(0L, byteOrder2));
                            }
/* 378 */                   if (!il1IO1oOioO0.I00000oIO(3).isEmpty()) {
/* 395 */                       il1IO1oOioO0.I00000oIO(1).put(Il1IO1oOioO0.I0000Il00O[3].I00000oOI, Il1I11oilOo.I00000oIO(0L, byteOrder2));
                            }
/* 398 */                   int i13 = 0;
                            while (true) {
/* 399 */                       Il1O11[] il1O11Arr3 = Il1IO1oOioO0.I0000Il00O;
/* 402 */                       if (i13 >= 4) {
                                    break;
                                }
/* 412 */                       Iterator it = il1IO1oOioO0.I00000oIO(i13).entrySet().iterator();
/* 416 */                       int i14 = 0;
/* 421 */                       while (it.hasNext()) {
/* 433 */                           Il1I11oilOo il1I11oilOo = (Il1I11oilOo) ((Map.Entry) it.next()).getValue();
/* 443 */                           int i15 = Il1I11oilOo.I0001Ioi1lo[il1I11oilOo.I00000oIO] * il1I11oilOo.I00000oOI;
/* 445 */                           if (i15 > 4) {
/* 447 */                               i14 += i15;
                                    }
                                }
/* 453 */                       iArr2[i13] = iArr2[i13] + i14;
/* 455 */                       i13++;
                            }
/* 461 */                   int size = 8;
/* 462 */                   int i16 = 0;
                            while (true) {
/* 463 */                       Il1O11[] il1O11Arr4 = Il1IO1oOioO0.I0000Il00O;
/* 466 */                       if (i16 >= 4) {
                                    break;
                                }
/* 476 */                       if (!il1IO1oOioO0.I00000oIO(i16).isEmpty()) {
/* 478 */                           iArr[i16] = size;
/* 495 */                           size += (il1IO1oOioO0.I00000oIO(i16).size() * 12) + 6 + iArr2[i16];
                                }
/* 496 */                       i16++;
                            }
/* 499 */                   int i17 = size + 8;
/* 510 */                   if (!il1IO1oOioO0.I00000oIO(1).isEmpty()) {
/* 530 */                       il1IO1oOioO0.I00000oIO(0).put(Il1IO1oOioO0.I0000Il00O[1].I00000oOI, Il1I11oilOo.I00000oIO(iArr[1], byteOrder2));
                            }
/* 542 */                   if (!il1IO1oOioO0.I00000oIO(2).isEmpty()) {
/* 562 */                       il1IO1oOioO0.I00000oIO(0).put(Il1IO1oOioO0.I0000Il00O[2].I00000oOI, Il1I11oilOo.I00000oIO(iArr[2], byteOrder2));
                            }
/* 574 */                   if (!il1IO1oOioO0.I00000oIO(3).isEmpty()) {
/* 594 */                       il1IO1oOioO0.I00000oIO(1).put(Il1IO1oOioO0.I0000Il00O[3].I00000oOI, Il1I11oilOo.I00000oIO(iArr[3], byteOrder2));
                            }
/* 598 */                   iIIoiI01.I0000Il00O((short) i17);
/* 603 */                   iIIoiI01.write(I00io1l);
/* 615 */                   iIIoiI01.I0000Il00O(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
/* 618 */                   iIIoiI01.I00iiI = byteOrder2;
/* 622 */                   iIIoiI01.I0000Il00O((short) 42);
/* 625 */                   iIIoiI01.I00000oIO(8);
/* 628 */                   int i18 = 0;
                            while (true) {
/* 629 */                       Il1O11[] il1O11Arr5 = Il1IO1oOioO0.I0000Il00O;
/* 632 */                       if (i18 >= 4) {
                                    break;
                                }
/* 642 */                       if (!il1IO1oOioO0.I00000oIO(i18).isEmpty()) {
/* 653 */                           iIIoiI01.I0000Il00O((short) il1IO1oOioO0.I00000oIO(i18).size());
/* 672 */                           int size2 = (il1IO1oOioO0.I00000oIO(i18).size() * 12) + iArr[i18] + 2 + 4;
/* 689 */                           for (Map.Entry entry : il1IO1oOioO0.I00000oIO(i18).entrySet()) {
/* 713 */                               Il1O11 il1O112 = (Il1O11) ((HashMap) Il1IIOoI.I0001Ioi1lo.get(i18)).get(entry.getKey());
/* 740 */                               lII1OI11o1I.I0000O("Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.", il1O112);
/* 743 */                               int i19 = il1O112.I00000oIO;
/* 749 */                               Il1I11oilOo il1I11oilOo2 = (Il1I11oilOo) entry.getValue();
/* 751 */                               int[] iArr3 = Il1I11oilOo.I0001Ioi1lo;
/* 753 */                               int i20 = il1I11oilOo2.I00000oIO;
/* 755 */                               int i21 = il1I11oilOo2.I00000oOI;
/* 759 */                               int i22 = iArr3[i20] * i21;
/* 761 */                               iIIoiI01.I0000Il00O((short) i19);
/* 767 */                               iIIoiI01.I0000Il00O((short) il1I11oilOo2.I00000oIO);
/* 770 */                               iIIoiI01.I00000oIO(i21);
/* 774 */                               if (i22 > 4) {
/* 778 */                                   iIIoiI01.I00000oIO(size2);
/* 781 */                                   size2 += i22;
                                        } else {
/* 786 */                                   iIIoiI01.write(il1I11oilOo2.I0000Il00O);
/* 789 */                                   if (i22 < 4) {
/* 791 */                                       for (int i23 = 4; i22 < i23; i23 = 4) {
/* 796 */                                           iIIoiI01.I00iOIl.write(0);
/* 799 */                                           i22++;
                                                }
                                            }
                                        }
                                    }
/* 806 */                           iIIoiI01.I00000oIO(0);
/* 817 */                           Iterator it2 = il1IO1oOioO0.I00000oIO(i18).entrySet().iterator();
/* 825 */                           while (it2.hasNext()) {
/* 839 */                               byte[] bArr2 = ((Il1I11oilOo) ((Map.Entry) it2.next()).getValue()).I0000Il00O;
/* 843 */                               if (bArr2.length > 4) {
/* 847 */                                   iIIoiI01.write(bArr2, 0, bArr2.length);
                                        }
                                    }
                                }
/* 855 */                       i18++;
                            }
/* 861 */                   iIIoiI01.I00iiI = ByteOrder.BIG_ENDIAN;
                        } else if (i8 != 1) {
                            continue;
                        } else {
/* 81 */                    int iMin4 = Math.min(i5, 4 - byteBuffer.position());
/* 85 */                    byteBuffer.put(bArr, i4, iMin4);
/* 88 */                    i4 += iMin4;
/* 89 */                    i5 -= iMin4;
/* 94 */                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
/* 110 */                       ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
/* 113 */                       byteBuffer.rewind();
                            }
/* 120 */                   if (byteBuffer.position() < 4) {
/* 1638 */                      return;
                            }
/* 124 */                   byteBuffer.rewind();
/* 127 */                   short s = byteBuffer.getShort();
/* 134 */                   if (s == -31) {
/* 142 */                       this.I00ilI0I1 = (byteBuffer.getShort() & 65535) - 2;
/* 144 */                       this.I00iio = 2;
                            } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
/* 185 */                       ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
/* 194 */                       this.I00ilO0 = (byteBuffer.getShort() & 65535) - 2;
                            } else {
/* 173 */                       ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
/* 176 */                       this.I00iio = 2;
                            }
/* 196 */                   byteBuffer.rewind();
                        }
                    }
                }

                @Override
/* 878 */       public final void write(int i) throws IOException {
/* 879 */           byte[] bArr = this.I00iiI;
                    bArr[0] = (byte) (i & 255);
/* 880 */           write(bArr);
                }

                @Override
/* 880 */       public final void write(byte[] bArr) throws IOException {
/* 881 */           write(bArr, 0, bArr.length);
                }
            }

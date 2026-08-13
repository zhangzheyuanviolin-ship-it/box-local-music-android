            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.io.PushbackInputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteOrder;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.zip.DataFormatException;
            import java.util.zip.Inflater;
            
            public final class I001l0I00 extends IlIli001 {
                public static final int[] I00000oOI = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                public final int I00000oIO;

                public I001l0I00(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static void I0000O(ArrayList arrayList, long j, O1il1OO o1il1OO) throws IOException {
/* 7 */             if (j < 0) {
/* 57 */                o1il1OO.I00000oIO();
/* 215 */               throw new IOException("negative array index: " + j + " near offset " + o1il1OO.I00iiI);
                    }
/* 16 */            if (j < arrayList.size()) {
/* 18 */                return;
                    }
/* 25 */            StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "array index overflow: ", " >= ");
/* 33 */            sbI001iOo1i0O.append(arrayList.size());
/* 36 */            sbI001iOo1i0O.append(" near offset ");
/* 39 */            o1il1OO.I00000oIO();
/* 44 */            sbI001iOo1i0O.append(o1il1OO.I00iiI);
/* 54 */            throw new IOException(sbI001iOo1i0O.toString());
                }

                public static void I0000oI00(InputStream inputStream, OutputStream outputStream) throws IOException {
/* 3 */             byte[] bArr = new byte[Barcode.FORMAT_PDF417];
/* 5 */             inputStream.read();
/* 8 */             inputStream.read();
/* 11 */            int i = inputStream.read(bArr);
/* 15 */            if (i > 0) {
/* 20 */                Inflater inflater = new Inflater(true);
/* 24 */                inflater.setInput(bArr, 0, i);
/* 29 */                byte[] bArr2 = new byte[Barcode.FORMAT_UPC_E];
/* 31 */                boolean z = false;
                        while (true) {
                            try {
                                try {
/* 32 */                            int iInflate = inflater.inflate(bArr2);
/* 36 */                            if (iInflate == 0) {
/* 49 */                                if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                                            break;
                                        } else {
/* 68 */                                    inflater.setInput(bArr, 0, inputStream.read(bArr));
                                        }
                                    } else {
/* 38 */                                outputStream.write(bArr2, 0, iInflate);
/* 41 */                                z = true;
                                    }
                                } catch (DataFormatException e) {
/* 73 */                            if (!z) {
/* 86 */                                throw e;
                                    }
/* 79 */                            Log.w("PdfBox-Android", "FlateFilter: premature end of stream due to a DataFormatException");
                                }
                            } finally {
/* 87 */                        inflater.end();
                            }
                        }
                    }
/* 91 */            outputStream.flush();
                }

                /* JADX WARN: Code restructure failed: missing block: B:73:0x0187, code lost:
                
                    throw new java.lang.IllegalArgumentException();
                 */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x0293  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x029f  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x0296 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ii1i1il100 I00000oIO(InputStream inputStream, OutputStream outputStream, IIi0io1lIo iIi0io1lIo, int i) throws Throwable {
                    int i2;
                    int i3;
                    InputStream inputStream2;
                    int i4;
                    long j;
                    IIOIolil iIOIolil;
                    int i5;
                    int i6;
                    int i7;
                    String str;
/* 15 */            String str2 = "PdfBox-Android";
/* 17 */            I001iOo1i0O i001iOo1i0O = null;
/* 18 */            int i8 = -1;
/* 19 */            int i9 = 0;
/* 22 */            int i10 = 1;
                    switch (this.I00000oIO) {
                        case 0:
                            while (true) {
/* 724 */                       int i11 = inputStream.read();
/* 728 */                       int i12 = -1;
/* 729 */                       if (i11 != -1) {
                                    while (true) {
/* 731 */                               if (i11 == 0 || i11 == 9) {
/* 835 */                                   i2 = i12;
/* 843 */                                   i11 = inputStream.read();
/* 847 */                                   i12 = i2;
                                        } else if (i11 == 10) {
/* 831 */                                   i2 = i12;
/* 843 */                                   i11 = inputStream.read();
/* 847 */                                   i12 = i2;
                                        } else if (i11 == 12 || i11 == 13 || i11 == 32) {
/* 753 */                                   i2 = i12;
/* 843 */                                   i11 = inputStream.read();
/* 847 */                                   i12 = i2;
                                        } else if (i11 != i12 && i11 != 62) {
/* 762 */                                   int[] iArr = I00000oOI;
/* 770 */                                   if (iArr[i11] == i12) {
/* 772 */                                       StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Invalid hex, int: ", i11, " char: ");
/* 777 */                                       sbI00100o1O0lo.append((char) i11);
/* 784 */                                       Log.e("PdfBox-Android", sbI00100o1O0lo.toString());
                                            }
/* 789 */                                   i3 = iArr[i11] * 16;
/* 791 */                                   int i13 = inputStream.read();
/* 796 */                                   if (i13 != -1 && i13 != 62) {
/* 803 */                                       if (iArr[i13] == -1) {
/* 805 */                                           StringBuilder sbI00100o1O0lo2 = IlIi0I0.I00100o1O0lo("Invalid hex, int: ", i13, " char: ");
/* 810 */                                           sbI00100o1O0lo2.append((char) i13);
/* 817 */                                           Log.e("PdfBox-Android", sbI00100o1O0lo2.toString());
                                                }
/* 823 */                                       outputStream.write(i3 + iArr[i13]);
                                            }
                                        }
                                    }
                                }
                            }
/* 827 */                   outputStream.write(i3);
/* 849 */                   outputStream.flush();
/* 854 */                   return new Ii1i1il100(iIi0io1lIo);
                        case 1:
                            try {
/* 697 */                       I001iOo1i0O i001iOo1i0O2 = new I001iOo1i0O(inputStream);
                                try {
/* 700 */                           io0iolo.I0000Il00O(i001iOo1i0O2, outputStream);
/* 703 */                           outputStream.flush();
/* 706 */                           io0iolo.I00000oOI(i001iOo1i0O2);
/* 711 */                           return new Ii1i1il100(iIi0io1lIo);
                                } catch (Throwable th) {
/* 715 */                           th = th;
/* 716 */                           i001iOo1i0O = i001iOo1i0O2;
/* 719 */                           io0iolo.I00000oOI(i001iOo1i0O);
/* 722 */                           throw th;
                                }
                            } catch (Throwable th2) {
/* 718 */                       th = th2;
                            }
                        case 2:
/* 493 */                   IIOoi0ooOoO iIOoi0ooOoOI0000Il00O = IlIli001.I0000Il00O(iIi0io1lIo, i);
/* 501 */                   int iI00oooO = iIOoi0ooOoOI0000Il00O.I00oooO(IIi0I0I0o.I0110o, null, 1728);
/* 509 */                   int iI00oooO2 = iIOoi0ooOoOI0000Il00O.I00oooO(IIi0I0I0o.I0II1o0IOO, null, 0);
/* 517 */                   int iI00oooO3 = iIi0io1lIo.I00oooO(IIi0I0I0o.I01il1IlO1, IIi0I0I0o.I01ii1i, 0);
/* 521 */                   if (iI00oooO2 <= 0 || iI00oooO3 <= 0) {
/* 526 */                       iI00oooO3 = Math.max(iI00oooO2, iI00oooO3);
                            }
/* 532 */                   int iI00oooO4 = iIOoi0ooOoOI0000Il00O.I00oooO(IIi0I0I0o.I01ll0oooOoO, null, 0);
/* 538 */                   boolean zI00l0I0l0lO1 = iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I01Iol, false);
/* 545 */                   int i14 = ((iI00oooO + 7) / 8) * iI00oooO3;
/* 546 */                   byte[] bArr = new byte[i14];
/* 550 */                   if (iI00oooO4 == 0) {
/* 554 */                       byte[] bArr2 = new byte[20];
/* 556 */                       int i15 = inputStream.read(bArr2);
/* 562 */                       PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 20);
/* 566 */                       pushbackInputStream.unread(bArr2, 0, i15);
/* 569 */                       byte b = bArr2[0];
/* 571 */                       if (b == 0) {
/* 573 */                           byte b2 = bArr2[1];
/* 577 */                           if ((b2 >> 4) == 1 || b2 == 1) {
/* 582 */                               i7 = 3;
/* 622 */                               i4 = i7;
/* 624 */                               inputStream2 = pushbackInputStream;
                                    } else {
/* 592 */                               short s = (short) (((b << 8) + (bArr2[1] & 255)) >> 4);
/* 597 */                               for (int i16 = 12; i16 < i15 * 8; i16++) {
/* 611 */                                   s = (short) ((s << 1) + ((bArr2[i16 / 8] >> (7 - (i16 % 8))) & 1));
/* 614 */                                   if ((s & 4095) == 1) {
/* 582 */                                       i7 = 3;
/* 622 */                                       i4 = i7;
/* 624 */                                       inputStream2 = pushbackInputStream;
                                            }
                                        }
/* 621 */                               i7 = 2;
/* 622 */                               i4 = i7;
/* 624 */                               inputStream2 = pushbackInputStream;
                                    }
                                }
/* 645 */                       iIOIolil = new IIOIolil(inputStream2, iI00oooO, i4, j, zI00l0I0l0lO1);
/* 650 */                       i5 = 0;
/* 661 */                       do {
/* 653 */                           i6 = iIOIolil.read(bArr, i5, i14 - i5);
/* 658 */                           if (i6 > -1) {
/* 660 */                               i5 += i6;
                                    }
/* 670 */                           if (!iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I00oliIiO01i, false)) {
/* 673 */                               for (int i17 = 0; i17 < i14; i17++) {
/* 681 */                                   bArr[i17] = (byte) ((~bArr[i17]) & 255);
                                        }
                                    }
/* 686 */                           outputStream.write(bArr);
/* 691 */                           return new Ii1i1il100(iIi0io1lIo);
/* 661 */                       } while (i5 < i14);
/* 670 */                       if (!iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I00oliIiO01i, false)) {
                                }
/* 686 */                       outputStream.write(bArr);
/* 691 */                       return new Ii1i1il100(iIi0io1lIo);
                            }
/* 629 */                   if (iI00oooO4 > 0) {
/* 631 */                       inputStream2 = inputStream;
/* 633 */                       i4 = 3;
/* 635 */                       j = 1;
/* 645 */                       iIOIolil = new IIOIolil(inputStream2, iI00oooO, i4, j, zI00l0I0l0lO1);
/* 650 */                       i5 = 0;
/* 661 */                       do {
/* 653 */                           i6 = iIOIolil.read(bArr, i5, i14 - i5);
/* 658 */                           if (i6 > -1) {
                                    }
/* 670 */                           if (!iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I00oliIiO01i, false)) {
                                    }
/* 686 */                           outputStream.write(bArr);
/* 691 */                           return new Ii1i1il100(iIi0io1lIo);
/* 661 */                       } while (i5 < i14);
/* 670 */                       if (!iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I00oliIiO01i, false)) {
                                }
/* 686 */                       outputStream.write(bArr);
/* 691 */                       return new Ii1i1il100(iIi0io1lIo);
                            }
/* 638 */                   inputStream2 = inputStream;
/* 640 */                   i4 = 4;
/* 626 */                   j = 0;
/* 645 */                   iIOIolil = new IIOIolil(inputStream2, iI00oooO, i4, j, zI00l0I0l0lO1);
/* 650 */                   i5 = 0;
/* 661 */                   do {
/* 653 */                       i6 = iIOIolil.read(bArr, i5, i14 - i5);
/* 658 */                       if (i6 > -1) {
                                }
/* 670 */                       if (!iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I00oliIiO01i, false)) {
                                }
/* 686 */                       outputStream.write(bArr);
/* 691 */                       return new Ii1i1il100(iIi0io1lIo);
/* 661 */                   } while (i5 < i14);
/* 670 */                   if (!iIOoi0ooOoOI0000Il00O.I00l0I0l0lO1(IIi0I0I0o.I00oliIiO01i, false)) {
                            }
/* 686 */                   outputStream.write(bArr);
/* 691 */                   return new Ii1i1il100(iIi0io1lIo);
                        case 3:
/* 456 */                   IIi0I0I0o iIi0I0I0o = (IIi0I0I0o) iIi0io1lIo.I00oII(IIi0I0I0o.I0I0I1i);
/* 458 */                   if (iIi0I0I0o != null && !iIi0I0I0o.equals(IIi0I0I0o.I01io11il)) {
/* 473 */                       I000II.I00111O("Unsupported crypt filter ", iIi0I0I0o.I00iOIl);
/* 17 */                        return null;
                            }
/* 477 */                   io0iolo.I0000Il00O(inputStream, outputStream);
/* 480 */                   outputStream.flush();
/* 487 */                   return new Ii1i1il100(iIi0io1lIo);
                        case 4:
/* 441 */                   io0iolo.I0000Il00O(inputStream, outputStream);
/* 446 */                   return new Ii1i1il100(iIi0io1lIo);
                        case 5:
                            try {
/* 420 */                       I0000oI00(inputStream, lIIII0o.I00000oIO(outputStream, IlIli001.I0000Il00O(iIi0io1lIo, i)));
/* 425 */                       return new Ii1i1il100(iIi0io1lIo);
                            } catch (DataFormatException e) {
/* 432 */                       Log.e("PdfBox-Android", "FlateFilter: stop reading corrupt stream due to a DataFormatException");
/* 440 */                       throw new IOException(e);
                            }
                        case 6:
/* 82 */                    IIOoi0ooOoO iIOoi0ooOoOI0000Il00O2 = IlIli001.I0000Il00O(iIi0io1lIo, i);
/* 88 */                    int iI00oooO5 = iIOoi0ooOoOI0000Il00O2.I00oooO(IIi0I0I0o.I01IoO, null, 1);
/* 92 */                    if (iI00oooO5 != 0 && iI00oooO5 != 1) {
/* 96 */                        iI00oooO5 = 1;
                            }
/* 97 */                    OutputStream outputStreamI00000oIO = lIIII0o.I00000oIO(outputStream, iIOoi0ooOoOI0000Il00O2);
/* 103 */                   ArrayList arrayList = new ArrayList();
/* 108 */                   O1il1OO o1il1OO = new O1il1OO();
/* 113 */                   o1il1OO.I00iOIl = ByteOrder.BIG_ENDIAN;
/* 115 */                   o1il1OO.I00iiI = 0L;
/* 117 */                   o1il1OO.I00iiO = 0;
/* 119 */                   o1il1OO.I00iio = false;
/* 123 */                   o1il1OO.I00ilI0I1 = new byte[8];
/* 127 */                   Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(i10);
/* 135 */                   io1OIO1l0o.I00iiO = new ArrayList();
/* 137 */                   o1il1OO.I00io1l = io1OIO1l0o;
/* 139 */                   o1il1OO.I00ilO0 = inputStream;
/* 141 */                   VarHandle.storeStoreFence();
/* 146 */                   long j2 = -1;
/* 148 */                   int i18 = 9;
                            while (true) {
                                try {
/* 150 */                           o1il1OO.I00000oIO();
/* 153 */                           if (i18 < 0 || i18 > 64) {
                                        break;
                                    } else {
/* 159 */                               str = str2;
/* 161 */                               int i19 = i9;
/* 162 */                               long j3 = 0;
/* 164 */                               while (i19 < i18) {
/* 166 */                                   long j4 = j3 << 1;
                                            try {
/* 167 */                                       o1il1OO.I00000oIO();
/* 170 */                                       int i20 = o1il1OO.I00iiO;
/* 172 */                                       int i21 = i9;
/* 174 */                                       int i22 = o1il1OO.read();
/* 178 */                                       if (i22 == i8) {
/* 220 */                                           throw new EOFException();
                                                }
/* 181 */                                       int i23 = (i20 + 1) & 7;
/* 183 */                                       if (i23 != 0) {
/* 189 */                                           o1il1OO.I00000oIO();
/* 198 */                                           o1il1OO.I00000oOI(o1il1OO.I00iiI - 1);
/* 187 */                                           i22 >>= 8 - i23;
                                                }
/* 203 */                                       o1il1OO.I00iiO = i23;
/* 208 */                                       j3 = j4 | (i22 & 1);
/* 209 */                                       i19++;
/* 211 */                                       i9 = i21;
/* 213 */                                       i8 = -1;
                                            } catch (EOFException unused) {
/* 399 */                                       Log.w(str, "Premature EOF in LZW stream, EOD code missing");
/* 402 */                                       outputStreamI00000oIO.flush();
/* 407 */                                       return new Ii1i1il100(iIi0io1lIo);
                                            }
                                        }
/* 221 */                               int i24 = i9;
/* 227 */                               if (j3 != 257) {
/* 233 */                                   if (j3 == 256) {
/* 239 */                                       arrayList = new ArrayList(Barcode.FORMAT_AZTEC);
/* 246 */                                       for (int i25 = i24; i25 < 256; i25++) {
/* 251 */                                           byte[] bArr3 = new byte[1];
/* 253 */                                           bArr3[i24] = (byte) (i25 & 255);
/* 255 */                                           arrayList.add(bArr3);
                                                }
/* 261 */                                       arrayList.add(null);
/* 264 */                                       arrayList.add(null);
/* 267 */                                       j2 = -1;
/* 269 */                                       str2 = str;
/* 271 */                                       i9 = i24;
/* 273 */                                       i18 = 9;
                                            } else {
/* 284 */                                       if (j3 < arrayList.size()) {
/* 291 */                                           byte[] bArr4 = (byte[]) arrayList.get((int) j3);
/* 293 */                                           byte b3 = bArr4[i24];
/* 295 */                                           outputStreamI00000oIO.write(bArr4);
/* 300 */                                           if (j2 != -1) {
/* 302 */                                               I0000O(arrayList, j2, o1il1OO);
/* 310 */                                               byte[] bArr5 = (byte[]) arrayList.get((int) j2);
/* 314 */                                               byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 1);
/* 319 */                                               bArrCopyOf[bArr5.length] = b3;
/* 321 */                                               arrayList.add(bArrCopyOf);
                                                    }
                                                } else {
/* 325 */                                           I0000O(arrayList, j2, o1il1OO);
/* 333 */                                           byte[] bArr6 = (byte[]) arrayList.get((int) j2);
/* 337 */                                           byte[] bArrCopyOf2 = Arrays.copyOf(bArr6, bArr6.length + 1);
/* 344 */                                           bArrCopyOf2[bArr6.length] = bArr6[i24];
/* 346 */                                           outputStreamI00000oIO.write(bArrCopyOf2);
/* 349 */                                           arrayList.add(bArrCopyOf2);
                                                }
/* 352 */                                       int size = arrayList.size();
/* 377 */                                       i18 = size >= 2048 - iI00oooO5 ? 12 : size >= 1024 - iI00oooO5 ? 11 : size >= 512 - iI00oooO5 ? 10 : 9;
/* 379 */                                       j2 = j3;
/* 380 */                                       str2 = str;
/* 382 */                                       i9 = i24;
                                            }
/* 275 */                                   i8 = -1;
                                        }
                                    }
                                } catch (EOFException unused2) {
/* 393 */                           str = str2;
                                }
                            }
/* 402 */                   outputStreamI00000oIO.flush();
/* 407 */                   return new Ii1i1il100(iIi0io1lIo);
                        default:
/* 28 */                    byte[] bArr7 = new byte[Barcode.FORMAT_ITF];
                            while (true) {
/* 30 */                        int i26 = inputStream.read();
/* 34 */                        if (i26 != -1 && i26 != 128) {
/* 40 */                            if (i26 <= 127) {
/* 42 */                                int i27 = i26 + 1;
/* 44 */                                while (i27 > 0) {
/* 46 */                                    int i28 = inputStream.read(bArr7, 0, i27);
/* 50 */                                    if (i28 == -1) {
                                                break;
                                            }
/* 53 */                                    outputStream.write(bArr7, 0, i28);
/* 56 */                                    i27 -= i28;
                                        }
                                    } else {
/* 58 */                                int i29 = inputStream.read();
/* 62 */                                if (i29 != -1) {
/* 68 */                                    for (int i30 = 0; i30 < 257 - i26; i30++) {
/* 70 */                                        outputStream.write(i29);
                                            }
                                        }
                                    }
                                }
                            }
/* 78 */                    return new Ii1i1il100(iIi0io1lIo);
                    }
                }

                @Override
                public Ii1i1il100 I00000oOI(InputStream inputStream, OutputStream outputStream, IIi0io1lIo iIi0io1lIo, int i) throws IOException {
                    switch (this.I00000oIO) {
                        case 4:
/* 11 */                    io0iolo.I0000Il00O(inputStream, outputStream);
/* 16 */                    return new Ii1i1il100(iIi0io1lIo);
                        default:
/* 6 */                     return super.I00000oOI(inputStream, outputStream, iIi0io1lIo, i);
                    }
                }
            }

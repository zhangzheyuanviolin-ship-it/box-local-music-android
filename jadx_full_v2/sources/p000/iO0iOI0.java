            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.BitSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.TreeMap;
            
            public abstract class iO0iOI0 {
                public static final byte[] I00000oIO = {112, 114, 111, 0};
                public static final byte[] I00000oOI = {112, 114, 109, 0};

                public static byte[] I00000oIO(IiOoliOIo1[] iiOoliOIo1Arr, byte[] bArr) throws IOException {
/* 2 */             int i = 0;
/* 4 */             int length = 0;
/* 5 */             for (IiOoliOIo1 iiOoliOIo1 : iiOoliOIo1Arr) {
/* 45 */                length += ((((iiOoliOIo1.I000II * 2) + 7) & (-8)) / 8) + (iiOoliOIo1.I0000oI00 * 2) + I00000oOI(bArr, iiOoliOIo1.I00000oIO, iiOoliOIo1.I00000oOI).getBytes(StandardCharsets.UTF_8).length + 16 + iiOoliOIo1.I0001Ioi1lo;
                    }
/* 51 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
/* 60 */            if (Arrays.equals(bArr, iO0ii0001iio.I0000Il00O)) {
/* 62 */                int length2 = iiOoliOIo1Arr.length;
/* 63 */                while (i < length2) {
/* 65 */                    IiOoliOIo1 iiOoliOIo12 = iiOoliOIo1Arr[i];
/* 75 */                    I000iOII(byteArrayOutputStream, iiOoliOIo12, I00000oOI(bArr, iiOoliOIo12.I00000oIO, iiOoliOIo12.I00000oOI));
/* 78 */                    I000OiO(byteArrayOutputStream, iiOoliOIo12);
/* 81 */                    i++;
                        }
                    } else {
/* 86 */                for (IiOoliOIo1 iiOoliOIo13 : iiOoliOIo1Arr) {
/* 98 */                    I000iOII(byteArrayOutputStream, iiOoliOIo13, I00000oOI(bArr, iiOoliOIo13.I00000oIO, iiOoliOIo13.I00000oOI));
                        }
/* 104 */               int length3 = iiOoliOIo1Arr.length;
/* 105 */               while (i < length3) {
/* 109 */                   I000OiO(byteArrayOutputStream, iiOoliOIo1Arr[i]);
/* 112 */                   i++;
                        }
                    }
/* 119 */           if (byteArrayOutputStream.size() == length) {
/* 121 */               return byteArrayOutputStream.toByteArray();
                    }
/* 332 */           throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
                }

                public static String I00000oOI(byte[] bArr, String str, String str2) {
/* 1 */             byte[] bArr2 = iO0ii0001iio.I0000oI00;
/* 3 */             boolean zEquals = Arrays.equals(bArr, bArr2);
/* 7 */             byte[] bArr3 = iO0ii0001iio.I0000O;
/* 13 */            String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
/* 29 */            if (str.length() <= 0) {
/* 35 */                if ("!".equals(str3)) {
/* 37 */                    return str2.replace(":", "!");
                        }
/* 46 */                if (":".equals(str3)) {
/* 48 */                    return str2.replace("!", ":");
                        }
                    } else {
/* 59 */                if (str2.equals("classes.dex")) {
/* 61 */                    return str;
                        }
/* 66 */                if (str2.contains("!") || str2.contains(":")) {
/* 112 */                   if ("!".equals(str3)) {
/* 114 */                       return str2.replace(":", "!");
                            }
/* 123 */                   if (":".equals(str3)) {
/* 125 */                       return str2.replace("!", ":");
                            }
                        } else if (!str2.endsWith(".apk")) {
/* 103 */                   return IIl001iO0Io.I00100l0(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
                        }
                    }
/* 408 */           return str2;
                }

                public static int[] I0000Il00O(ByteArrayInputStream byteArrayInputStream, int i) {
/* 1 */             int[] iArr = new int[i];
/* 4 */             int iI0000O = 0;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                iI0000O += (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 14 */                iArr[i2] = iI0000O;
                    }
/* 37 */            return iArr;
                }

                public static IiOoliOIo1[] I0000O(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, IiOoliOIo1[] iiOoliOIo1Arr) throws IOException {
/* 1 */             byte[] bArr3 = iO0ii0001iio.I0001Ioi1lo;
/* 13 */            if (!Arrays.equals(bArr, bArr3)) {
/* 98 */                if (!Arrays.equals(bArr, iO0ii0001iio.I000II)) {
/* 153 */                   I000II.I001IO000("Unsupported meta version");
/* 7 */                     return null;
                        }
/* 105 */               int iI0000O = (int) ilI1oOi.I0000O(fileInputStream, 2);
/* 116 */               byte[] bArrI0000Il00O = ilI1oOi.I0000Il00O(fileInputStream, (int) ilI1oOi.I0000O(fileInputStream, 4), (int) ilI1oOi.I0000O(fileInputStream, 4));
/* 124 */               if (fileInputStream.read() > 0) {
/* 149 */                   I000II.I001IO000("Content found after the end of file");
/* 7 */                     return null;
                        }
/* 128 */               ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrI0000Il00O);
                        try {
/* 131 */                   IiOoliOIo1[] iiOoliOIo1ArrI0001Ioi1lo = I0001Ioi1lo(byteArrayInputStream, bArr2, iI0000O, iiOoliOIo1Arr);
/* 135 */                   byteArrayInputStream.close();
/* 138 */                   return iiOoliOIo1ArrI0001Ioi1lo;
                        } catch (Throwable th) {
                            try {
/* 140 */                       byteArrayInputStream.close();
                            } catch (Throwable th2) {
/* 145 */                       th.addSuppressed(th2);
                            }
/* 148 */                   throw th;
                        }
                    }
/* 21 */            if (Arrays.equals(iO0ii0001iio.I00000oIO, bArr2)) {
/* 88 */                I000II.I001IO000("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
/* 7 */                 return null;
                    }
/* 27 */            if (!Arrays.equals(bArr, bArr3)) {
/* 82 */                I000II.I001IO000("Unsupported meta version");
/* 7 */                 return null;
                    }
/* 34 */            int iI0000O2 = (int) ilI1oOi.I0000O(fileInputStream, 1);
/* 45 */            byte[] bArrI0000Il00O2 = ilI1oOi.I0000Il00O(fileInputStream, (int) ilI1oOi.I0000O(fileInputStream, 4), (int) ilI1oOi.I0000O(fileInputStream, 4));
/* 53 */            if (fileInputStream.read() > 0) {
/* 78 */                I000II.I001IO000("Content found after the end of file");
/* 7 */                 return null;
                    }
/* 57 */            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrI0000Il00O2);
                    try {
/* 60 */                IiOoliOIo1[] iiOoliOIo1ArrI0000oI00 = I0000oI00(byteArrayInputStream2, iI0000O2, iiOoliOIo1Arr);
/* 64 */                byteArrayInputStream2.close();
/* 67 */                return iiOoliOIo1ArrI0000oI00;
                    } catch (Throwable th3) {
                        try {
/* 69 */                    byteArrayInputStream2.close();
                        } catch (Throwable th4) {
/* 74 */                    th3.addSuppressed(th4);
                        }
/* 77 */                throw th3;
                    }
                }

                public static IiOoliOIo1[] I0000oI00(ByteArrayInputStream byteArrayInputStream, int i, IiOoliOIo1[] iiOoliOIo1Arr) {
/* 6 */             if (byteArrayInputStream.available() == 0) {
/* 8 */                 return new IiOoliOIo1[0];
                    }
/* 13 */            if (i != iiOoliOIo1Arr.length) {
/* 87 */                I000II.I001IO000("Mismatched number of dex files found in metadata");
/* 12 */                return null;
                    }
/* 15 */            String[] strArr = new String[i];
/* 17 */            int[] iArr = new int[i];
/* 20 */            for (int i2 = 0; i2 < i; i2++) {
/* 27 */                int iI0000O = (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 33 */                iArr[i2] = (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 46 */                strArr[i2] = new String(ilI1oOi.I00000oOI(byteArrayInputStream, iI0000O), StandardCharsets.UTF_8);
                    }
/* 51 */            for (int i3 = 0; i3 < i; i3++) {
/* 53 */                IiOoliOIo1 iiOoliOIo1 = iiOoliOIo1Arr[i3];
/* 63 */                if (!iiOoliOIo1.I00000oOI.equals(strArr[i3])) {
/* 80 */                    I000II.I001IO000("Order of dexfiles in metadata did not match baseline");
/* 12 */                    return null;
                        }
/* 65 */                int i4 = iArr[i3];
/* 67 */                iiOoliOIo1.I0000oI00 = i4;
/* 73 */                iiOoliOIo1.I000O01llI0 = I0000Il00O(byteArrayInputStream, i4);
                    }
/* 84 */            return iiOoliOIo1Arr;
                }

                public static IiOoliOIo1[] I0001Ioi1lo(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, IiOoliOIo1[] iiOoliOIo1Arr) throws IOException {
                    IiOoliOIo1 iiOoliOIo1;
/* 6 */             if (byteArrayInputStream.available() == 0) {
/* 8 */                 return new IiOoliOIo1[0];
                    }
/* 13 */            if (i != iiOoliOIo1Arr.length) {
/* 133 */               I000II.I001IO000("Mismatched number of dex files found in metadata");
/* 12 */                return null;
                    }
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 19 */                ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 35 */                String str = new String(ilI1oOi.I00000oOI(byteArrayInputStream, (int) ilI1oOi.I0000O(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
/* 39 */                long jI0000O = ilI1oOi.I0000O(byteArrayInputStream, 4);
/* 47 */                int iI0000O = (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 49 */                if (iiOoliOIo1Arr.length > 0) {
/* 55 */                    int iIndexOf = str.indexOf("!");
/* 59 */                    if (iIndexOf < 0) {
/* 63 */                        iIndexOf = str.indexOf(":");
                            }
/* 76 */                    String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
/* 79 */                    for (int i3 = 0; i3 < iiOoliOIo1Arr.length; i3++) {
/* 89 */                        if (iiOoliOIo1Arr[i3].I00000oOI.equals(strSubstring)) {
/* 91 */                            iiOoliOIo1 = iiOoliOIo1Arr[i3];
                                    break;
                                }
                            }
/* 51 */                    iiOoliOIo1 = null;
                        } else {
/* 51 */                    iiOoliOIo1 = null;
                        }
/* 97 */                if (iiOoliOIo1 == null) {
/* 126 */                   I000II.I001IO000("Missing profile key: ".concat(str));
/* 12 */                    return null;
                        }
/* 99 */                iiOoliOIo1.I0000O = jI0000O;
/* 101 */               int[] iArrI0000Il00O = I0000Il00O(byteArrayInputStream, iI0000O);
/* 111 */               if (Arrays.equals(bArr, iO0ii0001iio.I0000oI00)) {
/* 113 */                   iiOoliOIo1.I0000oI00 = iI0000O;
/* 115 */                   iiOoliOIo1.I000O01llI0 = iArrI0000Il00O;
                        }
                    }
/* 130 */           return iiOoliOIo1Arr;
                }

                public static IiOoliOIo1[] I000II(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
/* 8 */             if (!Arrays.equals(bArr, iO0ii0001iio.I00000oOI)) {
/* 68 */                I000II.I001IO000("Unsupported version");
/* 7 */                 return null;
                    }
/* 15 */            int iI0000O = (int) ilI1oOi.I0000O(fileInputStream, 1);
/* 27 */            byte[] bArrI0000Il00O = ilI1oOi.I0000Il00O(fileInputStream, (int) ilI1oOi.I0000O(fileInputStream, 4), (int) ilI1oOi.I0000O(fileInputStream, 4));
/* 35 */            if (fileInputStream.read() > 0) {
/* 62 */                I000II.I001IO000("Content found after the end of file");
/* 7 */                 return null;
                    }
/* 39 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrI0000Il00O);
                    try {
/* 42 */                IiOoliOIo1[] iiOoliOIo1ArrI000O01llI0 = I000O01llI0(byteArrayInputStream, str, iI0000O);
/* 46 */                byteArrayInputStream.close();
/* 49 */                return iiOoliOIo1ArrI000O01llI0;
                    } catch (Throwable th) {
                        try {
/* 51 */                    byteArrayInputStream.close();
                        } catch (Throwable th2) {
/* 56 */                    th.addSuppressed(th2);
                        }
/* 59 */                throw th;
                    }
                }

                public static IiOoliOIo1[] I000O01llI0(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
/* 9 */             int i2 = 0;
/* 10 */            if (byteArrayInputStream.available() == 0) {
/* 12 */                return new IiOoliOIo1[0];
                    }
/* 15 */            IiOoliOIo1[] iiOoliOIo1Arr = new IiOoliOIo1[i];
/* 19 */            for (int i3 = 0; i3 < i; i3++) {
/* 25 */                int iI0000O = (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 30 */                int iI0000O2 = (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 32 */                long jI0000O = ilI1oOi.I0000O(byteArrayInputStream, 4);
/* 36 */                long jI0000O2 = ilI1oOi.I0000O(byteArrayInputStream, 4);
/* 40 */                long jI0000O3 = ilI1oOi.I0000O(byteArrayInputStream, 4);
/* 54 */                String str2 = new String(ilI1oOi.I00000oOI(byteArrayInputStream, iI0000O), StandardCharsets.UTF_8);
/* 57 */                int i4 = (int) jI0000O;
/* 58 */                int i5 = (int) jI0000O3;
/* 63 */                TreeMap treeMap = new TreeMap();
/* 66 */                IiOoliOIo1 iiOoliOIo1 = new IiOoliOIo1();
/* 71 */                iiOoliOIo1.I00000oIO = str;
/* 73 */                iiOoliOIo1.I00000oOI = str2;
/* 75 */                iiOoliOIo1.I0000Il00O = jI0000O2;
/* 79 */                iiOoliOIo1.I0000O = 0L;
/* 81 */                iiOoliOIo1.I0000oI00 = iI0000O2;
/* 83 */                iiOoliOIo1.I0001Ioi1lo = i4;
/* 85 */                iiOoliOIo1.I000II = i5;
/* 87 */                iiOoliOIo1.I000O01llI0 = new int[iI0000O2];
/* 89 */                iiOoliOIo1.I000OOo1O = treeMap;
/* 91 */                VarHandle.storeStoreFence();
/* 94 */                iiOoliOIo1Arr[i3] = iiOoliOIo1;
                    }
/* 99 */            int i6 = 0;
/* 100 */           while (i6 < i) {
/* 102 */               IiOoliOIo1 iiOoliOIo12 = iiOoliOIo1Arr[i6];
/* 104 */               int iAvailable = byteArrayInputStream.available();
/* 108 */               int i7 = iiOoliOIo12.I0001Ioi1lo;
/* 110 */               int i8 = iiOoliOIo12.I000II;
/* 112 */               TreeMap treeMap2 = iiOoliOIo12.I000OOo1O;
/* 114 */               int i9 = iAvailable - i7;
/* 115 */               int iI0000O3 = i2;
/* 121 */               while (byteArrayInputStream.available() > i9) {
/* 128 */                   iI0000O3 += (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 138 */                   treeMap2.put(Integer.valueOf(iI0000O3), 1);
/* 145 */                   int iI0000O4 = (int) ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 146 */                   while (iI0000O4 > 0) {
/* 148 */                       ilI1oOi.I0000O(byteArrayInputStream, 2);
/* 155 */                       int iI0000O5 = (int) ilI1oOi.I0000O(byteArrayInputStream, 1);
/* 157 */                       if (iI0000O5 != 6 && iI0000O5 != 7) {
/* 166 */                           while (iI0000O5 > 0) {
/* 168 */                               ilI1oOi.I0000O(byteArrayInputStream, 1);
/* 171 */                               int i10 = i2;
/* 172 */                               int i11 = i6;
/* 179 */                               for (int iI0000O6 = (int) ilI1oOi.I0000O(byteArrayInputStream, 1); iI0000O6 > 0; iI0000O6--) {
/* 181 */                                   ilI1oOi.I0000O(byteArrayInputStream, 2);
                                        }
                                        iI0000O5--;
/* 189 */                               i6 = i11;
/* 191 */                               i2 = i10;
                                    }
                                }
                                iI0000O4--;
/* 195 */                       i6 = i6;
/* 197 */                       i2 = i2;
                            }
                        }
/* 199 */               int i12 = i2;
/* 200 */               int i13 = i6;
/* 206 */               if (byteArrayInputStream.available() != i9) {
/* 297 */                   I000II.I001IO000("Read too much data during profile line parse");
/* 300 */                   return null;
                        }
/* 214 */               iiOoliOIo12.I000O01llI0 = I0000Il00O(byteArrayInputStream, iiOoliOIo12.I0000oI00);
/* 227 */               BitSet bitSetValueOf = BitSet.valueOf(ilI1oOi.I00000oOI(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
/* 232 */               for (int i14 = i12; i14 < i8; i14++) {
/* 242 */                   int i15 = bitSetValueOf.get(i14) ? 2 : i12;
/* 249 */                   if (bitSetValueOf.get(i14 + i8)) {
/* 251 */                       i15 |= 4;
                            }
/* 253 */                   if (i15 != 0) {
/* 263 */                       Integer numValueOf = (Integer) treeMap2.get(Integer.valueOf(i14));
/* 265 */                       if (numValueOf == null) {
/* 267 */                           numValueOf = Integer.valueOf(i12);
                                }
/* 284 */                       treeMap2.put(Integer.valueOf(i14), Integer.valueOf(i15 | numValueOf.intValue()));
                            }
                        }
/* 290 */               i6 = i13 + 1;
/* 292 */               i2 = i12;
                    }
/* 408 */           return iiOoliOIo1Arr;
                }

                /* JADX WARN: Finally extract failed */
                public static boolean I000OOo1O(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, IiOoliOIo1[] iiOoliOIo1Arr) throws IOException {
                    long j;
                    ArrayList arrayList;
                    int length;
/* 7 */             byte[] bArr2 = iO0ii0001iio.I00000oIO;
/* 14 */            int i = 0;
/* 16 */            if (!Arrays.equals(bArr, bArr2)) {
/* 614 */               byte[] bArr3 = iO0ii0001iio.I00000oOI;
/* 620 */               if (Arrays.equals(bArr, bArr3)) {
/* 622 */                   byte[] bArrI00000oIO = I00000oIO(iiOoliOIo1Arr, bArr3);
/* 629 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1Arr.length, 1);
/* 634 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, bArrI00000oIO.length, 4);
/* 637 */                   byte[] bArrI00000oIO2 = ilI1oOi.I00000oIO(bArrI00000oIO);
/* 643 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, bArrI00000oIO2.length, 4);
/* 646 */                   byteArrayOutputStream.write(bArrI00000oIO2);
/* 628 */                   return true;
                        }
/* 651 */               byte[] bArr4 = iO0ii0001iio.I0000O;
/* 657 */               if (Arrays.equals(bArr, bArr4)) {
/* 661 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1Arr.length, 1);
/* 666 */                   for (IiOoliOIo1 iiOoliOIo1 : iiOoliOIo1Arr) {
/* 676 */                       int size = iiOoliOIo1.I000OOo1O.size() * 4;
/* 681 */                       String strI00000oOI = I00000oOI(bArr4, iiOoliOIo1.I00000oIO, iiOoliOIo1.I00000oOI);
/* 685 */                       Charset charset = StandardCharsets.UTF_8;
/* 692 */                       ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, strI00000oOI.getBytes(charset).length);
/* 698 */                       ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, iiOoliOIo1.I000O01llI0.length);
/* 702 */                       ilI1oOi.I0000oI00(byteArrayOutputStream, size, 4);
/* 707 */                       ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1.I0000Il00O, 4);
/* 714 */                       byteArrayOutputStream.write(strI00000oOI.getBytes(charset));
/* 723 */                       Iterator it = iiOoliOIo1.I000OOo1O.keySet().iterator();
/* 731 */                       while (it.hasNext()) {
/* 743 */                           ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, ((Integer) it.next()).intValue());
/* 747 */                           ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, 0);
                                }
/* 755 */                       for (int i2 : iiOoliOIo1.I000O01llI0) {
/* 759 */                           ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, i2);
                                }
                            }
/* 500 */                   return true;
                        }
/* 768 */               byte[] bArr5 = iO0ii0001iio.I0000Il00O;
/* 774 */               if (Arrays.equals(bArr, bArr5)) {
/* 776 */                   byte[] bArrI00000oIO3 = I00000oIO(iiOoliOIo1Arr, bArr5);
/* 783 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1Arr.length, 1);
/* 788 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, bArrI00000oIO3.length, 4);
/* 791 */                   byte[] bArrI00000oIO4 = ilI1oOi.I00000oIO(bArrI00000oIO3);
/* 797 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, bArrI00000oIO4.length, 4);
/* 800 */                   byteArrayOutputStream.write(bArrI00000oIO4);
/* 782 */                   return true;
                        }
/* 804 */               byte[] bArr6 = iO0ii0001iio.I0000oI00;
/* 810 */               if (!Arrays.equals(bArr, bArr6)) {
/* 913 */                   return false;
                        }
/* 813 */               ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, iiOoliOIo1Arr.length);
/* 818 */               for (IiOoliOIo1 iiOoliOIo12 : iiOoliOIo1Arr) {
/* 822 */                   String str = iiOoliOIo12.I00000oIO;
/* 824 */                   TreeMap treeMap = iiOoliOIo12.I000OOo1O;
/* 828 */                   String strI00000oOI2 = I00000oOI(bArr6, str, iiOoliOIo12.I00000oOI);
/* 832 */                   Charset charset2 = StandardCharsets.UTF_8;
/* 839 */                   ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, strI00000oOI2.getBytes(charset2).length);
/* 846 */                   ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, treeMap.size());
/* 852 */                   ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, iiOoliOIo12.I000O01llI0.length);
/* 857 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo12.I0000Il00O, 4);
/* 864 */                   byteArrayOutputStream.write(strI00000oOI2.getBytes(charset2));
/* 871 */                   Iterator it2 = treeMap.keySet().iterator();
/* 879 */                   while (it2.hasNext()) {
/* 891 */                       ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                            }
/* 899 */                   for (int i3 : iiOoliOIo12.I000O01llI0) {
/* 903 */                       ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, i3);
                            }
                        }
/* 500 */               return true;
                    }
/* 21 */            ArrayList arrayList2 = new ArrayList(3);
/* 26 */            ArrayList arrayList3 = new ArrayList(3);
/* 31 */            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
/* 35 */                ilI1oOi.I0001Ioi1lo(byteArrayOutputStream2, iiOoliOIo1Arr.length);
/* 38 */                int i4 = 2;
/* 40 */                int i5 = 2;
/* 42 */                for (IiOoliOIo1 iiOoliOIo13 : iiOoliOIo1Arr) {
/* 48 */                    ilI1oOi.I0000oI00(byteArrayOutputStream2, iiOoliOIo13.I0000Il00O, 4);
/* 53 */                    ilI1oOi.I0000oI00(byteArrayOutputStream2, iiOoliOIo13.I0000O, 4);
/* 59 */                    ilI1oOi.I0000oI00(byteArrayOutputStream2, iiOoliOIo13.I000II, 4);
/* 66 */                    String strI00000oOI3 = I00000oOI(bArr2, iiOoliOIo13.I00000oIO, iiOoliOIo13.I00000oOI);
/* 72 */                    Charset charset3 = StandardCharsets.UTF_8;
/* 78 */                    int length2 = strI00000oOI3.getBytes(charset3).length;
/* 79 */                    ilI1oOi.I0001Ioi1lo(byteArrayOutputStream2, length2);
/* 82 */                    i5 = i5 + 14 + length2;
/* 87 */                    byteArrayOutputStream2.write(strI00000oOI3.getBytes(charset3));
                        }
/* 98 */                byte[] byteArray = byteArrayOutputStream2.toByteArray();
/* 107 */               if (i5 != byteArray.length) {
/* 604 */                   throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
                        }
/* 111 */               i01lI0Oil0oi i01li0oil0oi = new i01lI0Oil0oi(1, false, byteArray);
/* 114 */               byteArrayOutputStream2.close();
/* 117 */               arrayList2.add(i01li0oil0oi);
/* 122 */               ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
/* 125 */               int i6 = 0;
/* 126 */               int i7 = 0;
/* 128 */               while (i6 < iiOoliOIo1Arr.length) {
                            try {
/* 130 */                       IiOoliOIo1 iiOoliOIo14 = iiOoliOIo1Arr[i6];
/* 132 */                       ilI1oOi.I0001Ioi1lo(byteArrayOutputStream3, i6);
/* 139 */                       ilI1oOi.I0001Ioi1lo(byteArrayOutputStream3, iiOoliOIo14.I0000oI00);
/* 145 */                       i7 = i7 + 4 + (iiOoliOIo14.I0000oI00 * i4);
/* 146 */                       int[] iArr = iiOoliOIo14.I000O01llI0;
/* 148 */                       int length3 = iArr.length;
/* 149 */                       int i8 = i;
/* 151 */                       while (i < length3) {
/* 153 */                           int i9 = iArr[i];
/* 159 */                           ilI1oOi.I0001Ioi1lo(byteArrayOutputStream3, i9 - i8);
/* 162 */                           i++;
/* 164 */                           i4 = i4;
/* 166 */                           i8 = i9;
                                }
/* 171 */                       i6++;
/* 173 */                       i = 0;
                            } catch (Throwable th) {
                            }
                        }
/* 180 */               int i10 = i4;
/* 182 */               byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
/* 187 */               if (i7 != byteArray2.length) {
/* 567 */                   throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                        }
/* 191 */               i01lI0Oil0oi i01li0oil0oi2 = new i01lI0Oil0oi(3, true, byteArray2);
/* 194 */               byteArrayOutputStream3.close();
/* 197 */               arrayList2.add(i01li0oil0oi2);
/* 202 */               byteArrayOutputStream3 = new ByteArrayOutputStream();
/* 205 */               int i11 = 0;
/* 206 */               int i12 = 0;
/* 208 */               while (i11 < iiOoliOIo1Arr.length) {
                            try {
/* 210 */                       IiOoliOIo1 iiOoliOIo15 = iiOoliOIo1Arr[i11];
/* 218 */                       Iterator it3 = iiOoliOIo15.I000OOo1O.entrySet().iterator();
/* 222 */                       int iIntValue = 0;
/* 227 */                       while (it3.hasNext()) {
/* 245 */                           iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                                }
/* 249 */                       ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
/* 252 */                           I000l1(byteArrayOutputStream4, iIntValue, iiOoliOIo15);
/* 255 */                           byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
/* 259 */                           byteArrayOutputStream4.close();
/* 264 */                           byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
/* 267 */                               I000lI(byteArrayOutputStream4, iiOoliOIo15);
/* 270 */                               byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
/* 274 */                               byteArrayOutputStream4.close();
/* 277 */                               ilI1oOi.I0001Ioi1lo(byteArrayOutputStream3, i11);
/* 284 */                               int length4 = byteArray3.length + 2 + byteArray4.length;
/* 285 */                               int i13 = i12 + 6;
/* 287 */                               ArrayList arrayList4 = arrayList3;
/* 290 */                               ilI1oOi.I0000oI00(byteArrayOutputStream3, length4, 4);
/* 293 */                               ilI1oOi.I0001Ioi1lo(byteArrayOutputStream3, iIntValue);
/* 296 */                               byteArrayOutputStream3.write(byteArray3);
/* 299 */                               byteArrayOutputStream3.write(byteArray4);
/* 302 */                               i12 = i13 + length4;
/* 303 */                               i11++;
/* 305 */                               arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
/* 531 */                           byteArrayOutputStream3.close();
/* 539 */                           throw th;
                                } catch (Throwable th2) {
/* 536 */                           th.addSuppressed(th2);
                                }
                            }
                        }
/* 336 */               ArrayList arrayList5 = arrayList3;
/* 338 */               byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
/* 343 */               if (i12 != byteArray5.length) {
/* 530 */                   throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                        }
/* 348 */               i01lI0Oil0oi i01li0oil0oi3 = new i01lI0Oil0oi(4, true, byteArray5);
/* 351 */               byteArrayOutputStream3.close();
/* 354 */               arrayList2.add(i01li0oil0oi3);
/* 366 */               long size2 = 12 + (arrayList2.size() * 16);
/* 372 */               ilI1oOi.I0000oI00(byteArrayOutputStream, arrayList2.size(), 4);
/* 375 */               int i14 = 0;
/* 380 */               while (i14 < arrayList2.size()) {
/* 386 */                   i01lI0Oil0oi i01li0oil0oi4 = (i01lI0Oil0oi) arrayList2.get(i14);
/* 388 */                   int i15 = i01li0oil0oi4.I00000oIO;
/* 390 */                   byte[] bArr7 = i01li0oil0oi4.I00000oOI;
/* 395 */                   int i16 = i10;
/* 398 */                   if (i15 == 1) {
/* 423 */                       j = 0;
                            } else if (i15 == i16) {
/* 420 */                       j = 1;
                            } else if (i15 == 3) {
/* 417 */                       j = 2;
                            } else if (i15 == 4) {
/* 414 */                       j = 3;
                            } else {
/* 407 */                       if (i15 != 5) {
/* 413 */                           throw null;
                                }
/* 409 */                       j = 4;
                            }
/* 424 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, j, 4);
/* 427 */                   ilI1oOi.I0000oI00(byteArrayOutputStream, size2, 4);
/* 432 */                   if (i01li0oil0oi4.I0000Il00O) {
/* 434 */                       long length5 = bArr7.length;
/* 436 */                       byte[] bArrI00000oIO5 = ilI1oOi.I00000oIO(bArr7);
/* 440 */                       arrayList = arrayList5;
/* 442 */                       arrayList.add(bArrI00000oIO5);
/* 447 */                       ilI1oOi.I0000oI00(byteArrayOutputStream, bArrI00000oIO5.length, 4);
/* 450 */                       ilI1oOi.I0000oI00(byteArrayOutputStream, length5, 4);
/* 453 */                       length = bArrI00000oIO5.length;
                            } else {
/* 457 */                       arrayList = arrayList5;
/* 459 */                       arrayList.add(bArr7);
/* 464 */                       ilI1oOi.I0000oI00(byteArrayOutputStream, bArr7.length, 4);
/* 467 */                       ilI1oOi.I0000oI00(byteArrayOutputStream, 0L, 4);
/* 470 */                       length = bArr7.length;
                            }
/* 455 */                   size2 += length;
/* 472 */                   i14++;
/* 474 */                   arrayList5 = arrayList;
/* 476 */                   i10 = i16;
                        }
/* 479 */               ArrayList arrayList6 = arrayList5;
/* 486 */               for (int i17 = 0; i17 < arrayList6.size(); i17++) {
/* 494 */                   byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
                        }
/* 500 */               return true;
                    } catch (Throwable th3) {
                        try {
/* 605 */                   byteArrayOutputStream2.close();
/* 613 */                   throw th3;
                        } catch (Throwable th4) {
/* 610 */                   th3.addSuppressed(th4);
/* 613 */                   throw th3;
                        }
                    }
                }

                public static void I000OiO(ByteArrayOutputStream byteArrayOutputStream, IiOoliOIo1 iiOoliOIo1) throws IOException {
/* 1 */             I000lI(byteArrayOutputStream, iiOoliOIo1);
/* 4 */             int i = iiOoliOIo1.I000II;
/* 6 */             int[] iArr = iiOoliOIo1.I000O01llI0;
/* 8 */             int length = iArr.length;
/* 9 */             int i2 = 0;
/* 10 */            int i3 = 0;
/* 11 */            while (i2 < length) {
/* 13 */                int i4 = iArr[i2];
/* 17 */                ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, i4 - i3);
/* 20 */                i2++;
/* 22 */                i3 = i4;
                    }
/* 32 */            byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
/* 48 */            for (Map.Entry entry : iiOoliOIo1.I000OOo1O.entrySet()) {
/* 62 */                int iIntValue = ((Integer) entry.getKey()).intValue();
/* 72 */                int iIntValue2 = ((Integer) entry.getValue()).intValue();
/* 79 */                if ((iIntValue2 & 2) != 0) {
/* 81 */                    int i5 = iIntValue / 8;
/* 91 */                    bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
                        }
/* 95 */                if ((iIntValue2 & 4) != 0) {
/* 97 */                    int i6 = iIntValue + i;
/* 98 */                    int i7 = i6 / 8;
/* 108 */                   bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                        }
                    }
/* 111 */           byteArrayOutputStream.write(bArr);
                }

                public static void I000iOII(ByteArrayOutputStream byteArrayOutputStream, IiOoliOIo1 iiOoliOIo1, String str) throws IOException {
/* 1 */             Charset charset = StandardCharsets.UTF_8;
/* 8 */             ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, str.getBytes(charset).length);
/* 13 */            ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, iiOoliOIo1.I0000oI00);
/* 20 */            ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1.I0001Ioi1lo, 4);
/* 25 */            ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1.I0000Il00O, 4);
/* 31 */            ilI1oOi.I0000oI00(byteArrayOutputStream, iiOoliOIo1.I000II, 4);
/* 38 */            byteArrayOutputStream.write(str.getBytes(charset));
                }

                public static void I000l1(ByteArrayOutputStream byteArrayOutputStream, int i, IiOoliOIo1 iiOoliOIo1) throws IOException {
/* 1 */             int i2 = iiOoliOIo1.I000II;
/* 16 */            byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
/* 32 */            for (Map.Entry entry : iiOoliOIo1.I000OOo1O.entrySet()) {
/* 46 */                int iIntValue = ((Integer) entry.getKey()).intValue();
/* 56 */                int iIntValue2 = ((Integer) entry.getValue()).intValue();
/* 61 */                int i3 = 0;
/* 64 */                for (int i4 = 1; i4 <= 4; i4 <<= 1) {
/* 66 */                    if (i4 != 1 && (i4 & i) != 0) {
/* 78 */                        if ((i4 & iIntValue2) == i4) {
/* 82 */                            int i5 = (i3 * i2) + iIntValue;
/* 83 */                            int i6 = i5 / 8;
/* 93 */                            bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                                }
/* 95 */                        i3++;
                            }
                        }
                    }
/* 98 */            byteArrayOutputStream.write(bArr);
                }

                public static void I000lI(ByteArrayOutputStream byteArrayOutputStream, IiOoliOIo1 iiOoliOIo1) throws IOException {
/* 12 */            int i = 0;
/* 17 */            for (Map.Entry entry : iiOoliOIo1.I000OOo1O.entrySet()) {
/* 31 */                int iIntValue = ((Integer) entry.getKey()).intValue();
/* 47 */                if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
/* 52 */                    ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, iIntValue - i);
/* 55 */                    ilI1oOi.I0001Ioi1lo(byteArrayOutputStream, 0);
/* 58 */                    i = iIntValue;
                        }
                    }
                }
            }

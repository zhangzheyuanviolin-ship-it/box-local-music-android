            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.UncheckedIOException;
            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            
            public abstract class OloII1oI {
                public static final OIIl00o10 I00000oIO = i0I0OI0I00o.I00000oIO(Charset.defaultCharset());
                public static final IIIOlol I00000oOI = new IIIOlol(16);

                public static String I00000oIO(byte[] bArr, int i, int i2) {
                    try {
                        try {
/* 3 */                     return I00000oOI(bArr, i, i2, I00000oIO);
                        } catch (IOException unused) {
/* 10 */                    return I00000oOI(bArr, i, i2, I00000oOI);
                        }
                    } catch (IOException e) {
/* 215 */               throw new UncheckedIOException(e);
                    }
                }

                public static String I00000oOI(byte[] bArr, int i, int i2, i0I0IloiO1l i0i0iloio1l) {
/* 3 */             int i3 = 0;
/* 4 */             for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
/* 10 */                i3++;
                    }
/* 15 */            if (i3 <= 0) {
/* 27 */                return "";
                    }
/* 17 */            byte[] bArr2 = new byte[i3];
/* 19 */            System.arraycopy(bArr, i, bArr2, 0, i3);
/* 22 */            return i0i0iloio1l.I00000oOI(bArr2);
                }

                public static long I0000Il00O(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = i + i2;
/* 6 */             if (i2 < 2) {
/* 124 */               I000II.I000iOII(IIlIOloOOO.I00100l0("Length ", i2, " must be at least 2"));
/* 4 */                 return 0L;
                    }
/* 10 */            if (bArr[i] == 0) {
/* 4 */                 return 0L;
                    }
/* 13 */            int i4 = i;
/* 16 */            while (i4 < i3 && bArr[i4] == 32) {
/* 23 */                i4++;
                    }
/* 28 */            byte b = bArr[i3 - 1];
/* 30 */            while (i4 < i3 && (b == 0 || b == 32)) {
/* 40 */                b = bArr[i3 - 2];
                        i3--;
                    }
/* 46 */            long j = 0;
/* 47 */            while (i4 < i3) {
/* 49 */                byte b2 = bArr[i4];
/* 53 */                if (b2 < 48 || b2 > 55) {
/* 81 */                    String strReplace = new String(bArr, i, i2, Charset.defaultCharset()).replace("\u0000", "{NUL}");
/* 89 */                    StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Invalid byte ", b2, " at offset ");
/* 94 */                    sbI00100o1O0lo.append(i4 - i);
/* 99 */                    sbI00100o1O0lo.append(" in '");
/* 102 */                   sbI00100o1O0lo.append(strReplace);
/* 111 */                   I000II.I000iOII(Oi010OO0.I00100l0(i2, "' len=", sbI00100o1O0lo));
/* 4 */                     return 0L;
                        }
/* 64 */                j = (j << 3) + (b2 - 48);
/* 65 */                i4++;
                    }
/* 115 */           return j;
                }

                public static long I0000O(byte[] bArr, int i, int i2) {
/* 1 */             byte b = bArr[i];
/* 5 */             if ((b & 128) == 0) {
/* 7 */                 return I0000Il00O(bArr, i, i2);
                    }
/* 19 */            boolean z = b == -1;
/* 20 */            long jPow = 0;
/* 30 */            if (i2 < 9) {
/* 32 */                if (i2 >= 9) {
/* 79 */                    I000II.I000iOII(Oi010OO0.I0010o("At offset ", i, ", ", i2, " byte binary number exceeds maximum signed long value"));
/* 20 */                    return 0L;
                        }
/* 35 */                for (int i3 = 1; i3 < i2; i3++) {
/* 47 */                    jPow = (jPow << 8) + (bArr[i + i3] & 255);
                        }
/* 51 */                if (z) {
/* 69 */                    jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, (i2 - 1) * 8.0d)) - 1);
                        }
                        return z ? -jPow : jPow;
                    }
                    int i4 = i2 - 1;
/* 85 */            byte[] bArr2 = new byte[i4];
/* 89 */            System.arraycopy(bArr, i + 1, bArr2, 0, i4);
/* 94 */            BigInteger bigInteger = new BigInteger(bArr2);
/* 97 */            if (z) {
/* 109 */               bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
                    }
/* 119 */           if (bigInteger.bitLength() <= 63) {
/* 121 */               long jLongValue = bigInteger.longValue();
                        return z ? -jLongValue : jLongValue;
                    }
/* 133 */           I000II.I000iOII(Oi010OO0.I0010o("At offset ", i, ", ", i2, " byte binary number exceeds maximum signed long value"));
/* 20 */            return 0L;
                }

                /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O("Failed to read Paxheader. Encountered a non-number while reading length");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
                
                    return r18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
                
                    r18 = r2;
                    r10 = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
                
                    r4 = r4;
                    r5 = r5;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v15 */
                /* JADX WARN: Type inference failed for: r5v16 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Long] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static HashMap I0000oI00(OloI1ool0Ilo oloI1ool0Ilo, ArrayList arrayList, HashMap map, long j) {
                    int i;
                    int i2;
                    HashMap map2;
                    byte b;
                    int i3;
                    HashMap map3;
                    HashMap map4;
                    int i4;
                    Long l;
                    int i5;
                    Long lValueOf;
                    long j2;
/* 7 */             HashMap map5 = new HashMap(map);
/* 10 */            HashMap map6 = null;
/* 11 */            byte b2 = 0;
/* 12 */            Object obj = null;
/* 13 */            int i6 = 0;
                    loop0: while (true) {
/* 14 */                int i7 = b2;
/* 15 */                int i8 = i7;
                        while (true) {
/* 16 */                    i = oloI1ool0Ilo.read();
/* 20 */                    i2 = -1;
/* 21 */                    long j3 = 0;
/* 23 */                    if (i == -1) {
                                break;
                            }
/* 26 */                    i7++;
/* 27 */                    i6++;
/* 31 */                    if (i == 10) {
/* 33 */                        map2 = map6;
/* 35 */                        b = b2;
/* 36 */                        i3 = -1;
                                break;
                            }
/* 43 */                    if (i == 32) {
/* 47 */                        IIIiilOiiOlO iIIiilOiiOlO = new IIIiilOiiOlO();
/* 55 */                        iIIiilOiiOlO.I00iOIl = new ArrayList();
                                synchronized (iIIiilOiiOlO) {
/* 60 */                            iIIiilOiiOlO.I00000oIO(Barcode.FORMAT_UPC_E);
                                }
/* 64 */                        VarHandle.storeStoreFence();
                                while (true) {
/* 67 */                            i = oloI1ool0Ilo.read();
/* 71 */                            if (i == i2) {
                                        break;
                                    }
/* 73 */                            i7++;
/* 74 */                            i6++;
/* 76 */                            if (i6 < 0) {
                                        break;
                                    }
/* 80 */                            long j4 = j3;
/* 82 */                            if (j >= j3 && i6 >= j) {
                                        break;
                                    }
/* 102 */                           if (i == 61) {
/* 112 */                               String str = new String(iIIiilOiiOlO.I0000Il00O(), StandardCharsets.UTF_8);
/* 115 */                               int i9 = i8 - i7;
/* 116 */                               if (i9 <= 1) {
/* 118 */                                   map5.remove(str);
                                        } else {
/* 122 */                                   if (j >= j3 && i9 > j - i6) {
/* 143 */                                       IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("Paxheader value size ", i9, " exceeds size of header record"));
/* 146 */                                       return map6;
                                            }
/* 149 */                                   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            long j5 = i9;
/* 159 */                                   byte[] bArr = (byte[]) IoOlilOO.I00000oOI.get();
/* 161 */                                   Arrays.fill(bArr, b2);
/* 166 */                                   if (j5 == j4) {
/* 170 */                                       map4 = map6;
/* 172 */                                       i4 = i6;
/* 174 */                                       l = obj;
                                            } else {
/* 177 */                                       int length = bArr.length;
/* 178 */                                       map4 = map6;
/* 189 */                                       int iMin = (j5 <= j4 || j5 >= ((long) length)) ? length : (int) j5;
/* 190 */                                       long j6 = j4;
                                                while (true) {
/* 194 */                                           i4 = i6;
/* 196 */                                           l = obj;
/* 198 */                                           if (iMin <= 0 || i2 == (i5 = oloI1ool0Ilo.read(bArr, 0, iMin))) {
                                                        break;
                                                    }
/* 207 */                                           byteArrayOutputStream.write(bArr, 0, i5);
/* 211 */                                           j6 += i5;
/* 213 */                                           if (j5 > j4) {
/* 224 */                                               iMin = (int) Math.min(j5 - j6, length);
/* 225 */                                               i6 = i4;
/* 227 */                                               obj = l;
/* 229 */                                               bArr = bArr;
/* 231 */                                               i2 = -1;
                                                    } else {
/* 233 */                                               i6 = i4;
/* 235 */                                               obj = l;
                                                    }
                                                }
                                            }
/* 238 */                                   byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 242 */                                   int length2 = byteArray.length;
/* 243 */                                   if (length2 != i9) {
/* 385 */                                       IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000l1(i9, length2, "Failed to read Paxheader. Expected ", " bytes, read "));
/* 388 */                                       return map4;
                                            }
/* 245 */                                   i6 = i4 + i9;
                                            int i10 = i9 - 1;
/* 253 */                                   if (byteArray[i10] != 10) {
/* 373 */                                       IioIoO10iOiI.I000OOo1O("Failed to read Paxheader.Value should end with a newline");
/* 376 */                                       return map4;
                                            }
/* 259 */                                   b = 0;
/* 260 */                                   String str2 = new String(byteArray, 0, i10, StandardCharsets.UTF_8);
/* 263 */                                   map5.put(str, str2);
/* 272 */                                   if (str.equals("GNU.sparse.offset")) {
/* 274 */                                       if (l != null) {
/* 282 */                                           j2 = j4;
/* 287 */                                           arrayList.add(new OloII110OI0(l.longValue(), j2));
                                                } else {
/* 291 */                                           j2 = j4;
                                                }
                                                try {
/* 293 */                                           lValueOf = Long.valueOf(str2);
/* 303 */                                           if (lValueOf.longValue() < j2) {
/* 308 */                                               IioIoO10iOiI.I000OOo1O("Failed to read Paxheader.GNU.sparse.offset contains negative value");
/* 311 */                                               return map4;
                                                    }
                                                } catch (NumberFormatException unused) {
/* 314 */                                           IioIoO10iOiI.I000OOo1O("Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value");
/* 317 */                                           return map4;
                                                }
                                            } else {
/* 318 */                                       lValueOf = l;
                                            }
/* 326 */                                   if (!str.equals("GNU.sparse.numbytes")) {
/* 367 */                                       obj = lValueOf;
                                                map3 = map4;
                                            } else {
/* 328 */                                       if (lValueOf == null) {
/* 363 */                                           IioIoO10iOiI.I000OOo1O("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.");
/* 366 */                                           return map4;
                                                }
/* 330 */                                       long jI00000oOI = l1oioiOo.I00000oOI(str2);
/* 338 */                                       if (jI00000oOI < 0) {
/* 357 */                                           IioIoO10iOiI.I000OOo1O("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
/* 360 */                                           return map4;
                                                }
/* 349 */                                       arrayList.add(new OloII110OI0(lValueOf.longValue(), jI00000oOI));
/* 352 */                                       obj = map4;
                                                map3 = map4;
                                            }
                                        }
                                    } else {
/* 400 */                               iIIiilOiiOlO.write((byte) i);
/* 403 */                               b2 = b2;
/* 404 */                               map6 = map6;
/* 406 */                               i2 = -1;
/* 407 */                               j3 = 0;
                                    }
                                }
/* 368 */                       i3 = -1;
                                map2 = map3;
                            } else {
/* 428 */                       HashMap map7 = map6;
/* 430 */                       byte b3 = b2;
/* 431 */                       Object obj2 = obj;
/* 437 */                       if (i < 48 || i > 57) {
                                    break loop0;
                                }
/* 447 */                       i8 = (i8 * 10) + (i - 48);
/* 448 */                       b2 = b3;
/* 449 */                       map6 = map7;
/* 451 */                       obj = obj2;
                            }
                        }
/* 416 */               map2 = map6;
/* 418 */               b = b2;
/* 423 */               i3 = i2;
/* 461 */               if (i == i3) {
/* 463 */                   if (obj != null) {
/* 476 */                       arrayList.add(new OloII110OI0(obj.longValue(), 0L));
                            }
/* 479 */                   return map5;
                        }
/* 480 */               b2 = b;
/* 481 */               map6 = map2;
                    }
                }

                public static long[] I0001Ioi1lo(InputStream inputStream) {
/* 1 */             long j = 0;
/* 3 */             long j2 = 0;
                    while (true) {
/* 4 */                 int i = inputStream.read();
/* 12 */                if (i == 10) {
/* 49 */                    return new long[]{j2, j + 1};
                        }
/* 14 */                j++;
/* 17 */                if (i == -1) {
/* 43 */                    IioIoO10iOiI.I000OOo1O("Unexpected EOF when reading parse information of 1.X PAX format");
/* 16 */                    return null;
                        }
/* 21 */                if (i < 48 || i > 57) {
                            break;
                        }
/* 33 */                j2 = (j2 * 10) + (i - 48);
                    }
/* 37 */            IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Non-numeric value in sparse headers block");
/* 16 */            return null;
                }

                public static List I000II(byte[] bArr, int i, int i2) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 7 */             for (int i3 = 0; i3 < i2; i3++) {
/* 11 */                int i4 = (i3 * 24) + i;
                        try {
/* 14 */                    long jI0000O = I0000O(bArr, i4, 12);
/* 20 */                    long jI0000O2 = I0000O(bArr, i4 + 12, 12);
/* 26 */                    OloII110OI0 oloII110OI0 = new OloII110OI0(jI0000O, jI0000O2);
/* 33 */                    if (jI0000O < 0) {
/* 60 */                        throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                            }
/* 37 */                    if (jI0000O2 < 0) {
/* 52 */                        throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                            }
/* 39 */                    arrayList.add(oloII110OI0);
                        } catch (IllegalArgumentException e) {
/* 69 */                    throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
                        }
                    }
/* 70 */            return Collections.unmodifiableList(arrayList);
                }
            }

            package p000;

            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.zip.ZipException;
            
            public abstract class liO0o11 {
                /* JADX WARN: Multi-variable type inference failed */
                public static i0Il1olI I00000oIO(String str, String str2) throws IOException {
                    long j;
                    IooI0ilii iooI0ilii;
                    i0Il1olI i0il1oli;
                    Long lValueOf;
/* 11 */            if (!(str != null)) {
/* 469 */               I000II.I001IO000("Attempted to get file location from a null apk path.");
/* 465 */               return null;
                    }
/* 17 */            String strI000lI = IlIi0I0.I000lI("Attempted to get file location in apk ", str, " with a null file path.");
/* 21 */            if (str2 == null) {
/* 461 */               I000II.I001IO000(strI000lI);
/* 459 */               return null;
                    }
/* 27 */            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
/* 32 */            byte[] bArr = new byte[22];
/* 41 */            randomAccessFile.seek(randomAccessFile.length() - 22);
/* 44 */            randomAccessFile.readFully(bArr);
/* 60 */            if (liO0lioo.I00000oOI(0, bArr) == 1347093766) {
/* 62 */                int iI00000oIO = liO0lioo.I00000oIO(10, bArr);
/* 66 */                liO0lioo.I0000Il00O(12, bArr);
/* 69 */                j = -22;
/* 70 */                long jI0000Il00O = liO0lioo.I0000Il00O(16, bArr);
/* 76 */                iooI0ilii = new IooI0ilii();
/* 79 */                iooI0ilii.I00000oIO = jI0000Il00O;
/* 81 */                iooI0ilii.I00000oOI = iI00000oIO;
/* 83 */                VarHandle.storeStoreFence();
                    } else {
/* 87 */                j = -22;
/* 88 */                iooI0ilii = null;
                    }
/* 90 */            if (iooI0ilii == null) {
/* 92 */                long length = randomAccessFile.length();
/* 96 */                long j2 = j + length;
/* 109 */               int iMin = (int) Math.min(1024L, randomAccessFile.length());
/* 110 */               byte[] bArr2 = new byte[iMin];
/* 112 */               byte[] bArr3 = new byte[22];
                        loop0: while (true) {
                            long j3 = length - 65558;
/* 123 */                   if (j3 < 0) {
/* 125 */                       j3 = 0;
                            }
/* 132 */                   long jMax = Math.max(3 + (j2 - iMin), j3);
/* 136 */                   randomAccessFile.seek(jMax);
/* 139 */                   randomAccessFile.readFully(bArr2);
/* 144 */                   for (int i = iMin - 4; i >= 0; i -= 4) {
/* 146 */                       byte b = bArr2[i];
/* 148 */                       i0il1oli = null;
/* 171 */                       int i2 = b != 5 ? b != 6 ? b != 75 ? b != 80 ? -1 : 0 : 1 : 3 : 2;
/* 172 */                       if (i2 >= 0 && i >= i2 && liO0lioo.I00000oOI(i - i2, bArr2) == 1347093766) {
/* 188 */                           randomAccessFile.seek((jMax + i) - i2);
/* 191 */                           randomAccessFile.readFully(bArr3);
/* 196 */                           int iI00000oIO2 = liO0lioo.I00000oIO(10, bArr3);
/* 202 */                           liO0lioo.I0000Il00O(12, bArr3);
/* 207 */                           long jI0000Il00O2 = liO0lioo.I0000Il00O(16, bArr3);
/* 213 */                           iooI0ilii = new IooI0ilii();
/* 216 */                           iooI0ilii.I00000oIO = jI0000Il00O2;
/* 218 */                           iooI0ilii.I00000oOI = iI00000oIO2;
/* 220 */                           VarHandle.storeStoreFence();
                                    break loop0;
                                }
                            }
/* 243 */                   if (jMax == j3) {
/* 261 */                       throw new ZipException(IIl001iO0Io.I000o00OoI0I("End Of Central Directory signature not found in APK ", str));
                            }
/* 245 */                   j2 = jMax;
                        }
                    } else {
/* 262 */               i0il1oli = null;
                    }
/* 264 */           int i3 = iooI0ilii.I00000oOI;
/* 268 */           byte[] bytes = str2.getBytes("UTF-8");
/* 274 */           byte[] bArr4 = new byte[46];
/* 280 */           byte[] bArr5 = new byte[str2.length()];
/* 282 */           long jI0000Il00O3 = iooI0ilii.I00000oIO;
/* 284 */           int i4 = 0;
                    while (true) {
/* 285 */               if (i4 >= i3) {
/* 405 */                   lValueOf = i0il1oli;
                            break;
                        }
/* 287 */               randomAccessFile.seek(jI0000Il00O3);
/* 290 */               randomAccessFile.readFully(bArr4);
/* 294 */               int iI00000oOI = liO0lioo.I00000oOI(0, bArr4);
/* 301 */               if (iI00000oOI != 1347092738) {
/* 404 */                   throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", str2, str, Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(iI00000oOI), 1347092738));
                        }
/* 306 */               randomAccessFile.seek(28 + jI0000Il00O3);
/* 319 */               if (liO0lioo.I00000oIO(28, bArr4) == str2.length()) {
/* 324 */                   randomAccessFile.seek(46 + jI0000Il00O3);
/* 327 */                   randomAccessFile.read(bArr5);
/* 334 */                   if (Arrays.equals(bArr5, bytes)) {
/* 342 */                       lValueOf = Long.valueOf(liO0lioo.I0000Il00O(42, bArr4));
                                break;
                            }
                        }
/* 364 */               jI0000Il00O3 += IIlIOloOOO.I0000Il00O(r12, 46, liO0lioo.I00000oIO(30, bArr4), liO0lioo.I00000oIO(32, bArr4));
/* 365 */               i4++;
                    }
/* 407 */           if (lValueOf == 0) {
/* 409 */               return i0il1oli;
                    }
/* 410 */           long jLongValue = lValueOf.longValue();
/* 419 */           byte[] bArr6 = new byte[8];
/* 421 */           randomAccessFile.seek(22 + jLongValue);
/* 424 */           randomAccessFile.readFully(bArr6);
/* 455 */           return new i0Il1olI(str, liO0lioo.I00000oIO(4, bArr6) + jLongValue + 30 + liO0lioo.I00000oIO(6, bArr6), liO0lioo.I0000Il00O(0, bArr6));
                }
            }

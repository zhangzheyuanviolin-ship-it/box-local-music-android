            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.math.BigDecimal;
            import java.nio.file.attribute.FileTime;
            import java.time.DateTimeException;
            import java.time.Instant;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.concurrent.TimeUnit;
            import java.util.regex.Pattern;
            
            public final class OloI1l {
                public static final Pattern I000iOII = Pattern.compile("-?\\d{1,19}(?:\\.\\d{1,19})?");
                public long I00000oOI;
                public byte I0000Il00O;
                public ArrayList I0000O;
                public boolean I0000oI00;
                public long I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;
                public String I00000oIO = "";
                public final HashMap I000OiO = new HashMap();

                public OloI1l(HashMap map, byte[] bArr, OIIl00o10 oIIl00o10) throws IOException {
/* 17 */            String property = System.getProperty("user.name", "");
/* 27 */            if (property.length() > 31) {
/* 30 */                property.substring(0, 31);
                    }
                    try {
/* 33 */                I0001Ioi1lo(map, bArr, oIIl00o10);
                    } catch (IllegalArgumentException e) {
/* 215 */               throw new IOException("Corrupted TAR archive.", e);
                    }
                }

                public static void I00000oIO(long j) {
/* 5 */             if (j <= 0) {
/* 7 */                 return;
                    }
/* 10 */            FileTime.from(j, TimeUnit.SECONDS);
                }

                public static boolean I0000Il00O(int i, byte[] bArr) {
/* 6 */             if ((bArr[i] & 128) == 0) {
/* 11 */                for (int i2 = 0; i2 < 11; i2++) {
/* 15 */                    byte b = bArr[i + i2];
/* 19 */                    if (b < 48 || b > 55) {
/* 38 */                        return true;
                            }
                        }
/* 30 */                byte b2 = bArr[i + 11];
/* 34 */                if (b2 != 32 && b2 != 0) {
/* 38 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                public static Instant I0000oI00(String str) throws IOException {
/* 15 */            if (!I000iOII.matcher(str).matches()) {
/* 62 */                IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Corrupted PAX header. Time field value is invalid '", str, "'"));
/* 65 */                return null;
                    }
/* 19 */            BigDecimal bigDecimal = new BigDecimal(str);
                    try {
/* 42 */                return Instant.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
                    } catch (ArithmeticException | DateTimeException e) {
/* 57 */                throw new IOException(IlIi0I0.I000lI("Corrupted PAX header. Time field value is invalid '", str, "'"), e);
                    }
                }

                public final boolean I00000oOI() {
/* 1 */             byte b = this.I0000Il00O;
/* 5 */             if (b == 53) {
/* 32 */                return true;
                    }
                    return (b == 120 || b == 88 || b == 103 || !this.I00000oIO.endsWith("/")) ? false : true;
                }

                public final boolean I0000O() {
                    return this.I0000Il00O == 83 || this.I000II || this.I000OOo1O;
                }

                public final void I0001Ioi1lo(HashMap map, byte[] bArr, OIIl00o10 oIIl00o10) throws IOException {
                    String str;
                    byte b;
/* 14 */            this.I00000oIO = OloII1oI.I00000oOI(bArr, 0, 100, oIIl00o10);
/* 18 */            OloII1oI.I0000O(bArr, 100, 8);
/* 23 */            OloII1oI.I0000O(bArr, 108, 8);
/* 28 */            OloII1oI.I0000O(bArr, 116, 8);
/* 35 */            long jI0000O = OloII1oI.I0000O(bArr, 124, 12);
/* 39 */            this.I00000oOI = jI0000O;
/* 41 */            long j = 0;
/* 45 */            if (jI0000O < 0) {
/* 421 */               IioIoO10iOiI.I000OOo1O("broken archive, entry with negative size");
/* 2160 */              return;
                    }
/* 55 */            FileTime.from(OloII1oI.I0000O(bArr, 136, 12), TimeUnit.SECONDS);
/* 58 */            int i = 148;
/* 60 */            long jI0000Il00O = OloII1oI.I0000Il00O(bArr, 148, 8);
/* 64 */            int i2 = 0;
/* 65 */            long j2 = 0;
                    while (true) {
/* 69 */                byte b2 = 32;
/* 71 */                if (i2 >= bArr.length) {
                            break;
                        }
/* 73 */                byte b3 = bArr[i2];
/* 75 */                if (i > i2 || i2 >= 156) {
/* 80 */                    b2 = b3;
                        }
/* 84 */                j += b2 & 255;
/* 86 */                j2 += b2;
/* 87 */                i2++;
/* 92 */                i = 148;
                    }
/* 99 */            if (jI0000Il00O != j) {
/* 101 */               int i3 = (jI0000Il00O > j2 ? 1 : (jI0000Il00O == j2 ? 0 : -1));
                    }
/* 105 */           this.I0000Il00O = bArr[156];
/* 109 */           OloII1oI.I00000oOI(bArr, 157, 100, oIIl00o10);
/* 115 */           OloII1oI.I00000oIO(bArr, 257, 6);
/* 121 */           OloII1oI.I00000oIO(bArr, 263, 2);
/* 126 */           OloII1oI.I00000oOI(bArr, 265, 32, oIIl00o10);
/* 131 */           OloII1oI.I00000oOI(bArr, 297, 32, oIIl00o10);
/* 134 */           byte b4 = this.I0000Il00O;
/* 138 */           if (b4 == 51 || b4 == 52) {
/* 148 */               OloII1oI.I0000O(bArr, 329, 8);
/* 153 */               OloII1oI.I0000O(bArr, 337, 8);
                    }
/* 165 */           if (iOO110oi1.I00000oIO("ustar ", bArr, 257, 6)) {
/* 173 */               I00000oIO(OloII1oI.I0000O(bArr, 345, 12));
/* 182 */               I00000oIO(OloII1oI.I0000O(bArr, 357, 12));
/* 196 */               this.I0000O = new ArrayList(OloII1oI.I000II(bArr, 386, 4));
/* 207 */               this.I0000oI00 = bArr[482] == 1;
/* 217 */               this.I0001Ioi1lo = OloII1oI.I0000Il00O(bArr, 483, 12);
/* 219 */               return;
                    }
/* 228 */           if (iOO110oi1.I00000oIO("ustar\u0000", bArr, 257, 6) && (iOO110oi1.I00000oIO("tar\u0000", bArr, 508, 4) || ((str = (String) map.get("SCHILY.archtype")) == null ? !(((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & 128) == 0 && b != 32))) || I0000Il00O(476, bArr) || I0000Il00O(488, bArr)) : "xustar".equals(str) || "exustar".equals(str)))) {
/* 314 */               String strI00000oOI = OloII1oI.I00000oOI(bArr, 345, 131, oIIl00o10);
/* 322 */               if (!strI00000oOI.isEmpty()) {
/* 341 */                   this.I00000oIO = strI00000oOI + "/" + this.I00000oIO;
                        }
/* 349 */               I00000oIO(OloII1oI.I0000O(bArr, 476, 12));
/* 356 */               I00000oIO(OloII1oI.I0000O(bArr, 488, 12));
/* 359 */               return;
                    }
/* 362 */           String strI00000oOI2 = OloII1oI.I00000oOI(bArr, 345, 155, oIIl00o10);
/* 370 */           if (I00000oOI() && !this.I00000oIO.endsWith("/")) {
/* 391 */               this.I00000oIO = IIl001iO0Io.I00100l0(new StringBuilder(), this.I00000oIO, "/");
                    }
/* 397 */           if (strI00000oOI2.isEmpty()) {
/* 418 */               return;
                    }
/* 416 */           this.I00000oIO = strI00000oOI2 + "/" + this.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0081 A[LOOP:0: B:40:0x0079->B:42:0x0081, LOOP_END] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(String str) {
                    String property;
                    String strReplace;
                    int iIndexOf;
                    try {
/* 5 */                 int i = OlOloIilii.I00000oIO;
                    } catch (SecurityException unused) {
                    }
/* 16 */            if (!("os.name".length() == 0)) {
/* 19 */                property = System.getProperty("os.name");
/* 23 */                if (property != null) {
/* 34 */                    boolean z = property.length() == 0;
/* 35 */                    if (z) {
                            }
                        }
/* 38 */                if (property != null) {
/* 42 */                    String lowerCase = property.toLowerCase(Locale.ROOT);
/* 54 */                    if (lowerCase.startsWith("windows")) {
/* 61 */                        if (str.length() > 2) {
/* 63 */                            char cCharAt = str.charAt(0);
/* 71 */                            if (str.charAt(1) == ':' && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
/* 89 */                                str = str.substring(2);
                                    }
                                }
                            } else if (lowerCase.contains("netware") && (iIndexOf = str.indexOf(58)) != -1) {
/* 110 */                       str = str.substring(iIndexOf + 1);
                            }
                        }
/* 118 */               strReplace = str.replace(File.separatorChar, '/');
/* 128 */               while (strReplace.startsWith("/")) {
/* 130 */                   strReplace = strReplace.substring(1);
                        }
/* 135 */               this.I00000oIO = strReplace;
                    }
/* 37 */            property = null;
/* 38 */            if (property != null) {
                    }
/* 118 */           strReplace = str.replace(File.separatorChar, '/');
/* 128 */           while (strReplace.startsWith("/")) {
                    }
/* 135 */           this.I00000oIO = strReplace;
                }

                public final boolean equals(Object obj) {
                    return obj != null && OloI1l.class == obj.getClass() && this.I00000oIO.equals(((OloI1l) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }
            }

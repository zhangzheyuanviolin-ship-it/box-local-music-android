            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Locale;
            
            public final class Olil0III implements AutoCloseable {
                public final Olil0l0 I00iOIl;

                public Olil0III(Olil0l0 olil0l0) {
/* 4 */             this.I00iOIl = olil0l0;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OiIIl0O1l0l I00000oIO(String str) {
                    OlilIOi1ooi olilIOi1ooi;
                    int i;
/* 1 */             Olil0l0 olil0l0 = this.I00iOIl;
/* 7 */             i1O01Ill i1o01ill = null;
/* 8 */             if (!olil0l0.isOpen()) {
/* 356 */               lO0I01oIl1o.I00000oIO(21, "connection is closed");
/* 359 */               throw null;
                    }
/* 20 */            String upperCase = OlOoOIi0o.I00OIo(str).toString().toUpperCase(Locale.ROOT);
/* 28 */            int i2 = 2;
/* 29 */            int length = upperCase.length() - 2;
/* 30 */            int i3 = 0;
/* 31 */            int i4 = -1;
/* 32 */            if (length >= 0) {
/* 35 */                int iI001i1O0Ol = 0;
/* 36 */                loop0: while (iI001i1O0Ol < length) {
/* 38 */                    char cCharAt = upperCase.charAt(iI001i1O0Ol);
/* 48 */                    if (O0000Ioio00.I0000oI00(cCharAt, 32) > 0) {
/* 56 */                        if (cCharAt != '-') {
/* 80 */                            if (cCharAt == '/') {
/* 82 */                                int iI001i1O0Ol2 = iI001i1O0Ol + 1;
/* 90 */                                if (upperCase.charAt(iI001i1O0Ol2) == '*') {
/* 110 */                                   do {
/* 95 */                                        iI001i1O0Ol2 = OlOoOIi0o.I001i1O0Ol(upperCase, '*', iI001i1O0Ol2 + 1, 4);
/* 99 */                                        if (iI001i1O0Ol2 >= 0) {
/* 102 */                                           i = iI001i1O0Ol2 + 1;
/* 104 */                                           if (i >= length) {
                                                        break;
                                                    }
                                                } else {
                                                    break loop0;
                                                }
/* 110 */                                   } while (upperCase.charAt(i) != '/');
/* 112 */                                   iI001i1O0Ol = iI001i1O0Ol2 + 2;
                                        }
                                    }
/* 115 */                           i4 = iI001i1O0Ol;
                                    break;
                                }
/* 64 */                        if (upperCase.charAt(iI001i1O0Ol + 1) == '-') {
/* 71 */                            iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(upperCase, '\n', iI001i1O0Ol + 2, 4);
/* 75 */                            if (iI001i1O0Ol < 0) {
                                        break;
                                    }
                                } else {
/* 115 */                           i4 = iI001i1O0Ol;
                                    break;
                                }
                            }
/* 50 */                    iI001i1O0Ol++;
                        }
                    }
/* 140 */           String strSubstring = (i4 < 0 || i4 > upperCase.length()) ? null : upperCase.substring(i4, Math.min(i4 + 3, upperCase.length()));
/* 141 */           if (strSubstring == null) {
/* 145 */               return new OlilIiOO(olil0l0, str);
                    }
                    switch (strSubstring.hashCode()) {
                        case 65636:
/* 206 */                   if (!strSubstring.equals("BEG")) {
/* 174 */                       olilIOi1ooi = null;
                                break;
                            } else if (!OlOoOIi0o.I000oI1ioi(upperCase, "EXCLUSIVE", false)) {
/* 226 */                       if (!OlOoOIi0o.I000oI1ioi(upperCase, "IMMEDIATE", false)) {
/* 231 */                           olilIOi1ooi = OlilIOi1ooi.I00ilI0I1;
                                    break;
                                } else {
/* 228 */                           olilIOi1ooi = OlilIOi1ooi.I00iio;
                                    break;
                                }
                            } else {
/* 217 */                       olilIOi1ooi = OlilIOi1ooi.I00iiO;
                                break;
                            }
                        case 66913:
/* 194 */                   if (strSubstring.equals("COM")) {
/* 197 */                       olilIOi1ooi = OlilIOi1ooi.I00iOIl;
                                break;
                            }
                            break;
                        case 68795:
/* 185 */                   if (!strSubstring.equals("END")) {
                            }
                            break;
                        case 81327:
/* 163 */                   if (strSubstring.equals("ROL") && !OlOoOIi0o.I000oI1ioi(upperCase, " TO ", false)) {
/* 176 */                       olilIOi1ooi = OlilIOi1ooi.I00iiI;
                                break;
                            }
                            break;
                    }
/* 233 */           if (olilIOi1ooi != null) {
/* 237 */               OlilIiOO olilIiOO = new OlilIiOO(olil0l0, str, i2);
/* 240 */               olilIiOO.I00ilI0I1 = olilIOi1ooi;
/* 242 */               VarHandle.storeStoreFence();
/* 245 */               return olilIiOO;
                    }
/* 252 */           if (strSubstring.equals("PRA") && OlOoOIi0o.I000oI1ioi(OlOoOIi0o.I00Iooi00oi(upperCase.toLowerCase(Locale.ROOT), "journal_mode", ""), "=", false)) {
/* 276 */               i1o01ill = i1O01Ill.I00ioIO;
                    }
/* 278 */           if (i1o01ill == null) {
/* 296 */               int iHashCode = strSubstring.hashCode();
                        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new OlilIiOO(olil0l0, str) : new OlilIol(olil0l0, str);
                    }
/* 284 */           OlilIol olilIol = new OlilIol(olil0l0, str);
/* 287 */           OlilIiOO olilIiOO2 = new OlilIiOO(olil0l0, str, i3);
/* 290 */           olilIiOO2.I00ilI0I1 = olilIol;
/* 292 */           VarHandle.storeStoreFence();
/* 295 */           return olilIiOO2;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }
            }

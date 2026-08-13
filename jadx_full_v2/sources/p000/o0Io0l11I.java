            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.Flushable;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.Objects;
            import java.util.regex.Pattern;
            
            public final class o0Io0l11I implements Closeable, Flushable {
                public static final Pattern I00l0OO0IO = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
                public static final String[] I00li1OI = new String[Barcode.FORMAT_ITF];
                public final OlOl0Oi I00iOIl;
                public int[] I00iiI;
                public int I00iiO;
                public final ll1OilIOill I00iio;
                public final String I00ilI0I1;
                public final String I00ilO0;
                public final boolean I00io1l;
                public int I00ioIO;
                public String I00l0I0l0lO1;

                static {
/* 18 */            for (int i = 0; i <= 31; i++) {
/* 36 */                I00li1OI[i] = String.format("\\u%04x", Integer.valueOf(i));
                    }
/* 41 */            String[] strArr = I00li1OI;
/* 47 */            strArr[34] = "\\\"";
/* 53 */            strArr[92] = "\\\\";
/* 59 */            strArr[9] = "\\t";
/* 65 */            strArr[8] = "\\b";
/* 71 */            strArr[10] = "\\n";
/* 77 */            strArr[13] = "\\r";
/* 83 */            strArr[12] = "\\f";
/* 89 */            String[] strArr2 = (String[]) strArr.clone();
/* 95 */            strArr2[60] = "\\u003c";
/* 101 */           strArr2[62] = "\\u003e";
/* 107 */           strArr2[38] = "\\u0026";
/* 113 */           strArr2[61] = "\\u003d";
/* 119 */           strArr2[39] = "\\u0027";
                }

                public o0Io0l11I(OlOl0Oi olOl0Oi) {
/* 6 */             int[] iArrCopyOf = new int[32];
/* 8 */             this.I00iiI = iArrCopyOf;
/* 10 */            boolean z = false;
/* 11 */            this.I00iiO = 0;
/* 14 */            if (iArrCopyOf.length == 0) {
/* 16 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
/* 20 */                this.I00iiI = iArrCopyOf;
                    }
/* 22 */            int i = this.I00iiO;
/* 26 */            this.I00iiO = i + 1;
/* 29 */            iArrCopyOf[i] = 6;
/* 32 */            this.I00ioIO = 2;
/* 34 */            this.I00iOIl = olOl0Oi;
/* 36 */            ll1OilIOill ll1oilioill = ll1OilIOill.I0000O;
/* 38 */            Objects.requireNonNull(ll1oilioill);
/* 41 */            String str = ll1oilioill.I00000oIO;
/* 43 */            this.I00iio = ll1oilioill;
/* 47 */            this.I00ilO0 = ",";
/* 51 */            if (ll1oilioill.I0000Il00O) {
/* 55 */                this.I00ilI0I1 = ": ";
/* 61 */                if (str.isEmpty()) {
/* 65 */                    this.I00ilO0 = ", ";
                        }
                    } else {
/* 70 */                this.I00ilI0I1 = ":";
                    }
/* 76 */            if (str.isEmpty() && ll1oilioill.I00000oOI.isEmpty()) {
/* 86 */                z = true;
                    }
/* 87 */            this.I00io1l = z;
                }

                public final void I00000oIO(int i, int i2, char c) throws IOException {
/* 1 */             int iI0000Il00O = I0000Il00O();
/* 5 */             if (iI0000Il00O != i2 && iI0000Il00O != i) {
/* 12 */                I000II.I001IO000("Nesting problem.");
/* 15 */                return;
                    }
/* 16 */            String str = this.I00l0I0l0lO1;
/* 18 */            if (str != null) {
/* 43 */                I000II.I001IO000("Dangling name: ".concat(str));
/* 98 */                return;
                    }
                    this.I00iiO--;
/* 26 */            if (iI0000Il00O == i2) {
/* 28 */                I000l1();
                    }
/* 33 */            this.I00iOIl.write(c);
                }

                public final int I0000Il00O() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i != 0) {
/* 9 */                 return this.I00iiI[i - 1];
                    }
/* 14 */            I000II.I001IO000("JsonWriter is closed.");
/* 17 */            return 0;
                }

                public final void I000II() throws IOException {
/* 3 */             if (this.I00l0I0l0lO1 != null) {
/* 5 */                 int iI0000Il00O = I0000Il00O();
/* 10 */                if (iI0000Il00O == 5) {
/* 16 */                    this.I00iOIl.write(this.I00ilO0);
                        } else if (iI0000Il00O != 3) {
/* 46 */                    I000II.I001IO000("Nesting problem.");
/* 55 */                    return;
                        }
/* 23 */                I000l1();
/* 33 */                this.I00iiI[this.I00iiO - 1] = 4;
/* 37 */                I000O01llI0(this.I00l0I0l0lO1);
/* 41 */                this.I00l0I0l0lO1 = null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(String str) throws IOException {
                    String str2;
/* 1 */             OlOl0Oi olOl0Oi = this.I00iOIl;
/* 5 */             olOl0Oi.write(34);
/* 8 */             int length = str.length();
/* 12 */            int i = 0;
/* 13 */            int i2 = 0;
/* 14 */            while (i < length) {
/* 16 */                int i3 = i + 1;
/* 18 */                char cCharAt = str.charAt(i);
/* 24 */                if (cCharAt < 128) {
/* 28 */                    str2 = I00li1OI[cCharAt];
/* 30 */                    if (str2 != null) {
/* 46 */                        if (i2 < i) {
/* 49 */                            olOl0Oi.write(str, i2, i - i2);
                                }
/* 52 */                        olOl0Oi.write(str2);
/* 55 */                        i2 = i3;
                            }
                        } else {
/* 35 */                    if (cCharAt == 8232) {
/* 37 */                        str2 = "\\u2028";
                            } else if (cCharAt == 8233) {
/* 44 */                        str2 = "\\u2029";
                            }
/* 46 */                    if (i2 < i) {
                            }
/* 52 */                    olOl0Oi.write(str2);
/* 55 */                    i2 = i3;
                        }
/* 56 */                i = i3;
                    }
/* 58 */            if (i2 < length) {
/* 61 */                olOl0Oi.write(str, i2, length - i2);
                    }
/* 64 */            olOl0Oi.write(34);
                }

                public final void I000l1() throws IOException {
/* 3 */             if (this.I00io1l) {
/* 55 */                return;
                    }
/* 6 */             ll1OilIOill ll1oilioill = this.I00iio;
/* 8 */             String str = ll1oilioill.I00000oIO;
/* 10 */            OlOl0Oi olOl0Oi = this.I00iOIl;
/* 12 */            olOl0Oi.write(str);
/* 15 */            int i = this.I00iiO;
/* 18 */            for (int i2 = 1; i2 < i; i2++) {
/* 22 */                olOl0Oi.write(ll1oilioill.I00000oOI);
                    }
                }

                public final void I00100l0() throws IOException {
/* 1 */             int iI0000Il00O = I0000Il00O();
/* 7 */             if (iI0000Il00O == 1) {
/* 78 */                this.I00iiI[this.I00iiO - 1] = 2;
/* 80 */                I000l1();
/* 110 */               return;
                    }
/* 9 */             OlOl0Oi olOl0Oi = this.I00iOIl;
/* 11 */            if (iI0000Il00O == 2) {
/* 65 */                olOl0Oi.append((CharSequence) this.I00ilO0);
/* 68 */                I000l1();
/* 71 */                return;
                    }
/* 14 */            if (iI0000Il00O == 4) {
/* 50 */                olOl0Oi.append((CharSequence) this.I00ilI0I1);
/* 60 */                this.I00iiI[this.I00iiO - 1] = 5;
/* 62 */                return;
                    }
/* 18 */            if (iI0000Il00O != 6) {
/* 20 */                if (iI0000Il00O != 7) {
/* 35 */                    I000II.I001IO000("Nesting problem.");
/* 38 */                    return;
                        } else if (this.I00ioIO != 1) {
/* 29 */                    I000II.I001IO000("JSON must have only one top-level value.");
/* 32 */                    return;
                        }
                    }
/* 45 */            this.I00iiI[this.I00iiO - 1] = 7;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.getClass();
/* 6 */             int i = this.I00iiO;
/* 9 */             if (i > 1 || (i == 1 && this.I00iiI[0] != 7)) {
/* 26 */                IioIoO10iOiI.I000OOo1O("Incomplete document");
                    } else {
/* 21 */                this.I00iiO = 0;
                    }
                }

                @Override
                public final void flush() {
/* 3 */             if (this.I00iiO != 0) {
/* 7 */                 this.I00iOIl.getClass();
                    } else {
/* 13 */                I000II.I001IO000("JsonWriter is closed.");
                    }
                }
            }

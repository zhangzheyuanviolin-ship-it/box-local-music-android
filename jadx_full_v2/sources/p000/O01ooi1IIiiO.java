            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.Flushable;
            import java.io.IOException;
            import java.io.Writer;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.Arrays;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.regex.Pattern;
            
            public class O01ooi1IIiiO implements Closeable, Flushable {
                public static final Pattern I00ll1 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
                public static final String[] I00lli11 = new String[Barcode.FORMAT_ITF];
                public static final String[] I00lll10;
                public final Writer I00iOIl;
                public int[] I00iiI;
                public int I00iiO;
                public IlioO1 I00iio;
                public String I00ilI0I1;
                public String I00ilO0;
                public boolean I00io1l;
                public int I00ioIO;
                public boolean I00l0I0l0lO1;
                public String I00l0OO0IO;
                public boolean I00li1OI;

                static {
/* 18 */            for (int i = 0; i <= 31; i++) {
/* 36 */                I00lli11[i] = String.format("\\u%04x", Integer.valueOf(i));
                    }
/* 41 */            String[] strArr = I00lli11;
/* 47 */            strArr[34] = "\\\"";
/* 53 */            strArr[92] = "\\\\";
/* 59 */            strArr[9] = "\\t";
/* 65 */            strArr[8] = "\\b";
/* 71 */            strArr[10] = "\\n";
/* 77 */            strArr[13] = "\\r";
/* 83 */            strArr[12] = "\\f";
/* 89 */            String[] strArr2 = (String[]) strArr.clone();
/* 91 */            I00lll10 = strArr2;
/* 97 */            strArr2[60] = "\\u003c";
/* 103 */           strArr2[62] = "\\u003e";
/* 109 */           strArr2[38] = "\\u0026";
/* 115 */           strArr2[61] = "\\u003d";
/* 121 */           strArr2[39] = "\\u0027";
                }

                public O01ooi1IIiiO(Writer writer) {
/* 6 */             int[] iArrCopyOf = new int[32];
/* 8 */             this.I00iiI = iArrCopyOf;
/* 11 */            this.I00iiO = 0;
/* 14 */            if (iArrCopyOf.length == 0) {
/* 16 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
/* 20 */                this.I00iiI = iArrCopyOf;
                    }
/* 22 */            int i = this.I00iiO;
/* 26 */            this.I00iiO = i + 1;
/* 29 */            iArrCopyOf[i] = 6;
/* 32 */            this.I00ioIO = 2;
/* 35 */            this.I00li1OI = true;
/* 39 */            Objects.requireNonNull(writer, "out == null");
/* 42 */            this.I00iOIl = writer;
/* 46 */            I00IioO0OiOi(IlioO1.I0000O);
                }

                public final void I00000oIO() throws IOException {
/* 1 */             int iPeek = peek();
/* 7 */             if (iPeek == 1) {
/* 75 */                this.I00iiI[this.I00iiO - 1] = 2;
/* 77 */                I001l0I00();
/* 113 */               return;
                    }
/* 9 */             Writer writer = this.I00iOIl;
/* 11 */            if (iPeek == 2) {
/* 63 */                writer.append((CharSequence) this.I00ilO0);
/* 66 */                I001l0I00();
/* 69 */                return;
                    }
/* 14 */            if (iPeek == 4) {
/* 49 */                writer.append((CharSequence) this.I00ilI0I1);
/* 58 */                this.I00iiI[this.I00iiO - 1] = 5;
/* 60 */                return;
                    }
/* 18 */            if (iPeek != 6) {
/* 20 */                if (iPeek != 7) {
/* 35 */                    I000II.I001IO000("Nesting problem.");
/* 38 */                    return;
                        } else if (this.I00ioIO != 1) {
/* 29 */                    I000II.I001IO000("JSON must have only one top-level value.");
/* 32 */                    return;
                        }
                    }
/* 44 */            this.I00iiI[this.I00iiO - 1] = 7;
                }

                public void I0000Il00O() throws IOException {
/* 1 */             I00iiI();
/* 4 */             I00000oIO();
/* 7 */             int i = this.I00iiO;
/* 9 */             int[] iArrCopyOf = this.I00iiI;
/* 12 */            if (i == iArrCopyOf.length) {
/* 16 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
/* 20 */                this.I00iiI = iArrCopyOf;
                    }
/* 22 */            int i2 = this.I00iiO;
/* 26 */            this.I00iiO = i2 + 1;
/* 29 */            iArrCopyOf[i2] = 1;
/* 35 */            this.I00iOIl.write(91);
                }

                public void I000II() throws IOException {
/* 1 */             I00iiI();
/* 4 */             I00000oIO();
/* 7 */             int i = this.I00iiO;
/* 9 */             int[] iArrCopyOf = this.I00iiI;
/* 12 */            if (i == iArrCopyOf.length) {
/* 16 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
/* 20 */                this.I00iiI = iArrCopyOf;
                    }
/* 22 */            int i2 = this.I00iiO;
/* 26 */            this.I00iiO = i2 + 1;
/* 29 */            iArrCopyOf[i2] = 3;
/* 35 */            this.I00iOIl.write(123);
                }

                public final void I000O01llI0(int i, int i2, char c) throws IOException {
/* 1 */             int iPeek = peek();
/* 5 */             if (iPeek != i2 && iPeek != i) {
/* 12 */                I000II.I001IO000("Nesting problem.");
/* 15 */                return;
                    }
/* 18 */            if (this.I00l0OO0IO != null) {
/* 41 */                IoOOl0iOl1io.I0010I0i("Dangling name: ", this.I00l0OO0IO);
/* 215 */               return;
                    }
                    this.I00iiO--;
/* 26 */            if (iPeek == i2) {
/* 28 */                I001l0I00();
                    }
/* 33 */            this.I00iOIl.write(c);
                }

                public void I000l1() throws IOException {
/* 5 */             I000O01llI0(1, 2, ']');
                }

                public void I00100l0() throws IOException {
/* 5 */             I000O01llI0(3, 5, '}');
                }

                public void I001i1lo1io(String str) {
/* 3 */             Objects.requireNonNull(str, "name == null");
/* 8 */             if (this.I00l0OO0IO != null) {
/* 32 */                I000II.I001IO000("Already wrote a name, expecting a value.");
/* 49 */                return;
                    }
/* 10 */            int iPeek = peek();
/* 15 */            if (iPeek == 3 || iPeek == 5) {
/* 27 */                this.I00l0OO0IO = str;
                    } else {
/* 23 */                I000II.I001IO000("Please begin an object before writing a name.");
                    }
                }

                public final void I001l0I00() throws IOException {
/* 3 */             if (this.I00io1l) {
/* 113 */               return;
                    }
/* 8 */             String str = this.I00iio.I00000oIO;
/* 10 */            Writer writer = this.I00iOIl;
/* 12 */            writer.write(str);
/* 15 */            int i = this.I00iiO;
/* 18 */            for (int i2 = 1; i2 < i; i2++) {
/* 24 */                writer.write(this.I00iio.I00000oOI);
                    }
                }

                public O01ooi1IIiiO I00IOO() throws IOException {
/* 3 */             if (this.I00l0OO0IO != null) {
/* 7 */                 if (!this.I00li1OI) {
/* 14 */                    this.I00l0OO0IO = null;
/* 16 */                    return this;
                        }
/* 9 */                 I00iiI();
                    }
/* 17 */            I00000oIO();
/* 24 */            this.I00iOIl.write("null");
/* 29 */            return this;
                }

                public final void I00IioO0OiOi(IlioO1 ilioO1) {
/* 1 */             Objects.requireNonNull(ilioO1);
/* 4 */             this.I00iio = ilioO1;
/* 8 */             this.I00ilO0 = ",";
/* 12 */            if (ilioO1.I0000Il00O) {
/* 16 */                this.I00ilI0I1 = ": ";
/* 24 */                if (ilioO1.I00000oIO.isEmpty()) {
/* 28 */                    this.I00ilO0 = ", ";
                        }
                    } else {
/* 33 */                this.I00ilI0I1 = ":";
                    }
/* 58 */            this.I00io1l = this.I00iio.I00000oIO.isEmpty() && this.I00iio.I00000oOI.isEmpty();
                }

                public final void I00Io1lO(int i) {
/* 1 */             if (i == 0) {
/* 49 */                throw null;
                    }
/* 3 */             this.I00ioIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IoiI(String str) throws IOException {
                    String str2;
/* 8 */             String[] strArr = this.I00l0I0l0lO1 ? I00lll10 : I00lli11;
/* 10 */            Writer writer = this.I00iOIl;
/* 14 */            writer.write(34);
/* 17 */            int length = str.length();
/* 22 */            int i = 0;
/* 23 */            for (int i2 = 0; i2 < length; i2++) {
/* 25 */                char cCharAt = str.charAt(i2);
/* 31 */                if (cCharAt < 128) {
/* 33 */                    str2 = strArr[cCharAt];
/* 35 */                    if (str2 != null) {
/* 51 */                        if (i < i2) {
/* 55 */                            writer.write(str, i, i2 - i);
                                }
/* 58 */                        writer.write(str2);
/* 61 */                        i = i2 + 1;
                            }
                        } else {
/* 40 */                    if (cCharAt == 8232) {
/* 42 */                        str2 = "\\u2028";
                            } else if (cCharAt == 8233) {
/* 49 */                        str2 = "\\u2029";
                            }
/* 51 */                    if (i < i2) {
                            }
/* 58 */                    writer.write(str2);
/* 61 */                    i = i2 + 1;
                        }
                    }
/* 66 */            if (i < length) {
/* 69 */                writer.write(str, i, length - i);
                    }
/* 72 */            writer.write(34);
                }

                public void I00OIl(long j) throws IOException {
/* 1 */             I00iiI();
/* 4 */             I00000oIO();
/* 13 */            this.I00iOIl.write(Long.toString(j));
                }

                public void I00OOll1(Number number) throws IOException {
/* 1 */             if (number == null) {
/* 3 */                 I00IOO();
/* 6 */                 return;
                    }
/* 7 */             I00iiI();
/* 10 */            String string = number.toString();
/* 14 */            Class<?> cls = number.getClass();
/* 20 */            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
/* 57 */                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
/* 108 */                   if (this.I00ioIO != 1) {
/* 117 */                       I000II.I000iOII("Numeric values must be finite, but was ".concat(string));
/* 120 */                       return;
                            }
                        } else if (cls != Float.class && cls != Double.class && !I00ll1.matcher(string).matches()) {
/* 101 */                   OoOil11Ol1o.I0010o("String created by ", cls, " is not a valid JSON number: ", string);
/* 104 */                   return;
                        }
                    }
/* 121 */           I00000oIO();
/* 126 */           this.I00iOIl.append((CharSequence) string);
                }

                public void I00Ol00(String str) throws IOException {
/* 1 */             if (str == null) {
/* 3 */                 I00IOO();
/* 6 */                 return;
                    }
/* 7 */             I00iiI();
/* 10 */            I00000oIO();
/* 13 */            I00IoiI(str);
                }

                public void I00iOIl(boolean z) throws IOException {
/* 1 */             I00iiI();
/* 4 */             I00000oIO();
/* 16 */            this.I00iOIl.write(z ? "true" : "false");
                }

                public final void I00iiI() throws IOException {
/* 3 */             if (this.I00l0OO0IO != null) {
/* 5 */                 int iPeek = peek();
/* 10 */                if (iPeek == 5) {
/* 16 */                    this.I00iOIl.write(this.I00ilO0);
                        } else if (iPeek != 3) {
/* 46 */                    I000II.I001IO000("Nesting problem.");
/* 113 */                   return;
                        }
/* 23 */                I001l0I00();
/* 33 */                this.I00iiI[this.I00iiO - 1] = 4;
/* 37 */                I00IoiI(this.I00l0OO0IO);
/* 41 */                this.I00l0OO0IO = null;
                    }
                }

                @Override
                public void close() throws IOException {
/* 3 */             this.I00iOIl.close();
/* 6 */             int i = this.I00iiO;
/* 9 */             if (i > 1 || (i == 1 && this.I00iiI[i - 1] != 7)) {
/* 27 */                IioIoO10iOiI.I000OOo1O("Incomplete document");
                    } else {
/* 22 */                this.I00iiO = 0;
                    }
                }

                @Override
                public void flush() throws IOException {
/* 3 */             if (this.I00iiO != 0) {
/* 7 */                 this.I00iOIl.flush();
                    } else {
/* 13 */                I000II.I001IO000("JsonWriter is closed.");
                    }
                }

                public final int peek() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i != 0) {
/* 9 */                 return this.I00iiI[i - 1];
                    }
/* 14 */            I000II.I001IO000("JsonWriter is closed.");
/* 17 */            return 0;
                }
            }

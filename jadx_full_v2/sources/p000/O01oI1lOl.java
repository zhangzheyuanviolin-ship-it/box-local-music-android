            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            
/* 66 */    public final class O01oI1lOl extends O01ooIO00oio {
                private static final String[] REPLACEMENT_CHARS = new String[Barcode.FORMAT_ITF];
                private String deferredName;
                private String separator = ":";
                private final IIIIiol sink;

                public class I00000oIO implements Ol0i0olI {
                    public I00000oIO() {
                    }

                    @Override
                    public void close() {
/* 9 */                 if (O01oI1lOl.this.peekScope() != 9) {
/* 30 */                    OoOil11Ol1o.I0000Il00O();
/* 113 */                   return;
                        }
/* 11 */                O01oI1lOl o01oI1lOl = O01oI1lOl.this;
/* 13 */                int i = o01oI1lOl.stackSize;
/* 17 */                o01oI1lOl.stackSize = i - 1;
/* 19 */                int[] iArr = o01oI1lOl.pathIndices;
                        int i2 = i - 2;
/* 27 */                iArr[i2] = iArr[i2] + 1;
                    }

                    @Override
                    public void flush() {
/* 7 */                 O01oI1lOl.this.sink.flush();
                    }

                    @Override
                    public Oo11IoI timeout() {
/* 1 */                 return Oo11IoI.I0000O;
                    }

                    @Override
                    public void write(III1o0lOio0 iII1o0lOio0, long j) {
/* 7 */                 O01oI1lOl.this.sink.write(iII1o0lOio0, j);
                    }
                }

                static {
/* 10 */            for (int i = 0; i <= 31; i++) {
/* 28 */                REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
                    }
/* 33 */            String[] strArr = REPLACEMENT_CHARS;
/* 39 */            strArr[34] = "\\\"";
/* 45 */            strArr[92] = "\\\\";
/* 51 */            strArr[9] = "\\t";
/* 57 */            strArr[8] = "\\b";
/* 63 */            strArr[10] = "\\n";
/* 69 */            strArr[13] = "\\r";
/* 75 */            strArr[12] = "\\f";
                }

                public O01oI1lOl(IIIIiol iIIIiol) {
/* 8 */             if (iIIIiol == null) {
/* 19 */                IOOlIIilOl0.I000II("sink == null");
/* 49 */                throw null;
                    }
/* 10 */            this.sink = iIIIiol;
/* 13 */            pushScope(6);
                }

                private void beforeName() {
/* 1 */             int iPeekScope = peekScope();
/* 6 */             if (iPeekScope == 5) {
/* 12 */                this.sink.writeByte(44);
                    } else if (iPeekScope != 3) {
/* 29 */                I000II.I001IO000("Nesting problem.");
/* 113 */               return;
                    }
/* 19 */            newline();
/* 23 */            replaceTop(4);
                }

                private void beforeValue() {
/* 1 */             int iPeekScope = peekScope();
/* 6 */             int i = 2;
/* 7 */             if (iPeekScope == 1) {
/* 63 */                newline();
                    } else if (iPeekScope == 2) {
/* 60 */                this.sink.writeByte(44);
/* 63 */                newline();
                    } else if (iPeekScope == 4) {
/* 51 */                this.sink.I00OilO00Il(this.separator);
/* 54 */                i = 5;
                    } else {
/* 16 */                if (iPeekScope == 9) {
/* 43 */                    I000II.I001IO000("Sink from valueSink() was not closed");
/* 46 */                    return;
                        }
/* 19 */                i = 7;
/* 20 */                if (iPeekScope != 6) {
/* 22 */                    if (iPeekScope != 7) {
/* 37 */                        I000II.I001IO000("Nesting problem.");
/* 40 */                        return;
                            } else if (!this.lenient) {
/* 31 */                        I000II.I001IO000("JSON must have only one top-level value.");
/* 34 */                        return;
                            }
                        }
                    }
/* 66 */            replaceTop(i);
                }

                private O01ooIO00oio close(int i, int i2, char c) {
/* 1 */             int iPeekScope = peekScope();
/* 6 */             if (iPeekScope != i2 && iPeekScope != i) {
/* 13 */                I000II.I001IO000("Nesting problem.");
/* 5 */                 return null;
                    }
/* 19 */            if (this.deferredName != null) {
/* 64 */                IoOOl0iOl1io.I0010I0i("Dangling name: ", this.deferredName);
/* 5 */                 return null;
                    }
/* 21 */            int i3 = this.stackSize;
/* 25 */            int i4 = ~this.flattenStackSize;
/* 26 */            if (i3 == i4) {
/* 28 */                this.flattenStackSize = i4;
/* 30 */                return this;
                    }
                    int i5 = i3 - 1;
/* 33 */            this.stackSize = i5;
/* 37 */            this.pathNames[i5] = null;
/* 39 */            int[] iArr = this.pathIndices;
                    int i6 = i3 - 2;
/* 47 */            iArr[i6] = iArr[i6] + 1;
/* 49 */            if (iPeekScope == i2) {
/* 51 */                newline();
                    }
/* 56 */            this.sink.writeByte(c);
/* 59 */            return this;
                }

                private void newline() {
/* 3 */             if (this.indent == null) {
/* 29 */                return;
                    }
/* 10 */            this.sink.writeByte(10);
/* 13 */            int i = this.stackSize;
/* 16 */            for (int i2 = 1; i2 < i; i2++) {
/* 22 */                this.sink.I00OilO00Il(this.indent);
                    }
                }

                private O01ooIO00oio open(int i, int i2, char c) {
                    int i3;
/* 1 */             int i4 = this.stackSize;
/* 3 */             int i5 = this.flattenStackSize;
/* 5 */             if (i4 == i5 && ((i3 = this.scopes[i4 - 1]) == i || i3 == i2)) {
/* 18 */                this.flattenStackSize = ~i5;
/* 20 */                return this;
                    }
/* 21 */            beforeValue();
/* 24 */            checkStack();
/* 27 */            pushScope(i);
/* 37 */            this.pathIndices[this.stackSize - 1] = 0;
/* 41 */            this.sink.writeByte(c);
/* 215 */           return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void string(IIIIiol iIIIiol, String str) {
                    String str2;
/* 1 */             String[] strArr = REPLACEMENT_CHARS;
/* 5 */             iIIIiol.writeByte(34);
/* 8 */             int length = str.length();
/* 13 */            int i = 0;
/* 14 */            for (int i2 = 0; i2 < length; i2++) {
/* 16 */                char cCharAt = str.charAt(i2);
/* 22 */                if (cCharAt < 128) {
/* 24 */                    str2 = strArr[cCharAt];
/* 26 */                    if (str2 != null) {
/* 42 */                        if (i < i2) {
/* 44 */                            iIIIiol.I00iIi0i1o(i, i2, str);
                                }
/* 47 */                        iIIIiol.I00OilO00Il(str2);
/* 50 */                        i = i2 + 1;
                            }
                        } else {
/* 31 */                    if (cCharAt == 8232) {
/* 33 */                        str2 = "\\u2028";
                            } else if (cCharAt == 8233) {
/* 40 */                        str2 = "\\u2029";
                            }
/* 42 */                    if (i < i2) {
                            }
/* 47 */                    iIIIiol.I00OilO00Il(str2);
/* 50 */                    i = i2 + 1;
                        }
                    }
/* 55 */            if (i < length) {
/* 57 */                iIIIiol.I00iIi0i1o(i, length, str);
                    }
/* 60 */            iIIIiol.writeByte(34);
                }

                private void writeDeferredName() {
/* 3 */             if (this.deferredName != null) {
/* 5 */                 beforeName();
/* 12 */                string(this.sink, this.deferredName);
/* 16 */                this.deferredName = null;
                    }
                }

                @Override
                public O01ooIO00oio beginArray() {
/* 3 */             if (this.promoteValueToName) {
/* 23 */                IoOOl0iOl1io.I0010I0i("Array cannot be used as a map key in JSON at path ", getPath());
/* 26 */                return null;
                    }
/* 5 */             writeDeferredName();
/* 12 */            return open(1, 2, '[');
                }

                @Override
                public O01ooIO00oio beginObject() {
/* 3 */             if (this.promoteValueToName) {
/* 23 */                IoOOl0iOl1io.I0010I0i("Object cannot be used as a map key in JSON at path ", getPath());
/* 26 */                return null;
                    }
/* 5 */             writeDeferredName();
/* 12 */            return open(3, 5, '{');
                }

                @Override
                public O01ooIO00oio endArray() {
/* 5 */             return close(1, 2, ']');
                }

                @Override
                public O01ooIO00oio endObject() {
/* 2 */             this.promoteValueToName = false;
/* 8 */             return close(3, 5, '}');
                }

                @Override
                public void flush() {
/* 3 */             if (this.stackSize != 0) {
/* 7 */                 this.sink.flush();
                    } else {
/* 13 */                I000II.I001IO000("JsonWriter is closed.");
                    }
                }

                @Override
                public O01ooIO00oio name(String str) {
/* 2 */             if (str == null) {
/* 51 */                IOOlIIilOl0.I000II("name == null");
/* 1 */                 return null;
                    }
/* 6 */             if (this.stackSize == 0) {
/* 45 */                I000II.I001IO000("JsonWriter is closed.");
/* 1 */                 return null;
                    }
/* 8 */             int iPeekScope = peekScope();
/* 13 */            if ((iPeekScope != 3 && iPeekScope != 5) || this.deferredName != null || this.promoteValueToName) {
/* 39 */                I000II.I001IO000("Nesting problem.");
/* 1 */                 return null;
                    }
/* 26 */            this.deferredName = str;
/* 34 */            this.pathNames[this.stackSize - 1] = str;
/* 36 */            return this;
                }

                @Override
                public O01ooIO00oio nullValue() {
/* 4 */             if (this.promoteValueToName) {
/* 50 */                IoOOl0iOl1io.I0010I0i("null cannot be used as a map key in JSON at path ", getPath());
/* 3 */                 return null;
                    }
/* 8 */             if (this.deferredName != null) {
/* 12 */                if (!this.serializeNulls) {
/* 18 */                    this.deferredName = null;
/* 20 */                    return this;
                        }
/* 14 */                writeDeferredName();
                    }
/* 21 */            beforeValue();
/* 28 */            this.sink.I00OilO00Il("null");
/* 31 */            int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
/* 41 */            iArr[i] = iArr[i] + 1;
/* 43 */            return this;
                }

                @Override
                public void setIndent(String str) {
/* 1 */             super.setIndent(str);
/* 15 */            this.separator = !str.isEmpty() ? ": " : ":";
                }

                @Override
                public O01ooIO00oio value(Number number) {
/* 1 */             if (number == null) {
/* 3 */                 return nullValue();
                    }
/* 8 */             String string = number.toString();
/* 14 */            if (!this.lenient && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
/* 43 */                IioIoO10iOiI.I000OiO("Numeric values must be finite, but was ", number);
/* 46 */                return null;
                    }
/* 50 */            if (this.promoteValueToName) {
/* 53 */                this.promoteValueToName = false;
/* 55 */                return name(string);
                    }
/* 60 */            writeDeferredName();
/* 63 */            beforeValue();
/* 68 */            this.sink.I00OilO00Il(string);
/* 71 */            int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
/* 81 */            iArr[i] = iArr[i] + 1;
/* 186 */           return this;
                }

                @Override
                public IIIIiol valueSink() {
/* 3 */             if (this.promoteValueToName) {
/* 32 */                IoOOl0iOl1io.I0010I0i("BufferedSink cannot be used as a map key in JSON at path ", getPath());
/* 35 */                return null;
                    }
/* 5 */             writeDeferredName();
/* 8 */             beforeValue();
/* 13 */            pushScope(9);
/* 21 */            return l1l0I1OIOIO1.I00000oIO(new I00000oIO());
                }

                @Override
/* 67 */        public void close() throws IOException {
/* 68 */            this.sink.close();
/* 69 */            int i = this.stackSize;
/* 70 */            if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
/* 71 */                this.stackSize = 0;
                    } else {
/* 72 */                IioIoO10iOiI.I000OOo1O("Incomplete document");
                    }
                }

                @Override
/* 83 */        public O01ooIO00oio value(boolean z) {
/* 84 */            if (!this.promoteValueToName) {
/* 85 */                writeDeferredName();
/* 86 */                beforeValue();
/* 87 */                this.sink.I00OilO00Il(z ? "true" : "false");
/* 88 */                int[] iArr = this.pathIndices;
                        int i = this.stackSize - 1;
                        iArr[i] = iArr[i] + 1;
                        return this;
                    }
/* 89 */            IoOOl0iOl1io.I0010I0i("Boolean cannot be used as a map key in JSON at path ", getPath());
                    return null;
                }

                @Override
/* 90 */        public O01ooIO00oio value(Boolean bool) {
                    if (bool == null) {
/* 91 */                return nullValue();
                    }
/* 92 */            return value(bool.booleanValue());
                }

                @Override
/* 92 */        public O01ooIO00oio value(double d) {
/* 93 */            if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 94 */                IoOOl0iOl1io.I000II("Numeric values must be finite, but was ", d);
                        return null;
                    }
/* 95 */            if (this.promoteValueToName) {
/* 96 */                this.promoteValueToName = false;
/* 97 */                return name(Double.toString(d));
                    }
/* 98 */            writeDeferredName();
/* 99 */            beforeValue();
/* 100 */           this.sink.I00OilO00Il(Double.toString(d));
/* 101 */           int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                    return this;
                }

                @Override
/* 101 */       public O01ooIO00oio value(long j) {
/* 102 */           if (this.promoteValueToName) {
/* 103 */               this.promoteValueToName = false;
/* 104 */               return name(Long.toString(j));
                    }
/* 105 */           writeDeferredName();
/* 106 */           beforeValue();
/* 107 */           this.sink.I00OilO00Il(Long.toString(j));
/* 108 */           int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                    return this;
                }

                @Override
/* 108 */       public O01ooIO00oio value(String str) {
                    if (str == null) {
/* 109 */               return nullValue();
                    }
/* 110 */           if (this.promoteValueToName) {
/* 111 */               this.promoteValueToName = false;
/* 112 */               return name(str);
                    }
/* 113 */           writeDeferredName();
/* 114 */           beforeValue();
/* 115 */           string(this.sink, str);
/* 116 */           int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                    return this;
                }
            }

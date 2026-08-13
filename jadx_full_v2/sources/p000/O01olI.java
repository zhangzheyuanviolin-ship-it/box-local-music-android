            package p000;

            import java.io.IOException;
            import java.math.BigDecimal;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
/* 99 */    public final class O01olI extends O01ooIO00oio {
                private String deferredName;
                Object[] stack = new Object[32];

                public class I00000oIO extends Ill00IiiOIiO {
                    final III1o0lOio0 val$buffer;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public I00000oIO(Ol0i0olI ol0i0olI, III1o0lOio0 iII1o0lOio0) {
/* 5 */                 super(ol0i0olI);
/* 3 */                 this.val$buffer = iII1o0lOio0;
                    }

                    @Override
                    public void close() {
/* 9 */                 if (O01olI.this.peekScope() == 9) {
/* 11 */                    O01olI o01olI = O01olI.this;
/* 13 */                    Object[] objArr = o01olI.stack;
/* 15 */                    int i = o01olI.stackSize;
/* 19 */                    if (objArr[i] == null) {
/* 23 */                        o01olI.stackSize = i - 1;
/* 31 */                        Object jsonValue = O01lo1il.of(this.val$buffer).readJsonValue();
/* 35 */                        O01olI o01olI2 = O01olI.this;
/* 37 */                        boolean z = o01olI2.serializeNulls;
/* 39 */                        o01olI2.serializeNulls = true;
                                try {
/* 1 */                             o01olI2.add(jsonValue);
/* 44 */                            O01olI o01olI3 = O01olI.this;
/* 46 */                            o01olI3.serializeNulls = z;
/* 48 */                            int[] iArr = o01olI3.pathIndices;
/* 52 */                            int i2 = o01olI3.stackSize - 1;
/* 56 */                            iArr[i2] = iArr[i2] + 1;
/* 58 */                            return;
                                } catch (Throwable th) {
/* 62 */                            O01olI.this.serializeNulls = z;
/* 64 */                            throw th;
                                }
                            }
                        }
/* 65 */                OoOil11Ol1o.I0000Il00O();
                    }
                }

                public O01olI() {
/* 11 */            pushScope(6);
                }

                private O01olI add(Object obj) {
                    String str;
                    Object objPut;
/* 1 */             int iPeekScope = peekScope();
/* 5 */             int i = this.stackSize;
/* 9 */             if (i == 1) {
/* 12 */                if (iPeekScope != 6) {
/* 29 */                    I000II.I001IO000("JSON must have only one top-level value.");
/* 7 */                     return null;
                        }
/* 19 */                this.scopes[i - 1] = 7;
/* 24 */                this.stack[i - 1] = obj;
/* 26 */                return this;
                    }
/* 34 */            if (iPeekScope != 3 || (str = this.deferredName) == null) {
/* 112 */               if (iPeekScope == 1) {
/* 121 */                   ((List) this.stack[i - 1]).add(obj);
/* 124 */                   return this;
                        }
/* 127 */               if (iPeekScope == 9) {
/* 131 */                   I000II.I001IO000("Sink from valueSink() was not closed");
/* 7 */                     return null;
                        }
/* 137 */               I000II.I001IO000("Nesting problem.");
/* 7 */                 return null;
                    }
/* 40 */            if ((obj == null && !this.serializeNulls) || (objPut = ((Map) this.stack[i - 1]).put(str, obj)) == null) {
/* 59 */                this.deferredName = null;
/* 61 */                return this;
                    }
/* 111 */           throw new IllegalArgumentException("Map key '" + this.deferredName + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
                }

                @Override
                public O01ooIO00oio beginArray() {
/* 3 */             if (this.promoteValueToName) {
/* 55 */                IoOOl0iOl1io.I0010I0i("Array cannot be used as a map key in JSON at path ", getPath());
/* 58 */                return null;
                    }
/* 5 */             int i = this.stackSize;
/* 7 */             int i2 = this.flattenStackSize;
/* 10 */            if (i == i2 && this.scopes[i - 1] == 1) {
/* 20 */                this.flattenStackSize = ~i2;
/* 22 */                return this;
                    }
/* 23 */            checkStack();
/* 28 */            ArrayList arrayList = new ArrayList();
/* 31 */            add(arrayList);
/* 34 */            Object[] objArr = this.stack;
/* 36 */            int i3 = this.stackSize;
/* 38 */            objArr[i3] = arrayList;
/* 43 */            this.pathIndices[i3] = 0;
/* 45 */            pushScope(1);
/* 48 */            return this;
                }

                @Override
                public O01ooIO00oio beginObject() {
/* 3 */             if (this.promoteValueToName) {
/* 51 */                IoOOl0iOl1io.I0010I0i("Object cannot be used as a map key in JSON at path ", getPath());
/* 54 */                return null;
                    }
/* 5 */             int i = this.stackSize;
/* 7 */             int i2 = this.flattenStackSize;
/* 10 */            if (i == i2 && this.scopes[i - 1] == 3) {
/* 21 */                this.flattenStackSize = ~i2;
/* 23 */                return this;
                    }
/* 24 */            checkStack();
/* 29 */            O100I1lloo o100I1lloo = new O100I1lloo();
/* 32 */            add(o100I1lloo);
/* 39 */            this.stack[this.stackSize] = o100I1lloo;
/* 41 */            pushScope(3);
/* 44 */            return this;
                }

                @Override
                public void close() throws IOException {
/* 1 */             int i = this.stackSize;
/* 4 */             if (i > 1 || (i == 1 && this.scopes[i - 1] != 7)) {
/* 22 */                IioIoO10iOiI.I000OOo1O("Incomplete document");
                    } else {
/* 17 */                this.stackSize = 0;
                    }
                }

                @Override
                public O01ooIO00oio endArray() {
/* 7 */             if (peekScope() != 1) {
/* 40 */                I000II.I001IO000("Nesting problem.");
/* 5 */                 return null;
                    }
/* 9 */             int i = this.stackSize;
/* 11 */            int i2 = this.flattenStackSize;
/* 14 */            if (i == (~i2)) {
/* 17 */                this.flattenStackSize = ~i2;
/* 19 */                return this;
                    }
                    int i3 = i - 1;
/* 22 */            this.stackSize = i3;
/* 26 */            this.stack[i3] = null;
/* 28 */            int[] iArr = this.pathIndices;
                    int i4 = i - 2;
/* 35 */            iArr[i4] = iArr[i4] + 1;
/* 37 */            return this;
                }

                @Override
                public O01ooIO00oio endObject() {
/* 7 */             if (peekScope() != 3) {
/* 60 */                I000II.I001IO000("Nesting problem.");
/* 6 */                 return null;
                    }
/* 11 */            if (this.deferredName != null) {
/* 54 */                IoOOl0iOl1io.I0010I0i("Dangling name: ", this.deferredName);
/* 6 */                 return null;
                    }
/* 13 */            int i = this.stackSize;
/* 15 */            int i2 = this.flattenStackSize;
/* 18 */            if (i == (~i2)) {
/* 21 */                this.flattenStackSize = ~i2;
/* 23 */                return this;
                    }
/* 25 */            this.promoteValueToName = false;
                    int i3 = i - 1;
/* 29 */            this.stackSize = i3;
/* 33 */            this.stack[i3] = null;
/* 37 */            this.pathNames[i3] = null;
/* 39 */            int[] iArr = this.pathIndices;
                    int i4 = i - 2;
/* 47 */            iArr[i4] = iArr[i4] + 1;
/* 49 */            return this;
                }

                @Override
                public void flush() {
/* 3 */             if (this.stackSize != 0) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("JsonWriter is closed.");
                }

                @Override
                public O01ooIO00oio name(String str) {
/* 2 */             if (str == null) {
/* 48 */                IOOlIIilOl0.I000II("name == null");
/* 1 */                 return null;
                    }
/* 6 */             if (this.stackSize == 0) {
/* 42 */                I000II.I001IO000("JsonWriter is closed.");
/* 1 */                 return null;
                    }
/* 13 */            if (peekScope() != 3 || this.deferredName != null || this.promoteValueToName) {
/* 36 */                I000II.I001IO000("Nesting problem.");
/* 1 */                 return null;
                    }
/* 23 */            this.deferredName = str;
/* 31 */            this.pathNames[this.stackSize - 1] = str;
/* 33 */            return this;
                }

                @Override
                public O01ooIO00oio nullValue() {
/* 4 */             if (this.promoteValueToName) {
/* 28 */                IoOOl0iOl1io.I0010I0i("null cannot be used as a map key in JSON at path ", getPath());
/* 3 */                 return null;
                    }
/* 6 */             add(null);
/* 9 */             int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
/* 19 */            iArr[i] = iArr[i] + 1;
/* 21 */            return this;
                }

                public Object root() {
/* 1 */             int i = this.stackSize;
/* 4 */             if (i <= 1 && (i != 1 || this.scopes[i - 1] == 7)) {
/* 19 */                return this.stack[0];
                    }
/* 24 */            I000II.I001IO000("Incomplete document");
/* 27 */            return null;
                }

                @Override
                public O01ooIO00oio value(Number number) {
/* 3 */             if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
/* 96 */                return value(number.longValue());
                    }
/* 20 */            if ((number instanceof Float) || (number instanceof Double)) {
/* 87 */                return value(number.doubleValue());
                    }
/* 27 */            if (number == null) {
/* 29 */                return nullValue();
                    }
/* 47 */            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
/* 53 */            if (this.promoteValueToName) {
/* 56 */                this.promoteValueToName = false;
/* 62 */                return name(bigDecimal.toString());
                    }
/* 67 */            add(bigDecimal);
/* 70 */            int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
/* 80 */            iArr[i] = iArr[i] + 1;
/* 82 */            return this;
                }

                @Override
                public IIIIiol valueSink() {
/* 4 */             if (this.promoteValueToName) {
/* 44 */                IoOOl0iOl1io.I0010I0i("BufferedSink cannot be used as a map key in JSON at path ", getPath());
/* 3 */                 return null;
                    }
/* 12 */            if (peekScope() == 9) {
/* 34 */                I000II.I001IO000("Sink from valueSink() was not closed");
/* 3 */                 return null;
                    }
/* 14 */            pushScope(9);
/* 19 */            III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 27 */            return l1l0I1OIOIO1.I00000oIO(new I00000oIO(iII1o0lOio0, iII1o0lOio0));
                }

                @Override
/* 100 */       public O01ooIO00oio value(boolean z) {
/* 101 */           if (!this.promoteValueToName) {
/* 102 */               add(Boolean.valueOf(z));
/* 103 */               int[] iArr = this.pathIndices;
                        int i = this.stackSize - 1;
                        iArr[i] = iArr[i] + 1;
                        return this;
                    }
/* 104 */           IoOOl0iOl1io.I0010I0i("Boolean cannot be used as a map key in JSON at path ", getPath());
                    return null;
                }

                @Override
/* 105 */       public O01ooIO00oio value(Boolean bool) {
/* 106 */           if (!this.promoteValueToName) {
/* 107 */               add(bool);
/* 108 */               int[] iArr = this.pathIndices;
                        int i = this.stackSize - 1;
                        iArr[i] = iArr[i] + 1;
                        return this;
                    }
/* 109 */           IoOOl0iOl1io.I0010I0i("Boolean cannot be used as a map key in JSON at path ", getPath());
                    return null;
                }

                @Override
/* 110 */       public O01ooIO00oio value(double d) {
/* 111 */           if (!this.lenient && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
/* 113 */               IoOOl0iOl1io.I000II("Numeric values must be finite, but was ", d);
                        return null;
                    }
/* 114 */           if (this.promoteValueToName) {
/* 115 */               this.promoteValueToName = false;
/* 116 */               return name(Double.toString(d));
                    }
/* 117 */           add(Double.valueOf(d));
/* 118 */           int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                    return this;
                }

                @Override
/* 118 */       public O01ooIO00oio value(long j) {
/* 119 */           if (this.promoteValueToName) {
/* 120 */               this.promoteValueToName = false;
/* 121 */               return name(Long.toString(j));
                    }
/* 122 */           add(Long.valueOf(j));
/* 123 */           int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                    return this;
                }

                @Override
/* 123 */       public O01ooIO00oio value(String str) {
/* 124 */           if (this.promoteValueToName) {
/* 125 */               this.promoteValueToName = false;
/* 126 */               return name(str);
                    }
/* 127 */           add(str);
/* 128 */           int[] iArr = this.pathIndices;
                    int i = this.stackSize - 1;
                    iArr[i] = iArr[i] + 1;
                    return this;
                }
            }

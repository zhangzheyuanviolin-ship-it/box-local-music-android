            package p000;

            import java.io.Closeable;
            import java.io.Flushable;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class O01ooIO00oio implements Closeable, Flushable {
                String indent;
                boolean lenient;
                boolean promoteValueToName;
                boolean serializeNulls;
                private Map<Class<?>, Object> tags;
                int stackSize = 0;
                int[] scopes = new int[32];
                String[] pathNames = new String[32];
                int[] pathIndices = new int[32];
                int flattenStackSize = -1;

                public static O01ooIO00oio of(IIIIiol iIIIiol) {
/* 3 */             return new O01oI1lOl(iIIIiol);
                }

                public abstract O01ooIO00oio beginArray();

                public final int beginFlatten() {
/* 1 */             int iPeekScope = peekScope();
/* 6 */             if (iPeekScope != 5 && iPeekScope != 3 && iPeekScope != 2 && iPeekScope != 1) {
/* 20 */                I000II.I001IO000("Nesting problem.");
/* 23 */                return 0;
                    }
/* 25 */            int i = this.flattenStackSize;
/* 29 */            this.flattenStackSize = this.stackSize;
/* 113 */           return i;
                }

                public abstract O01ooIO00oio beginObject();

                public final boolean checkStack() {
/* 1 */             int i = this.stackSize;
/* 3 */             int[] iArr = this.scopes;
/* 6 */             if (i != iArr.length) {
/* 8 */                 return false;
                    }
/* 12 */            if (i == 256) {
/* 113 */               throw new O01IiOo11l1o("Nesting too deep at " + getPath() + ": circular reference?");
                    }
/* 21 */            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
/* 23 */            String[] strArr = this.pathNames;
/* 34 */            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
/* 36 */            int[] iArr2 = this.pathIndices;
/* 45 */            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
/* 49 */            if (!(this instanceof O01olI)) {
/* 64 */                return true;
                    }
/* 51 */            O01olI o01olI = (O01olI) this;
/* 53 */            Object[] objArr = o01olI.stack;
/* 62 */            o01olI.stack = Arrays.copyOf(objArr, objArr.length * 2);
/* 64 */            return true;
                }

                public abstract O01ooIO00oio endArray();

                public final void endFlatten(int i) {
/* 1 */             this.flattenStackSize = i;
                }

                public abstract O01ooIO00oio endObject();

                public final String getIndent() {
/* 1 */             String str = this.indent;
                    return str != null ? str : "";
                }

                public final String getPath() {
/* 9 */             return O01o0IIOIo.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
                }

                public final boolean getSerializeNulls() {
/* 1 */             return this.serializeNulls;
                }

                public final boolean isLenient() {
/* 1 */             return this.lenient;
                }

                public final O01ooIO00oio jsonValue(Object obj) {
/* 3 */             if (obj instanceof Map) {
/* 5 */                 beginObject();
/* 22 */                for (Map.Entry entry : ((Map) obj).entrySet()) {
/* 30 */                    Object key = entry.getKey();
/* 36 */                    if (!(key instanceof String)) {
/* 62 */                        throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: ".concat(key.getClass().getName()));
                            }
/* 65 */                    name((String) key);
/* 72 */                    jsonValue(entry.getValue());
                        }
/* 76 */                endObject();
/* 79 */                return this;
                    }
/* 82 */            if (obj instanceof List) {
/* 84 */                beginArray();
/* 89 */                Iterator it = ((List) obj).iterator();
/* 97 */                while (it.hasNext()) {
/* 103 */                   jsonValue(it.next());
                        }
/* 107 */               endArray();
/* 110 */               return this;
                    }
/* 113 */           if (obj instanceof String) {
/* 117 */               value((String) obj);
/* 120 */               return this;
                    }
/* 123 */           if (obj instanceof Boolean) {
/* 131 */               value(((Boolean) obj).booleanValue());
/* 134 */               return this;
                    }
/* 137 */           if (obj instanceof Double) {
/* 145 */               value(((Double) obj).doubleValue());
/* 148 */               return this;
                    }
/* 151 */           if (obj instanceof Long) {
/* 159 */               value(((Long) obj).longValue());
/* 162 */               return this;
                    }
/* 165 */           if (obj instanceof Number) {
/* 169 */               value((Number) obj);
/* 172 */               return this;
                    }
/* 173 */           if (obj == null) {
/* 175 */               nullValue();
/* 178 */               return this;
                    }
/* 193 */           I000II.I000iOII("Unsupported type: ".concat(obj.getClass().getName()));
/* 196 */           return null;
                }

                public abstract O01ooIO00oio name(String str);

                public abstract O01ooIO00oio nullValue();

                public final int peekScope() {
/* 1 */             int i = this.stackSize;
/* 3 */             if (i != 0) {
/* 9 */                 return this.scopes[i - 1];
                    }
/* 14 */            I000II.I001IO000("JsonWriter is closed.");
/* 17 */            return 0;
                }

                public final void promoteValueToName() {
/* 1 */             int iPeekScope = peekScope();
/* 6 */             if (iPeekScope == 5 || iPeekScope == 3) {
/* 19 */                this.promoteValueToName = true;
                    } else {
/* 14 */                I000II.I001IO000("Nesting problem.");
                    }
                }

                public final void pushScope(int i) {
/* 1 */             int[] iArr = this.scopes;
/* 3 */             int i2 = this.stackSize;
/* 7 */             this.stackSize = i2 + 1;
/* 9 */             iArr[i2] = i;
                }

                public final void replaceTop(int i) {
/* 7 */             this.scopes[this.stackSize - 1] = i;
                }

                public void setIndent(String str) {
/* 5 */             if (str.isEmpty()) {
/* 8 */                 str = null;
                    }
/* 9 */             this.indent = str;
                }

                public final void setLenient(boolean z) {
/* 1 */             this.lenient = z;
                }

                public final void setSerializeNulls(boolean z) {
/* 1 */             this.serializeNulls = z;
                }

                public final <T> void setTag(Class<T> cls, T t) {
/* 9 */             if (!cls.isAssignableFrom(t.getClass())) {
/* 36 */                I000II.I000iOII("Tag value must be of type ".concat(cls.getName()));
/* 89 */                return;
                    }
/* 11 */            Map linkedHashMap = this.tags;
/* 13 */            if (linkedHashMap == null) {
/* 17 */                linkedHashMap = new LinkedHashMap();
/* 20 */                this.tags = linkedHashMap;
                    }
/* 22 */            linkedHashMap.put(cls, t);
                }

                public final <T> T tag(Class<T> cls) {
/* 1 */             Map<Class<?>, Object> map = this.tags;
/* 3 */             if (map == null) {
/* 5 */                 return null;
                    }
/* 7 */             return (T) map.get(cls);
                }

                public abstract O01ooIO00oio value(double d);

                public abstract O01ooIO00oio value(long j);

                public final O01ooIO00oio value(IIIIlO11I0lO iIIIlO11I0lO) {
/* 3 */             if (this.promoteValueToName) {
/* 36 */                IoOOl0iOl1io.I0010I0i("BufferedSource cannot be used as a map key in JSON at path ", getPath());
/* 39 */                return null;
                    }
/* 5 */             IIIIiol iIIIiolValueSink = valueSink();
                    try {
/* 9 */                 iIIIlO11I0lO.I00OIO1(iIIIiolValueSink);
/* 12 */                if (iIIIiolValueSink != null) {
/* 14 */                    iIIIiolValueSink.close();
                        }
/* 17 */                return this;
                    } catch (Throwable th) {
/* 19 */                if (iIIIiolValueSink != null) {
                            try {
/* 21 */                        iIIIiolValueSink.close();
                            } catch (Throwable th2) {
/* 26 */                        th.addSuppressed(th2);
                            }
                        }
/* 29 */                throw th;
                    }
                }

                public abstract O01ooIO00oio value(Boolean bool);

                public abstract O01ooIO00oio value(Number number);

                public abstract O01ooIO00oio value(String str);

                public abstract O01ooIO00oio value(boolean z);

                public abstract IIIIiol valueSink();
            }

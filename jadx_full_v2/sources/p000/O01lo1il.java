            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
/* 45 */    public abstract class O01lo1il implements Closeable {
                boolean failOnUnknown;
                boolean lenient;
                int[] pathIndices;
                String[] pathNames;
                int[] scopes;
                int stackSize;
                private Map<Class<?>, Object> tags;

                public static final class I00000oIO {
                    final OIil0IiIo doubleQuoteSuffix;
                    final String[] strings;

                    private I00000oIO(String[] strArr, OIil0IiIo oIil0IiIo) {
/* 4 */                 this.strings = strArr;
/* 6 */                 this.doubleQuoteSuffix = oIil0IiIo;
                    }

                    public static I00000oIO of(String... strArr) {
                        try {
/* 2 */                     IIOIIi1ilIO[] iIOIIi1ilIOArr = new IIOIIi1ilIO[strArr.length];
/* 6 */                     III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 11 */                    for (int i = 0; i < strArr.length; i++) {
/* 15 */                        O01oI1lOl.string(iII1o0lOio0, strArr[i]);
/* 18 */                        iII1o0lOio0.readByte();
/* 27 */                        iIOIIi1ilIOArr[i] = iII1o0lOio0.I00IOO(iII1o0lOio0.I00iiI);
                            }
/* 44 */                    return new I00000oIO((String[]) strArr.clone(), l1lIlIOOOl0o.I00000oOI(iIOIIi1ilIOArr));
                        } catch (IOException e) {
/* 49 */                    I000II.I000O01llI0(e);
/* 52 */                    return null;
                        }
                    }

                    public List<String> strings() {
/* 7 */                 return Collections.unmodifiableList(Arrays.asList(this.strings));
                    }
                }

                public enum I00000oOI {
                    BEGIN_ARRAY,
                    END_ARRAY,
                    BEGIN_OBJECT,
                    END_OBJECT,
                    NAME,
                    STRING,
                    NUMBER,
                    BOOLEAN,
                    NULL,
                    END_DOCUMENT
                }

                public O01lo1il(O01lo1il o01lo1il) {
/* 6 */             this.stackSize = o01lo1il.stackSize;
/* 16 */            this.scopes = (int[]) o01lo1il.scopes.clone();
/* 26 */            this.pathNames = (String[]) o01lo1il.pathNames.clone();
/* 36 */            this.pathIndices = (int[]) o01lo1il.pathIndices.clone();
/* 40 */            this.lenient = o01lo1il.lenient;
/* 44 */            this.failOnUnknown = o01lo1il.failOnUnknown;
                }

                public static O01lo1il of(IIIIlO11I0lO iIIIlO11I0lO) {
/* 3 */             return new O01o1ol0OI1(iIIIlO11I0lO);
                }

                public abstract void beginArray();

                public abstract void beginObject();

                public abstract void endArray();

                public abstract void endObject();

                public final boolean failOnUnknown() {
/* 1 */             return this.failOnUnknown;
                }

                public final String getPath() {
/* 9 */             return O01o0IIOIo.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
                }

                public abstract boolean hasNext();

                public final boolean isLenient() {
/* 1 */             return this.lenient;
                }

                public abstract boolean nextBoolean();

                public abstract double nextDouble();

                public abstract int nextInt();

                public abstract long nextLong();

                public abstract String nextName();

                public abstract <T> T nextNull();

                public abstract IIIIlO11I0lO nextSource();

                public abstract String nextString();

                public abstract I00000oOI peek();

                public abstract O01lo1il peekJson();

                public abstract void promoteNameToValue();

                public final void pushScope(int i) {
/* 1 */             int i2 = this.stackSize;
/* 3 */             int[] iArr = this.scopes;
/* 6 */             if (i2 == iArr.length) {
/* 10 */                if (i2 == 256) {
/* 52 */                    IoOOl0iOl1io.I000oI1ioi("Nesting too deep at ", getPath());
/* 55 */                    return;
                        }
/* 19 */                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
/* 21 */                String[] strArr = this.pathNames;
/* 32 */                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
/* 34 */                int[] iArr2 = this.pathIndices;
/* 43 */                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
                    }
/* 56 */            int[] iArr3 = this.scopes;
/* 58 */            int i3 = this.stackSize;
/* 62 */            this.stackSize = i3 + 1;
/* 64 */            iArr3[i3] = i;
                }

                public final Object readJsonValue() {
                    switch (O01llo1l1.$SwitchMap$com$squareup$moshi$JsonReader$Token[peek().ordinal()]) {
                        case 1:
/* 145 */                   ArrayList arrayList = new ArrayList();
/* 148 */                   beginArray();
/* 155 */                   while (hasNext()) {
/* 161 */                       arrayList.add(readJsonValue());
                            }
/* 165 */                   endArray();
/* 168 */                   return arrayList;
                        case 2:
/* 71 */                    O100I1lloo o100I1lloo = new O100I1lloo();
/* 74 */                    beginObject();
/* 81 */                    while (hasNext()) {
/* 83 */                        String strNextName = nextName();
/* 87 */                        Object jsonValue = readJsonValue();
/* 91 */                        Object objPut = o100I1lloo.put(strNextName, jsonValue);
/* 95 */                        if (objPut != null) {
/* 104 */                           StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Map key '", strNextName, "' has multiple values at path ");
/* 112 */                           sbI001IIilI0O.append(getPath());
/* 117 */                           sbI001IIilI0O.append(": ");
/* 120 */                           sbI001IIilI0O.append(objPut);
/* 125 */                           sbI001IIilI0O.append(" and ");
/* 128 */                           sbI001IIilI0O.append(jsonValue);
/* 138 */                           throw new O01IiOo11l1o(sbI001IIilI0O.toString());
                                }
                            }
/* 139 */                   endObject();
/* 142 */                   return o100I1lloo;
                        case 3:
/* 64 */                    return nextString();
                        case 4:
/* 59 */                    return Double.valueOf(nextDouble());
                        case 5:
/* 50 */                    return Boolean.valueOf(nextBoolean());
                        case 6:
/* 41 */                    return nextNull();
                        default:
/* 20 */                    StringBuilder sb = new StringBuilder("Expected a value but was ");
/* 27 */                    sb.append(peek());
/* 36 */                    IoOOl0iOl1io.I000lI(sb, " at path ", getPath());
/* 39 */                    return null;
                    }
                }

                public abstract int selectName(I00000oIO i00000oIO);

                public abstract int selectString(I00000oIO i00000oIO);

                public final void setFailOnUnknown(boolean z) {
/* 1 */             this.failOnUnknown = z;
                }

                public final void setLenient(boolean z) {
/* 1 */             this.lenient = z;
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

                public abstract void skipName();

                public abstract void skipValue();

                public final O01Ol0I syntaxError(String str) throws O01Ol0I {
/* 49 */            throw new O01Ol0I(str + " at path " + getPath());
                }

                public final <T> T tag(Class<T> cls) {
/* 1 */             Map<Class<?>, Object> map = this.tags;
/* 3 */             if (map == null) {
/* 5 */                 return null;
                    }
/* 7 */             return (T) map.get(cls);
                }

                public final O01IiOo11l1o typeMismatch(Object obj, Object obj2) {
/* 3 */             if (obj == null) {
/* 31 */                return new O01IiOo11l1o("Expected " + obj2 + " but was null at path " + getPath());
                    }
/* 85 */            return new O01IiOo11l1o("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
                }

/* 46 */        public O01lo1il() {
/* 48 */            this.scopes = new int[32];
/* 49 */            this.pathNames = new String[32];
/* 50 */            this.pathIndices = new int[32];
                }
            }

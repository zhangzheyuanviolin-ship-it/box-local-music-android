            package p000;

            import java.io.IOException;
            import java.math.BigDecimal;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.O01lo1il;
            
/* 37 */    public final class O01oiIi1 extends O01lo1il {
                private static final Object JSON_READER_CLOSED = new Object();
                private Object[] stack;

                public static final class I00000oIO implements Iterator, Cloneable {
                    final Object[] array;
                    final O01lo1il.I00000oOI endToken;
                    int next;

                    public I00000oIO(O01lo1il.I00000oOI i00000oOI, Object[] objArr, int i) {
/* 4 */                 this.endToken = i00000oOI;
/* 6 */                 this.array = objArr;
/* 8 */                 this.next = i;
                    }

                    public I00000oIO m35clone() {
/* 9 */                 return new I00000oIO(this.endToken, this.array, this.next);
                    }

                    @Override
                    public boolean hasNext() {
                        return this.next < this.array.length;
                    }

                    @Override
                    public Object next() {
/* 1 */                 Object[] objArr = this.array;
/* 3 */                 int i = this.next;
/* 7 */                 this.next = i + 1;
/* 9 */                 return objArr[i];
                    }

                    @Override
                    public void remove() {
/* 29 */                throw new UnsupportedOperationException();
                    }
                }

                public O01oiIi1(O01oiIi1 o01oiIi1) {
/* 1 */             super(o01oiIi1);
/* 12 */            this.stack = (Object[]) o01oiIi1.stack.clone();
/* 17 */            for (int i = 0; i < this.stackSize; i++) {
/* 19 */                Object[] objArr = this.stack;
/* 21 */                Object obj = objArr[i];
/* 25 */                if (obj instanceof I00000oIO) {
/* 33 */                    objArr[i] = ((I00000oIO) obj).m35clone();
                        }
                    }
                }

                private void push(Object obj) {
/* 1 */             int i = this.stackSize;
/* 3 */             Object[] objArrCopyOf = this.stack;
/* 6 */             if (i == objArrCopyOf.length) {
/* 10 */                if (i == 256) {
/* 65 */                    IoOOl0iOl1io.I000oI1ioi("Nesting too deep at ", getPath());
/* 68 */                    return;
                        }
/* 12 */                int[] iArr = this.scopes;
/* 21 */                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
/* 23 */                String[] strArr = this.pathNames;
/* 34 */                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
/* 36 */                int[] iArr2 = this.pathIndices;
/* 45 */                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
/* 47 */                Object[] objArr = this.stack;
/* 52 */                objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
/* 56 */                this.stack = objArrCopyOf;
                    }
/* 69 */            int i2 = this.stackSize;
/* 73 */            this.stackSize = i2 + 1;
/* 75 */            objArrCopyOf[i2] = obj;
                }

                private void remove() {
/* 1 */             int i = this.stackSize;
                    int i2 = i - 1;
/* 5 */             this.stackSize = i2;
/* 7 */             Object[] objArr = this.stack;
/* 10 */            objArr[i2] = null;
/* 15 */            this.scopes[i2] = 0;
/* 17 */            if (i2 > 0) {
/* 19 */                int[] iArr = this.pathIndices;
                        int i3 = i - 2;
/* 27 */                iArr[i3] = iArr[i3] + 1;
/* 31 */                Object obj = objArr[i - 2];
/* 35 */                if (obj instanceof Iterator) {
/* 37 */                    Iterator it = (Iterator) obj;
/* 43 */                    if (it.hasNext()) {
/* 49 */                        push(it.next());
                            }
                        }
                    }
                }

                private <T> T require(Class<T> cls, O01lo1il.I00000oOI i00000oOI) {
/* 1 */             int i = this.stackSize;
/* 13 */            Object obj = i != 0 ? this.stack[i - 1] : null;
/* 18 */            if (cls.isInstance(obj)) {
/* 20 */                return cls.cast(obj);
                    }
/* 25 */            if (obj == null && i00000oOI == O01lo1il.I00000oOI.NULL) {
/* 3 */                 return null;
                    }
/* 34 */            if (obj != JSON_READER_CLOSED) {
/* 89 */                throw typeMismatch(obj, i00000oOI);
                    }
/* 38 */            I000II.I001IO000("JsonReader is closed");
/* 3 */             return null;
                }

                private String stringKey(Map.Entry<?, ?> entry) {
/* 1 */             Object key = entry.getKey();
/* 7 */             if (key instanceof String) {
/* 9 */                 return (String) key;
                    }
/* 49 */            throw typeMismatch(key, O01lo1il.I00000oOI.NAME);
                }

                @Override
                public void beginArray() {
/* 9 */             List list = (List) require(List.class, O01lo1il.I00000oOI.BEGIN_ARRAY);
/* 26 */            I00000oIO i00000oIO = new I00000oIO(O01lo1il.I00000oOI.END_ARRAY, list.toArray(new Object[list.size()]), 0);
/* 29 */            Object[] objArr = this.stack;
/* 31 */            int i = this.stackSize;
/* 35 */            objArr[i - 1] = i00000oIO;
/* 42 */            this.scopes[i - 1] = 1;
/* 47 */            this.pathIndices[i - 1] = 0;
/* 53 */            if (i00000oIO.hasNext()) {
/* 59 */                push(i00000oIO.next());
                    }
                }

                @Override
                public void beginObject() {
/* 9 */             Map map = (Map) require(Map.class, O01lo1il.I00000oOI.BEGIN_OBJECT);
/* 30 */            I00000oIO i00000oIO = new I00000oIO(O01lo1il.I00000oOI.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
/* 33 */            Object[] objArr = this.stack;
/* 35 */            int i = this.stackSize;
/* 39 */            objArr[i - 1] = i00000oIO;
/* 46 */            this.scopes[i - 1] = 3;
/* 52 */            if (i00000oIO.hasNext()) {
/* 58 */                push(i00000oIO.next());
                    }
                }

                @Override
                public void close() {
/* 7 */             Arrays.fill(this.stack, 0, this.stackSize, (Object) null);
/* 14 */            this.stack[0] = JSON_READER_CLOSED;
/* 20 */            this.scopes[0] = 8;
/* 23 */            this.stackSize = 1;
                }

                @Override
                public void endArray() {
/* 1 */             O01lo1il.I00000oOI i00000oOI = O01lo1il.I00000oOI.END_ARRAY;
/* 9 */             I00000oIO i00000oIO = (I00000oIO) require(I00000oIO.class, i00000oOI);
/* 13 */            if (i00000oIO.endToken != i00000oOI || i00000oIO.hasNext()) {
/* 29 */                throw typeMismatch(i00000oIO, i00000oOI);
                    }
/* 21 */            remove();
                }

                @Override
                public void endObject() {
/* 1 */             O01lo1il.I00000oOI i00000oOI = O01lo1il.I00000oOI.END_OBJECT;
/* 9 */             I00000oIO i00000oIO = (I00000oIO) require(I00000oIO.class, i00000oOI);
/* 13 */            if (i00000oIO.endToken != i00000oOI || i00000oIO.hasNext()) {
/* 113 */               throw typeMismatch(i00000oIO, i00000oOI);
                    }
/* 28 */            this.pathNames[this.stackSize - 1] = null;
/* 30 */            remove();
                }

                @Override
                public boolean hasNext() {
/* 1 */             int i = this.stackSize;
/* 4 */             if (i == 0) {
/* 3 */                 return false;
                    }
/* 11 */            Object obj = this.stack[i - 1];
                    return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
                }

                @Override
                public boolean nextBoolean() {
/* 9 */             Boolean bool = (Boolean) require(Boolean.class, O01lo1il.I00000oOI.BOOLEAN);
/* 11 */            remove();
/* 14 */            return bool.booleanValue();
                }

                @Override
                public double nextDouble() throws O01Ol0I, NumberFormatException {
                    double dDoubleValue;
/* 1 */             O01lo1il.I00000oOI i00000oOI = O01lo1il.I00000oOI.NUMBER;
/* 5 */             Object objRequire = require(Object.class, i00000oOI);
/* 11 */            if (objRequire instanceof Number) {
/* 15 */                dDoubleValue = ((Number) objRequire).doubleValue();
                    } else {
/* 22 */                if (!(objRequire instanceof String)) {
/* 113 */                   throw typeMismatch(objRequire, i00000oOI);
                        }
                        try {
/* 27 */                    dDoubleValue = Double.parseDouble((String) objRequire);
                        } catch (NumberFormatException unused) {
/* 90 */                    throw typeMismatch(objRequire, O01lo1il.I00000oOI.NUMBER);
                        }
                    }
/* 33 */            if (this.lenient || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
/* 80 */                remove();
/* 83 */                return dDoubleValue;
                    }
/* 79 */            throw new O01Ol0I("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
                }

                @Override
                public int nextInt() throws NumberFormatException {
                    int iIntValueExact;
/* 1 */             O01lo1il.I00000oOI i00000oOI = O01lo1il.I00000oOI.NUMBER;
/* 5 */             Object objRequire = require(Object.class, i00000oOI);
/* 11 */            if (objRequire instanceof Number) {
/* 15 */                iIntValueExact = ((Number) objRequire).intValue();
                    } else {
/* 22 */                if (!(objRequire instanceof String)) {
/* 113 */                   throw typeMismatch(objRequire, i00000oOI);
                        }
                        try {
                            try {
/* 27 */                        iIntValueExact = Integer.parseInt((String) objRequire);
                            } catch (NumberFormatException unused) {
/* 54 */                        throw typeMismatch(objRequire, O01lo1il.I00000oOI.NUMBER);
                            }
                        } catch (NumberFormatException unused2) {
/* 40 */                    iIntValueExact = new BigDecimal((String) objRequire).intValueExact();
                        }
                    }
/* 44 */            remove();
/* 47 */            return iIntValueExact;
                }

                @Override
                public long nextLong() throws NumberFormatException {
                    long jLongValueExact;
/* 1 */             O01lo1il.I00000oOI i00000oOI = O01lo1il.I00000oOI.NUMBER;
/* 5 */             Object objRequire = require(Object.class, i00000oOI);
/* 11 */            if (objRequire instanceof Number) {
/* 15 */                jLongValueExact = ((Number) objRequire).longValue();
                    } else {
/* 22 */                if (!(objRequire instanceof String)) {
/* 113 */                   throw typeMismatch(objRequire, i00000oOI);
                        }
                        try {
                            try {
/* 27 */                        jLongValueExact = Long.parseLong((String) objRequire);
                            } catch (NumberFormatException unused) {
/* 54 */                        throw typeMismatch(objRequire, O01lo1il.I00000oOI.NUMBER);
                            }
                        } catch (NumberFormatException unused2) {
/* 40 */                    jLongValueExact = new BigDecimal((String) objRequire).longValueExact();
                        }
                    }
/* 44 */            remove();
/* 47 */            return jLongValueExact;
                }

                @Override
                public String nextName() {
/* 9 */             Map.Entry<?, ?> entry = (Map.Entry) require(Map.Entry.class, O01lo1il.I00000oOI.NAME);
/* 11 */            String strStringKey = stringKey(entry);
/* 25 */            this.stack[this.stackSize - 1] = entry.getValue();
/* 33 */            this.pathNames[this.stackSize - 2] = strStringKey;
/* 113 */           return strStringKey;
                }

                @Override
                public <T> T nextNull() {
/* 5 */             require(Void.class, O01lo1il.I00000oOI.NULL);
/* 8 */             remove();
/* 11 */            return null;
                }

                @Override
                public IIIIlO11I0lO nextSource() throws IOException {
/* 1 */             Object jsonValue = readJsonValue();
/* 7 */             III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 10 */            O01ooIO00oio o01ooIO00oioOf = O01ooIO00oio.of(iII1o0lOio0);
                    try {
/* 14 */                o01ooIO00oioOf.jsonValue(jsonValue);
/* 17 */                o01ooIO00oioOf.close();
/* 20 */                return iII1o0lOio0;
                    } catch (Throwable th) {
/* 22 */                if (o01ooIO00oioOf != null) {
                            try {
/* 24 */                        o01ooIO00oioOf.close();
                            } catch (Throwable th2) {
/* 29 */                        th.addSuppressed(th2);
                            }
                        }
/* 113 */               throw th;
                    }
                }

                @Override
                public String nextString() {
/* 1 */             int i = this.stackSize;
/* 13 */            Object obj = i != 0 ? this.stack[i - 1] : null;
/* 16 */            if (obj instanceof String) {
/* 18 */                remove();
/* 21 */                return (String) obj;
                    }
/* 26 */            if (obj instanceof Number) {
/* 28 */                remove();
/* 31 */                return obj.toString();
                    }
/* 38 */            if (obj != JSON_READER_CLOSED) {
/* 113 */               throw typeMismatch(obj, O01lo1il.I00000oOI.STRING);
                    }
/* 42 */            I000II.I001IO000("JsonReader is closed");
/* 3 */             return null;
                }

                @Override
                public O01lo1il.I00000oOI peek() {
/* 1 */             int i = this.stackSize;
/* 3 */             if (i == 0) {
/* 5 */                 return O01lo1il.I00000oOI.END_DOCUMENT;
                    }
/* 12 */            Object obj = this.stack[i - 1];
/* 16 */            if (obj instanceof I00000oIO) {
/* 20 */                return ((I00000oIO) obj).endToken;
                    }
/* 25 */            if (obj instanceof List) {
/* 27 */                return O01lo1il.I00000oOI.BEGIN_ARRAY;
                    }
/* 32 */            if (obj instanceof Map) {
/* 34 */                return O01lo1il.I00000oOI.BEGIN_OBJECT;
                    }
/* 39 */            if (obj instanceof Map.Entry) {
/* 41 */                return O01lo1il.I00000oOI.NAME;
                    }
/* 46 */            if (obj instanceof String) {
/* 48 */                return O01lo1il.I00000oOI.STRING;
                    }
/* 53 */            if (obj instanceof Boolean) {
/* 55 */                return O01lo1il.I00000oOI.BOOLEAN;
                    }
/* 60 */            if (obj instanceof Number) {
/* 62 */                return O01lo1il.I00000oOI.NUMBER;
                    }
/* 65 */            if (obj == null) {
/* 67 */                return O01lo1il.I00000oOI.NULL;
                    }
/* 72 */            if (obj != JSON_READER_CLOSED) {
/* 113 */               throw typeMismatch(obj, "a JSON value");
                    }
/* 76 */            I000II.I001IO000("JsonReader is closed");
/* 79 */            return null;
                }

                @Override
                public O01lo1il peekJson() {
/* 3 */             return new O01oiIi1(this);
                }

                @Override
                public void promoteNameToValue() {
/* 5 */             if (hasNext()) {
/* 11 */                push(nextName());
                    }
                }

                @Override
                public int selectName(O01lo1il.I00000oIO i00000oIO) {
/* 9 */             Map.Entry<?, ?> entry = (Map.Entry) require(Map.Entry.class, O01lo1il.I00000oOI.NAME);
/* 11 */            String strStringKey = stringKey(entry);
/* 17 */            int length = i00000oIO.strings.length;
/* 19 */            for (int i = 0; i < length; i++) {
/* 29 */                if (i00000oIO.strings[i].equals(strStringKey)) {
/* 41 */                    this.stack[this.stackSize - 1] = entry.getValue();
/* 49 */                    this.pathNames[this.stackSize - 2] = strStringKey;
/* 51 */                    return i;
                        }
                    }
/* 55 */            return -1;
                }

                @Override
                public int selectString(O01lo1il.I00000oIO i00000oIO) {
/* 1 */             int i = this.stackSize;
/* 12 */            Object obj = i != 0 ? this.stack[i - 1] : null;
/* 17 */            if (!(obj instanceof String)) {
/* 21 */                if (obj != JSON_READER_CLOSED) {
/* 16 */                    return -1;
                        }
/* 26 */                I000II.I001IO000("JsonReader is closed");
/* 15 */                return 0;
                    }
/* 30 */            String str = (String) obj;
/* 34 */            int length = i00000oIO.strings.length;
/* 35 */            for (int i2 = 0; i2 < length; i2++) {
/* 45 */                if (i00000oIO.strings[i2].equals(str)) {
/* 47 */                    remove();
/* 50 */                    return i2;
                        }
                    }
/* 16 */            return -1;
                }

                @Override
                public void skipName() {
/* 3 */             if (!this.failOnUnknown) {
/* 25 */                this.stack[this.stackSize - 1] = ((Map.Entry) require(Map.Entry.class, O01lo1il.I00000oOI.NAME)).getValue();
/* 35 */                this.pathNames[this.stackSize - 2] = "null";
                    } else {
/* 38 */                O01lo1il.I00000oOI i00000oOIPeek = peek();
/* 42 */                nextName();
/* 49 */                StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
/* 52 */                sb.append(i00000oOIPeek);
/* 61 */                IoOOl0iOl1io.I00100o1O0lo(sb, " at ", getPath());
                    }
                }

                @Override
                public void skipValue() {
/* 3 */             if (this.failOnUnknown) {
/* 106 */               StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
/* 113 */               sb.append(peek());
/* 122 */               IoOOl0iOl1io.I00100o1O0lo(sb, " at ", getPath());
/* 541 */               return;
                    }
/* 5 */             int i = this.stackSize;
/* 8 */             if (i > 1) {
/* 16 */                this.pathNames[i - 2] = "null";
                    }
/* 27 */            Object obj = i != 0 ? this.stack[i - 1] : null;
/* 34 */            if (obj instanceof I00000oIO) {
/* 84 */                StringBuilder sb2 = new StringBuilder("Expected a value but was ");
/* 91 */                sb2.append(peek());
/* 98 */                IoOOl0iOl1io.I00100o1O0lo(sb2, " at path ", getPath());
                    } else if (obj instanceof Map.Entry) {
/* 40 */                Object[] objArr = this.stack;
/* 53 */                objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
                    } else {
/* 56 */                if (i > 0) {
/* 58 */                    remove();
/* 61 */                    return;
                        }
/* 64 */                StringBuilder sb3 = new StringBuilder("Expected a value but was ");
/* 71 */                sb3.append(peek());
/* 78 */                IoOOl0iOl1io.I00100o1O0lo(sb3, " at path ", getPath());
                    }
                }

/* 38 */        public O01oiIi1(Object obj) {
/* 40 */            int[] iArr = this.scopes;
                    int i = this.stackSize;
                    iArr[i] = 7;
/* 41 */            Object[] objArr = new Object[32];
                    this.stack = objArr;
/* 42 */            this.stackSize = i + 1;
                    objArr[i] = obj;
                }
            }

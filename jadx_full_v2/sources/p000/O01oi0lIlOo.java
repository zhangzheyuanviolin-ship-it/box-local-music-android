            package p000;

            import android.util.Base64;
            import android.util.JsonWriter;
            import java.io.IOException;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
/* 17 */    public final class O01oi0lIlOo implements OIOi0o, OoloiiOiiil {
                public boolean I00000oIO;
                public JsonWriter I00000oOI;
                public HashMap I0000Il00O;
                public HashMap I0000O;
                public O01IO1I0 I0000oI00;
                public boolean I0001Ioi1lo;

                public final O01oi0lIlOo I00000oIO(Object obj) {
/* 1 */             JsonWriter jsonWriter = this.I00000oOI;
/* 3 */             if (obj == null) {
/* 5 */                 jsonWriter.nullValue();
/* 8 */                 return this;
                    }
/* 11 */            if (obj instanceof Number) {
/* 15 */                jsonWriter.value((Number) obj);
/* 18 */                return this;
                    }
/* 27 */            if (!obj.getClass().isArray()) {
/* 159 */               if (obj instanceof Collection) {
/* 163 */                   jsonWriter.beginArray();
/* 166 */                   Iterator it = ((Collection) obj).iterator();
/* 174 */                   while (it.hasNext()) {
/* 180 */                       I00000oIO(it.next());
                            }
/* 184 */                   jsonWriter.endArray();
/* 187 */                   return this;
                        }
/* 190 */               if (obj instanceof Map) {
/* 194 */                   jsonWriter.beginObject();
/* 209 */                   for (Map.Entry entry : ((Map) obj).entrySet()) {
/* 217 */                       Object key = entry.getKey();
                                try {
/* 228 */                           I00000oOI((String) key, entry.getValue());
                                } catch (ClassCastException e) {
/* 252 */                           throw new Il0IO001iOOo(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                                }
                            }
/* 253 */                   jsonWriter.endObject();
/* 256 */                   return this;
                        }
/* 267 */               OIOi0lOI oIOi0lOI = (OIOi0lOI) this.I0000Il00O.get(obj.getClass());
/* 269 */               if (oIOi0lOI != null) {
/* 271 */                   jsonWriter.beginObject();
/* 274 */                   oIOi0lOI.encode(obj, this);
/* 277 */                   jsonWriter.endObject();
/* 280 */                   return this;
                        }
/* 291 */               OoloOoIl ooloOoIl = (OoloOoIl) this.I0000O.get(obj.getClass());
/* 293 */               if (ooloOoIl != null) {
/* 295 */                   ooloOoIl.encode(obj, this);
/* 298 */                   return this;
                        }
/* 301 */               if (obj instanceof Enum) {
/* 305 */                   String strName = ((Enum) obj).name();
/* 309 */                   I0000Il00O();
/* 312 */                   jsonWriter.value(strName);
/* 315 */                   return this;
                        }
/* 316 */               O01IO1I0 o01io1i0 = this.I0000oI00;
/* 318 */               jsonWriter.beginObject();
/* 321 */               o01io1i0.encode(obj, this);
/* 437 */               throw null;
                    }
/* 31 */            if (obj instanceof byte[]) {
/* 35 */                I0000Il00O();
/* 43 */                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
/* 46 */                return this;
                    }
/* 47 */            jsonWriter.beginArray();
/* 52 */            int i = 0;
/* 53 */            if (obj instanceof int[]) {
/* 57 */                int length = ((int[]) obj).length;
/* 58 */                while (i < length) {
/* 63 */                    jsonWriter.value(r6[i]);
/* 66 */                    i++;
                        }
                    } else if (obj instanceof long[]) {
/* 73 */                long[] jArr = (long[]) obj;
/* 75 */                int length2 = jArr.length;
/* 76 */                while (i < length2) {
/* 78 */                    long j = jArr[i];
/* 80 */                    I0000Il00O();
/* 83 */                    jsonWriter.value(j);
/* 86 */                    i++;
                        }
                    } else if (obj instanceof double[]) {
/* 93 */                double[] dArr = (double[]) obj;
/* 95 */                int length3 = dArr.length;
/* 96 */                while (i < length3) {
/* 100 */                   jsonWriter.value(dArr[i]);
/* 103 */                   i++;
                        }
                    } else if (obj instanceof boolean[]) {
/* 110 */               boolean[] zArr = (boolean[]) obj;
/* 112 */               int length4 = zArr.length;
/* 113 */               while (i < length4) {
/* 117 */                   jsonWriter.value(zArr[i]);
/* 120 */                   i++;
                        }
                    } else if (obj instanceof Number[]) {
/* 127 */               Number[] numberArr = (Number[]) obj;
/* 129 */               int length5 = numberArr.length;
/* 130 */               while (i < length5) {
/* 134 */                   I00000oIO(numberArr[i]);
/* 137 */                   i++;
                        }
                    } else {
/* 140 */               Object[] objArr = (Object[]) obj;
/* 142 */               int length6 = objArr.length;
/* 143 */               while (i < length6) {
/* 147 */                   I00000oIO(objArr[i]);
/* 150 */                   i++;
                        }
                    }
/* 153 */           jsonWriter.endArray();
/* 156 */           return this;
                }

                public final O01oi0lIlOo I00000oOI(String str, Object obj) throws IOException {
/* 1 */             JsonWriter jsonWriter = this.I00000oOI;
/* 5 */             if (this.I0001Ioi1lo) {
/* 7 */                 if (obj == null) {
/* 9 */                     return this;
                        }
/* 10 */                I0000Il00O();
/* 13 */                jsonWriter.name(str);
/* 16 */                I00000oIO(obj);
/* 19 */                return this;
                    }
/* 20 */            I0000Il00O();
/* 23 */            jsonWriter.name(str);
/* 26 */            if (obj == null) {
/* 28 */                jsonWriter.nullValue();
/* 31 */                return this;
                    }
/* 32 */            I00000oIO(obj);
/* 37 */            return this;
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00000oIO) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Parent context used since this context was created. Cannot use this context anymore.");
                }

                @Override
                public final OIOi0o add(IlIO00o1 ilIO00o1, int i) throws IOException {
/* 1 */             String str = ilIO00o1.I00000oIO;
/* 3 */             I0000Il00O();
/* 6 */             JsonWriter jsonWriter = this.I00000oOI;
/* 8 */             jsonWriter.name(str);
/* 11 */            I0000Il00O();
/* 15 */            jsonWriter.value(i);
/* 37 */            return this;
                }

                @Override
/* 18 */        public final OIOi0o add(IlIO00o1 ilIO00o1, long j) throws IOException {
/* 19 */            String str = ilIO00o1.I00000oIO;
/* 20 */            I0000Il00O();
/* 21 */            JsonWriter jsonWriter = this.I00000oOI;
                    jsonWriter.name(str);
/* 22 */            I0000Il00O();
/* 23 */            jsonWriter.value(j);
                    return this;
                }

                @Override
/* 23 */        public final OIOi0o add(IlIO00o1 ilIO00o1, Object obj) throws IOException {
/* 25 */            I00000oOI(ilIO00o1.I00000oIO, obj);
                    return this;
                }

                @Override
/* 25 */        public final OoloiiOiiil add(String str) throws IOException {
/* 26 */            I0000Il00O();
/* 27 */            this.I00000oOI.value(str);
                    return this;
                }

                @Override
/* 27 */        public final OoloiiOiiil add(boolean z) throws IOException {
/* 28 */            I0000Il00O();
/* 29 */            this.I00000oOI.value(z);
                    return this;
                }
            }

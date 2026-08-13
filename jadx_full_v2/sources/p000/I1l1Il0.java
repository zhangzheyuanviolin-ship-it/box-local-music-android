            package p000;

            import android.util.JsonReader;
            import android.util.JsonToken;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class I1l1Il0 {
                public long I00000oIO;

                public static I1l1Il0 I00000oIO(BufferedReader bufferedReader) throws IOException {
/* 3 */             JsonReader jsonReader = new JsonReader(bufferedReader);
                    try {
/* 6 */                 jsonReader.beginObject();
/* 13 */                while (jsonReader.hasNext()) {
/* 25 */                    if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
/* 33 */                        if (jsonReader.peek() == JsonToken.STRING) {
/* 39 */                            long j = Long.parseLong(jsonReader.nextString());
/* 45 */                            I1l1Il0 i1l1Il0 = new I1l1Il0();
/* 48 */                            i1l1Il0.I00000oIO = j;
/* 50 */                            VarHandle.storeStoreFence();
/* 56 */                            return i1l1Il0;
                                }
/* 59 */                        long jNextLong = jsonReader.nextLong();
/* 65 */                        I1l1Il0 i1l1Il02 = new I1l1Il0();
/* 68 */                        i1l1Il02.I00000oIO = jNextLong;
/* 70 */                        VarHandle.storeStoreFence();
/* 76 */                        return i1l1Il02;
                            }
/* 77 */                    jsonReader.skipValue();
                        }
/* 88 */                throw new IOException("Response is missing nextRequestWaitMillis field.");
                    } finally {
/* 89 */                jsonReader.close();
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
                    return (obj instanceof I1l1Il0) && this.I00000oIO == ((I1l1Il0) obj).I00000oIO;
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 12 */            return ((int) (j ^ (j >>> 32))) ^ 1000003;
                }

                public final String toString() {
/* 12 */            return IlIi0I0.I000o00OoI0I(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.I00000oIO, "}");
                }
            }

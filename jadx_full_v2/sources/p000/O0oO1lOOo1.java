            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.Properties;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class O0oO1lOOo1 {
                public static final Io0Ool I00000oOI = new Io0Ool("LibraryVersion", "");
                public static final O0oO1lOOo1 I0000Il00O;
                public ConcurrentHashMap I00000oIO;

                static {
/* 14 */            O0oO1lOOo1 o0oO1lOOo1 = new O0oO1lOOo1();
/* 22 */            o0oO1lOOo1.I00000oIO = new ConcurrentHashMap();
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I0000Il00O = o0oO1lOOo1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v11 */
                /* JADX WARN: Type inference failed for: r6v14 */
                /* JADX WARN: Type inference failed for: r6v15 */
                /* JADX WARN: Type inference failed for: r6v16 */
                /* JADX WARN: Type inference failed for: r6v17 */
                /* JADX WARN: Type inference failed for: r6v18 */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
                /* JADX WARN: Type inference failed for: r6v4 */
                /* JADX WARN: Type inference failed for: r6v5 */
                /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v8 */
                /* JADX WARN: Type inference failed for: r6v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I00000oIO(String str) throws Throwable {
                    IOException e;
                    Object obj;
                    InputStream resourceAsStream;
/* 3 */             Io0Ool io0Ool = I00000oOI;
/* 9 */             lII0I0I000I.I0000oI00(str, "Please provide a valid libraryName");
/* 16 */            ConcurrentHashMap concurrentHashMap = this.I00000oIO;
/* 22 */            if (concurrentHashMap.containsKey(str)) {
/* 28 */                return (String) concurrentHashMap.get(str);
                    }
/* 33 */            Properties properties = new Properties();
/* 36 */            ?? r6 = 0;
/* 36 */            r6 = 0;
/* 36 */            r6 = 0;
/* 36 */            r6 = 0;
/* 36 */            InputStream inputStream = null;
                    try {
                        try {
/* 56 */                    resourceAsStream = O0oO1lOOo1.class.getResourceAsStream("/" + str + ".properties");
                        } catch (Throwable th) {
/* 175 */                   th = th;
                        }
                    } catch (IOException e2) {
/* 173 */               e = e2;
/* 177 */               obj = null;
                    }
                    try {
/* 60 */                if (resourceAsStream != null) {
/* 62 */                    properties.load(resourceAsStream);
/* 67 */                    String property = properties.getProperty("version", null);
/* 92 */                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
/* 95 */                    sb.append(str);
/* 98 */                    sb.append(" version is ");
/* 101 */                   sb.append(property);
/* 104 */                   String string = sb.toString();
                            r6 = property;
/* 115 */                   if (Log.isLoggable(io0Ool.I00000oIO, 2)) {
/* 117 */                       io0Ool.I0000O(string);
                                r6 = property;
                            }
                        } else {
/* 140 */                   StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
/* 143 */                   sb2.append("Failed to get app version for libraryName: ");
/* 146 */                   sb2.append(str);
/* 149 */                   String string2 = sb2.toString();
/* 160 */                   if (Log.isLoggable(io0Ool.I00000oIO, 5)) {
/* 166 */                       Log.w("LibraryVersion", io0Ool.I0000O(string2));
                            }
                        }
                    } catch (IOException e3) {
/* 123 */               e = e3;
/* 124 */               Object obj2 = r6;
/* 125 */               inputStream = resourceAsStream;
/* 126 */               obj = obj2;
/* 190 */               StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
/* 193 */               sb3.append("Failed to get app version for libraryName: ");
/* 196 */               sb3.append(str);
/* 203 */               io0Ool.I00000oOI("LibraryVersion", sb3.toString(), e);
/* 206 */               InputStream inputStream2 = inputStream;
/* 207 */               r6 = obj;
/* 208 */               resourceAsStream = inputStream2;
/* 209 */               if (resourceAsStream != null) {
                        }
/* 214 */               if (r6 == 0) {
                        }
/* 223 */               concurrentHashMap.put(str, r6);
/* 226 */               return r6;
                    } catch (Throwable th2) {
/* 121 */               th = th2;
/* 170 */               r6 = resourceAsStream;
/* 227 */               if (r6 != 0) {
                            try {
/* 229 */                       r6.close();
                            } catch (IOException unused) {
                            }
                        }
/* 966 */               throw th;
                    }
/* 209 */           if (resourceAsStream != null) {
                        try {
/* 211 */                   resourceAsStream.close();
                        } catch (IOException unused2) {
                        }
                    }
/* 214 */           if (r6 == 0) {
/* 218 */               io0Ool.I00000oIO(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
/* 221 */               r6 = "UNKNOWN";
                    }
/* 223 */           concurrentHashMap.put(str, r6);
/* 226 */           return r6;
                }
            }

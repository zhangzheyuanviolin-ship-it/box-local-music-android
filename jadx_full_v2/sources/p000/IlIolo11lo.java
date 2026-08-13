            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.text.TextUtils;
            import android.util.JsonReader;
            import android.util.Log;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.util.concurrent.ExecutionException;
            import java.util.regex.Pattern;
            import java.util.zip.GZIPOutputStream;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class IlIolo11lo {
                public static final Pattern I0000O = Pattern.compile("[0-9]+s");
                public static final Charset I0000oI00 = Charset.forName("UTF-8");
                public Context I00000oIO;
                public OOiO0Il I00000oOI;
                public IooI0ilii I0000Il00O;

                public static URL I00000oIO(String str) {
                    try {
/* 9 */                 return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
                    } catch (MalformedURLException e) {
/* 49 */                throw new IlO0IilI1ii1(e.getMessage());
                    }
                }

                public static void I00000oOI(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
/* 1 */             InputStream errorStream = httpURLConnection.getErrorStream();
/* 5 */             String str4 = null;
/* 6 */             if (errorStream != null) {
/* 18 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, I0000oI00));
                        try {
/* 23 */                    StringBuilder sb = new StringBuilder();
                            while (true) {
/* 37 */                        String line = bufferedReader.readLine();
/* 27 */                        if (line == null) {
                                    break;
                                }
/* 29 */                        sb.append(line);
/* 34 */                        sb.append('\n');
                            }
/* 62 */                    str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            try {
/* 70 */                        bufferedReader.close();
                            } catch (IOException unused2) {
                            }
/* 73 */                    throw th;
                        }
                        try {
/* 66 */                    bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
/* 78 */            if (TextUtils.isEmpty(str4)) {
/* 483 */               return;
                    }
/* 82 */            Log.w("Firebase-Installations", str4);
/* 106 */           Log.w("Firebase-Installations", Oi010OO0.I001IO000("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : IIl001iO0Io.I000o00OoI0I(", ", str)));
                }

                public static long I0000O(String str) {
/* 13 */            lII0I0I000I.I00000oIO("Invalid Expiration Timestamp.", I0000O.matcher(str).matches());
/* 16 */            if (str == null || str.length() == 0) {
/* 41 */                return 0L;
                    }
/* 36 */            return Long.parseLong(str.substring(0, str.length() - 1));
                }

                public static I1l0lloO1l I0000oI00(HttpURLConnection httpURLConnection) throws IOException {
/* 1 */             InputStream inputStream = httpURLConnection.getInputStream();
/* 14 */            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, I0000oI00));
/* 20 */            byte b = (byte) (0 | 1);
/* 21 */            jsonReader.beginObject();
/* 25 */            long jI0000O = 0;
/* 27 */            String strNextString = null;
/* 28 */            String strNextString2 = null;
/* 29 */            String strNextString3 = null;
/* 30 */            I1lO0lOlOIi i1lO0lOlOIi = null;
/* 31 */            String strNextString4 = null;
/* 36 */            while (jsonReader.hasNext()) {
/* 38 */                String strNextName = jsonReader.nextName();
/* 48 */                if (strNextName.equals("name")) {
/* 50 */                    strNextString = jsonReader.nextString();
                        } else if (strNextName.equals("fid")) {
/* 63 */                    strNextString2 = jsonReader.nextString();
                        } else if (strNextName.equals("refreshToken")) {
/* 76 */                    strNextString3 = jsonReader.nextString();
                        } else if (strNextName.equals("authToken")) {
/* 89 */                    jsonReader.beginObject();
/* 96 */                    while (jsonReader.hasNext()) {
/* 98 */                        String strNextName2 = jsonReader.nextName();
/* 108 */                       if (strNextName2.equals("token")) {
/* 110 */                           strNextString4 = jsonReader.nextString();
                                } else if (strNextName2.equals("expiresIn")) {
/* 128 */                           jI0000O = I0000O(jsonReader.nextString());
/* 134 */                           b = (byte) (b | 1);
                                } else {
/* 136 */                           jsonReader.skipValue();
                                }
                            }
/* 140 */                   if (b != 1) {
/* 164 */                       I000II.I001IO000("Missing required properties: tokenExpirationTimestamp");
/* 24 */                        return null;
                            }
/* 144 */                   i1lO0lOlOIi = new I1lO0lOlOIi();
/* 147 */                   i1lO0lOlOIi.I00000oIO = strNextString4;
/* 149 */                   i1lO0lOlOIi.I00000oOI = jI0000O;
/* 152 */                   i1lO0lOlOIi.I0000Il00O = 0;
/* 154 */                   VarHandle.storeStoreFence();
/* 157 */                   jsonReader.endObject();
                        } else {
/* 168 */                   jsonReader.skipValue();
                        }
                    }
/* 173 */           jsonReader.endObject();
/* 176 */           jsonReader.close();
/* 179 */           inputStream.close();
/* 184 */           I1l0lloO1l i1l0lloO1l = new I1l0lloO1l();
/* 187 */           i1l0lloO1l.I00000oIO = strNextString;
/* 189 */           i1l0lloO1l.I00000oOI = strNextString2;
/* 191 */           i1l0lloO1l.I0000Il00O = strNextString3;
/* 193 */           i1l0lloO1l.I0000O = i1lO0lOlOIi;
/* 195 */           i1l0lloO1l.I0000oI00 = 1;
/* 197 */           VarHandle.storeStoreFence();
/* 966 */           return i1l0lloO1l;
                }

                public static I1lO0lOlOIi I0001Ioi1lo(HttpURLConnection httpURLConnection) throws IOException {
/* 1 */             InputStream inputStream = httpURLConnection.getInputStream();
/* 14 */            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, I0000oI00));
/* 20 */            byte b = (byte) (0 | 1);
/* 21 */            jsonReader.beginObject();
/* 25 */            long jI0000O = 0;
/* 27 */            String strNextString = null;
/* 32 */            while (jsonReader.hasNext()) {
/* 34 */                String strNextName = jsonReader.nextName();
/* 44 */                if (strNextName.equals("token")) {
/* 46 */                    strNextString = jsonReader.nextString();
                        } else if (strNextName.equals("expiresIn")) {
/* 63 */                    jI0000O = I0000O(jsonReader.nextString());
/* 69 */                    b = (byte) (b | 1);
                        } else {
/* 71 */                    jsonReader.skipValue();
                        }
                    }
/* 75 */            jsonReader.endObject();
/* 78 */            jsonReader.close();
/* 81 */            inputStream.close();
/* 84 */            if (b != 1) {
/* 103 */               I000II.I001IO000("Missing required properties: tokenExpirationTimestamp");
/* 24 */                return null;
                    }
/* 88 */            I1lO0lOlOIi i1lO0lOlOIi = new I1lO0lOlOIi();
/* 91 */            i1lO0lOlOIi.I00000oIO = strNextString;
/* 93 */            i1lO0lOlOIi.I00000oOI = jI0000O;
/* 95 */            i1lO0lOlOIi.I0000Il00O = 1;
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           return i1lO0lOlOIi;
                }

                public static void I000II(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 8 */                 jSONObject.put("fid", str);
/* 13 */                jSONObject.put("appId", str2);
/* 20 */                jSONObject.put("authVersion", "FIS_v2");
/* 27 */                jSONObject.put("sdkVersion", "a:19.1.2");
/* 40 */                I000OOo1O(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
                    } catch (JSONException e) {
/* 45 */                OoOil11Ol1o.I000oI1ioi(e);
                    }
                }

                public static void I000O01llI0(HttpURLConnection httpURLConnection) throws JSONException, IOException {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 10 */                jSONObject.put("sdkVersion", "a:19.1.2");
/* 15 */                JSONObject jSONObject2 = new JSONObject();
/* 20 */                jSONObject2.put("installation", jSONObject);
/* 33 */                I000OOo1O(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
                    } catch (JSONException e) {
/* 38 */                OoOil11Ol1o.I000oI1ioi(e);
                    }
                }

                public static void I000OOo1O(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
/* 1 */             OutputStream outputStream = httpURLConnection.getOutputStream();
/* 5 */             if (outputStream == null) {
/* 32 */                IioIoO10iOiI.I000OOo1O("Cannot send request to FIS servers. No OutputStream available.");
/* 89 */                return;
                    }
/* 9 */             GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
/* 12 */                gZIPOutputStream.write(bArr);
                    } finally {
                        try {
/* 23 */                    gZIPOutputStream.close();
/* 26 */                    outputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public final HttpURLConnection I0000Il00O(URL url, String str) {
/* 3 */             Context context = this.I00000oIO;
                    try {
/* 9 */                 HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
/* 13 */                httpURLConnection.setConnectTimeout(10000);
/* 17 */                httpURLConnection.setUseCaches(false);
/* 20 */                httpURLConnection.setReadTimeout(10000);
/* 27 */                httpURLConnection.addRequestProperty("Content-Type", "application/json");
/* 32 */                httpURLConnection.addRequestProperty("Accept", "application/json");
/* 39 */                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
/* 46 */                httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
/* 55 */                httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
/* 64 */                Io1OlOO io1OlOO = (Io1OlOO) this.I00000oOI.get();
/* 68 */                if (io1OlOO != null) {
                            try {
/* 84 */                        httpURLConnection.addRequestProperty("x-firebase-client", (String) lOio0o.I00000oIO(((Ii1oil) io1OlOO).I00000oIO()));
                            } catch (InterruptedException e) {
/* 96 */                        Thread.currentThread().interrupt();
/* 99 */                        Log.w("ContentValues", "Failed to get heartbeats header", e);
                            } catch (ExecutionException e2) {
/* 103 */                       Log.w("ContentValues", "Failed to get heartbeats header", e2);
                            }
                        }
/* 108 */               String strI00000oIO = null;
                        try {
/* 113 */                   byte[] bArrI00000oIO = iOO0100o.I00000oIO(context, context.getPackageName());
/* 117 */                   if (bArrI00000oIO == null) {
/* 135 */                       Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                            } else {
/* 141 */                       strI00000oIO = iIo0Ioi1lIl.I00000oIO(bArrI00000oIO);
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
/* 164 */                   Log.e("ContentValues", "No such package: " + context.getPackageName(), e3);
                        }
/* 169 */               httpURLConnection.addRequestProperty("X-Android-Cert", strI00000oIO);
/* 174 */               httpURLConnection.addRequestProperty("x-goog-api-key", str);
/* 177 */               return httpURLConnection;
                    } catch (IOException unused) {
/* 551 */               throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                    }
                }
            }

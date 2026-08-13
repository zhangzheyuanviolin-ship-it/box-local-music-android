            package p000;

            import android.util.Base64;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.nio.charset.StandardCharsets;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class iOliOoiOlI1 {
                public static final String I00000oOI;
                public String I00000oIO;

                static {
/* 4 */             byte[] bArrDecode = Base64.decode("opMaSwzKffHEPgAzu/wXmmAoBSQ+L5trn/RQom0", 3);
/* 10 */            byte[] bArrDecode2 = Base64.decode("oh/AACypu7EhHIzJlqtCgyEK8MToFuQ8E7pIO7A", 3);
/* 15 */            byte[] bArr = new byte[bArrDecode.length];
/* 19 */            for (int i = 0; i < bArrDecode.length; i++) {
/* 27 */                bArr[i] = (byte) (bArrDecode[i] ^ bArrDecode2[i]);
                    }
/* 36 */            I00000oOI = Base64.encodeToString(bArr, 3);
                }

                public final ii10lIloOOii I00000oIO(iOlOOO1 iolooo1, iOlii1iOOil iolii1iooil, String str, String str2) throws JSONException, IOException {
                    char c;
/* 3 */             iI1lI0i ii1li0i = iI1lI0i.RPC_RETURNED_MALFORMED_RESULT;
/* 13 */            iI1lI0i ii1li0i2 = iI1lI0i.RPC_CLIENT_ERROR;
/* 19 */            String str3 = this.I00000oIO;
                    try {
                        try {
/* 32 */                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://mobilemlaccelerationcompatibility.googleapis.com/v1/advisor?alt=PROTO").openConnection();
/* 36 */                    httpURLConnection.setConnectTimeout(5000);
/* 39 */                    httpURLConnection.setReadTimeout(5000);
/* 44 */                    httpURLConnection.setRequestProperty("Accept", "application/x-protobuf");
/* 49 */                    httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
/* 54 */                    httpURLConnection.setRequestMethod("POST");
/* 59 */                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str3);
                            try {
/* 64 */                        JSONObject jSONObject = new JSONObject();
/* 73 */                        jSONObject.put("installation_id", iolii1iooil.I00000oIO);
/* 80 */                        jSONObject.put("client", "MLKIT");
/* 87 */                        jSONObject.put("client_library", str);
/* 94 */                        jSONObject.put("client_library_version", str2);
/* 104 */                       JSONObject jSONObjectPut = new JSONObject().put("client_info", jSONObject);
/* 110 */                       iiillii1o iiillii1oVar = iolooo1.I00000oIO;
/* 112 */                       iiiloiIlo0o iiiloiilo0oI001IO000 = iiillii1oVar.I001IO000();
/* 116 */                       iiiliI1oIii0 iiilii1oiii0I00111O = iiillii1oVar.I00111O();
/* 245 */                       JSONObject jSONObjectPut2 = jSONObjectPut.put("android_info", new JSONObject().put("product", new JSONObject().put("device", iiiloiilo0oI001IO000.I001i1O0Ol()).put("product", iiiloiilo0oI001IO000.I001l0I00()).put("model", iiiloiilo0oI001IO000.I001iOo1i0O()).put("manufacturer", iiiloiilo0oI001IO000.I001i1lo1io()).put("brand", iiiloiilo0oI001IO000.I001IO000())).put("build", new JSONObject().put("os_version", iiilii1oiii0I00111O.I001iOo1i0O()).put("build_type", iiilii1oiii0I00111O.I001i1lo1io()).put("preview_sdk", iiilii1oiii0I00111O.I00111O()).put("build_id", iiilii1oiii0I00111O.I001i1O0Ol())).put("soc", iiillii1oVar.I001i1O0Ol()));
/* 251 */                       iiiooOiO01i iiioooio01i = iolooo1.I00000oOI;
/* 255 */                       JSONArray jSONArray = new JSONArray();
/* 270 */                       for (iiioOo0 iiiooo0 : iiioooio01i.I001IIilI0O()) {
/* 311 */                           jSONArray.put(new JSONObject().put("device", iiiooo0.I001IO000()).put("version", iiiooo0.I001i1O0Ol()).put("feature_level", iiiooo0.I00111O()));
                                }
/* 335 */                       JSONObject jSONObjectPut3 = jSONObjectPut2.put("nnapi_info", new JSONObject().put("nnapi_driver_versions", jSONArray)).put("model_namespace", "com.google.perception");
/* 339 */                       OutputStream outputStream = httpURLConnection.getOutputStream();
                                try {
/* 349 */                           byte[] bytes = jSONObjectPut3.toString().getBytes(StandardCharsets.UTF_8);
/* 355 */                           outputStream.write(bytes, 0, bytes.length);
/* 358 */                           outputStream.close();
                                    try {
/* 361 */                               httpURLConnection.connect();
/* 370 */                               if (httpURLConnection.getResponseCode() != 200) {
/* 494 */                                   throw new iOliOI1lO0i(iI1lI0i.RPC_ERROR, String.format("Error response (%d: '%s') from MlGoldblumServer", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage()));
                                        }
/* 372 */                               String headerField = httpURLConnection.getHeaderField("Content-Type");
/* 376 */                               if (headerField != null) {
/* 378 */                                   int length = headerField.length();
/* 382 */                                   if (headerField != "application/x-protobuf") {
/* 387 */                                       if (length == 22) {
/* 389 */                                           for (int i = 0; i < length; i++) {
/* 399 */                                               if (headerField.charAt(i) == "application/x-protobuf".charAt(i) || ((c = (char) ((r3 | ' ') - 97)) < 26 && c == ((char) ((r4 | ' ') - 97)))) {
                                                        }
                                                    }
                                                }
                                            }
                                            try {
/* 421 */                                       InputStream inputStream = httpURLConnection.getInputStream();
/* 425 */                                       ii0II11oi0I ii0ii11oi0i = ii0II11oi0I.I00000oOI;
/* 427 */                                       ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
/* 435 */                                       return iiilO1lo.I001IIilI0O(inputStream, ii0II11oi0I.I0000Il00O).I00111O();
                                            } catch (IOException e) {
/* 448 */                                       throw new iOliOI1lO0i(ii1li0i, "Error while reading response from MlGoldblum", e);
                                            }
                                        }
/* 464 */                               throw new iOliOI1lO0i(ii1li0i, "Invalid response from MlGoldblum, expected proto buf but got ".concat(String.valueOf(headerField)));
                                    } catch (IOException e2) {
/* 505 */                               throw new iOliOI1lO0i(iI1lI0i.NO_CONNECTION, "Error while requesting allowlist to MlGoldblum", e2);
                                    }
                                } finally {
                                }
                            } catch (IOException | JSONException e3) {
/* 526 */                       throw new iOliOI1lO0i(ii1li0i2, "Error creating request", e3);
                            }
                        } catch (IOException e4) {
/* 535 */                   throw new iOliOI1lO0i(ii1li0i2, "Error while building allowlist request to MlGoldblum", e4);
                        }
                    } catch (IOException e5) {
/* 1182 */              throw new iOliOI1lO0i(ii1li0i2, "Invalid URL built while trying to connect to MlGoldblum", e5);
                    }
                }
            }

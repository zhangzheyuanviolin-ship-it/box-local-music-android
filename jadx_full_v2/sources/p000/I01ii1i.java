            package p000;

            import android.view.Choreographer;
            import com.google.ai.edge.gallery.BuildConfig;
            import java.io.BufferedReader;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            public final class I01ii1i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01ii1i(int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
/* 3 */             super(i, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 50 */                    return new I01ii1i(2, iOoil1iiIilo, 0);
                        case 1:
/* 42 */                    return new I01ii1i(2, iOoil1iiIilo, 1);
                        case 2:
/* 34 */                    return new I01ii1i(2, iOoil1iiIilo, 2);
                        case 3:
/* 26 */                    return new I01ii1i(2, iOoil1iiIilo, 3);
                        case 4:
/* 18 */                    return new I01ii1i(2, iOoil1iiIilo, 4);
                        default:
/* 10 */                    return new I01ii1i(2, iOoil1iiIilo, 5);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 90 */                    ((I01ii1i) create((O00OoO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
/* 46 */                    ((I01ii1i) create((IlOil1ii) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 4:
/* 32 */                    ((I01ii1i) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I01ii1i) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object ool00Ill1OOi;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 255 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 257 */                   lIoii1l01l0i.I00000oOI(obj);
/* 260 */                   return ooiIlOl1iI;
                        case 1:
/* 245 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 247 */                   lIoii1l01l0i.I00000oOI(obj);
/* 250 */                   return Choreographer.getInstance();
                        case 2:
/* 28 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 30 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 44 */                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.github.com/repos/jegly/Box/releases/latest").openConnection();
/* 50 */                        httpURLConnection.setRequestProperty("Accept", "application/vnd.github+json");
/* 55 */                        httpURLConnection.setConnectTimeout(10000);
/* 58 */                        httpURLConnection.setReadTimeout(10000);
                                try {
/* 67 */                            if (httpURLConnection.getResponseCode() != 200) {
/* 92 */                                ool00Ill1OOi = new Ool00Ill1OOi("Server error (" + httpURLConnection.getResponseCode() + ")");
                                    } else {
/* 127 */                               JSONObject jSONObject = new JSONObject(lOliOoIi.I00000oOI(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), IO1IOI.I00000oIO), 8192)));
/* 138 */                               String strI00IOO = OlOoOIi0o.I00IOO("v", jSONObject.getString("tag_name"));
/* 146 */                               if (iOO0ooi1oO.I00000oIO(strI00IOO)) {
/* 153 */                                   JSONArray jSONArray = jSONObject.getJSONArray("assets");
/* 157 */                                   String string = "";
/* 159 */                                   int length = jSONArray.length();
/* 163 */                                   int i2 = 0;
                                            while (true) {
/* 164 */                                       if (i2 < length) {
/* 166 */                                           JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
/* 183 */                                           if (OlOoOIi0o.I000oI1ioi(jSONObject2.getString("name"), BuildConfig.BUILD_VARIANT, true)) {
/* 187 */                                               string = jSONObject2.getString("browser_download_url");
                                                    } else {
/* 192 */                                               i2++;
                                                    }
                                                }
                                            }
/* 199 */                                   if (string.length() != 0) {
/* 211 */                                       Ool01lI1 ool01lI1 = new Ool01lI1();
/* 214 */                                       ool01lI1.I00000oIO = strI00IOO;
/* 216 */                                       ool01lI1.I00000oOI = string;
/* 218 */                                       VarHandle.storeStoreFence();
/* 221 */                                       httpURLConnection.disconnect();
/* 224 */                                       return ool01lI1;
                                            }
/* 205 */                                   ool00Ill1OOi = new Ool00Ill1OOi("No APK found for this variant");
                                        } else {
/* 148 */                                   ool00Ill1OOi = Ool00l.I00000oIO;
                                        }
                                    }
/* 244 */                           return ool00Ill1OOi;
                                } finally {
/* 226 */                           httpURLConnection.disconnect();
                                }
                            } catch (Exception e) {
/* 233 */                       String message = e.getMessage();
/* 237 */                       if (message == null) {
/* 239 */                           message = "Check failed";
                                }
/* 241 */                       return new Ool00Ill1OOi(message);
                            }
                        case 3:
/* 20 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 22 */                    lIoii1l01l0i.I00000oOI(obj);
/* 25 */                    return ooiIlOl1iI;
                        case 4:
/* 14 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 16 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    return ooiIlOl1iI;
                        default:
/* 8 */                     Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    return ooiIlOl1iI;
                    }
                }
            }

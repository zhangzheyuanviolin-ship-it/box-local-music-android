            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.res.Resources;
            import android.net.Uri;
            import android.os.Bundle;
            import android.provider.CalendarContract;
            import android.speech.tts.TextToSpeech;
            import android.util.Log;
            import com.box.gallery.R;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.ByteArrayOutputStream;
            import java.net.URI;
            import java.net.URLEncoder;
            import java.nio.charset.StandardCharsets;
            import java.time.LocalDateTime;
            import java.time.ZoneId;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public final class I0IlIoI1oi0 implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;
                public Object I00l0I0l0lO1;

                public I0IlIoI1oi0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(10:55|233|56|57|(2:239|58)|65|237|66|21|13) */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x01fc, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x01fd, code lost:
                
                    android.util.Log.e("AGMAViewModel", "Failed to create calendar event", r0);
                    r0 = r0.getMessage();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0206, code lost:
                
                    if (r0 == null) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
                
                    r0 = r9.getString(com.box.gallery.R.string.unknown_error);
                 */
                /* JADX WARN: Removed duplicated region for block: B:150:0x03ac  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x0439  */
                /* JADX WARN: Removed duplicated region for block: B:241:0x0681 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    String host;
                    ListIterator listIterator;
                    OoiIlOl1iI ooiIlOl1iI;
                    String message;
                    long j;
                    long epochMilli;
/* 3 */             int i = this.I00iOIl;
/* 5 */             boolean z = false;
/* 8 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1519 */                  O1i1O1I o1i1O1I = (O1i1O1I) this.I00iio;
/* 1523 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiI;
/* 1527 */                  OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 1531 */                  OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 1535 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilO0;
/* 1539 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00io1l;
/* 1543 */                  OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ioIO;
/* 1547 */                  OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00l0I0l0lO1;
/* 1549 */                  FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 1553 */                  if (firebaseAnalyticsI00000oIO != null) {
/* 1555 */                      Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 1559 */                      Bundle bundle = new Bundle();
/* 1566 */                      bundle.putString("action", "add_server");
/* 1573 */                      bundle.putString("status", "attempt");
/* 1578 */                      firebaseAnalyticsI00000oIO.I00000oIO("mcp_management", bundle);
                            }
/* 1595 */                  String string = OlOoOIi0o.I00OIo(((Oo0OI01Il) oI10i0Il.getValue()).I00000oIO.I00iiI).toString();
/* 1603 */                  if (string.length() > 0) {
/* 1613 */                      List list = ((O1i1IIoO1IIl) o1i1O1I.I0000O.getValue()).I00000oIO;
/* 1619 */                      if (!(list instanceof Collection) || !list.isEmpty()) {
/* 1631 */                          Iterator it = list.iterator();
                                    while (true) {
/* 1639 */                              if (!it.hasNext()) {
                                            try {
/* 1675 */                                      host = new URI(string).normalize().getHost();
                                            } catch (Exception unused) {
                                            }
/* 1679 */                                  if (host != null) {
/* 1683 */                                      String lowerCase = host.toLowerCase(Locale.ROOT);
/* 1687 */                                      List<String> list2 = I0Io10iIl.I00000oIO;
/* 1693 */                                      if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 1713 */                                          for (String str : list2) {
/* 1725 */                                              if (!lowerCase.equals(str)) {
/* 1749 */                                                  if (OlOolloIIOl0.I000II(lowerCase, "." + str, false)) {
                                                            }
                                                        }
/* 1753 */                                              oI10i0Il3.setValue(Boolean.TRUE);
/* 1782 */                                              o1i1O1I.I0000oI00(string, (O1i0O00) oI10i0Il4.getValue(), ((Oo0OI01Il) oI10i0Il5.getValue()).I00000oIO.I00iiI, ((Oo0OI01Il) oI10i0Il6.getValue()).I00000oIO.I00iiI);
                                                        break;
                                                    }
                                                }
/* 1788 */                                      oI10i0Il7.setValue(Boolean.TRUE);
                                                break;
                                            } else {
/* 1788 */                                      oI10i0Il7.setValue(Boolean.TRUE);
                                            }
                                        } else if (O0000Ioio00.I0000O(((O1i1Ooo0ll) it.next()).I00000oIO.I001i1O0Ol(), string)) {
/* 1661 */                                  oI10i0Il2.setValue(Boolean.TRUE);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 1:
/* 1511 */                  iOi1II01i0.I0000O((Ii0110) this.I00iio, null, null, new I1iIiIIIio0((Context) this.I00ilI0I1, (OI10i0Il) this.I00iiI, (ByteArrayOutputStream) this.I00ilO0, (OIool0l11) this.I00io1l, (Function1) this.I00ioIO, (Function1) this.I00l0I0l0lO1, (OI10i0Il) this.I00iiO, null), 3);
                            break;
                        case 2:
/* 1356 */                  OI1o1o1iO1l oI1o1o1iO1l = (OI1o1o1iO1l) this.I00iio;
/* 1361 */                  Ii0ioo10iO0 ii0ioo10iO0 = (Ii0ioo10iO0) this.I00ilO0;
/* 1365 */                  Ii0110 ii0110 = (Ii0110) this.I00io1l;
/* 1369 */                  OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iiI;
/* 1373 */                  OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iiO;
/* 1377 */                  OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00ilI0I1;
/* 1381 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00ioIO;
/* 1385 */                  Context context = (Context) this.I00l0I0l0lO1;
/* 1393 */                  if (((IllOOo00lI) oI10i0Il8.getValue()) != null) {
/* 1399 */                      IllOOo00lI illOOo00lI = (IllOOo00lI) oI10i0Il8.getValue();
/* 1401 */                      if (illOOo00lI != null) {
/* 1403 */                          illOOo00lI.invoke();
                                    break;
                                }
                            } else {
/* 1409 */                      oI10i0Il9.setValue(Boolean.FALSE);
/* 1412 */                      oI10i0Il10.setValue("");
/* 1415 */                      oI1o1o1iO1l.I0000O();
/* 1424 */                      Iterator it2 = ii0ioo10iO0.I00000oOI().I000OiO.iterator();
/* 1432 */                      while (it2.hasNext()) {
/* 1438 */                          O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) it2.next();
/* 1449 */                          O1ol100o0O o1ol100o0O2 = o1ol100o0O;
/* 1456 */                          iOi1II01i0.I0000O(ii0110, IiiIil1lOIO.I00000oIO, null, new I0O0Ooi10l(o1ol100o0O2, context, ii0ioo10iO0, o1oIOiI11o0, o1oIOiI11o0.I00IlilI0i0i, null, 2), 2);
/* 1459 */                          o1ol100o0O = o1ol100o0O2;
                                }
                                break;
                            }
                            break;
                        case 3:
/* 1294 */                  Ii0110 ii01102 = (Ii0110) this.I00iio;
/* 1299 */                  OI10i0Il oI10i0Il11 = (OI10i0Il) this.I00iiI;
/* 1304 */                  OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiO;
/* 1309 */                  IlooOlI ilooOlI = (IlooOlI) this.I00ioIO;
/* 1314 */                  OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00ilI0I1;
/* 1319 */                  OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00ilO0;
/* 1324 */                  OI10i0Il oI10i0Il15 = (OI10i0Il) this.I00io1l;
/* 1329 */                  Ol1OlloIO ol1OlloIO = (Ol1OlloIO) this.I00l0I0l0lO1;
/* 1333 */                  oI10i0Il11.setValue(Boolean.TRUE);
/* 1336 */                  oI10i0Il12.setValue("");
/* 1348 */                  iOi1II01i0.I0000O(ii01102, null, null, new IIo11OIl1O1O(ilooOlI, ii01102, oI10i0Il13, oI10i0Il12, oI10i0Il14, oI10i0Il15, ol1OlloIO, oI10i0Il11, null, 1), 3);
                            break;
                        case 4:
/* 1221 */                  String str2 = (String) this.I00iio;
/* 1225 */                  String str3 = (String) this.I00iiI;
/* 1285 */                  iOi1II01i0.I0000O((Ii0110) this.I00ilI0I1, null, null, new I000oI1ioi(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII("# Task: Custom HTML/JS Implementation\nGenerate a single, self-contained HTML file that implements a specific feature or logic as described below.\n\n## 1. Requirement\nThe implementation must fulfill the following:\n> ___requirement___\n\n## 2. Technical Specifications\n* **Structure:** A complete, valid HTML5 document.\n* **Head (Dependencies):** If third-party JS libraries (e.g., Three.js, D3, Lodash, GSAP) are required, include them via CDN using `<script src=\"...\" defer>` tags inside the `<head>`. Do not put implementation logic here.\n* **Body (Implementation):** Place the actual logic implementation inside a single `<script>` tag at the very end of the `<body>`.\n* **Global Interface:** Within the body script, you must expose an `async` function to the global `window` object named: `window['ai_edge_gallery_get_result']`.\n\n## 3. Data Interface & Serialization\n* **Parameter 1 (`data`):** A **JSON-stringified string**.\n    * Once parsed, the input object follows this schema: `___input_data_schema___`\n* **Parameter 2 (`secret`):** A **string** representing a sensitive token or API key (e.g., Bearer token, private key). The implementation should use this if the requirement involves authenticated API calls or encrypted operations.\n* **Output (return value):** The function must return a **JSON-stringified string** with the following exact structure:\n    ```json\n    {\n      \"result\": \"___output_data_schema___\",\n      \"image\": { \"base64\": \"data:image/png;base64,...\" },\n      \"error\": \"Error message string or null\"\n    }\n    ```\n    **CRITICAL RULES:**\n    1. **Dual Output:** The `\"result\"` and `\"image\"` fields can and should coexist in the same response if the requirement involves returning both data/text and a visual asset.\n    2. **Result Serialization:** The value for `\"result\"` must be a JSON-stringified representation of the output data. Set to `null` only if no data is produced.\n    3. **Image Serialization:** The `\"image.base64\"` field must contain a full Data URI. Set the entire `\"image\"` object to `null` only if no image is produced.\n\n## 4. Error Handling\n* Wrap the entire function logic in a `try/catch` block.\n* If an error occurs, the function should return a JSON string where `result` is `null` and `error` contains the error message.\n\n## 5. Response Constraints\n* Return the **raw HTML code only**.\n* Do not provide any introductory text, markdown backticks, or concluding remarks.\n* Start the response immediately with `<!DOCTYPE html>`.\n* Put the output code into a Markdown code block so I can easily copy.", "___requirement___", str2), "___input_data_schema___", str3), "___output_data_schema___", (String) this.I00iiO), (IOO0IOIll) this.I00ilO0, (Function1) this.I00io1l, (Ol010000lo00) this.I00ioIO, (IllOOo00lI) this.I00l0I0l0lO1, null, 9), 3);
                            break;
                        case 5:
/* 1127 */                  TextToSpeech textToSpeech = (TextToSpeech) this.I00iio;
/* 1131 */                  OoIoI0iii0 ooIoI0iii0 = (OoIoI0iii0) this.I00ilI0I1;
/* 1135 */                  OI10i0Il oI10i0Il16 = (OI10i0Il) this.I00iiI;
/* 1139 */                  IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00ilO0;
/* 1143 */                  Context context2 = (Context) this.I00io1l;
/* 1147 */                  IllOOo00lI illOOo00lI3 = (IllOOo00lI) this.I00ioIO;
/* 1151 */                  O1OIi1 o1OIi1 = (O1OIi1) this.I00l0I0l0lO1;
/* 1155 */                  OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00iiO;
/* 1161 */                  if (O11Oio.I00000oOI(oI10i0Il17)) {
/* 1165 */                      oI10i0Il17.setValue(Boolean.FALSE);
/* 1168 */                      textToSpeech.stop();
/* 1171 */                      ooIoI0iii0.I000O01llI0();
/* 1178 */                      O010OIi o010OIi = (O010OIi) oI10i0Il16.getValue();
/* 1181 */                      if (o010OIi != null) {
/* 1183 */                          o010OIi.I000II(null);
                                }
/* 1186 */                      oI10i0Il16.setValue(null);
/* 1189 */                      illOOo00lI2.invoke();
                                break;
                            } else if (iOI10i0I11.I00000oIO(context2, "android.permission.RECORD_AUDIO") == 0) {
/* 1203 */                      oI10i0Il17.setValue(Boolean.TRUE);
/* 1206 */                      textToSpeech.stop();
/* 1209 */                      illOOo00lI3.invoke();
                                break;
                            } else {
/* 1213 */                      o1OIi1.I00000oIO("android.permission.RECORD_AUDIO");
                                break;
                            }
                        default:
/* 15 */                    Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iio;
/* 19 */                    O1o10Iiio o1o10Iiio = (O1o10Iiio) this.I00iiO;
/* 23 */                    Context context3 = (Context) this.I00ilI0I1;
/* 27 */                    Resources resources = (Resources) this.I00ilO0;
/* 31 */                    Ii0110 ii01103 = (Ii0110) this.I00io1l;
/* 35 */                    OI10i0Il oI10i0Il18 = (OI10i0Il) this.I00iiI;
/* 39 */                    Ol1OlloIO ol1OlloIO2 = (Ol1OlloIO) this.I00ioIO;
/* 43 */                    String str4 = (String) this.I00l0I0l0lO1;
/* 47 */                    oI10i0Il18.setValue(Boolean.TRUE);
/* 50 */                    ol1o0O0O0.size();
/* 57 */                    boolean z2 = true;
/* 58 */                    if (ol1o0O0O0.isEmpty()) {
/* 1111 */                      o1o10Iiio.I000O01llI0(true);
/* 1119 */                      iOi1II01i0.I0000O(ii01103, null, null, new I0O0io1loiOO(ol1OlloIO2, str4, null, 1), 3);
                                break;
                            } else {
/* 62 */                        ArrayList arrayList = new ArrayList();
/* 65 */                        ListIterator listIterator2 = ol1o0O0O0.listIterator();
                                while (true) {
/* 70 */                            Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator2;
/* 76 */                            if (!io1ioiIIO1lI.hasNext()) {
/* 1086 */                              OoiIlOl1iI ooiIlOl1iI3 = ooiIlOl1iI2;
/* 1092 */                              if (!arrayList.isEmpty()) {
/* 1102 */                                  iOi1II01i0.I0000O(ii01103, null, null, new O1iIlllIoo(ol1OlloIO2, arrayList, null, 2), 3);
                                            break;
                                        }
                                    } else {
/* 82 */                                I0I0i1 i0I0i1 = (I0I0i1) io1ioiIIO1lI.next();
/* 84 */                                IlllIOo0OI illlIOo0OI = i0I0i1.I00000oIO;
/* 88 */                                if (i0I0i1 instanceof IlOI1Oi) {
/* 90 */                                    o1o10Iiio.getClass();
/* 93 */                                    message = O1o10Iiio.I0001Ioi1lo(context3, z2);
                                        } else if (i0I0i1 instanceof IlOI1I0O) {
/* 107 */                                   o1o10Iiio.getClass();
/* 110 */                                   message = O1o10Iiio.I0001Ioi1lo(context3, z);
                                        } else {
/* 115 */                                   o1o10Iiio.getClass();
/* 124 */                                   if (i0I0i1 instanceof Ii01oi) {
/* 126 */                                       Ii01oi ii01oi = (Ii01oi) i0I0i1;
/* 128 */                                       String str5 = ii01oi.I00000oOI;
/* 130 */                                       String str6 = ii01oi.I0000Il00O;
/* 132 */                                       String str7 = ii01oi.I0000O;
/* 134 */                                       String str8 = ii01oi.I0000oI00;
/* 136 */                                       listIterator = listIterator2;
/* 140 */                                       Intent intent = new Intent("android.intent.action.INSERT");
/* 145 */                                       intent.setType("vnd.android.cursor.dir/raw_contact");
/* 170 */                                       intent.putExtra("name", str5 + " " + str6);
/* 175 */                                       intent.putExtra("email", str8);
/* 181 */                                       intent.putExtra("email_type", 2);
/* 186 */                                       intent.putExtra("phone", str7);
/* 192 */                                       intent.putExtra("phone_type", 3);
                                                try {
/* 195 */                                           context3.startActivity(intent);
/* 6 */                                             message = "";
                                                } catch (Exception e) {
/* 203 */                                           Log.e("AGMAViewModel", "Failed to create contact", e);
/* 206 */                                           message = e.getMessage();
/* 210 */                                           if (message == null) {
/* 215 */                                               message = context3.getString(R.string.unknown_error);
                                                    }
                                                }
/* 99 */                                        ooiIlOl1iI = ooiIlOl1iI2;
                                            } else {
/* 220 */                                       listIterator = listIterator2;
/* 224 */                                       if (i0I0i1 instanceof Oil1IliI) {
/* 226 */                                           Oil1IliI oil1IliI = (Oil1IliI) i0I0i1;
/* 228 */                                           String str9 = oil1IliI.I00000oOI;
/* 230 */                                           String str10 = oil1IliI.I0000Il00O;
/* 232 */                                           String str11 = oil1IliI.I0000O;
/* 238 */                                           Intent intent2 = new Intent("android.intent.action.SEND");
/* 247 */                                           intent2.setData(Uri.parse("mailto:"));
/* 252 */                                           intent2.setType("text/plain");
/* 261 */                                           intent2.putExtra("android.intent.extra.EMAIL", new String[]{str9});
/* 266 */                                           intent2.putExtra("android.intent.extra.SUBJECT", str10);
/* 271 */                                           intent2.putExtra("android.intent.extra.TEXT", str11);
                                                    try {
/* 274 */                                               context3.startActivity(intent2);
/* 6 */                                                 message = "";
                                                    } catch (Exception e2) {
/* 281 */                                               Log.e("AGMAViewModel", "Failed to send email", e2);
/* 284 */                                               message = e2.getMessage();
/* 288 */                                               if (message == null) {
/* 293 */                                                   message = context3.getString(R.string.unknown_error);
                                                        }
                                                    }
/* 99 */                                            ooiIlOl1iI = ooiIlOl1iI2;
                                                } else if (i0I0i1 instanceof Ol01Iol0li) {
/* 315 */                                           String strEncode = URLEncoder.encode(((Ol01Iol0li) i0I0i1).I00000oOI, StandardCharsets.UTF_8.toString());
/* 321 */                                           Intent intent3 = new Intent("android.intent.action.VIEW");
/* 342 */                                           intent3.setData(Uri.parse("geo:0,0?q=" + strEncode));
                                                    try {
/* 345 */                                               context3.startActivity(intent3);
/* 6 */                                                 message = "";
                                                    } catch (Exception e3) {
/* 353 */                                               Log.e("AGMAViewModel", "Failed to show location on map", e3);
/* 356 */                                               message = e3.getMessage();
/* 360 */                                               if (message == null) {
/* 365 */                                                   message = context3.getString(R.string.unknown_error);
                                                        }
                                                    }
/* 99 */                                            ooiIlOl1iI = ooiIlOl1iI2;
                                                } else if (i0I0i1 instanceof OIi1i0i) {
                                                    try {
/* 382 */                                               context3.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
/* 6 */                                                 message = "";
                                                    } catch (Exception e4) {
/* 390 */                                               Log.e("AGMAViewModel", "Failed to open wifi settings", e4);
/* 393 */                                               message = e4.getMessage();
/* 397 */                                               if (message == null) {
/* 402 */                                                   message = context3.getString(R.string.unknown_error);
                                                        }
                                                    }
/* 99 */                                            ooiIlOl1iI = ooiIlOl1iI2;
                                                } else if (i0I0i1 instanceof Ii01oIl1) {
/* 412 */                                           Ii01oIl1 ii01oIl1 = (Ii01oIl1) i0I0i1;
/* 414 */                                           String str12 = ii01oIl1.I00000oOI;
/* 416 */                                           String str13 = ii01oIl1.I0000Il00O;
/* 418 */                                           long jCurrentTimeMillis = System.currentTimeMillis();
                                                    try {
/* 426 */                                               j = jCurrentTimeMillis;
                                                    } catch (Exception e5) {
/* 447 */                                               e = e5;
/* 448 */                                               j = jCurrentTimeMillis;
                                                    }
                                                    try {
/* 440 */                                               epochMilli = LocalDateTime.parse(str12).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                                                    } catch (Exception e6) {
/* 445 */                                               e = e6;
/* 469 */                                               Log.w("AGMAViewModel", "Failed to parse date time: '" + str12 + "'", e);
/* 472 */                                               epochMilli = j;
/* 476 */                                               Intent intent4 = new Intent("android.intent.action.INSERT");
/* 481 */                                               intent4.setData(CalendarContract.Events.CONTENT_URI);
/* 486 */                                               intent4.putExtra("title", str13);
/* 491 */                                               intent4.putExtra("beginTime", epochMilli);
/* 501 */                                               intent4.putExtra("endTime", epochMilli + 3600000);
/* 504 */                                               context3.startActivity(intent4);
/* 6 */                                                 message = "";
/* 99 */                                                ooiIlOl1iI = ooiIlOl1iI2;
/* 939 */                                               if (message.length() == 0) {
                                                        }
/* 1071 */                                              listIterator2 = listIterator;
/* 1073 */                                              ooiIlOl1iI2 = ooiIlOl1iI;
/* 1075 */                                              z = false;
/* 1076 */                                              z2 = true;
                                                    }
/* 476 */                                           Intent intent42 = new Intent("android.intent.action.INSERT");
/* 481 */                                           intent42.setData(CalendarContract.Events.CONTENT_URI);
/* 486 */                                           intent42.putExtra("title", str13);
/* 491 */                                           intent42.putExtra("beginTime", epochMilli);
/* 501 */                                           intent42.putExtra("endTime", epochMilli + 3600000);
/* 504 */                                           context3.startActivity(intent42);
/* 6 */                                             message = "";
/* 99 */                                            ooiIlOl1iI = ooiIlOl1iI2;
                                                } else if (i0I0i1 instanceof OiloliOO) {
/* 538 */                                           OiloliOO oiloliOO = (OiloliOO) i0I0i1;
/* 540 */                                           int i2 = oiloliOO.I00000oOI;
/* 542 */                                           int i3 = oiloliOO.I0000Il00O;
/* 544 */                                           String str14 = oiloliOO.I0000O;
/* 548 */                                           ooiIlOl1iI = ooiIlOl1iI2;
/* 552 */                                           Intent intent5 = new Intent("android.intent.action.SET_ALARM");
/* 557 */                                           intent5.putExtra("android.intent.extra.alarm.HOUR", i2);
/* 562 */                                           intent5.putExtra("android.intent.extra.alarm.MINUTES", i3);
/* 569 */                                           if (!OlOoOIi0o.I001l0I00(str14)) {
/* 571 */                                               intent5.putExtra("android.intent.extra.alarm.MESSAGE", str14);
                                                    }
/* 575 */                                           intent5.putExtra("android.intent.extra.alarm.SKIP_UI", false);
                                                    try {
/* 578 */                                               context3.startActivity(intent5);
/* 6 */                                                 message = "";
                                                    } catch (Exception e7) {
/* 586 */                                               Log.e("AGMAViewModel", "Failed to set alarm", e7);
/* 589 */                                               message = e7.getMessage();
/* 593 */                                               if (message == null) {
/* 598 */                                                   message = context3.getString(R.string.unknown_error);
                                                        }
                                                    }
                                                } else {
/* 604 */                                           ooiIlOl1iI = ooiIlOl1iI2;
/* 608 */                                           if (i0I0i1 instanceof Oio0l1O0ioi) {
/* 610 */                                               Oio0l1O0ioi oio0l1O0ioi = (Oio0l1O0ioi) i0I0i1;
/* 612 */                                               int i4 = oio0l1O0ioi.I00000oOI;
/* 614 */                                               String str15 = oio0l1O0ioi.I0000Il00O;
/* 620 */                                               Intent intent6 = new Intent("android.intent.action.SET_TIMER");
/* 625 */                                               intent6.putExtra("android.intent.extra.alarm.LENGTH", i4);
/* 632 */                                               if (!OlOoOIi0o.I001l0I00(str15)) {
/* 634 */                                                   intent6.putExtra("android.intent.extra.alarm.MESSAGE", str15);
                                                        }
/* 638 */                                               intent6.putExtra("android.intent.extra.alarm.SKIP_UI", false);
                                                        try {
/* 641 */                                                   context3.startActivity(intent6);
/* 6 */                                                     message = "";
                                                        } catch (Exception e8) {
/* 649 */                                                   Log.e("AGMAViewModel", "Failed to set timer", e8);
/* 652 */                                                   message = e8.getMessage();
/* 656 */                                                   if (message == null) {
/* 661 */                                                       message = context3.getString(R.string.unknown_error);
                                                            }
                                                        }
                                                    } else if (i0I0i1 instanceof IiOooilIoiIi) {
/* 673 */                                               String str16 = ((IiOooilIoiIi) i0I0i1).I00000oOI;
/* 679 */                                               Intent intent7 = new Intent("android.intent.action.DIAL");
/* 700 */                                               intent7.setData(Uri.parse("tel:" + str16));
                                                        try {
/* 703 */                                                   context3.startActivity(intent7);
/* 6 */                                                     message = "";
                                                        } catch (Exception e9) {
/* 711 */                                                   Log.e("AGMAViewModel", "Failed to dial number", e9);
/* 714 */                                                   message = e9.getMessage();
/* 718 */                                                   if (message == null) {
/* 723 */                                                       message = context3.getString(R.string.unknown_error);
                                                            }
                                                        }
                                                    } else if (i0I0i1 instanceof Oil1OoIoOill) {
/* 733 */                                               Oil1OoIoOill oil1OoIoOill = (Oil1OoIoOill) i0I0i1;
/* 735 */                                               String str17 = oil1OoIoOill.I00000oOI;
/* 737 */                                               String str18 = oil1OoIoOill.I0000Il00O;
/* 743 */                                               Intent intent8 = new Intent("android.intent.action.SENDTO");
/* 764 */                                               intent8.setData(Uri.parse("smsto:" + str17));
/* 769 */                                               intent8.putExtra("sms_body", str18);
                                                        try {
/* 772 */                                                   context3.startActivity(intent8);
/* 6 */                                                     message = "";
                                                        } catch (Exception e10) {
/* 780 */                                                   Log.e("AGMAViewModel", "Failed to send SMS", e10);
/* 783 */                                                   message = e10.getMessage();
/* 787 */                                                   if (message == null) {
/* 792 */                                                       message = context3.getString(R.string.unknown_error);
                                                            }
                                                        }
                                                    } else if (i0I0i1 instanceof OIi1OoloO) {
/* 804 */                                               String strConcat = ((OIi1OoloO) i0I0i1).I00000oOI;
/* 813 */                                               if (!OlOolloIIOl0.I000l1(strConcat, "http://", false) && !OlOolloIIOl0.I000l1(strConcat, "https://", false)) {
/* 824 */                                                   strConcat = "https://".concat(strConcat);
                                                        }
/* 830 */                                               Intent intent9 = new Intent("android.intent.action.VIEW");
/* 837 */                                               intent9.setData(Uri.parse(strConcat));
                                                        try {
/* 840 */                                                   context3.startActivity(intent9);
/* 6 */                                                     message = "";
                                                        } catch (Exception e11) {
/* 847 */                                                   Log.e("AGMAViewModel", "Failed to open URL", e11);
/* 850 */                                                   message = e11.getMessage();
/* 854 */                                                   if (message == null) {
/* 859 */                                                       message = context3.getString(R.string.unknown_error);
                                                            }
                                                        }
                                                    } else if (i0I0i1 instanceof OIi0oo1OlOO) {
                                                        try {
/* 875 */                                                   context3.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
/* 6 */                                                     message = "";
                                                        } catch (Exception e12) {
/* 882 */                                                   Log.e("AGMAViewModel", "Failed to open Bluetooth settings", e12);
/* 885 */                                                   message = e12.getMessage();
/* 889 */                                                   if (message == null) {
/* 894 */                                                       message = context3.getString(R.string.unknown_error);
                                                            }
                                                        }
                                                    } else if (i0I0i1 instanceof OIi11lil1il) {
                                                        try {
/* 910 */                                                   context3.startActivity(new Intent("android.settings.SOUND_SETTINGS"));
/* 6 */                                                     message = "";
                                                        } catch (Exception e13) {
/* 917 */                                                   Log.e("AGMAViewModel", "Failed to open sound settings", e13);
/* 920 */                                                   message = e13.getMessage();
/* 924 */                                                   if (message == null) {
/* 929 */                                                       message = context3.getString(R.string.unknown_error);
                                                            }
                                                        }
                                                    } else {
/* 6 */                                                 message = "";
                                                    }
                                                }
                                            }
/* 939 */                                   if (message.length() == 0) {
/* 954 */                                       String strI000oI1ioi = IIl001iO0Io.I000oI1ioi("**", resources.getString(R.string.function_name), "**:\n- ", illlIOo0OI.I00000oIO);
/* 958 */                                       List list3 = illlIOo0OI.I00000oOI;
/* 967 */                                       if (!list3.isEmpty()) {
/* 1008 */                                          strI000oI1ioi = Oi010OO0.I001IO000(strI000oI1ioi, "\n\n**", resources.getQuantityString(R.plurals.parameter, list3.size()), "**:\n", IOOi0Ool1i.I00IlilI0i0i(list3, "\n", null, null, new O1o0i0Ol0Oo0(3), 30));
                                                }
/* 1012 */                                      OlO0OIIl1 olO0OIIl1 = o1o10Iiio.I0000Il00O;
/* 1026 */                                      ArrayList arrayList2 = new ArrayList(((O1o0lio) olO0OIIl1.getValue()).I0000oI00);
/* 1029 */                                      arrayList2.add(strI000oI1ioi);
                                                while (true) {
/* 1032 */                                          Object value = olO0OIIl1.getValue();
/* 1059 */                                          ArrayList arrayList3 = arrayList2;
/* 1069 */                                          if (olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), false, false, null, null, arrayList3, false, 47))) {
                                                        break;
                                                    }
/* 1079 */                                          arrayList2 = arrayList3;
                                                }
                                            } else {
/* 1082 */                                      arrayList.add(message);
                                            }
/* 1071 */                                  listIterator2 = listIterator;
/* 1073 */                                  ooiIlOl1iI2 = ooiIlOl1iI;
/* 1075 */                                  z = false;
/* 1076 */                                  z2 = true;
                                        }
/* 97 */                                listIterator = listIterator2;
/* 99 */                                ooiIlOl1iI = ooiIlOl1iI2;
/* 939 */                               if (message.length() == 0) {
                                        }
/* 1071 */                              listIterator2 = listIterator;
/* 1073 */                              ooiIlOl1iI2 = ooiIlOl1iI;
/* 1075 */                              z = false;
/* 1076 */                              z2 = true;
                                    }
                                }
                            }
                            break;
                    }
/* 1106 */          return ooiIlOl1iI2;
                }
            }

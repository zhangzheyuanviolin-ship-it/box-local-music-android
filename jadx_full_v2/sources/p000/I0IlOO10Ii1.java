            package p000;

            import android.os.Bundle;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.List;
            
/* 11 */    public final class I0IlOO10Ii1 implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public OI10i0Il I00iiO;

                public I0IlOO10Ii1(OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2) {
/* 3 */             this.I00iOIl = 21;
/* 8 */             this.I00iiI = oI10i0Il;
/* 10 */            this.I00iiO = oI10i0Il2;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 0;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 583 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 585 */                   OI10i0Il oI10i0Il2 = this.I00iiO;
/* 589 */                   oI10i0Il.setValue(O1i0O00.I00iOIl);
/* 594 */                   oI10i0Il2.setValue(Boolean.FALSE);
/* 597 */                   return ooiIlOl1iI;
                        case 1:
/* 568 */                   OI10i0Il oI10i0Il3 = this.I00iiI;
/* 570 */                   OI10i0Il oI10i0Il4 = this.I00iiO;
/* 574 */                   oI10i0Il3.setValue(O1i0O00.I00iiI);
/* 579 */                   oI10i0Il4.setValue(Boolean.FALSE);
/* 582 */                   return ooiIlOl1iI;
                        case 2:
/* 553 */                   OI10i0Il oI10i0Il5 = this.I00iiI;
/* 555 */                   OI10i0Il oI10i0Il6 = this.I00iiO;
/* 559 */                   oI10i0Il5.setValue(O1i0O00.I00iiO);
/* 564 */                   oI10i0Il6.setValue(Boolean.FALSE);
/* 567 */                   return ooiIlOl1iI;
                        case 3:
/* 540 */                   OI10i0Il oI10i0Il7 = this.I00iiI;
/* 542 */                   OI10i0Il oI10i0Il8 = this.I00iiO;
/* 546 */                   oI10i0Il7.setValue(Boolean.FALSE);
/* 549 */                   oI10i0Il8.setValue(null);
/* 552 */                   return ooiIlOl1iI;
                        case 4:
/* 449 */                   OI10i0Il oI10i0Il9 = this.I00iiI;
/* 451 */                   OI10i0Il oI10i0Il10 = this.I00iiO;
/* 463 */                   if (((String) oI10i0Il9.getValue()).length() == 0) {
/* 469 */                       return (List) oI10i0Il10.getValue();
                            }
/* 476 */                   List list = (List) oI10i0Il10.getValue();
/* 482 */                   ArrayList arrayList = new ArrayList();
/* 493 */                   for (Object obj : list) {
/* 500 */                       Conversation conversation = (Conversation) obj;
/* 516 */                       if (OlOoOIi0o.I000oI1ioi(conversation.getTitle(), (String) oI10i0Il9.getValue(), true) || OlOoOIi0o.I000oI1ioi(conversation.getModelName(), (String) oI10i0Il9.getValue(), true)) {
/* 534 */                           arrayList.add(obj);
                                }
                            }
/* 538 */                   return arrayList;
                        case 5:
/* 415 */                   OI10i0Il oI10i0Il11 = this.I00iiI;
/* 417 */                   OI10i0Il oI10i0Il12 = this.I00iiO;
/* 421 */                   Object value = oI10i0Il11.getValue();
/* 425 */                   Object value2 = oI10i0Il12.getValue();
/* 433 */                   IO1OO01i0 iO1OO01i0 = (IO1OO01i0) oI10i0Il11.getValue();
/* 445 */                   return new OoIlOii(value, value2, iO1OO01i0 != null ? Float.valueOf(iO1OO01i0.I0000Il00O()) : null);
                        case 6:
/* 402 */                   OI10i0Il oI10i0Il13 = this.I00iiI;
/* 404 */                   OI10i0Il oI10i0Il14 = this.I00iiO;
/* 406 */                   oI10i0Il13.setValue("");
/* 411 */                   oI10i0Il14.setValue(Boolean.TRUE);
/* 414 */                   return ooiIlOl1iI;
                        case 7:
/* 389 */                   OI10i0Il oI10i0Il15 = this.I00iiI;
/* 391 */                   OI10i0Il oI10i0Il16 = this.I00iiO;
/* 395 */                   oI10i0Il15.setValue(Boolean.FALSE);
/* 398 */                   Iil0O0iOiIil.I0000Il00O(oI10i0Il16, false);
/* 401 */                   return ooiIlOl1iI;
                        case 8:
/* 378 */                   OI10i0Il oI10i0Il17 = this.I00iiI;
/* 380 */                   OI10i0Il oI10i0Il18 = this.I00iiO;
/* 382 */                   oI10i0Il17.setValue(null);
/* 385 */                   oI10i0Il18.setValue("");
/* 388 */                   return ooiIlOl1iI;
                        case 9:
/* 365 */                   OI10i0Il oI10i0Il19 = this.I00iiI;
/* 367 */                   OI10i0Il oI10i0Il20 = this.I00iiO;
/* 371 */                   oI10i0Il19.setValue(Boolean.FALSE);
/* 374 */                   oI10i0Il20.setValue("");
/* 377 */                   return ooiIlOl1iI;
                        case 10:
/* 352 */                   OI10i0Il oI10i0Il21 = this.I00iiI;
/* 354 */                   OI10i0Il oI10i0Il22 = this.I00iiO;
/* 358 */                   oI10i0Il21.setValue(Boolean.TRUE);
/* 361 */                   oI10i0Il22.setValue("");
/* 364 */                   return ooiIlOl1iI;
                        case 11:
/* 341 */                   OI10i0Il oI10i0Il23 = this.I00iiI;
/* 343 */                   OI10i0Il oI10i0Il24 = this.I00iiO;
/* 345 */                   oI10i0Il23.setValue("");
/* 348 */                   oI10i0Il24.setValue("");
/* 351 */                   return ooiIlOl1iI;
                        case 12:
/* 330 */                   OI10i0Il oI10i0Il25 = this.I00iiI;
/* 332 */                   OI10i0Il oI10i0Il26 = this.I00iiO;
/* 334 */                   oI10i0Il25.setValue("");
/* 337 */                   oI10i0Il26.setValue("");
/* 340 */                   return ooiIlOl1iI;
                        case 13:
/* 319 */                   OI10i0Il oI10i0Il27 = this.I00iiI;
/* 321 */                   OI10i0Il oI10i0Il28 = this.I00iiO;
/* 323 */                   oI10i0Il27.setValue("");
/* 326 */                   oI10i0Il28.setValue("");
/* 329 */                   return ooiIlOl1iI;
                        case 14:
/* 308 */                   OI10i0Il oI10i0Il29 = this.I00iiI;
/* 310 */                   OI10i0Il oI10i0Il30 = this.I00iiO;
/* 312 */                   oI10i0Il29.setValue("");
/* 315 */                   oI10i0Il30.setValue(null);
/* 318 */                   return ooiIlOl1iI;
                        case 15:
/* 297 */                   OI10i0Il oI10i0Il31 = this.I00iiI;
/* 299 */                   OI10i0Il oI10i0Il32 = this.I00iiO;
/* 301 */                   oI10i0Il31.setValue("");
/* 304 */                   oI10i0Il32.setValue("");
/* 307 */                   return ooiIlOl1iI;
                        case 16:
/* 286 */                   OI10i0Il oI10i0Il33 = this.I00iiI;
/* 288 */                   OI10i0Il oI10i0Il34 = this.I00iiO;
/* 290 */                   oI10i0Il33.setValue("");
/* 293 */                   oI10i0Il34.setValue(null);
/* 296 */                   return ooiIlOl1iI;
                        case 17:
/* 248 */                   OI10i0Il oI10i0Il35 = this.I00iiI;
/* 250 */                   OI10i0Il oI10i0Il36 = this.I00iiO;
/* 267 */                   oI10i0Il36.setValue(Boolean.valueOf(!((Boolean) oI10i0Il36.getValue()).booleanValue()));
/* 280 */                   if (!((Boolean) oI10i0Il36.getValue()).booleanValue()) {
/* 282 */                       oI10i0Il35.setValue(null);
                            }
/* 285 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 210 */                   OI10i0Il oI10i0Il37 = this.I00iiI;
/* 212 */                   OI10i0Il oI10i0Il38 = this.I00iiO;
/* 214 */                   oI10i0Il37.setValue("");
/* 217 */                   FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 221 */                   if (firebaseAnalyticsI00000oIO != null) {
/* 223 */                       Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 227 */                       Bundle bundle = new Bundle();
/* 234 */                       bundle.putString("action", "open_add_server");
/* 239 */                       firebaseAnalyticsI00000oIO.I00000oIO("mcp_management", bundle);
                            }
/* 244 */                   oI10i0Il38.setValue(Boolean.TRUE);
/* 247 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 197 */                   OI10i0Il oI10i0Il39 = this.I00iiI;
/* 199 */                   OI10i0Il oI10i0Il40 = this.I00iiO;
/* 201 */                   l1O0o1.I0000Il00O(oI10i0Il39, false);
/* 206 */                   oI10i0Il40.setValue(Boolean.TRUE);
/* 209 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 184 */                   OI10i0Il oI10i0Il41 = this.I00iiI;
/* 186 */                   OI10i0Il oI10i0Il42 = this.I00iiO;
/* 190 */                   oI10i0Il41.setValue(Boolean.FALSE);
/* 193 */                   oI10i0Il42.setValue("");
/* 196 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 171 */                   OI10i0Il oI10i0Il43 = this.I00iiI;
/* 173 */                   OI10i0Il oI10i0Il44 = this.I00iiO;
/* 177 */                   oI10i0Il43.setValue(Boolean.FALSE);
/* 180 */                   oI10i0Il44.setValue("");
/* 183 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 158 */                   OI10i0Il oI10i0Il45 = this.I00iiI;
/* 160 */                   OI10i0Il oI10i0Il46 = this.I00iiO;
/* 164 */                   oI10i0Il45.setValue(Boolean.FALSE);
/* 167 */                   oI10i0Il46.setValue(null);
/* 170 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 145 */                   OI10i0Il oI10i0Il47 = this.I00iiI;
/* 147 */                   OI10i0Il oI10i0Il48 = this.I00iiO;
/* 149 */                   oI10i0Il47.setValue("");
/* 154 */                   oI10i0Il48.setValue(Boolean.TRUE);
/* 157 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 119 */                   OI10i0Il oI10i0Il49 = this.I00iiI;
/* 121 */                   OI10i0Il oI10i0Il50 = this.I00iiO;
/* 123 */                   oI10i0Il49.setValue("");
/* 141 */                   oI10i0Il50.setValue(Boolean.valueOf(!((Boolean) oI10i0Il50.getValue()).booleanValue()));
/* 144 */                   return ooiIlOl1iI;
                        default:
/* 13 */                    OI10i0Il oI10i0Il51 = this.I00iiI;
/* 15 */                    OI10i0Il oI10i0Il52 = this.I00iiO;
/* 21 */                    if (oI10i0Il51.getValue() != null && oI10i0Il52.getValue() != null) {
/* 37 */                        long jI001l0I00 = ((O0iOOo0Ii) oI10i0Il51.getValue()).I001l0I00(0L);
/* 47 */                        long j = ((OIOlIiiioi) oI10i0Il52.getValue()).I00000oIO;
/* 113 */                       i2 = Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (jI001l0I00 >> 32)) ? Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jI001l0I00 & 4294967295L)) ? 1 : 3 : Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jI001l0I00 & 4294967295L)) ? 2 : 4;
                            }
/* 114 */                   return Integer.valueOf(i2);
                    }
                }

/* 12 */        public I0IlOO10Ii1(int i) {
/* 13 */            this.I00iOIl = i;
                }
            }

            package p000;

            import android.content.Context;
            import android.speech.tts.TextToSpeech;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import kotlin.jvm.functions.Function1;
            
            public final class II1iO011I implements Function1 {
                public final int I00iOIl;
                public Context I00iiI;
                public OI10i0Il I00iiO;

                public II1iO011I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 441 */                   this.I00iiO.setValue(Boolean.valueOf(iOI10i0I11.I00000oIO(this.I00iiI, "android.permission.CAMERA") == 0));
/* 444 */                   return ooiIlOl1iI;
                        case 1:
/* 380 */                   Context context = this.I00iiI;
/* 382 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 384 */                   Boolean bool = (Boolean) obj;
/* 386 */                   boolean zBooleanValue = bool.booleanValue();
/* 390 */                   OlO0OIIl1 olO0OIIl1 = I1IIl0I0l1I.I00000oIO;
/* 394 */                   Oi010OO0.I001lllioOl(context, "box_settings", 0, "biometric_lock_enabled", zBooleanValue);
/* 397 */                   I1IIl0I0l1I.I000O01llI0 = zBooleanValue;
/* 399 */                   SimpleDateFormat simpleDateFormat = Oii0IoIiOO.I00000oIO;
/* 414 */                   Oii0IoIiOO.I00000oIO(context, "BIOMETRIC_LOCK_".concat(zBooleanValue ? "ENABLED" : "DISABLED"));
/* 417 */                   oI10i0Il.setValue(bool);
/* 420 */                   return ooiIlOl1iI;
                        case 2:
/* 351 */                   Context context2 = this.I00iiI;
/* 353 */                   OI10i0Il oI10i0Il2 = this.I00iiO;
/* 355 */                   Boolean bool2 = (Boolean) obj;
/* 357 */                   boolean zBooleanValue2 = bool2.booleanValue();
/* 361 */                   OlO0OIIl1 olO0OIIl12 = I1IIl0I0l1I.I00000oIO;
/* 365 */                   Oi010OO0.I001lllioOl(context2, "box_settings", 0, "screenshots_enabled", zBooleanValue2);
/* 368 */                   OlO0OIIl1 olO0OIIl13 = I1IIl0I0l1I.I00000oOI;
/* 370 */                   olO0OIIl13.getClass();
/* 373 */                   olO0OIIl13.I000lI(null, bool2);
/* 376 */                   oI10i0Il2.setValue(bool2);
/* 379 */                   return ooiIlOl1iI;
                        case 3:
/* 322 */                   Context context3 = this.I00iiI;
/* 324 */                   OI10i0Il oI10i0Il3 = this.I00iiO;
/* 326 */                   Boolean bool3 = (Boolean) obj;
/* 328 */                   boolean zBooleanValue3 = bool3.booleanValue();
/* 332 */                   OlO0OIIl1 olO0OIIl14 = I1IIl0I0l1I.I00000oIO;
/* 336 */                   Oi010OO0.I001lllioOl(context3, "box_settings", 0, "tap_jacking_protection_enabled", zBooleanValue3);
/* 339 */                   OlO0OIIl1 olO0OIIl15 = I1IIl0I0l1I.I0000O;
/* 341 */                   olO0OIIl15.getClass();
/* 344 */                   olO0OIIl15.I000lI(null, bool3);
/* 347 */                   oI10i0Il3.setValue(bool3);
/* 350 */                   return ooiIlOl1iI;
                        case 4:
/* 293 */                   Context context4 = this.I00iiI;
/* 295 */                   OI10i0Il oI10i0Il4 = this.I00iiO;
/* 297 */                   Boolean bool4 = (Boolean) obj;
/* 299 */                   boolean zBooleanValue4 = bool4.booleanValue();
/* 303 */                   OlO0OIIl1 olO0OIIl16 = I1IIl0I0l1I.I00000oIO;
/* 307 */                   Oi010OO0.I001lllioOl(context4, "box_settings", 0, "accessibility_data_sensitive_enabled", zBooleanValue4);
/* 310 */                   OlO0OIIl1 olO0OIIl17 = I1IIl0I0l1I.I0001Ioi1lo;
/* 312 */                   olO0OIIl17.getClass();
/* 315 */                   olO0OIIl17.I000lI(null, bool4);
/* 318 */                   oI10i0Il4.setValue(bool4);
/* 321 */                   return ooiIlOl1iI;
                        case 5:
/* 274 */                   Context context5 = this.I00iiI;
/* 276 */                   OI10i0Il oI10i0Il5 = this.I00iiO;
/* 278 */                   Boolean bool5 = (Boolean) obj;
/* 286 */                   Oi010OO0.I001lllioOl(context5, "box_settings", 0, "chat_show_tps", bool5.booleanValue());
/* 289 */                   oI10i0Il5.setValue(bool5);
/* 292 */                   return ooiIlOl1iI;
                        case 6:
/* 255 */                   Context context6 = this.I00iiI;
/* 257 */                   OI10i0Il oI10i0Il6 = this.I00iiO;
/* 259 */                   Boolean bool6 = (Boolean) obj;
/* 267 */                   Oi010OO0.I001lllioOl(context6, "box_settings", 0, "chat_restore_memory", bool6.booleanValue());
/* 270 */                   oI10i0Il6.setValue(bool6);
/* 273 */                   return ooiIlOl1iI;
                        case 7:
/* 219 */                   OI10i0Il oI10i0Il7 = this.I00iiO;
/* 221 */                   Context context7 = this.I00iiI;
/* 223 */                   Boolean bool7 = (Boolean) obj;
/* 225 */                   boolean zBooleanValue5 = bool7.booleanValue();
/* 229 */                   oI10i0Il7.setValue(bool7);
/* 234 */                   Oo0oii.I000lI.setValue(bool7);
/* 251 */                   context7.getSharedPreferences("box_settings", 0).edit().putBoolean("monochrome_accents", zBooleanValue5).apply();
/* 254 */                   return ooiIlOl1iI;
                        case 8:
/* 200 */                   Context context8 = this.I00iiI;
/* 202 */                   OI10i0Il oI10i0Il8 = this.I00iiO;
/* 204 */                   Boolean bool8 = (Boolean) obj;
/* 212 */                   Oi010OO0.I001lllioOl(context8, "box_settings", 0, "llama_use_mmap", bool8.booleanValue());
/* 215 */                   oI10i0Il8.setValue(bool8);
/* 218 */                   return ooiIlOl1iI;
                        case 9:
/* 181 */                   Context context9 = this.I00iiI;
/* 183 */                   OI10i0Il oI10i0Il9 = this.I00iiO;
/* 185 */                   Boolean bool9 = (Boolean) obj;
/* 193 */                   Oi010OO0.I001lllioOl(context9, "box_settings", 0, "llama_use_mlock", bool9.booleanValue());
/* 196 */                   oI10i0Il9.setValue(bool9);
/* 199 */                   return ooiIlOl1iI;
                        case 10:
/* 162 */                   Context context10 = this.I00iiI;
/* 164 */                   OI10i0Il oI10i0Il10 = this.I00iiO;
/* 166 */                   Boolean bool10 = (Boolean) obj;
/* 174 */                   Oi010OO0.I001lllioOl(context10, "box_settings", 0, "llama_kv_cache_q8", bool10.booleanValue());
/* 177 */                   oI10i0Il10.setValue(bool10);
/* 180 */                   return ooiIlOl1iI;
                        case 11:
/* 132 */                   Context context11 = this.I00iiI;
/* 134 */                   OI10i0Il oI10i0Il11 = this.I00iiO;
/* 142 */                   if (!((Boolean) obj).booleanValue()) {
/* 158 */                       O1i1oIi1il.I00000oIO(context11, false);
                            } else if (O1i1oIi1il.I0000Il00O) {
/* 148 */                       O1i1oIi1il.I00000oIO(context11, true);
                            } else {
/* 154 */                       oI10i0Il11.setValue(Boolean.TRUE);
                            }
/* 161 */                   return ooiIlOl1iI;
                        case 12:
/* 113 */                   Context context12 = this.I00iiI;
/* 115 */                   OI10i0Il oI10i0Il12 = this.I00iiO;
/* 117 */                   Boolean bool11 = (Boolean) obj;
/* 125 */                   Oi010OO0.I001lllioOl(context12, "box_settings", 0, "boxassist_hazards_only", bool11.booleanValue());
/* 128 */                   oI10i0Il12.setValue(bool11);
/* 131 */                   return ooiIlOl1iI;
                        case 13:
/* 94 */                    Context context13 = this.I00iiI;
/* 96 */                    OI10i0Il oI10i0Il13 = this.I00iiO;
/* 98 */                    Boolean bool12 = (Boolean) obj;
/* 106 */                   Oi010OO0.I001lllioOl(context13, "box_settings", 0, "boxassist_haptics", bool12.booleanValue());
/* 109 */                   oI10i0Il13.setValue(bool12);
/* 112 */                   return ooiIlOl1iI;
                        case 14:
/* 75 */                    Context context14 = this.I00iiI;
/* 77 */                    OI10i0Il oI10i0Il14 = this.I00iiO;
/* 79 */                    Boolean bool13 = (Boolean) obj;
/* 87 */                    Oi010OO0.I001lllioOl(context14, "box_settings", 0, "downloads_wifi_only", bool13.booleanValue());
/* 90 */                    oI10i0Il14.setValue(bool13);
/* 93 */                    return ooiIlOl1iI;
                        case 15:
/* 56 */                    Context context15 = this.I00iiI;
/* 58 */                    OI10i0Il oI10i0Il15 = this.I00iiO;
/* 60 */                    Boolean bool14 = (Boolean) obj;
/* 68 */                    Oi010OO0.I001lllioOl(context15, "box_settings", 0, "auto_update_check", bool14.booleanValue());
/* 71 */                    oI10i0Il15.setValue(bool14);
/* 74 */                    return ooiIlOl1iI;
                        default:
/* 13 */                    Context context16 = this.I00iiI;
/* 15 */                    OI10i0Il oI10i0Il16 = this.I00iiO;
/* 21 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 28 */                    OioI0il10ol oioI0il10ol = new OioI0il10ol();
/* 31 */                    oioI0il10ol.I00000oIO = oI10i0Il16;
/* 33 */                    oioI0il10ol.I00000oOI = oOo0ooi;
/* 35 */                    VarHandle.storeStoreFence();
/* 41 */                    oOo0ooi.I00iOIl = new TextToSpeech(context16, oioI0il10ol);
/* 47 */                    I0IOIo0 i0IOIo0 = new I0IOIo0(29);
/* 50 */                    i0IOIo0.I00000oOI = oOo0ooi;
/* 52 */                    VarHandle.storeStoreFence();
/* 55 */                    return i0IOIo0;
                    }
                }
            }

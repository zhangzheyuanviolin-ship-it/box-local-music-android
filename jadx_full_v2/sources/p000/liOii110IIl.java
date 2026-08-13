            package p000;

            import android.net.Uri;
            import android.text.TextUtils;
            import java.util.Collections;
            import java.util.HashMap;
            
            public final class liOii110IIl extends liIIo0lO0 {
                public static final boolean I010iIIOlo(String str) {
/* 8 */             String str2 = (String) iol1II1ii1i.I00111O.I00000oIO(null);
/* 15 */            if (TextUtils.isEmpty(str2)) {
/* 14 */                return false;
                    }
/* 26 */            for (String str3 : str2.split(",")) {
/* 38 */                if (str.equalsIgnoreCase(str3.trim())) {
/* 40 */                    return true;
                        }
                    }
/* 14 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
                
                    if (java.lang.Math.abs(r7.hashCode() % 100) < r9.I00IioO0OiOi().I00111O()) goto L28;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final liOi0lIo I010OIo1l(String str) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             lilOOl0 lilool0 = this.I00iiI;
/* 7 */             iOl1lOo1IO iol1loo1io = lilool0.I00iiO;
/* 9 */             l0l1ol11 l0l1ol11Var = lilool0.I00iOIl;
/* 11 */            lilOOl0.I00O0o1oo(iol1loo1io);
/* 14 */            l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 18 */            lIoOOO lioooo = lIoOOO.GOOGLE_ANALYTICS;
/* 20 */            liOi0lIo lioi0lio = null;
/* 21 */            if (l0iiiiI01Ol1o0 == null || !l0iiiiI01Ol1o0.I001l0I00()) {
/* 478 */               return new liOi0lIo(I010i10l(str), Collections.EMPTY_MAP, lioooo, null);
                    }
/* 31 */            l1110Ol01l10 l1110ol01l10I001IIilI0O = l1I1OlIIlO.I001IIilI0O();
/* 35 */            l1110ol01l10I001IIilI0O.I0000Il00O();
/* 43 */            ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001l0I00(2);
/* 50 */            int iI00000oOI = io1OllI.I00000oOI(l0iiiiI01Ol1o0.I00111O());
/* 54 */            if (iI00000oOI == 0) {
/* 59 */                IOOlIIilOl0.I000II("null reference");
                    }
/* 62 */            l1110ol01l10I001IIilI0O.I000O01llI0(iI00000oOI);
/* 65 */            String strI00IO1 = l0iiiiI01Ol1o0.I00IO1();
/* 69 */            lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 72 */            l00O0loO l00o0looI01101olii = l0l1ol11Var.I01101olii(str);
/* 77 */            if (l00o0looI01101olii != null) {
/* 81 */                iOl1lOo1IO iol1loo1io2 = lilool0.I00iiO;
/* 83 */                lilOOl0.I00O0o1oo(iol1loo1io2);
/* 86 */                l0IIii l0iiiiI01Ol1o02 = iol1loo1io2.I01Ol1o0(str);
/* 90 */                if (l0iiiiI01Ol1o02 != null) {
/* 98 */                    if (!l00o0looI01101olii.I00IOO() || l00o0looI01101olii.I00IioO0OiOi().I00111O() != 100) {
/* 110 */                       lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 112 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 123 */                       if (!lioil0ilioi.I01II10(str, l0iiiiI01Ol1o02.I00II0Ol1O0l())) {
/* 130 */                           if (!TextUtils.isEmpty(strI00IO1)) {
                                    }
                                }
                            }
/* 153 */                   String strI00II0oii1o = l0iiiiI01Ol1o0.I00II0oii1o();
/* 157 */                   l1110ol01l10I001IIilI0O.I0000Il00O();
/* 164 */                   ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001l0I00(2);
/* 167 */                   lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 174 */                   l00O0loO l00o0looI01101olii2 = l0l1ol11Var.I01101olii(l0iiiiI01Ol1o0.I00II0oii1o());
/* 178 */                   if (l00o0looI01101olii2 == null || !l00o0looI01101olii2.I00IOO()) {
/* 398 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 400 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 407 */                       l01o0io1ooo0.I00lll10.I0000Il00O("[sgtm] Missing sgtm_setting in remote config. appId", strI00II0oii1o);
/* 410 */                       l1110ol01l10I001IIilI0O.I0000Il00O();
/* 418 */                       ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001lIiIIo1O(4);
                            } else {
/* 190 */                       HashMap map = new HashMap();
/* 201 */                       if (!TextUtils.isEmpty(l0iiiiI01Ol1o0.I00II0Ol1O0l())) {
/* 209 */                           map.put("x-gtm-server-preview", l0iiiiI01Ol1o0.I00II0Ol1O0l());
                                }
/* 216 */                       String strI001IIilI0O = l00o0looI01101olii2.I00IioO0OiOi().I001IIilI0O();
/* 224 */                       int iI00000oOI2 = io1OllI.I00000oOI(l0iiiiI01Ol1o0.I00111O());
/* 228 */                       if (iI00000oOI2 != 0 && iI00000oOI2 != 2) {
/* 232 */                           l1110ol01l10I001IIilI0O.I000O01llI0(iI00000oOI2);
                                } else if (I010iIIOlo(l0iiiiI01Ol1o0.I00II0oii1o())) {
/* 248 */                           l1110ol01l10I001IIilI0O.I000O01llI0(11);
                                } else if (TextUtils.isEmpty(strI001IIilI0O)) {
/* 260 */                           l1110ol01l10I001IIilI0O.I000O01llI0(12);
                                } else {
/* 359 */                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 361 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 368 */                           l01o0io1ooo02.I00lll10.I0000Il00O("[sgtm] Eligible for client side upload. appId", strI00II0oii1o);
/* 371 */                           l1110ol01l10I001IIilI0O.I0000Il00O();
/* 378 */                           ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001l0I00(3);
/* 381 */                           l1110ol01l10I001IIilI0O.I000O01llI0(2);
/* 394 */                           lioi0lio = new liOi0lIo(strI001IIilI0O, map, lIoOOO.SGTM_CLIENT, (l1I1OlIIlO) l1110ol01l10I001IIilI0O.I0000oI00());
                                }
/* 267 */                       l00o0looI01101olii2.I00IioO0OiOi().getClass();
/* 274 */                       l00o0looI01101olii2.I00IioO0OiOi().getClass();
/* 277 */                       l0olllo1i.getClass();
/* 280 */                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 286 */                       if (TextUtils.isEmpty(strI001IIilI0O)) {
/* 333 */                           l1110ol01l10I001IIilI0O.I0000Il00O();
/* 341 */                           ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001lIiIIo1O(6);
/* 344 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 355 */                           l01o0io1ooo03.I00lll10.I0000Il00O("[sgtm] Local service, missing sgtm_server_url", l0iiiiI01Ol1o0.I00II0oii1o());
                                } else {
/* 288 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 295 */                           l01o0io1ooo03.I00lll10.I0000Il00O("[sgtm] Eligible for local service direct upload. appId", strI00II0oii1o);
/* 298 */                           l1110ol01l10I001IIilI0O.I0000Il00O();
/* 306 */                           ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001l0I00(5);
/* 309 */                           l1110ol01l10I001IIilI0O.I0000Il00O();
/* 316 */                           ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001lIiIIo1O(2);
/* 329 */                           lioi0lio = new liOi0lIo(strI001IIilI0O, map, lIoOOO.SGTM, (l1I1OlIIlO) l1110ol01l10I001IIilI0O.I0000oI00());
                                }
                            }
                            return lioi0lio != null ? lioi0lio : new liOi0lIo(I010i10l(str), Collections.EMPTY_MAP, lioooo, (l1I1OlIIlO) l1110ol01l10I001IIilI0O.I0000oI00());
                        }
                    }
/* 442 */           l1110ol01l10I001IIilI0O.I0000Il00O();
/* 449 */           ((l1I1OlIIlO) l1110ol01l10I001IIilI0O.I00iiI).I001lIiIIo1O(3);
/* 466 */           return new liOi0lIo(I010i10l(str), Collections.EMPTY_MAP, lioooo, (l1I1OlIIlO) l1110ol01l10I001IIilI0O.I0000oI00());
                }

                public final String I010i10l(String str) {
/* 3 */             l0l1ol11 l0l1ol11Var = this.I00iiI.I00iOIl;
/* 5 */             lilOOl0.I00O0o1oo(l0l1ol11Var);
/* 8 */             String strI0110OiO = l0l1ol11Var.I0110OiO(str);
/* 17 */            if (TextUtils.isEmpty(strI0110OiO)) {
/* 96 */                return (String) iol1II1ii1i.I0010I0i.I00000oIO(null);
                    }
/* 27 */            Uri uri = Uri.parse((String) iol1II1ii1i.I0010I0i.I00000oIO(null));
/* 31 */            Uri.Builder builderBuildUpon = uri.buildUpon();
/* 35 */            String authority = uri.getAuthority();
/* 60 */            StringBuilder sb = new StringBuilder(String.valueOf(strI0110OiO).length() + 1 + String.valueOf(authority).length());
/* 63 */            sb.append(strI0110OiO);
/* 68 */            sb.append(".");
/* 71 */            sb.append(authority);
/* 78 */            builderBuildUpon.authority(sb.toString());
/* 85 */            return builderBuildUpon.build().toString();
                }
            }

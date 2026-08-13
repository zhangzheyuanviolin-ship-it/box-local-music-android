            package p000;

            import android.content.Intent;
            import android.net.Uri;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONException;
            
            public final class Iiioioo1llO implements Function1 {
                public final int I00iOIl;
                public Ii0110 I00iiI;
                public O1ol100o0O I00iiO;
                public O1oIOiI11o0 I00iio;
                public OI10i0Il I00ilI0I1;
                public Function1 I00ilO0;
                public OI10i0Il I00io1l;
                public OI10i0Il I00ioIO;

                public Iiioioo1llO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    I1ii0loo111 i1ii0loo111I0000Il00O;
                    I1iOo1IoI1 i1iOo1IoI1I0000Il00O;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             int i2 = 1;
                    switch (i) {
                        case 0:
/* 75 */                    O1ol100o0O o1ol100o0O = this.I00iiO;
/* 77 */                    Ii0110 ii0110 = this.I00iiI;
/* 79 */                    O1oIOiI11o0 o1oIOiI11o0 = this.I00iio;
/* 81 */                    OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 83 */                    Function1 function1 = this.I00ilO0;
/* 85 */                    OI10i0Il oI10i0Il2 = this.I00io1l;
/* 87 */                    OI10i0Il oI10i0Il3 = this.I00ioIO;
/* 93 */                    Iiioioo1llO iiioioo1llO = new Iiioioo1llO(i2);
/* 96 */                    iiioioo1llO.I00iiI = ii0110;
/* 98 */                    iiioioo1llO.I00iiO = o1ol100o0O;
/* 100 */                   iiioioo1llO.I00iio = o1oIOiI11o0;
/* 102 */                   iiioioo1llO.I00ilI0I1 = oI10i0Il;
/* 104 */                   iiioioo1llO.I00ilO0 = function1;
/* 106 */                   iiioioo1llO.I00io1l = oI10i0Il2;
/* 108 */                   iiioioo1llO.I00ioIO = oI10i0Il3;
/* 110 */                   VarHandle.storeStoreFence();
/* 113 */                   o1ol100o0O.getClass();
/* 116 */                   Intent intent = ((I0IIOOO1O) obj).I00iiI;
/* 118 */                   if (intent == null) {
/* 129 */                       iiioioo1llO.invoke(new Oo1IoiO0o(Oo1Ioili0lO.I00iOIl, "Empty auth result"));
/* 425 */                       return ooiIlOl1iI;
                            }
/* 134 */                   Set set = I1ii0loo111.I000OiO;
/* 142 */                   if (intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
                                try {
/* 150 */                           i1ii0loo111I0000Il00O = I1ii0loo111.I0000Il00O(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
                                } catch (JSONException e) {
/* 445 */                           throw new IllegalArgumentException("Intent contains malformed auth response", e);
                                }
                            } else {
/* 144 */                       i1ii0loo111I0000Il00O = null;
                            }
/* 154 */                   int i3 = I1iOo1IoI1.I00ilO0;
/* 162 */                   if (intent.hasExtra("net.openid.appauth.AuthorizationException")) {
                                try {
/* 170 */                           i1iOo1IoI1I0000Il00O = I1iOo1IoI1.I0000Il00O(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
                                } catch (JSONException e2) {
/* 435 */                           throw new IllegalArgumentException("Intent contains malformed exception data", e2);
                                }
                            } else {
/* 164 */                       i1iOo1IoI1I0000Il00O = null;
                            }
/* 180 */                   if ((i1ii0loo111I0000Il00O != null ? i1ii0loo111I0000Il00O.I0000O : null) == null) {
/* 383 */                       if (i1iOo1IoI1I0000Il00O != null) {
/* 411 */                           iiioioo1llO.invoke(new Oo1IoiO0o(O0000Ioio00.I0000O(i1iOo1IoI1I0000Il00O.getMessage(), "User cancelled flow") ? Oo1Ioili0lO.I00iiO : Oo1Ioili0lO.I00iOIl, i1iOo1IoI1I0000Il00O.getMessage()));
/* 425 */                           return ooiIlOl1iI;
                                }
/* 422 */                       iiioioo1llO.invoke(new Oo1IoiO0o(Oo1Ioili0lO.I00iiO, null));
/* 425 */                       return ooiIlOl1iI;
                            }
/* 184 */                   OOo0ooi oOo0ooi = new OOo0ooi();
/* 187 */                   I1ii1l10IO i1ii1l10IO = o1ol100o0O.I000OiO;
/* 189 */                   i1ii0loo111I0000Il00O.getClass();
/* 192 */                   Map map = Collections.EMPTY_MAP;
/* 194 */                   I1ii0iiiloi i1ii0iiiloi = i1ii0loo111I0000Il00O.I00000oIO;
/* 198 */                   lII1IoI.I0000Il00O("additionalExchangeParameters cannot be null", map);
/* 201 */                   String str = i1ii0loo111I0000Il00O.I0000O;
/* 203 */                   if (str != null) {
/* 205 */                       I1ii1o0 i1ii1o0 = i1ii0iiiloi.I00000oIO;
/* 207 */                       String str2 = i1ii0iiiloi.I00000oOI;
/* 211 */                       lII1IoI.I00000oOI(str2, "clientId cannot be null or empty");
/* 216 */                       new LinkedHashMap();
/* 223 */                       lII1IoI.I00000oOI("authorization_code", "grantType cannot be null or empty");
/* 226 */                       Uri uri = i1ii0iiiloi.I000O01llI0;
/* 228 */                       if (uri != null) {
/* 236 */                           lII1IoI.I0000Il00O("redirectUri must have a scheme", uri.getScheme());
                                }
/* 239 */                       String str3 = i1ii0iiiloi.I000l1;
/* 241 */                       if (str3 != null) {
/* 243 */                           IOOIiOIi0.I00000oIO(str3);
                                }
/* 248 */                       lII1IoI.I00000oOI(str, "authorization code must not be empty");
/* 253 */                       Map mapI00000oOI = iOIOlii1.I00000oOI(map, Oo1IlOI.I000OOo1O);
/* 257 */                       String str4 = i1ii0iiiloi.I000iOII;
/* 263 */                       if (TextUtils.isEmpty(str4)) {
/* 265 */                           str4 = null;
                                }
/* 266 */                       if (uri != null) {
/* 270 */                           Map mapUnmodifiableMap = Collections.unmodifiableMap(mapI00000oOI);
/* 274 */                           Oo1IlOI oo1IlOI = new Oo1IlOI();
/* 277 */                           oo1IlOI.I00000oIO = i1ii1o0;
/* 279 */                           oo1IlOI.I0000Il00O = str2;
/* 281 */                           oo1IlOI.I00000oOI = str4;
/* 283 */                           oo1IlOI.I0000O = "authorization_code";
/* 285 */                           oo1IlOI.I0000oI00 = uri;
/* 287 */                           oo1IlOI.I0001Ioi1lo = str;
/* 289 */                           oo1IlOI.I000II = str3;
/* 291 */                           oo1IlOI.I000O01llI0 = mapUnmodifiableMap;
/* 293 */                           VarHandle.storeStoreFence();
/* 299 */                           IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(3);
/* 302 */                           iiI0oIlol0.I00iiI = oOo0ooi;
/* 304 */                           iiI0oIlol0.I00iiO = o1ol100o0O;
/* 306 */                           iiI0oIlol0.I00iio = iiioioo1llO;
/* 308 */                           VarHandle.storeStoreFence();
/* 311 */                           IOO0o0I1l iOO0o0I1l = IOO0o0I1l.I00iio;
/* 315 */                           if (!i1ii1l10IO.I00000oIO) {
/* 327 */                               O1I1OO.I0001Ioi1lo("Initiating code exchange request to %s", (Uri) i1ii1o0.I00iiO);
/* 332 */                               I11OlOOlO0 i11OlOOlO0 = I11OlOOlO0.I00000oOI;
/* 334 */                               Io1Oioii1111 io1Oioii1111 = Io1Oioii1111.I00iiO;
/* 336 */                               i1O01oOIoI0I i1o01ooioi0i = i1O01oOIoI0I.I00oOio10iI1;
/* 338 */                               boolean z = i11OlOOlO0.I00000oIO;
/* 340 */                               I1ii1OlOO1O i1ii1OlOO1O = new I1ii1OlOO1O();
/* 343 */                               i1ii1OlOO1O.I00000oIO = oo1IlOI;
/* 345 */                               i1ii1OlOO1O.I00000oOI = iOO0o0I1l;
/* 347 */                               i1ii1OlOO1O.I0000Il00O = io1Oioii1111;
/* 349 */                               i1ii1OlOO1O.I0000oI00 = i1o01ooioi0i;
/* 351 */                               i1ii1OlOO1O.I0000O = iiI0oIlol0;
/* 353 */                               i1ii1OlOO1O.I0001Ioi1lo = z;
/* 355 */                               VarHandle.storeStoreFence();
/* 360 */                               i1ii1OlOO1O.execute(new Void[0]);
/* 425 */                               return ooiIlOl1iI;
                                    }
/* 366 */                           I000II.I001IO000("Service has been disposed and rendered inoperable");
                                } else {
/* 373 */                           I000II.I001IO000("no redirect URI specified on token request for code exchange");
                                }
                            } else {
/* 379 */                       I000II.I001IO000("authorizationCode not available for exchange request");
                            }
/* 7 */                     return null;
                        default:
/* 11 */                    Ii0110 ii01102 = this.I00iiI;
/* 13 */                    O1ol100o0O o1ol100o0O2 = this.I00iiO;
/* 15 */                    O1oIOiI11o0 o1oIOiI11o02 = this.I00iio;
/* 17 */                    OI10i0Il oI10i0Il4 = this.I00ilI0I1;
/* 19 */                    Function1 function12 = this.I00ilO0;
/* 21 */                    OI10i0Il oI10i0Il5 = this.I00io1l;
/* 23 */                    OI10i0Il oI10i0Il6 = this.I00ioIO;
/* 29 */                    int iOrdinal = ((Oo1IoiO0o) obj).I00000oIO.ordinal();
/* 33 */                    if (iOrdinal == 0) {
/* 68 */                        Iil0O0iOiIil.I0000Il00O(oI10i0Il5, false);
/* 71 */                        Iil0O0iOiIil.I00000oOI(oI10i0Il6, false);
/* 74 */                        return ooiIlOl1iI;
                            }
/* 36 */                    if (iOrdinal == 1) {
/* 52 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 64 */                        iOi1II01i0.I0000O(ii01102, Ii1oo1ooill0.I00iiI, null, new I0iOI0o1i((OooioIIoi0O) o1ol100o0O2, o1oIOiI11o02, (Object) oI10i0Il4, (Object) function12, (IOoil1iiIilo) null, 14), 2);
/* 74 */                        return ooiIlOl1iI;
                            }
/* 38 */                    if (iOrdinal != 2) {
/* 47 */                        I000II.I00000oIO();
/* 7 */                         return null;
                            }
/* 40 */                    Iil0O0iOiIil.I0000Il00O(oI10i0Il5, false);
/* 43 */                    Iil0O0iOiIil.I00000oOI(oI10i0Il6, false);
/* 74 */                    return ooiIlOl1iI;
                    }
                }
            }

            package p000;

            import android.content.ActivityNotFoundException;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.Base64;
            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.SecureRandom;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            import net.openid.appauth.AuthorizationManagementActivity;
            
            public final class IO1Io1IOOOIi implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IO1Io1IOOOIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:268:0x0842  */
                /* JADX WARN: Removed duplicated region for block: B:274:0x0861  */
                /* JADX WARN: Type inference failed for: r2v55 */
                /* JADX WARN: Type inference failed for: r2v56, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r2v58 */
                /* JADX WARN: Type inference failed for: r2v59, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v61 */
                /* JADX WARN: Type inference failed for: r2v62 */
                /* JADX WARN: Type inference failed for: r2v63 */
                /* JADX WARN: Type inference failed for: r2v64 */
                /* JADX WARN: Type inference failed for: r2v68 */
                /* JADX WARN: Type inference failed for: r2v69 */
                /* JADX WARN: Type inference failed for: r3v14, types: [IoOiOiI11] */
                /* JADX WARN: Type inference failed for: r4v10, types: [Ii0ioI1, android.os.Binder, android.os.IInterface, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v13, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v15 */
                /* JADX WARN: Type inference failed for: r5v16, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v18 */
                /* JADX WARN: Type inference failed for: r5v19 */
                /* JADX WARN: Type inference failed for: r5v20 */
                /* JADX WARN: Type inference failed for: r5v21 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    List listI00O10llo;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String strI00000oIO;
                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi;
                    String strEncodeToString;
                    String str5;
                    String[] strArrNames;
/* 3 */             int i = this.I00iOIl;
/* 9 */             Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 12 */            int i2 = 1;
/* 13 */            int i3 = 0;
/* 14 */            OIOiIIi0OOiO oIOiIIi0OOiO = null;
/* 14 */            boolean z = false;
/* 14 */            boolean z2 = false;
/* 14 */            boolean z3 = false;
/* 15 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2222 */                  IO1OIo01l1 iO1OIo01l1 = (IO1OIo01l1) this.I00iiI;
/* 2226 */                  OI10i0Il oI10i0Il = (OI10i0Il) this.I00iiO;
/* 2228 */                  IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 2232 */                  IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 2243 */                  iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I0II0OiI((Object) iO1OIo01l1, (IOoil1iiIilo) (z ? 1 : 0), 13), 2);
/* 2248 */                  oI10i0Il.setValue(Boolean.FALSE);
/* 2251 */                  return ooiIlOl1iI;
                        case 1:
/* 2163 */                  O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iiI;
/* 2167 */                  List list = (List) this.I00iiO;
/* 2179 */                  O0o0100I o0o0100I = (O0o0100I) IOOi0Ool1i.I00IoIO0lI(o0o0I1i0O.I000OiO().I000l1);
/* 2215 */                  return Boolean.valueOf(o0o0100I != null && o0o0100I.I00000oIO == list.size() + (-1) && (o0o0100I.I000o00OoI0I + o0o0100I.I000oI1ioi) - o0o0I1i0O.I000OiO().I000o00OoI0I < 90);
                        case 2:
/* 1985 */                  IOlIO1I0OloO iOlIO1I0OloO = (IOlIO1I0OloO) this.I00iiI;
/* 1987 */                  Object obj = this.I00iiO;
/* 1989 */                  IloI0lOlll1 iloI0lOlll1 = iOlIO1I0OloO.I00iOIl;
/* 1991 */                  Ol11i0000Oo ol11i0000Oo = iloI0lOlll1.I0000Il00O;
/* 1993 */                  Ol11i0 ol11i0I000iOII = ol11i0000Oo.I000iOII();
/* 1997 */                  int i4 = 0;
/* 2000 */                  while (i4 < ol11i0000Oo.I00iiI) {
                                try {
/* 2006 */                          if (ol11i0I000iOII.I000l1(i4)) {
/* 2008 */                              Object objI000o00OoI0I = ol11i0I000iOII.I000o00OoI0I(i4);
/* 2012 */                              if (objI000o00OoI0I != obj) {
/* 2021 */                                  IloI1lO1IiI0 iloI1lO1IiI0 = objI000o00OoI0I instanceof IloI1lO1IiI0 ? (IloI1lO1IiI0) objI000o00OoI0I : null;
/* 2028 */                                  if ((iloI1lO1IiI0 != null ? iloI1lO1IiI0.I00000oIO : null) == obj) {
                                            }
                                        }
/* 2032 */                              OIOiIIi0OOiO oIOiIIi0OOiO2 = new OIOiIIi0OOiO(i4, null);
/* 2035 */                              ol11i0I000iOII.I0000Il00O();
/* 2038 */                              oIOiIIi0OOiO = oIOiIIi0OOiO2;
/* 2113 */                              if (oIOiIIi0OOiO != null) {
/* 2115 */                                  int i5 = oIOiIIi0OOiO.I00000oIO;
/* 2117 */                                  Integer num = oIOiIIi0OOiO.I00000oOI;
/* 2119 */                                  Ol11i0 ol11i0I000iOII2 = ol11i0000Oo.I000iOII();
                                            try {
/* 2123 */                                      ArrayList arrayListI0000Il00O = iilI1OO1.I0000Il00O(ol11i0I000iOII2, i5, num);
/* 2127 */                                      ol11i0I000iOII2.I0000Il00O();
/* 2136 */                                      listI00O10llo = IOOi0Ool1i.I00O10llo(arrayListI0000Il00O, iloI0lOlll1.I00IlilI0i0i());
                                            } finally {
                                            }
                                        } else {
/* 2146 */                                  listI00O10llo = Il01100l.I00iOIl;
                                        }
/* 2152 */                              return new IOl0l1Io(listI00O10llo, iloI0lOlll1.I001lloI);
                                    }
/* 2043 */                          int[] iArr = ol11i0I000iOII.I00000oOI;
/* 2049 */                          int i6 = i4 + 1;
/* 2068 */                          int iI0000oI00 = (i6 < ol11i0I000iOII.I0000Il00O ? iArr[(i6 * 5) + 4] : ol11i0I000iOII.I0000oI00) - Ol11iOOOoo1.I0000oI00(iArr, i4);
/* 2070 */                          for (int i7 = 0; i7 < iI0000oI00; i7++) {
/* 2072 */                              Object objI000O01llI0 = ol11i0I000iOII.I000O01llI0(i4, i7);
/* 2076 */                              if (objI000O01llI0 != obj) {
/* 2085 */                                  IloI1lO1IiI0 iloI1lO1IiI02 = objI000O01llI0 instanceof IloI1lO1IiI0 ? (IloI1lO1IiI0) objI000O01llI0 : null;
/* 2092 */                                  if ((iloI1lO1IiI02 != null ? iloI1lO1IiI02.I00000oIO : null) != obj) {
                                            }
                                        }
/* 2104 */                              oIOiIIi0OOiO = new OIOiIIi0OOiO(i4, Integer.valueOf(i7));
/* 2113 */                              if (oIOiIIi0OOiO != null) {
                                        }
/* 2152 */                              return new IOl0l1Io(listI00O10llo, iloI0lOlll1.I001lloI);
                                    }
/* 2111 */                          i4 = i6;
                                } finally {
                                }
                            }
/* 2113 */                  if (oIOiIIi0OOiO != null) {
                            }
/* 2152 */                  return new IOl0l1Io(listI00O10llo, iloI0lOlll1.I001lloI);
                        case 3:
/* 1977 */                  return IooO0O.I00000oIO(ioolillioIIO.I00000oOI(((Olol1IOOol0) this.I00iiI).I000II((O0iOOo0Ii) ((IllOOo00lI) this.I00iiO).invoke())));
                        case 4:
/* 1951 */                  ((OlolOO0oi) this.I00iiI).I0000O.invoke((Oloo01) this.I00iiO);
/* 1954 */                  return ooiIlOl1iI;
                        case 5:
/* 1937 */                  ((Iii0iOoIo) this.I00iiI).I0000oI00((OI1OloOIO1O) this.I00iiO, false);
/* 1940 */                  return ooiIlOl1iI;
                        case 6:
/* 1174 */                  O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiI;
/* 1179 */                  O1OIi1 o1OIi1 = (O1OIi1) this.I00iiO;
/* 1181 */                  o1ol100o0O.getClass();
/* 1184 */                  I1ii1o0 i1ii1o0 = OOO11oO.I00000oIO;
/* 1188 */                  Uri uri = Uri.parse("REPLACE_WITH_YOUR_REDIRECT_URI_IN_HUGGINGFACE_APP");
/* 1194 */                  HashMap map = new HashMap();
/* 1199 */                  lII1IoI.I0000Il00O("configuration cannot be null", i1ii1o0);
/* 1206 */                  lII1IoI.I00000oOI("REPLACE_WITH_YOUR_CLIENT_ID_IN_HUGGINGFACE_APP", "client ID cannot be null or empty");
/* 1213 */                  lII1IoI.I00000oOI("code", "expected response type cannot be null or empty");
/* 1221 */                  byte[] bArr = new byte[16];
/* 1223 */                  new SecureRandom().nextBytes(bArr);
/* 1228 */                  String strEncodeToString2 = Base64.encodeToString(bArr, 11);
/* 1232 */                  if (strEncodeToString2 != null) {
/* 1236 */                      lII1IoI.I00000oOI(strEncodeToString2, "state cannot be empty if defined");
                            }
/* 1244 */                  byte[] bArr2 = new byte[16];
/* 1246 */                  new SecureRandom().nextBytes(bArr2);
/* 1249 */                  String strEncodeToString3 = Base64.encodeToString(bArr2, 11);
/* 1253 */                  if (strEncodeToString3 != null) {
/* 1257 */                      lII1IoI.I00000oOI(strEncodeToString3, "nonce cannot be empty if defined");
                            }
/* 1260 */                  Pattern pattern = IOOIiOIi0.I00000oIO;
/* 1269 */                  byte[] bArr3 = new byte[64];
/* 1271 */                  new SecureRandom().nextBytes(bArr3);
/* 1274 */                  String strEncodeToString4 = Base64.encodeToString(bArr3, 11);
/* 1280 */                  if (strEncodeToString4 != null) {
/* 1282 */                      IOOIiOIi0.I00000oIO(strEncodeToString4);
                                try {
/* 1285 */                          MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 1295 */                          messageDigest.update(strEncodeToString4.getBytes("ISO_8859_1"));
/* 1302 */                          strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
/* 1306 */                          str = strEncodeToString3;
                                } catch (UnsupportedEncodingException e) {
/* 1324 */                          O1I1OO.I000OOo1O().I000l1(6, null, "ISO-8859-1 encoding not supported on this device!", e);
/* 1329 */                          IoOOl0iOl1io.I000l1("ISO-8859-1 encoding not supported", e);
/* 14 */                            return null;
                                } catch (NoSuchAlgorithmException e2) {
/* 1344 */                          str = strEncodeToString3;
/* 1347 */                          O1I1OO.I000OOo1O().I000l1(5, null, "SHA-256 is not supported on this device! Using plain challenge", e2);
/* 1350 */                          strEncodeToString = strEncodeToString4;
                                }
                                try {
/* 1351 */                          MessageDigest.getInstance("SHA-256");
/* 1354 */                          str5 = "S256";
                                } catch (NoSuchAlgorithmException unused) {
/* 1357 */                          str5 = "plain";
                                }
/* 1359 */                      str3 = strEncodeToString;
/* 1361 */                      str4 = str5;
/* 1363 */                      str2 = strEncodeToString4;
                            } else {
/* 1366 */                      str = strEncodeToString3;
/* 1368 */                      str2 = null;
/* 1370 */                      str3 = null;
/* 1372 */                      str4 = null;
                            }
/* 1380 */                  if (TextUtils.isEmpty("read-repos")) {
/* 1382 */                      strI00000oIO = null;
                            } else {
/* 1389 */                      String[] strArrSplit = "read-repos".split(" +");
/* 1393 */                      if (strArrSplit == null) {
/* 1396 */                          strArrSplit = new String[0];
                                }
/* 1404 */                      strI00000oIO = iOOIoOO1il1i.I00000oIO(Arrays.asList(strArrSplit));
                            }
/* 1436 */                  I1ii0iiiloi i1ii0iiiloi = new I1ii0iiiloi(i1ii1o0, "REPLACE_WITH_YOUR_CLIENT_ID_IN_HUGGINGFACE_APP", "code", uri, null, null, null, null, strI00000oIO, strEncodeToString2, str, str2, str3, str4, null, null, null, Collections.unmodifiableMap(new HashMap(map)));
/* 1439 */                  I1ii1l10IO i1ii1l10IO = o1ol100o0O.I000OiO;
/* 1445 */                  if (i1ii1l10IO.I00000oIO) {
/* 1924 */                      I000II.I001IO000("Service has been disposed and rendered inoperable");
/* 14 */                        return null;
                            }
/* 1449 */                  iOliil ioliil = (iOliil) i1ii1l10IO.I0000Il00O;
/* 1453 */                  CountDownLatch countDownLatch = (CountDownLatch) ioliil.I00iio;
                            try {
/* 1459 */                      countDownLatch.await(1L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused2) {
/* 1473 */                      O1I1OO.I000OOo1O().I000l1(4, null, "Interrupted while waiting for browser connection", new Object[0]);
/* 1476 */                      countDownLatch.countDown();
                            }
/* 1487 */                  Ii0iolloo ii0iolloo = (Ii0iolloo) ((AtomicReference) ioliil.I00iiO).get();
/* 1489 */                  if (ii0iolloo == null) {
/* 1491 */                      i1I0i0Ilo1Oi = null;
                            } else {
/* 1493 */                      IoOiiIi0II ioOiiIi0II = ii0iolloo.I00000oIO;
/* 1497 */                      ?? ii0ioI1 = new Ii0ioI1();
/* 1502 */                      ii0ioI1.attachInterface(ii0ioI1, "android.support.customtabs.ICustomTabsCallback");
/* 1511 */                      new Handler(Looper.getMainLooper());
/* 1520 */                      if (((IoOiOiI11) ioOiiIi0II).I00000oOI(ii0ioI1)) {
/* 1525 */                          ComponentName componentName = ii0iolloo.I00000oOI;
/* 1529 */                          i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(8);
/* 1532 */                          i1I0i0Ilo1Oi.I00iiI = ii0ioI1;
/* 1534 */                          i1I0i0Ilo1Oi.I00iiO = componentName;
/* 1536 */                          VarHandle.storeStoreFence();
                                } else {
/* 1540 */                          i1I0i0Ilo1Oi = null;
                                }
/* 1541 */                      if (i1I0i0Ilo1Oi == null) {
/* 1553 */                          O1I1OO.I000OOo1O().I000l1(5, null, "Failed to create custom tabs session through custom tabs client", new Object[0]);
/* 1491 */                          i1I0i0Ilo1Oi = null;
                                }
                            }
/* 1561 */                  Intent intent = new Intent("android.intent.action.VIEW");
/* 1566 */                  if (i1I0i0Ilo1Oi != null) {
/* 1576 */                      intent.setPackage(((ComponentName) i1I0i0Ilo1Oi.I00iiO).getPackageName());
/* 1581 */                      Ii0ioI1 ii0ioI12 = (Ii0ioI1) i1I0i0Ilo1Oi.I00iiI;
/* 1585 */                      Bundle bundle = new Bundle();
/* 1588 */                      bundle.putBinder("android.support.customtabs.extra.SESSION", ii0ioI12);
/* 1591 */                      intent.putExtras(bundle);
                            }
/* 1598 */                  if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
/* 1602 */                      Bundle bundle2 = new Bundle();
/* 1605 */                      bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
/* 1608 */                      intent.putExtras(bundle2);
                            }
/* 1614 */                  intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
/* 1622 */                  intent.putExtras(new Bundle());
/* 1628 */                  intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
/* 1635 */                  IIloOI iIloOI = new IIloOI(10);
/* 1638 */                  iIloOI.I00iiI = intent;
/* 1640 */                  VarHandle.storeStoreFence();
/* 1645 */                  if (i1ii1l10IO.I00000oIO) {
/* 1920 */                      I000II.I001IO000("Service has been disposed and rendered inoperable");
/* 14 */                        return null;
                            }
/* 1649 */                  III11IO0 iii11io0 = (III11IO0) i1ii1l10IO.I0000O;
/* 1651 */                  if (iii11io0 == null) {
/* 1919 */                      throw new ActivityNotFoundException();
                            }
/* 1653 */                  Boolean bool = iii11io0.I0000O;
/* 1689 */                  Uri.Builder builderAppendQueryParameter = ((Uri) i1ii0iiiloi.I00000oIO.I00iiI).buildUpon().appendQueryParameter("redirect_uri", i1ii0iiiloi.I000O01llI0.toString()).appendQueryParameter("client_id", i1ii0iiiloi.I00000oOI).appendQueryParameter("response_type", i1ii0iiiloi.I000II);
/* 1697 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "display", i1ii0iiiloi.I0000Il00O);
/* 1704 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "login_hint", i1ii0iiiloi.I0000O);
/* 1711 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "prompt", i1ii0iiiloi.I0000oI00);
/* 1718 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "ui_locales", i1ii0iiiloi.I0001Ioi1lo);
/* 1725 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "state", i1ii0iiiloi.I000OiO);
/* 1732 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "nonce", i1ii0iiiloi.I000iOII);
/* 1739 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "scope", i1ii0iiiloi.I000OOo1O);
/* 1746 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "response_mode", i1ii0iiiloi.I000oI1ioi);
/* 1751 */                  if (i1ii0iiiloi.I000l1 != null) {
/* 1765 */                      builderAppendQueryParameter.appendQueryParameter("code_challenge", i1ii0iiiloi.I000lI).appendQueryParameter("code_challenge_method", i1ii0iiiloi.I000o00OoI0I);
                            }
/* 1772 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "claims", i1ii0iiiloi.I00100l0);
/* 1779 */                  li0IOIio0l1I.I00000oIO(builderAppendQueryParameter, "claims_locales", i1ii0iiiloi.I00100o1O0lo);
/* 1796 */                  for (Map.Entry entry : i1ii0iiiloi.I0010I0i.entrySet()) {
/* 1816 */                      builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
/* 1820 */                  Uri uriBuild = builderAppendQueryParameter.build();
/* 1837 */                  Intent intent2 = bool.booleanValue() ? (Intent) iIloOI.I00iiI : new Intent("android.intent.action.VIEW");
/* 1842 */                  intent2.setPackage(iii11io0.I00000oIO);
/* 1845 */                  intent2.setData(uriBuild);
/* 1862 */                  O1I1OO.I0001Ioi1lo("Using %s as browser for auth, custom tab = %s", intent2.getPackage(), bool.toString());
/* 1867 */                  Context context = (Context) i1ii1l10IO.I00000oOI;
/* 1869 */                  int i8 = AuthorizationManagementActivity.I0100o111I;
/* 1875 */                  Intent intent3 = new Intent(context, (Class<?>) AuthorizationManagementActivity.class);
/* 1880 */                  intent3.putExtra("authIntent", intent2);
/* 1889 */                  intent3.putExtra("authRequest", i1ii0iiiloi.I00000oIO());
/* 1896 */                  intent3.putExtra("authRequestType", "authorization");
/* 1901 */                  intent3.putExtra("completeIntent", (Parcelable) null);
/* 1906 */                  intent3.putExtra("cancelIntent", (Parcelable) null);
/* 1909 */                  o1OIi1.I00000oIO(intent3);
/* 1912 */                  return ooiIlOl1iI;
                        case 7:
/* 1146 */                  O0oiOi o0oiOi = (O0oiOi) this.I00iiI;
/* 1148 */                  O0oOi0I o0oOi0I = O0oOi0I.I00ilI0I1;
/* 1152 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 1166 */                  if (o0oiOi.I000iOII().I00ol1().I00000oIO(o0oOi0I)) {
/* 1168 */                      illOOo00lI.invoke();
                            }
/* 1171 */                  return ooiIlOl1iI;
                        case 8:
/* 1109 */                  Il0lloiOlO il0lloiOlO = (Il0lloiOlO) this.I00iiI;
/* 1113 */                  String str6 = (String) this.I00iiO;
/* 1115 */                  Il0lIiOiO1i il0lIiOiO1i = il0lloiOlO.I00000oOI;
/* 1117 */                  if (il0lIiOiO1i == null) {
/* 1121 */                      Enum[] enumArr = il0lloiOlO.I00000oIO;
/* 1124 */                      il0lIiOiO1i = new Il0lIiOiO1i(str6, enumArr.length);
/* 1129 */                      for (Enum r0 : enumArr) {
/* 1137 */                          il0lIiOiO1i.I000OiO(r0.name(), false);
                                }
                            }
/* 1143 */                  return il0lIiOiO1i;
                        case 9:
/* 1084 */                  IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00iiI;
/* 1088 */                  Context context2 = (Context) this.I00iiO;
/* 1090 */                  IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(ilI1loI1lO1);
/* 1094 */                  IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 1103 */                  iOi1II01i0.I0000O(iOO11li1OoIII00000oIO2, Ii1oo1ooill0.I00iiI, null, new IlI1IiIo(ilI1loI1lO1, context2, z2 ? 1 : 0, i3), 2);
/* 1106 */                  return ooiIlOl1iI;
                        case 10:
/* 1039 */                  IlI1loI1lO1 ilI1loI1lO12 = (IlI1loI1lO1) this.I00iiI;
/* 1044 */                  IlI0olO00l0l ilI0olO00l0l = (IlI0olO00l0l) this.I00iiO;
/* 1046 */                  OlO0OIIl1 olO0OIIl1 = ilI1loI1lO12.I00000oOI;
/* 1078 */                  olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), ilI0olO00l0l, false, null, null, null, null, null, 0.0f, false, false, false, 2034));
/* 1081 */                  return ooiIlOl1iI;
                        case 11:
/* 1033 */                  ((Function1) this.I00iiI).invoke((OO0l00Ii10) this.I00iiO);
/* 1036 */                  return ooiIlOl1iI;
                        case 12:
/* 886 */                   Ili0IOilll10 ili0IOilll10 = (Ili0IOilll10) this.I00iiI;
/* 890 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 892 */                   OlO0OIIl1 olO0OIIl12 = ili0IOilll10.I00000oOI;
/* 894 */                   Object obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 898 */                   IOoil1iiIilo iOoil1iiIilo = null;
/* 905 */                   Ili000 ili000 = obj2 instanceof Ili000 ? (Ili000) obj2 : null;
/* 906 */                   if (ili000 == null) {
/* 936 */                       olO0OIIl12.I000lI(null, Ili00oiIllI.I00000oIO((Ili00oiIllI) olO0OIIl12.getValue(), null, false, null, 0.0f, null, "Model not loaded — try re-initializing it.", false, 95));
                            } else {
/* 952 */                       String string = OlOoOIi0o.I00OIo(((Ili00oiIllI) olO0OIIl12.getValue()).I00000oIO).toString();
/* 960 */                       if (string.length() != 0 && !((Ili00oiIllI) olO0OIIl12.getValue()).I00000oOI) {
/* 1002 */                          olO0OIIl12.I000lI(null, Ili00oiIllI.I00000oIO((Ili00oiIllI) olO0OIIl12.getValue(), null, true, "Starting", 0.0f, null, null, false, 1));
/* 1022 */                          ili0IOilll10.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ili0IOilll10), IiiIil1lOIO.I00000oIO, null, new I0O0il1iIl(ili000, string, ili0IOilll10, iOoil1iiIilo, 8), 2);
                                }
                            }
/* 1024 */                  return ooiIlOl1iI;
                        case 13:
/* 843 */                   Ili0IOilll10 ili0IOilll102 = (Ili0IOilll10) this.I00iiI;
/* 848 */                   Context context3 = (Context) this.I00iiO;
/* 858 */                   Bitmap bitmap = ((Ili00oiIllI) ili0IOilll102.I00000oOI.getValue()).I0000oI00;
/* 860 */                   if (bitmap != null) {
/* 863 */                       IOO11li1OoII iOO11li1OoIII00000oIO3 = OooiooIOO.I00000oIO(ili0IOilll102);
/* 867 */                       IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 879 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO3, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context3, ili0IOilll102, bitmap, (IOoil1iiIilo) null, 9), 2);
                            }
/* 882 */                   return ooiIlOl1iI;
                        case 14:
/* 837 */                   ((OOo0ooi) this.I00iiI).I00iOIl = iiliIooIliOo.I00000oIO((IliI1i1i0Oo) this.I00iiO, OO110li0ioo.I00000oIO);
/* 839 */                   return ooiIlOl1iI;
                        case 15:
/* 820 */                   ((OOo0ooi) this.I00iiI).I00iOIl = ((IliIO10oO0) this.I00iiO).I010lI0oi();
/* 822 */                   return ooiIlOl1iI;
                        case 16:
/* 805 */                   ((OOo0ooi) this.I00iiI).I00iOIl = iiliIooIliOo.I00000oIO((IliIlIlo1i1) this.I00iiO, OO110li0ioo.I00000oIO);
/* 807 */                   return ooiIlOl1iI;
                        case 17:
/* 775 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) this.I00iiI;
/* 779 */                   OI0Iol1O oI0Iol1O = (OI0Iol1O) this.I00iiO;
/* 787 */                   iloI0lOlll12.I00IOO(oI0Iol1O.I00000oIO, oI0Iol1O.I000II, oI0Iol1O.I00000oOI, true);
/* 790 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 769 */                   ((Io1ioiI1) this.I00iiI).I0000O((O1ooOo) this.I00iiO);
/* 772 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 757 */                   ((Function1) this.I00iiI).invoke((OloIl1l1oOii) this.I00iiO);
/* 760 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 724 */                   OoI01iiOoo01 ooI01iiOoo01 = (OoI01iiOoo01) this.I00iiI;
/* 732 */                   ((OI10i0Il) this.I00iiO).setValue(Boolean.FALSE);
/* 735 */                   Ii1liIllli0 ii1liIllli0 = ooI01iiOoo01.I00000oOI;
/* 737 */                   ii1liIllli0.getClass();
/* 745 */                   iOi1IOoIO0l.I00000oOI(new Ii1l100(ii1liIllli0, z3 ? 1 : 0, i2));
/* 748 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 718 */                   ((Function1) this.I00iiI).invoke((IoiOlOo10l00) this.I00iiO);
/* 721 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 670 */                   IoiIII ioiIII = (IoiIII) this.I00iiI;
/* 675 */                   Context context4 = (Context) this.I00iiO;
/* 685 */                   Bitmap bitmap2 = ((IoiII1lloI) ioiIII.I00000oOI.getValue()).I000OOo1O;
/* 687 */                   if (bitmap2 != null) {
/* 690 */                       IOO11li1OoII iOO11li1OoIII00000oIO4 = OooiooIOO.I00000oIO(ioiIII);
/* 694 */                       IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 706 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO4, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context4, ioiIII, bitmap2, (IOoil1iiIilo) null, 13), 2);
                            }
/* 709 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 477 */                   IoiIII ioiIII2 = (IoiIII) this.I00iiI;
/* 481 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiO;
/* 483 */                   OlO0OIIl1 olO0OIIl13 = ioiIII2.I00000oOI;
/* 485 */                   Object obj3 = o1oIOiI11o02.I00IlilI0i0i;
/* 489 */                   IOoil1iiIilo iOoil1iiIilo2 = null;
/* 496 */                   StableDiffusion stableDiffusion = obj3 instanceof StableDiffusion ? (StableDiffusion) obj3 : null;
/* 497 */                   if (stableDiffusion == null) {
/* 534 */                       olO0OIIl13.I000lI(null, IoiII1lloI.I00000oIO((IoiII1lloI) olO0OIIl13.getValue(), null, null, 0, 0.0f, null, false, 0, 0, null, "Model not loaded", false, 0.0f, false, 7679));
                            } else {
/* 544 */                       IoiII1lloI ioiII1lloI = (IoiII1lloI) olO0OIIl13.getValue();
/* 552 */                       if (OlOoOIi0o.I001l0I00(ioiII1lloI.I00000oIO)) {
/* 582 */                           olO0OIIl13.I000lI(null, IoiII1lloI.I00000oIO(ioiII1lloI, null, null, 0, 0.0f, null, false, 0, 0, null, "Enter a prompt first", false, 0.0f, false, 7679));
                                } else {
/* 588 */                           String str7 = ioiII1lloI.I00000oIO;
/* 590 */                           String str8 = ioiII1lloI.I00000oOI;
/* 592 */                           IoiOlOo10l00 ioiOlOo10l00 = ioiII1lloI.I0000oI00;
/* 594 */                           int i9 = ioiOlOo10l00.I00000oIO;
/* 596 */                           int i10 = ioiOlOo10l00.I00000oOI;
/* 598 */                           int i11 = ioiII1lloI.I0000Il00O;
/* 600 */                           float f = ioiII1lloI.I0000O;
/* 602 */                           OlIiOOo1O1ll olIiOOo1O1ll = new OlIiOOo1O1ll();
/* 605 */                           olIiOOo1O1ll.I00000oIO = str7;
/* 607 */                           olIiOOo1O1ll.I00000oOI = str8;
/* 609 */                           olIiOOo1O1ll.I0000Il00O = i9;
/* 611 */                           olIiOOo1O1ll.I0000O = i10;
/* 613 */                           olIiOOo1O1ll.I0000oI00 = i11;
/* 615 */                           olIiOOo1O1ll.I0001Ioi1lo = f;
/* 617 */                           VarHandle.storeStoreFence();
/* 648 */                           olO0OIIl13.I000lI(null, IoiII1lloI.I00000oIO(ioiII1lloI, null, null, 0, 0.0f, null, true, 0, i11, null, null, false, 0.0f, false, 7455));
/* 663 */                           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ioiIII2), null, null, new IiI110i1O(stableDiffusion, olIiOOo1O1ll, ioiIII2, iOoil1iiIilo2, 16), 3);
                                }
                            }
/* 666 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 273 */                   OilOloI oilOloI = (OilOloI) this.I00iiI;
/* 277 */                   O011OoiO1 o011OoiO1 = (O011OoiO1) this.I00iiO;
/* 281 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 284 */                   O01iI00o.I0000O(o011OoiO1, oilOloI);
/* 287 */                   int iI0000oI002 = oilOloI.I0000oI00();
/* 292 */                   for (int i12 = 0; i12 < iI0000oI002; i12++) {
/* 294 */                       List listI000II = oilOloI.I000II(i12);
/* 302 */                       ArrayList arrayList = new ArrayList();
/* 313 */                       for (Object obj4 : listI000II) {
/* 321 */                           if (obj4 instanceof O01i11O0l0I) {
/* 323 */                               arrayList.add(obj4);
                                    }
                                }
/* 331 */                       O01i11O0l0I o01i11O0l0I = (O01i11O0l0I) IOOi0Ool1i.I00Ol00(arrayList);
/* 333 */                       if (o01i11O0l0I != null && (strArrNames = o01i11O0l0I.names()) != null) {
/* 343 */                           for (String str9 : strArrNames) {
/* 362 */                               String str10 = O0000Ioio00.I0000O(oilOloI.I000oI1ioi(), Oili0Il.I00000oOI) ? "enum value" : "property";
/* 368 */                               if (linkedHashMap.containsKey(str9)) {
/* 460 */                                   throw new O01Io1OOi(l0I0OO0.I00000oOI(-1, "The suggested name '" + str9 + "' for " + str10 + ' ' + oilOloI.I0001Ioi1lo(i12) + " is already one of the names for " + str10 + ' ' + oilOloI.I0001Ioi1lo(((Number) O1Oii0O0loo.I00000oOI(str9, linkedHashMap)).intValue()) + " in " + oilOloI, null, null, null));
                                        }
/* 374 */                               linkedHashMap.put(str9, Integer.valueOf(i12));
                                    }
                                }
                            }
                            return linkedHashMap.isEmpty() ? il011I1OiO0I : linkedHashMap;
                        case PoseLandmark.LEFT_KNEE:
/* 137 */                   O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) this.I00iiI;
/* 141 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiO;
/* 143 */                   IIlOoolol0ll iIlOoolol0ll = o0iiOioolIi.I010101Oo1lO;
/* 152 */                   if ((((O1ooOo) iIlOoolol0ll.I00io1l).I00iio & 8) != 0) {
/* 158 */                       for (O1ooOo o1ooOo = (Olo11IOO) iIlOoolol0ll.I00ilO0; o1ooOo != null; o1ooOo = o1ooOo.I00ilI0I1) {
/* 163 */                           if ((o1ooOo.I00iiO & 8) != 0) {
/* 165 */                               IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo;
/* 166 */                               ?? oi110o0 = 0;
/* 167 */                               while (iiIioO0ol1oII0000Il00O != 0) {
/* 171 */                                   if (iiIioO0ol1oII0000Il00O instanceof OiiooOl) {
/* 173 */                                       OiiooOl oiiooOl = (OiiooOl) iiIioO0ol1oII0000Il00O;
/* 179 */                                       if (oiiooOl.I00IOO()) {
/* 183 */                                           OiioiIIlooo oiioiIIlooo = new OiioiIIlooo();
/* 186 */                                           oOo0ooi.I00iOIl = oiioiIIlooo;
/* 188 */                                           oiioiIIlooo.I00iio = true;
                                                }
/* 194 */                                       if (oiiooOl.I00olI()) {
/* 200 */                                           ((OiioiIIlooo) oOo0ooi.I00iOIl).I00iiO = true;
                                                }
/* 206 */                                       oiiooOl.I00oOio10iI1((Oil0O0I) oOo0ooi.I00iOIl);
                                            } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 8) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 222 */                                       O1ooOo o1ooOo2 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 224 */                                       int i13 = 0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o0 = oi110o0;
/* 225 */                                       while (o1ooOo2 != null) {
/* 230 */                                           if ((o1ooOo2.I00iiO & 8) != 0) {
/* 232 */                                               i13++;
                                                        oi110o0 = oi110o0;
/* 234 */                                               if (i13 == 1) {
/* 236 */                                                   iiIioO0ol1oII0000Il00O = o1ooOo2;
                                                        } else {
/* 238 */                                                   if (oi110o0 == 0) {
/* 244 */                                                       oi110o0 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 247 */                                                   if (iiIioO0ol1oII0000Il00O != 0) {
/* 249 */                                                       oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 252 */                                                       iiIioO0ol1oII0000Il00O = 0;
                                                            }
/* 253 */                                                   oi110o0.I00000oOI(o1ooOo2);
                                                        }
                                                    }
/* 256 */                                           o1ooOo2 = o1ooOo2.I00ilO0;
                                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                    oi110o0 = oi110o0;
                                                }
/* 259 */                                       if (i13 == 1) {
                                                }
                                            }
/* 262 */                                   iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                        }
                                    }
                                }
                            }
/* 270 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 93 */                    IiO0o1I iiO0o1I = (IiO0o1I) this.I00iiI;
/* 97 */                    O0l101IIlOI0 o0l101IIlOI0 = (O0l101IIlOI0) this.I00iiO;
/* 103 */                   O0l0I1 o0l0I1 = (O0l0I1) iiO0o1I.getValue();
/* 117 */                   I00Ol00 i00Ol00 = new I00Ol00((IooO11l) o0l101IIlOI0.I0000O.I0001Ioi1lo.getValue(), o0l0I1);
/* 122 */                   O0l0II1 o0l0II1 = new O0l0II1();
/* 125 */                   o0l0II1.I00000oIO = o0l101IIlOI0;
/* 127 */                   o0l0II1.I00000oOI = o0l0I1;
/* 129 */                   o0l0II1.I0000Il00O = i00Ol00;
/* 131 */                   VarHandle.storeStoreFence();
/* 134 */                   return o0l0II1;
                        case 27:
/* 47 */                    IiO0o1I iiO0o1I2 = (IiO0o1I) this.I00iiI;
/* 51 */                    OIoIoIO0oI1O oIoIoIO0oI1O = (OIoIoIO0oI1O) this.I00iiO;
/* 57 */                    OIoI10O00OO oIoI10O00OO = (OIoI10O00OO) iiO0o1I2.getValue();
/* 73 */                    I00Ol00 i00Ol002 = new I00Ol00((IooO11l) ((O0lio0) oIoIoIO0oI1O.I0000O.I00ilO0).getValue(), oIoI10O00OO);
/* 78 */                    OIoI1illIll1 oIoI1illIll1 = new OIoI1illIll1();
/* 81 */                    oIoI1illIll1.I00000oIO = oIoIoIO0oI1O;
/* 83 */                    oIoI1illIll1.I00000oOI = oIoI10O00OO;
/* 85 */                    oIoI1illIll1.I0000Il00O = i00Ol002;
/* 87 */                    VarHandle.storeStoreFence();
/* 90 */                    return oIoI1illIll1;
                        case PoseLandmark.RIGHT_ANKLE:
/* 41 */                    return new O0o0oil1l1o((OiIiol10) this.I00iiI, il011I1OiO0I, (OiIil1il) this.I00iiO);
                        default:
/* 28 */                    ((O1oIOiI11o0) this.I00iiI).I00IlilI0i0i = (O1111l) this.I00iiO;
/* 30 */                    return ooiIlOl1iI;
                    }
                }
            }

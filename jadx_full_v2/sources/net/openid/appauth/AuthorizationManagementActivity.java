            package net.openid.appauth;

            import android.app.PendingIntent;
            import android.content.ActivityNotFoundException;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Set;
            import java.util.concurrent.TimeUnit;
            import org.json.JSONException;
            import p000.I000II;
            import p000.I11io0O0O1o1;
            import p000.I1iOlO0I1;
            import p000.I1iOll;
            import p000.I1iOo1IoI1;
            import p000.I1iOolOO0o;
            import p000.I1ii0iiiloi;
            import p000.I1ii0loo111;
            import p000.Il0IolOI1;
            import p000.Il0O0O0I;
            import p000.O1I1OO;
            import p000.iOIOlii1;
            import p000.iOOIoOO1il1i;
            import p000.iOOOol01O0;
            import p000.iOOi00o0;
            import p000.lII1IoI;
            
            public class AuthorizationManagementActivity extends I11io0O0O1o1 {
                public static final int I0100o111I = 0;
                public boolean I00oo1iO0ll = false;
                public Intent I00ooIo0;
                public I1iOolOO0o I00ooiO1I;
                public PendingIntent I00oooO;
                public PendingIntent I0100i;

                public final void I001IIilI0O(Bundle bundle) throws PendingIntent.CanceledException {
/* 3 */             if (bundle == null) {
/* 14 */                O1I1OO.I000OOo1O().I000l1(5, null, "No stored state - unable to handle response", new Object[0]);
/* 17 */                finish();
/* 20 */                return;
                    }
/* 29 */            this.I00ooIo0 = (Intent) bundle.getParcelable("authIntent");
/* 37 */            this.I00oo1iO0ll = bundle.getBoolean("authStarted", false);
/* 47 */            this.I00oooO = (PendingIntent) bundle.getParcelable("completeIntent");
/* 57 */            this.I0100i = (PendingIntent) bundle.getParcelable("cancelIntent");
                    try {
/* 61 */                String string = bundle.getString("authRequest", null);
/* 77 */                this.I00ooiO1I = string != null ? iOOi00o0.I00000oIO(string, bundle.getString("authRequestType", null)) : null;
                    } catch (JSONException unused) {
/* 88 */                I001IO000(this.I0100i, I1iOlO0I1.I00000oIO.I0001Ioi1lo(), 0);
                    }
                }

                public final void I001IO000(PendingIntent pendingIntent, Intent intent, int i) throws PendingIntent.CanceledException {
/* 1 */             if (pendingIntent == null) {
/* 25 */                setResult(i, intent);
/* 215 */               return;
                    }
                    try {
/* 4 */                 pendingIntent.send(this, 0, intent);
                    } catch (PendingIntent.CanceledException e) {
/* 21 */                O1I1OO.I000OOo1O().I000l1(6, null, "Failed to send cancel intent", e);
                    }
                }

                @Override
                public final void onCreate(Bundle bundle) throws PendingIntent.CanceledException {
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle == null) {
/* 14 */                I001IIilI0O(getIntent().getExtras());
                    } else {
/* 18 */                I001IIilI0O(bundle);
                    }
                }

                @Override
                public final void onNewIntent(Intent intent) {
/* 1 */             super.onNewIntent(intent);
/* 4 */             setIntent(intent);
                }

                @Override
                public final void onResume() throws PendingIntent.CanceledException {
                    iOOOol01O0 i1ii0loo111;
                    Intent intentI00000oOI;
                    String[] strArrSplit;
/* 3 */             super.onResume();
/* 10 */            if (!this.I00oo1iO0ll) {
                        try {
/* 14 */                    startActivity(this.I00ooIo0);
/* 18 */                    this.I00oo1iO0ll = true;
/* 20 */                    return;
                        } catch (ActivityNotFoundException unused) {
/* 25 */                    O1I1OO.I0001Ioi1lo("Authorization flow canceled due to missing browser", new Object[0]);
/* 40 */                    I001IO000(this.I0100i, I1iOo1IoI1.I0000O(I1iOll.I00000oOI, null).I0001Ioi1lo(), 0);
/* 43 */                    finish();
/* 46 */                    return;
                        }
                    }
/* 55 */            if (getIntent().getData() != null) {
/* 61 */                Uri data = getIntent().getData();
/* 75 */                if (data.getQueryParameterNames().contains("error")) {
/* 77 */                    int i = I1iOo1IoI1.I00ilO0;
/* 79 */                    String queryParameter = data.getQueryParameter("error");
/* 85 */                    String queryParameter2 = data.getQueryParameter("error_description");
/* 91 */                    String queryParameter3 = data.getQueryParameter("error_uri");
/* 101 */                   I1iOo1IoI1 i1iOo1IoI1 = (I1iOo1IoI1) I1iOlO0I1.I0000O.get(queryParameter);
/* 103 */                   if (i1iOo1IoI1 == null) {
/* 106 */                       i1iOo1IoI1 = I1iOlO0I1.I00000oOI;
                            }
/* 110 */                   int i2 = i1iOo1IoI1.I00iOIl;
/* 112 */                   int i3 = i1iOo1IoI1.I00iiI;
/* 114 */                   if (queryParameter2 == null) {
/* 118 */                       queryParameter2 = i1iOo1IoI1.I00iio;
                            }
/* 136 */                   intentI00000oOI = new I1iOo1IoI1(i2, i3, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : i1iOo1IoI1.I00ilI0I1, null).I0001Ioi1lo();
                        } else {
/* 142 */                   I1iOolOO0o i1iOolOO0o = this.I00ooiO1I;
/* 150 */                   if (i1iOolOO0o instanceof I1ii0iiiloi) {
/* 153 */                       I1ii0iiiloi i1ii0iiiloi = (I1ii0iiiloi) i1iOolOO0o;
/* 157 */                       new LinkedHashMap();
/* 160 */                       String queryParameter4 = data.getQueryParameter("state");
/* 164 */                       lII1IoI.I0000O(queryParameter4, "state must not be empty");
/* 169 */                       String queryParameter5 = data.getQueryParameter("token_type");
/* 175 */                       lII1IoI.I0000O(queryParameter5, "tokenType must not be empty");
/* 180 */                       String queryParameter6 = data.getQueryParameter("code");
/* 186 */                       lII1IoI.I0000O(queryParameter6, "authorizationCode must not be empty");
/* 191 */                       String queryParameter7 = data.getQueryParameter("access_token");
/* 197 */                       lII1IoI.I0000O(queryParameter7, "accessToken must not be empty");
/* 202 */                       String queryParameter8 = data.getQueryParameter("expires_in");
/* 217 */                       Long lValueOf = queryParameter8 != null ? Long.valueOf(Long.parseLong(queryParameter8)) : null;
/* 237 */                       Long lValueOf2 = lValueOf == null ? null : Long.valueOf(TimeUnit.SECONDS.toMillis(lValueOf.longValue()) + System.currentTimeMillis());
/* 244 */                       String queryParameter9 = data.getQueryParameter("id_token");
/* 250 */                       lII1IoI.I0000O(queryParameter9, "idToken cannot be empty");
/* 255 */                       String queryParameter10 = data.getQueryParameter("scope");
/* 282 */                       String strI00000oIO = (TextUtils.isEmpty(queryParameter10) || (strArrSplit = queryParameter10.split(" +")) == null) ? null : iOOIoOO1il1i.I00000oIO(Arrays.asList(strArrSplit));
/* 287 */                       Set set = I1ii0loo111.I000OiO;
/* 291 */                       LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 306 */                       for (String str : data.getQueryParameterNames()) {
/* 318 */                           if (!set.contains(str)) {
/* 324 */                               linkedHashMap.put(str, data.getQueryParameter(str));
                                    }
                                }
/* 340 */                       i1ii0loo111 = new I1ii0loo111(i1ii0iiiloi, queryParameter4, queryParameter5, queryParameter6, queryParameter7, lValueOf2, queryParameter9, strI00000oIO, Collections.unmodifiableMap(iOIOlii1.I00000oOI(linkedHashMap, I1ii0loo111.I000OiO)));
                            } else {
/* 346 */                       if (!(i1iOolOO0o instanceof Il0IolOI1)) {
/* 456 */                           I000II.I000iOII("Malformed request or uri");
/* 459 */                           return;
                                }
/* 348 */                       Il0IolOI1 il0IolOI1 = (Il0IolOI1) i1iOolOO0o;
/* 350 */                       String queryParameter11 = data.getQueryParameter("state");
/* 354 */                       if (queryParameter11 != null) {
/* 356 */                           lII1IoI.I00000oOI(queryParameter11, "state must not be empty");
                                }
/* 361 */                       Il0O0O0I il0O0O0I = new Il0O0O0I();
/* 364 */                       il0O0O0I.I00000oIO = il0IolOI1;
/* 366 */                       il0O0O0I.I00000oOI = queryParameter11;
/* 368 */                       VarHandle.storeStoreFence();
                                i1ii0loo111 = il0O0O0I;
                            }
/* 377 */                   if ((this.I00ooiO1I.I00000oOI() != null || i1ii0loo111.I00000oIO() == null) && (this.I00ooiO1I.I00000oOI() == null || this.I00ooiO1I.I00000oOI().equals(i1ii0loo111.I00000oIO()))) {
/* 440 */                       intentI00000oOI = i1ii0loo111.I00000oOI();
                            } else {
/* 430 */                       O1I1OO.I000OOo1O().I000l1(5, null, "State returned in authorization response (%s) does not match state from request (%s) - discarding response", i1ii0loo111.I00000oIO(), this.I00ooiO1I.I00000oOI());
/* 435 */                       intentI00000oOI = I1iOlO0I1.I0000Il00O.I0001Ioi1lo();
                            }
                        }
/* 444 */               intentI00000oOI.setData(data);
/* 450 */               I001IO000(this.I00oooO, intentI00000oOI, -1);
                    } else {
/* 464 */               O1I1OO.I0001Ioi1lo("Authorization flow canceled by user", new Object[0]);
/* 479 */               I001IO000(this.I0100i, I1iOo1IoI1.I0000O(I1iOll.I00000oIO, null).I0001Ioi1lo(), 0);
                    }
/* 482 */           finish();
                }

                @Override
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 8 */             bundle.putBoolean("authStarted", this.I00oo1iO0ll);
/* 15 */            bundle.putParcelable("authIntent", this.I00ooIo0);
/* 26 */            bundle.putString("authRequest", this.I00ooiO1I.I00000oIO());
/* 29 */            I1iOolOO0o i1iOolOO0o = this.I00ooiO1I;
/* 48 */            bundle.putString("authRequestType", i1iOolOO0o instanceof I1ii0iiiloi ? "authorization" : i1iOolOO0o instanceof Il0IolOI1 ? "end_session" : null);
/* 55 */            bundle.putParcelable("completeIntent", this.I00oooO);
/* 62 */            bundle.putParcelable("cancelIntent", this.I0100i);
                }
            }

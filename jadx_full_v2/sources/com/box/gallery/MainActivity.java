            package com.box.gallery;

            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.Signature;
            import android.content.pm.SigningInfo;
            import android.content.res.Resources;
            import android.hardware.biometrics.BiometricManager;
            import android.net.Uri;
            import android.os.Bundle;
            import android.util.Log;
            import android.util.TypedValue;
            import android.view.KeyEvent;
            import com.google.ai.edge.litertlm.ExperimentalFlags;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.MessageDigest;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.Executor;
            import p000.I0000O;
            import p000.I000II;
            import p000.I0II1i1l0;
            import p000.I0IIiO0iI;
            import p000.I0IOoio1iool;
            import p000.I0Ii0oI1;
            import p000.I0IiI0ii1i1l;
            import p000.I11ilOI01O;
            import p000.I1IIl0I0l1I;
            import p000.I1ii1o0;
            import p000.II0Oi0iIol0i;
            import p000.II0iI101IiO1;
            import p000.II0iIOO;
            import p000.II0ii1IlOoio;
            import p000.II0ii1l11O;
            import p000.II0ilOIlloOl;
            import p000.II0ill;
            import p000.II1iOOOOOl01;
            import p000.IIOOoll;
            import p000.IIOo1i;
            import p000.IOOi0Ool1i;
            import p000.IOiOII1;
            import p000.IOii1l;
            import p000.IOoil1iiIilo;
            import p000.Ii10ooiIO;
            import p000.IiI01lI;
            import p000.IiIO0ill;
            import p000.IioOll;
            import p000.Ill0oOi0;
            import p000.IloolIii1o;
            import p000.Io1il0IoII;
            import p000.O0000Ioio00;
            import p000.O0IOli0o0;
            import p000.O0ioO00I;
            import p000.O0oiiOll0O1;
            import p000.O1O1oO11O;
            import p000.O1O1ol110;
            import p000.O1O1ooOil11;
            import p000.O1OI0I01i11;
            import p000.O1oiOloOo;
            import p000.O1ol100o0O;
            import p000.OI0l1OOllOo;
            import p000.OO01IO;
            import p000.OOIliOOi010;
            import p000.OOoOl0i;
            import p000.Oii0IoIiOO;
            import p000.OlO0OIIl1;
            import p000.OlOoOIi0o;
            import p000.OlOolloIIOl0;
            import p000.Oool0IIIO0o;
            import p000.Oool0iOoooIo;
            import p000.iO0oiO10O;
            import p000.iOi0oO1iilo;
            import p000.iOi1II01i0;
            import p000.ilII1oOi1;
            import p000.l10O10;
            import p000.li1iolIo;
            
            public final class MainActivity extends Ill0oOi0 implements IloolIii1o {
                public static final int I010101Oo1lO = 0;
                public volatile I0II1i1l0 I00oliIiO01i;
                public final Object I00oo1iO0ll = new Object();
                public boolean I00ooIo0 = false;
                public final I1ii1o0 I00ooiO1I;
                public boolean I00oooO;
                public boolean I0100i;
                public IIOOoll I0100o111I;

                /* JADX WARN: Multi-variable type inference failed */
                public MainActivity() {
/* 16 */            int i = 1;
/* 17 */            I11ilOI01O i11ilOI01O = new I11ilOI01O(i);
/* 20 */            i11ilOI01O.I00000oOI = this;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            I000l1(i11ilOI01O);
/* 30 */            O1OI0I01i11 o1OI0I01i11 = new O1OI0I01i11(0);
/* 33 */            o1OI0I01i11.I00iiI = this;
/* 35 */            VarHandle.storeStoreFence();
/* 44 */            O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(O1ol100o0O.class);
/* 50 */            O1OI0I01i11 o1OI0I01i112 = new O1OI0I01i11(i);
/* 53 */            o1OI0I01i112.I00iiI = this;
/* 55 */            VarHandle.storeStoreFence();
/* 61 */            O1OI0I01i11 o1OI0I01i113 = new O1OI0I01i11(2);
/* 64 */            o1OI0I01i113.I00iiI = this;
/* 66 */            VarHandle.storeStoreFence();
/* 71 */            I1ii1o0 i1ii1o0 = new I1ii1o0(20, 0 == true ? 1 : 0);
/* 74 */            i1ii1o0.I00iiI = o0IOli0o0I00000oOI;
/* 76 */            i1ii1o0.I00iiO = o1OI0I01i112;
/* 78 */            i1ii1o0.I00iio = o1OI0I01i11;
/* 80 */            i1ii1o0.I00ilI0I1 = o1OI0I01i113;
/* 82 */            VarHandle.storeStoreFence();
/* 85 */            this.I00ooiO1I = i1ii1o0;
                }

                @Override
                public final Object I0000Il00O() {
/* 5 */             return I0010o().I0000Il00O();
                }

                @Override
                public final Oool0IIIO0o I0000O() {
/* 1 */             Oool0IIIO0o oool0IIIO0oI0000O = super.I0000O();
/* 13 */            Ii10ooiIO ii10ooiIO = (Ii10ooiIO) ((IiIO0ill) ilII1oOi1.I00000oIO(IiIO0ill.class, this));
/* 15 */            O0ioO00I o0ioO00II00000oIO = ii10ooiIO.I00000oIO();
/* 25 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(ii10ooiIO.I00000oIO, ii10ooiIO.I00000oOI);
/* 30 */            oool0IIIO0oI0000O.getClass();
/* 33 */            return new Io1il0IoII(o0ioO00II00000oIO, oool0IIIO0oI0000O, i0IIiO0iI);
                }

                public final I0II1i1l0 I0010o() {
/* 3 */             if (this.I00oliIiO01i == null) {
                        synchronized (this.I00oo1iO0ll) {
                            try {
/* 10 */                        if (this.I00oliIiO01i == null) {
/* 16 */                            this.I00oliIiO01i = I00111O();
                                }
                            } finally {
                            }
                        }
                    }
/* 25 */            return this.I00oliIiO01i;
                }

                public final I0II1i1l0 I00111O() {
/* 3 */             I0II1i1l0 i0II1i1l0 = new I0II1i1l0();
/* 11 */            i0II1i1l0.I00iiI = new Object();
/* 13 */            i0II1i1l0.I00iiO = this;
/* 17 */            I0IiI0ii1i1l i0IiI0ii1i1l = new I0IiI0ii1i1l();
/* 25 */            i0IiI0ii1i1l.I00iio = new Object();
/* 27 */            i0IiI0ii1i1l.I00iOIl = this;
/* 29 */            i0IiI0ii1i1l.I00iiI = this;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            i0II1i1l0.I00iio = i0IiI0ii1i1l;
/* 36 */            VarHandle.storeStoreFence();
/* 55 */            return i0II1i1l0;
                }

                public final void I001IIilI0O(Intent intent) {
                    String string;
                    MainActivity mainActivity;
                    boolean z;
                    Object value;
/* 1 */             Uri data = intent.getData();
/* 5 */             if (data == null || (string = data.toString()) == null || !OlOolloIIOl0.I000l1(string, "com.box.gallery://shortcut/", false)) {
/* 168 */               return;
                    }
/* 37 */            List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(OlOoOIi0o.I00IOO("com.box.gallery://shortcut/", string), new String[]{"?"}, 2);
/* 45 */            CharSequence charSequence = (CharSequence) listI00IoIO0lI.get(0);
/* 51 */            if (charSequence.length() == 0) {
/* 168 */               return;
                    }
/* 56 */            String str = (String) charSequence;
/* 63 */            String str2 = (String) IOOi0Ool1i.I00II0oii1o(1, listI00IoIO0lI);
/* 65 */            if (str2 == null || !OlOoOIi0o.I000oI1ioi(str2, "voice=true", false)) {
/* 80 */                mainActivity = this;
/* 82 */                z = false;
                    } else {
/* 75 */                mainActivity = this;
/* 77 */                z = true;
                    }
/* 92 */            OlO0OIIl1 olO0OIIl1 = ((O1ol100o0O) mainActivity.I00ooiO1I.getValue()).I000O01llI0;
/* 129 */           do {
/* 94 */                value = olO0OIIl1.getValue();
/* 129 */           } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) value, null, null, null, null, false, null, null, null, 0L, 0L, null, 0.0f, null, str, z, 8191)));
/* 134 */           intent.setData(null);
                }

                public final void I001IO000(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             I0II1i1l0 i0II1i1l0I0010o = I0010o();
/* 8 */             I0IiI0ii1i1l i0IiI0ii1i1l = i0II1i1l0I0010o.I00iio;
/* 10 */            MainActivity mainActivity = i0IiI0ii1i1l.I00iOIl;
/* 12 */            MainActivity mainActivity2 = i0IiI0ii1i1l.I00iiI;
/* 19 */            I0IOoio1iool i0IOoio1iool = new I0IOoio1iool(0);
/* 22 */            i0IOoio1iool.I00000oOI = mainActivity2;
/* 24 */            VarHandle.storeStoreFence();
/* 46 */            IIOo1i iIOo1i = ((I0Ii0oI1) new Oool0iOoooIo(mainActivity.I000II(), i0IOoio1iool, li1iolIo.I00000oIO(mainActivity)).I00000oOI(I0Ii0oI1.class)).I0000Il00O;
/* 48 */            i0II1i1l0I0010o.I00ilI0I1 = iIOo1i;
/* 54 */            if (((OI0l1OOllOo) iIOo1i.I0000Il00O) == null) {
/* 58 */                OI0l1OOllOo oI0l1OOllOoI0000oI00 = i0II1i1l0I0010o.I00iiO.I0000oI00();
/* 64 */                if (iIOo1i.I00000oOI) {
/* 66 */                    iIOo1i.I0000Il00O = oI0l1OOllOoI0000oI00;
                        } else {
/* 71 */                    I000II.I001IO000("setExtras should only be called for an Activity that extends ComponentActivity");
                        }
                    }
                }

                @Override
                public final void onCreate(Bundle bundle) throws IOException {
                    Signature[] apkContentsSigners;
                    int i;
/* 1 */             O0oiiOll0O1 o0oiiOll0O1 = this.I00iOIl;
/* 3 */             I001IO000(bundle);
/* 6 */             int i2 = 3;
/* 7 */             int i3 = 1;
                    try {
/* 22 */                SigningInfo signingInfo = getPackageManager().getPackageInfo(getPackageName(), 134217728).signingInfo;
/* 24 */                if (signingInfo != null && (apkContentsSigners = signingInfo.getApkContentsSigners()) != null) {
/* 36 */                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 42 */                    byte[] bArr = new byte[32];
/* 44 */                    int i4 = 0;
/* 46 */                    for (int i5 = 0; i5 < 32; i5++) {
/* 60 */                        bArr[i5] = (byte) (iO0oiO10O.I00000oOI[i5] ^ iO0oiO10O.I00000oIO[i5 % 9]);
                            }
/* 67 */                    for (Signature signature : apkContentsSigners) {
/* 83 */                        if (Arrays.equals(messageDigest.digest(signature.toByteArray()), bArr)) {
/* 88 */                            IIOOoll iIOOoll = new IIOOoll(6);
/* 91 */                            iIOOoll.I00iiI = this;
/* 93 */                            VarHandle.storeStoreFence();
/* 96 */                            this.I0100o111I = iIOOoll;
/* 98 */                            OlO0OIIl1 olO0OIIl1 = I1IIl0I0l1I.I00000oIO;
/* 102 */                           SharedPreferences sharedPreferences = getSharedPreferences("box_settings", 0);
/* 112 */                           I1IIl0I0l1I.I000O01llI0 = sharedPreferences.getBoolean("biometric_lock_enabled", false);
/* 114 */                           OlO0OIIl1 olO0OIIl12 = I1IIl0I0l1I.I00000oOI;
/* 122 */                           Boolean boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("screenshots_enabled", false));
/* 126 */                           olO0OIIl12.getClass();
/* 129 */                           IOoil1iiIilo iOoil1iiIilo = null;
/* 130 */                           olO0OIIl12.I000lI(null, boolValueOf);
/* 133 */                           OlO0OIIl1 olO0OIIl13 = I1IIl0I0l1I.I0000O;
/* 141 */                           Boolean boolValueOf2 = Boolean.valueOf(sharedPreferences.getBoolean("tap_jacking_protection_enabled", true));
/* 145 */                           olO0OIIl13.getClass();
/* 148 */                           olO0OIIl13.I000lI(null, boolValueOf2);
/* 151 */                           OlO0OIIl1 olO0OIIl14 = I1IIl0I0l1I.I0001Ioi1lo;
/* 159 */                           Boolean boolValueOf3 = Boolean.valueOf(sharedPreferences.getBoolean("accessibility_data_sensitive_enabled", false));
/* 163 */                           olO0OIIl14.getClass();
/* 166 */                           olO0OIIl14.I000lI(null, boolValueOf3);
/* 171 */                           O0oiiOll0O1 o0oiiOll0O12 = OOIliOOi010.I00ioIO.I00ilO0;
/* 175 */                           I0000O i0000o = new I0000O(i3);
/* 178 */                           i0000o.I00iiI = this;
/* 180 */                           VarHandle.storeStoreFence();
/* 183 */                           o0oiiOll0O12.I00li1OI(i0000o);
/* 186 */                           OlO0OIIl1 olO0OIIl15 = II0Oi0iIol0i.I00000oIO;
/* 200 */                           Boolean boolValueOf4 = Boolean.valueOf(getSharedPreferences("box_db_enc", 0).getBoolean("enabled", false));
/* 204 */                           olO0OIIl15.getClass();
/* 207 */                           olO0OIIl15.I000lI(null, boolValueOf4);
/* 219 */                           iOi1II01i0.I0000O(l10O10.I00000oIO(o0oiiOll0O1), null, null, new O1O1ooOil11(this, iOoil1iiIilo, i4), 3);
/* 231 */                           iOi1II01i0.I0000O(l10O10.I00000oIO(o0oiiOll0O1), null, null, new O1O1ooOil11(this, iOoil1iiIilo, i3), 3);
/* 244 */                           iOi1II01i0.I0000O(l10O10.I00000oIO(o0oiiOll0O1), null, null, new O1O1ooOil11(this, iOoil1iiIilo, 2), 3);
/* 249 */                           Oii0IoIiOO.I00000oIO(this, "APP_LAUNCHED");
/* 258 */                           String stringExtra = getIntent().getStringExtra("deeplink");
/* 262 */                           if (stringExtra != null) {
/* 270 */                               if (OlOolloIIOl0.I000l1(stringExtra, "http://", false) || OlOolloIIOl0.I000l1(stringExtra, "https://", false)) {
/* 304 */                                   startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)));
                                        } else {
/* 289 */                                   getIntent().setData(Uri.parse(stringExtra));
                                        }
                                    }
/* 311 */                           I001IIilI0O(getIntent());
/* 322 */                           ((O1ol100o0O) this.I00ooiO1I.getValue()).I00II0Ol1O0l();
/* 325 */                           Resources.Theme theme = getTheme();
/* 331 */                           TypedValue typedValue = new TypedValue();
/* 341 */                           if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
/* 347 */                               setTheme(i);
                                    }
/* 352 */                           if (!this.I00oooO) {
/* 358 */                               O1O1ol110 o1O1ol110 = new O1O1ol110(4);
/* 361 */                               o1O1ol110.I00iiI = this;
/* 363 */                               VarHandle.storeStoreFence();
/* 374 */                               IOiOII1.I00000oIO(this, new IOii1l(772451845, o1O1ol110, true));
/* 379 */                               ExperimentalFlags.INSTANCE.setEnableBenchmark(false);
/* 382 */                               this.I00oooO = true;
                                    }
/* 384 */                           IioOll.I00000oIO(this);
/* 391 */                           getWindow().setNavigationBarContrastEnforced(false);
/* 400 */                           getWindow().addFlags(Barcode.FORMAT_ITF);
/* 407 */                           getWindow().setSustainedPerformanceMode(true);
/* 410 */                           return;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
/* 417 */           O1O1ol110 o1O1ol1102 = new O1O1ol110(i2);
/* 420 */           o1O1ol1102.I00iiI = this;
/* 422 */           VarHandle.storeStoreFence();
/* 433 */           IOiOII1.I00000oIO(this, new IOii1l(1184353243, o1O1ol1102, true));
                }

                @Override
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 8 */             IIOo1i iIOo1i = I0010o().I00ilI0I1;
/* 10 */            if (iIOo1i != null) {
/* 13 */                iIOo1i.I0000Il00O = null;
                    }
                }

                @Override
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 1 */             if (keyEvent != null && keyEvent.getRepeatCount() == 0) {
/* 9 */                 II1iOOOOOl01 iI1iOOOOOl01 = iOi0oO1iilo.I00000oIO;
/* 29 */                if (iI1iOOOOOl01 != null ? ((Boolean) iI1iOOOOOl01.invoke(Integer.valueOf(i))).booleanValue() : false) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return super.onKeyDown(i, keyEvent);
                }

                @Override
                public final void onNewIntent(Intent intent) {
/* 1 */             super.onNewIntent(intent);
/* 4 */             setIntent(intent);
/* 9 */             String stringExtra = intent.getStringExtra("deeplink");
/* 13 */            if (stringExtra != null) {
/* 22 */                if (OlOolloIIOl0.I000l1(stringExtra, "http://", false) || OlOolloIIOl0.I000l1(stringExtra, "https://", false)) {
/* 52 */                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)));
                        } else {
/* 37 */                    intent.setData(Uri.parse(stringExtra));
                        }
                    }
/* 55 */            I001IIilI0O(intent);
                }

                @Override
                public final void onResume() {
                    int iI00000oIO;
/* 1 */             super.onResume();
/* 4 */             OlO0OIIl1 olO0OIIl1 = II0Oi0iIol0i.I00000oIO;
/* 40 */            boolean z = getSharedPreferences("box_db_enc", 0).getBoolean("enabled", false) && !((Boolean) OO01IO.I00000oOI.I00iOIl.getValue()).booleanValue();
/* 43 */            if (!I1IIl0I0l1I.I000O01llI0 || this.I0100i || z) {
/* 245 */               return;
                    }
/* 51 */            IIOOoll iIOOoll = this.I0100o111I;
/* 56 */            if (iIOOoll == null) {
/* 209 */               O0000Ioio00.I000OOo1O("biometricHelper");
/* 212 */               throw null;
                    }
/* 66 */            BiometricManager biometricManagerI00000oIO = II0ii1IlOoio.I00000oIO(((MainActivity) iIOOoll.I00iiI).getApplicationContext());
/* 72 */            if (biometricManagerI00000oIO == null) {
/* 78 */                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
/* 81 */                iI00000oIO = 1;
                    } else {
/* 83 */                iI00000oIO = II0ii1l11O.I00000oIO(biometricManagerI00000oIO, 15);
                    }
/* 115 */           if ((iI00000oIO != 0 ? iI00000oIO != 1 ? iI00000oIO != 11 ? iI00000oIO != 12 ? II0iI101IiO1.I00iiO : II0iI101IiO1.I00iiI : II0iI101IiO1.I00iio : II0iI101IiO1.I00iiO : II0iI101IiO1.I00iOIl) == II0iI101IiO1.I00iOIl) {
/* 117 */               IIOOoll iIOOoll2 = this.I0100o111I;
/* 119 */               if (iIOOoll2 == null) {
/* 205 */                   O0000Ioio00.I000OOo1O("biometricHelper");
/* 208 */                   throw null;
                        }
/* 123 */               O1O1oO11O o1O1oO11O = new O1O1oO11O(0);
/* 126 */               o1O1oO11O.I00iiI = this;
/* 128 */               VarHandle.storeStoreFence();
/* 135 */               IiI01lI iiI01lI = new IiI01lI(16);
/* 141 */               O1O1ol110 o1O1ol110 = new O1O1ol110(2);
/* 144 */               o1O1ol110.I00iiI = this;
/* 146 */               VarHandle.storeStoreFence();
/* 151 */               MainActivity mainActivity = (MainActivity) iIOOoll2.I00iiI;
/* 153 */               Executor mainExecutor = mainActivity.getMainExecutor();
/* 159 */               II0iIOO iI0iIOO = new II0iIOO();
/* 162 */               iI0iIOO.I00000oIO = iIOOoll2;
/* 164 */               iI0iIOO.I00000oOI = o1O1oO11O;
/* 166 */               iI0iIOO.I0000Il00O = iiI01lI;
/* 168 */               iI0iIOO.I0000O = o1O1ol110;
/* 170 */               VarHandle.storeStoreFence();
/* 175 */               II0ilOIlloOl iI0ilOIlloOl = new II0ilOIlloOl();
/* 180 */               iI0ilOIlloOl.I00000oIO = "Box";
/* 184 */               iI0ilOIlloOl.I00000oOI = "Authenticate to access your chats";
/* 188 */               iI0ilOIlloOl.I0000Il00O = "Cancel";
/* 190 */               iI0ilOIlloOl.I0000O = 15;
/* 201 */               new II0ill(mainActivity, mainExecutor, iI0iIOO).I00000oIO(iI0ilOIlloOl.I00000oIO(), null);
                    }
                }
            }

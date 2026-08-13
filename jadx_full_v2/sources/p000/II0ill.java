            package p000;

            import android.content.Context;
            import android.hardware.biometrics.BiometricPrompt;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.CancellationSignal;
            import android.os.Handler;
            import android.os.Looper;
            import android.security.identity.IdentityCredential;
            import android.security.identity.PresentationSession;
            import android.text.TextUtils;
            import android.util.Log;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.security.Signature;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            
            public final class II0ill implements I0IIOlio {
                public Ill1OlOOl I00iOIl;

                public II0ill(Ill0oOi0 ill0oOi0, Executor executor, iOOol1iOiIO ioool1ioiio) {
/* 4 */             if (ill0oOi0 == null) {
/* 32 */                I000II.I000iOII("FragmentActivity must not be null.");
/* 98 */                throw null;
                    }
/* 6 */             Ill1OlOOl ill1OlOOlI00100o1O0lo = ill0oOi0.I00100o1O0lo();
/* 21 */            II0lI0lO1 iI0lI0lO1 = (II0lI0lO1) new Oool0iOoooIo(ill0oOi0).I00000oOI(II0lI0lO1.class);
/* 23 */            this.I00iOIl = ill1OlOOlI00100o1O0lo;
/* 25 */            iI0lI0lO1.I00000oOI = executor;
/* 27 */            iI0lI0lO1.I0000Il00O = ioool1ioiio;
                }

                public void I00000oIO(II0ilOIlloOl iI0ilOIlloOl, I1ii1o0 i1ii1o0) {
                    String str;
/* 1 */             Ill1OlOOl ill1OlOOl = this.I00iOIl;
/* 5 */             if (ill1OlOOl == null) {
/* 9 */                 Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
/* 12 */                return;
                    }
/* 17 */            if (ill1OlOOl.I00IoIO0lI()) {
/* 21 */                Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
/* 24 */                return;
                    }
/* 33 */            II0i11 iI0i11 = (II0i11) this.I00iOIl.I001lloI("androidx.biometric.BiometricFragment");
/* 35 */            boolean z = false;
/* 37 */            if (iI0i11 == null) {
/* 41 */                iI0i11 = new II0i11();
/* 46 */                Bundle bundle = new Bundle();
/* 51 */                bundle.putBoolean("host_activity", true);
/* 54 */                iI0i11.I00Io1o110i(bundle);
/* 57 */                Ill1OlOOl ill1OlOOl2 = this.I00iOIl;
/* 59 */                ill1OlOOl2.getClass();
/* 64 */                I1loiIo i1loiIo = new I1loiIo(ill1OlOOl2);
/* 67 */                i1loiIo.I0000oI00(0, iI0i11, "androidx.biometric.BiometricFragment");
/* 70 */                i1loiIo.I0000O(true);
/* 73 */                Ill1OlOOl ill1OlOOl3 = this.I00iOIl;
/* 75 */                ill1OlOOl3.I001iOo1i0O(true);
/* 78 */                ill1OlOOl3.I00II0Ol1O0l();
                    }
/* 83 */            iI0i11.I0110OiO.I0000O = iI0ilOIlloOl;
/* 85 */            iOOOoio.I00000oIO(iI0ilOIlloOl, i1ii1o0);
/* 88 */            II0lI0lO1 iI0lI0lO1 = iI0i11.I0110OiO;
/* 90 */            iI0lI0lO1.I0000oI00 = i1ii1o0;
/* 92 */            iI0lI0lO1.getClass();
/* 99 */            if (iI0i11.I0110OiO.I000OOo1O) {
/* 900 */               return;
                    }
/* 107 */           if (iI0i11.I000OiO() == null) {
/* 111 */               Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
/* 900 */               return;
                    }
/* 116 */           II0lI0lO1 iI0lI0lO12 = iI0i11.I0110OiO;
/* 118 */           iI0lI0lO12.I000OOo1O = true;
/* 120 */           iI0lI0lO12.I000OiO = true;
/* 126 */           if (iI0i11.I000OiO() != null) {
/* 128 */               String str2 = Build.MANUFACTURER;
                    }
/* 130 */           iI0i11.I00IoiI();
/* 141 */           BiometricPrompt.Builder builderI0000O = II0Oo0l.I0000O(iI0i11.I00IioO0OiOi().getApplicationContext());
/* 145 */           II0lI0lO1 iI0lI0lO13 = iI0i11.I0110OiO;
/* 147 */           II0ilOIlloOl iI0ilOIlloOl2 = iI0lI0lO13.I0000O;
/* 149 */           BiometricPrompt.CryptoObject cryptoObjectI00000oIO = null;
/* 155 */           String str3 = iI0ilOIlloOl2 != null ? iI0ilOIlloOl2.I00000oIO : null;
/* 161 */           String str4 = iI0ilOIlloOl2 != null ? iI0ilOIlloOl2.I00000oOI : null;
/* 162 */           iI0lI0lO13.getClass();
/* 165 */           if (str3 != null) {
/* 167 */               II0Oo0l.I000II(builderI0000O, str3);
                    }
/* 170 */           if (str4 != null) {
/* 172 */               II0Oo0l.I0001Ioi1lo(builderI0000O, str4);
                    }
/* 177 */           II0ilOIlloOl iI0ilOIlloOl3 = iI0i11.I0110OiO.I0000O;
/* 181 */           if (iI0ilOIlloOl3 != null) {
/* 183 */               str = iI0ilOIlloOl3.I0000Il00O;
/* 185 */               if (str == null) {
/* 179 */                   str = "";
                        }
                    } else {
/* 190 */               str = null;
                    }
/* 195 */           if (!TextUtils.isEmpty(str)) {
/* 199 */               Executor executorI0000oI00 = iI0i11.I0110OiO.I0000oI00();
/* 203 */               II0lI0lO1 iI0lI0lO14 = iI0i11.I0110OiO;
/* 205 */               II0l0lIIO iI0l0lIIO = iI0lI0lO14.I000O01llI0;
/* 207 */               if (iI0l0lIIO == null) {
/* 211 */                   iI0l0lIIO = new II0l0lIIO();
/* 219 */                   iI0l0lIIO.I00iOIl = new WeakReference(iI0lI0lO14);
/* 221 */                   VarHandle.storeStoreFence();
/* 224 */                   iI0lI0lO14.I000O01llI0 = iI0l0lIIO;
                        }
/* 226 */               II0Oo0l.I0000oI00(builderI0000O, str, executorI0000oI00, iI0l0lIIO);
                    }
/* 231 */           II0ilOIlloOl iI0ilOIlloOl4 = iI0i11.I0110OiO.I0000O;
/* 233 */           II0Oo1O1o.I00000oIO(builderI0000O, true);
/* 236 */           II0lI0lO1 iI0lI0lO15 = iI0i11.I0110OiO;
/* 238 */           II0ilOIlloOl iI0ilOIlloOl5 = iI0lI0lO15.I0000O;
/* 250 */           II0OooOI.I00000oIO(builderI0000O, iI0ilOIlloOl5 != null ? iOOOoio.I00000oIO(iI0ilOIlloOl5, iI0lI0lO15.I0000oI00) : 0);
/* 253 */           BiometricPrompt biometricPromptI0000Il00O = II0Oo0l.I0000Il00O(builderI0000O);
/* 257 */           Context contextI000OiO = iI0i11.I000OiO();
/* 263 */           I1ii1o0 i1ii1o02 = iI0i11.I0110OiO.I0000oI00;
/* 265 */           if (i1ii1o02 != null) {
/* 270 */               Cipher cipher = (Cipher) i1ii1o02.I00iiO;
/* 272 */               if (cipher != null) {
/* 274 */                   cryptoObjectI00000oIO = Ii0Ooi0Ol.I00000oOI(cipher);
                        } else {
/* 281 */                   Signature signature = (Signature) i1ii1o02.I00iiI;
/* 283 */                   if (signature != null) {
/* 285 */                       cryptoObjectI00000oIO = Ii0Ooi0Ol.I00000oIO(signature);
                            } else {
/* 292 */                       Mac mac = (Mac) i1ii1o02.I00iio;
/* 294 */                       if (mac != null) {
/* 296 */                           cryptoObjectI00000oIO = Ii0Ooi0Ol.I0000Il00O(mac);
                                } else {
/* 303 */                           IdentityCredential identityCredential = (IdentityCredential) i1ii1o02.I00ilI0I1;
/* 305 */                           if (identityCredential != null) {
/* 307 */                               cryptoObjectI00000oIO = Ii0i00l1.I00000oIO(identityCredential);
                                    } else {
/* 314 */                               PresentationSession presentationSession = (PresentationSession) i1ii1o02.I00ilO0;
/* 316 */                               if (presentationSession != null) {
/* 318 */                                   cryptoObjectI00000oIO = Ii0i0O.I00000oIO(presentationSession);
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 322 */           II0lI0lO1 iI0lI0lO16 = iI0i11.I0110OiO;
/* 324 */           IoIlOo1o0IIl ioIlOo1o0IIl = iI0lI0lO16.I000II;
/* 326 */           if (ioIlOo1o0IIl == null) {
/* 331 */               ioIlOo1o0IIl = new IoIlOo1o0IIl(7, z);
/* 341 */               ioIlOo1o0IIl.I00iiI = new lolIo0(9);
/* 343 */               VarHandle.storeStoreFence();
/* 346 */               iI0lI0lO16.I000II = ioIlOo1o0IIl;
                    }
/* 350 */           CancellationSignal cancellationSignalI00000oOI = (CancellationSignal) ioIlOo1o0IIl.I00iiO;
/* 352 */           if (cancellationSignalI00000oOI == null) {
/* 358 */               ((lolIo0) ioIlOo1o0IIl.I00iiI).getClass();
/* 361 */               cancellationSignalI00000oOI = IIoiII0iiOI.I00000oOI();
/* 365 */               ioIlOo1o0IIl.I00iiO = cancellationSignalI00000oOI;
                    }
/* 369 */           II0i0l01ooIO iI0i0l01ooIO = new II0i0l01ooIO(0);
/* 381 */           iI0i0l01ooIO.I00iiI = new Handler(Looper.getMainLooper());
/* 383 */           VarHandle.storeStoreFence();
/* 386 */           II0lI0lO1 iI0lI0lO17 = iI0i11.I0110OiO;
/* 388 */           IoloOio0I ioloOio0I = iI0lI0lO17.I0001Ioi1lo;
/* 390 */           if (ioloOio0I == null) {
/* 396 */               II0iooI iI0iooI = new II0iooI();
/* 404 */               iI0iooI.I00000oIO = new WeakReference(iI0lI0lO17);
/* 406 */               VarHandle.storeStoreFence();
/* 410 */               ioloOio0I = new IoloOio0I(4);
/* 413 */               ioloOio0I.I00iiO = iI0iooI;
/* 415 */               VarHandle.storeStoreFence();
/* 418 */               iI0lI0lO17.I0001Ioi1lo = ioloOio0I;
                    }
/* 422 */           BiometricPrompt.AuthenticationCallback authenticationCallbackI00000oIO = (BiometricPrompt.AuthenticationCallback) ioloOio0I.I00iiI;
/* 424 */           if (authenticationCallbackI00000oIO == null) {
/* 430 */               authenticationCallbackI00000oIO = I1iOOi1Io0.I00000oIO((II0iooI) ioloOio0I.I00iiO);
/* 434 */               ioloOio0I.I00iiI = authenticationCallbackI00000oIO;
                    }
                    try {
/* 436 */               if (cryptoObjectI00000oIO == null) {
/* 438 */                   II0Oo0l.I00000oOI(biometricPromptI0000Il00O, cancellationSignalI00000oOI, iI0i0l01ooIO, authenticationCallbackI00000oIO);
                        } else {
/* 444 */                   II0Oo0l.I00000oIO(biometricPromptI0000Il00O, cryptoObjectI00000oIO, cancellationSignalI00000oOI, iI0i0l01ooIO, authenticationCallbackI00000oIO);
                        }
                    } catch (NullPointerException e) {
/* 450 */               Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
/* 462 */               iI0i11.I00Iooi00oi(1, contextI000OiO != null ? contextI000OiO.getString(R.string.default_error_msg) : "");
                    }
                }

                @Override
                public void I000iOII(Object obj) {
/* 1 */             Map map = (Map) obj;
/* 3 */             Ill1OlOOl ill1OlOOl = this.I00iOIl;
/* 24 */            ArrayList arrayList = new ArrayList(map.values());
/* 31 */            int[] iArr = new int[arrayList.size()];
/* 38 */            for (int i = 0; i < arrayList.size(); i++) {
/* 55 */                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                    }
/* 66 */            Ill1IIIIO ill1IIIIO = (Ill1IIIIO) ill1OlOOl.I001lloI.pollFirst();
/* 70 */            if (ill1IIIIO == null) {
/* 86 */                Log.w("FragmentManager", "No permissions were requested for " + this);
                    } else {
/* 90 */                String str = ill1IIIIO.I00iOIl;
/* 98 */                if (ill1OlOOl.I0000Il00O.I0010o(str) == null) {
/* 114 */                   Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        }
                    }
                }
            }

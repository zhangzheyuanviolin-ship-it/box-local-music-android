            package p000;

            import android.hardware.biometrics.BiometricPrompt;
            import android.security.identity.IdentityCredential;
            import android.security.identity.PresentationSession;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.security.Signature;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            
/* 35 */    public final class I1iOIl00I extends BiometricPrompt.AuthenticationCallback {
                public final I1iOil1i I00000oIO;

                public I1iOIl00I(I1iOil1i i1iOil1i) {
/* 1 */             this.I00000oIO = i1iOil1i;
                }

                @Override
                public void onAuthenticationError(int i, CharSequence charSequence) {
/* 5 */             WeakReference weakReference = ((II0iooI) this.I00000oIO).I00000oIO;
/* 11 */            if (weakReference.get() == null || ((II0lI0lO1) weakReference.get()).I000iOII || !((II0lI0lO1) weakReference.get()).I000OiO) {
/* 106 */               return;
                    }
/* 37 */            II0lI0lO1 iI0lI0lO1 = (II0lI0lO1) weakReference.get();
/* 41 */            II0OiOOI iI0OiOOI = new II0OiOOI();
/* 44 */            iI0OiOOI.I00000oIO = i;
/* 46 */            iI0OiOOI.I00000oOI = charSequence;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            OI0lOii0I oI0lOii0I = iI0lI0lO1.I000lI;
/* 53 */            if (oI0lOii0I == null) {
/* 57 */                oI0lOii0I = new OI0lOii0I();
/* 60 */                iI0lI0lO1.I000lI = oI0lOii0I;
                    }
/* 62 */            II0lI0lO1.I000II(oI0lOii0I, iI0OiOOI);
                }

                @Override
                public void onAuthenticationFailed() {
/* 5 */             WeakReference weakReference = ((II0iooI) this.I00000oIO).I00000oIO;
/* 11 */            if (weakReference.get() == null || !((II0lI0lO1) weakReference.get()).I000OiO) {
/* 55 */                return;
                    }
/* 27 */            II0lI0lO1 iI0lI0lO1 = (II0lI0lO1) weakReference.get();
/* 29 */            OI0lOii0I oI0lOii0I = iI0lI0lO1.I000oI1ioi;
/* 31 */            if (oI0lOii0I == null) {
/* 35 */                oI0lOii0I = new OI0lOii0I();
/* 38 */                iI0lI0lO1.I000oI1ioi = oI0lOii0I;
                    }
/* 42 */            II0lI0lO1.I000II(oI0lOii0I, Boolean.TRUE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject cryptoObjectI00000oOI;
                    I1ii1o0 i1ii1o0;
/* 1 */             Object[] objArr = 0;
/* 1 */             Object[] objArr2 = 0;
/* 1 */             Object[] objArr3 = 0;
/* 1 */             Object[] objArr4 = 0;
/* 2 */             I1ii1o0 i1ii1o02 = null;
/* 3 */             if (authenticationResult != null && (cryptoObjectI00000oOI = I1iOOi1Io0.I00000oOI(authenticationResult)) != null) {
/* 13 */                Cipher cipherI0000O = Ii0Ooi0Ol.I0000O(cryptoObjectI00000oOI);
/* 17 */                if (cipherI0000O != null) {
/* 21 */                    i1ii1o02 = new I1ii1o0(cipherI0000O);
                        } else {
/* 25 */                    Signature signatureI0001Ioi1lo = Ii0Ooi0Ol.I0001Ioi1lo(cryptoObjectI00000oOI);
/* 29 */                    int i = 4;
/* 30 */                    if (signatureI0001Ioi1lo != null) {
/* 34 */                        i1ii1o0 = new I1ii1o0(i, objArr4 == true ? 1 : 0);
/* 37 */                        i1ii1o0.I00iiI = signatureI0001Ioi1lo;
/* 39 */                        i1ii1o0.I00iiO = null;
/* 41 */                        i1ii1o0.I00iio = null;
/* 43 */                        i1ii1o0.I00ilI0I1 = null;
/* 45 */                        i1ii1o0.I00ilO0 = null;
/* 47 */                        VarHandle.storeStoreFence();
                            } else {
/* 52 */                        Mac macI0000oI00 = Ii0Ooi0Ol.I0000oI00(cryptoObjectI00000oOI);
/* 56 */                        if (macI0000oI00 != null) {
/* 60 */                            i1ii1o0 = new I1ii1o0(i, objArr3 == true ? 1 : 0);
/* 63 */                            i1ii1o0.I00iiI = null;
/* 65 */                            i1ii1o0.I00iiO = null;
/* 67 */                            i1ii1o0.I00iio = macI0000oI00;
/* 69 */                            i1ii1o0.I00ilI0I1 = null;
/* 71 */                            i1ii1o0.I00ilO0 = null;
/* 73 */                            VarHandle.storeStoreFence();
                                } else {
/* 77 */                            IdentityCredential identityCredentialI00000oOI = Ii0i00l1.I00000oOI(cryptoObjectI00000oOI);
/* 81 */                            if (identityCredentialI00000oOI != null) {
/* 85 */                                i1ii1o0 = new I1ii1o0(i, objArr2 == true ? 1 : 0);
/* 88 */                                i1ii1o0.I00iiI = null;
/* 90 */                                i1ii1o0.I00iiO = null;
/* 92 */                                i1ii1o0.I00iio = null;
/* 94 */                                i1ii1o0.I00ilI0I1 = identityCredentialI00000oOI;
/* 96 */                                i1ii1o0.I00ilO0 = null;
/* 98 */                                VarHandle.storeStoreFence();
                                    } else {
/* 102 */                               PresentationSession presentationSessionI00000oOI = Ii0i0O.I00000oOI(cryptoObjectI00000oOI);
/* 106 */                               if (presentationSessionI00000oOI != null) {
/* 110 */                                   I1ii1o0 i1ii1o03 = new I1ii1o0(i, objArr == true ? 1 : 0);
/* 113 */                                   i1ii1o03.I00iiI = null;
/* 115 */                                   i1ii1o03.I00iiO = null;
/* 117 */                                   i1ii1o03.I00iio = null;
/* 119 */                                   i1ii1o03.I00ilI0I1 = null;
/* 121 */                                   i1ii1o03.I00ilO0 = presentationSessionI00000oOI;
/* 123 */                                   VarHandle.storeStoreFence();
/* 126 */                                   i1ii1o02 = i1ii1o03;
                                        }
                                    }
                                }
                            }
/* 50 */                    i1ii1o02 = i1ii1o0;
                        }
                    }
/* 127 */           int i2 = -1;
/* 135 */           int iI00000oIO = authenticationResult != null ? I1iOOl01OIo.I00000oIO(authenticationResult) : -1;
/* 138 */           II0iil1 iI0iil1 = new II0iil1(i1ii1o02, iI00000oIO);
/* 145 */           WeakReference weakReference = ((II0iooI) this.I00000oIO).I00000oIO;
/* 151 */           if (weakReference.get() == null || !((II0lI0lO1) weakReference.get()).I000OiO) {
/* 437 */               return;
                    }
/* 163 */           if (iI00000oIO == -1) {
/* 171 */               II0lI0lO1 iI0lI0lO1 = (II0lI0lO1) weakReference.get();
/* 173 */               II0ilOIlloOl iI0ilOIlloOl = iI0lI0lO1.I0000O;
/* 179 */               int iI00000oIO2 = iI0ilOIlloOl != null ? iOOOoio.I00000oIO(iI0ilOIlloOl, iI0lI0lO1.I0000oI00) : 0;
/* 185 */               if ((iI00000oIO2 & 32767) != 0 && (32768 & iI00000oIO2) == 0) {
/* 194 */                   i2 = 2;
                        }
/* 195 */               iI0iil1 = new II0iil1(i1ii1o02, i2);
                    }
/* 202 */           II0lI0lO1 iI0lI0lO12 = (II0lI0lO1) weakReference.get();
/* 204 */           OI0lOii0I oI0lOii0I = iI0lI0lO12.I000l1;
/* 206 */           if (oI0lOii0I == null) {
/* 210 */               oI0lOii0I = new OI0lOii0I();
/* 213 */               iI0lI0lO12.I000l1 = oI0lOii0I;
                    }
/* 215 */           II0lI0lO1.I000II(oI0lOii0I, iI0iil1);
                }

                @Override
/* 36 */        public void onAuthenticationHelp(int i, CharSequence charSequence) {
                }
            }

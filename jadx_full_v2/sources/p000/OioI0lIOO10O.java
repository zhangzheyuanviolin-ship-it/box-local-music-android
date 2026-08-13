            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.security.Key;
            import java.security.KeyStore;
            import javax.crypto.Cipher;
            import javax.crypto.SecretKey;
            
            public final class OioI0lIOO10O implements IllOOo00lI {
                public final int I00iOIl;
                public Ill0oOi0 I00iiI;
                public OI10i0Il I00iiO;
                public Context I00iio;
                public OI10i0Il I00ilI0I1;
                public OI10i0Il I00ilO0;
                public OI10i0Il I00io1l;

                public OioI0lIOO10O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws Exception {
                    SecretKey secretKeyI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 163 */                   Ill0oOi0 ill0oOi0 = this.I00iiI;
/* 165 */                   Context context = this.I00iio;
/* 167 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 169 */                   OI10i0Il oI10i0Il2 = this.I00ilI0I1;
/* 171 */                   OI10i0Il oI10i0Il3 = this.I00ilO0;
/* 173 */                   OI10i0Il oI10i0Il4 = this.I00io1l;
/* 177 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 180 */                   if (ill0oOi0 != null) {
/* 183 */                       OlO0OIIl1 olO0OIIl1 = II0Oi0iIol0i.I00000oIO;
/* 187 */                       IOliO010l1i1 iOliO010l1i1 = new IOliO010l1i1(1);
/* 190 */                       iOliO010l1i1.I00iiI = context;
/* 192 */                       iOliO010l1i1.I00iiO = oI10i0Il2;
/* 194 */                       iOliO010l1i1.I00iio = oI10i0Il3;
/* 196 */                       VarHandle.storeStoreFence();
/* 203 */                       IloIlOOIi iloIlOOIi = new IloIlOOIi(26);
/* 206 */                       iloIlOOIi.I00iiI = oI10i0Il4;
/* 208 */                       VarHandle.storeStoreFence();
/* 215 */                       IloIlOOIi iloIlOOIi2 = new IloIlOOIi(27);
/* 218 */                       iloIlOOIi2.I00iiI = oI10i0Il4;
/* 220 */                       VarHandle.storeStoreFence();
/* 223 */                       II0Oi0iIol0i.I0000oI00(ill0oOi0, context, iOliO010l1i1, iloIlOOIi, iloIlOOIi2);
                                break;
                            }
                            break;
                        default:
/* 9 */                     Ill0oOi0 ill0oOi02 = this.I00iiI;
/* 11 */                    OI10i0Il oI10i0Il5 = this.I00iiO;
/* 13 */                    Context context2 = this.I00iio;
/* 15 */                    OI10i0Il oI10i0Il6 = this.I00ilI0I1;
/* 17 */                    OI10i0Il oI10i0Il7 = this.I00ilO0;
/* 19 */                    OI10i0Il oI10i0Il8 = this.I00io1l;
/* 23 */                    oI10i0Il5.setValue(Boolean.FALSE);
/* 26 */                    if (ill0oOi02 != null) {
/* 30 */                        OlO0OIIl1 olO0OIIl12 = II0Oi0iIol0i.I00000oIO;
/* 35 */                        IOliO010l1i1 iOliO010l1i12 = new IOliO010l1i1(2);
/* 38 */                        iOliO010l1i12.I00iiI = context2;
/* 40 */                        iOliO010l1i12.I00iiO = oI10i0Il6;
/* 42 */                        iOliO010l1i12.I00iio = oI10i0Il7;
/* 44 */                        VarHandle.storeStoreFence();
/* 51 */                        IloIlOOIi iloIlOOIi3 = new IloIlOOIi(28);
/* 54 */                        iloIlOOIi3.I00iiI = oI10i0Il8;
/* 56 */                        VarHandle.storeStoreFence();
/* 63 */                        IloIlOOIi iloIlOOIi4 = new IloIlOOIi(29);
/* 66 */                        iloIlOOIi4.I00iiI = oI10i0Il8;
/* 68 */                        VarHandle.storeStoreFence();
                                try {
/* 73 */                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 78 */                            keyStore.load(null);
/* 83 */                            Key key = keyStore.getKey("box_db_enc_key", null);
/* 87 */                            if (key != null) {
/* 89 */                                secretKeyI00000oIO = (SecretKey) key;
                                    } else {
                                        try {
/* 92 */                                    secretKeyI00000oIO = II0Oi0iIol0i.I00000oIO(true);
                                        } catch (Exception unused) {
/* 98 */                                    secretKeyI00000oIO = II0Oi0iIol0i.I00000oIO(false);
                                        }
                                    }
/* 104 */                           Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
/* 108 */                           cipher.init(1, secretKeyI00000oIO);
/* 113 */                           I1ii1o0 i1ii1o0 = new I1ii1o0(cipher);
/* 120 */                           IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(17);
/* 123 */                           iIOIlOoI111.I00iiI = iOliO010l1i12;
/* 125 */                           VarHandle.storeStoreFence();
/* 130 */                           II0Oi0iIol0i.I0001Ioi1lo(ill0oOi02, "Authenticate to enable database encryption", i1ii1o0, iIOIlOoI111, iloIlOOIi3, iloIlOOIi4);
                                    break;
                                } catch (Exception e) {
/* 159 */                           iloIlOOIi4.invoke(-1, "Failed to prepare encryption: " + e.getMessage());
                                    break;
                                }
                            }
                            break;
                    }
/* 162 */           return ooiIlOl1iI;
                }
            }

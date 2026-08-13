            package p000;

            import android.content.Context;
            import android.util.Base64;
            import java.lang.invoke.VarHandle;
            import java.security.KeyStore;
            import java.util.Arrays;
            import java.util.List;
            import javax.crypto.Cipher;
            import kotlin.jvm.functions.Function1;
            
            public final class IOliO010l1i1 implements Function1 {
                public final int I00iOIl;
                public Context I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object invoke(Object obj) {
/* 10 */            int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 275 */                   OI10i0Il oI10i0Il = this.I00iiO;
/* 277 */                   OI10i0Il oI10i0Il2 = this.I00iio;
/* 279 */                   Context context = this.I00iiI;
/* 287 */                   List list = (List) oI10i0Il.getValue();
/* 289 */                   int size = list.size();
/* 296 */                   I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(7);
/* 299 */                   i0O11IOOo0OI.I00iiI = list;
/* 301 */                   VarHandle.storeStoreFence();
/* 308 */                   I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(8);
/* 311 */                   i0O11IOOo0OI2.I00iiI = list;
/* 313 */                   VarHandle.storeStoreFence();
/* 318 */                   IOll1Iool00 iOll1Iool00 = new IOll1Iool00(i);
/* 321 */                   iOll1Iool00.I00iiI = list;
/* 323 */                   iOll1Iool00.I00iio = oI10i0Il2;
/* 325 */                   iOll1Iool00.I00iiO = context;
/* 327 */                   iOll1Iool00.I00ilI0I1 = oI10i0Il;
/* 329 */                   VarHandle.storeStoreFence();
/* 340 */                   ((O0lolo) obj).I0000oI00(size, i0O11IOOo0OI, i0O11IOOo0OI2, new IOii1l(802480018, iOll1Iool00, true));
                            break;
                        case 1:
/* 167 */                   Context context2 = this.I00iiI;
/* 169 */                   OI10i0Il oI10i0Il3 = this.I00iiO;
/* 171 */                   OI10i0Il oI10i0Il4 = this.I00iio;
/* 175 */                   byte[] bArrI00000oOI = II0Oi0iIol0i.I00000oOI(context2, (Cipher) obj);
/* 191 */                   Il0Il1liIo il0Il1liIo = (Il0Il1liIo) lO11O1Oio.I00000oIO(context2).edit();
/* 193 */                   il0Il1liIo.putString("db_key", Base64.encodeToString(bArrI00000oOI, 2));
/* 196 */                   il0Il1liIo.apply();
                            try {
/* 203 */                       KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 207 */                       keyStore.load(null);
/* 214 */                       if (keyStore.containsAlias("box_db_enc_key")) {
/* 216 */                           keyStore.deleteEntry("box_db_enc_key");
                                }
                            } catch (Exception unused) {
                            }
/* 231 */                   context2.getSharedPreferences("box_db_enc", 0).edit().clear().apply();
/* 234 */                   OlO0OIIl1 olO0OIIl1 = II0Oi0iIol0i.I00000oIO;
/* 236 */                   Boolean bool = Boolean.FALSE;
/* 238 */                   olO0OIIl1.getClass();
/* 241 */                   olO0OIIl1.I000lI(null, bool);
/* 244 */                   OlO0OIIl1 olO0OIIl12 = OO01IO.I00000oIO;
/* 246 */                   byte[] bArr = OO01IO.I0000Il00O;
/* 248 */                   if (bArr != null) {
/* 251 */                       Arrays.fill(bArr, 0, bArr.length, (byte) 0);
                            }
/* 254 */                   OO01IO.I0000Il00O = null;
/* 256 */                   OlO0OIIl1 olO0OIIl13 = OO01IO.I00000oIO;
/* 258 */                   olO0OIIl13.getClass();
/* 261 */                   olO0OIIl13.I000lI(null, bool);
/* 264 */                   oI10i0Il3.setValue(bool);
/* 269 */                   oI10i0Il4.setValue("");
                            break;
                        case 2:
/* 52 */                    Context context3 = this.I00iiI;
/* 54 */                    OI10i0Il oI10i0Il5 = this.I00iiO;
/* 56 */                    OI10i0Il oI10i0Il6 = this.I00iio;
/* 58 */                    Cipher cipher = (Cipher) obj;
/* 60 */                    byte[] bArrI00000oOI2 = lO11O1Oio.I00000oOI(context3);
/* 64 */                    OlO0OIIl1 olO0OIIl14 = II0Oi0iIol0i.I00000oIO;
/* 108 */                   context3.getSharedPreferences("box_db_enc", 0).edit().putString("enc_passphrase", Base64.encodeToString(cipher.doFinal(bArrI00000oOI2), 2)).putString("iv", Base64.encodeToString(cipher.getIV(), 2)).putBoolean("enabled", true).apply();
/* 111 */                   OlO0OIIl1 olO0OIIl15 = II0Oi0iIol0i.I00000oIO;
/* 113 */                   Boolean bool2 = Boolean.TRUE;
/* 115 */                   olO0OIIl15.getClass();
/* 118 */                   olO0OIIl15.I000lI(null, bool2);
/* 129 */                   Il0Il1liIo il0Il1liIo2 = (Il0Il1liIo) lO11O1Oio.I00000oIO(context3).edit();
/* 131 */                   il0Il1liIo2.remove("db_key");
/* 134 */                   il0Il1liIo2.apply();
/* 137 */                   OlO0OIIl1 olO0OIIl16 = OO01IO.I00000oIO;
/* 144 */                   OO01IO.I0000Il00O = Arrays.copyOf(bArrI00000oOI2, bArrI00000oOI2.length);
/* 146 */                   OlO0OIIl1 olO0OIIl17 = OO01IO.I00000oIO;
/* 148 */                   olO0OIIl17.getClass();
/* 151 */                   olO0OIIl17.I000lI(null, bool2);
/* 154 */                   oI10i0Il5.setValue(bool2);
/* 161 */                   oI10i0Il6.setValue(II0Oi0iIol0i.I0000O());
                            break;
                        default:
/* 14 */                    OI10i0Il oI10i0Il7 = this.I00iiO;
/* 16 */                    Context context4 = this.I00iiI;
/* 18 */                    OI10i0Il oI10i0Il8 = this.I00iio;
/* 22 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 26 */                    if (zBooleanValue && ((Boolean) oI10i0Il7.getValue()).booleanValue()) {
/* 42 */                        oI10i0Il8.setValue(Boolean.TRUE);
                            } else {
/* 46 */                        OIOlIOlO1.I00000oIO(context4, zBooleanValue);
                            }
                            break;
                    }
/* 49 */            return OoiIlOl1iI.I00000oIO;
                }
            }

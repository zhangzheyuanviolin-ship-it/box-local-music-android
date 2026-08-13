            package p000;

            import android.os.Parcel;
            import java.io.IOException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.CertificateException;
            
/* 7 */     public final class I0OooiI1I implements OOooilOIIl0I {
                public static final I0OooiI1I I00iiO;
                public static final I0OooiI1I I00iio;
                public static final I0OooiI1I I00ilI0I1;
                public static final I0OooiI1I I00ilO0;
                public static final I0OooiI1I I00io1l;
                public final int I00iOIl;
                public String I00iiI;

                static {
/* 5 */             int i = 0;
/* 9 */             I00iiO = new I0OooiI1I("TINK", i);
/* 18 */            I00iio = new I0OooiI1I("CRUNCHY", i);
/* 27 */            I00ilI0I1 = new I0OooiI1I("NO_PREFIX", i);
/* 33 */            int i2 = 1;
/* 37 */            I00ilO0 = new I0OooiI1I("FOLD", i2);
/* 46 */            I00io1l = new I0OooiI1I("HINGE", i2);
                }

                public I0OooiI1I(String str, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = str;
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 5 */             int i = lI1i1OI1O0l.I000iOII;
/* 9 */             l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((OloIlI0ll) obj2);
/* 16 */            lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) obj).I000l1();
/* 18 */            String str = this.I00iiI;
/* 20 */            Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 24 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 27 */            parcelI00Iooi00oi.writeString(str);
/* 32 */            parcelI00Iooi00oi.writeString("");
/* 36 */            parcelI00Iooi00oi.writeString(null);
/* 41 */            liil1lol0ioi.I00O0o1oo(11, parcelI00Iooi00oi);
                }

                public String toString() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
                    boolean zContainsAlias;
                    switch (this.I00iOIl) {
                        case 0:
/* 70 */                    return this.I00iiI;
                        case 1:
/* 67 */                    return this.I00iiI;
                        case 2:
/* 31 */                    StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
/* 34 */                    String str = this.I00iiI;
/* 36 */                    sb.append(str);
/* 41 */                    sb.append(", isKeyStoreBacked=");
                            try {
/* 46 */                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 51 */                        keyStore.load(null);
/* 54 */                        zContainsAlias = keyStore.containsAlias(str);
                            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
/* 59 */                        zContainsAlias = false;
                            }
/* 62 */                    return IIlIOloOOO.I0010o(sb, zContainsAlias, "}");
                        case 3:
/* 22 */                    return IlIi0I0.I000oI1ioi(new StringBuilder("<"), this.I00iiI, '>');
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }

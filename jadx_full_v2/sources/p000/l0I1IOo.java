            package p000;

            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.util.Collections;
            import java.util.Map;
            
/* 18 */    public final class l0I1IOo extends liOO10o0 {
                public final int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l0I1IOo(lilOOl0 lilool0, int i) {
/* 3 */             super(lilool0);
/* 1 */             this.I00iio = i;
                }

                @Override
                public final void I010iIIOlo() {
/* 1 */             int i = this.I00iio;
                }

                public boolean I010ioo() {
/* 1 */             I010OIo1l();
/* 16 */            ConnectivityManager connectivityManager = (ConnectivityManager) ((l0olllO1i) this.I00iOIl).I00iOIl.getSystemService("connectivity");
/* 18 */            NetworkInfo activeNetworkInfo = null;
/* 19 */            if (connectivityManager != null) {
                        try {
/* 21 */                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        } catch (SecurityException unused) {
                        }
                    }
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }

                public void I010l1ol111(String str, liOi0lIo lioi0lio, l0oiiI0 l0oiii0, l01lllOO0 l01llloo0) {
                    String str2;
                    URL url;
                    byte[] bArrI00000oIO;
                    l0o10OoO0 l0o10ooo0;
                    Map map;
/* 1 */             String str3 = lioi0lio.I00000oIO;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             I010II();
/* 10 */            I010OIo1l();
                    try {
/* 18 */                url = new URI(str3).toURL();
/* 24 */                this.I00iiI.I00i0oil();
/* 27 */                bArrI00000oIO = l0oiii0.I00000oIO();
/* 31 */                l0o10ooo0 = l0olllo1i.I00io1l;
/* 33 */                l0olllO1i.I000II(l0o10ooo0);
/* 38 */                map = lioi0lio.I00000oOI;
/* 40 */                if (map == null) {
/* 42 */                    map = Collections.EMPTY_MAP;
                        }
/* 45 */                str2 = str;
                    } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
/* 55 */                str2 = str;
                    }
                    try {
/* 51 */                l0o10ooo0.I01101olii(new l0I0Ii1OIi0(this, str2, url, bArrI00000oIO, map, l01llloo0));
                    } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
/* 56 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 58 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 69 */                l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Failed to parse URL. Not uploading MeasurementBatch. appId", str3);
                    }
                }

/* 19 */        private final void I010l10O() {
                }

/* 19 */        private final void I010l1O() {
                }
            }

            package p000;

            import android.content.pm.PackageManager;
            import android.os.SystemClock;
            import android.util.Pair;
            import java.math.BigInteger;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.HashMap;
            import java.util.Locale;
            
/* 18 */    public final class lOloIl1o001 extends liOO10o0 {
                public HashMap I00iio;
                public l0O0o010I I00ilI0I1;
                public l0O0o010I I00ilO0;
                public l0O0o010I I00io1l;
                public l0O0o010I I00ioIO;
                public l0O0o010I I00l0I0l0lO1;
                public l0O0o010I I00l0OO0IO;

                public final Pair I010ioo(lli10iI lli10ii, l1ioIO011Oo l1ioio011oo) {
/* 1 */             String str = lli10ii.I00iOIl;
/* 3 */             lII0I0I000I.I0000O(str);
                    return (l1ioio011oo.I000OOo1O(l1iioiool.AD_STORAGE) && lli10ii.I00lll10) ? I010l10O(str) : new Pair("", Boolean.FALSE);
                }

                public final Pair I010l10O(String str) {
                    lOllIlo lollilo;
                    I0OIOIi1 i0OIOIi1I00000oIO;
/* 3 */             I010II();
/* 8 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 10 */            Iioi0lilII iioi0lilII = l0olllo1i.I00li1OI;
/* 12 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 14 */            iioi0lilII.getClass();
/* 17 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 21 */            HashMap map = this.I00iio;
/* 27 */            lOllIlo lollilo2 = (lOllIlo) map.get(str);
/* 29 */            if (lollilo2 != null && jElapsedRealtime < lollilo2.I0000Il00O) {
/* 48 */                return new Pair(lollilo2.I00000oIO, Boolean.valueOf(lollilo2.I00000oOI));
                    }
/* 58 */            long jI010lI0oi = iil1iil.I010lI0oi(str, iol1II1ii1i.I00000oOI) + jElapsedRealtime;
                    try {
                        try {
/* 61 */                    i0OIOIi1I00000oIO = I0OIOO.I00000oIO(l0olllo1i.I00iOIl);
                        } catch (PackageManager.NameNotFoundException unused) {
/* 69 */                    if (lollilo2 != null && jElapsedRealtime < lollilo2.I0000Il00O + iil1iil.I010lI0oi(str, iol1II1ii1i.I0000Il00O)) {
/* 94 */                        return new Pair(lollilo2.I00000oIO, Boolean.valueOf(lollilo2.I00000oOI));
                            }
/* 98 */                    i0OIOIi1I00000oIO = null;
                        }
                    } catch (Exception e) {
/* 131 */               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 133 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 140 */               l01o0io1ooo0.I00lli11.I0000Il00O("Unable to get advertising id", e);
/* 146 */               lollilo = new lOllIlo(false, "", jI010lI0oi);
                    }
/* 99 */            if (i0OIOIi1I00000oIO == null) {
/* 107 */               return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
                    }
/* 111 */           String str2 = i0OIOIi1I00000oIO.I0000Il00O;
/* 127 */           lollilo = str2 != null ? new lOllIlo(i0OIOIi1I00000oIO.I00000oOI, str2, jI010lI0oi) : new lOllIlo(i0OIOIi1I00000oIO.I00000oOI, "", jI010lI0oi);
/* 149 */           map.put(str, lollilo);
/* 162 */           return new Pair(lollilo.I00000oIO, Boolean.valueOf(lollilo.I00000oOI));
                }

                public final String I010l1O(lli10iI lli10ii, l1ioIO011Oo l1ioio011oo) throws NoSuchAlgorithmException {
/* 1 */             String str = lli10ii.I00iOIl;
/* 3 */             lII0I0I000I.I0000O(str);
/* 12 */            if (!l1ioio011oo.I000OOo1O(l1iioiool.AD_STORAGE) || !lli10ii.I00lll10) {
/* 65 */                return "";
                    }
/* 19 */            I010II();
/* 28 */            String str2 = (String) I010l10O(str).first;
/* 30 */            MessageDigest messageDigestI011Io0I1ioi = lioil0ilIOi.I011Io0I1ioi();
/* 34 */            if (messageDigestI011Io0I1ioi == null) {
/* 36 */                return null;
                    }
/* 60 */            return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestI011Io0I1ioi.digest(str2.getBytes())));
                }

                @Override
/* 19 */        public final void I010iIIOlo() {
                }
            }

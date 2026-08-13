            package p000;

            import android.content.pm.PackageInfo;
            import android.content.pm.Signature;
            import android.util.Base64;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public final class III11IO0 {
                public final String I00000oIO;
                public final HashSet I00000oOI;
                public final String I0000Il00O;
                public final Boolean I0000O;

                public III11IO0(PackageInfo packageInfo, boolean z) {
/* 1 */             String str = packageInfo.packageName;
/* 3 */             Signature[] signatureArr = packageInfo.signatures;
/* 7 */             HashSet hashSet = new HashSet();
/* 12 */            for (Signature signature : signatureArr) {
                        try {
/* 36 */                    hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10));
                        } catch (NoSuchAlgorithmException unused) {
/* 44 */                    I000II.I001IO000("Platform does not supportSHA-512 hashing");
/* 48 */                    throw null;
                        }
                    }
/* 49 */            String str2 = packageInfo.versionName;
/* 54 */            this.I00000oIO = str;
/* 56 */            this.I00000oOI = hashSet;
/* 58 */            this.I0000Il00O = str2;
/* 64 */            this.I0000O = Boolean.valueOf(z);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 49 */                return true;
                    }
/* 4 */             if (obj == null || !(obj instanceof III11IO0)) {
/* 51 */                return false;
                    }
/* 11 */            III11IO0 iii11io0 = (III11IO0) obj;
                    return this.I00000oIO.equals(iii11io0.I00000oIO) && this.I0000Il00O.equals(iii11io0.I0000Il00O) && this.I0000O == iii11io0.I0000O && this.I00000oOI.equals(iii11io0.I00000oOI);
                }

                public final int hashCode() {
/* 23 */            int iI000O01llI0 = (this.I0000O.booleanValue() ? 1 : 0) + Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 92821, 92821, this.I0000Il00O);
/* 26 */            Iterator it = this.I00000oOI.iterator();
/* 34 */            while (it.hasNext()) {
/* 47 */                iI000O01llI0 = (iI000O01llI0 * 92821) + ((String) it.next()).hashCode();
                    }
/* 55 */            return iI000O01llI0;
                }
            }

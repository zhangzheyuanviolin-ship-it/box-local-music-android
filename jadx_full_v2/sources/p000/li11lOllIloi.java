            package p000;

            import android.os.Bundle;
            import android.text.TextUtils;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            
            public final class li11lOllIloi {
                public final HashMap I00000oIO;

                public li11lOllIloi(Map map) {
/* 6 */             HashMap map2 = new HashMap();
/* 9 */             this.I00000oIO = map2;
/* 11 */            map2.putAll(map);
                }

                public final String I00000oIO() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             OOol0l1I1 oOol0l1I1 = li1Oi0o.I00000oIO;
/* 8 */             int i = oOol0l1I1.I00iio;
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 17 */                String str = (String) oOol0l1I1.get(i2);
/* 19 */                HashMap map = this.I00000oIO;
/* 25 */                if (map.containsKey(str)) {
/* 32 */                    if (sb.length() > 0) {
/* 36 */                        sb.append(";");
                            }
/* 39 */                    sb.append(str);
/* 44 */                    sb.append("=");
/* 53 */                    sb.append((String) map.get(str));
                        }
                    }
/* 59 */            return sb.toString();
                }

                public final Bundle I00000oOI() {
/* 1 */             HashMap map = this.I00000oIO;
/* 15 */            if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
/* 42 */                String str = "denied";
/* 46 */                if (map.get("Version") == null) {
/* 58 */                    if (!"1".equals(map.get("GoogleConsent"))) {
/* 60 */                        return Bundle.EMPTY;
                            }
/* 63 */                    int iI0000Il00O = I0000Il00O();
/* 67 */                    if (iI0000Il00O < 0) {
/* 69 */                        return Bundle.EMPTY;
                            }
/* 78 */                    String str2 = (String) map.get("PurposeConsents");
/* 84 */                    if (TextUtils.isEmpty(str2)) {
/* 86 */                        return Bundle.EMPTY;
                            }
/* 91 */                    Bundle bundle = new Bundle();
/* 101 */                   if (str2.length() > 0) {
/* 112 */                       bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                            }
/* 120 */                   if (str2.length() > 3) {
/* 138 */                       bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                            }
/* 146 */                   if (str2.length() > 6 && iI0000Il00O >= 4) {
/* 154 */                       if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
/* 44 */                            str = "granted";
                                }
/* 163 */                       bundle.putString("ad_user_data", str);
                            }
/* 166 */                   return bundle;
                        }
/* 171 */               if (I0000Il00O() >= 0) {
/* 176 */                   Bundle bundle2 = new Bundle();
/* 195 */                   bundle2.putString("ad_storage", true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
/* 225 */                   bundle2.putString("ad_personalization", (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
/* 232 */                   if (I0000Il00O() >= 4) {
/* 242 */                       if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
/* 44 */                            str = "granted";
                                }
/* 257 */                       bundle2.putString("ad_user_data", str);
                            }
/* 260 */                   return bundle2;
                        }
                    }
/* 261 */           return Bundle.EMPTY;
                }

                public final int I0000Il00O() {
                    try {
/* 9 */                 String str = (String) this.I00000oIO.get("PolicyVersion");
/* 15 */                if (TextUtils.isEmpty(str)) {
/* 22 */                    return -1;
                        }
/* 17 */                return Integer.parseInt(str);
                    } catch (NumberFormatException unused) {
/* 22 */                return -1;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof li11lOllIloi) {
/* 17 */                return I00000oIO().equalsIgnoreCase(((li11lOllIloi) obj).I00000oIO());
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 5 */             return I00000oIO().hashCode();
                }

                public final String toString() {
/* 1 */             return I00000oIO();
                }
            }

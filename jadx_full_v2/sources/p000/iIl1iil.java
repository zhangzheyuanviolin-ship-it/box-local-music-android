            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.text.TextUtils;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.reflect.InvocationTargetException;
            
            public final class iIl1iil extends I01O1lIi {
                public Boolean I00iiI;
                public String I00iiO;
                public iIiiI0oi I00iio;
                public Boolean I00ilI0I1;

                public final boolean I010OIo1l(String str) {
/* 7 */             l0olllO1i.I0000oI00(((l0olllO1i) this.I00iOIl).I00l0I0l0lO1);
/* 23 */            if (lioil0ilIOi.I01I01Oolii((String) iol1II1ii1i.I0110o.I00000oIO(null), str) || lioil0ilIOi.I01I01Oolii((String) iol1II1ii1i.I0111i.I00000oIO(null), str) || lioil0ilIOi.I01I01Oolii((String) iol1II1ii1i.I011IO1I11OI.I00000oIO(null), str)) {
/* 69 */                return true;
                    }
/* 64 */            return "1".equals(this.I00iio.I00OIl(str, "gaia_collection_enabled"));
                }

                public final boolean I010i10l(String str) {
/* 11 */            return "1".equals(this.I00iio.I00OIl(str, "measurement.event_sampling_enabled"));
                }

                public final boolean I010iIIOlo() {
/* 1 */             Boolean boolI0110OiO = this.I00iiI;
/* 3 */             if (boolI0110OiO == null) {
/* 7 */                 boolI0110OiO = I0110OiO("app_measurement_lite");
/* 11 */                this.I00iiI = boolI0110OiO;
/* 13 */                if (boolI0110OiO == null) {
/* 15 */                    boolI0110OiO = Boolean.FALSE;
/* 17 */                    this.I00iiI = boolI0110OiO;
                        }
                    }
                    return boolI0110OiO.booleanValue() || !((l0olllO1i) this.I00iOIl).I00iiI;
                }

                public final String I010ioo(String str) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
                    try {
/* 34 */                String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
/* 36 */                lII0I0I000I.I000II(str2);
/* 39 */                return str2;
                    } catch (ClassNotFoundException e) {
/* 87 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 89 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 96 */                l01o0io1ooo0.I00ilO0.I0000Il00O("Could not find SystemProperties class", e);
/* 5 */                 return "";
                    } catch (IllegalAccessException e2) {
/* 61 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 63 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 70 */                l01o0io1ooo02.I00ilO0.I0000Il00O("Could not access SystemProperties.get()", e2);
/* 5 */                 return "";
                    } catch (NoSuchMethodException e3) {
/* 74 */                l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 76 */                l0olllO1i.I000II(l01o0io1ooo03);
/* 83 */                l01o0io1ooo03.I00ilO0.I0000Il00O("Could not find SystemProperties.get() method", e3);
/* 5 */                 return "";
                    } catch (InvocationTargetException e4) {
/* 48 */                l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 50 */                l0olllO1i.I000II(l01o0io1ooo04);
/* 57 */                l01o0io1ooo04.I00ilO0.I0000Il00O("SystemProperties.get() threw an exception", e4);
/* 5 */                 return "";
                    }
                }

                public final int I010l10O(String str, boolean z) {
/* 23 */            return Math.max(z ? Math.max(Math.min(I010o0o0oO(str, iol1II1ii1i.I00i0ilIl0i), 500), 100) : 500, Barcode.FORMAT_QR_CODE);
                }

                public final void I010l1O() {
/* 5 */             ((l0olllO1i) this.I00iOIl).getClass();
                }

                public final String I010l1ol111(String str, iol01I0001 iol01i0001) {
                    return TextUtils.isEmpty(str) ? (String) iol01i0001.I00000oIO(null) : (String) iol01i0001.I00000oIO(this.I00iio.I00OIl(str, iol01i0001.I00000oIO));
                }

                public final long I010lI0oi(String str, iol01I0001 iol01i0001) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Long) iol01i0001.I00000oIO(null)).longValue();
                    }
/* 23 */            String strI00OIl = this.I00iio.I00OIl(str, iol01i0001.I00000oIO);
/* 31 */            if (TextUtils.isEmpty(strI00OIl)) {
/* 39 */                return ((Long) iol01i0001.I00000oIO(null)).longValue();
                    }
                    try {
/* 58 */                return ((Long) iol01i0001.I00000oIO(Long.valueOf(Long.parseLong(strI00OIl)))).longValue();
                    } catch (NumberFormatException unused) {
/* 69 */                return ((Long) iol01i0001.I00000oIO(null)).longValue();
                    }
                }

                public final int I010o0o0oO(String str, iol01I0001 iol01i0001) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Integer) iol01i0001.I00000oIO(null)).intValue();
                    }
/* 23 */            String strI00OIl = this.I00iio.I00OIl(str, iol01i0001.I00000oIO);
/* 31 */            if (TextUtils.isEmpty(strI00OIl)) {
/* 39 */                return ((Integer) iol01i0001.I00000oIO(null)).intValue();
                    }
                    try {
/* 58 */                return ((Integer) iol01i0001.I00000oIO(Integer.valueOf(Integer.parseInt(strI00OIl)))).intValue();
                    } catch (NumberFormatException unused) {
/* 69 */                return ((Integer) iol01i0001.I00000oIO(null)).intValue();
                    }
                }

                public final double I010oio1OO0(String str, iol01I0001 iol01i0001) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Double) iol01i0001.I00000oIO(null)).doubleValue();
                    }
/* 23 */            String strI00OIl = this.I00iio.I00OIl(str, iol01i0001.I00000oIO);
/* 31 */            if (TextUtils.isEmpty(strI00OIl)) {
/* 39 */                return ((Double) iol01i0001.I00000oIO(null)).doubleValue();
                    }
                    try {
/* 58 */                return ((Double) iol01i0001.I00000oIO(Double.valueOf(Double.parseDouble(strI00OIl)))).doubleValue();
                    } catch (NumberFormatException unused) {
/* 69 */                return ((Double) iol01i0001.I00000oIO(null)).doubleValue();
                    }
                }

                public final boolean I01101IOlO(String str, iol01I0001 iol01i0001) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Boolean) iol01i0001.I00000oIO(null)).booleanValue();
                    }
/* 23 */            String strI00OIl = this.I00iio.I00OIl(str, iol01i0001.I00000oIO);
                    return TextUtils.isEmpty(strI00OIl) ? ((Boolean) iol01i0001.I00000oIO(null)).booleanValue() : ((Boolean) iol01i0001.I00000oIO(Boolean.valueOf("1".equals(strI00OIl)))).booleanValue();
                }

                public final Bundle I01101olii() {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
                    try {
/* 6 */                 Context context = l0olllo1i.I00iOIl;
/* 8 */                 Context context2 = l0olllo1i.I00iOIl;
/* 10 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 16 */                if (context.getPackageManager() == null) {
/* 18 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 25 */                    l01o0io1ooo0.I00ilO0.I00000oOI("Failed to load metadata: PackageManager is null");
/* 5 */                     return null;
                        }
/* 41 */                ApplicationInfo applicationInfoI00000oIO = i01l1OO001.I00000oIO(context2).I00000oIO(Barcode.FORMAT_ITF, context2.getPackageName());
/* 45 */                if (applicationInfoI00000oIO != null) {
/* 58 */                    return applicationInfoI00000oIO.metaData;
                        }
/* 47 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 54 */                l01o0io1ooo0.I00ilO0.I00000oOI("Failed to load metadata: ApplicationInfo is null");
/* 5 */                 return null;
                    } catch (PackageManager.NameNotFoundException e) {
/* 61 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 63 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 70 */                l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to load metadata: Package name not found", e);
/* 5 */                 return null;
                    }
                }

                public final Boolean I0110OiO(String str) {
/* 1 */             lII0I0I000I.I0000O(str);
/* 4 */             Bundle bundleI01101olii = I01101olii();
/* 9 */             if (bundleI01101olii != null) {
/* 32 */                if (bundleI01101olii.containsKey(str)) {
/* 39 */                    return Boolean.valueOf(bundleI01101olii.getBoolean(str));
                        }
/* 8 */                 return null;
                    }
/* 15 */            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 17 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 24 */            l01o0io1ooo0.I00ilO0.I00000oOI("Failed to load metadata: Metadata bundle is null");
/* 8 */             return null;
                }

                public final boolean I0110o() {
/* 5 */             ((l0olllO1i) this.I00iOIl).getClass();
/* 10 */            Boolean boolI0110OiO = I0110OiO("firebase_analytics_collection_deactivated");
                    return boolI0110OiO != null && boolI0110OiO.booleanValue();
                }

                public final boolean I0111i() {
/* 3 */             Boolean boolI0110OiO = I0110OiO("google_analytics_automatic_screen_reporting_enabled");
                    return boolI0110OiO == null || boolI0110OiO.booleanValue();
                }

                public final l1iIoO01 I011IO1I11OI(String str, boolean z) {
                    Object obj;
/* 1 */             lII0I0I000I.I0000O(str);
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             Bundle bundleI01101olii = I01101olii();
/* 12 */            if (bundleI01101olii == null) {
/* 14 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 16 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 23 */                l01o0io1ooo0.I00ilO0.I00000oOI("Failed to load metadata: Metadata bundle is null");
/* 26 */                obj = null;
                    } else {
/* 28 */                obj = bundleI01101olii.get(str);
                    }
/* 32 */            l1iIoO01 l1iioo01 = l1iIoO01.UNINITIALIZED;
/* 34 */            if (obj == null) {
/* 36 */                return l1iioo01;
                    }
/* 43 */            if (Boolean.TRUE.equals(obj)) {
/* 45 */                return l1iIoO01.GRANTED;
                    }
/* 54 */            if (Boolean.FALSE.equals(obj)) {
/* 56 */                return l1iIoO01.DENIED;
                    }
/* 59 */            if (z && "eu_consent_policy".equals(obj)) {
/* 69 */                return l1iIoO01.POLICY;
                    }
/* 72 */            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 74 */            l0olllO1i.I000II(l01o0io1ooo02);
/* 81 */            l01o0io1ooo02.I00l0I0l0lO1.I0000Il00O("Invalid manifest metadata for", str);
/* 106 */           return l1iioo01;
                }
            }

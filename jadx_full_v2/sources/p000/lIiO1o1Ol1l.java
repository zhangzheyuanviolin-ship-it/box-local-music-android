            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.HashSet;
            
            public abstract class lIiO1o1Ol1l implements Illill0o {
                public static OOil00Iill I00000oIO(Context context, Bundle bundle) {
/* 4 */             boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
/* 10 */            String[] strArrI00000oOI = I00000oOI(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
/* 16 */            String[] strArrI00000oOI2 = I00000oOI(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
/* 23 */            l11I11lO.I0000O(3, "QuirkSettingsLoader");
/* 26 */            l11I11lO.I0000O(3, "QuirkSettingsLoader");
/* 29 */            Arrays.toString(strArrI00000oOI);
/* 32 */            l11I11lO.I0000O(3, "QuirkSettingsLoader");
/* 35 */            Arrays.toString(strArrI00000oOI2);
/* 38 */            l11I11lO.I0000O(3, "QuirkSettingsLoader");
/* 47 */            HashSet hashSet = new HashSet(I0000Il00O(strArrI00000oOI));
/* 56 */            HashSet hashSet2 = new HashSet(I0000Il00O(strArrI00000oOI2));
/* 61 */            OOil00Iill oOil00Iill = new OOil00Iill();
/* 64 */            oOil00Iill.I00000oIO = z;
/* 71 */            oOil00Iill.I00000oOI = new HashSet(hashSet);
/* 78 */            oOil00Iill.I0000Il00O = new HashSet(hashSet2);
/* 80 */            VarHandle.storeStoreFence();
/* 106 */           return oOil00Iill;
                }

                public static String[] I00000oOI(Context context, Bundle bundle, String str) {
/* 6 */             if (!bundle.containsKey(str)) {
/* 8 */                 return new String[0];
                    }
/* 12 */            int i = bundle.getInt(str, -1);
/* 18 */            if (i == -1) {
/* 26 */                l11I11lO.I0000oI00("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
/* 29 */                return new String[0];
                    }
                    try {
/* 36 */                return context.getResources().getStringArray(i);
                    } catch (Resources.NotFoundException e) {
/* 56 */                l11I11lO.I0001Ioi1lo("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
/* 59 */                return new String[0];
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static HashSet I0000Il00O(String[] strArr) throws ClassNotFoundException {
                    Class<?> cls;
/* 3 */             HashSet hashSet = new HashSet();
/* 8 */             for (String str : strArr) {
                        try {
/* 14 */                    cls = Class.forName(str);
                        } catch (ClassNotFoundException e) {
/* 63 */                    l11I11lO.I0001Ioi1lo("QuirkSettingsLoader", "Class not found: " + str, e);
                        }
/* 24 */                if (OOiio1i.class.isAssignableFrom(cls)) {
/* 67 */                    if (cls == null) {
/* 69 */                        hashSet.add(cls);
                            }
                        } else {
/* 44 */                    l11I11lO.I0000oI00("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
/* 66 */                    cls = null;
/* 67 */                    if (cls == null) {
                            }
                        }
                    }
/* 77 */            return hashSet;
                }
            }

            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            
            public final class i0II0Oio01IO {
                public static final OlOilIlol1 I0000Il00O = new OlOilIlol1("SplitInstallInfoProvider");
                public Context I00000oIO;
                public String I00000oOI;

                public final HashSet I00000oIO() throws PackageManager.NameNotFoundException {
                    PackageInfo packageInfo;
/* 1 */             OlOilIlol1 olOilIlol1 = I0000Il00O;
                    try {
/* 15 */                packageInfo = this.I00000oIO.getPackageManager().getPackageInfo(this.I00000oOI, Barcode.FORMAT_ITF);
                    } catch (PackageManager.NameNotFoundException unused) {
/* 24 */                olOilIlol1.I00000oOI("App is not found in PackageManager", new Object[0]);
/* 27 */                packageInfo = null;
                    }
/* 28 */            if (packageInfo == null || packageInfo.applicationInfo == null) {
/* 175 */               return new HashSet();
                    }
/* 38 */            HashSet hashSet = new HashSet();
/* 43 */            Bundle bundle = packageInfo.applicationInfo.metaData;
/* 47 */            HashSet hashSet2 = new HashSet();
/* 50 */            if (bundle != null) {
/* 55 */                String string = bundle.getString("com.android.dynamic.apk.fused.modules");
/* 59 */                if (string == null || string.isEmpty()) {
/* 93 */                    olOilIlol1.I00000oIO("App has no fused modules.", new Object[0]);
                        } else {
/* 75 */                    Collections.addAll(hashSet2, string.split(",", -1));
/* 80 */                    hashSet2.remove("");
/* 85 */                    hashSet2.remove("base");
                        }
                    }
/* 96 */            String[] strArr = packageInfo.splitNames;
/* 98 */            if (strArr != null) {
/* 110 */               olOilIlol1.I00000oIO("Adding splits from package manager: %s", Arrays.toString(strArr));
/* 113 */               Collections.addAll(hashSet2, strArr);
                    } else {
/* 121 */               olOilIlol1.I00000oIO("No splits are found or app cannot be found in package manager.", new Object[0]);
                    }
/* 130 */           if (i0I1o0iII0IO.I00000oIO.get() != null) {
/* 169 */               OIiilo1Ool0o.I00000oIO();
/* 3 */                 return null;
                    }
/* 132 */           Iterator it = hashSet2.iterator();
/* 140 */           while (it.hasNext()) {
/* 146 */               String str = (String) it.next();
/* 154 */               if (!str.startsWith("config.") && !str.contains(".config.")) {
/* 164 */                   hashSet.add(str);
                        }
                    }
/* 168 */           return hashSet;
                }
            }

            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            
            public final class i0OI1ii10 {
                public static final OlOilIlol1 I0000Il00O = new OlOilIlol1("PackageStateCache");
                public Context I00000oIO;
                public int I00000oOI;

                public final synchronized int I00000oIO() {
/* 5 */             if (this.I00000oOI == -1) {
                        try {
/* 26 */                    this.I00000oOI = this.I00000oIO.getPackageManager().getPackageInfo(this.I00000oIO.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
/* 37 */                    I0000Il00O.I00000oOI("The current version of the app could not be retrieved", new Object[0]);
                        }
                    }
/* 40 */            return this.I00000oOI;
                }
            }

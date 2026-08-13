            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import java.lang.invoke.VarHandle;
            
            public final class i0Il0iIOlil1 implements i0Ii0I1ll {
                public final int I00iOIl;
                public i0IOo0i0 I00iiI;
                public i0O00lI I00iiO;

                @Override
                public final Object I0000Il00O() throws PackageManager.NameNotFoundException {
                    switch (this.I00iOIl) {
                        case 0:
/* 62 */                    Context contextI00000oOI = this.I00iiO.I00000oOI();
/* 74 */                    i0OI1ii10 i0oi1ii10 = (i0OI1ii10) this.I00iiI.I0000Il00O();
/* 76 */                    i0Il00O1 i0il00o1 = new i0Il00O1();
/* 79 */                    i0il00o1.I00000oIO = contextI00000oOI;
/* 81 */                    i0il00o1.I00000oOI = i0oi1ii10;
/* 83 */                    VarHandle.storeStoreFence();
/* 86 */                    return i0il00o1;
                        default:
/* 8 */                     Object objI0000Il00O = this.I00iiI.I0000Il00O();
/* 14 */                    Context contextI00000oOI2 = this.I00iiO.I00000oOI();
/* 18 */                    i0OOOllloIII i0ooollloiii = (i0OOOllloIII) objI0000Il00O;
/* 35 */                    liIioOloOi1.I00000oIO(contextI00000oOI2.getPackageManager(), new ComponentName(contextI00000oOI2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
/* 53 */                    liIioOloOi1.I00000oIO(contextI00000oOI2.getPackageManager(), new ComponentName(contextI00000oOI2.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
/* 56 */                    liIliolI1Oi0.I00000oIO(i0ooollloiii);
/* 59 */                    return i0ooollloiii;
                    }
                }
            }

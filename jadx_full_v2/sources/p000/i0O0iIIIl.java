            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class i0O0iIIIl implements i0Ii0I1ll {
                public final int I00iOIl;
                public i0O00lI I00iiI;

                @Override
                public final Object I0000Il00O() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             i0O00lI i0o00li = this.I00iiI;
                    switch (i) {
                        case 0:
/* 40 */                    Context contextI00000oOI = i0o00li.I00000oOI();
/* 46 */                    i0O0i11IO0l0 i0o0i11io0l0 = new i0O0i11IO0l0();
/* 56 */                    i0o0i11io0l0.I00iOIl = new OlOilIlol1("ExtractionForegroundServiceConnection");
/* 63 */                    i0o0i11io0l0.I00iiI = new ArrayList();
/* 65 */                    i0o0i11io0l0.I00iiO = contextI00000oOI;
/* 67 */                    VarHandle.storeStoreFence();
/* 70 */                    return i0o0i11io0l0;
                        default:
/* 8 */                     Context contextI00000oOI2 = i0o00li.I00000oOI();
                            try {
/* 26 */                        Bundle bundle = contextI00000oOI2.getPackageManager().getApplicationInfo(contextI00000oOI2.getPackageName(), Barcode.FORMAT_ITF).metaData;
/* 28 */                        if (bundle != null) {
/* 33 */                            return bundle.getString("local_testing_dir");
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
/* 38 */                    return null;
                    }
                }
            }

            package com.google.android.gms.oss.licenses.v2;

            import android.content.res.Resources;
            import android.os.Bundle;
            import com.box.gallery.R;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import p000.I11io0O0O1o1;
            import p000.IOiOII1;
            import p000.IOii1l;
            import p000.IioOll;
            import p000.i00IOoliil0i;
            import p000.iI1I1I;
            
            public final class OssLicensesMenuActivity extends I11io0O0O1o1 {
                public static final int I00oo1iO0ll = 0;

                public static final boolean I001IIilI0O(OssLicensesMenuActivity ossLicensesMenuActivity, String str) throws IOException {
/* 2 */             InputStream inputStreamOpenRawResource = null;
                    try {
/* 3 */                 Resources resources = ossLicensesMenuActivity.getResources();
/* 20 */                inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
/* 28 */                boolean z = inputStreamOpenRawResource.available() > 0;
                        try {
/* 31 */                    inputStreamOpenRawResource.close();
                        } catch (IOException unused) {
                        }
/* 34 */                return z;
                    } catch (Resources.NotFoundException | IOException unused2) {
/* 42 */                if (inputStreamOpenRawResource != null) {
                            try {
/* 44 */                        inputStreamOpenRawResource.close();
                            } catch (IOException unused3) {
                            }
                        }
/* 1 */                 return false;
                    } catch (Throwable th) {
/* 36 */                if (inputStreamOpenRawResource != null) {
                            try {
/* 38 */                        inputStreamOpenRawResource.close();
                            } catch (IOException unused4) {
                            }
                        }
/* 41 */                throw th;
                    }
                }

                @Override
                public final void onCreate(Bundle bundle) {
                    i00IOoliil0i i00iooliil0iI00111O;
/* 1 */             super.onCreate(bundle);
/* 4 */             IioOll.I00000oIO(this);
/* 28 */            String stringExtra = getIntent().hasExtra("title") ? getIntent().getStringExtra("title") : null;
/* 33 */            boolean z = false;
/* 35 */            if (I00111O() != null && (i00iooliil0iI00111O = I00111O()) != null && !i00iooliil0iI00111O.I00100l0) {
/* 47 */                i00iooliil0iI00111O.I00100l0 = true;
/* 49 */                i00iooliil0iI00111O.I0000oI00(false);
                    }
/* 58 */            if (I001IIilI0O(this, "third_party_licenses") && I001IIilI0O(this, "third_party_license_metadata")) {
/* 68 */                z = true;
                    }
/* 72 */            iI1I1I ii1i1i = new iI1I1I(2);
/* 75 */            ii1i1i.I00iiI = stringExtra;
/* 77 */            ii1i1i.I00iiO = z;
/* 79 */            VarHandle.storeStoreFence();
/* 90 */            IOiOII1.I00000oIO(this, new IOii1l(546016281, ii1i1i, true));
                }
            }

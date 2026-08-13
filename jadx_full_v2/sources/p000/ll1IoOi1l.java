            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Collections;
            
            public abstract class ll1IoOi1l {
                public static ArrayList I00000oIO(Context context) {
/* 16 */            String[] strArrSplit = I00000oOI(context.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
/* 23 */            ArrayList arrayList = new ArrayList(strArrSplit.length);
/* 28 */            for (String str : strArrSplit) {
/* 34 */                int iIndexOf = str.indexOf(32);
/* 44 */                String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
/* 50 */                if (strArrSplit2.length != 2 || iIndexOf <= 0) {
/* 103 */                   I000II.I001IO000(lilIO0i.I00000oIO("Invalid license meta-data line:\n%s", str));
/* 106 */                   return null;
                        }
/* 56 */                long j = Long.parseLong(strArrSplit2[0]);
/* 63 */                int i = Integer.parseInt(strArrSplit2[1]);
/* 69 */                String strSubstring = str.substring(iIndexOf + 1);
/* 75 */                o00i1olooO o00i1olooo = new o00i1olooO();
/* 78 */                o00i1olooo.I00iOIl = strSubstring;
/* 80 */                o00i1olooo.I00iiI = j;
/* 82 */                o00i1olooo.I00iiO = i;
/* 84 */                VarHandle.storeStoreFence();
/* 87 */                arrayList.add(o00i1olooo);
                    }
/* 108 */           Collections.sort(arrayList);
/* 168 */           return arrayList;
                }

                public static String I00000oOI(Context context, String str, long j, int i) throws Resources.NotFoundException, IOException {
/* 5 */             Resources resources = context.getApplicationContext().getResources();
/* 22 */            InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.raw.keep_third_party_licenses)));
/* 28 */            byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
/* 32 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 36 */                inputStreamOpenRawResource.skip(j);
/* 39 */                if (i <= 0) {
/* 41 */                    i = Integer.MAX_VALUE;
                        }
/* 44 */                while (i > 0) {
/* 51 */                    int i2 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, Barcode.FORMAT_UPC_E));
/* 56 */                    if (i2 == -1) {
                                break;
                            }
/* 58 */                    byteArrayOutputStream.write(bArr, 0, i2);
/* 61 */                    i -= i2;
                        }
/* 65 */                inputStreamOpenRawResource.close();
                        try {
/* 74 */                    return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } catch (UnsupportedEncodingException e) {
/* 82 */                    OIiilo1Ool0o.I000iOII("Unsupported encoding UTF8. This should always be supported.", e);
/* 35 */                    return null;
                        }
                    } catch (IOException e2) {
/* 88 */                OIiilo1Ool0o.I000iOII("Failed to read license or metadata text.", e2);
/* 35 */                return null;
                    }
                }
            }

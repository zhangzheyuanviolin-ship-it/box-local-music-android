            package p000;

            import android.net.Uri;
            import android.text.TextUtils;
            import java.io.UnsupportedEncodingException;
            import java.net.URLEncoder;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Map;
            
            public abstract class li0IOIio0l1I {
                public static void I00000oIO(Uri.Builder builder, String str, Object obj) {
/* 1 */             if (obj == null || obj.toString() == null) {
/* 10 */                return;
                    }
/* 15 */            builder.appendQueryParameter(str, obj.toString());
                }

                public static String I00000oOI(HashMap map) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (Map.Entry entry : map.entrySet()) {
/* 28 */                StringBuilder sb = new StringBuilder();
/* 37 */                sb.append((String) entry.getKey());
/* 42 */                sb.append("=");
/* 49 */                String str = (String) entry.getValue();
/* 51 */                str.getClass();
                        try {
/* 60 */                    sb.append(URLEncoder.encode(str, "utf-8"));
/* 67 */                    arrayList.add(sb.toString());
                        } catch (UnsupportedEncodingException unused) {
/* 73 */                    I000II.I001IO000("Unable to encode using UTF-8");
/* 76 */                    return null;
                        }
                    }
/* 80 */            return TextUtils.join("&", arrayList);
                }
            }

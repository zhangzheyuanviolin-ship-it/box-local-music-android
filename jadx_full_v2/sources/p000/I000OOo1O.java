            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
            public final class I000OOo1O implements IllOOo00lI {
                public final int I00iOIl;
                public Context I00iiI;

                public I000OOo1O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Context context = this.I00iiI;
                    switch (i) {
                        case 0:
/* 121 */                   context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://developers.google.com/ml-kit/genai/aicore-dev-preview")));
/* 124 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 103 */                   return il0IOl1lI1l0.I00000oIO(context, "mcp_servers.pb");
                        case 2:
/* 96 */                    return il0IOl1lI1l0.I00000oIO(context, "cutouts.pb");
                        case 3:
/* 89 */                    return il0IOl1lI1l0.I00000oIO(context, "skills.pb");
                        case 4:
/* 82 */                    return il0IOl1lI1l0.I00000oIO(context, "settings.pb");
                        case 5:
/* 75 */                    return il0IOl1lI1l0.I00000oIO(context, "user_data.pb");
                        case 6:
/* 68 */                    return il0IOl1lI1l0.I00000oIO(context, "benchmark_results.pb");
                        case 7:
/* 35 */                    OiI0OoOIi oiI0OoOIi = new OiI0OoOIi();
/* 43 */                    oiI0OoOIi.I00000oIO = new Object();
/* 50 */                    oiI0OoOIi.I0000Il00O = new LinkedHashMap();
/* 53 */                    oiI0OoOIi.I0000O = -1;
/* 60 */                    oiI0OoOIi.I00000oOI = new OiI0I1001i(context, oiI0OoOIi);
/* 62 */                    VarHandle.storeStoreFence();
/* 65 */                    return oiI0OoOIi;
                        case 8:
/* 26 */                    O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 28 */                    return O111ooi11li.I000iOII(context);
                        case 9:
/* 21 */                    return l1iOI0.I00000oIO(context);
                        default:
/* 15 */                    context.startActivity(new Intent(context, (Class<?>) OssLicensesMenuActivity.class));
/* 18 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }

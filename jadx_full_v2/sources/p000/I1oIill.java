            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.util.Log;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.zip.GZIPInputStream;
            
            public class I1oIill extends WebViewClient {
                public final Context I00000oIO;
                public final OlII11110Iol I00000oOI;

                public I1oIill(Context context) {
/* 4 */             this.I00000oIO = context;
/* 8 */             ArrayList arrayList = new ArrayList();
/* 14 */            i0010l1l i0010l1lVar = new i0010l1l(1);
/* 19 */            I1O0ol i1O0ol = new I1O0ol();
/* 22 */            i1O0ol.I00000oIO = context;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            i0010l1lVar.I00000oOI = i1O0ol;
/* 29 */            VarHandle.storeStoreFence();
/* 39 */            arrayList.add(new OIoi11oolo("/assets/", i0010l1lVar));
/* 44 */            File filesDir = context.getFilesDir();
/* 51 */            i0010l1l i0010l1lVar2 = new i0010l1l(0);
                    try {
/* 63 */                i0010l1lVar2.I00000oOI = new File(I1O0ol.I00000oOI(filesDir));
/* 69 */                if (!i0010l1lVar2.I00000oIO(context)) {
/* 201 */                   throw new IllegalArgumentException("The given directory \"" + filesDir + "\" doesn't exist under an allowed app internal storage directory");
                        }
/* 71 */                VarHandle.storeStoreFence();
/* 81 */                arrayList.add(new OIoi11oolo("/", i0010l1lVar2));
/* 86 */                ArrayList arrayList2 = new ArrayList();
/* 89 */                Iterator it = arrayList.iterator();
/* 97 */                while (it.hasNext()) {
/* 103 */                   OIoi11oolo oIoi11oolo = (OIoi11oolo) it.next();
/* 107 */                   String str = (String) oIoi11oolo.I00000oIO;
/* 111 */                   i0010l1l i0010l1lVar3 = (i0010l1l) oIoi11oolo.I00000oOI;
/* 115 */                   i0010li00lo i0010li00loVar = new i0010li00lo();
/* 123 */                   if (str.isEmpty() || str.charAt(0) != '/') {
/* 162 */                       I000II.I000iOII("Path should start with a slash '/'.");
/* 165 */                       throw null;
                            }
/* 137 */                   if (!str.endsWith("/")) {
/* 156 */                       I000II.I000iOII("Path should end with a slash '/'");
/* 159 */                       throw null;
                            }
/* 141 */                   i0010li00loVar.I00000oIO = "appassets.androidplatform.net";
/* 143 */                   i0010li00loVar.I00000oOI = str;
/* 145 */                   i0010li00loVar.I0000Il00O = i0010l1lVar3;
/* 147 */                   VarHandle.storeStoreFence();
/* 150 */                   arrayList2.add(i0010li00loVar);
                        }
/* 168 */               OlII11110Iol olII11110Iol = new OlII11110Iol();
/* 171 */               olII11110Iol.I00iOIl = arrayList2;
/* 173 */               VarHandle.storeStoreFence();
/* 176 */               this.I00000oOI = olII11110Iol;
                    } catch (IOException e) {
/* 437 */               throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + filesDir.getPath(), e);
                    }
                }

                @Override
                public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
                    File file;
/* 10 */            if ((webResourceRequest != null ? webResourceRequest.getUrl() : null) == null || !OlOolloIIOl0.I000l1(webResourceRequest.getUrl().toString(), "https://appassets.androidplatform.net", false)) {
/* 393 */               return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
/* 45 */            if (!OlOolloIIOl0.I000l1(webResourceRequest.getUrl().toString(), "https://appassets.androidplatform.net/assets/", false)) {
/* 51 */                String path = webResourceRequest.getUrl().getPath();
/* 55 */                if (path == null) {
/* 43 */                    path = "";
                        }
/* 66 */                File file2 = new File(this.I00000oIO.getFilesDir(), path);
/* 73 */                if (!file2.exists() || file2.isDirectory()) {
/* 87 */                    return new WebResourceResponse("text/plain", "UTF-8", null);
                        }
                    }
/* 91 */            Uri url = webResourceRequest.getUrl();
/* 99 */            Iterator it = this.I00000oOI.I00iOIl.iterator();
/* 107 */           while (it.hasNext()) {
/* 113 */               i0010li00lo i0010li00loVar = (i0010li00lo) it.next();
/* 115 */               i0010li00loVar.getClass();
/* 118 */               String str = i0010li00loVar.I00000oOI;
/* 181 */               i0010l1l i0010l1lVar = (!url.getScheme().equals("http") && (url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(i0010li00loVar.I00000oIO) && url.getPath().startsWith(str)) ? i0010li00loVar.I0000Il00O : null;
/* 183 */               if (i0010l1lVar != null) {
/* 190 */                   String strReplaceFirst = url.getPath().replaceFirst(str, "");
                            switch (i0010l1lVar.I00000oIO) {
                                case 0:
/* 291 */                           File file3 = (File) i0010l1lVar.I00000oOI;
                                    try {
/* 293 */                               String strI00000oOI = I1O0ol.I00000oOI(file3);
/* 302 */                               String canonicalPath = new File(file3, strReplaceFirst).getCanonicalPath();
/* 318 */                               file = canonicalPath.startsWith(strI00000oOI) ? new File(canonicalPath) : null;
                                    } catch (IOException e) {
/* 382 */                               Log.e("WebViewAssetLoader", "Error opening the requested path: " + strReplaceFirst, e);
                                    }
/* 319 */                           if (file == null) {
/* 364 */                               Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", strReplaceFirst, file3));
/* 387 */                               return new WebResourceResponse(null, null, null);
                                    }
/* 323 */                           InputStream fileInputStream = new FileInputStream(file);
/* 334 */                           if (file.getPath().endsWith(".svgz")) {
/* 338 */                               fileInputStream = new GZIPInputStream(fileInputStream);
                                    }
/* 348 */                           return new WebResourceResponse(I1O0ol.I0000O(strReplaceFirst), null, fileInputStream);
                                default:
                                    try {
/* 205 */                               I1O0ol i1O0ol = (I1O0ol) i0010l1lVar.I00000oOI;
/* 207 */                               i1O0ol.getClass();
/* 230 */                               String strSubstring = (strReplaceFirst.length() <= 1 || strReplaceFirst.charAt(0) != '/') ? strReplaceFirst : strReplaceFirst.substring(1);
/* 238 */                               InputStream inputStreamOpen = i1O0ol.I00000oIO.getAssets().open(strSubstring, 2);
/* 246 */                               if (strSubstring.endsWith(".svgz")) {
/* 250 */                                   inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                                        }
/* 260 */                               return new WebResourceResponse(I1O0ol.I0000O(strReplaceFirst), null, inputStreamOpen);
                                    } catch (IOException e2) {
/* 280 */                               Log.e("WebViewAssetLoader", "Error opening asset path: " + strReplaceFirst, e2);
/* 285 */                               return new WebResourceResponse(null, null, null);
                                    }
                            }
                        }
                    }
/* 1 */             return null;
                }
            }

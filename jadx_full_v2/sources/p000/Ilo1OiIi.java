            package p000;

            import android.content.Context;
            import android.view.ViewGroup;
            import android.webkit.WebSettings;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import kotlin.jvm.functions.Function1;
            
            public final class Ilo1OiIi implements Function1 {
                public boolean I00iOIl;
                public WebViewClient I00iiI;
                public String I00iiO;
                public Function1 I00iio;
                public Function1 I00ilI0I1;
                public boolean I00ilO0;
                public O1OIi1 I00io1l;
                public O1OIi1 I00ioIO;
                public OI10i0Il I00l0I0l0lO1;
                public OI10i0Il I00l0OO0IO;
                public boolean I00li1OI;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             boolean z = this.I00iOIl;
/* 5 */             WebViewClient webViewClient = this.I00iiI;
/* 7 */             String str = this.I00iiO;
/* 9 */             Function1 function1 = this.I00iio;
/* 11 */            Function1 function12 = this.I00ilI0I1;
/* 13 */            boolean z2 = this.I00ilO0;
/* 15 */            O1OIi1 o1OIi1 = this.I00io1l;
/* 17 */            O1OIi1 o1OIi12 = this.I00ioIO;
/* 19 */            OI10i0Il oI10i0Il = this.I00l0I0l0lO1;
/* 21 */            OI10i0Il oI10i0Il2 = this.I00l0OO0IO;
/* 23 */            boolean z3 = this.I00li1OI;
/* 31 */            WebView webView = new WebView((Context) obj);
/* 40 */            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
/* 43 */            WebSettings settings = webView.getSettings();
/* 48 */            settings.setJavaScriptEnabled(true);
/* 51 */            settings.setDomStorageEnabled(true);
/* 54 */            settings.setAllowFileAccess(true);
/* 58 */            settings.setMediaPlaybackRequiresUserGesture(false);
/* 61 */            if (z) {
/* 68 */                webView.setOnTouchListener(new Ilo1Oo1I1O1o());
                    }
/* 76 */            webView.setWebChromeClient(new Ilo1i1OIO0O(function12, z2, o1OIi1, o1OIi12, oI10i0Il, oI10i0Il2));
/* 79 */            webView.setWebViewClient(webViewClient);
/* 82 */            if (str != null) {
/* 84 */                if (z3) {
/* 101 */                   webView.loadDataWithBaseURL(null, OlOolloIIOl0.I000iOII("<html>\n  <body style=\"margin:0;padding:0;\">\n    <iframe\n        width=\"100%\"\n        height=\"100%\"\n        src=\"___\"\n        frameborder=\"0\"\n        style=\"border:0;\">\n    </iframe>\n  </body>\n</html>", "___", str), "text/html", "UTF-8", null);
                        } else {
/* 105 */                   webView.loadUrl(str);
                        }
                    }
/* 108 */           if (function1 != null) {
/* 110 */               function1.invoke(webView);
                    }
/* 168 */           return webView;
                }
            }

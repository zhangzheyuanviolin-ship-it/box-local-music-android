            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.CopyOnWriteArraySet;
            
            public abstract class I0oOl1II {
                public static final CopyOnWriteArraySet I00000oIO = new CopyOnWriteArraySet();
                public static final Map I00000oOI;

                static {
/* 10 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 15 */            Package r2 = OIOlo0OloOi.class.getPackage();
/* 26 */            String name = r2 != null ? r2.getName() : null;
/* 27 */            if (name != null) {
/* 31 */                linkedHashMap.put(name, "OkHttp");
                    }
/* 40 */            linkedHashMap.put(OIOlo0OloOi.class.getName(), "okhttp.OkHttpClient");
/* 51 */            linkedHashMap.put(IoIO101IlO.class.getName(), "okhttp.Http2");
/* 62 */            linkedHashMap.put(OloO0oOI1lI.class.getName(), "okhttp.TaskRunner");
/* 69 */            linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
/* 76 */            I00000oOI = O1Oii0O0loo.I000iOII(linkedHashMap);
                }
            }

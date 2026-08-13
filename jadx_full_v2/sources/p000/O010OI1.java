            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLParameters;
            import javax.net.ssl.SSLSocket;
            
            public final class O010OI1 extends OO1I1IllO {
                public static final boolean I0000Il00O;

                static {
/* 3 */             String property = System.getProperty("java.specification.version");
/* 17 */            Integer numI000lI = property != null ? OlOolloIIOl0.I000lI(10, property) : null;
/* 18 */            boolean z = false;
/* 20 */            if (numI000lI == null) {
                        try {
/* 36 */                    SSLSocket.class.getMethod("getApplicationProtocol", null);
/* 30 */                    z = true;
                        } catch (NoSuchMethodException unused) {
                        }
                    } else if (numI000lI.intValue() >= 9) {
/* 30 */                z = true;
                    }
/* 40 */            I0000Il00O = z;
                }

                @Override
                public final void I0000Il00O(SSLSocket sSLSocket, String str, List list) {
/* 1 */             SSLParameters sSLParameters = sSLSocket.getSSLParameters();
/* 9 */             ArrayList arrayList = new ArrayList();
/* 20 */            for (Object obj : list) {
/* 31 */                if (((OOiIO0oi) obj) != OOiIO0oi.HTTP_1_0) {
/* 33 */                    arrayList.add(obj);
                        }
                    }
/* 45 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 48 */            Iterator it = arrayList.iterator();
/* 56 */            while (it.hasNext()) {
/* 66 */                arrayList2.add(((OOiIO0oi) it.next()).I00iOIl);
                    }
/* 79 */            sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
/* 82 */            sSLSocket.setSSLParameters(sSLParameters);
                }

                @Override
                public final String I0000O(SSLSocket sSLSocket) {
                    try {
/* 1 */                 String applicationProtocol = sSLSocket.getApplicationProtocol();
/* 15 */                if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
/* 19 */                    return null;
                        }
/* 18 */                return applicationProtocol;
                    } catch (UnsupportedOperationException unused) {
/* 19 */                return null;
                    }
                }
            }

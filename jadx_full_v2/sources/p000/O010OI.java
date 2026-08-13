            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Proxy;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            
            public final class O010OI extends OO1I1IllO {
                public Method I0000Il00O;
                public Method I0000O;
                public Method I0000oI00;
                public Class I0001Ioi1lo;
                public Class I000II;

                @Override
                public final void I00000oIO(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    try {
/* 10 */                this.I0000oI00.invoke(null, sSLSocket);
                    } catch (IllegalAccessException e) {
/* 49 */                throw new AssertionError("failed to remove ALPN", e);
                    } catch (InvocationTargetException e2) {
/* 23 */                throw new AssertionError("failed to remove ALPN", e2);
                    }
                }

                @Override
                public final void I0000Il00O(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 7 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (Object obj : list) {
/* 29 */                if (((OOiIO0oi) obj) != OOiIO0oi.HTTP_1_0) {
/* 31 */                    arrayList.add(obj);
                        }
                    }
/* 43 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 46 */            Iterator it = arrayList.iterator();
/* 54 */            while (it.hasNext()) {
/* 64 */                arrayList2.add(((OOiIO0oi) it.next()).I00iOIl);
                    }
                    try {
/* 70 */                ClassLoader classLoader = OO1I1IllO.class.getClassLoader();
/* 78 */                Class[] clsArr = {this.I0001Ioi1lo, this.I000II};
/* 84 */                O0101Ill1 o0101Ill1 = new O0101Ill1();
/* 87 */                o0101Ill1.I00000oIO = arrayList2;
/* 89 */                VarHandle.storeStoreFence();
/* 103 */               this.I0000Il00O.invoke(null, sSLSocket, Proxy.newProxyInstance(classLoader, clsArr, o0101Ill1));
                    } catch (IllegalAccessException e) {
/* 116 */               throw new AssertionError("failed to set ALPN", e);
                    } catch (InvocationTargetException e2) {
/* 215 */               throw new AssertionError("failed to set ALPN", e2);
                    }
                }

                @Override
                public final String I0000O(SSLSocket sSLSocket) {
                    try {
/* 18 */                O0101Ill1 o0101Ill1 = (O0101Ill1) Proxy.getInvocationHandler(this.I0000O.invoke(null, sSLSocket));
/* 20 */                boolean z = o0101Ill1.I00000oOI;
/* 22 */                if (!z && o0101Ill1.I0000Il00O == null) {
/* 31 */                    OO1I1IllO.I0001Ioi1lo("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null, 4);
/* 9 */                     return null;
                        }
/* 39 */                if (z) {
/* 9 */                     return null;
                        }
/* 42 */                return o0101Ill1.I0000Il00O;
                    } catch (IllegalAccessException e) {
/* 50 */                throw new AssertionError("failed to get ALPN selected protocol", e);
                    } catch (InvocationTargetException e2) {
/* 186 */               throw new AssertionError("failed to get ALPN selected protocol", e2);
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.net.ProxySelector;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import javax.net.SocketFactory;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            
            public final class OIOlo0OloOi implements Cloneable {
                public static final List I00olI = OollIoI001lo.I000iOII(OOiIO0oi.HTTP_2, OOiIO0oi.HTTP_1_1);
                public static final List I00oli = OollIoI001lo.I000iOII(IOloi0IiI.I0000oI00, IOloi0IiI.I0001Ioi1lo);
                public final o01l1ioOo0 I00iOIl;
                public final Oi00IilOloo0 I00iiI;
                public final List I00iiO;
                public final List I00iio;
                public final OoOil11Ol1o I00ilI0I1;
                public final boolean I00ilO0;
                public final iOloo0O0O I00io1l;
                public final boolean I00ioIO;
                public final boolean I00l0I0l0lO1;
                public final o0llIi I00l0OO0IO;
                public final i1O10l1io1iO I00li1OI;
                public final ProxySelector I00ll1;
                public final iOloo0O0O I00lli11;
                public final SocketFactory I00lll10;
                public final SSLSocketFactory I00o0iI0io1;
                public final List I00o0l1o1o0;
                public final List I00o101lO;
                public final HostnameVerifier I00oI0i;
                public final IO0lll0O I00oII;
                public final int I00oIiI10;
                public final int I00oO101o;
                public final int I00oOio10iI1;
                public final iiOlilo0IIIl I00ol1;

                public OIOlo0OloOi(OIOlo00i oIOlo00i) {
                    X509TrustManager x509TrustManagerI000OOo1O;
                    SSLSocketFactory sSLSocketFactoryI000O01llI0;
                    iOl11OooolI0 iol11ooooli0I00000oOI;
/* 6 */             this.I00iOIl = oIOlo00i.I00000oIO;
/* 10 */            this.I00iiI = oIOlo00i.I00000oOI;
/* 18 */            this.I00iiO = OollIoI001lo.I001i1O0Ol(oIOlo00i.I0000Il00O);
/* 26 */            this.I00iio = OollIoI001lo.I001i1O0Ol(oIOlo00i.I0000O);
/* 30 */            this.I00ilI0I1 = oIOlo00i.I0000oI00;
/* 34 */            this.I00ilO0 = oIOlo00i.I0001Ioi1lo;
/* 38 */            this.I00io1l = oIOlo00i.I000II;
/* 42 */            this.I00ioIO = oIOlo00i.I000O01llI0;
/* 46 */            this.I00l0I0l0lO1 = oIOlo00i.I000OOo1O;
/* 50 */            this.I00l0OO0IO = oIOlo00i.I000OiO;
/* 54 */            this.I00li1OI = oIOlo00i.I000iOII;
/* 56 */            ProxySelector proxySelector = ProxySelector.getDefault();
/* 64 */            this.I00ll1 = proxySelector == null ? OIOIl0IO0Il1.I00000oIO : proxySelector;
/* 68 */            this.I00lli11 = oIOlo00i.I000l1;
/* 72 */            this.I00lll10 = oIOlo00i.I000lI;
/* 74 */            List list = oIOlo00i.I000o00OoI0I;
/* 76 */            this.I00o0l1o1o0 = list;
/* 80 */            this.I00o101lO = oIOlo00i.I000oI1ioi;
/* 84 */            this.I00oI0i = oIOlo00i.I00100l0;
/* 88 */            this.I00oIiI10 = oIOlo00i.I0010I0i;
/* 92 */            this.I00oO101o = oIOlo00i.I0010o;
/* 96 */            this.I00oOio10iI1 = oIOlo00i.I00111O;
/* 100 */           iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 108 */           iiolilo0iiil.I00iOIl = new LinkedHashSet();
/* 110 */           VarHandle.storeStoreFence();
/* 113 */           this.I00ol1 = iiolilo0iiil;
/* 115 */           List list2 = list;
/* 120 */           if ((list2 instanceof Collection) && list2.isEmpty()) {
/* 196 */               this.I00o0iI0io1 = null;
/* 200 */               this.I00oII = IO0lll0O.I0000Il00O;
/* 202 */               x509TrustManagerI000OOo1O = null;
/* 203 */               sSLSocketFactoryI000O01llI0 = null;
/* 204 */               iol11ooooli0I00000oOI = null;
                    } else {
/* 132 */               Iterator it = list2.iterator();
/* 140 */               while (it.hasNext()) {
/* 150 */                   if (((IOloi0IiI) it.next()).I00000oIO) {
/* 152 */                       OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 156 */                       x509TrustManagerI000OOo1O = OO1I1IllO.I00000oIO.I000OOo1O();
/* 162 */                       sSLSocketFactoryI000O01llI0 = OO1I1IllO.I00000oIO.I000O01llI0(x509TrustManagerI000OOo1O);
/* 166 */                       this.I00o0iI0io1 = sSLSocketFactoryI000O01llI0;
/* 170 */                       iol11ooooli0I00000oOI = OO1I1IllO.I00000oIO.I00000oOI(x509TrustManagerI000OOo1O);
/* 174 */                       IO0lll0O iO0lll0O = oIOlo00i.I00100o1O0lo;
/* 193 */                       this.I00oII = O0000Ioio00.I0000O(iO0lll0O.I00000oOI, iol11ooooli0I00000oOI) ? iO0lll0O : new IO0lll0O(iO0lll0O.I00000oIO, iol11ooooli0I00000oOI);
                            }
                        }
/* 196 */               this.I00o0iI0io1 = null;
/* 200 */               this.I00oII = IO0lll0O.I0000Il00O;
/* 202 */               x509TrustManagerI000OOo1O = null;
/* 203 */               sSLSocketFactoryI000O01llI0 = null;
/* 204 */               iol11ooooli0I00000oOI = null;
                    }
/* 205 */           List list3 = this.I00iio;
/* 207 */           List list4 = this.I00iiO;
/* 213 */           if (list4.contains(null)) {
/* 327 */               IoOOl0iOl1io.I001lIiIIo1O("Null interceptor: ", list4);
/* 966 */               throw null;
                    }
/* 219 */           if (list3.contains(null)) {
/* 321 */               IoOOl0iOl1io.I001lIiIIo1O("Null network interceptor: ", list3);
/* 324 */               throw null;
                    }
/* 221 */           List list5 = this.I00o0l1o1o0;
/* 227 */           if (!(list5 instanceof Collection) || !list5.isEmpty()) {
/* 239 */               Iterator it2 = list5.iterator();
/* 247 */               while (it2.hasNext()) {
/* 257 */                   if (((IOloi0IiI) it2.next()).I00000oIO) {
/* 259 */                       if (sSLSocketFactoryI000O01llI0 == null) {
/* 280 */                           I000II.I001IO000("sslSocketFactory == null");
/* 283 */                           throw null;
                                }
/* 261 */                       if (iol11ooooli0I00000oOI == null) {
/* 274 */                           I000II.I001IO000("certificateChainCleaner == null");
/* 277 */                           throw null;
                                }
/* 263 */                       if (x509TrustManagerI000OOo1O != null) {
/* 302 */                           return;
                                }
/* 268 */                       I000II.I001IO000("x509TrustManager == null");
/* 271 */                       throw null;
                            }
                        }
                    }
/* 286 */           if (sSLSocketFactoryI000O01llI0 != null) {
/* 315 */               I000II.I001IO000("Check failed.");
/* 318 */               throw null;
                    }
/* 288 */           if (iol11ooooli0I00000oOI != null) {
/* 311 */               I000II.I001IO000("Check failed.");
/* 314 */               throw null;
                    }
/* 290 */           if (x509TrustManagerI000OOo1O != null) {
/* 307 */               I000II.I001IO000("Check failed.");
/* 310 */               throw null;
                    }
/* 300 */           if (O0000Ioio00.I0000O(this.I00oII, IO0lll0O.I0000Il00O)) {
/* 302 */               return;
                    }
/* 303 */           I000II.I001IO000("Check failed.");
/* 306 */           throw null;
                }

                public final Object clone() {
/* 1 */             return super.clone();
                }
            }

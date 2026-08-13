            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.invoke.VarHandle;
            import java.net.ConnectException;
            import java.net.InetSocketAddress;
            import java.net.ProtocolException;
            import java.net.Proxy;
            import java.net.Socket;
            import java.net.SocketException;
            import java.net.SocketTimeoutException;
            import java.net.UnknownServiceException;
            import java.security.cert.CertificateException;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import javax.net.ssl.SSLException;
            import javax.net.ssl.SSLHandshakeException;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.SSLSession;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            
            public final class OOll1O extends iIo0oilo {
                public OiI1II0IIOi0 I00000oIO;
                public Socket I00000oOI;
                public Socket I0000Il00O;
                public Io11ol I0000O;
                public OOiIO0oi I0000oI00;
                public IoIOii01O I0001Ioi1lo;
                public OOliO0 I000II;
                public OOliIlo01o I000O01llI0;
                public boolean I000OOo1O;
                public boolean I000OiO;
                public int I000iOII;
                public int I000l1;
                public int I000lI;
                public int I000o00OoI0I;
                public ArrayList I000oI1ioi;
                public long I00100l0;

                public static void I00000oOI(OIOlo0OloOi oIOlo0OloOi, OiI1II0IIOi0 oiI1II0IIOi0, IOException iOException) {
/* 9 */             if (oiI1II0IIOi0.I00000oOI.type() != Proxy.Type.DIRECT) {
/* 11 */                I0OI0o0lO i0OI0o0lO = oiI1II0IIOi0.I00000oIO;
/* 27 */                i0OI0o0lO.I000II.connectFailed(i0OI0o0lO.I000O01llI0.I000II(), oiI1II0IIOi0.I00000oOI.address(), iOException);
                    }
/* 30 */            iiOlilo0IIIl iiolilo0iiil = oIOlo0OloOi.I00ol1;
                    synchronized (iiolilo0iiil) {
/* 37 */                ((LinkedHashSet) iiolilo0iiil.I00iOIl).add(oiI1II0IIOi0);
                    }
                }

                public final void I00000oIO(int i, int i2, int i3, boolean z, OOlioiIOOO1 oOlioiIOOO1) throws Throwable {
                    OiI1II0IIOi0 oiI1II0IIOi0;
/* 3 */             if (this.I0000oI00 != null) {
/* 278 */               I000II.I001IO000("already connected");
/* 966 */               return;
                    }
/* 7 */             I0OI0o0lO i0OI0o0lO = this.I00000oIO.I00000oIO;
/* 9 */             List list = i0OI0o0lO.I000OiO;
/* 13 */            IOloiOI1 iOloiOI1 = new IOloiOI1();
/* 16 */            iOloiOI1.I0000O = list;
/* 18 */            VarHandle.storeStoreFence();
/* 23 */            if (i0OI0o0lO.I0000Il00O == null) {
/* 31 */                if (!list.contains(IOloi0IiI.I0001Ioi1lo)) {
/* 83 */                    throw new OiI1Ii(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                        }
/* 39 */                String str = this.I00000oIO.I00000oIO.I000O01llI0.I0000O;
/* 41 */                OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 49 */                if (!OO1I1IllO.I00000oIO.I0000oI00(str)) {
/* 70 */                    throw new OiI1Ii(new UnknownServiceException(IlIi0I0.I000lI("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                        }
                    } else if (i0OI0o0lO.I000OOo1O.contains(OOiIO0oi.H2_PRIOR_KNOWLEDGE)) {
/* 275 */               throw new OiI1Ii(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
                    }
/* 95 */            OiI1Ii oiI1Ii = null;
/* 258 */           do {
                        try {
/* 97 */                    OiI1II0IIOi0 oiI1II0IIOi02 = this.I00000oIO;
/* 118 */                   if (oiI1II0IIOi02.I00000oIO.I0000Il00O != null && oiI1II0IIOi02.I00000oOI.type() == Proxy.Type.HTTP) {
/* 120 */                       I0000O(i, i2, i3);
/* 125 */                       if (this.I00000oOI == null) {
                                }
/* 136 */                       oiI1II0IIOi0 = this.I00000oIO;
/* 142 */                       if (oiI1II0IIOi0.I00000oIO.I0000Il00O == null && oiI1II0IIOi0.I00000oOI.type() == Proxy.Type.HTTP && this.I00000oOI == null) {
/* 171 */                           throw new OiI1Ii(new ProtocolException("Too many tunnel connections attempted: 21"));
                                }
/* 176 */                       this.I00100l0 = System.nanoTime();
/* 178 */                       return;
                            }
/* 130 */                   I0000Il00O(i, i2);
/* 133 */                   I0000oI00(iOloiOI1);
/* 136 */                   oiI1II0IIOi0 = this.I00000oIO;
/* 142 */                   if (oiI1II0IIOi0.I00000oIO.I0000Il00O == null) {
                            }
/* 176 */                   this.I00100l0 = System.nanoTime();
/* 178 */                   return;
                        } catch (IOException e) {
/* 179 */                   Socket socket = this.I0000Il00O;
/* 181 */                   if (socket != null) {
/* 183 */                       OollIoI001lo.I0000oI00(socket);
                            }
/* 186 */                   Socket socket2 = this.I00000oOI;
/* 188 */                   if (socket2 != null) {
/* 190 */                       OollIoI001lo.I0000oI00(socket2);
                            }
/* 193 */                   this.I0000Il00O = null;
/* 195 */                   this.I00000oOI = null;
/* 197 */                   this.I000II = null;
/* 199 */                   this.I000O01llI0 = null;
/* 201 */                   this.I0000O = null;
/* 203 */                   this.I0000oI00 = null;
/* 205 */                   this.I0001Ioi1lo = null;
/* 207 */                   this.I000o00OoI0I = 1;
/* 209 */                   if (oiI1Ii == null) {
/* 213 */                       oiI1Ii = new OiI1Ii(e);
                            } else {
/* 219 */                       ilIilolOlIoO.I00000oIO(oiI1Ii.I00iOIl, e);
/* 222 */                       oiI1Ii.I00iiI = e;
                            }
/* 224 */                   if (!z) {
/* 262 */                       throw oiI1Ii;
                            }
/* 226 */                   iOloiOI1.I0000Il00O = true;
/* 230 */                   if (!iOloiOI1.I00000oOI) {
/* 262 */                       throw oiI1Ii;
                            }
/* 234 */                   if (e instanceof ProtocolException) {
/* 262 */                       throw oiI1Ii;
                            }
/* 238 */                   if (e instanceof InterruptedIOException) {
/* 262 */                       throw oiI1Ii;
                            }
/* 242 */                   if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
/* 262 */                       throw oiI1Ii;
                            }
/* 254 */                   if (e instanceof SSLPeerUnverifiedException) {
/* 262 */                       throw oiI1Ii;
                            }
                        }
/* 258 */           } while (e instanceof SSLException);
/* 262 */           throw oiI1Ii;
                }

                public final void I0000Il00O(int i, int i2) throws IOException {
/* 1 */             OiI1II0IIOi0 oiI1II0IIOi0 = this.I00000oIO;
/* 3 */             Proxy proxy = oiI1II0IIOi0.I00000oOI;
/* 5 */             I0OI0o0lO i0OI0o0lO = oiI1II0IIOi0.I00000oIO;
/* 7 */             Proxy.Type type = proxy.type();
/* 21 */            int i3 = type == null ? -1 : OOll0iII0.I00000oIO[type.ordinal()];
/* 37 */            Socket socketCreateSocket = (i3 == 1 || i3 == 2) ? i0OI0o0lO.I00000oOI.createSocket() : new Socket(proxy);
/* 41 */            this.I00000oOI = socketCreateSocket;
/* 43 */            socketCreateSocket.setSoTimeout(i2);
                    try {
/* 46 */                OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 48 */                OO1I1IllO oO1I1IllO2 = OO1I1IllO.I00000oIO;
/* 52 */                InetSocketAddress inetSocketAddress = this.I00000oIO.I0000Il00O;
/* 54 */                oO1I1IllO2.getClass();
/* 57 */                socketCreateSocket.connect(inetSocketAddress, i);
                        try {
/* 62 */                    Ol1oloO1llI ol1oloO1llI = new Ol1oloO1llI(socketCreateSocket);
/* 71 */                    I1Ool00Il i1Ool00Il = new I1Ool00Il(socketCreateSocket.getInputStream(), ol1oloO1llI);
/* 76 */                    I1Ool00Il i1Ool00Il2 = new I1Ool00Il();
/* 79 */                    i1Ool00Il2.I00iiI = ol1oloO1llI;
/* 81 */                    i1Ool00Il2.I00iiO = i1Ool00Il;
/* 83 */                    VarHandle.storeStoreFence();
/* 91 */                    this.I000II = new OOliO0(i1Ool00Il2);
/* 95 */                    Ol1oloO1llI ol1oloO1llI2 = new Ol1oloO1llI(socketCreateSocket);
/* 104 */                   I1Ooio i1Ooio = new I1Ooio(socketCreateSocket.getOutputStream(), ol1oloO1llI2);
/* 109 */                   I1Ooio i1Ooio2 = new I1Ooio();
/* 112 */                   i1Ooio2.I00iiI = ol1oloO1llI2;
/* 114 */                   i1Ooio2.I00iiO = i1Ooio;
/* 116 */                   VarHandle.storeStoreFence();
/* 123 */                   this.I000O01llI0 = l1l0I1OIOIO1.I00000oIO(i1Ooio2);
                        } catch (NullPointerException e) {
/* 137 */                   if (O0000Ioio00.I0000O(e.getMessage(), "throw with null exception")) {
/* 145 */                       throw new IOException(e);
                            }
                        }
                    } catch (ConnectException e2) {
/* 167 */               ConnectException connectException = new ConnectException("Failed to connect to " + this.I00000oIO.I0000Il00O);
/* 170 */               connectException.initCause(e2);
/* 551 */               throw connectException;
                    }
                }

                public final void I0000O(int i, int i2, int i3) throws IOException {
/* 5 */             I1ii1o0 i1ii1o0 = new I1ii1o0(14);
/* 10 */            I0OI0o0lO i0OI0o0lO = this.I00000oIO.I00000oIO;
/* 14 */            i1ii1o0.I00iiI = i0OI0o0lO.I000O01llI0;
/* 19 */            i1ii1o0.I00Io1lO("CONNECT", null);
/* 35 */            ((Io1IlO1I1i) i1ii1o0.I00iio).I0000oI00("Host", OollIoI001lo.I001IO000(i0OI0o0lO.I000O01llI0, true));
/* 46 */            ((Io1IlO1I1i) i1ii1o0.I00iio).I0000oI00("Proxy-Connection", "Keep-Alive");
/* 57 */            ((Io1IlO1I1i) i1ii1o0.I00iio).I0000oI00("User-Agent", "okhttp/4.12.0");
/* 60 */            I0Oi111ii i0Oi111iiI00100o1O0lo = i1ii1o0.I00100o1O0lo();
/* 66 */            Oi10001 oi10001 = new Oi10001();
/* 69 */            oi10001.I00000oIO = i0Oi111iiI00100o1O0lo;
/* 73 */            oi10001.I00000oOI = OOiIO0oi.HTTP_1_1;
/* 77 */            oi10001.I0000Il00O = 407;
/* 81 */            oi10001.I0000O = "Preemptive Authenticate";
/* 85 */            oi10001.I000II = OollIoI001lo.I0000Il00O;
/* 89 */            oi10001.I000iOII = -1L;
/* 91 */            oi10001.I000l1 = -1L;
/* 99 */            oi10001.I0001Ioi1lo.I0000oI00("Proxy-Authenticate", "OkHttp-Preemptive");
/* 102 */           oi10001.I00000oIO();
/* 107 */           i0OI0o0lO.I0001Ioi1lo.getClass();
/* 112 */           IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111iiI00100o1O0lo.I00iiI;
/* 114 */           I0000Il00O(i, i2);
/* 136 */           String str = "CONNECT " + OollIoI001lo.I001IO000(ioOi01OlIl1o, true) + " HTTP/1.1";
/* 140 */           OOliO0 oOliO0 = this.I000II;
/* 142 */           OOliIlo01o oOliIlo01o = this.I000O01llI0;
/* 146 */           I11l01l i11l01l = new I11l01l(null, this, oOliO0, oOliIlo01o);
/* 156 */           oOliO0.I00iOIl.timeout().I000II(i2);
/* 166 */           oOliIlo01o.I00iOIl.timeout().I000II(i3);
/* 173 */           i11l01l.I00O0i0ii((Io1Io0OOi011) i0Oi111iiI00100o1O0lo.I00iio, str);
/* 176 */           i11l01l.I00000oOI();
/* 180 */           Oi10001 oi10001I0000oI00 = i11l01l.I0000oI00(false);
/* 184 */           oi10001I0000oI00.I00000oIO = i0Oi111iiI00100o1O0lo;
/* 186 */           Oi1001l0Il oi1001l0IlI00000oIO = oi10001I0000oI00.I00000oIO();
/* 190 */           int i4 = oi1001l0IlI00000oIO.I00iio;
/* 192 */           long jI000OiO = OollIoI001lo.I000OiO(oi1001l0IlI00000oIO);
/* 198 */           if (jI000OiO != -1) {
/* 201 */               IoIIoloIoOI0 ioIIoloIoOI0I001lloI = i11l01l.I001lloI(jI000OiO);
/* 208 */               OollIoI001lo.I00111O(ioIIoloIoOI0I001lloI, Integer.MAX_VALUE);
/* 211 */               ioIIoloIoOI0I001lloI.close();
                    }
/* 216 */           if (i4 == 200) {
/* 247 */               if (oOliO0.I00iiI.I00II0Ol1O0l() && oOliIlo01o.I00iiI.I00II0Ol1O0l()) {
/* 257 */                   return;
                        }
/* 260 */               IioIoO10iOiI.I000OOo1O("TLS tunnel buffered too many bytes!");
/* 2160 */              return;
                    }
/* 218 */           if (i4 != 407) {
/* 237 */               IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(i4, "Unexpected response code for CONNECT: "));
                    } else {
/* 222 */               i0OI0o0lO.I0001Ioi1lo.getClass();
/* 227 */               IioIoO10iOiI.I000OOo1O("Failed to authenticate with proxy");
                    }
                }

                public final void I0000oI00(IOloiOI1 iOloiOI1) throws Throwable {
                    SSLSocket sSLSocket;
/* 1 */             OOiIO0oi oOiIO0oi = OOiIO0oi.HTTP_2;
/* 3 */             OOiIO0oi oOiIO0oi2 = OOiIO0oi.HTTP_1_1;
/* 5 */             OOiIO0oi oOiIO0oi3 = OOiIO0oi.H2_PRIOR_KNOWLEDGE;
/* 9 */             I0OI0o0lO i0OI0o0lO = this.I00000oIO.I00000oIO;
/* 11 */            SSLSocketFactory sSLSocketFactory = i0OI0o0lO.I0000Il00O;
/* 13 */            if (sSLSocketFactory == null) {
/* 17 */                boolean zContains = i0OI0o0lO.I000OOo1O.contains(oOiIO0oi3);
/* 21 */                Socket socket = this.I00000oOI;
/* 23 */                if (!zContains) {
/* 33 */                    this.I0000Il00O = socket;
/* 35 */                    this.I0000oI00 = oOiIO0oi2;
/* 37 */                    return;
                        } else {
/* 25 */                    this.I0000Il00O = socket;
/* 27 */                    this.I0000oI00 = oOiIO0oi3;
/* 29 */                    I000OiO();
/* 32 */                    return;
                        }
                    }
/* 42 */            SSLSocket sSLSocket2 = null;
/* 42 */            String strI0000O = null;
                    try {
/* 43 */                Socket socket2 = this.I00000oOI;
/* 45 */                IoOi01OlIl1o ioOi01OlIl1o = i0OI0o0lO.I000O01llI0;
/* 56 */                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket2, ioOi01OlIl1o.I0000O, ioOi01OlIl1o.I0000oI00, true);
                    } catch (Throwable th) {
/* 465 */               th = th;
                    }
                    try {
/* 58 */                IOloi0IiI iOloi0IiII00000oIO = iOloiOI1.I00000oIO(sSLSocket);
/* 64 */                if (iOloi0IiII00000oIO.I00000oOI) {
/* 66 */                    OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 76 */                    OO1I1IllO.I00000oIO.I0000Il00O(sSLSocket, i0OI0o0lO.I000O01llI0.I0000O, i0OI0o0lO.I000OOo1O);
                        }
/* 84 */                sSLSocket.startHandshake();
/* 87 */                SSLSession session = sSLSocket.getSession();
/* 91 */                Io11ol io11olI00000oIO = illO1lIo.I00000oIO(session);
/* 105 */               if (!i0OI0o0lO.I0000O.verify(i0OI0o0lO.I000O01llI0.I0000O, session)) {
/* 107 */                   List listI00000oIO = io11olI00000oIO.I00000oIO();
/* 118 */                   if (listI00000oIO.isEmpty()) {
/* 240 */                       throw new SSLPeerUnverifiedException("Hostname " + i0OI0o0lO.I000O01llI0.I0000O + " not verified (no certificates)");
                            }
/* 125 */                   X509Certificate x509Certificate = (X509Certificate) listI00000oIO.get(0);
/* 131 */                   StringBuilder sb = new StringBuilder("\n              |Hostname ");
/* 138 */                   sb.append(i0OI0o0lO.I000O01llI0.I0000O);
/* 143 */                   sb.append(" not verified:\n              |    certificate: ");
/* 146 */                   IO0lll0O iO0lll0O = IO0lll0O.I0000Il00O;
/* 152 */                   sb.append(iOl1OO.I00000oIO(x509Certificate));
/* 157 */                   sb.append("\n              |    DN: ");
/* 168 */                   sb.append(x509Certificate.getSubjectDN().getName());
/* 173 */                   sb.append("\n              |    subjectAltNames: ");
/* 194 */                   sb.append(IOOi0Ool1i.I00O10llo(OIOllO.I00000oIO(x509Certificate, 7), OIOllO.I00000oIO(x509Certificate, 2)));
/* 199 */                   sb.append("\n              ");
/* 213 */                   throw new SSLPeerUnverifiedException(OlOoOOooiIll.I0000O(sb.toString()));
                        }
/* 241 */               IO0lll0O iO0lll0O2 = i0OI0o0lO.I0000oI00;
/* 259 */               this.I0000O = new Io11ol(io11olI00000oIO.I00000oIO, io11olI00000oIO.I00000oOI, io11olI00000oIO.I0000Il00O, new OOll0lI0I0(iO0lll0O2, io11olI00000oIO, i0OI0o0lO));
/* 263 */               String str = i0OI0o0lO.I000O01llI0.I0000O;
/* 269 */               Iterator it = iO0lll0O2.I00000oIO.iterator();
/* 277 */               if (it.hasNext()) {
/* 456 */                   it.next().getClass();
/* 464 */                   throw new ClassCastException();
                        }
/* 281 */               if (iOloi0IiII00000oIO.I00000oOI) {
/* 283 */                   OO1I1IllO oO1I1IllO2 = OO1I1IllO.I00000oIO;
/* 287 */                   strI0000O = OO1I1IllO.I00000oIO.I0000O(sSLSocket);
                        }
/* 291 */               this.I0000Il00O = sSLSocket;
/* 295 */               Ol1oloO1llI ol1oloO1llI = new Ol1oloO1llI(sSLSocket);
/* 304 */               I1Ool00Il i1Ool00Il = new I1Ool00Il(sSLSocket.getInputStream(), ol1oloO1llI);
/* 309 */               I1Ool00Il i1Ool00Il2 = new I1Ool00Il();
/* 312 */               i1Ool00Il2.I00iiI = ol1oloO1llI;
/* 314 */               i1Ool00Il2.I00iiO = i1Ool00Il;
/* 316 */               VarHandle.storeStoreFence();
/* 324 */               this.I000II = new OOliO0(i1Ool00Il2);
/* 328 */               Ol1oloO1llI ol1oloO1llI2 = new Ol1oloO1llI(sSLSocket);
/* 337 */               I1Ooio i1Ooio = new I1Ooio(sSLSocket.getOutputStream(), ol1oloO1llI2);
/* 342 */               I1Ooio i1Ooio2 = new I1Ooio();
/* 345 */               i1Ooio2.I00iiI = ol1oloO1llI2;
/* 347 */               i1Ooio2.I00iiO = i1Ooio;
/* 349 */               VarHandle.storeStoreFence();
/* 356 */               this.I000O01llI0 = l1l0I1OIOIO1.I00000oIO(i1Ooio2);
/* 358 */               if (strI0000O != null) {
/* 360 */                   OOiIO0oi oOiIO0oi4 = OOiIO0oi.HTTP_1_0;
/* 368 */                   if (strI0000O.equals("http/1.0")) {
/* 370 */                       oOiIO0oi2 = oOiIO0oi4;
                            } else if (!strI0000O.equals("http/1.1")) {
/* 387 */                       if (strI0000O.equals("h2_prior_knowledge")) {
/* 389 */                           oOiIO0oi2 = oOiIO0oi3;
                                } else if (strI0000O.equals("h2")) {
/* 399 */                           oOiIO0oi2 = oOiIO0oi;
                                } else {
/* 401 */                           oOiIO0oi2 = OOiIO0oi.SPDY_3;
/* 409 */                           if (!strI0000O.equals("spdy/3.1")) {
/* 412 */                               oOiIO0oi2 = OOiIO0oi.QUIC;
/* 420 */                               if (!strI0000O.equals("quic")) {
/* 434 */                                   throw new IOException("Unexpected protocol: ".concat(strI0000O));
                                        }
                                    }
                                }
                            }
                        }
/* 435 */               this.I0000oI00 = oOiIO0oi2;
/* 437 */               OO1I1IllO oO1I1IllO3 = OO1I1IllO.I00000oIO;
/* 441 */               OO1I1IllO.I00000oIO.I00000oIO(sSLSocket);
/* 446 */               if (this.I0000oI00 == oOiIO0oi) {
/* 448 */                   I000OiO();
                        }
                    } catch (Throwable th2) {
/* 80 */                th = th2;
/* 81 */                sSLSocket2 = sSLSocket;
/* 466 */               if (sSLSocket2 != null) {
/* 468 */                   OO1I1IllO oO1I1IllO4 = OO1I1IllO.I00000oIO;
/* 472 */                   OO1I1IllO.I00000oIO.I00000oIO(sSLSocket2);
                        }
/* 475 */               if (sSLSocket2 != null) {
/* 477 */                   OollIoI001lo.I0000oI00(sSLSocket2);
                        }
/* 966 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:56:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0001Ioi1lo(I0OI0o0lO i0OI0o0lO, List list) {
                    Io11ol io11ol;
/* 1 */             OiI1II0IIOi0 oiI1II0IIOi0 = this.I00000oIO;
/* 3 */             I0OI0o0lO i0OI0o0lO2 = oiI1II0IIOi0.I00000oIO;
/* 5 */             IoOi01OlIl1o ioOi01OlIl1o = i0OI0o0lO.I000O01llI0;
/* 7 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 18 */            if (this.I000oI1ioi.size() < this.I000o00OoI0I && !this.I000OOo1O && i0OI0o0lO2.I00000oIO(i0OI0o0lO)) {
/* 44 */                if (O0000Ioio00.I0000O(ioOi01OlIl1o.I0000O, i0OI0o0lO2.I000O01llI0.I0000O)) {
/* 200 */                   return true;
                        }
/* 50 */                if (this.I0001Ioi1lo != null && list != null) {
/* 56 */                    List list2 = list;
/* 60 */                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 73 */                        Iterator it = list2.iterator();
                                while (true) {
/* 81 */                            if (!it.hasNext()) {
                                        break;
                                    }
/* 87 */                            OiI1II0IIOi0 oiI1II0IIOi02 = (OiI1II0IIOi0) it.next();
/* 91 */                            Proxy.Type type = oiI1II0IIOi02.I00000oOI.type();
/* 95 */                            Proxy.Type type2 = Proxy.Type.DIRECT;
/* 97 */                            if (type == type2 && oiI1II0IIOi0.I00000oOI.type() == type2 && oiI1II0IIOi0.I0000Il00O.equals(oiI1II0IIOi02.I0000Il00O)) {
/* 121 */                               if (i0OI0o0lO.I0000O == OIOllO.I00000oIO) {
/* 124 */                                   byte[] bArr2 = OollIoI001lo.I00000oIO;
/* 126 */                                   IoOi01OlIl1o ioOi01OlIl1o2 = i0OI0o0lO2.I000O01llI0;
/* 128 */                                   int i = ioOi01OlIl1o.I0000oI00;
/* 130 */                                   String str = ioOi01OlIl1o.I0000O;
/* 134 */                                   if (i == ioOi01OlIl1o2.I0000oI00) {
/* 143 */                                       if (!O0000Ioio00.I0000O(str, ioOi01OlIl1o2.I0000O)) {
/* 148 */                                           if (!this.I000OiO && (io11ol = this.I0000O) != null) {
/* 154 */                                               List listI00000oIO = io11ol.I00000oIO();
/* 165 */                                               if (!listI00000oIO.isEmpty() && OIOllO.I0000Il00O(str, (X509Certificate) listI00000oIO.get(0))) {
                                                            try {
/* 179 */                                                       IO0lll0O iO0lll0O = i0OI0o0lO.I0000oI00;
/* 183 */                                                       this.I0000O.I00000oIO();
/* 190 */                                                       Iterator it2 = iO0lll0O.I00000oIO.iterator();
/* 198 */                                                       if (!it2.hasNext()) {
/* 200 */                                                           return true;
                                                                }
/* 206 */                                                       it2.next().getClass();
/* 214 */                                                       throw new ClassCastException();
                                                            } catch (SSLPeerUnverifiedException unused) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 17 */            return false;
                }

                public final boolean I000II(boolean z) throws SocketException {
                    long j;
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 3 */             long jNanoTime = System.nanoTime();
/* 7 */             Socket socket = this.I00000oOI;
/* 9 */             Socket socket2 = this.I0000Il00O;
/* 11 */            OOliO0 oOliO0 = this.I000II;
/* 18 */            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
/* 17 */                return false;
                    }
/* 39 */            IoIOii01O ioIOii01O = this.I0001Ioi1lo;
/* 42 */            if (ioIOii01O != null) {
                        synchronized (ioIOii01O) {
/* 47 */                    if (ioIOii01O.I00ilO0) {
/* 17 */                        return false;
                            }
/* 57 */                    if (ioIOii01O.I00lll10 < ioIOii01O.I00lli11) {
/* 63 */                        if (jNanoTime >= ioIOii01O.I00o0iI0io1) {
/* 17 */                            return false;
                                }
                            }
/* 41 */                    return true;
                        }
                    }
                    synchronized (this) {
/* 76 */                j = jNanoTime - this.I00100l0;
                    }
/* 85 */            if (j < 10000000000L || !z) {
/* 41 */                return true;
                    }
                    try {
/* 89 */                int soTimeout = socket2.getSoTimeout();
                        try {
/* 93 */                    socket2.setSoTimeout(1);
/* 100 */                   return !oOliO0.I00II0Ol1O0l();
                        } finally {
/* 106 */                   socket2.setSoTimeout(soTimeout);
                        }
                    } catch (SocketTimeoutException unused) {
/* 41 */                return true;
                    } catch (IOException unused2) {
/* 17 */                return false;
                    }
                }

                public final Il111ol I000O01llI0(OIOlo0OloOi oIOlo0OloOi, OOlli0I oOlli0I) throws SocketException {
/* 1 */             int i = oOlli0I.I000II;
/* 3 */             Socket socket = this.I0000Il00O;
/* 5 */             OOliO0 oOliO0 = this.I000II;
/* 7 */             OOliIlo01o oOliIlo01o = this.I000O01llI0;
/* 9 */             IoIOii01O ioIOii01O = this.I0001Ioi1lo;
/* 11 */            if (ioIOii01O == null) {
/* 43 */                socket.setSoTimeout(i);
/* 53 */                oOliO0.I00iOIl.timeout().I000II(i);
/* 65 */                oOliIlo01o.I00iOIl.timeout().I000II(oOlli0I.I000O01llI0);
/* 70 */                return new I11l01l(oIOlo0OloOi, this, oOliO0, oOliIlo01o);
                    }
/* 15 */            IoIOil110oOl ioIOil110oOl = new IoIOil110oOl();
/* 18 */            ioIOil110oOl.I00000oIO = this;
/* 20 */            ioIOil110oOl.I00000oOI = oOlli0I;
/* 22 */            ioIOil110oOl.I0000Il00O = ioIOii01O;
/* 24 */            List list = oIOlo0OloOi.I00o101lO;
/* 26 */            OOiIO0oi oOiIO0oi = OOiIO0oi.H2_PRIOR_KNOWLEDGE;
/* 32 */            if (!list.contains(oOiIO0oi)) {
/* 35 */                oOiIO0oi = OOiIO0oi.HTTP_2;
                    }
/* 37 */            ioIOil110oOl.I0000oI00 = oOiIO0oi;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            return ioIOil110oOl;
                }

                public final synchronized void I000OOo1O() {
/* 3 */             this.I000OOo1O = true;
                }

                public final void I000OiO() throws SocketException {
                    int i;
/* 3 */             Socket socket = this.I0000Il00O;
/* 5 */             OOliO0 oOliO0 = this.I000II;
/* 7 */             OOliIlo01o oOliIlo01o = this.I000O01llI0;
/* 10 */            socket.setSoTimeout(0);
/* 13 */            OloO0oOI1lI oloO0oOI1lI = OloO0oOI1lI.I000O01llI0;
/* 15 */            o0llIi o0llii = o0llIi.I00ilO0;
/* 43 */            String str = OollIoI001lo.I000II + ' ' + this.I00000oIO.I00000oIO.I000O01llI0.I0000O;
/* 49 */            IoIOii01O ioIOii01O = new IoIOii01O();
/* 52 */            ioIOii01O.I00iOIl = this;
/* 59 */            ioIOii01O.I00iiI = new LinkedHashMap();
/* 61 */            ioIOii01O.I00iiO = str;
/* 64 */            ioIOii01O.I00ilI0I1 = 3;
/* 66 */            ioIOii01O.I00io1l = oloO0oOI1lI;
/* 72 */            ioIOii01O.I00ioIO = oloO0oOI1lI.I0000O();
/* 78 */            ioIOii01O.I00l0I0l0lO1 = oloO0oOI1lI.I0000O();
/* 84 */            ioIOii01O.I00l0OO0IO = oloO0oOI1lI.I0000O();
/* 86 */            ioIOii01O.I00li1OI = o0llii;
/* 90 */            Oio10I11IIi oio10I11IIi = new Oio10I11IIi();
/* 96 */            oio10I11IIi.I00000oOI(7, 16777216);
/* 99 */            ioIOii01O.I00o0l1o1o0 = oio10I11IIi;
/* 101 */           Oio10I11IIi oio10I11IIi2 = IoIOii01O.I00oliIiO01i;
/* 103 */           ioIOii01O.I00o101lO = oio10I11IIi2;
/* 110 */           ioIOii01O.I00oO101o = oio10I11IIi2.I00000oIO();
/* 112 */           ioIOii01O.I00oOio10iI1 = socket;
/* 116 */           IoIiIIOI ioIiIIOI = new IoIiIIOI();
/* 119 */           ioIiIIOI.I00iOIl = oOliIlo01o;
/* 123 */           III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 126 */           ioIiIIOI.I00iiI = iII1o0lOio0;
/* 130 */           ioIiIIOI.I00iiO = 16384;
/* 134 */           IoIIIIi ioIIIIi = new IoIIIIi();
/* 137 */           ioIIIIi.I00000oIO = iII1o0lOio0;
/* 142 */           ioIIIIi.I00000oOI = Integer.MAX_VALUE;
/* 146 */           ioIIIIi.I0000O = Barcode.FORMAT_AZTEC;
/* 152 */           ioIIIIi.I0000oI00 = new Io1IiiI11[8];
/* 154 */           ioIIIIi.I0001Ioi1lo = 7;
/* 156 */           VarHandle.storeStoreFence();
/* 159 */           ioIiIIOI.I00ilI0I1 = ioIIIIi;
/* 161 */           VarHandle.storeStoreFence();
/* 164 */           ioIOii01O.I00ol1 = ioIiIIOI;
/* 170 */           IoIOl1 ioIOl1 = new IoIOl1();
/* 173 */           ioIOl1.I00iOIl = oOliO0;
/* 177 */           IoIOl0o0lo0 ioIOl0o0lo0 = new IoIOl0o0lo0();
/* 180 */           ioIOl0o0lo0.I00iOIl = oOliO0;
/* 182 */           VarHandle.storeStoreFence();
/* 185 */           ioIOl1.I00iiI = ioIOl0o0lo0;
/* 189 */           IoII1OIO1lI ioII1OIO1lI = new IoII1OIO1lI();
/* 192 */           ioII1OIO1lI.I00000oIO = Barcode.FORMAT_AZTEC;
/* 199 */           ioII1OIO1lI.I00000oOI = new ArrayList();
/* 206 */           ioII1OIO1lI.I0000Il00O = new OOliO0(ioIOl0o0lo0);
/* 210 */           ioII1OIO1lI.I0000O = new Io1IiiI11[8];
/* 212 */           ioII1OIO1lI.I0000oI00 = 7;
/* 214 */           VarHandle.storeStoreFence();
/* 217 */           ioIOl1.I00iiO = ioII1OIO1lI;
/* 219 */           VarHandle.storeStoreFence();
/* 224 */           I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(14);
/* 227 */           i01illiil1Oo.I00iiI = ioIOii01O;
/* 229 */           i01illiil1Oo.I00iiO = ioIOl1;
/* 231 */           VarHandle.storeStoreFence();
/* 234 */           ioIOii01O.I00olI = i01illiil1Oo;
/* 241 */           ioIOii01O.I00oli = new LinkedHashSet();
/* 243 */           VarHandle.storeStoreFence();
/* 246 */           this.I0001Ioi1lo = ioIOii01O;
/* 259 */           this.I000o00OoI0I = (oio10I11IIi2.I00000oIO & 16) != 0 ? oio10I11IIi2.I00000oOI[4] : Integer.MAX_VALUE;
                    synchronized (ioIiIIOI) {
                        try {
/* 266 */                   if (ioIiIIOI.I00iio) {
/* 505 */                       throw new IOException("closed");
                            }
/* 268 */                   Logger logger = IoIiIIOI.I00ilO0;
/* 276 */                   if (logger.isLoggable(Level.FINE)) {
/* 302 */                       logger.fine(OollIoI001lo.I000O01llI0(">> CONNECTION " + IoIO101IlO.I00000oIO.I0000Il00O(), new Object[0]));
                            }
/* 309 */                   IIOIIi1ilIO iIOIIi1ilIO = IoIO101IlO.I00000oIO;
/* 313 */                   if (oOliIlo01o.I00iiO) {
/* 497 */                       throw new IllegalStateException("closed");
                            }
/* 317 */                   oOliIlo01o.I00iiI.I00l0I0l0lO1(iIOIIi1ilIO);
/* 320 */                   oOliIlo01o.I00000oIO();
/* 323 */                   oOliIlo01o.flush();
                        } finally {
                        }
                    }
                    synchronized (ioIiIIOI) {
                        try {
/* 330 */                   if (ioIiIIOI.I00iio) {
/* 487 */                       throw new IOException("closed");
                            }
/* 340 */                   ioIiIIOI.I000II(0, Integer.bitCount(oio10I11IIi.I00000oIO) * 6, 4, 0);
/* 343 */                   int i2 = 0;
                            while (true) {
/* 346 */                       i = 2;
/* 347 */                       if (i2 < 10) {
/* 349 */                           boolean z = true;
/* 355 */                           if (((1 << i2) & oio10I11IIi.I00000oIO) == 0) {
/* 358 */                               z = false;
                                    }
/* 359 */                           if (z) {
/* 369 */                               int i3 = i2 != 4 ? i2 != 7 ? i2 : 4 : 3;
/* 370 */                               OOliIlo01o oOliIlo01o2 = ioIiIIOI.I00iOIl;
/* 374 */                               if (oOliIlo01o2.I00iiO) {
/* 433 */                                   throw new IllegalStateException("closed");
                                        }
/* 376 */                               III1o0lOio0 iII1o0lOio02 = oOliIlo01o2.I00iiI;
/* 378 */                               Oii1OOIOo oii1OOIOoI00iiI = iII1o0lOio02.I00iiI(2);
/* 382 */                               byte[] bArr = oii1OOIOoI00iiI.I00000oIO;
/* 384 */                               int i4 = oii1OOIOoI00iiI.I0000Il00O;
/* 393 */                               bArr[i4] = (byte) ((i3 >>> 8) & 255);
/* 400 */                               bArr[i4 + 1] = (byte) (i3 & 255);
/* 402 */                               oii1OOIOoI00iiI.I0000Il00O = i4 + 2;
                                        iII1o0lOio02.I00iiI += 2;
/* 411 */                               oOliIlo01o2.I00000oIO();
/* 420 */                               ioIiIIOI.I00iOIl.I000II(oio10I11IIi.I00000oOI[i2]);
                                    }
/* 434 */                           i2++;
                                } else {
/* 439 */                           ioIiIIOI.I00iOIl.flush();
                                }
                            }
                        } finally {
                        }
                    }
/* 452 */           if (ioIOii01O.I00o0l1o1o0.I00000oIO() != 65535) {
/* 458 */               ioIOii01O.I00ol1.I001l0I00(0, r0 - 65535);
                    }
/* 476 */           oloO0oOI1lI.I0000O().I0000Il00O(new IoIOOii1OOi(ioIOii01O.I00iiO, i, ioIOii01O.I00olI), 0L);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Connection{");
/* 8 */             OiI1II0IIOi0 oiI1II0IIOi0 = this.I00000oIO;
/* 10 */            I0OI0o0lO i0OI0o0lO = oiI1II0IIOi0.I00000oIO;
/* 16 */            sb.append(i0OI0o0lO.I000O01llI0.I0000O);
/* 21 */            sb.append(':');
/* 28 */            sb.append(i0OI0o0lO.I000O01llI0.I0000oI00);
/* 33 */            sb.append(", proxy=");
/* 38 */            sb.append(oiI1II0IIOi0.I00000oOI);
/* 43 */            sb.append(" hostAddress=");
/* 48 */            sb.append(oiI1II0IIOi0.I0000Il00O);
/* 53 */            sb.append(" cipherSuite=");
/* 56 */            Io11ol io11ol = this.I0000O;
/* 65 */            sb.append(io11ol != null ? io11ol.I00000oOI : "none");
/* 70 */            sb.append(" protocol=");
/* 75 */            sb.append(this.I0000oI00);
/* 80 */            sb.append('}');
/* 83 */            return sb.toString();
                }
            }

            package p000;

            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.invoke.VarHandle;
            import java.net.ProtocolException;
            import java.net.Proxy;
            import java.net.ProxySelector;
            import java.net.SocketTimeoutException;
            import java.security.cert.CertificateException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.regex.Pattern;
            import javax.net.SocketFactory;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLHandshakeException;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.SSLSocketFactory;
            
            public final class II1ooii11i implements IooilIO1I {
                public final int I00000oIO;
                public Object I00000oOI;

                public II1ooii11i(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static int I0000O(Oi1001l0Il oi1001l0Il, int i) {
/* 5 */             String strI00000oOI = oi1001l0Il.I00ilO0.I00000oOI("Retry-After");
/* 9 */             if (strI00000oOI == null) {
/* 11 */                strI00000oOI = null;
                    }
/* 12 */            if (strI00000oOI == null) {
/* 14 */                return i;
                    }
/* 29 */            if (Pattern.compile("\\d+").matcher(strI00000oOI).matches()) {
/* 35 */                return Integer.valueOf(strI00000oOI).intValue();
                    }
/* 40 */            return Integer.MAX_VALUE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
                
                    return null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
                
                    p000.I000II.I0010I0i(p000.Oi010OO0.I000oI1ioi(r12, "unexpected port: "));
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oi1001l0Il I00000oIO(OOlli0I oOlli0I) {
                    boolean z;
                    IoiOloi ioiOloi;
                    List list;
                    Oi1001l0Il oi1001l0Il;
                    int i;
                    IO0lll0O iO0lll0O;
                    SSLSocketFactory sSLSocketFactory;
                    HostnameVerifier hostnameVerifier;
                    switch (this.I00000oIO) {
                        case 0:
/* 511 */                   o0llIi o0llii = (o0llIi) this.I00000oOI;
/* 527 */                   I0Oi111ii i0Oi111ii = oOlli0I.I0000oI00;
/* 529 */                   I1ii1o0 i1ii1o0I00IlilI0i0i = i0Oi111ii.I00IlilI0i0i();
/* 535 */                   IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111ii.I00iiI;
/* 539 */                   Io1Io0OOi011 io1Io0OOi011 = (Io1Io0OOi011) i0Oi111ii.I00iio;
/* 543 */                   I00Ol00 i00Ol00 = (I00Ol00) i0Oi111ii.I00ilI0I1;
/* 551 */                   if (i00Ol00 != null) {
/* 555 */                       O1ii0l1iii o1ii0l1iii = (O1ii0l1iii) i00Ol00.I0000Il00O;
/* 557 */                       if (o1ii0l1iii != null) {
/* 561 */                           i1ii1o0I00IlilI0i0i.I00IOO("Content-Type", o1ii0l1iii.I00000oIO);
                                }
/* 564 */                       long j = i00Ol00.I00000oOI;
/* 569 */                       if (j != -1) {
/* 575 */                           i1ii1o0I00IlilI0i0i.I00IOO("Content-Length", String.valueOf(j));
/* 578 */                           i1ii1o0I00IlilI0i0i.I00Io1o110i("Transfer-Encoding");
                                } else {
/* 584 */                           i1ii1o0I00IlilI0i0i.I00IOO("Transfer-Encoding", "chunked");
/* 587 */                           i1ii1o0I00IlilI0i0i.I00Io1o110i("Content-Length");
                                }
                            }
/* 595 */                   if (io1Io0OOi011.I00000oOI("Host") == null) {
/* 601 */                       i1ii1o0I00IlilI0i0i.I00IOO("Host", OollIoI001lo.I001IO000(ioOi01OlIl1o, false));
                            }
/* 608 */                   if (io1Io0OOi011.I00000oOI("Connection") == null) {
/* 612 */                       i1ii1o0I00IlilI0i0i.I00IOO("Connection", "Keep-Alive");
                            }
/* 619 */                   if (io1Io0OOi011.I00000oOI("Accept-Encoding") == null && io1Io0OOi011.I00000oOI("Range") == null) {
/* 629 */                       i1ii1o0I00IlilI0i0i.I00IOO("Accept-Encoding", "gzip");
/* 632 */                       z = true;
                            } else {
/* 635 */                       z = false;
                            }
/* 637 */                   o0llii.getClass();
/* 644 */                   if (io1Io0OOi011.I00000oOI("User-Agent") == null) {
/* 648 */                       i1ii1o0I00IlilI0i0i.I00IOO("User-Agent", "okhttp/4.12.0");
                            }
/* 655 */                   Oi1001l0Il oi1001l0IlI00000oOI = oOlli0I.I00000oOI(i1ii1o0I00IlilI0i0i.I00100o1O0lo());
/* 659 */                   Io1Io0OOi011 io1Io0OOi0112 = oi1001l0IlI00000oOI.I00ilO0;
/* 663 */                   IoIoIiooolI1.I00000oOI(o0llii, ioOi01OlIl1o, io1Io0OOi0112);
/* 666 */                   Oi10001 oi10001I00000oIO = oi1001l0IlI00000oOI.I00000oIO();
/* 670 */                   oi10001I00000oIO.I00000oIO = i0Oi111ii;
/* 672 */                   if (z) {
/* 676 */                       String strI00000oOI = io1Io0OOi0112.I00000oOI("Content-Encoding");
/* 680 */                       if (strI00000oOI == null) {
/* 682 */                           strI00000oOI = null;
                                }
/* 687 */                       if ("gzip".equalsIgnoreCase(strI00000oOI) && IoIoIiooolI1.I00000oIO(oi1001l0IlI00000oOI) && (ioiOloi = oi1001l0IlI00000oOI.I00io1l) != null) {
/* 705 */                           Io11OiO1 io11OiO1 = new Io11OiO1(ioiOloi.I00iOIl());
/* 708 */                           Io1IlO1I1i io1IlO1I1iI000OOo1O = io1Io0OOi0112.I000OOo1O();
/* 712 */                           io1IlO1I1iI000OOo1O.I0000O("Content-Encoding");
/* 715 */                           io1IlO1I1iI000OOo1O.I0000O("Content-Length");
/* 726 */                           oi10001I00000oIO.I0001Ioi1lo = io1IlO1I1iI000OOo1O.I0000Il00O().I000OOo1O();
/* 728 */                           String strI00000oOI2 = io1Io0OOi0112.I00000oOI("Content-Type");
/* 749 */                           oi10001I00000oIO.I000II = new OOllioO00i1(strI00000oOI2 == null ? null : strI00000oOI2, -1L, new OOliO0(io11OiO1));
                                }
                            }
/* 751 */                   return oi10001I00000oIO.I00000oIO();
                        default:
/* 10 */                    I0Oi111ii i0Oi111ii2 = oOlli0I.I0000oI00;
/* 12 */                    OOlioiIOOO1 oOlioiIOOO1 = oOlli0I.I00000oIO;
/* 14 */                    List listI00OI1 = Il01100l.I00iOIl;
/* 17 */                    Oi1001l0Il oi1001l0Il2 = null;
/* 18 */                    int i2 = 0;
/* 19 */                    I0Oi111ii i0Oi111iiI00000oOI = i0Oi111ii2;
                            while (true) {
/* 20 */                        boolean z2 = true;
/* 23 */                        while (oOlioiIOOO1.I00l0I0l0lO1 == null) {
                                    synchronized (oOlioiIOOO1) {
                                        try {
/* 28 */                                    if (oOlioiIOOO1.I00li1OI) {
/* 492 */                                       throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                            }
/* 32 */                                    if (oOlioiIOOO1.I00l0OO0IO) {
/* 482 */                                       throw new IllegalStateException("Check failed.");
                                            }
                                        } catch (Throwable th) {
/* 494 */                                   throw th;
                                        }
                                    }
/* 35 */                            if (z2) {
/* 39 */                                IioiI0IIIIO iioiI0IIIIO = oOlioiIOOO1.I00iiO;
/* 43 */                                IoOi01OlIl1o ioOi01OlIl1o2 = (IoOi01OlIl1o) i0Oi111iiI00000oOI.I00iiI;
/* 45 */                                OIOlo0OloOi oIOlo0OloOi = oOlioiIOOO1.I00iOIl;
/* 49 */                                if (ioOi01OlIl1o2.I000OOo1O) {
/* 51 */                                    sSLSocketFactory = oIOlo0OloOi.I00o0iI0io1;
/* 53 */                                    if (sSLSocketFactory == null) {
/* 62 */                                        I000II.I001IO000("CLEARTEXT-only client");
                                                break;
                                            } else {
/* 55 */                                        hostnameVerifier = oIOlo0OloOi.I00oI0i;
/* 57 */                                        iO0lll0O = oIOlo0OloOi.I00oII;
                                            }
                                        } else {
/* 68 */                                    iO0lll0O = null;
/* 69 */                                    sSLSocketFactory = null;
/* 70 */                                    hostnameVerifier = null;
                                        }
/* 73 */                                String str = ioOi01OlIl1o2.I0000O;
/* 75 */                                int i3 = ioOi01OlIl1o2.I0000oI00;
/* 77 */                                list = listI00OI1;
/* 79 */                                i1O10l1io1iO i1o10l1io1io = oIOlo0OloOi.I00li1OI;
/* 81 */                                oi1001l0Il = oi1001l0Il2;
/* 83 */                                SocketFactory socketFactory = oIOlo0OloOi.I00lll10;
/* 85 */                                i = i2;
/* 87 */                                iOloo0O0O ioloo0o0o = oIOlo0OloOi.I00lli11;
/* 89 */                                List list2 = oIOlo0OloOi.I00o101lO;
/* 93 */                                List list3 = oIOlo0OloOi.I00o0l1o1o0;
/* 95 */                                ProxySelector proxySelector = oIOlo0OloOi.I00ll1;
/* 103 */                               I0OI0o0lO i0OI0o0lO = new I0OI0o0lO();
/* 106 */                               i0OI0o0lO.I00000oIO = i1o10l1io1io;
/* 108 */                               i0OI0o0lO.I00000oOI = socketFactory;
/* 110 */                               i0OI0o0lO.I0000Il00O = sSLSocketFactory;
/* 112 */                               i0OI0o0lO.I0000O = hostnameVerifier;
/* 114 */                               i0OI0o0lO.I0000oI00 = iO0lll0O;
/* 116 */                               i0OI0o0lO.I0001Ioi1lo = ioloo0o0o;
/* 118 */                               i0OI0o0lO.I000II = proxySelector;
/* 122 */                               IoOOloOOllIO ioOOloOOllIO = new IoOOloOOllIO();
/* 125 */                               String str2 = sSLSocketFactory != null ? "https" : "http";
/* 134 */                               if (!str2.equalsIgnoreCase("http")) {
/* 143 */                                   if (!str2.equalsIgnoreCase("https")) {
/* 234 */                                       I000II.I000iOII("unexpected scheme: ".concat(str2));
                                                break;
                                            } else {
/* 145 */                                       ioOOloOOllIO.I00000oIO = "https";
                                            }
                                        } else {
/* 136 */                                   ioOOloOOllIO.I00000oIO = "http";
                                        }
/* 153 */                               String strI00000oOI3 = iloo10Oil.I00000oOI(iOl0lOIi11.I000lI(0, 0, 7, str));
/* 157 */                               if (strI00000oOI3 == null) {
/* 223 */                                   I000II.I000iOII("unexpected host: ".concat(str));
                                            break;
                                        } else {
/* 159 */                                   ioOOloOOllIO.I0000O = strI00000oOI3;
/* 162 */                                   if (1 > i3 || i3 >= 65536) {
                                                break;
                                            } else {
/* 168 */                                       ioOOloOOllIO.I0000oI00 = i3;
/* 174 */                                       i0OI0o0lO.I000O01llI0 = ioOOloOOllIO.I00000oIO();
/* 180 */                                       i0OI0o0lO.I000OOo1O = OollIoI001lo.I001i1O0Ol(list2);
/* 186 */                                       i0OI0o0lO.I000OiO = OollIoI001lo.I001i1O0Ol(list3);
/* 188 */                                       VarHandle.storeStoreFence();
/* 191 */                                       Il11O1o il11O1o = new Il11O1o();
/* 194 */                                       il11O1o.I00000oIO = iioiI0IIIIO;
/* 196 */                                       il11O1o.I00000oOI = i0OI0o0lO;
/* 198 */                                       il11O1o.I0000Il00O = oOlioiIOOO1;
/* 200 */                                       VarHandle.storeStoreFence();
/* 203 */                                       oOlioiIOOO1.I00io1l = il11O1o;
                                            }
                                        }
                                    } else {
/* 239 */                               list = listI00OI1;
/* 241 */                               oi1001l0Il = oi1001l0Il2;
/* 243 */                               i = i2;
                                    }
                                    try {
/* 247 */                               if (oOlioiIOOO1.I00lli11) {
/* 470 */                                   throw new IOException("Canceled");
                                        }
                                        try {
/* 251 */                                   Oi1001l0Il oi1001l0IlI00000oOI2 = oOlli0I.I00000oOI(i0Oi111iiI00000oOI);
/* 255 */                                   if (oi1001l0Il != null) {
/* 257 */                                       Oi10001 oi10001I00000oIO2 = oi1001l0IlI00000oOI2.I00000oIO();
/* 261 */                                       Oi10001 oi10001I00000oIO3 = oi1001l0Il.I00000oIO();
/* 266 */                                       oi10001I00000oIO3.I000II = null;
/* 268 */                                       Oi1001l0Il oi1001l0IlI00000oIO = oi10001I00000oIO3.I00000oIO();
/* 274 */                                       if (oi1001l0IlI00000oIO.I00io1l != null) {
/* 295 */                                           throw new IllegalArgumentException("priorResponse.body != null");
                                                }
/* 276 */                                       oi10001I00000oIO2.I000OiO = oi1001l0IlI00000oIO;
/* 278 */                                       oi1001l0IlI00000oOI2 = oi10001I00000oIO2.I00000oIO();
                                            }
/* 282 */                                   oi1001l0Il2 = oi1001l0IlI00000oOI2;
/* 302 */                                   i0Oi111iiI00000oOI = I00000oOI(oi1001l0Il2, oOlioiIOOO1.I00l0I0l0lO1);
/* 306 */                                   if (i0Oi111iiI00000oOI == null) {
/* 309 */                                       oOlioiIOOO1.I0001Ioi1lo(false);
/* 312 */                                       return oi1001l0Il2;
                                            }
/* 315 */                                   IoiOloi ioiOloi2 = oi1001l0Il2.I00io1l;
/* 317 */                                   if (ioiOloi2 != null) {
/* 319 */                                       OollIoI001lo.I0000O(ioiOloi2);
                                            }
/* 322 */                                   i2 = i + 1;
/* 326 */                                   if (i2 > 20) {
/* 358 */                                       throw new ProtocolException("Too many follow-up requests: " + i2);
                                            }
/* 329 */                                   oOlioiIOOO1.I0001Ioi1lo(true);
/* 332 */                                   listI00OI1 = list;
                                        } catch (OiI1Ii e) {
/* 423 */                                   if (!I0000Il00O(e.I00iiI, oOlioiIOOO1, i0Oi111iiI00000oOI, false)) {
/* 440 */                                       IOException iOException = e.I00iOIl;
/* 442 */                                       Iterator it = list.iterator();
/* 450 */                                       while (it.hasNext()) {
/* 458 */                                           ilIilolOlIoO.I00000oIO(iOException, (Exception) it.next());
                                                }
/* 462 */                                       throw iOException;
                                            }
/* 431 */                                   listI00OI1 = IOOi0Ool1i.I00OI1(list, e.I00iOIl);
/* 436 */                                   oOlioiIOOO1.I0001Ioi1lo(true);
/* 384 */                                   oi1001l0Il2 = oi1001l0Il;
/* 386 */                                   i2 = i;
/* 388 */                                   z2 = false;
                                        } catch (IOException e2) {
/* 371 */                                   if (!I0000Il00O(e2, oOlioiIOOO1, i0Oi111iiI00000oOI, !(e2 instanceof IOlo1oo))) {
/* 391 */                                       Iterator it2 = list.iterator();
/* 399 */                                       while (it2.hasNext()) {
/* 407 */                                           ilIilolOlIoO.I00000oIO(e2, (Exception) it2.next());
                                                }
/* 411 */                                       throw e2;
                                            }
/* 377 */                                   listI00OI1 = IOOi0Ool1i.I00OI1(list, e2);
/* 381 */                                   oOlioiIOOO1.I0001Ioi1lo(true);
/* 384 */                                   oi1001l0Il2 = oi1001l0Il;
/* 386 */                                   i2 = i;
/* 388 */                                   z2 = false;
                                        }
                                    } catch (Throwable th2) {
/* 471 */                               oOlioiIOOO1.I0001Ioi1lo(true);
/* 474 */                               throw th2;
                                    }
                                }
/* 498 */                       I000II.I001IO000("Check failed.");
/* 495 */                       return null;
                            }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public I0Oi111ii I00000oOI(Oi1001l0Il oi1001l0Il, IOI0oloi01 iOI0oloi01) throws ProtocolException {
                    IoOOloOOllIO ioOOloOOllIO;
                    Oi1001l0Il oi1001l0Il2;
                    OOll1O oOll1O;
/* 13 */            OiI1II0IIOi0 oiI1II0IIOi0 = (iOI0oloi01 == null || (oOll1O = (OOll1O) iOI0oloi01.I0000oI00) == null) ? null : oOll1O.I00000oIO;
/* 14 */            int i = oi1001l0Il.I00iio;
/* 20 */            String str = (String) oi1001l0Il.I00iOIl.I00iiO;
/* 28 */            if (i == 307 || i == 308) {
/* 197 */               OIOlo0OloOi oIOlo0OloOi = (OIOlo0OloOi) this.I00000oOI;
/* 201 */               if (oIOlo0OloOi.I00ioIO) {
/* 208 */                   String strI00000oOI = oi1001l0Il.I00ilO0.I00000oOI("Location");
/* 212 */                   if (strI00000oOI == null) {
/* 214 */                       strI00000oOI = null;
                            }
/* 215 */                   I0Oi111ii i0Oi111ii = oi1001l0Il.I00iOIl;
/* 217 */                   if (strI00000oOI != null) {
/* 222 */                       IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111ii.I00iiI;
/* 224 */                       ioOi01OlIl1o.getClass();
                                try {
/* 229 */                           ioOOloOOllIO = new IoOOloOOllIO();
/* 232 */                           ioOOloOOllIO.I0000Il00O(ioOi01OlIl1o, strI00000oOI);
                                } catch (IllegalArgumentException unused) {
/* 236 */                           ioOOloOOllIO = null;
                                }
/* 244 */                       IoOi01OlIl1o ioOi01OlIl1oI00000oIO = ioOOloOOllIO != null ? ioOOloOOllIO.I00000oIO() : null;
/* 245 */                       if (ioOi01OlIl1oI00000oIO != null && (O0000Ioio00.I0000O(ioOi01OlIl1oI00000oIO.I00000oIO, ((IoOi01OlIl1o) i0Oi111ii.I00iiI).I00000oIO) || oIOlo0OloOi.I00l0I0l0lO1)) {
/* 267 */                           I1ii1o0 i1ii1o0I00IlilI0i0i = i0Oi111ii.I00IlilI0i0i();
/* 275 */                           if (io0IoloO1.I00000oIO(str)) {
/* 277 */                               int i2 = oi1001l0Il.I00iio;
/* 283 */                               boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
/* 294 */                               if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
/* 313 */                                   i1ii1o0I00IlilI0i0i.I00Io1lO(str, z ? (I00Ol00) i0Oi111ii.I00ilI0I1 : null);
                                        } else {
/* 302 */                                   i1ii1o0I00IlilI0i0i.I00Io1lO("GET", null);
                                        }
/* 316 */                               if (!z) {
/* 320 */                                   i1ii1o0I00IlilI0i0i.I00Io1o110i("Transfer-Encoding");
/* 325 */                                   i1ii1o0I00IlilI0i0i.I00Io1o110i("Content-Length");
/* 330 */                                   i1ii1o0I00IlilI0i0i.I00Io1o110i("Content-Type");
                                        }
                                    }
/* 341 */                           if (!OollIoI001lo.I00000oIO((IoOi01OlIl1o) i0Oi111ii.I00iiI, ioOi01OlIl1oI00000oIO)) {
/* 345 */                               i1ii1o0I00IlilI0i0i.I00Io1o110i("Authorization");
                                    }
/* 348 */                           i1ii1o0I00IlilI0i0i.I00iiI = ioOi01OlIl1oI00000oIO;
/* 350 */                           return i1ii1o0I00IlilI0i0i.I00100o1O0lo();
                                }
                            }
                        }
                    } else {
/* 34 */                if (i == 401) {
/* 189 */                   ((OIOlo0OloOi) this.I00000oOI).I00io1l.getClass();
/* 1 */                     return null;
                        }
/* 38 */                if (i != 421) {
/* 42 */                    if (i == 503) {
/* 116 */                       Oi1001l0Il oi1001l0Il3 = oi1001l0Il.I00l0OO0IO;
/* 118 */                       if ((oi1001l0Il3 == null || oi1001l0Il3.I00iio != 503) && I0000O(oi1001l0Il, Integer.MAX_VALUE) == 0) {
/* 135 */                           return oi1001l0Il.I00iOIl;
                                }
                            } else {
/* 46 */                        if (i == 407) {
/* 96 */                            if (oiI1II0IIOi0.I00000oOI.type() != Proxy.Type.HTTP) {
/* 115 */                               throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                    }
/* 104 */                           ((OIOlo0OloOi) this.I00000oOI).I00lli11.getClass();
/* 1 */                             return null;
                                }
/* 50 */                        if (i != 408) {
                                    switch (i) {
                                        case 300:
                                        case 301:
                                        case 302:
                                        case 303:
                                            break;
                                        default:
/* 1 */                                     return null;
                                    }
                                } else if (((OIOlo0OloOi) this.I00000oOI).I00ilO0 && (((oi1001l0Il2 = oi1001l0Il.I00l0OO0IO) == null || oi1001l0Il2.I00iio != 408) && I0000O(oi1001l0Il, 0) <= 0)) {
/* 85 */                            return oi1001l0Il.I00iOIl;
                                }
                            }
                        } else if (iOI0oloi01 != null && !O0000Ioio00.I0000O(((Il11O1o) iOI0oloi01.I0000Il00O).I00000oOI.I000O01llI0.I0000O, ((OOll1O) iOI0oloi01.I0000oI00).I00000oIO.I00000oIO.I000O01llI0.I0000O)) {
/* 171 */                   OOll1O oOll1O2 = (OOll1O) iOI0oloi01.I0000oI00;
                            synchronized (oOll1O2) {
/* 174 */                       oOll1O2.I000OiO = true;
                            }
/* 177 */                   return oi1001l0Il.I00iOIl;
                        }
                    }
/* 1 */             return null;
                }

                public boolean I0000Il00O(IOException iOException, OOlioiIOOO1 oOlioiIOOO1, I0Oi111ii i0Oi111ii, boolean z) {
                    boolean zI001l0I00;
                    I11l01l i11l01l;
                    OOll1O oOll1O;
/* 8 */             if (((OIOlo0OloOi) this.I00000oOI).I00ilO0 && ((!z || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
/* 57 */                Il11O1o il11O1o = oOlioiIOOO1.I00io1l;
/* 59 */                int i = il11O1o.I0001Ioi1lo;
/* 62 */                if (i == 0 && il11O1o.I000II == 0 && il11O1o.I000O01llI0 == 0) {
/* 72 */                    zI001l0I00 = false;
                        } else if (il11O1o.I000OOo1O != null) {
/* 134 */                   zI001l0I00 = true;
                        } else {
/* 79 */                    OiI1II0IIOi0 oiI1II0IIOi0 = null;
/* 80 */                    if (i <= 1 && il11O1o.I000II <= 1 && il11O1o.I000O01llI0 <= 0 && (oOll1O = il11O1o.I0000Il00O.I00ioIO) != null) {
                                synchronized (oOll1O) {
/* 101 */                           if (oOll1O.I000iOII == 0 && OollIoI001lo.I00000oIO(oOll1O.I00000oIO.I00000oIO.I000O01llI0, il11O1o.I00000oOI.I000O01llI0)) {
/* 123 */                               oiI1II0IIOi0 = oOll1O.I00000oIO;
                                    }
                                }
                            }
/* 130 */                   if (oiI1II0IIOi0 != null) {
/* 132 */                       il11O1o.I000OOo1O = oiI1II0IIOi0;
                            } else {
/* 136 */                       O1I1OO o1i1oo = il11O1o.I0000O;
/* 138 */                       if ((o1i1oo == null || !o1i1oo.I000OiO()) && (i11l01l = il11O1o.I0000oI00) != null) {
/* 152 */                           zI001l0I00 = i11l01l.I001l0I00();
                                }
                            }
/* 134 */                   zI001l0I00 = true;
                        }
/* 156 */               if (zI001l0I00) {
/* 61 */                    return true;
                        }
                    }
/* 7 */             return false;
                }
            }

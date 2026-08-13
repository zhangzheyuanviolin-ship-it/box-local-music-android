            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.InetAddress;
            import java.net.InetSocketAddress;
            import java.net.Proxy;
            import java.net.Socket;
            import java.net.SocketAddress;
            import java.net.SocketException;
            import java.net.URI;
            import java.net.UnknownHostException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.concurrent.ConcurrentLinkedQueue;
            
            public final class Il11O1o {
                public IioiI0IIIIO I00000oIO;
                public I0OI0o0lO I00000oOI;
                public OOlioiIOOO1 I0000Il00O;
                public O1I1OO I0000O;
                public I11l01l I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public OiI1II0IIOi0 I000OOo1O;

                /* JADX WARN: Removed duplicated region for block: B:193:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OOll1O I00000oIO(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
                    ArrayList arrayList;
                    String hostName;
                    int port;
                    List listSingletonList;
                    boolean zContains;
                    List listI000iOII;
                    iiOlilo0IIIl iiolilo0iiil;
                    boolean z3;
                    Socket socketI000OiO;
/* 6 */             while (!this.I0000Il00O.I00lli11) {
/* 10 */                OOll1O oOll1O = this.I0000Il00O.I00ioIO;
/* 12 */                byte b = 0;
/* 14 */                if (oOll1O != null) {
                            synchronized (oOll1O) {
                                try {
/* 19 */                            if (!oOll1O.I000OOo1O) {
/* 25 */                                IoOi01OlIl1o ioOi01OlIl1o = oOll1O.I00000oIO.I00000oIO.I000O01llI0;
/* 29 */                                IoOi01OlIl1o ioOi01OlIl1o2 = this.I00000oOI.I000O01llI0;
/* 60 */                                socketI000OiO = !(ioOi01OlIl1o.I0000oI00 == ioOi01OlIl1o2.I0000oI00 && O0000Ioio00.I0000O(ioOi01OlIl1o.I0000O, ioOi01OlIl1o2.I0000O)) ? this.I0000Il00O.I000OiO() : null;
                                    }
                                } catch (Throwable th) {
/* 90 */                            throw th;
                                }
                            }
/* 69 */                    if (this.I0000Il00O.I00ioIO != null) {
/* 71 */                        if (socketI000OiO != null) {
/* 79 */                            I000II.I001IO000("Check failed.");
/* 5 */                             return null;
                                }
/* 73 */                        z3 = z2;
                            } else {
/* 83 */                        if (socketI000OiO != null) {
/* 85 */                            OollIoI001lo.I0000oI00(socketI000OiO);
                                }
/* 91 */                        this.I0001Ioi1lo = 0;
/* 93 */                        this.I000II = 0;
/* 95 */                        this.I000O01llI0 = 0;
/* 107 */                       if (this.I00000oIO.I00000oIO(this.I00000oOI, this.I0000Il00O, null, false)) {
/* 114 */                           OiI1II0IIOi0 oiI1II0IIOi0 = this.I000OOo1O;
                                    try {
/* 116 */                               if (oiI1II0IIOi0 != null) {
/* 118 */                                   this.I000OOo1O = null;
                                        } else {
/* 123 */                                   O1I1OO o1i1oo = this.I0000O;
/* 125 */                                   if (o1i1oo == null || !o1i1oo.I000OiO()) {
/* 163 */                                       I11l01l i11l01l = this.I0000oI00;
/* 165 */                                       if (i11l01l == null) {
/* 169 */                                           I0OI0o0lO i0OI0o0lO = this.I00000oOI;
/* 175 */                                           iiOlilo0IIIl iiolilo0iiil2 = this.I0000Il00O.I00iOIl.I00ol1;
/* 178 */                                           i11l01l = new I11l01l(3);
/* 181 */                                           i11l01l.I0000Il00O = i0OI0o0lO;
/* 183 */                                           i11l01l.I0000O = iiolilo0iiil2;
/* 185 */                                           Il01100l il01100l = Il01100l.I00iOIl;
/* 187 */                                           i11l01l.I0000oI00 = il01100l;
/* 189 */                                           i11l01l.I0001Ioi1lo = il01100l;
/* 196 */                                           i11l01l.I000II = new ArrayList();
/* 200 */                                           URI uriI000II = i0OI0o0lO.I000O01llI0.I000II();
/* 208 */                                           if (uriI000II.getHost() == null) {
/* 216 */                                               listI000iOII = OollIoI001lo.I000iOII(Proxy.NO_PROXY);
                                                    } else {
/* 223 */                                               List<Proxy> listSelect = i0OI0o0lO.I000II.select(uriI000II);
/* 228 */                                               List<Proxy> list = listSelect;
/* 250 */                                               listI000iOII = (list == null || list.isEmpty()) ? OollIoI001lo.I000iOII(Proxy.NO_PROXY) : OollIoI001lo.I001i1O0Ol(listSelect);
                                                    }
/* 254 */                                           i11l01l.I0000oI00 = listI000iOII;
/* 256 */                                           i11l01l.I00000oOI = 0;
/* 258 */                                           VarHandle.storeStoreFence();
/* 261 */                                           this.I0000oI00 = i11l01l;
                                                }
/* 267 */                                       if (!i11l01l.I001l0I00()) {
/* 926 */                                           IoOOl0iOl1io.I00000oOI();
/* 5 */                                             return null;
                                                }
/* 271 */                                       arrayList = new ArrayList();
/* 284 */                                       while (i11l01l.I00000oOI < ((List) i11l01l.I0000oI00).size()) {
/* 288 */                                           I0OI0o0lO i0OI0o0lO2 = (I0OI0o0lO) i11l01l.I0000Il00O;
/* 302 */                                           if (i11l01l.I00000oOI >= ((List) i11l01l.I0000oI00).size()) {
/* 660 */                                               throw new SocketException("No route to " + i0OI0o0lO2.I000O01llI0.I0000O + "; exhausted proxy configurations: " + ((List) i11l01l.I0000oI00));
                                                    }
/* 306 */                                           List list2 = (List) i11l01l.I0000oI00;
/* 308 */                                           int i4 = i11l01l.I00000oOI;
/* 312 */                                           i11l01l.I00000oOI = i4 + 1;
/* 318 */                                           Proxy proxy = (Proxy) list2.get(i4);
/* 322 */                                           ArrayList arrayList2 = new ArrayList();
/* 325 */                                           i11l01l.I0001Ioi1lo = arrayList2;
/* 333 */                                           if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
/* 384 */                                               IoOi01OlIl1o ioOi01OlIl1o3 = i0OI0o0lO2.I000O01llI0;
/* 386 */                                               hostName = ioOi01OlIl1o3.I0000O;
/* 388 */                                               port = ioOi01OlIl1o3.I0000oI00;
                                                    } else {
/* 344 */                                               SocketAddress socketAddressAddress = proxy.address();
/* 350 */                                               if (!(socketAddressAddress instanceof InetSocketAddress)) {
/* 380 */                                                   OIiilo1Ool0o.I000O01llI0("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
/* 5 */                                                     return null;
                                                        }
/* 352 */                                               InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
/* 354 */                                               InetAddress address = inetSocketAddress.getAddress();
/* 365 */                                               hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
/* 369 */                                               port = inetSocketAddress.getPort();
                                                    }
/* 390 */                                           if (1 > port || port >= 65536) {
/* 626 */                                               throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                                    }
/* 402 */                                           if (proxy.type() == Proxy.Type.SOCKS) {
/* 408 */                                               arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                                    } else {
/* 418 */                                               if (OollIoI001lo.I0001Ioi1lo.I0000O(hostName)) {
/* 424 */                                                   listSingletonList = Collections.singletonList(InetAddress.getByName(hostName));
                                                        } else {
/* 431 */                                                   i0OI0o0lO2.I00000oIO.getClass();
                                                            try {
/* 438 */                                                       List listI00IioO0OiOi = I1IoiO1l.I00IioO0OiOi(InetAddress.getAllByName(hostName));
/* 446 */                                                       if (listI00IioO0OiOi.isEmpty()) {
/* 578 */                                                           throw new UnknownHostException(i0OI0o0lO2.I00000oIO + " returned no addresses for " + hostName);
                                                                }
/* 448 */                                                       listSingletonList = listI00IioO0OiOi;
                                                            } catch (NullPointerException e) {
/* 589 */                                                       UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
/* 592 */                                                       unknownHostException.initCause(e);
/* 595 */                                                       throw unknownHostException;
                                                            }
                                                        }
/* 449 */                                               Iterator it = listSingletonList.iterator();
/* 457 */                                               while (it.hasNext()) {
/* 470 */                                                   arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                                                        }
                                                    }
/* 486 */                                           for (InetSocketAddress inetSocketAddress2 : (List) i11l01l.I0001Ioi1lo) {
/* 498 */                                               I0OI0o0lO i0OI0o0lO3 = (I0OI0o0lO) i11l01l.I0000Il00O;
/* 500 */                                               OiI1II0IIOi0 oiI1II0IIOi02 = new OiI1II0IIOi0();
/* 503 */                                               oiI1II0IIOi02.I00000oIO = i0OI0o0lO3;
/* 505 */                                               oiI1II0IIOi02.I00000oOI = proxy;
/* 507 */                                               oiI1II0IIOi02.I0000Il00O = inetSocketAddress2;
/* 509 */                                               VarHandle.storeStoreFence();
/* 514 */                                               iiOlilo0IIIl iiolilo0iiil3 = (iiOlilo0IIIl) i11l01l.I0000O;
                                                        synchronized (iiolilo0iiil3) {
/* 521 */                                                   zContains = ((LinkedHashSet) iiolilo0iiil3.I00iOIl).contains(oiI1II0IIOi02);
                                                        }
/* 526 */                                               if (zContains) {
/* 532 */                                                   ((ArrayList) i11l01l.I000II).add(oiI1II0IIOi02);
                                                        } else {
/* 536 */                                                   arrayList.add(oiI1II0IIOi02);
                                                        }
                                                    }
/* 548 */                                           if (!arrayList.isEmpty()) {
                                                        break;
                                                    }
                                                }
/* 665 */                                       if (arrayList.isEmpty()) {
/* 671 */                                           IOOii0O10Io0.I00100l0(arrayList, (ArrayList) i11l01l.I000II);
/* 678 */                                           ((ArrayList) i11l01l.I000II).clear();
                                                }
/* 685 */                                       O1I1OO o1i1oo2 = new O1I1OO(13, b);
/* 688 */                                       o1i1oo2.I00iiO = arrayList;
/* 690 */                                       VarHandle.storeStoreFence();
/* 693 */                                       this.I0000O = o1i1oo2;
/* 699 */                                       if (this.I0000Il00O.I00lli11) {
/* 922 */                                           IioIoO10iOiI.I000OOo1O("Canceled");
/* 5 */                                             return null;
                                                }
/* 711 */                                       if (this.I00000oIO.I00000oIO(this.I00000oOI, this.I0000Il00O, arrayList, false)) {
/* 715 */                                           oOll1O = this.I0000Il00O.I00ioIO;
                                                } else {
/* 723 */                                           if (!o1i1oo2.I000OiO()) {
/* 916 */                                               IoOOl0iOl1io.I00000oOI();
/* 5 */                                                 return null;
                                                    }
/* 725 */                                           int i5 = o1i1oo2.I00iiI;
/* 729 */                                           o1i1oo2.I00iiI = i5 + 1;
/* 736 */                                           oiI1II0IIOi0 = (OiI1II0IIOi0) arrayList.get(i5);
/* 740 */                                           OOll1O oOll1O2 = new OOll1O();
/* 743 */                                           oOll1O2.I00000oIO = oiI1II0IIOi0;
/* 745 */                                           oOll1O2.I000o00OoI0I = 1;
/* 752 */                                           oOll1O2.I000oI1ioi = new ArrayList();
/* 759 */                                           oOll1O2.I00100l0 = Long.MAX_VALUE;
/* 761 */                                           VarHandle.storeStoreFence();
/* 766 */                                           this.I0000Il00O.I00o0iI0io1 = oOll1O2;
/* 775 */                                           oOll1O2.I00000oIO(i, i2, i3, z, this.I0000Il00O);
/* 780 */                                           this.I0000Il00O.I00o0iI0io1 = null;
/* 786 */                                           iiolilo0iiil = this.I0000Il00O.I00iOIl.I00ol1;
                                                    synchronized (iiolilo0iiil) {
/* 793 */                                               ((LinkedHashSet) iiolilo0iiil.I00iOIl).remove(oiI1II0IIOi0);
                                                    }
/* 807 */                                           if (this.I00000oIO.I00000oIO(this.I00000oOI, this.I0000Il00O, arrayList, true)) {
/* 811 */                                               OOll1O oOll1O3 = this.I0000Il00O.I00ioIO;
/* 813 */                                               this.I000OOo1O = oiI1II0IIOi0;
/* 817 */                                               OollIoI001lo.I0000oI00(oOll1O2.I0000Il00O);
/* 820 */                                               oOll1O = oOll1O3;
                                                    } else {
                                                        synchronized (oOll1O2) {
/* 824 */                                                   IioiI0IIIIO iioiI0IIIIO = this.I00000oIO;
/* 826 */                                                   byte[] bArr = OollIoI001lo.I00000oIO;
/* 832 */                                                   ((ConcurrentLinkedQueue) iioiI0IIIIO.I0000O).add(oOll1O2);
/* 845 */                                                   ((OloO00ioIOO) iioiI0IIIIO.I00000oOI).I0000Il00O((IoIOOii1OOi) iioiI0IIIIO.I0000Il00O, 0L);
/* 850 */                                                   this.I0000Il00O.I00000oIO(oOll1O2);
                                                        }
/* 854 */                                               z3 = z2;
/* 856 */                                               oOll1O = oOll1O2;
                                                    }
                                                }
                                            } else {
/* 133 */                                       O1I1OO o1i1oo3 = this.I0000O;
/* 139 */                                       if (!o1i1oo3.I000OiO()) {
/* 159 */                                           IoOOl0iOl1io.I00000oOI();
/* 5 */                                             return null;
                                                }
/* 143 */                                       ArrayList arrayList3 = (ArrayList) o1i1oo3.I00iiO;
/* 145 */                                       int i6 = o1i1oo3.I00iiI;
/* 149 */                                       o1i1oo3.I00iiI = i6 + 1;
/* 156 */                                       oiI1II0IIOi0 = (OiI1II0IIOi0) arrayList3.get(i6);
                                            }
                                        }
/* 775 */                               oOll1O2.I00000oIO(i, i2, i3, z, this.I0000Il00O);
/* 780 */                               this.I0000Il00O.I00o0iI0io1 = null;
/* 786 */                               iiolilo0iiil = this.I0000Il00O.I00iOIl.I00ol1;
                                        synchronized (iiolilo0iiil) {
                                        }
                                    } catch (Throwable th2) {
/* 913 */                               this.I0000Il00O.I00o0iI0io1 = null;
/* 915 */                               throw th2;
                                    }
/* 120 */                           arrayList = null;
/* 740 */                           OOll1O oOll1O22 = new OOll1O();
/* 743 */                           oOll1O22.I00000oIO = oiI1II0IIOi0;
/* 745 */                           oOll1O22.I000o00OoI0I = 1;
/* 752 */                           oOll1O22.I000oI1ioi = new ArrayList();
/* 759 */                           oOll1O22.I00100l0 = Long.MAX_VALUE;
/* 761 */                           VarHandle.storeStoreFence();
/* 766 */                           this.I0000Il00O.I00o0iI0io1 = oOll1O22;
                                } else {
/* 111 */                           oOll1O = this.I0000Il00O.I00ioIO;
                                }
/* 73 */                        z3 = z2;
                            }
                        } else {
/* 91 */                    this.I0001Ioi1lo = 0;
/* 93 */                    this.I000II = 0;
/* 95 */                    this.I000O01llI0 = 0;
/* 107 */                   if (this.I00000oIO.I00000oIO(this.I00000oOI, this.I0000Il00O, null, false)) {
                            }
/* 73 */                    z3 = z2;
                        }
/* 861 */               if (oOll1O.I000II(z3)) {
/* 863 */                   return oOll1O;
                        }
/* 864 */               oOll1O.I000OOo1O();
/* 869 */               if (this.I000OOo1O == null) {
/* 871 */                   O1I1OO o1i1oo4 = this.I0000O;
/* 881 */                   if (o1i1oo4 != null ? o1i1oo4.I000OiO() : true) {
                                continue;
                            } else {
/* 883 */                       I11l01l i11l01l2 = this.I0000oI00;
/* 891 */                       if (!(i11l01l2 != null ? i11l01l2.I001l0I00() : true)) {
/* 897 */                           IioIoO10iOiI.I000OOo1O("exhausted all routes");
/* 5 */                             return null;
                                }
                            }
                        }
                    }
/* 932 */           IioIoO10iOiI.I000OOo1O("Canceled");
/* 5 */             return null;
                }

                public final void I00000oOI(IOException iOException) {
/* 2 */             this.I000OOo1O = null;
/* 6 */             if ((iOException instanceof OlOO0IOl0i1) && ((OlOO0IOl0i1) iOException).I00iOIl == 8) {
                        this.I0001Ioi1lo++;
                    } else if (iOException instanceof IOlo1oo) {
                        this.I000II++;
                    } else {
                        this.I000O01llI0++;
                    }
                }
            }

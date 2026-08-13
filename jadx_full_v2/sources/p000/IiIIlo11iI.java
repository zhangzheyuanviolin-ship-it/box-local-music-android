            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function3;
            import sun.misc.Unsafe;
            
            public final class IiIIlo11iI extends Oll0io implements Function3 {
                public OoOO010 I00iOIl;
                public OO11OoloI I00iiI;
                public OoOO010 I00iiO;
                public int I00iio;
                public OO11OoloI I00ilI0I1;
                public IoO1o1 I00ilO0;
                public final IoIlI1oli I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiIIlo11iI(IoIlI1oli ioIlI1oli, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00io1l = ioIlI1oli;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 11 */            IiIIlo11iI iiIIlo11iI = new IiIIlo11iI(this.I00io1l, (IOoil1iiIilo) obj3);
/* 14 */            iiIIlo11iI.I00ilI0I1 = (OO11OoloI) obj;
/* 16 */            iiIIlo11iI.I00ilO0 = (IoO1o1) obj2;
/* 20 */            return iiIIlo11iI.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:206:0x04e4, code lost:
                
                    if (r0 == r4) goto L226;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:225:0x0551, code lost:
                
                    if (r0 != r4) goto L227;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
                
                    if (r0 == r4) goto L226;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0149, code lost:
                
                    if (r0 != r4) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x01cb, code lost:
                
                    if (r0 != r4) goto L53;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x02b6, code lost:
                
                    if (r0 == r4) goto L226;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x02e7, code lost:
                
                    if (r0 == r4) goto L226;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:229:0x0559  */
                /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoOO010 ooOO010;
                    OoiIlOl1iI ooiIlOl1iI;
                    Object objI000l1;
                    OO11OoloI oO11OoloI;
                    OoOO010 ooOO0102;
                    String str;
                    int i;
                    Object objI0000oI00;
                    int i2;
                    Object objI0000oI002;
                    Object objI0000oI003;
                    Object objI00100o1O0lo;
                    Object objI000l12;
                    OO11OoloI oO11OoloI2;
                    OoOO010 ooOO0103;
                    Object objI0000oI004;
                    Object objI0000oI005;
                    Object objI0000oI006;
                    Object objI0000oI007;
/* 3 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 5 */             OO11OoloI oO11OoloI3 = this.I00ilI0I1;
/* 7 */             IoO1o1 ioO1o1 = this.I00ilO0;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 16 */            IoO1o1 ioO1o12 = null;
/* 16 */            Object[] objArr = 0;
                    switch (this.I00iio) {
                        case 0:
/* 165 */                   lIoii1l01l0i.I00000oOI(obj);
/* 168 */                   ooOO010 = ioO1o1.I00000oIO;
/* 170 */                   Object obj2 = ioO1o1.I00000oOI;
/* 174 */                   if (!(obj2 instanceof IIIoloiiI1)) {
/* 176 */                       return ooiIlOl1iI2;
                            }
/* 180 */                   Object obj3 = oO11OoloI3.I00iOIl;
/* 185 */                   Ii1olII1lO1 ii1olII1lO1I0000oI00 = ((IoIlIolo10o) obj3).I0000oI00();
/* 189 */                   O0IOli0o0 o0IOli0o0 = ooOO010.I00000oIO;
/* 191 */                   OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 203 */                   int i3 = 1;
/* 204 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(OoiIlOl1iI.class))) {
/* 208 */                       iOiOO1O1.I00000oIO((IIIoloiiI1) obj2);
/* 213 */                       IoO1o1 ioO1o13 = new IoO1o1(ooOO010, ooiIlOl1iI2);
/* 216 */                       this.I00ilI0I1 = oO11OoloI3;
/* 218 */                       this.I00ilO0 = null;
/* 220 */                       this.I00iOIl = ooOO010;
/* 222 */                       this.I00iio = 1;
/* 224 */                       objI0000oI004 = oO11OoloI3.I0000oI00(this, ioO1o13);
                                break;
                            } else if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Integer.TYPE))) {
/* 254 */                       this.I00ilI0I1 = oO11OoloI3;
/* 256 */                       this.I00ilO0 = null;
/* 258 */                       this.I00iOIl = ooOO010;
/* 260 */                       this.I00iiI = oO11OoloI3;
/* 262 */                       this.I00iiO = ooOO010;
/* 264 */                       this.I00iio = 2;
/* 266 */                       objI000l12 = iOiOOIlI1o01.I000l1((IIIoloiiI1) obj2, this);
/* 270 */                       if (objI000l12 != ii0111o) {
/* 274 */                           oO11OoloI2 = oO11OoloI3;
/* 275 */                           ooOO0103 = ooOO010;
/* 276 */                           OlI1iil1l0 olI1iil1l0 = (OlI1iil1l0) objI000l12;
/* 283 */                           olI1iil1l0.I000lI(Long.MAX_VALUE);
/* 311 */                           IoO1o1 ioO1o14 = new IoO1o1(ooOO0103, new Integer(Integer.parseInt(li0oio00o1o.I00000oIO(olI1iil1l0.I0000oI00(), olI1iil1l0.I0000oI00().I00iiO))));
/* 314 */                           this.I00ilI0I1 = oO11OoloI3;
/* 316 */                           this.I00ilO0 = null;
/* 318 */                           this.I00iOIl = ooOO010;
/* 320 */                           this.I00iiI = null;
/* 322 */                           this.I00iiO = null;
/* 324 */                           this.I00iio = 3;
/* 326 */                           objI0000oI005 = oO11OoloI2.I0000oI00(this, ioO1o14);
                                    break;
                                }
                            } else {
/* 348 */                       int i4 = 4;
/* 349 */                       if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(OlI1iil1l0.class)) || O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(OlI1iil1l0.class))) {
/* 361 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 1317 */                          this.I00ilI0I1 = oO11OoloI3;
/* 1319 */                          this.I00ilO0 = null;
/* 1321 */                          this.I00iOIl = ooOO010;
/* 1323 */                          this.I00iiI = oO11OoloI3;
/* 1325 */                          this.I00iiO = ooOO010;
/* 1328 */                          this.I00iio = 4;
/* 1330 */                          objI000l1 = iOiOOIlI1o01.I000l1((IIIoloiiI1) obj2, this);
/* 1334 */                          if (objI000l1 != ii0111o) {
/* 1337 */                              oO11OoloI = oO11OoloI3;
/* 1338 */                              ooOO0102 = ooOO010;
/* 1341 */                              IoO1o1 ioO1o15 = new IoO1o1(ooOO0102, objI000l1);
/* 1344 */                              this.I00ilI0I1 = oO11OoloI3;
/* 1347 */                              this.I00ilO0 = null;
/* 1349 */                              this.I00iOIl = ooOO010;
/* 1351 */                              this.I00iiI = null;
/* 1353 */                              this.I00iiO = null;
/* 1356 */                              this.I00iio = 5;
/* 1358 */                              objI0000oI006 = oO11OoloI.I0000oI00(this, ioO1o15);
                                        break;
                                    }
                                } else if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(byte[].class))) {
/* 380 */                           this.I00ilI0I1 = oO11OoloI3;
/* 382 */                           this.I00ilO0 = null;
/* 384 */                           this.I00iOIl = ooOO010;
/* 387 */                           this.I00iio = 6;
/* 389 */                           objI00100o1O0lo = iOiOOIlI1o01.I00100o1O0lo((IIIoloiiI1) obj2, this);
/* 393 */                           if (objI00100o1O0lo != ii0111o) {
/* 397 */                               byte[] bArr = (byte[]) objI00100o1O0lo;
/* 411 */                               String strI000iOII = ((IoIlIolo10o) oO11OoloI3.I00iOIl).I0000oI00().I00000oOI().I000iOII("Content-Length");
/* 437 */                               li111oiil1.I00000oIO(strI000iOII == null ? OlOolloIIOl0.I000o00OoI0I(strI000iOII) : null, bArr.length, ((IoIlIolo10o) oO11OoloI3.I00iOIl).I0000O().getMethod());
/* 442 */                               IoO1o1 ioO1o16 = new IoO1o1(ooOO010, bArr);
/* 445 */                               this.I00ilI0I1 = oO11OoloI3;
/* 447 */                               this.I00ilO0 = null;
/* 449 */                               this.I00iOIl = ooOO010;
/* 451 */                               this.I00iiI = null;
/* 454 */                               this.I00iio = 7;
/* 456 */                               objI0000oI007 = oO11OoloI3.I0000oI00(this, ioO1o16);
                                        break;
                                    }
                                } else if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(IIIoloiiI1.class))) {
/* 491 */                           O010loOOi0Oo o010loOOi0Oo = new O010loOOi0Oo(l01oO1iOo.I0000oI00(ii1olII1lO1I0000oI00.I00000oIO()));
/* 503 */                           OoIOol ooIOolI00000oOI = IIOIli1iili.I00000oOI(oO11OoloI3, this.I00io1l.I00iiO, new IiI110i1O(obj2, (Object) ii1olII1lO1I0000oI00, (IOoil1iiIilo) (objArr == true ? 1 : 0), i3));
/* 511 */                           IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(29);
/* 514 */                           iIOIlOoI111.I00iiI = o010loOOi0Oo;
/* 516 */                           VarHandle.storeStoreFence();
/* 523 */                           ((OlIl0i) ooIOolI00000oOI.I00iiO).I00iiI(iIOIlOoI111);
/* 531 */                           IIIloOl0I1I iIIloOl0I1I = (IIIloOl0I1I) ooIOolI00000oOI.I00iiI;
/* 537 */                           IIOIlOoI111 iIOIlOoI1112 = new IIOIlOoI111(22);
/* 540 */                           iIOIlOoI1112.I00iiI = (IIIoloiiI1) obj2;
/* 542 */                           VarHandle.storeStoreFence();
/* 547 */                           IOO100 ioo100 = (IOO100) iIIloOl0I1I._closedCause;
/* 549 */                           if (ioo100 != null) {
/* 551 */                               Throwable th = ioo100.I00000oIO;
/* 590 */                               iIOIlOoI1112.invoke(th == 0 ? null : th instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th).I00000oIO() : th instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th).getMessage(), ioo100.I00000oIO) : new IOO1IOl1O10(th));
                                    } else {
/* 594 */                               Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 596 */                               long j = IIIloOl0I1I.I000II;
/* 603 */                               if (unsafe.compareAndSwapObject(iIIloOl0I1I, j, (Object) null, iIOIlOoI1112)) {
/* 607 */                                   IOO100 ioo1002 = (IOO100) iIIloOl0I1I._closedCause;
/* 609 */                                   if (ioo1002 != null && unsafe.compareAndSwapObject(iIIloOl0I1I, j, iIOIlOoI1112, (Object) null)) {
/* 620 */                                       Throwable th2 = ioo1002.I00000oIO;
/* 659 */                                       iIOIlOoI1112.invoke(th2 == 0 ? null : th2 instanceof IOollIi1OO0I ? ((IOollIi1OO0I) th2).I00000oIO() : th2 instanceof CancellationException ? ilIiOIi0I.I00000oIO(((CancellationException) th2).getMessage(), ioo1002.I00000oIO) : new IOO1IOl1O10(th2));
                                            }
                                        } else {
/* 665 */                                   I000II.I001IO000("Only one invokeOnClose handler is supported per channel");
                                        }
                                    }
/* 674 */                           IoO1o1 ioO1o17 = new IoO1o1(ooOO010, (IIIloOl0I1I) ooIOolI00000oOI.I00iiI);
/* 677 */                           this.I00ilI0I1 = oO11OoloI3;
/* 679 */                           this.I00ilO0 = null;
/* 681 */                           this.I00iOIl = ooOO010;
/* 683 */                           this.I00iiI = null;
/* 685 */                           this.I00iiO = null;
/* 689 */                           this.I00iio = 8;
/* 691 */                           objI0000oI003 = oO11OoloI3.I0000oI00(this, ioO1o17);
                                    break;
                                } else if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(IoOIoo.class))) {
/* 720 */                           iOiOO1O1.I00000oIO((IIIoloiiI1) obj2);
/* 729 */                           IoO1o1 ioO1o18 = new IoO1o1(ooOO010, ii1olII1lO1I0000oI00.I0000O());
/* 732 */                           this.I00ilI0I1 = oO11OoloI3;
/* 734 */                           this.I00ilO0 = null;
/* 736 */                           this.I00iOIl = ooOO010;
/* 738 */                           this.I00iio = 9;
/* 740 */                           objI0000oI002 = oO11OoloI3.I0000oI00(this, ioO1o18);
                                    break;
                                } else if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(IIOlO1ii.class))) {
/* 765 */                           IoIlIolo10o ioIlIolo10o = (IoIlIolo10o) obj3;
/* 777 */                           String strI000iOII2 = ioIlIolo10o.I0000oI00().I00000oOI().I000iOII("Content-Type");
/* 781 */                           if (strI000iOII2 == null) {
/* 1307 */                              I000II.I001IO000("No content type provided for multipart");
/* 16 */                                return null;
                                    }
/* 783 */                           IOoOloI0iI iOoOloI0iI = IOoOloI0iI.I0000oI00;
/* 785 */                           IOoOloI0iI iOoOloI0iII00000oIO = iioIIll1.I00000oIO(strI000iOII2);
/* 795 */                           if (!iOoOloI0iII00000oIO.I00000oIO(IOoOiiI.I00000oIO)) {
/* 1300 */                              IoOOl0iOl1io.I001lIiIIo1O("Expected multipart/form-data, got ", iOoOloI0iII00000oIO);
/* 16 */                                return null;
                                    }
/* 805 */                           String strI000iOII3 = ioIlIolo10o.I0000oI00().I00000oOI().I000iOII("Content-Length");
/* 821 */                           Long l = strI000iOII3 != null ? new Long(Long.parseLong(strI000iOII3)) : null;
/* 824 */                           Ii00l101O ii00l101OI00000oIO = oO11OoloI3.I00000oIO();
/* 828 */                           IIIoloiiI1 iIIoloiiI1 = (IIIoloiiI1) obj2;
/* 831 */                           IIOlO1ii iIOlO1ii = new IIOlO1ii(0);
/* 834 */                           iIOlO1ii.I00iiI = ii00l101OI00000oIO;
/* 836 */                           IIOIIi10OOl iIOIIi10OOl = OI0iiO1i1.I00000oIO;
/* 844 */                           if (!OlOoOIi0o.I00IoO0("multipart/", strI000iOII2, true)) {
/* 1296 */                              throw new IOO1IOl1O10("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) strI000iOII2));
                                    }
/* 846 */                           int length = strI000iOII2.length();
/* 850 */                           int i5 = 0;
/* 851 */                           int i6 = 0;
/* 855 */                           int i7 = 0;
                                    while (true) {
/* 859 */                               if (i5 < length) {
/* 861 */                                   char cCharAt = strI000iOII2.charAt(i5);
/* 865 */                                   if (i7 == 0) {
/* 976 */                                       i2 = i5;
/* 980 */                                       str = strI000iOII2;
/* 981 */                                       if (cCharAt == ';') {
/* 983 */                                           i7 = 1;
/* 984 */                                           i6 = 0;
                                                }
                                            } else if (i7 != i3) {
/* 870 */                                       if (i7 != 2) {
/* 873 */                                           if (i7 != 3) {
/* 875 */                                               if (i7 == i4) {
/* 878 */                                                   i2 = i5;
/* 880 */                                                   i7 = 3;
                                                        }
                                                    } else if (cCharAt == '\"') {
/* 895 */                                               i2 = i5;
/* 897 */                                               i7 = 1;
/* 898 */                                               i6 = 0;
                                                    } else if (cCharAt == '\\') {
/* 891 */                                               i7 = i4;
                                                    }
/* 892 */                                           i2 = i5;
                                                } else {
/* 901 */                                           if (cCharAt != '\"') {
/* 905 */                                               if (cCharAt != ',') {
/* 909 */                                                   if (cCharAt == ';') {
/* 912 */                                                       i7 = 1;
/* 913 */                                                       i6 = 0;
                                                            }
/* 892 */                                                   i2 = i5;
                                                        }
/* 916 */                                               i2 = i5;
/* 918 */                                               i7 = 0;
                                                    }
/* 878 */                                           i2 = i5;
/* 880 */                                           i7 = 3;
                                                }
/* 881 */                                       str = strI000iOII2;
                                            } else if (cCharAt == '=') {
/* 926 */                                       i2 = i5;
/* 928 */                                       i7 = 2;
/* 881 */                                       str = strI000iOII2;
                                            } else if (cCharAt == ';') {
/* 932 */                                       i2 = i5;
/* 898 */                                       i6 = 0;
/* 881 */                                       str = strI000iOII2;
                                            } else {
/* 937 */                                       if (cCharAt != ',') {
/* 942 */                                           if (cCharAt != ' ') {
/* 944 */                                               if (i6 == 0) {
/* 954 */                                                   String str2 = strI000iOII2;
/* 956 */                                                   i2 = i5;
/* 962 */                                                   str = str2;
/* 964 */                                                   i = OlOoOIi0o.I00IO1oi11O(str2, i2, "boundary=", 0, 9, true) ? i2 : -1;
                                                        } else {
/* 970 */                                                   i2 = i5;
/* 972 */                                                   str = strI000iOII2;
                                                        }
/* 973 */                                               i6++;
                                                    }
/* 892 */                                           i2 = i5;
/* 881 */                                           str = strI000iOII2;
                                                }
/* 916 */                                       i2 = i5;
/* 918 */                                       i7 = 0;
/* 881 */                                       str = strI000iOII2;
                                            }
/* 988 */                                   String str3 = str;
/* 986 */                                   i5 = i2 + 1;
/* 990 */                                   strI000iOII2 = str3;
/* 992 */                                   i3 = 1;
/* 993 */                                   i4 = 4;
                                        } else {
/* 996 */                                   str = strI000iOII2;
                                        }
                                    }
/* 999 */                           if (i == -1) {
/* 1272 */                              IioIoO10iOiI.I000OOo1O("Failed to parse multipart: Content-Type's boundary parameter is missing");
/* 1269 */                              return null;
                                    }
/* 1001 */                          int i8 = i + 9;
/* 1005 */                          byte[] bArr2 = new byte[74];
/* 1009 */                          OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 1014 */                          OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) 13);
/* 1019 */                          OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) 10);
/* 1024 */                          OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) 45);
/* 1027 */                          OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) 45);
/* 1030 */                          int length2 = str.length();
/* 1034 */                          char c = 0;
                                    while (true) {
/* 1035 */                              if (i8 < length2) {
/* 1037 */                                  char cCharAt2 = str.charAt(i8);
/* 1044 */                                  int i9 = cCharAt2 & 65535;
/* 1046 */                                  ooiIlOl1iI = ooiIlOl1iI2;
/* 1050 */                                  if (i9 > 127) {
/* 1146 */                                      iOlI1lIi0.I00000oIO(16);
/* 1175 */                                      throw new IOException("Failed to parse multipart: wrong boundary byte 0x" + Integer.toString(i9, 16) + " - should be 7bit character");
                                            }
/* 1052 */                                  if (c != 0) {
/* 1055 */                                      if (c != 1) {
/* 1058 */                                          if (c != 2) {
/* 1061 */                                              if (c == 3) {
/* 1067 */                                                  OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) i9);
/* 1072 */                                                  c = 2;
/* 1133 */                                                  i8++;
/* 1135 */                                                  ooiIlOl1iI2 = ooiIlOl1iI;
                                                        }
                                                    } else if (cCharAt2 != '\"') {
/* 1082 */                                              if (cCharAt2 != '\\') {
/* 1085 */                                                  OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) i9);
                                                        } else {
/* 1091 */                                                  c = 3;
/* 1133 */                                                  i8++;
/* 1135 */                                                  ooiIlOl1iI2 = ooiIlOl1iI;
                                                        }
                                                    }
/* 1133 */                                          i8++;
/* 1135 */                                          ooiIlOl1iI2 = ooiIlOl1iI;
                                                } else if (cCharAt2 != ' ' && cCharAt2 != ',' && cCharAt2 != ';') {
/* 1106 */                                          OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) i9);
/* 1133 */                                          i8++;
/* 1135 */                                          ooiIlOl1iI2 = ooiIlOl1iI;
                                                }
/* 1368 */                                      if (ioO1o12 == null) {
/* 1411 */                                          return ooiIlOl1iI;
                                                }
/* 1408 */                                      IiIO0IO0lll.I00000oIO.I000o00OoI0I("Transformed with default transformers response body for " + ((IoIlIolo10o) oO11OoloI3.I00iOIl).I0000O().getUrl() + " to " + ooOO010.I00000oIO);
/* 1411 */                                      return ooiIlOl1iI;
                                            }
/* 1112 */                                  if (cCharAt2 != ' ') {
/* 1116 */                                      if (cCharAt2 != '\"') {
/* 1120 */                                          if (cCharAt2 != ',' && cCharAt2 != ';') {
/* 1127 */                                              OI0iiO1i1.I00000oIO(oOo0ll111, bArr2, (byte) i9);
/* 1132 */                                              c = 1;
/* 1133 */                                              i8++;
/* 1135 */                                              ooiIlOl1iI2 = ooiIlOl1iI;
                                                    }
                                                }
/* 1072 */                                      c = 2;
/* 1133 */                                      i8++;
/* 1135 */                                      ooiIlOl1iI2 = ooiIlOl1iI;
                                            }
/* 1133 */                                  i8++;
/* 1135 */                                  ooiIlOl1iI2 = ooiIlOl1iI;
                                        } else {
/* 1176 */                                  ooiIlOl1iI = ooiIlOl1iI2;
                                        }
                                    }
/* 1178 */                          int i10 = oOo0ll111.I00iOIl;
/* 1181 */                          if (i10 == 4) {
/* 1265 */                              IioIoO10iOiI.I000OOo1O("Empty multipart boundary is not allowed");
/* 1262 */                              return null;
                                    }
/* 1196 */                          IlliIl1l11O oI0iOI1lIi = new OI0iOI1lIi(iIIoloiiI1, new IIOIIi10OOl(0, I1IoiO1l.I00100l0(bArr2, 0, i10)), l, null);
/* 1199 */                          Il00o11 il00o11 = Il00o11.I00iOIl;
/* 1201 */                          IIII0i iIII0i = IIII0i.I00iOIl;
/* 1203 */                          Ii01I10 ii01I10 = Ii01I10.I00iOIl;
/* 1205 */                          IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(0, iIII0i, null, 4);
/* 1216 */                          OOIoO0IIOO0 oOIoO0IIOO0 = new OOIoO0IIOO0(iioloOl.I00000oOI(iIOlO1ii, il00o11), true);
/* 1219 */                          oOIoO0IIOO0.I00ilI0I1 = iiiii1oi1I00000oIO;
/* 1221 */                          VarHandle.storeStoreFence();
/* 1224 */                          oOIoO0IIOO0.I00iiO(ii01I10, oOIoO0IIOO0, oI0iOI1lIi);
/* 1227 */                          VarHandle.storeStoreFence();
/* 1232 */                          IoO1o1 ioO1o19 = new IoO1o1(ooOO010, iIOlO1ii);
/* 1235 */                          this.I00ilI0I1 = oO11OoloI3;
/* 1237 */                          this.I00ilO0 = null;
/* 1239 */                          this.I00iOIl = ooOO010;
/* 1241 */                          this.I00iiI = null;
/* 1243 */                          this.I00iiO = null;
/* 1247 */                          this.I00iio = 10;
/* 1249 */                          objI0000oI00 = oO11OoloI3.I0000oI00(this, ioO1o19);
                                    break;
                                } else {
/* 1311 */                          ooiIlOl1iI = ooiIlOl1iI2;
/* 1368 */                          if (ioO1o12 == null) {
                                    }
                                }
                            }
/* 1364 */                  return ii0111o;
                        case 1:
/* 156 */                   OoOO010 ooOO0104 = this.I00iOIl;
/* 158 */                   lIoii1l01l0i.I00000oOI(obj);
/* 161 */                   ooOO010 = ooOO0104;
/* 162 */                   objI0000oI004 = obj;
/* 233 */                   ioO1o12 = (IoO1o1) objI0000oI004;
/* 235 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        case 2:
/* 140 */                   OoOO010 ooOO0105 = this.I00iiO;
/* 142 */                   OO11OoloI oO11OoloI4 = this.I00iiI;
/* 144 */                   OoOO010 ooOO0106 = this.I00iOIl;
/* 146 */                   lIoii1l01l0i.I00000oOI(obj);
/* 149 */                   oO11OoloI2 = oO11OoloI4;
/* 150 */                   ooOO010 = ooOO0106;
/* 151 */                   ooOO0103 = ooOO0105;
/* 152 */                   objI000l12 = obj;
/* 276 */                   OlI1iil1l0 olI1iil1l02 = (OlI1iil1l0) objI000l12;
/* 283 */                   olI1iil1l02.I000lI(Long.MAX_VALUE);
/* 311 */                   IoO1o1 ioO1o142 = new IoO1o1(ooOO0103, new Integer(Integer.parseInt(li0oio00o1o.I00000oIO(olI1iil1l02.I0000oI00(), olI1iil1l02.I0000oI00().I00iiO))));
/* 314 */                   this.I00ilI0I1 = oO11OoloI3;
/* 316 */                   this.I00ilO0 = null;
/* 318 */                   this.I00iOIl = ooOO010;
/* 320 */                   this.I00iiI = null;
/* 322 */                   this.I00iiO = null;
/* 324 */                   this.I00iio = 3;
/* 326 */                   objI0000oI005 = oO11OoloI2.I0000oI00(this, ioO1o142);
                            break;
                        case 3:
/* 130 */                   OoOO010 ooOO0107 = this.I00iOIl;
/* 132 */                   lIoii1l01l0i.I00000oOI(obj);
/* 135 */                   ooOO010 = ooOO0107;
/* 136 */                   objI0000oI005 = obj;
/* 335 */                   ioO1o12 = (IoO1o1) objI0000oI005;
/* 235 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        case 4:
/* 110 */                   ooOO0102 = this.I00iiO;
/* 112 */                   OO11OoloI oO11OoloI5 = this.I00iiI;
/* 114 */                   OoOO010 ooOO0108 = this.I00iOIl;
/* 116 */                   lIoii1l01l0i.I00000oOI(obj);
/* 121 */                   oO11OoloI = oO11OoloI5;
/* 122 */                   ooOO010 = ooOO0108;
/* 124 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 126 */                   objI000l1 = obj;
/* 1341 */                  IoO1o1 ioO1o152 = new IoO1o1(ooOO0102, objI000l1);
/* 1344 */                  this.I00ilI0I1 = oO11OoloI3;
/* 1347 */                  this.I00ilO0 = null;
/* 1349 */                  this.I00iOIl = ooOO010;
/* 1351 */                  this.I00iiI = null;
/* 1353 */                  this.I00iiO = null;
/* 1356 */                  this.I00iio = 5;
/* 1358 */                  objI0000oI006 = oO11OoloI.I0000oI00(this, ioO1o152);
                            break;
                        case 5:
/* 98 */                    OoOO010 ooOO0109 = this.I00iOIl;
/* 100 */                   lIoii1l01l0i.I00000oOI(obj);
/* 103 */                   ooOO010 = ooOO0109;
/* 104 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 106 */                   objI0000oI006 = obj;
/* 1366 */                  ioO1o12 = (IoO1o1) objI0000oI006;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        case 6:
/* 88 */                    OoOO010 ooOO01010 = this.I00iOIl;
/* 90 */                    lIoii1l01l0i.I00000oOI(obj);
/* 93 */                    ooOO010 = ooOO01010;
/* 94 */                    objI00100o1O0lo = obj;
/* 397 */                   byte[] bArr3 = (byte[]) objI00100o1O0lo;
/* 411 */                   String strI000iOII4 = ((IoIlIolo10o) oO11OoloI3.I00iOIl).I0000oI00().I00000oOI().I000iOII("Content-Length");
/* 437 */                   li111oiil1.I00000oIO(strI000iOII4 == null ? OlOolloIIOl0.I000o00OoI0I(strI000iOII4) : null, bArr3.length, ((IoIlIolo10o) oO11OoloI3.I00iOIl).I0000O().getMethod());
/* 442 */                   IoO1o1 ioO1o162 = new IoO1o1(ooOO010, bArr3);
/* 445 */                   this.I00ilI0I1 = oO11OoloI3;
/* 447 */                   this.I00ilO0 = null;
/* 449 */                   this.I00iOIl = ooOO010;
/* 451 */                   this.I00iiI = null;
/* 454 */                   this.I00iio = 7;
/* 456 */                   objI0000oI007 = oO11OoloI3.I0000oI00(this, ioO1o162);
                            break;
                        case 7:
/* 78 */                    OoOO010 ooOO01011 = this.I00iOIl;
/* 80 */                    lIoii1l01l0i.I00000oOI(obj);
/* 83 */                    ooOO010 = ooOO01011;
/* 84 */                    objI0000oI007 = obj;
/* 465 */                   ioO1o12 = (IoO1o1) objI0000oI007;
/* 235 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        case 8:
/* 64 */                    OoOO010 ooOO01012 = this.I00iOIl;
/* 66 */                    lIoii1l01l0i.I00000oOI(obj);
/* 69 */                    ooOO010 = ooOO01012;
/* 70 */                    objI0000oI003 = obj;
/* 700 */                   ioO1o12 = (IoO1o1) objI0000oI003;
/* 235 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        case 9:
/* 46 */                    OoOO010 ooOO01013 = this.I00iOIl;
/* 48 */                    lIoii1l01l0i.I00000oOI(obj);
/* 51 */                    ooOO010 = ooOO01013;
/* 52 */                    objI0000oI002 = obj;
/* 749 */                   ioO1o12 = (IoO1o1) objI0000oI002;
/* 235 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        case 10:
/* 34 */                    OoOO010 ooOO01014 = this.I00iOIl;
/* 36 */                    lIoii1l01l0i.I00000oOI(obj);
/* 39 */                    ooOO010 = ooOO01014;
/* 40 */                    ooiIlOl1iI = ooiIlOl1iI2;
/* 42 */                    objI0000oI00 = obj;
/* 1258 */                  ioO1o12 = (IoO1o1) objI0000oI00;
/* 1368 */                  if (ioO1o12 == null) {
                            }
                            break;
                        default:
/* 22 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                    return null;
                    }
                }
            }

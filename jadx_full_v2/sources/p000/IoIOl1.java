            package p000;

            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class IoIOl1 implements Closeable {
                public static final Logger I00iio = Logger.getLogger(IoIO101IlO.class.getName());
                public OOliO0 I00iOIl;
                public IoIOl0o0lo0 I00iiI;
                public IoII1OIO1lI I00iiO;

                /* JADX WARN: Code restructure failed: missing block: B:150:0x0235, code lost:
                
                    p000.IioIoO10iOiI.I000OOo1O(p000.Oi010OO0.I000oI1ioi(r11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:151:0x023e, code lost:
                
                    return r17;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oIO(boolean z, I01illiil1Oo i01illiil1Oo) throws IOException {
                    int i;
                    int i2;
                    int i3;
                    Object[] array;
                    try {
/* 10 */                this.I00iOIl.I00100o1O0lo(9L);
/* 15 */                int iI0010o = OollIoI001lo.I0010o(this.I00iOIl);
/* 21 */                if (iI0010o > 16384) {
/* 848 */                   IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0010o, "FRAME_SIZE_ERROR: "));
/* 5 */                     return false;
                        }
/* 29 */                int i4 = this.I00iOIl.readByte() & 255;
/* 33 */                byte b = this.I00iOIl.readByte();
/* 37 */                int i5 = b & 255;
/* 41 */                int iI000II = this.I00iOIl.I000II();
/* 48 */                int i6 = Integer.MAX_VALUE & iI000II;
/* 49 */                Logger logger = I00iio;
/* 58 */                if (logger.isLoggable(Level.FINE)) {
/* 64 */                    logger.fine(IoIO101IlO.I00000oIO(true, i6, iI0010o, i4, i5));
                        }
/* 68 */                if (z && i4 != 4) {
/* 79 */                    StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
/* 82 */                    String[] strArr = IoIO101IlO.I00000oOI;
/* 104 */                   sb.append(i4 < strArr.length ? strArr[i4] : OollIoI001lo.I000O01llI0("0x%02x", Integer.valueOf(i4)));
/* 114 */                   throw new IOException(sb.toString());
                        }
/* 117 */               int i7 = 2;
                        switch (i4) {
                            case 0:
/* 836 */                       I0000Il00O(i01illiil1Oo, iI0010o, i5, i6);
/* 57 */                        return true;
                            case 1:
/* 832 */                       I000O01llI0(i01illiil1Oo, iI0010o, i5, i6);
/* 57 */                        return true;
                            case 2:
/* 801 */                       if (iI0010o != 5) {
/* 828 */                           IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("TYPE_PRIORITY length: ", iI0010o, " != 5"));
/* 5 */                             return false;
                                }
/* 803 */                       if (i6 == 0) {
/* 816 */                           IioIoO10iOiI.I000OOo1O("TYPE_PRIORITY streamId == 0");
/* 5 */                             return false;
                                }
/* 805 */                       OOliO0 oOliO0 = this.I00iOIl;
/* 807 */                       oOliO0.I000II();
/* 810 */                       oOliO0.readByte();
/* 57 */                        return true;
                            case 3:
/* 664 */                       if (iI0010o != 4) {
/* 795 */                           IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("TYPE_RST_STREAM length: ", iI0010o, " != 4"));
/* 5 */                             return false;
                                }
/* 666 */                       if (i6 == 0) {
/* 783 */                           IioIoO10iOiI.I000OOo1O("TYPE_RST_STREAM streamId == 0");
/* 5 */                             return false;
                                }
/* 670 */                       int iI000II2 = this.I00iOIl.I000II();
/* 674 */                       int[] iArrI001lloI = IIlIOloOOO.I001lloI(14);
/* 678 */                       int length = iArrI001lloI.length;
/* 679 */                       int i8 = 0;
                                while (true) {
/* 681 */                           if (i8 < length) {
/* 683 */                               i = iArrI001lloI[i8];
/* 689 */                               if (IIlIOloOOO.I001lIiIIo1O(i) != iI000II2) {
/* 692 */                                   i8++;
                                        }
                                    } else {
/* 695 */                               i = 0;
                                    }
                                }
/* 697 */                       if (i == 0) {
/* 777 */                           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI000II2, "TYPE_RST_STREAM unexpected error code: "));
/* 5 */                             return false;
                                }
/* 701 */                       IoIOii01O ioIOii01O = (IoIOii01O) i01illiil1Oo.I00iiI;
/* 703 */                       if (i6 == 0 || (iI000II & 1) != 0) {
/* 747 */                           IoIi1I11l11 ioIi1I11l11I000II = ioIOii01O.I000II(i6);
/* 751 */                           if (ioIi1I11l11I000II != null) {
                                        synchronized (ioIi1I11l11I000II) {
/* 756 */                                   if (ioIi1I11l11I000II.I000lI == 0) {
/* 758 */                                       ioIi1I11l11I000II.I000lI = i;
/* 760 */                                       ioIi1I11l11I000II.notifyAll();
                                            }
                                        }
/* 57 */                                return true;
                                    }
/* 57 */                            return true;
                                }
/* 743 */                       ioIOii01O.I00l0I0l0lO1.I0000Il00O(new IoIOOOOlI1(ioIOii01O.I00iiO + '[' + i6 + "] onReset", ioIOii01O, i6, i), 0L);
/* 57 */                        return true;
                            case 4:
/* 480 */                       OOliO0 oOliO02 = this.I00iOIl;
/* 482 */                       if (i6 != 0) {
/* 658 */                           IioIoO10iOiI.I000OOo1O("TYPE_SETTINGS streamId != 0");
/* 5 */                             return false;
                                }
/* 485 */                       if ((b & 1) != 0) {
/* 487 */                           if (iI0010o != 0) {
/* 493 */                               IioIoO10iOiI.I000OOo1O("FRAME_SIZE_ERROR ack frame should be empty!");
/* 5 */                                 return false;
                                    }
/* 57 */                            return true;
                                }
/* 499 */                       if (iI0010o % 6 != 0) {
/* 650 */                           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0010o, "TYPE_SETTINGS length % 6 != 0: "));
/* 5 */                             return false;
                                }
/* 503 */                       Oio10I11IIi oio10I11IIi = new Oio10I11IIi();
/* 511 */                       IooO0oO00I iooO0oO00II000II = lIiioliIlo.I000II(lIiioliIlo.I000O01llI0(0, iI0010o), 6);
/* 515 */                       int i9 = iooO0oO00II000II.I00iOIl;
/* 517 */                       int i10 = iooO0oO00II000II.I00iiI;
/* 519 */                       int i11 = iooO0oO00II000II.I00iiO;
/* 521 */                       if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                                    while (true) {
/* 529 */                               short sI000l1 = oOliO02.I000l1();
/* 533 */                               byte[] bArr = OollIoI001lo.I00000oIO;
/* 538 */                               int i12 = sI000l1 & 65535;
/* 539 */                               int iI000II3 = oOliO02.I000II();
/* 543 */                               if (i12 == 2) {
/* 592 */                                   boolean z2 = i;
                                            i2 = z2;
                                            i2 = z2;
/* 594 */                                   if (iI000II3 != 0 && iI000II3 != 1) {
/* 601 */                                       IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
/* 604 */                                       return z2;
                                            }
                                        } else if (i12 == 3) {
/* 588 */                                   i2 = i;
/* 590 */                                   i12 = 4;
                                        } else if (i12 == 4) {
/* 576 */                                   boolean z3 = i;
/* 578 */                                   if (iI000II3 < 0) {
/* 584 */                                       IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
/* 587 */                                       return z3;
                                            }
/* 580 */                                   i12 = 7;
                                            i2 = z3;
                                        } else if (i12 == 5) {
/* 554 */                                   boolean z4 = i;
/* 558 */                                   if (iI000II3 < 16384) {
                                                break;
                                            } else {
                                                i2 = z4;
/* 563 */                                       if (iI000II3 > 16777215) {
                                                    break;
                                                }
                                            }
                                        } else {
/* 551 */                                   i2 = i;
                                        }
/* 605 */                               oio10I11IIi.I00000oOI(i12, iI000II3);
/* 608 */                               if (i9 != i10) {
/* 610 */                                   i9 += i11;
/* 611 */                                   i = i2;
                                        }
                                    }
                                }
/* 616 */                       IoIOii01O ioIOii01O2 = (IoIOii01O) i01illiil1Oo.I00iiI;
/* 638 */                       ioIOii01O2.I00ioIO.I0000Il00O(new IoIO1i(IIl001iO0Io.I00100l0(new StringBuilder(), ioIOii01O2.I00iiO, " applyAndAckSettings"), i01illiil1Oo, oio10I11IIi, i7), 0L);
/* 57 */                        return true;
                            case 5:
/* 476 */                       I000l1(i01illiil1Oo, iI0010o, i5, i6);
/* 57 */                        return true;
                            case 6:
/* 361 */                       if (iI0010o != 8) {
/* 472 */                           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0010o, "TYPE_PING length != 8: "));
/* 5 */                             return false;
                                }
/* 363 */                       if (i6 != 0) {
/* 462 */                           IioIoO10iOiI.I000OOo1O("TYPE_PING streamId != 0");
/* 5 */                             return false;
                                }
/* 367 */                       int iI000II4 = this.I00iOIl.I000II();
/* 373 */                       int iI000II5 = this.I00iOIl.I000II();
/* 379 */                       i = (b & 1) != 0 ? 1 : 0;
/* 385 */                       IoIOii01O ioIOii01O3 = (IoIOii01O) i01illiil1Oo.I00iiI;
/* 387 */                       if (i == 0) {
/* 456 */                           ioIOii01O3.I00ioIO.I0000Il00O(new IoIOIIi(IIl001iO0Io.I00100l0(new StringBuilder(), ((IoIOii01O) i01illiil1Oo.I00iiI).I00iiO, " ping"), (IoIOii01O) i01illiil1Oo.I00iiI, iI000II4, iI000II5, 0), 0L);
/* 57 */                            return true;
                                }
                                synchronized (ioIOii01O3) {
                                    try {
/* 392 */                               if (iI000II4 == 1) {
                                            ioIOii01O3.I00ll1++;
                                        } else if (iI000II4 == 2) {
                                            ioIOii01O3.I00lll10++;
                                        } else if (iI000II4 == 3) {
/* 399 */                                   ioIOii01O3.notifyAll();
                                        }
                                    } catch (Throwable th) {
/* 419 */                               throw th;
                                    }
                                }
/* 57 */                        return true;
                            case 7:
/* 211 */                       if (iI0010o < 8) {
/* 357 */                           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0010o, "TYPE_GOAWAY length < 8: "));
/* 5 */                             return false;
                                }
/* 213 */                       if (i6 != 0) {
/* 347 */                           IioIoO10iOiI.I000OOo1O("TYPE_GOAWAY streamId != 0");
/* 5 */                             return false;
                                }
/* 217 */                       int iI000II6 = this.I00iOIl.I000II();
/* 223 */                       int iI000II7 = this.I00iOIl.I000II();
/* 227 */                       int i13 = iI0010o - 8;
/* 228 */                       int[] iArrI001lloI2 = IIlIOloOOO.I001lloI(14);
/* 232 */                       int length2 = iArrI001lloI2.length;
/* 233 */                       int i14 = 0;
                                while (true) {
/* 234 */                           if (i14 < length2) {
/* 236 */                               i3 = iArrI001lloI2[i14];
/* 242 */                               if (IIlIOloOOO.I001lIiIIo1O(i3) != iI000II7) {
/* 245 */                                   i14++;
                                        }
                                    } else {
/* 248 */                               i3 = 0;
                                    }
                                }
/* 249 */                       if (i3 == 0) {
/* 341 */                           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI000II7, "TYPE_GOAWAY unexpected error code: "));
/* 5 */                             return false;
                                }
/* 251 */                       IIOIIi1ilIO iIOIIi1ilIOI0000Il00O = IIOIIi1ilIO.I00iio;
/* 253 */                       if (i13 > 0) {
/* 258 */                           iIOIIi1ilIOI0000Il00O = this.I00iOIl.I0000Il00O(i13);
                                }
/* 262 */                       iIOIIi1ilIOI0000Il00O.I00000oOI();
/* 268 */                       IoIOii01O ioIOii01O4 = (IoIOii01O) i01illiil1Oo.I00iiI;
                                synchronized (ioIOii01O4) {
/* 279 */                           array = ioIOii01O4.I00iiI.values().toArray(new IoIi1I11l11[0]);
/* 283 */                           ioIOii01O4.I00ilO0 = true;
                                }
/* 286 */                       IoIi1I11l11[] ioIi1I11l11Arr = (IoIi1I11l11[]) array;
/* 288 */                       int length3 = ioIi1I11l11Arr.length;
/* 289 */                       while (i < length3) {
/* 291 */                           IoIi1I11l11 ioIi1I11l11 = ioIi1I11l11Arr[i];
/* 295 */                           if (ioIi1I11l11.I00000oIO > iI000II6 && ioIi1I11l11.I000II()) {
                                        synchronized (ioIi1I11l11) {
/* 306 */                                   if (ioIi1I11l11.I000lI == 0) {
/* 308 */                                       ioIi1I11l11.I000lI = 8;
/* 310 */                                       ioIi1I11l11.notifyAll();
                                            }
                                        }
/* 323 */                               ((IoIOii01O) i01illiil1Oo.I00iiI).I000II(ioIi1I11l11.I00000oIO);
                                    }
/* 329 */                           i++;
                                }
/* 57 */                        return true;
                            case 8:
/* 136 */                       if (iI0010o != 4) {
/* 207 */                           IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0010o, "TYPE_WINDOW_UPDATE length !=4: "));
/* 5 */                             return false;
                                }
/* 148 */                       long jI000II = 2147483647L & this.I00iOIl.I000II();
/* 151 */                       if (jI000II == 0) {
/* 197 */                           IioIoO10iOiI.I000OOo1O("windowSizeIncrement was 0");
/* 5 */                             return false;
                                }
/* 155 */                       IoIOii01O ioIOii01O5 = (IoIOii01O) i01illiil1Oo.I00iiI;
/* 157 */                       if (i6 == 0) {
                                    synchronized (ioIOii01O5) {
                                        ioIOii01O5.I00oO101o += jI000II;
/* 165 */                               ioIOii01O5.notifyAll();
                                    }
/* 57 */                            return true;
                                }
/* 173 */                       IoIi1I11l11 ioIi1I11l11I0000Il00O = ioIOii01O5.I0000Il00O(i6);
/* 177 */                       if (ioIi1I11l11I0000Il00O != null) {
                                    synchronized (ioIi1I11l11I0000Il00O) {
                                        ioIi1I11l11I0000Il00O.I0001Ioi1lo += jI000II;
/* 185 */                               if (jI000II > 0) {
/* 187 */                                   ioIi1I11l11I0000Il00O.notifyAll();
                                        }
                                    }
/* 57 */                            return true;
                                }
/* 57 */                        return true;
                            default:
/* 132 */                       this.I00iOIl.skip(iI0010o);
/* 57 */                        return true;
                        }
                    } catch (EOFException unused) {
/* 5 */                 return false;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:67:0x010a, code lost:
                
                    if (r7 == false) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
                
                    r9.I000OOo1O(p000.OollIoI001lo.I00000oOI, true);
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(I01illiil1Oo i01illiil1Oo, int i, int i2, int i3) throws IOException {
                    int i4;
                    boolean z;
                    boolean z2;
/* 9 */             if (i3 == 0) {
/* 290 */               IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
/* 483 */               return;
                    }
/* 17 */            boolean z3 = (i2 & 1) != 0;
/* 20 */            if ((i2 & 32) != 0) {
/* 284 */               IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
/* 287 */               return;
                    }
/* 24 */            if ((i2 & 8) != 0) {
/* 28 */                byte b = this.I00iOIl.readByte();
/* 32 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 34 */                i4 = b & 255;
                    } else {
/* 40 */                i4 = 0;
                    }
/* 42 */            int iI00000oIO = io010o.I00000oIO(i, i2, i4);
/* 46 */            OOliO0 oOliO0 = this.I00iOIl;
/* 50 */            IoIOii01O ioIOii01O = (IoIOii01O) i01illiil1Oo.I00iiI;
/* 63 */            if (!(i3 != 0 && (i3 & 1) == 0)) {
/* 119 */               IoIi1I11l11 ioIi1I11l11I0000Il00O = ioIOii01O.I0000Il00O(i3);
/* 123 */               if (ioIi1I11l11I0000Il00O != null) {
/* 146 */                   byte[] bArr2 = OollIoI001lo.I00000oIO;
/* 148 */                   IoIOlili01I ioIOlili01I = ioIi1I11l11I0000Il00O.I000OOo1O;
                            long j = iI00000oIO;
/* 151 */                   ioIOlili01I.getClass();
/* 156 */                   long j2 = j;
                            while (true) {
/* 159 */                       IoIi1I11l11 ioIi1I11l11 = ioIOlili01I.I00ilO0;
/* 161 */                       if (j2 <= 0) {
/* 260 */                           byte[] bArr3 = OollIoI001lo.I00000oIO;
/* 264 */                           ioIi1I11l11.I00000oOI.I000l1(j);
                                    break;
                                }
                                synchronized (ioIi1I11l11) {
/* 164 */                           z = ioIOlili01I.I00iiI;
/* 180 */                           z2 = ioIOlili01I.I00iio.I00iiI + j2 > ioIOlili01I.I00iOIl;
                                }
/* 182 */                       if (z2) {
/* 184 */                           oOliO0.skip(j2);
/* 190 */                           ioIOlili01I.I00ilO0.I0000oI00(4);
                                    break;
                                }
/* 194 */                       if (z) {
/* 196 */                           oOliO0.skip(j2);
                                    break;
                                }
/* 202 */                       long j3 = oOliO0.read(ioIOlili01I.I00iiO, j2);
/* 210 */                       if (j3 == -1) {
/* 253 */                           I000II.I001i1O0Ol();
/* 256 */                           return;
                                }
/* 212 */                       j2 -= j3;
/* 213 */                       IoIi1I11l11 ioIi1I11l112 = ioIOlili01I.I00ilO0;
                                synchronized (ioIi1I11l112) {
                                    try {
/* 218 */                               if (ioIOlili01I.I00ilI0I1) {
/* 222 */                                   ioIOlili01I.I00iiO.I00000oIO();
                                        } else {
/* 228 */                                   III1o0lOio0 iII1o0lOio0 = ioIOlili01I.I00iio;
/* 238 */                                   boolean z4 = iII1o0lOio0.I00iiI == 0;
/* 241 */                                   iII1o0lOio0.I00lli11(ioIOlili01I.I00iiO);
/* 244 */                                   if (z4) {
/* 246 */                                       ioIi1I11l112.notifyAll();
                                            }
                                        }
                                    } catch (Throwable th) {
/* 252 */                               throw th;
                                    }
                                }
                            }
                        } else {
/* 130 */                   ((IoIOii01O) i01illiil1Oo.I00iiI).I001i1lo1io(i3, 2);
                            long j4 = iI00000oIO;
/* 138 */                   ((IoIOii01O) i01illiil1Oo.I00iiI).I000l1(j4);
/* 141 */                   oOliO0.skip(j4);
                        }
                    } else {
/* 67 */                III1o0lOio0 iII1o0lOio02 = new III1o0lOio0();
                        long j5 = iI00000oIO;
/* 71 */                oOliO0.I00100o1O0lo(j5);
/* 74 */                oOliO0.read(iII1o0lOio02, j5);
/* 114 */               ioIOii01O.I00l0I0l0lO1.I0000Il00O(new IoIOIi0(ioIOii01O.I00iiO + '[' + i3 + "] onData", ioIOii01O, i3, iII1o0lOio02, iI00000oIO, z3), 0L);
                    }
/* 278 */           this.I00iOIl.skip(i4);
                }

                public final List I000II(int i, int i2, int i3, int i4) throws IOException {
/* 1 */             IoIOl0o0lo0 ioIOl0o0lo0 = this.I00iiI;
/* 3 */             ioIOl0o0lo0.I00ilI0I1 = i;
/* 5 */             ioIOl0o0lo0.I00iiI = i;
/* 7 */             ioIOl0o0lo0.I00ilO0 = i2;
/* 9 */             ioIOl0o0lo0.I00iiO = i3;
/* 11 */            ioIOl0o0lo0.I00iio = i4;
/* 13 */            IoII1OIO1lI ioII1OIO1lI = this.I00iiO;
/* 15 */            OOliO0 oOliO0 = ioII1OIO1lI.I0000Il00O;
/* 17 */            ArrayList arrayList = ioII1OIO1lI.I00000oOI;
/* 23 */            while (!oOliO0.I00II0Ol1O0l()) {
/* 25 */                byte b = oOliO0.readByte();
/* 29 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 31 */                int i5 = b & 255;
/* 36 */                if (i5 == 128) {
/* 284 */                   IioIoO10iOiI.I000OOo1O("index == 0");
/* 33 */                    return null;
                        }
/* 40 */                if ((b & 128) == 128) {
/* 44 */                    int iI0000oI00 = ioII1OIO1lI.I0000oI00(i5, 127);
                            int i6 = iI0000oI00 - 1;
/* 50 */                    if (i6 >= 0) {
/* 52 */                        Io1IiiI11[] io1IiiI11Arr = IoIIO11iI.I00000oIO;
/* 57 */                        if (i6 <= io1IiiI11Arr.length - 1) {
/* 61 */                            arrayList.add(io1IiiI11Arr[i6]);
                                }
                            }
/* 73 */                    int length = ioII1OIO1lI.I0000oI00 + 1 + (i6 - IoIIO11iI.I00000oIO.length);
/* 74 */                    if (length >= 0) {
/* 76 */                        Io1IiiI11[] io1IiiI11Arr2 = ioII1OIO1lI.I0000O;
/* 79 */                        if (length < io1IiiI11Arr2.length) {
/* 83 */                            arrayList.add(io1IiiI11Arr2[length]);
                                }
                            }
/* 93 */                    IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI0000oI00, "Header index too large "));
/* 33 */                    return null;
                        }
/* 99 */                if (i5 == 64) {
/* 101 */                   Io1IiiI11[] io1IiiI11Arr3 = IoIIO11iI.I00000oIO;
/* 103 */                   IIOIIi1ilIO iIOIIi1ilIOI0000O = ioII1OIO1lI.I0000O();
/* 107 */                   IoIIO11iI.I00000oIO(iIOIIi1ilIOI0000O);
/* 119 */                   ioII1OIO1lI.I0000Il00O(new Io1IiiI11(iIOIIi1ilIOI0000O, ioII1OIO1lI.I0000O()));
                        } else if ((b & 64) == 64) {
/* 148 */                   ioII1OIO1lI.I0000Il00O(new Io1IiiI11(ioII1OIO1lI.I00000oOI(ioII1OIO1lI.I0000oI00(i5, 63) - 1), ioII1OIO1lI.I0000O()));
                        } else if ((b & 32) == 32) {
/* 161 */                   int iI0000oI002 = ioII1OIO1lI.I0000oI00(i5, 31);
/* 165 */                   ioII1OIO1lI.I00000oIO = iI0000oI002;
/* 167 */                   if (iI0000oI002 < 0 || iI0000oI002 > 4096) {
/* 225 */                       throw new IOException("Invalid dynamic table size update " + ioII1OIO1lI.I00000oIO);
                            }
/* 173 */                   int i7 = ioII1OIO1lI.I000II;
/* 175 */                   if (iI0000oI002 < i7) {
/* 177 */                       if (iI0000oI002 == 0) {
/* 181 */                           I1IoiO1l.I00111O(ioII1OIO1lI.I0000O, null);
/* 189 */                           ioII1OIO1lI.I0000oI00 = ioII1OIO1lI.I0000O.length - 1;
/* 192 */                           ioII1OIO1lI.I0001Ioi1lo = 0;
/* 194 */                           ioII1OIO1lI.I000II = 0;
                                } else {
/* 199 */                           ioII1OIO1lI.I00000oIO(i7 - iI0000oI002);
                                }
                            }
                        } else if (i5 == 16 || i5 == 0) {
/* 259 */                   Io1IiiI11[] io1IiiI11Arr4 = IoIIO11iI.I00000oIO;
/* 261 */                   IIOIIi1ilIO iIOIIi1ilIOI0000O2 = ioII1OIO1lI.I0000O();
/* 265 */                   IoIIO11iI.I00000oIO(iIOIIi1ilIOI0000O2);
/* 277 */                   arrayList.add(new Io1IiiI11(iIOIIi1ilIOI0000O2, ioII1OIO1lI.I0000O()));
                        } else {
/* 254 */                   arrayList.add(new Io1IiiI11(ioII1OIO1lI.I00000oOI(ioII1OIO1lI.I0000oI00(i5, 15) - 1), ioII1OIO1lI.I0000O()));
                        }
                    }
/* 288 */           List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList);
/* 292 */           arrayList.clear();
/* 483 */           return listI00iIi0i1o;
                }

                public final void I000O01llI0(I01illiil1Oo i01illiil1Oo, int i, int i2, int i3) throws IOException {
                    int i4;
/* 1 */             if (i3 == 0) {
/* 217 */               IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
/* 483 */               return;
                    }
/* 5 */             boolean z = false;
/* 6 */             int i5 = 1;
/* 11 */            boolean z2 = (i2 & 1) != 0;
/* 14 */            if ((i2 & 8) != 0) {
/* 18 */                byte b = this.I00iOIl.readByte();
/* 22 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 24 */                i4 = b & 255;
                    } else {
/* 27 */                i4 = 0;
                    }
/* 30 */            if ((i2 & 32) != 0) {
/* 32 */                OOliO0 oOliO0 = this.I00iOIl;
/* 34 */                oOliO0.I000II();
/* 37 */                oOliO0.readByte();
/* 40 */                byte[] bArr2 = OollIoI001lo.I00000oIO;
                        i -= 5;
                    }
/* 48 */            List listI000II = I000II(io010o.I00000oIO(i, i2, i4), i4, i2, i3);
/* 55 */            IoIOii01O ioIOii01O = (IoIOii01O) i01illiil1Oo.I00iiI;
/* 57 */            if (i3 != 0 && (i3 & 1) == 0) {
/* 63 */                z = true;
                    }
/* 68 */            if (z) {
/* 105 */               ioIOii01O.I00l0I0l0lO1.I0000Il00O(new IoIOO1(ioIOii01O.I00iiO + '[' + i3 + "] onHeaders", ioIOii01O, i3, listI000II, z2), 0L);
/* 108 */               return;
                    }
                    synchronized (ioIOii01O) {
/* 111 */               IoIi1I11l11 ioIi1I11l11I0000Il00O = ioIOii01O.I0000Il00O(i3);
/* 115 */               if (ioIi1I11l11I0000Il00O != null) {
/* 209 */                   ioIi1I11l11I0000Il00O.I000OOo1O(OollIoI001lo.I001IIilI0O(listI000II), z2);
/* 212 */                   return;
                        }
/* 119 */               if (ioIOii01O.I00ilO0) {
/* 122 */                   return;
                        }
/* 125 */               if (i3 <= ioIOii01O.I00iio) {
/* 128 */                   return;
                        }
/* 135 */               if (i3 % 2 == ioIOii01O.I00ilI0I1 % 2) {
/* 138 */                   return;
                        }
/* 146 */               IoIi1I11l11 ioIi1I11l11 = new IoIi1I11l11(i3, ioIOii01O, false, z2, OollIoI001lo.I001IIilI0O(listI000II));
/* 149 */               ioIOii01O.I00iio = i3;
/* 157 */               ioIOii01O.I00iiI.put(Integer.valueOf(i3), ioIi1I11l11);
/* 196 */               ioIOii01O.I00io1l.I0000O().I0000Il00O(new IoIO1i(ioIOii01O.I00iiO + '[' + i3 + "] onStream", ioIOii01O, ioIi1I11l11, i5), 0L);
                    }
                }

                public final void I000l1(I01illiil1Oo i01illiil1Oo, int i, int i2, int i3) throws IOException {
                    int i4;
/* 1 */             if (i3 == 0) {
/* 118 */               IioIoO10iOiI.I000OOo1O("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
/* 483 */               return;
                    }
/* 5 */             if ((i2 & 8) != 0) {
/* 9 */                 byte b = this.I00iOIl.readByte();
/* 13 */                byte[] bArr = OollIoI001lo.I00000oIO;
/* 15 */                i4 = b & 255;
                    } else {
/* 18 */                i4 = 0;
                    }
/* 28 */            int iI000II = this.I00iOIl.I000II() & Integer.MAX_VALUE;
/* 35 */            List listI000II = I000II(io010o.I00000oIO(i - 4, i2, i4), i4, i2, i3);
/* 41 */            IoIOii01O ioIOii01O = (IoIOii01O) i01illiil1Oo.I00iiI;
                    synchronized (ioIOii01O) {
/* 54 */                if (ioIOii01O.I00oli.contains(Integer.valueOf(iI000II))) {
/* 57 */                    ioIOii01O.I001i1lo1io(iI000II, 2);
/* 61 */                    return;
                        }
/* 70 */                ioIOii01O.I00oli.add(Integer.valueOf(iI000II));
/* 110 */               ioIOii01O.I00l0I0l0lO1.I0000Il00O(new IoIOO1(ioIOii01O.I00iiO + '[' + iI000II + "] onRequest", ioIOii01O, iI000II, listI000II), 0L);
                    }
                }

                @Override
                public final void close() throws IOException {
/* 3 */             this.I00iOIl.close();
                }
            }

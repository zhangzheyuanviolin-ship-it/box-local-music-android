            package p000;

            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.ProtocolException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            
            public final class IoIOil110oOl implements Il111ol {
                public static final List I000II = OollIoI001lo.I000iOII("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
                public static final List I000O01llI0 = OollIoI001lo.I000iOII("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
                public OOll1O I00000oIO;
                public OOlli0I I00000oOI;
                public IoIOii01O I0000Il00O;
                public volatile IoIi1I11l11 I0000O;
                public OOiIO0oi I0000oI00;
                public volatile boolean I0001Ioi1lo;

                @Override
                public final OlI1ii I00000oIO(Oi1001l0Il oi1001l0Il) {
/* 3 */             return this.I0000O.I000OOo1O;
                }

                @Override
                public final void I00000oOI() {
/* 7 */             this.I0000O.I0001Ioi1lo().close();
                }

                @Override
                public final long I0000Il00O(Oi1001l0Il oi1001l0Il) {
/* 5 */             if (IoIoIiooolI1.I00000oIO(oi1001l0Il)) {
/* 10 */                return OollIoI001lo.I000OiO(oi1001l0Il);
                    }
/* 7 */             return 0L;
                }

                @Override
                public final Ol0i0olI I0000O(I0Oi111ii i0Oi111ii, long j) {
/* 3 */             return this.I0000O.I0001Ioi1lo();
                }

                @Override
                public final Oi10001 I0000oI00(boolean z) throws IOException {
                    Io1Io0OOi011 io1Io0OOi011;
/* 1 */             IoIi1I11l11 ioIi1I11l11 = this.I0000O;
/* 4 */             if (ioIi1I11l11 == null) {
/* 226 */               IioIoO10iOiI.I000OOo1O("stream wasn't created");
/* 3 */                 return null;
                    }
                    synchronized (ioIi1I11l11) {
/* 9 */                 ioIi1I11l11.I000iOII.I000O01llI0();
/* 18 */                while (ioIi1I11l11.I000II.isEmpty() && ioIi1I11l11.I000lI == 0) {
                            try {
                                try {
/* 24 */                            ioIi1I11l11.wait();
                                } catch (InterruptedException unused) {
/* 32 */                            Thread.currentThread().interrupt();
/* 40 */                            throw new InterruptedIOException();
                                }
                            } catch (Throwable th) {
/* 218 */                       ioIi1I11l11.I000iOII.I000iOII();
/* 221 */                       throw th;
                            }
                        }
/* 46 */                ioIi1I11l11.I000iOII.I000iOII();
/* 55 */                if (ioIi1I11l11.I000II.isEmpty()) {
/* 203 */                   IOException iOException = ioIi1I11l11.I000o00OoI0I;
/* 205 */                   if (iOException != null) {
/* 215 */                       throw iOException;
                            }
/* 215 */                   throw new OlOO0IOl0i1(ioIi1I11l11.I000lI);
                        }
/* 63 */                io1Io0OOi011 = (Io1Io0OOi011) ioIi1I11l11.I000II.removeFirst();
                    }
/* 66 */            OOiIO0oi oOiIO0oi = this.I0000oI00;
/* 72 */            ArrayList arrayList = new ArrayList(20);
/* 75 */            int size = io1Io0OOi011.size();
/* 80 */            I00Ol00 i00Ol00I00000oIO = null;
/* 82 */            for (int i = 0; i < size; i++) {
/* 84 */                String strI0000O = io1Io0OOi011.I0000O(i);
/* 88 */                String strI000OiO = io1Io0OOi011.I000OiO(i);
/* 98 */                if (O0000Ioio00.I0000O(strI0000O, ":status")) {
/* 114 */                   i00Ol00I00000oIO = lOOiill.I00000oIO("HTTP/1.1 " + strI000OiO);
                        } else if (!I000O01llI0.contains(strI0000O)) {
/* 127 */                   arrayList.add(strI0000O);
/* 138 */                   arrayList.add(OlOoOIi0o.I00OIo(strI000OiO).toString());
                        }
                    }
/* 144 */           if (i00Ol00I00000oIO == null) {
/* 200 */               throw new ProtocolException("Expected ':status' header not present");
                    }
/* 148 */           Oi10001 oi10001 = new Oi10001();
/* 151 */           oi10001.I00000oOI = oOiIO0oi;
/* 155 */           oi10001.I0000Il00O = i00Ol00I00000oIO.I00000oOI;
/* 161 */           oi10001.I0000O = (String) i00Ol00I00000oIO.I0000O;
/* 169 */           String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 173 */           Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 178 */           IOOii0O10Io0.I00100o1O0lo(io1IlO1I1i.I00000oIO, strArr);
/* 181 */           oi10001.I0001Ioi1lo = io1IlO1I1i;
/* 183 */           if (z && oi10001.I0000Il00O == 100) {
/* 3 */                 return null;
                    }
/* 192 */           return oi10001;
                }

                @Override
                public final OOll1O I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final void I000II() {
/* 3 */             this.I0000Il00O.flush();
                }

                @Override
                public final void I000O01llI0(I0Oi111ii i0Oi111ii) throws IOException {
                    int i;
                    IoIi1I11l11 ioIi1I11l11;
                    boolean z;
/* 3 */             if (this.I0000O != null) {
/* 5 */                 return;
                    }
/* 16 */            boolean z2 = ((I00Ol00) i0Oi111ii.I00ilI0I1) != null;
/* 19 */            Io1Io0OOi011 io1Io0OOi011 = (Io1Io0OOi011) i0Oi111ii.I00iio;
/* 29 */            ArrayList arrayList = new ArrayList(io1Io0OOi011.size() + 4);
/* 43 */            arrayList.add(new Io1IiiI11(Io1IiiI11.I0001Ioi1lo, (String) i0Oi111ii.I00iiO));
/* 48 */            IIOIIi1ilIO iIOIIi1ilIO = Io1IiiI11.I000II;
/* 52 */            IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111ii.I00iiI;
/* 54 */            String strI00000oOI = ioOi01OlIl1o.I00000oOI();
/* 58 */            String strI0000O = ioOi01OlIl1o.I0000O();
/* 62 */            if (strI0000O != null) {
/* 66 */                strI00000oOI = IIlIOloOOO.I000oI1ioi('?', strI00000oOI, strI0000O);
                    }
/* 73 */            arrayList.add(new Io1IiiI11(iIOIIi1ilIO, strI00000oOI));
/* 78 */            String strI00000oOI2 = io1Io0OOi011.I00000oOI("Host");
/* 82 */            if (strI00000oOI2 != null) {
/* 91 */                arrayList.add(new Io1IiiI11(Io1IiiI11.I000OOo1O, strI00000oOI2));
                    }
/* 103 */           arrayList.add(new Io1IiiI11(Io1IiiI11.I000O01llI0, ioOi01OlIl1o.I00000oIO));
/* 106 */           int size = io1Io0OOi011.size();
/* 111 */           for (int i2 = 0; i2 < size; i2++) {
/* 119 */               String lowerCase = io1Io0OOi011.I0000O(i2).toLowerCase(Locale.US);
/* 129 */               if (!I000II.contains(lowerCase) || (lowerCase.equals("te") && O0000Ioio00.I0000O(io1Io0OOi011.I000OiO(i2), "trailers"))) {
/* 160 */                   arrayList.add(new Io1IiiI11(lowerCase, io1Io0OOi011.I000OiO(i2)));
                        }
                    }
/* 166 */           IoIOii01O ioIOii01O = this.I0000Il00O;
                    boolean z3 = !z2;
                    synchronized (ioIOii01O.I00ol1) {
                        synchronized (ioIOii01O) {
                            try {
/* 179 */                       if (ioIOii01O.I00ilI0I1 > 1073741823) {
/* 183 */                           ioIOii01O.I000O01llI0(8);
                                }
/* 193 */                       if (ioIOii01O.I00ilO0) {
/* 306 */                           throw new IOlo1oo();
                                }
/* 195 */                       i = ioIOii01O.I00ilI0I1;
/* 199 */                       ioIOii01O.I00ilI0I1 = i + 2;
/* 205 */                       ioIi1I11l11 = new IoIi1I11l11(i, ioIOii01O, z3, false, null);
/* 208 */                       z = !z2 || ioIOii01O.I00oIiI10 >= ioIOii01O.I00oO101o || ioIi1I11l11.I0000oI00 >= ioIi1I11l11.I0001Ioi1lo;
/* 231 */                       if (ioIi1I11l11.I000O01llI0()) {
/* 239 */                           ioIOii01O.I00iiI.put(Integer.valueOf(i), ioIi1I11l11);
                                }
                            } catch (Throwable th) {
/* 308 */                       throw th;
                            }
                        }
/* 245 */               ioIOii01O.I00ol1.I000l1(z3, i, arrayList);
                    }
/* 249 */           if (z) {
/* 253 */               ioIOii01O.I00ol1.flush();
                    }
/* 256 */           this.I0000O = ioIi1I11l11;
/* 258 */           boolean z4 = this.I0001Ioi1lo;
/* 260 */           IoIi1I11l11 ioIi1I11l112 = this.I0000O;
/* 262 */           if (z4) {
/* 289 */               ioIi1I11l112.I0000oI00(9);
/* 294 */               IioIoO10iOiI.I000OOo1O("Canceled");
                    } else {
/* 271 */               ioIi1I11l112.I000iOII.I000II(this.I00000oOI.I000II);
/* 283 */               this.I0000O.I000l1.I000II(this.I00000oOI.I000O01llI0);
                    }
                }

                @Override
                public final void cancel() {
/* 2 */             this.I0001Ioi1lo = true;
/* 4 */             IoIi1I11l11 ioIi1I11l11 = this.I0000O;
/* 6 */             if (ioIi1I11l11 != null) {
/* 10 */                ioIi1I11l11.I0000oI00(9);
                    }
                }
            }

            package p000;

            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.Map;
            import java.util.Set;
            import javax.net.ssl.HttpsURLConnection;
            
            public final class I0lOIOI11OIl extends IoIll0l {
                public I0o1io0i1OO0 I00ilI0I1;
                public Set I00ilO0;

                /* JADX WARN: Removed duplicated region for block: B:101:0x0262 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:102:0x0263 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /* JADX WARN: Type inference failed for: r4v10, types: [IOiOol0, Ii00l101O, Ilo0Ooi, OIio0oloI1I, java.net.HttpURLConnection] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IOiOol0 iOiOol0, IOoilo iOoilo) throws Throwable {
                    I0lO1l i0lO1l;
                    IOiOol0 iOiOol02;
                    Object obj;
                    Ilo0Ooi ilo0OoiI00000oIO;
                    OIio0oloI1I oIio0oloI1I;
                    Object obj2;
                    Ii00l101O ii00l101O;
                    Long lI00000oIO;
                    HttpURLConnection httpURLConnection;
                    String strI000iOII;
                    String strI000iOII2;
                    IOiOol0 iOiOol03;
                    Ilo0Ooi ilo0Ooi;
                    Ii00l101O ii00l101O2;
                    HttpURLConnection httpURLConnection2;
                    OIio0oloI1I oIio0oloI1I2;
/* 5 */             I0o1io0i1OO0 i0o1io0i1OO0 = this.I00ilI0I1;
/* 9 */             if (iOoilo instanceof I0lO1l) {
/* 12 */                i0lO1l = (I0lO1l) iOoilo;
/* 14 */                int i = i0lO1l.I00ioIO;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    i0lO1l.I00ioIO = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    i0lO1l = new I0lO1l(this, iOoilo);
                        }
                    }
/* 31 */            Object obj3 = i0lO1l.I00ilO0;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = i0lO1l.I00ioIO;
/* 41 */            if (i2 == 0) {
/* 87 */                lIoii1l01l0i.I00000oOI(obj3);
/* 90 */                iOiOol02 = iOiOol0;
/* 92 */                i0lO1l.I00iOIl = iOiOol02;
/* 94 */                i0lO1l.I00ioIO = 1;
/* 96 */                Set set = Oolloi0i.I00000oIO;
/* 110 */               obj = ((O0iO0IiIio) i0lO1l.getContext().I00lli11(O0iO0IiIio.I00iiI)).I00iOIl;
/* 112 */               if (obj != ii0111o) {
                        }
                    }
/* 43 */            if (i2 != 1) {
/* 45 */                if (i2 != 2) {
/* 47 */                    if (i2 == 3) {
/* 49 */                        lIoii1l01l0i.I00000oOI(obj3);
/* 52 */                        return obj3;
                            }
/* 55 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 40 */                    return null;
                        }
/* 59 */                httpURLConnection2 = i0lO1l.I00ilI0I1;
/* 61 */                oIio0oloI1I2 = i0lO1l.I00iio;
/* 63 */                ilo0Ooi = i0lO1l.I00iiO;
/* 65 */                ii00l101O2 = i0lO1l.I00iiI;
/* 67 */                iOiOol03 = i0lO1l.I00iOIl;
/* 69 */                lIoii1l01l0i.I00000oOI(obj3);
/* 72 */                obj2 = null;
/* 569 */               httpURLConnection = httpURLConnection2;
/* 570 */               oIio0oloI1I = oIio0oloI1I2;
/* 571 */               ilo0OoiI00000oIO = ilo0Ooi;
/* 572 */               iOiOol02 = iOiOol03;
/* 576 */               I0O1IO i0o1io = new I0O1IO(1);
/* 579 */               i0o1io.I00iiI = ii00l101O2;
/* 581 */               i0o1io.I00iiO = iOiOol02;
/* 583 */               i0o1io.I00iio = oIio0oloI1I;
/* 585 */               i0o1io.I00ilI0I1 = ilo0OoiI00000oIO;
/* 587 */               VarHandle.storeStoreFence();
/* 590 */               ?? r4 = obj2;
/* 592 */               i0lO1l.I00iOIl = r4;
/* 594 */               i0lO1l.I00iiI = r4;
/* 596 */               i0lO1l.I00iiO = r4;
/* 598 */               i0lO1l.I00iio = r4;
/* 600 */               i0lO1l.I00ilI0I1 = r4;
/* 603 */               i0lO1l.I00ioIO = 3;
/* 605 */               Object objI00000oIO = iOIoo0OoII1O.I00000oIO(httpURLConnection, iOiOol02, i0o1io, i0lO1l);
                        return objI00000oIO == ii0111o ? ii0111o : objI00000oIO;
                    }
/* 76 */            IOiOol0 iOiOol04 = i0lO1l.I00iOIl;
/* 78 */            lIoii1l01l0i.I00000oOI(obj3);
/* 83 */            obj = obj3;
/* 84 */            iOiOol02 = iOiOol04;
/* 117 */           Ii00l101O ii00l101O3 = (Ii00l101O) obj;
/* 119 */           ilo0OoiI00000oIO = Ii1Oii0oIo.I00000oIO(null);
/* 125 */           Ool0oO1OIi ool0oO1OIi = (Ool0oO1OIi) iOiOol02.I00iiI;
/* 129 */           Io1OIO1 io1OIO1 = (Io1OIO1) iOiOol02.I00iio;
/* 133 */           oIio0oloI1I = (OIio0oloI1I) iOiOol02.I00ilI0I1;
/* 137 */           IoIolIO1 ioIolIO1 = (IoIolIO1) iOiOol02.I00iiO;
/* 139 */           String str = ool0oO1OIi.I00ilI0I1;
/* 143 */           String strI000iOII3 = io1OIO1.I000iOII("Content-Length");
/* 147 */           if (strI000iOII3 != null) {
/* 149 */               obj2 = null;
/* 151 */               ii00l101O = ii00l101O3;
/* 159 */               lI00000oIO = new Long(Long.parseLong(strI000iOII3));
                    } else {
/* 163 */               obj2 = null;
/* 165 */               ii00l101O = ii00l101O3;
/* 167 */               lI00000oIO = oIio0oloI1I.I00000oIO();
                    }
/* 173 */           URL url = new URL(str);
/* 176 */           i0o1io0i1OO0.getClass();
/* 183 */           httpURLConnection = (HttpURLConnection) url.openConnection();
/* 188 */           httpURLConnection.setConnectTimeout(100000);
/* 191 */           httpURLConnection.setReadTimeout(100000);
/* 204 */           Map map = (Map) ((IOlOl10) iOiOol02.I00io1l).I0000O(IoIloO1OOO.I00000oIO);
/* 217 */           IoOOIO ioOOIO = (IoOOIO) (map != null ? map.get(IoOO1000I.I00000oIO) : obj2);
/* 219 */           if (ioOOIO != null) {
/* 221 */               Long l = ioOOIO.I00000oOI;
/* 223 */               if (l != null) {
/* 233 */                   httpURLConnection.setConnectTimeout(IoOOIiIl00.I00000oIO(l.longValue()));
                        }
/* 236 */               Long l2 = ioOOIO.I0000Il00O;
/* 238 */               if (l2 != null) {
/* 248 */                   httpURLConnection.setReadTimeout(IoOOIiIl00.I00000oIO(l2.longValue()));
                        }
/* 251 */               Long l3 = ioOOIO.I00000oIO;
/* 253 */               if (l3 != null) {
/* 255 */                   long jLongValue = l3.longValue();
/* 266 */                   if (jLongValue != Long.MAX_VALUE && (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue)) {
/* 287 */                       httpURLConnection.setConnectTimeout(IoOOIiIl00.I00000oIO(jLongValue));
                            }
                        }
                    }
/* 292 */           if (httpURLConnection instanceof HttpsURLConnection) {
/* 296 */               i0o1io0i1OO0.I00000oIO.getClass();
                    }
/* 301 */           httpURLConnection.setRequestMethod(ioIolIO1.I00000oIO);
/* 305 */           httpURLConnection.setUseCaches(false);
/* 308 */           httpURLConnection.setInstanceFollowRedirects(false);
/* 311 */           Set set2 = IoIolIliOoOI.I00000oIO;
/* 327 */           boolean z = set2.contains(ioIolIO1) && l1lOlIIOi.I00000oIO(oIio0oloI1I);
/* 331 */           iI1I1I ii1i1i = new iI1I1I(3);
/* 334 */           ii1i1i.I00iiO = z;
/* 336 */           ii1i1i.I00iiI = httpURLConnection;
/* 338 */           VarHandle.storeStoreFence();
/* 341 */           Set set3 = Oolloi0i.I00000oIO;
/* 345 */           Io1O0I1i io1O0I1i = new Io1O0I1i(0);
/* 348 */           io1O0I1i.I00lli11(io1OIO1);
/* 355 */           io1O0I1i.I00lli11(oIio0oloI1I.I0000Il00O());
/* 365 */           Io1OIO1 io1OIO12 = new Io1OIO1((Map) io1O0I1i.I00iOIl, true);
/* 372 */           Ol0Oo0 ol0Oo0 = new Ol0Oo0(10);
/* 375 */           ol0Oo0.I00iiI = ii1i1i;
/* 377 */           VarHandle.storeStoreFence();
/* 380 */           io1OIO12.I000OOo1O(ol0Oo0);
/* 389 */           if (io1OIO1.I000iOII("User-Agent") == null && oIio0oloI1I.I0000Il00O().I000iOII("User-Agent") == null) {
/* 401 */               int i3 = OO1Oi1i.I00000oIO;
/* 405 */               ii1i1i.invoke("User-Agent", "ktor-client");
                    }
/* 408 */           IOoOloI0iI iOoOloI0iII00000oOI = oIio0oloI1I.I00000oOI();
/* 414 */           if ((iOoOloI0iII00000oOI == null || (strI000iOII = iOoOloI0iII00000oOI.toString()) == null) && (strI000iOII = oIio0oloI1I.I0000Il00O().I000iOII("Content-Type")) == null) {
/* 432 */               strI000iOII = io1OIO1.I000iOII("Content-Type");
                    }
/* 436 */           Long lI00000oIO2 = oIio0oloI1I.I00000oIO();
/* 440 */           if ((lI00000oIO2 == null || (strI000iOII2 = String.valueOf(lI00000oIO2.longValue())) == null) && (strI000iOII2 = oIio0oloI1I.I0000Il00O().I000iOII("Content-Length")) == null) {
/* 462 */               strI000iOII2 = io1OIO1.I000iOII("Content-Length");
                    }
/* 466 */           if (strI000iOII != null) {
/* 468 */               ii1i1i.invoke("Content-Type", strI000iOII);
                    }
/* 471 */           if (strI000iOII2 != null) {
/* 473 */               ii1i1i.invoke("Content-Length", strI000iOII2);
                    }
/* 478 */           i0o1io0i1OO0.I00000oOI.getClass();
/* 485 */           if (!set2.contains(ioIolIO1)) {
/* 504 */               if (lI00000oIO == null && httpURLConnection.getRequestProperty("Transfer-Encoding") == null) {
/* 516 */                   httpURLConnection.addRequestProperty("Transfer-Encoding", "chunked");
                        }
/* 519 */               if (lI00000oIO != null) {
/* 525 */                   httpURLConnection.setFixedLengthStreamingMode(lI00000oIO.longValue());
                        } else {
/* 531 */                   httpURLConnection.setChunkedStreamingMode(0);
                        }
/* 535 */               httpURLConnection.setDoOutput(true);
/* 538 */               OutputStream outputStream = httpURLConnection.getOutputStream();
/* 542 */               i0lO1l.I00iOIl = iOiOol02;
/* 544 */               Ii00l101O ii00l101O4 = ii00l101O;
/* 546 */               i0lO1l.I00iiI = ii00l101O4;
/* 548 */               i0lO1l.I00iiO = ilo0OoiI00000oIO;
/* 550 */               i0lO1l.I00iio = oIio0oloI1I;
/* 552 */               i0lO1l.I00ilI0I1 = httpURLConnection;
/* 555 */               i0lO1l.I00ioIO = 2;
/* 561 */               if (iOIiooI10I.I00000oIO(oIio0oloI1I, outputStream, i0lO1l) != ii0111o) {
/* 564 */                   iOiOol03 = iOiOol02;
/* 565 */                   ilo0Ooi = ilo0OoiI00000oIO;
/* 566 */                   ii00l101O2 = ii00l101O4;
/* 567 */                   httpURLConnection2 = httpURLConnection;
/* 568 */                   oIio0oloI1I2 = oIio0oloI1I;
/* 569 */                   httpURLConnection = httpURLConnection2;
/* 570 */                   oIio0oloI1I = oIio0oloI1I2;
/* 571 */                   ilo0OoiI00000oIO = ilo0Ooi;
/* 572 */                   iOiOol02 = iOiOol03;
/* 576 */                   I0O1IO i0o1io2 = new I0O1IO(1);
/* 579 */                   i0o1io2.I00iiI = ii00l101O2;
/* 581 */                   i0o1io2.I00iiO = iOiOol02;
/* 583 */                   i0o1io2.I00iio = oIio0oloI1I;
/* 585 */                   i0o1io2.I00ilI0I1 = ilo0OoiI00000oIO;
/* 587 */                   VarHandle.storeStoreFence();
/* 590 */                   ?? r42 = obj2;
/* 592 */                   i0lO1l.I00iOIl = r42;
/* 594 */                   i0lO1l.I00iiI = r42;
/* 596 */                   i0lO1l.I00iiO = r42;
/* 598 */                   i0lO1l.I00iio = r42;
/* 600 */                   i0lO1l.I00ilI0I1 = r42;
/* 603 */                   i0lO1l.I00ioIO = 3;
/* 605 */                   Object objI00000oIO2 = iOIoo0OoII1O.I00000oIO(httpURLConnection, iOiOol02, i0o1io2, i0lO1l);
                            if (objI00000oIO2 == ii0111o) {
                            }
                        }
                    }
/* 491 */           if (!l1lOlIIOi.I00000oIO(oIio0oloI1I)) {
/* 500 */               OIiilo1Ool0o.I0000oI00(ioIolIO1, "Request of type ", " couldn't send a body with the [Android] engine.");
/* 503 */               return obj2;
                    }
/* 493 */           ii00l101O2 = ii00l101O;
/* 576 */           I0O1IO i0o1io22 = new I0O1IO(1);
/* 579 */           i0o1io22.I00iiI = ii00l101O2;
/* 581 */           i0o1io22.I00iiO = iOiOol02;
/* 583 */           i0o1io22.I00iio = oIio0oloI1I;
/* 585 */           i0o1io22.I00ilI0I1 = ilo0OoiI00000oIO;
/* 587 */           VarHandle.storeStoreFence();
/* 590 */           ?? r422 = obj2;
/* 592 */           i0lO1l.I00iOIl = r422;
/* 594 */           i0lO1l.I00iiI = r422;
/* 596 */           i0lO1l.I00iiO = r422;
/* 598 */           i0lO1l.I00iio = r422;
/* 600 */           i0lO1l.I00ilI0I1 = r422;
/* 603 */           i0lO1l.I00ioIO = 3;
/* 605 */           Object objI00000oIO22 = iOIoo0OoII1O.I00000oIO(httpURLConnection, iOiOol02, i0o1io22, i0lO1l);
                    if (objI00000oIO22 == ii0111o) {
                    }
                }

                @Override
                public final I0o1io0i1OO0 I000O01llI0() {
/* 1 */             return this.I00ilI0I1;
                }
            }

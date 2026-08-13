            package p000;

            import java.io.IOException;
            import java.net.ProtocolException;
            
            public final class IoIIollO0o extends IoIIoI {
                public final IoOi01OlIl1o I00iio;
                public long I00ilI0I1;
                public boolean I00ilO0;
                public final I11l01l I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIIollO0o(I11l01l i11l01l, IoOi01OlIl1o ioOi01OlIl1o) {
/* 3 */             super(i11l01l);
/* 1 */             this.I00io1l = i11l01l;
/* 6 */             this.I00iio = ioOi01OlIl1o;
/* 10 */            this.I00ilI0I1 = -1L;
/* 13 */            this.I00ilO0 = true;
                }

                @Override
                public final void close() {
                    boolean zI00111O;
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 8 */             if (this.I00ilO0) {
                        try {
/* 12 */                    zI00111O = OollIoI001lo.I00111O(this, 100);
                        } catch (IOException unused) {
/* 17 */                    zI00111O = false;
                        }
/* 18 */                if (!zI00111O) {
/* 26 */                    ((OOll1O) this.I00io1l.I0000O).I000OOo1O();
/* 29 */                    I00000oIO();
                        }
                    }
/* 33 */            this.I00iiI = true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
                
                    if (r11.I00ilO0 == false) goto L27;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
/* 1 */             I11l01l i11l01l = this.I00io1l;
/* 5 */             IIIIlO11I0lO iIIIlO11I0lO = (IIIIlO11I0lO) i11l01l.I0000oI00;
/* 11 */            if (j < 0) {
/* 206 */               I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 7 */                 return 0L;
                    }
/* 15 */            if (this.I00iiI) {
/* 196 */               I000II.I001IO000("closed");
/* 7 */                 return 0L;
                    }
/* 21 */            if (this.I00ilO0) {
/* 24 */                long j2 = this.I00ilI0I1;
/* 28 */                if (j2 == 0 || j2 == -1) {
/* 38 */                    if (j2 != -1) {
/* 40 */                        iIIIlO11I0lO.I00iio();
                            }
                            try {
/* 47 */                        this.I00ilI0I1 = iIIIlO11I0lO.I00oli();
/* 57 */                        String string = OlOoOIi0o.I00OIo(iIIIlO11I0lO.I00iio()).toString();
/* 65 */                        if (this.I00ilI0I1 < 0 || (string.length() > 0 && !OlOolloIIOl0.I000l1(string, ";", false))) {
/* 182 */                           throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.I00ilI0I1 + string + '\"');
                                }
/* 86 */                        if (this.I00ilI0I1 == 0) {
/* 88 */                            this.I00ilO0 = false;
/* 106 */                           IoIoIiooolI1.I00000oOI(((OIOlo0OloOi) i11l01l.I0000Il00O).I00l0OO0IO, this.I00iio, ((Io1OIO1l0o) i11l01l.I000II).I0000O());
/* 109 */                           I00000oIO();
                                }
                            } catch (NumberFormatException e) {
/* 193 */                       throw new ProtocolException(e.getMessage());
                            }
                        }
/* 123 */               long j3 = super.read(iII1o0lOio0, Math.min(j, this.I00ilI0I1));
/* 129 */               if (j3 != -1) {
                            this.I00ilI0I1 -= j3;
/* 136 */                   return j3;
                        }
/* 141 */               ((OOll1O) i11l01l.I0000O).I000OOo1O();
/* 148 */               ProtocolException protocolException = new ProtocolException("unexpected end of stream");
/* 151 */               I00000oIO();
/* 154 */               throw protocolException;
                    }
/* 19 */            return -1L;
                }
            }

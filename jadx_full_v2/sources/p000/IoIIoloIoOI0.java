            package p000;

            import java.io.IOException;
            import java.net.ProtocolException;
            
            public final class IoIIoloIoOI0 extends IoIIoI {
                public long I00iio;
                public final I11l01l I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoIIoloIoOI0(I11l01l i11l01l, long j) {
/* 3 */             super(i11l01l);
/* 1 */             this.I00ilI0I1 = i11l01l;
/* 6 */             this.I00iio = j;
/* 12 */            if (j == 0) {
/* 14 */                I00000oIO();
                    }
                }

                @Override
                public final void close() {
                    boolean zI00111O;
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 12 */            if (this.I00iio != 0) {
                        try {
/* 16 */                    zI00111O = OollIoI001lo.I00111O(this, 100);
                        } catch (IOException unused) {
/* 21 */                    zI00111O = false;
                        }
/* 22 */                if (!zI00111O) {
/* 30 */                    ((OOll1O) this.I00ilI0I1.I0000O).I000OOo1O();
/* 33 */                    I00000oIO();
                        }
                    }
/* 37 */            this.I00iiI = true;
                }

                @Override
                public final long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
/* 5 */             if (j < 0) {
/* 77 */                I000II.I0010I0i(IlIi0I0.I000iOII(j, "byteCount < 0: "));
/* 1 */                 return 0L;
                    }
/* 9 */             if (this.I00iiI) {
/* 67 */                I000II.I001IO000("closed");
/* 1 */                 return 0L;
                    }
/* 11 */            long j2 = this.I00iio;
/* 17 */            if (j2 == 0) {
/* 15 */                return -1L;
                    }
/* 24 */            long j3 = super.read(iII1o0lOio0, Math.min(j2, j));
/* 30 */            if (j3 == -1) {
/* 51 */                ((OOll1O) this.I00ilI0I1.I0000O).I000OOo1O();
/* 58 */                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
/* 61 */                I00000oIO();
/* 64 */                throw protocolException;
                    }
/* 34 */            long j4 = this.I00iio - j3;
/* 35 */            this.I00iio = j4;
/* 39 */            if (j4 == 0) {
/* 41 */                I00000oIO();
                    }
/* 44 */            return j3;
                }
            }
